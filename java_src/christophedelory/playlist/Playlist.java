package christophedelory.playlist;

import mychristophedelory.logging.LogFactory;
import org.myapache.commons.logging.Log;
/* loaded from: classes.dex */
public class Playlist {
    private final Sequence _rootSequence = new Sequence();
    private static final Log _logger = LogFactory.getLog(Playlist.class);
    private static final PlaylistVisitor NORMALIZATION = new Normalization();

    public Sequence getRootSequence() {
        return this._rootSequence;
    }

    public void normalize() {
        try {
            this._rootSequence.acceptDown(NORMALIZATION);
            this._rootSequence.acceptDown(NORMALIZATION);
        } catch (Exception e) {
            _logger.error("Unexpected error condition", e);
        }
    }

    /* loaded from: classes.dex */
    private static class Normalization extends BasePlaylistVisitor {
        private Normalization() {
        }

        @Override // christophedelory.playlist.BasePlaylistVisitor, christophedelory.playlist.PlaylistVisitor
        public void endVisitMedia(Media media) {
            if (media.getSource() == null) {
                Log log = Playlist._logger;
                log.info("Removing media with no source: " + media);
                media.getParent().removeComponent(media);
            }
        }

        @Override // christophedelory.playlist.BasePlaylistVisitor, christophedelory.playlist.PlaylistVisitor
        public void endVisitParallel(Parallel parallel) throws Exception {
            endVisitTimeContainer(parallel);
        }

        @Override // christophedelory.playlist.BasePlaylistVisitor, christophedelory.playlist.PlaylistVisitor
        public void endVisitSequence(Sequence sequence) throws Exception {
            endVisitTimeContainer(sequence);
            if (sequence.getParent() == null && sequence.getComponentsNumber() == 1) {
                AbstractPlaylistComponent[] components = sequence.getComponents();
                if (components[0] instanceof Sequence) {
                    Sequence sequence2 = (Sequence) components[0];
                    Playlist._logger.info("Merging root sequence " + sequence + " with its single child sequence " + sequence2);
                    sequence.setRepeatCount(sequence.getRepeatCount() * sequence2.getRepeatCount());
                    AbstractPlaylistComponent[] components2 = sequence2.getComponents();
                    sequence.removeComponent(sequence2);
                    for (AbstractPlaylistComponent abstractPlaylistComponent : components2) {
                        sequence.addComponent(abstractPlaylistComponent);
                    }
                }
            }
            mergeConsecutiveIdenticalMedia(sequence);
            mergeConsecutiveSequences(sequence);
        }

        private void endVisitTimeContainer(AbstractTimeContainer abstractTimeContainer) {
            AbstractTimeContainer parent = abstractTimeContainer.getParent();
            if (parent != null) {
                int componentsNumber = abstractTimeContainer.getComponentsNumber();
                if (componentsNumber == 0) {
                    Log log = Playlist._logger;
                    log.info("Removing empty time container " + abstractTimeContainer);
                    parent.removeComponent(abstractTimeContainer);
                } else if (componentsNumber == 1) {
                    AbstractPlaylistComponent[] components = abstractTimeContainer.getComponents();
                    Log log2 = Playlist._logger;
                    log2.info("Replacing time container " + abstractTimeContainer + " with its single child component " + components[0]);
                    components[0].setRepeatCount(components[0].getRepeatCount() * abstractTimeContainer.getRepeatCount());
                    abstractTimeContainer.removeComponent(components[0]);
                    parent.removeComponent(abstractTimeContainer);
                    parent.addComponent(components[0]);
                }
            }
        }

        private void mergeConsecutiveIdenticalMedia(Sequence sequence) {
            AbstractPlaylistComponent[] components = sequence.getComponents();
            int i = 0;
            while (i < components.length - 1) {
                if (components[i] instanceof Media) {
                    Media media = (Media) components[i];
                    int i2 = i + 1;
                    int i3 = i;
                    for (int i4 = i2; i4 < components.length && (components[i4] instanceof Media); i4++) {
                        Media media2 = (Media) components[i4];
                        if (media2.getSource() == null || !media2.getSource().equals(media.getSource()) || ((media2.getDuration() == null && media.getDuration() != null) || (media2.getDuration() != null && !media2.getDuration().equals(media.getDuration())))) {
                            break;
                        }
                        i3 = i4;
                    }
                    if (i3 > i) {
                        Sequence sequence2 = new Sequence();
                        sequence2.setRepeatCount((i3 + 1) - i);
                        Log log = Playlist._logger;
                        log.info("Merging " + sequence2.getRepeatCount() + " identical media in a new sequence");
                        sequence.addComponent(i, sequence2);
                        while (i <= i3) {
                            sequence.removeComponent(i2);
                            sequence2.addComponent(components[i]);
                            i++;
                        }
                        i = i3;
                    }
                }
                i++;
            }
        }

        private void mergeConsecutiveSequences(Sequence sequence) {
            AbstractPlaylistComponent[] components = sequence.getComponents();
            for (int length = components.length - 1; length > 0; length--) {
                int i = length - 1;
                if ((components[i] instanceof Sequence) && (components[length] instanceof Sequence)) {
                    Sequence sequence2 = (Sequence) components[i];
                    Sequence sequence3 = (Sequence) components[length];
                    if (sequence2.getRepeatCount() == sequence3.getRepeatCount()) {
                        Playlist._logger.info("Merging sequence " + sequence3 + " in sequence " + sequence2);
                        for (AbstractPlaylistComponent abstractPlaylistComponent : sequence3.getComponents()) {
                            sequence2.addComponent(abstractPlaylistComponent);
                        }
                        sequence.removeComponent(sequence3);
                    }
                }
            }
        }
    }

    public void acceptDown(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitPlaylist(this);
        this._rootSequence.acceptDown(playlistVisitor);
        playlistVisitor.endVisitPlaylist(this);
    }

    public void acceptUp(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitPlaylist(this);
        playlistVisitor.endVisitPlaylist(this);
    }
}
