package com.daaw.avee.Design;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Tuple3;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.MediaControlsUI.MediaControlsUI;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.playback.EventsPlaybackService;
import com.daaw.avee.comp.playback.ExoMediaPlayer.ExoMediaPlayerCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class PlaybackDesign {
    static volatile boolean isPlaying;
    static volatile boolean wantsPlaying;
    private List<Object> listenerRefHolder = new LinkedList();
    private Handler mainThreadHandler = new Handler();
    StationsDesign stationsDesign;
    static volatile PlaylistSong currentDisplayTrack = PlaylistSong.EmptySong;
    static volatile PlaylistSong.Data songDisplayData = PlaylistSong.emptyData;
    static volatile PlayingMediaInfo playingMediaInfo = PlayingMediaInfo.empty;
    static volatile long trackPosition = 0;
    static volatile int repeatMode = 0;
    static volatile int volumeMax = 10;
    static volatile boolean volumeMuted = false;
    static volatile boolean timeoutEnabled = true;

    /* JADX INFO: Access modifiers changed from: private */
    public float getCrossFadeMultiplier() {
        return 1.0f;
    }

    public PlaybackDesign(StationsDesign stationsDesign) {
        this.stationsDesign = stationsDesign;
        MainActivity.onStop.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.PlaybackDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.onDataSaveTime(activity);
                }
                EventsPlaybackService.Receive.savePreferences.invoke();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onServiceDestroying.subscribeWeak(new WeakEvent1.Handler<Context>() { // from class: com.daaw.avee.Design.PlaybackDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Context context) {
                UtilsUI.AssertIsUiThread();
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.onDataSaveTime(context);
                }
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestTimeoutEnabled.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(PlaybackDesign.timeoutEnabled);
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestSelectMediaPlayerCoreIndex.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(PlaybackDesign.this.onRequestMediaPlayerCoreIndex());
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onDisplayMetaDataStateChanged.subscribeWeak(new WeakEvent4.Handler<PlaylistSong, IItemIdentifier, PlaylistSong.Data, PlayingMediaInfo>() { // from class: com.daaw.avee.Design.PlaybackDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(PlaylistSong playlistSong, IItemIdentifier iItemIdentifier, final PlaylistSong.Data data, PlayingMediaInfo playingMediaInfo2) {
                PlaybackDesign.currentDisplayTrack = playlistSong;
                PlaybackDesign.playingMediaInfo = playingMediaInfo2;
                PlaybackDesign.songDisplayData = data;
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainActivity mainActivity = MainActivity.getInstance();
                        if (mainActivity != null) {
                            mainActivity.updateActionBar(data);
                        }
                        MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                        if (mediaControlsUI != null) {
                            mediaControlsUI.updateTrackInfo(PlaybackDesign.songDisplayData, PlaybackDesign.playingMediaInfo);
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onTrackPositionChanged.subscribeWeak(new WeakEvent1.Handler<Long>() { // from class: com.daaw.avee.Design.PlaybackDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Long l) {
                PlaybackDesign.trackPosition = l.longValue();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRepeatModeChanged.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                PlaybackDesign.repeatMode = num.intValue();
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.7.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                        if (mediaControlsUI != null) {
                            mediaControlsUI.onRepeatModeChanged(PlaybackDesign.repeatMode);
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onDestroyed.subscribeWeak(new WeakEvent1.Handler<Context>() { // from class: com.daaw.avee.Design.PlaybackDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Context context) {
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.8.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                        if (mediaControlsUI != null) {
                            mediaControlsUI.updatePlaystate(false, false);
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onVolumeMaxChanged.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                PlaybackDesign.volumeMax = num.intValue();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onVolumeMuteChanged.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                PlaybackDesign.volumeMuted = bool.booleanValue();
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestVolumeMuteState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_audioMuteState));
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestVolumeStereoBalance.subscribeWeak(new WeakEventR.Handler<Float>() { // from class: com.daaw.avee.Design.PlaybackDesign.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Float invoke() {
                return Float.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_volumeStereoBalance) * 0.01f);
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestCrossfadeValue.subscribeWeak(new WeakEventR.Handler<Float>() { // from class: com.daaw.avee.Design.PlaybackDesign.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Float invoke() {
                return Float.valueOf(AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_crossFadeValue) * 0.001f * PlaybackDesign.this.getCrossFadeMultiplier());
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onHeadsetAssistAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaybackDesign.14
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.14.1
                    @Override // java.lang.Runnable
                    public void run() {
                        QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                        if (createOrGetInstance != null) {
                            if (createOrGetInstance.getShuffleMode() == 0) {
                                createOrGetInstance.setShuffleMode(1, true);
                            } else {
                                createOrGetInstance.setShuffleMode(0, true);
                            }
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onUIPrevAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaybackDesign.15
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.15.1
                    @Override // java.lang.Runnable
                    public void run() {
                        QueueCore.createOrGetInstance().prev();
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onUINextAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaybackDesign.16
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.16.1
                    @Override // java.lang.Runnable
                    public void run() {
                        QueueCore.createOrGetInstance().nextOrFirst();
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaPlaybackService.onRequestAlbumArtLarge.subscribeWeak(new WeakEvent5.Handler<Context, AlbumArtRequest, ImageLoadedListener, Integer, Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.17
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(Context context, final AlbumArtRequest albumArtRequest, final ImageLoadedListener imageLoadedListener, final Integer num, final Integer num2) {
                PlaybackDesign.this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.17.1
                    @Override // java.lang.Runnable
                    public void run() {
                        IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
                        if (albumArtFactory != null) {
                            albumArtFactory.loadAlbumArtLarge(false, albumArtRequest.videoThumbDataSource, albumArtRequest.path0, albumArtRequest.path1, albumArtRequest.genStr, true, imageLoadedListener, num.intValue(), num2.intValue(), num.intValue(), num2.intValue(), 0, -1, false, null, null);
                        }
                    }
                });
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSelectMusicSysAction.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.18
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                if (num.intValue() == 0) {
                    AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_playbackEngine, 0);
                } else if (num.intValue() == 1) {
                    AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_playbackEngine, 1);
                }
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onTrackSelect.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.PlaybackDesign.19
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                ExoMediaPlayerCore.Receive.showTrackSelection.invoke(contextData.getActivity(), "Select track");
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onToggleMuteAction.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaybackDesign.20
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                AppPreferences.createOrGetInstance().toggleBool(AppPreferences.PREF_Bool_audioMuteState);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestMusicSystemIndex.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.21
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(PlaybackDesign.this.onRequestMediaPlayerCoreIndex());
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestVolumeMuteState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_audioMuteState));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestAudioEffectsActiveState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(PlaybackDesign.this.requestAudioEffectsActiveState());
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestAudioVolumeState.subscribeWeak(new WeakEventR.Handler<Tuple2<Integer, Integer>>() { // from class: com.daaw.avee.Design.PlaybackDesign.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<Integer, Integer> invoke() {
                return new Tuple2<>(Integer.valueOf(EventsPlaybackService.Receive.getVolume.invoke(0).intValue()), Integer.valueOf(PlaybackDesign.volumeMax));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestAudioBalanceState.subscribeWeak(new WeakEventR.Handler<Tuple2<Integer, Integer>>() { // from class: com.daaw.avee.Design.PlaybackDesign.25
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<Integer, Integer> invoke() {
                return new Tuple2<>(Integer.valueOf((AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_volumeStereoBalance) / 20) + 5), 10);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestAudioEffectVirtualizerState.subscribeWeak(new WeakEventR.Handler<Tuple2<Integer, Integer>>() { // from class: com.daaw.avee.Design.PlaybackDesign.26
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<Integer, Integer> invoke() {
                return null;
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestCrossFadeState.subscribeWeak(new WeakEventR.Handler<Tuple3<Integer, Integer, Float>>() { // from class: com.daaw.avee.Design.PlaybackDesign.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple3<Integer, Integer, Float> invoke() {
                return new Tuple3<>(Integer.valueOf((AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_crossFadeValue) / 1000) + 1), 10, Float.valueOf(PlaybackDesign.this.getCrossFadeMultiplier()));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetAudioVolume.subscribeWeak(new WeakEvent2.Handler<Integer, Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.28
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Integer num2) {
                EventsPlaybackService.Receive.setVolume.invoke(num);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetAudioStereoBalance.subscribeWeak(new WeakEvent2.Handler<Integer, Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.29
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Integer num2) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_volumeStereoBalance, (num.intValue() - 5) * 20);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetCrossFade.subscribeWeak(new WeakEvent2.Handler<Integer, Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.30
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Integer num2) {
                AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_crossFadeValue, (num.intValue() - 1) * 1000);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestAudioViewExpandedState.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.31
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_uiSectionOpened2));
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetAudioViewExpandedState.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.32
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_uiSectionOpened2, bool.booleanValue());
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestRepeatMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.33
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(PlaybackDesign.repeatMode);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onSetRepeatMode.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.PlaybackDesign.34
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                EventsPlaybackService.Receive.onRepeatModeChange.invoke(num);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestTrackInfo.subscribeWeak(new WeakEventR.Handler<Tuple2<PlaylistSong.Data, PlayingMediaInfo>>() { // from class: com.daaw.avee.Design.PlaybackDesign.35
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<PlaylistSong.Data, PlayingMediaInfo> invoke() {
                return new Tuple2<>(PlaybackDesign.songDisplayData, PlaybackDesign.playingMediaInfo);
            }
        }, this.listenerRefHolder);
        MediaControlsUI.onRequestPlaystate.subscribeWeak(new WeakEventR.Handler<Tuple2<Boolean, Boolean>>() { // from class: com.daaw.avee.Design.PlaybackDesign.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Tuple2<Boolean, Boolean> invoke() {
                return new Tuple2<>(Boolean.valueOf(PlaybackDesign.isPlaying), Boolean.valueOf(PlaybackDesign.wantsPlaying));
            }
        }, this.listenerRefHolder);
        MainActivity.onExit.subscribeWeak(new WeakEvent.Handler() { // from class: com.daaw.avee.Design.PlaybackDesign.37
            @Override // com.daaw.avee.Common.Events.WeakEvent.Handler
            public void invoke() {
                EventsPlaybackService.Receive.onRequestCloseService.invoke();
            }
        }, this.listenerRefHolder);
        MainActivity.onStart.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.PlaybackDesign.38
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                PlaybackDesign.timeoutEnabled = false;
                EventsPlaybackService.Receive.onRequestStateRefresh.invoke();
                EventsPlaybackService.Receive.onTimeoutChange.invoke(false);
            }
        }, this.listenerRefHolder);
        MainActivity.onStop.subscribeWeak(new WeakEvent1.Handler<Activity>() { // from class: com.daaw.avee.Design.PlaybackDesign.39
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Activity activity) {
                PlaybackDesign.timeoutEnabled = true;
                EventsPlaybackService.Receive.onTimeoutChange.invoke(true);
            }
        }, this.listenerRefHolder);
        AppPreferences.onIntPreferenceChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.40
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Int_playbackEngine) {
                    PlaybackDesign.this.selectMediaPlayerCoreIndex(num2);
                } else if (num.intValue() == AppPreferences.PREF_Int_volumeStereoBalance) {
                    MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                    if (mediaControlsUI != null) {
                        mediaControlsUI.onAudioEffectsActiveChanged(PlaybackDesign.this.requestAudioEffectsActiveState());
                    }
                    EventsPlaybackService.Receive.setVolumeStereoBalance.invoke(Float.valueOf(num2.intValue() * 0.01f));
                } else if (num.intValue() == AppPreferences.PREF_Int_crossFadeValue) {
                    EventsPlaybackService.Receive.setCrossfadeValue.invoke(Float.valueOf(num2.intValue() * 0.001f * PlaybackDesign.this.getCrossFadeMultiplier()));
                }
            }
        }, this.listenerRefHolder);
        AppPreferences.onBoolPreferenceChanged.subscribeWeak(new WeakEvent2.Handler<Integer, Boolean>() { // from class: com.daaw.avee.Design.PlaybackDesign.41
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Bool_audioMuteState) {
                    MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                    if (mediaControlsUI != null) {
                        mediaControlsUI.onVolumeMuteChanged(bool.booleanValue());
                    }
                    EventsPlaybackService.Receive.setVolumeMute.invoke(bool);
                }
            }
        }, this.listenerRefHolder);
    }

    public void onPlaybackCompleted(final Integer num, Boolean bool, final Long l, final boolean z, final PlaylistSong playlistSong) {
        if (bool.booleanValue()) {
            this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.42
                @Override // java.lang.Runnable
                public void run() {
                    if (z && PlaybackDesign.this.stationsDesign.trySwitchPlaybackEngine(playlistSong)) {
                        QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                        if (createOrGetInstance != null) {
                            createOrGetInstance.playCurrent(l);
                        }
                    } else if (num.intValue() == 1) {
                        QueueCore createOrGetInstance2 = QueueCore.createOrGetInstance();
                        if (createOrGetInstance2 != null) {
                            createOrGetInstance2.playCurrent(l);
                        }
                    } else if (num.intValue() == 2) {
                        QueueCore createOrGetInstance3 = QueueCore.createOrGetInstance();
                        if (createOrGetInstance3 != null) {
                            if (createOrGetInstance3.isNextPlaylistEnd()) {
                                createOrGetInstance3.playFirst(l);
                            } else {
                                createOrGetInstance3.next(l);
                            }
                        }
                    } else {
                        QueueCore createOrGetInstance4 = QueueCore.createOrGetInstance();
                        if (createOrGetInstance4 != null) {
                            createOrGetInstance4.next(l);
                        }
                    }
                }
            });
        }
    }

    public void selectMediaPlayerCoreIndex(Integer num) {
        EventsPlaybackService.Receive.PlaybackControls_selectMediaPlayerCoreIndex.invoke(num);
        MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
        if (mediaControlsUI != null) {
            mediaControlsUI.onMusicSysChanged(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onRequestMediaPlayerCoreIndex() {
        return AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_playbackEngine);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestAudioEffectsActiveState() {
        return AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_volumeStereoBalance) != 0;
    }

    public void onViewPagerPageSelected(Integer num, Activity activity, boolean z) {
        MainActivity mainActivity = MainActivity.getInstance();
        if (mainActivity != null) {
            mainActivity.setKeepScreenOnLock(z || (num.intValue() == 2 && isPlaying), z);
        }
    }

    public void onPlayStateChanged(final Boolean bool, final Boolean bool2, Integer num, final String str, PlaylistSong playlistSong, final boolean z) {
        isPlaying = bool.booleanValue();
        wantsPlaying = bool2.booleanValue();
        this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.43
            @Override // java.lang.Runnable
            public void run() {
                String str2 = str;
                if (str2 != null && str2.length() > 0) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(str);
                }
                MediaControlsUI mediaControlsUI = MediaControlsUI.getInstance();
                if (mediaControlsUI != null) {
                    mediaControlsUI.updatePlaystate(bool.booleanValue(), bool2.booleanValue());
                }
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null) {
                    mainActivity.setKeepScreenOnLock(z || (mainActivity.currentFragmentPage == 2 && bool.booleanValue()), z);
                }
            }
        });
    }

    public void updateKeepScreenOnLock(final boolean z) {
        this.mainThreadHandler.post(new Runnable() { // from class: com.daaw.avee.Design.PlaybackDesign.44
            @Override // java.lang.Runnable
            public void run() {
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity != null) {
                    mainActivity.setKeepScreenOnLock(z || (mainActivity.currentFragmentPage == 2 && PlaybackDesign.isPlaying), z);
                }
            }
        });
    }
}
