package com.daaw.avee.comp.playback.ExoMediaPlayer;
/* loaded from: classes.dex */
public class VisualizerDataCapturerLimiter {
    public static void assignInstance(Object obj, int i, IVisualizerDataCapturer iVisualizerDataCapturer) {
    }

    public static IVisualizerDataCapturer getListener(Object obj, int i, IVisualizerDataCapturer iVisualizerDataCapturer) {
        if (iVisualizerDataCapturer == null || !iVisualizerDataCapturer.isCurrentPlayerEntry(i)) {
            return null;
        }
        return iVisualizerDataCapturer;
    }
}
