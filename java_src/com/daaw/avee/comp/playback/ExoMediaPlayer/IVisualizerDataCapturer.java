package com.daaw.avee.comp.playback.ExoMediaPlayer;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface IVisualizerDataCapturer {
    boolean isCurrentPlayerEntry(int i);

    void onAudioSessionId(int i);

    void onNewSource();

    void onPcmData(ByteBuffer byteBuffer, long j, int i, int i2, int i3, int i4, long j2);

    void onSetEnabled(boolean z);
}
