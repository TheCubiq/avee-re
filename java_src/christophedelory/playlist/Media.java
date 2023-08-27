package christophedelory.playlist;

import mychristophedelory.content.Content;
/* loaded from: classes.dex */
public class Media extends AbstractPlaylistComponent {
    private Content _source = null;
    private Long _duration = null;

    public Content getSource() {
        return this._source;
    }

    public void setSource(Content content) {
        if (content == null) {
            throw new NullPointerException("No media source");
        }
        this._source = content;
    }

    public Long getDuration() {
        return this._duration;
    }

    public void setDuration(Long l) {
        if (l != null && l.longValue() <= 0) {
            throw new IllegalArgumentException("Negative or null duration " + l);
        }
        this._duration = l;
    }

    public void setDuration(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Negative or null duration " + j);
        }
        this._duration = Long.valueOf(j);
    }

    @Override // christophedelory.playlist.AbstractPlaylistComponent
    public void acceptDown(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitMedia(this);
        playlistVisitor.endVisitMedia(this);
    }

    @Override // christophedelory.playlist.AbstractPlaylistComponent
    public void acceptUp(PlaylistVisitor playlistVisitor) throws Exception {
        playlistVisitor.beginVisitMedia(this);
        super.acceptUp(playlistVisitor);
        playlistVisitor.endVisitMedia(this);
    }
}
