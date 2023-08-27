package com.daaw.avee.Design;

import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.Fragment1;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class PlaybackControlsDesign {
    private List<Object> listenerRefHolder = new LinkedList();
    public static volatile PlaylistSong currentTrack = PlaylistSong.EmptySong;
    public static volatile IItemIdentifier currentItemIdent = null;
    public static volatile PlaylistSong.Data fieldsongData = PlaylistSong.emptyData;
    public static volatile int fieldQueuePosition = -1;

    public PlaybackControlsDesign() {
        fieldQueuePosition = QueueCore.createOrGetInstance().getQueuePosition();
        Tuple2<PlaylistSong, IItemIdentifier> currentQueueEntry = QueueCore.createOrGetInstance().getCurrentQueueEntry();
        if (currentQueueEntry != null) {
            currentTrack = currentQueueEntry.obj1;
            currentItemIdent = currentQueueEntry.obj2;
            fieldsongData = currentTrack.getDataBlocking(PlayerCore.s().getAppContext());
        }
        QueueCore.onQueuePosChanged.subscribeWeak(new WeakEvent5.Handler<Tuple2<PlaylistSong, IItemIdentifier>, Integer, Boolean, Boolean, Object>() { // from class: com.daaw.avee.Design.PlaybackControlsDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Tuple2<PlaylistSong, IItemIdentifier> tuple2, Integer num, Boolean bool, Boolean bool2, Object obj) {
                IItemIdentifier iItemIdentifier;
                PlaylistSong playlistSong = null;
                if (tuple2 != null) {
                    playlistSong = tuple2.obj1;
                    iItemIdentifier = tuple2.obj2;
                } else {
                    iItemIdentifier = null;
                }
                if (playlistSong == null) {
                    playlistSong = PlaylistSong.EmptySong;
                }
                PlaylistSong.Data dataBlocking = playlistSong.getDataBlocking(PlayerCore.s().getAppContext());
                PlaybackControlsDesign.currentItemIdent = iItemIdentifier;
                PlaybackControlsDesign.fieldQueuePosition = num.intValue();
                PlaybackControlsDesign.currentTrack = playlistSong;
                PlaybackControlsDesign.fieldsongData = dataBlocking;
                Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                if (fragment0Instance != null) {
                    fragment0Instance.updateTrackInfo();
                }
                Fragment1 fragment1Instance = MainActivity.getFragment1Instance();
                if (fragment1Instance != null) {
                    fragment1Instance.updateTrackInfo(PlaybackControlsDesign.fieldQueuePosition, playlistSong, dataBlocking, PlaybackControlsDesign.currentItemIdent);
                }
                if (bool2.booleanValue()) {
                    if (!bool.booleanValue()) {
                        EventsPlaybackService.Receive.onPlayDataSource.invoke((tuple2 == null || tuple2.obj1 == null) ? "" : tuple2.obj1.getConstrucPath(), true, 0L, (Long) obj);
                    } else {
                        EventsPlaybackService.Receive.onAction.invoke(3);
                    }
                }
            }
        }, this.listenerRefHolder);
    }
}
