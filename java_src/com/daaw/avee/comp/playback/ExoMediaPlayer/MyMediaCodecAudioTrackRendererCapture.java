package com.daaw.avee.comp.playback.ExoMediaPlayer;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.MediaCodecAudioRenderer;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.MediaCodecSelector;
import com.google.android.exoplayer2.util.MimeTypes;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class MyMediaCodecAudioTrackRendererCapture extends MediaCodecAudioRenderer {
    private static final int RENDERER_TIMESTAMP_OFFSET_US = 0;
    int bitDepth;
    private int outputChannelCount;
    private String outputMimeType;
    private int outputSampleRate;
    private int playerEntryIndexId;
    WeakReference<Object> playerIdentifier;
    private IVisualizerDataCapturer visualizerDataListener;

    public MyMediaCodecAudioTrackRendererCapture(IVisualizerDataCapturer iVisualizerDataCapturer, int i, WeakReference<Object> weakReference, Context context, MediaCodecSelector mediaCodecSelector, DrmSessionManager<FrameworkMediaCrypto> drmSessionManager, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, AudioCapabilities audioCapabilities, AudioProcessor... audioProcessorArr) {
        super(context, mediaCodecSelector, drmSessionManager, z, handler, audioRendererEventListener, audioCapabilities, audioProcessorArr);
        this.outputSampleRate = 44100;
        this.outputChannelCount = 2;
        this.outputMimeType = MimeTypes.AUDIO_RAW;
        this.playerEntryIndexId = 0;
        this.visualizerDataListener = null;
        this.bitDepth = 0;
        this.playerIdentifier = weakReference;
        this.playerEntryIndexId = i;
        this.visualizerDataListener = iVisualizerDataCapturer;
        VisualizerDataCapturerLimiter.assignInstance(this, i, iVisualizerDataCapturer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onInputFormatChanged(Format format) throws ExoPlaybackException {
        super.onInputFormatChanged(format);
        if (format.bitrate < 0) {
            this.bitDepth = 16;
        } else {
            this.bitDepth = (format.bitrate / format.sampleRate) / format.channelCount;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onEnabled(boolean z) throws ExoPlaybackException {
        IVisualizerDataCapturer listener = VisualizerDataCapturerLimiter.getListener(this, this.playerEntryIndexId, this.visualizerDataListener);
        if (listener != null) {
            listener.onSetEnabled(true);
        }
        super.onEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        super.onPositionReset(j, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.BaseRenderer
    public void onDisabled() {
        IVisualizerDataCapturer listener = VisualizerDataCapturerLimiter.getListener(this, this.playerEntryIndexId, this.visualizerDataListener);
        if (listener != null) {
            listener.onSetEnabled(false);
        }
        super.onDisabled();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean processOutputBuffer(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws ExoPlaybackException {
        IVisualizerDataCapturer listener = VisualizerDataCapturerLimiter.getListener(this, this.playerEntryIndexId, this.visualizerDataListener);
        if (!z && (i2 & 2) == 0 && listener != null && i >= 0 && i < 8192 && byteBuffer != null) {
            listener.onPcmData(byteBuffer, j3 - 0, i, this.outputSampleRate, this.outputChannelCount, this.bitDepth, j - 0);
        }
        return super.processOutputBuffer(j, j2, mediaCodec, byteBuffer, i, i2, j3, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) throws ExoPlaybackException {
        this.outputSampleRate = 44100;
        this.outputChannelCount = 2;
        this.outputMimeType = MimeTypes.AUDIO_RAW;
        if (mediaFormat.containsKey("sample-rate")) {
            this.outputSampleRate = mediaFormat.getInteger("sample-rate");
        }
        if (mediaFormat.containsKey("channel-count")) {
            this.outputChannelCount = mediaFormat.getInteger("channel-count");
        }
        if (mediaFormat.containsKey("mime")) {
            this.outputMimeType = mediaFormat.getString("mime");
        }
        super.onOutputFormatChanged(mediaCodec, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.audio.MediaCodecAudioRenderer
    public void onAudioSessionId(int i) {
        super.onAudioSessionId(i);
        IVisualizerDataCapturer listener = VisualizerDataCapturerLimiter.getListener(this, this.playerEntryIndexId, this.visualizerDataListener);
        if (listener != null) {
            listener.onAudioSessionId(i);
        }
    }
}
