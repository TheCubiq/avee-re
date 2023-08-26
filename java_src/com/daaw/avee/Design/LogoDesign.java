package com.daaw.avee.Design;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.EventsGlobal.EventsGlobalApp;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.VisualUI.Fragment2;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class LogoDesign extends DesignBase {
    private WeakReference<VisualizerViewCore> visualizerSurfaceView = new WeakReference<>(null);
    PlaylistSong logoTriggeredOnTrack = null;
    private volatile boolean logoTriggeredOnThisTrack = false;
    private volatile boolean logoTriggeredOnThisTrack2 = false;
    private boolean alwaysHideAppLogo = false;
    private boolean temporaryHideAppLogo = false;

    public LogoDesign() {
        Fragment2.onSurfaceCreated.subscribeWeak(new WeakEvent1.Handler<VisualizerViewCore>() { // from class: com.daaw.avee.Design.LogoDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerViewCore visualizerViewCore) {
                LogoDesign.this.visualizerSurfaceView = new WeakReference(visualizerViewCore);
            }
        }, this.listenerRefHolder);
        EventsGlobalApp.onUITick10.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.LogoDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext == null) {
                    return;
                }
                LogoDesign.this.alwaysHideAppLogo = AppPreferences.createOrGetInstance().preferencesGetBoolSafe(appContext, "pref_alwaysHideAppLogo", false);
            }
        }, this.listenerRefHolder);
        EventsGlobalApp.onUITick1.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.LogoDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                if ((IAP2Design.premium && LogoDesign.this.alwaysHideAppLogo) || LogoDesign.this.temporaryHideAppLogo) {
                    return;
                }
                if (LogoDesign.this.logoTriggeredOnThisTrack && LogoDesign.this.logoTriggeredOnThisTrack2) {
                    return;
                }
                long trackPositionForRendering = AppDesign.getTrackPositionForRendering();
                long trackDurationForRendering = AppDesign.getTrackDurationForRendering();
                boolean z = trackDurationForRendering > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;
                boolean z2 = trackDurationForRendering > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                if (z && trackPositionForRendering > 10000 && trackPositionForRendering < 20000 && !LogoDesign.this.logoTriggeredOnThisTrack) {
                    LogoDesign.this.logoTriggeredOnThisTrack = true;
                    VisualizerViewCore visualizerViewCore = (VisualizerViewCore) LogoDesign.this.visualizerSurfaceView.get();
                    if (visualizerViewCore != null) {
                        visualizerViewCore.setTriggerLogoTh(1, -1);
                    }
                }
                if (!z2 || trackPositionForRendering <= trackDurationForRendering - 15000 || trackPositionForRendering >= trackDurationForRendering - DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS || LogoDesign.this.logoTriggeredOnThisTrack2) {
                    return;
                }
                LogoDesign.this.logoTriggeredOnThisTrack2 = true;
                VisualizerViewCore visualizerViewCore2 = (VisualizerViewCore) LogoDesign.this.visualizerSurfaceView.get();
                if (visualizerViewCore2 != null) {
                    visualizerViewCore2.setTriggerLogoTh(1, -1);
                }
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onDisplayMetaDataStateChanged.subscribeWeak(new WeakEvent4.Handler<PlaylistSong, IItemIdentifier, PlaylistSong.Data, PlayingMediaInfo>() { // from class: com.daaw.avee.Design.LogoDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(PlaylistSong playlistSong, IItemIdentifier iItemIdentifier, PlaylistSong.Data data, PlayingMediaInfo playingMediaInfo) {
                if (playlistSong == null) {
                    return;
                }
                if (LogoDesign.this.logoTriggeredOnTrack == null || !playlistSong.equals(LogoDesign.this.logoTriggeredOnTrack)) {
                    LogoDesign.this.logoTriggeredOnTrack = playlistSong;
                    LogoDesign.this.logoTriggeredOnThisTrack = false;
                    LogoDesign.this.logoTriggeredOnThisTrack2 = false;
                    VisualizerViewCore visualizerViewCore = (VisualizerViewCore) LogoDesign.this.visualizerSurfaceView.get();
                    if (visualizerViewCore != null) {
                        visualizerViewCore.setTriggerLogoTh(2, -1);
                    }
                }
            }
        }, this.listenerRefHolder);
        VisualizerExporterDesign.onExportingChanged.subscribeWeak(new WeakEvent3.Handler<Boolean, Long, Boolean>() { // from class: com.daaw.avee.Design.LogoDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Boolean bool, Long l, Boolean bool2) {
                if (!bool.booleanValue()) {
                    LogoDesign.this.temporaryHideAppLogo = false;
                    return;
                }
                LogoDesign.this.temporaryHideAppLogo = bool2.booleanValue();
                LogoDesign.this.logoTriggeredOnTrack = null;
                LogoDesign.this.logoTriggeredOnThisTrack = false;
                LogoDesign.this.logoTriggeredOnThisTrack2 = false;
            }
        }, this.listenerRefHolder);
    }
}
