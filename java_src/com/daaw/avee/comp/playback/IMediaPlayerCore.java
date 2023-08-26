package com.daaw.avee.comp.playback;

import android.view.SurfaceHolder;
import com.daaw.avee.comp.Common.ExoPcmData;
import com.daaw.avee.comp.playback.AudioFrameData;
import com.daaw.avee.comp.playback.BaseEqualizerEffect;
import com.daaw.avee.comp.playback.Song.IMediaDataSource;
/* loaded from: classes.dex */
public interface IMediaPlayerCore {
    public static final IMediaPlayerCore Empty = new IMediaPlayerCore() { // from class: com.daaw.avee.comp.playback.IMediaPlayerCore.1
        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public boolean containsVideoTrack() {
            return false;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void destroyOld() {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public long duration() {
            return 0L;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public BaseEqualizerEffect.EqualizerDesc getEqualizerDesc() {
            return null;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public PlayingMediaInfo getPlayingMediaInfo() {
            return null;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public AudioFrameData getVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2) {
            return null;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public boolean isMuted() {
            return false;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public boolean isPreparingOrAbove() {
            return false;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public boolean isPreparingOrStared() {
            return false;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void pause() {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void playNext(boolean z, boolean z2, float f, long j) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public long position() {
            return 0L;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void release() {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void resetVisualizer() {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void seek(long j) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setEqualizerSettings(BaseEqualizerEffect.EqualizerSettings equalizerSettings) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setFadeVolume(float f, int i) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public boolean setFadeVolumeRelative(float f, int i) {
            return false;
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setMute(boolean z) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setNextDataSource(IMediaDataSource iMediaDataSource) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setNotifyListener(OnNotifyListener onNotifyListener) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setVideoScalingMode(int i) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setVolume(float f) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void setVolumeStereoBalance(float f) {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void start() {
        }

        @Override // com.daaw.avee.comp.playback.IMediaPlayerCore
        public void stop() {
        }
    };
    public static final int MP_VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
    public static final int MP_VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;

    /* loaded from: classes.dex */
    public interface OnNotifyListener {
        boolean getEqualizerEnabled(String str);

        BaseEqualizerEffect.EqualizerSettings getEqualizerSettings(String str);

        int getVideoScalingMode();

        void onBufferingUpdate(boolean z, int i);

        void onEqualizerDescChanged(BaseEqualizerEffect.EqualizerDesc equalizerDesc);

        void onExoPcmData(ExoPcmData exoPcmData);

        void onExoPcmDataNewSource();

        void onMpPlaystateOrMetaChanged(boolean z, String str);

        void onNotifyVideoSizeChanged(int i, int i2, float f);

        boolean onRequestAudioFocus();

        SurfaceHolder onRequestVideoSurfaceHolder();

        void onVolumeMuteStateChanged(boolean z);

        void requestNextDataAtTime(long j);

        void requestNextDataDelay(boolean z);

        void requestNextDataNow();
    }

    boolean containsVideoTrack();

    void destroyOld();

    long duration();

    BaseEqualizerEffect.EqualizerDesc getEqualizerDesc();

    PlayingMediaInfo getPlayingMediaInfo();

    AudioFrameData getVisualizationData(AudioFrameData audioFrameData, AudioFrameData.Request2 request2);

    boolean isMuted();

    boolean isPreparingOrAbove();

    boolean isPreparingOrStared();

    void pause();

    void playNext(boolean z, boolean z2, float f, long j);

    long position();

    void release();

    void resetVisualizer();

    void seek(long j);

    void setEqualizerSettings(BaseEqualizerEffect.EqualizerSettings equalizerSettings);

    void setFadeVolume(float f, int i);

    boolean setFadeVolumeRelative(float f, int i);

    void setMute(boolean z);

    void setNextDataSource(IMediaDataSource iMediaDataSource);

    void setNotifyListener(OnNotifyListener onNotifyListener);

    void setVideoScalingMode(int i);

    void setVideoSurfaceHolder(SurfaceHolder surfaceHolder);

    void setVolume(float f);

    void setVolumeStereoBalance(float f);

    void start();

    void stop();
}
