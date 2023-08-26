package com.daaw.avee.comp.playback.NativeMediaPlayer;

import android.media.audiofx.Virtualizer;
import android.media.audiofx.Visualizer;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.playback.AudioFrameData;
import kotlin.UByte;
/* loaded from: classes.dex */
public class NativeVisualizerDataProvider {
    private Visualizer visualizer;
    private byte[] bytesBuffer = new byte[1];
    private int currentAudioSessionId = -1;
    private Virtualizer virtualizerEffect = null;
    private boolean disableVisualizer = false;

    static int pow2roundup(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    public void release() {
        Visualizer visualizer = this.visualizer;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.visualizer.release();
        }
        Virtualizer virtualizer = this.virtualizerEffect;
        if (virtualizer != null) {
            virtualizer.setEnabled(true);
            this.virtualizerEffect.setEnabled(false);
            this.virtualizerEffect.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        this.disableVisualizer = false;
    }

    public AudioFrameData getVisData(long j, AudioFrameData.Request request, AudioFrameData audioFrameData, int i, boolean z) {
        if (this.disableVisualizer) {
            return null;
        }
        int i2 = 0;
        if (z) {
            i = 0;
        }
        if (this.visualizer == null || this.currentAudioSessionId != i) {
            try {
                tlog.d("### audioSessionId: " + i);
                Visualizer visualizer = new Visualizer(i);
                this.visualizer = visualizer;
                this.currentAudioSessionId = i;
                visualizer.setScalingMode(0);
            } catch (RuntimeException e) {
                tlog.d("### visualizer exception: " + e.getMessage());
                this.disableVisualizer = true;
                this.currentAudioSessionId = -1;
            }
        }
        Visualizer visualizer2 = this.visualizer;
        if (visualizer2 == null) {
            return null;
        }
        int captureSize = visualizer2.getCaptureSize();
        int pow2roundup = pow2roundup(request.samplesCount);
        int[] captureSizeRange = Visualizer.getCaptureSizeRange();
        int max = Math.max(captureSizeRange[0], Math.min(captureSizeRange[1], pow2roundup));
        audioFrameData.init(44100, request.audioChannelCount, max, 0, false);
        if (max != captureSize) {
            this.visualizer.setEnabled(false);
            try {
                this.visualizer.setCaptureSize(max);
                captureSize = max;
            } catch (IllegalStateException unused) {
            }
        }
        if (this.bytesBuffer.length != captureSize) {
            this.bytesBuffer = new byte[captureSize];
        }
        if (!this.visualizer.getEnabled()) {
            this.visualizer.setEnabled(true);
        }
        try {
            this.visualizer.getWaveForm(this.bytesBuffer);
        } catch (IllegalStateException unused2) {
        }
        float f = 0.0f;
        int min = Math.min(this.bytesBuffer.length, audioFrameData.getBufferSizeForCapture());
        if (audioFrameData.pcmBufferChannelCount == 1) {
            while (i2 < min) {
                short s = (short) (((short) ((this.bytesBuffer[i2] & UByte.MAX_VALUE) - 128)) * 2 * 150);
                audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] = s;
                if (audioFrameData.minPcmValue > s) {
                    audioFrameData.minPcmValue = s;
                }
                if (audioFrameData.maxPcmValue < s) {
                    audioFrameData.maxPcmValue = s;
                }
                f += audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] / 255.0f;
                i2++;
            }
        } else if (audioFrameData.pcmBufferChannelCount == 2) {
            while (i2 < min) {
                short s2 = (short) (((short) ((this.bytesBuffer[i2] & UByte.MAX_VALUE) - 128)) * 2 * 150);
                audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] = s2;
                audioFrameData.pcmBuffer[(audioFrameData.pcmBufferChannelCount * i2) + 1] = s2;
                if (audioFrameData.minPcmValue > s2) {
                    audioFrameData.minPcmValue = s2;
                }
                if (audioFrameData.maxPcmValue < s2) {
                    audioFrameData.maxPcmValue = s2;
                }
                f += audioFrameData.pcmBuffer[audioFrameData.pcmBufferChannelCount * i2] / 255.0f;
                i2++;
            }
        }
        audioFrameData.rms = f / audioFrameData.getBufferSizeForCapture();
        audioFrameData.valid = true;
        return audioFrameData;
    }
}
