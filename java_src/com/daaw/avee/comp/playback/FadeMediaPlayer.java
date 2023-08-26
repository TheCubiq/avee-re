package com.daaw.avee.comp.playback;

import android.os.Handler;
import android.os.Message;
import android.view.SurfaceHolder;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.comp.Common.ExoPcmData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.IMediaPlayerCore;
import com.daaw.avee.comp.playback.Song.IMediaDataSource;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class FadeMediaPlayer {
    private static final int MSG_CROSS_FADE_TICK = 4;
    private static final int MSG_START = 7;
    private static final int MSG_START_CROSS_FADE = 5;
    private static final int MSG_START_FADE = 6;
    private static final int MSG_TICK = 2;
    private static final int MSG_TICK2 = 3;
    private static final long prepareNextTimeReserve = 1500;
    private IMediaPlayerCore mediaPlayerCore;
    private IMediaPlayerCore.OnNotifyListener onNotifyListener;
    private int mode = 0;
    private int mode2 = 0;
    private long tickMs = 80;
    private float fadeInSeconds = 0.25f;
    private float fadeSpeed = (((float) (80 + 10)) * 0.001f) / 0.25f;
    private long crossFadeTickMs = 300;
    private long crossFadeDuration = -1;
    private MyHandler mHandler = new MyHandler(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class MyHandler extends Handler {
        private WeakReference<FadeMediaPlayer> targetWeak;

        public MyHandler(FadeMediaPlayer fadeMediaPlayer) {
            this.targetWeak = new WeakReference<>(fadeMediaPlayer);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            FadeMediaPlayer fadeMediaPlayer = this.targetWeak.get();
            if (fadeMediaPlayer == null) {
                return;
            }
            float f = (((float) (fadeMediaPlayer.tickMs + 10)) * 0.001f) / (((float) fadeMediaPlayer.crossFadeDuration) * 0.001f);
            switch (message.what) {
                case 2:
                    if (fadeMediaPlayer.mode == 1) {
                        if (fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(-fadeMediaPlayer.fadeSpeed, 0)) {
                            fadeMediaPlayer.mediaPlayerCore.stop();
                            fadeMediaPlayer.mode = 0;
                        }
                    } else if (fadeMediaPlayer.mode == 2) {
                        if (fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(-fadeMediaPlayer.fadeSpeed, 0)) {
                            fadeMediaPlayer.mediaPlayerCore.pause();
                            fadeMediaPlayer.mode = 0;
                        }
                    } else if (fadeMediaPlayer.mode == 3) {
                        if (fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(fadeMediaPlayer.fadeSpeed, 0)) {
                            fadeMediaPlayer.mode = 0;
                        }
                    } else if (fadeMediaPlayer.mode != 4 && fadeMediaPlayer.mode == 5 && fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(f, 0)) {
                        fadeMediaPlayer.mode = 0;
                    }
                    if (fadeMediaPlayer.mode != 0) {
                        sendMessageDelayed(obtainMessage(2), fadeMediaPlayer.tickMs);
                        return;
                    }
                    return;
                case 3:
                    if (fadeMediaPlayer.mode2 == 4) {
                        if (fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(-fadeMediaPlayer.fadeSpeed, 1)) {
                            fadeMediaPlayer.mediaPlayerCore.destroyOld();
                            fadeMediaPlayer.mode2 = 0;
                        }
                    } else if (fadeMediaPlayer.mode2 == 5) {
                        fadeMediaPlayer.mode2 = 0;
                    } else if (fadeMediaPlayer.mode2 == 6 && fadeMediaPlayer.mediaPlayerCore.setFadeVolumeRelative(-f, 1)) {
                        fadeMediaPlayer.mediaPlayerCore.destroyOld();
                        fadeMediaPlayer.mode2 = 0;
                    }
                    if (fadeMediaPlayer.mode2 != 0) {
                        sendMessageDelayed(obtainMessage(3), fadeMediaPlayer.tickMs);
                        return;
                    }
                    return;
                case 4:
                    if (fadeMediaPlayer.crossFadeDuration >= 0) {
                        long position = fadeMediaPlayer.mediaPlayerCore.position();
                        long duration = fadeMediaPlayer.mediaPlayerCore.duration();
                        long j = duration - position;
                        if (duration <= fadeMediaPlayer.crossFadeDuration + FadeMediaPlayer.prepareNextTimeReserve || j > fadeMediaPlayer.crossFadeDuration + FadeMediaPlayer.prepareNextTimeReserve) {
                            sendMessageDelayed(obtainMessage(4), fadeMediaPlayer.crossFadeTickMs);
                            return;
                        }
                        long tickCount = Utils.tickCount();
                        fadeMediaPlayer.onNotifyListener.requestNextDataAtTime(tickCount + ((j - fadeMediaPlayer.crossFadeDuration) - 10));
                        return;
                    }
                    return;
                case 5:
                    fadeMediaPlayer.startCrossFade();
                    fadeMediaPlayer.destroyOldCrossFade();
                    return;
                case 6:
                    fadeMediaPlayer.startFade();
                    fadeMediaPlayer.destroyOld();
                    return;
                case 7:
                    fadeMediaPlayer.justStart();
                    return;
                default:
                    return;
            }
        }
    }

    public FadeMediaPlayer(IMediaPlayerCore iMediaPlayerCore, IMediaPlayerCore.OnNotifyListener onNotifyListener, long j) {
        this.mediaPlayerCore = iMediaPlayerCore;
        this.onNotifyListener = onNotifyListener;
        setCrossFade(j);
        iMediaPlayerCore.setNotifyListener(new IMediaPlayerCore.OnNotifyListener() { // from class: com.daaw.avee.comp.playback.FadeMediaPlayer.1
            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataDelay(boolean z) {
                if (FadeMediaPlayer.this.mHandler.hasMessages(5) || FadeMediaPlayer.this.mHandler.hasMessages(6) || FadeMediaPlayer.this.mHandler.hasMessages(7)) {
                    return;
                }
                FadeMediaPlayer.this.onNotifyListener.requestNextDataDelay(z);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataNow() {
                if (FadeMediaPlayer.this.mHandler.hasMessages(5) || FadeMediaPlayer.this.mHandler.hasMessages(6) || FadeMediaPlayer.this.mHandler.hasMessages(7)) {
                    return;
                }
                FadeMediaPlayer.this.onNotifyListener.requestNextDataNow();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void requestNextDataAtTime(long j2) {
                FadeMediaPlayer.this.onNotifyListener.requestNextDataAtTime(j2);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public boolean onRequestAudioFocus() {
                return FadeMediaPlayer.this.onNotifyListener.onRequestAudioFocus();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onVolumeMuteStateChanged(boolean z) {
                FadeMediaPlayer.this.onNotifyListener.onVolumeMuteStateChanged(z);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onMpPlaystateOrMetaChanged(boolean z, String str) {
                FadeMediaPlayer.this.onNotifyListener.onMpPlaystateOrMetaChanged(z, str);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onBufferingUpdate(boolean z, int i) {
                FadeMediaPlayer.this.onNotifyListener.onBufferingUpdate(z, i);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onNotifyVideoSizeChanged(int i, int i2, float f) {
                FadeMediaPlayer.this.onNotifyListener.onNotifyVideoSizeChanged(i, i2, f);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public int getVideoScalingMode() {
                return FadeMediaPlayer.this.onNotifyListener.getVideoScalingMode();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public SurfaceHolder onRequestVideoSurfaceHolder() {
                return FadeMediaPlayer.this.onNotifyListener.onRequestVideoSurfaceHolder();
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onEqualizerDescChanged(BaseEqualizerEffect.EqualizerDesc equalizerDesc) {
                FadeMediaPlayer.this.onNotifyListener.onEqualizerDescChanged(equalizerDesc);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public BaseEqualizerEffect.EqualizerSettings getEqualizerSettings(String str) {
                return FadeMediaPlayer.this.onNotifyListener.getEqualizerSettings(str);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public boolean getEqualizerEnabled(String str) {
                return FadeMediaPlayer.this.onNotifyListener.getEqualizerEnabled(str);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onExoPcmData(ExoPcmData exoPcmData) {
                FadeMediaPlayer.this.onNotifyListener.onExoPcmData(exoPcmData);
            }

            @Override // com.daaw.avee.comp.playback.IMediaPlayerCore.OnNotifyListener
            public void onExoPcmDataNewSource() {
                FadeMediaPlayer.this.onNotifyListener.onExoPcmDataNewSource();
            }
        });
    }

    public IMediaPlayerCore getMediaPlayerCore() {
        return this.mediaPlayerCore;
    }

    public void release() {
        this.mHandler.removeCallbacksAndMessages(null);
        this.mediaPlayerCore.release();
        this.mediaPlayerCore = null;
    }

    public void stopFadeAll() {
        stopFade();
        destroyOldFadeDown();
    }

    public void pauseFadeAll() {
        pauseFade();
        destroyOldFadeDown();
    }

    public void startFadeAll() {
        startFade();
        destroyOldFadeDown();
    }

    public void stop() {
        this.mediaPlayerCore.stop();
    }

    private void stopFade() {
        this.mode = 1;
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    private void pauseFade() {
        this.mode = 2;
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startFade() {
        this.mode = 3;
        this.mediaPlayerCore.start();
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void justStart() {
        this.mediaPlayerCore.start();
    }

    private void justFadeUp() {
        this.mode = 3;
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCrossFade() {
        this.mode = 5;
        this.mediaPlayerCore.start();
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    private void justCrossFadeUp() {
        this.mode = 5;
        this.mHandler.removeMessages(2);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    public void destroyOldFadeDown() {
        this.mHandler.removeMessages(3);
        this.mode2 = 4;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3), this.tickMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyOld() {
        this.mediaPlayerCore.destroyOld();
    }

    public void destroyOldCrossFade() {
        this.mHandler.removeMessages(3);
        this.mode2 = 6;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3), this.tickMs);
    }

    public void playNextAtTime(IMediaDataSource iMediaDataSource, boolean z, long j, long j2) {
        this.mHandler.removeMessages(5);
        this.mHandler.removeMessages(6);
        this.mHandler.removeMessages(7);
        long tickCount = j2 - Utils.tickCount();
        if (j2 <= 0 || tickCount <= 0) {
            playNext(iMediaDataSource, z, j);
            return;
        }
        long j3 = this.crossFadeDuration;
        if (j3 >= 0 && j3 > this.crossFadeTickMs) {
            startPlayNext(iMediaDataSource, false, false, 0.0f, j);
            if (z) {
                this.mHandler.sendMessageAtTime(this.mHandler.obtainMessage(5), j2);
            }
        } else if (this.crossFadeDuration >= 0) {
            startPlayNext(iMediaDataSource, false, false, 1.0f, j);
            if (z) {
                this.mHandler.sendMessageAtTime(this.mHandler.obtainMessage(7), j2);
            }
        } else {
            startPlayNext(iMediaDataSource, true, false, 1.0f, j);
            if (z) {
                this.mHandler.sendMessageAtTime(this.mHandler.obtainMessage(7), j2);
            }
        }
    }

    public void playNext(IMediaDataSource iMediaDataSource, boolean z, long j) {
        this.mHandler.removeMessages(5);
        this.mHandler.removeMessages(6);
        this.mHandler.removeMessages(7);
        long j2 = this.crossFadeDuration;
        if (j2 >= 0 && j2 > this.crossFadeTickMs) {
            startPlayNext(iMediaDataSource, false, z, 0.0f, j);
            justCrossFadeUp();
            destroyOldCrossFade();
            return;
        }
        startPlayNext(iMediaDataSource, true, z, 1.0f, j);
        destroyOld();
    }

    private void startPlayNext(IMediaDataSource iMediaDataSource, boolean z, boolean z2, float f, long j) {
        this.mHandler.removeMessages(4);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(4), this.crossFadeTickMs);
        this.mHandler.removeMessages(3);
        this.mode2 = 0;
        this.mode = 0;
        this.mHandler.removeMessages(2);
        this.mediaPlayerCore.setNextDataSource(iMediaDataSource);
        this.mediaPlayerCore.playNext(z, z2, f, j);
    }

    private void startPlayNextFadeUp(IMediaDataSource iMediaDataSource, boolean z, boolean z2, long j) {
        this.mHandler.removeMessages(4);
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(4), this.crossFadeTickMs);
        this.mediaPlayerCore.setNextDataSource(iMediaDataSource);
        this.mediaPlayerCore.playNext(z, z2, 0.0f, j);
        this.mHandler.removeMessages(3);
        this.mode2 = 0;
        this.mHandler.removeMessages(2);
        this.mode = 3;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(2), this.tickMs);
    }

    public void setCrossFade(long j) {
        this.crossFadeDuration = j;
    }
}
