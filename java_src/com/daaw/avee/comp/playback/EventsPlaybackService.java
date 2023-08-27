package com.daaw.avee.comp.playback;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.SurfaceHolder;
import com.daaw.avee.Common.Events.WeakDelegate;
import com.daaw.avee.Common.Events.WeakDelegate1;
import com.daaw.avee.Common.Events.WeakDelegate4;
import com.daaw.avee.Common.Events.WeakDelegateR;
import com.daaw.avee.Common.Events.WeakDelegateR2;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class EventsPlaybackService {

    /* loaded from: classes.dex */
    public static class Receive {
        public static final int ACTION_Pause = 2;
        public static final int ACTION_Play = 1;
        public static final int ACTION_Stop = 3;
        public static final int ACTION_TogglePause = 4;
        static List<Object> listenerRefHolder = new LinkedList();
        public static WeakDelegate savePreferences = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.1
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.savePreferencesThSafe();
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate onRequestCloseService = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.2
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
                Receive.startService(MediaPlaybackServiceDefs.EXIT_ACTION);
            }
        }, listenerRefHolder);
        public static WeakDelegateR2<AudioFrameData, AudioFrameData.Request2, AudioFrameData> getVisualizationData = new WeakDelegateR2().subscribeWeak(new WeakDelegateR2.Handler<AudioFrameData, AudioFrameData.Request2, AudioFrameData>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.3
            @Override // com.daaw.avee.Common.Events.WeakDelegateR2.Handler
            public AudioFrameData invoke(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    return mediaPlaybackService.getVisualizationData(audioFrameData, request2);
                }
                return null;
            }
        }, listenerRefHolder);
        public static WeakDelegate4<String, Boolean, Long, Long> onPlayDataSource = new WeakDelegate4().subscribeWeak(new WeakDelegate4.Handler<String, Boolean, Long, Long>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.4
            @Override // com.daaw.avee.Common.Events.WeakDelegate4.Handler
            public void invoke(String str, Boolean bool, Long l, Long l2) {
                Intent intent = new Intent(MediaPlaybackServiceDefs.PLAY_DATA_SOURCE_ACTION);
                intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, str);
                intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_2, bool);
                intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_3, l);
                intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_4, l2 == null ? 0L : l2.longValue());
                Receive.startService(intent);
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Integer> onAction = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.5
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Integer num) {
                int intValue = num.intValue();
                if (intValue == 1) {
                    Receive.startService(MediaPlaybackServiceDefs.PLAY_ACTION);
                } else if (intValue == 2) {
                    Receive.startService(MediaPlaybackServiceDefs.PAUSE_ACTION);
                } else if (intValue == 3) {
                    Receive.startService(MediaPlaybackServiceDefs.STOP_ACTION);
                } else if (intValue != 4) {
                } else {
                    Receive.startService(MediaPlaybackServiceDefs.TOGGLE_PAUSE_ACTION);
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate onRequestStateRefresh = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.6
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Boolean> onTimeoutChange = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Boolean>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.7
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Boolean bool) {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (!bool.booleanValue()) {
                    Receive.startService(MediaPlaybackServiceDefs.TIMEOUT_DISABLE_ACTION);
                } else if (mediaPlaybackService != null) {
                    mediaPlaybackService.setTimeoutEnableThSafe(true);
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Long> onSeekChanged = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Long>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.8
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Long l) {
                Receive.startService(MediaPlaybackServiceDefs.SEEK_ACTION, l.longValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Integer> onRepeatModeChange = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.9
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Integer num) {
                Receive.startService(MediaPlaybackServiceDefs.REPEAT_MODE_ACTION, num.intValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Integer> setVideoScalingMode = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.10
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Integer num) {
                Receive.startService(MediaPlaybackServiceDefs.VIDEO_SCALING_MODE_ACTION, num.intValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate1<SurfaceHolder> setVideoSurfaceHolder = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<SurfaceHolder>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.11
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(SurfaceHolder surfaceHolder) {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.setVideoSurfaceHolderThSafe(surfaceHolder);
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Float> setVolumePercentage = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Float>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.12
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Float f) {
                Receive.startService(MediaPlaybackServiceDefs.VOLUME_PERCENTAGE_ACTION, f.floatValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Integer> setVolume = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.13
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Integer num) {
                Receive.startService(MediaPlaybackServiceDefs.VOLUME_ACTION, num.intValue());
            }
        }, listenerRefHolder);
        public static WeakDelegateR<Float> getVolumePercentage = new WeakDelegateR().subscribeWeak(new WeakDelegateR.Handler<Float>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakDelegateR.Handler
            public Float invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    return Float.valueOf(mediaPlaybackService.getVolumePercentage());
                }
                return Float.valueOf(0.0f);
            }
        }, listenerRefHolder);
        public static WeakDelegateR<Integer> getVolume = new WeakDelegateR().subscribeWeak(new WeakDelegateR.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakDelegateR.Handler
            public Integer invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    return Integer.valueOf(mediaPlaybackService.getVolume());
                }
                return 0;
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Boolean> setVolumeMute = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Boolean>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.16
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Boolean bool) {
                Receive.startService(MediaPlaybackServiceDefs.SET_MUTE_ACTION, bool.booleanValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate toggleVolumeMute = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.17
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
                Receive.startService(MediaPlaybackServiceDefs.TOGGLE_MUTE_ACTION);
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Float> setVolumeStereoBalance = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Float>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.18
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Float f) {
                Receive.startService(MediaPlaybackServiceDefs.VOLUME_STEREO_BALANCE_ACTION, f.floatValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Float> setCrossfadeValue = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Float>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.19
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Float f) {
                Receive.startService(MediaPlaybackServiceDefs.CROSS_FADE_VALUE_ACTION, f.floatValue());
            }
        }, listenerRefHolder);
        public static WeakDelegate onRestartMediaPlayerCore = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.20
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.restartMediaPlayerCoreThSafe();
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate1<Integer> PlaybackControls_selectMediaPlayerCoreIndex = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<Integer>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.21
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(Integer num) {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.selectMediaPlayerCoreIndexThSafe(num.intValue());
                }
            }
        }, listenerRefHolder);
        public static WeakDelegate onResetVisualizer = new WeakDelegate().subscribeWeak(new WeakDelegate.Handler() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.22
            @Override // com.daaw.avee.Common.Events.WeakDelegate.Handler
            public void invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.resetVisualizerThSafe();
                }
            }
        }, listenerRefHolder);
        public static WeakDelegateR<BaseEqualizerEffect.EqualizerDesc> onRequestEqualizerDesc = new WeakDelegateR().subscribeWeak(new WeakDelegateR.Handler<BaseEqualizerEffect.EqualizerDesc>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakDelegateR.Handler
            public BaseEqualizerEffect.EqualizerDesc invoke() {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    return mediaPlaybackService.getEqualizerDescThSafe();
                }
                return null;
            }
        }, listenerRefHolder);
        public static WeakDelegate1<BaseEqualizerEffect.EqualizerSettings> setEqualizerSettings = new WeakDelegate1().subscribeWeak(new WeakDelegate1.Handler<BaseEqualizerEffect.EqualizerSettings>() { // from class: com.daaw.avee.comp.playback.EventsPlaybackService.Receive.24
            @Override // com.daaw.avee.Common.Events.WeakDelegate1.Handler
            public void invoke(BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
                MediaPlaybackService mediaPlaybackService = MediaPlaybackService.getInstance();
                if (mediaPlaybackService != null) {
                    mediaPlaybackService.setEqualizerSettingsThSafe(equalizerSettings);
                }
            }
        }, listenerRefHolder);

        static void startService() {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(MediaPlaybackServiceDefs.NONE_ACTION);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(String str) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(str);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(String str, long j) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(str);
            intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, j);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(String str, int i) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(str);
            intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, i);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(String str, float f) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(str);
            intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, f);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(String str, boolean z) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            ComponentName componentName = new ComponentName(appContext, MediaPlaybackService.class);
            Intent intent = new Intent(str);
            intent.putExtra(MediaPlaybackServiceDefs.EXTRA_ARG_1, z);
            intent.setComponent(componentName);
            startServiceInternal(appContext, intent);
        }

        static void startService(Intent intent) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext == null) {
                return;
            }
            intent.setComponent(new ComponentName(appContext, MediaPlaybackService.class));
            startServiceInternal(appContext, intent);
        }

        static void startServiceInternal(Context context, Intent intent) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        }
    }
}
