package com.daaw.avee.Design;

import android.view.View;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.daaw.avee.comp.MediaControlsUI.MediaControlsUI;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class PlayerControlsUIDesign {
    private List<Object> listenerRefHolder = new LinkedList();

    public PlayerControlsUIDesign() {
        MediaControlsUI.onPlaybackPrev.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.prev();
                }
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onPlaybackNext.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.nextOrFirst();
                }
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onPlaybackTogglePause.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                EventsPlaybackService.Receive.onAction.invoke(4);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestTrackPosition.subscribeWeak(new WeakEventR.Handler<Long>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Long invoke() {
                return Long.valueOf(PlaybackDesign.trackPosition);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetTrackPosition.subscribeWeak(new WeakEvent1.Handler<Long>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Long l) {
                EventsPlaybackService.Receive.onSeekChanged.invoke(l);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestShowState.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                MainActivity mainActivity = MainActivity.getInstance();
                return Integer.valueOf(PlayerControlsUIDesign.this.getPlayerControlsShowState(true, mainActivity != null ? mainActivity.currentFragmentPage : 1));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestShuffleMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    return Integer.valueOf(createOrGetInstance.getShuffleMode());
                }
                return 0;
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetShuffleMode.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.setShuffleMode(num.intValue(), true);
                }
            }
        }, this.listenerRefHolder);
        QueueCore.onShuffleModeChanged.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                if (mediaControlsUI != null) {
                    mediaControlsUI.onShuffleModeChanged(num.intValue());
                }
                LibraryQueueFragmentBase.onShuffleModeChanged(num.intValue());
            }
        }, this.listenerRefHolder);
        MainActivity.onFullscreenChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                if (bool.booleanValue()) {
                    if (mediaControlsUI != null) {
                        mediaControlsUI.animateShow(0);
                        return;
                    }
                    return;
                }
                MainActivity mainActivity = MainActivity.getInstance();
                if ((mainActivity != null ? mainActivity.currentFragmentPage : 1) == 0) {
                    if (mediaControlsUI != null) {
                        mediaControlsUI.animateShow(1);
                    }
                } else if (mediaControlsUI != null) {
                    mediaControlsUI.animateShow(2);
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onCreateView.subscribeWeak(new WeakEvent3.Handler<View, View, View>() { // from class: com.daaw.avee.Design.PlayerControlsUIDesign.11
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(View view, View view2, View view3) {
                MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                if (mediaControlsUI != null) {
                    mediaControlsUI.onCreateView(view, view2, view3);
                }
            }
        }, this.listenerRefHolder);
    }

    int getPlayerControlsShowState(boolean z, int i) {
        if (PlayerCore.s().getAppContext() == null) {
            return 2;
        }
        if (z) {
            return i == 0 ? 1 : 2;
        }
        return 0;
    }
}
