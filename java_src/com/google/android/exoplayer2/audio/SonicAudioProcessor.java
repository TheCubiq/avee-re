package com.google.android.exoplayer2.audio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class SonicAudioProcessor implements AudioProcessor {
    private static final float CLOSE_THRESHOLD = 0.01f;
    public static final float MAXIMUM_PITCH = 8.0f;
    public static final float MAXIMUM_SPEED = 8.0f;
    public static final float MINIMUM_PITCH = 0.1f;
    public static final float MINIMUM_SPEED = 0.1f;
    private static final int MIN_BYTES_FOR_SPEEDUP_CALCULATION = 1024;
    public static final int SAMPLE_RATE_NO_CHANGE = -1;
    private ByteBuffer buffer;
    private long inputBytes;
    private boolean inputEnded;
    private ByteBuffer outputBuffer;
    private long outputBytes;
    private int pendingOutputSampleRateHz;
    private ShortBuffer shortBuffer;
    private Sonic sonic;
    private float speed = 1.0f;
    private float pitch = 1.0f;
    private int channelCount = -1;
    private int sampleRateHz = -1;
    private int outputSampleRateHz = -1;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputEncoding() {
        return 2;
    }

    public SonicAudioProcessor() {
        ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRateHz = -1;
    }

    public float setSpeed(float f) {
        float constrainValue = Util.constrainValue(f, 0.1f, 8.0f);
        if (this.speed != constrainValue) {
            this.speed = constrainValue;
            this.sonic = null;
        }
        flush();
        return constrainValue;
    }

    public float setPitch(float f) {
        float constrainValue = Util.constrainValue(f, 0.1f, 8.0f);
        if (this.pitch != constrainValue) {
            this.pitch = constrainValue;
            this.sonic = null;
        }
        flush();
        return constrainValue;
    }

    public void setOutputSampleRateHz(int i) {
        this.pendingOutputSampleRateHz = i;
    }

    public long scaleDurationForSpeedup(long j) {
        long j2 = this.outputBytes;
        if (j2 >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            int i = this.outputSampleRateHz;
            int i2 = this.sampleRateHz;
            if (i == i2) {
                return Util.scaleLargeTimestamp(j, this.inputBytes, j2);
            }
            return Util.scaleLargeTimestamp(j, this.inputBytes * i, j2 * i2);
        }
        double d = this.speed;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean configure(int i, int i2, int i3) throws AudioProcessor.UnhandledFormatException {
        if (i3 != 2) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        }
        int i4 = this.pendingOutputSampleRateHz;
        if (i4 == -1) {
            i4 = i;
        }
        if (this.sampleRateHz == i && this.channelCount == i2 && this.outputSampleRateHz == i4) {
            return false;
        }
        this.sampleRateHz = i;
        this.channelCount = i2;
        this.outputSampleRateHz = i4;
        this.sonic = null;
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.sampleRateHz != -1 && (Math.abs(this.speed - 1.0f) >= CLOSE_THRESHOLD || Math.abs(this.pitch - 1.0f) >= CLOSE_THRESHOLD || this.outputSampleRateHz != this.sampleRateHz);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputChannelCount() {
        return this.channelCount;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputSampleRateHz() {
        return this.outputSampleRateHz;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        Assertions.checkState(this.sonic != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.inputBytes += remaining;
            this.sonic.queueInput(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int framesAvailable = this.sonic.getFramesAvailable() * this.channelCount * 2;
        if (framesAvailable > 0) {
            if (this.buffer.capacity() < framesAvailable) {
                ByteBuffer order = ByteBuffer.allocateDirect(framesAvailable).order(ByteOrder.nativeOrder());
                this.buffer = order;
                this.shortBuffer = order.asShortBuffer();
            } else {
                this.buffer.clear();
                this.shortBuffer.clear();
            }
            this.sonic.getOutput(this.shortBuffer);
            this.outputBytes += framesAvailable;
            this.buffer.limit(framesAvailable);
            this.outputBuffer = this.buffer;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
        Assertions.checkState(this.sonic != null);
        this.sonic.queueEndOfStream();
        this.inputEnded = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.outputBuffer;
        this.outputBuffer = EMPTY_BUFFER;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isEnded() {
        Sonic sonic;
        return this.inputEnded && ((sonic = this.sonic) == null || sonic.getFramesAvailable() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (isActive()) {
            Sonic sonic = this.sonic;
            if (sonic == null) {
                this.sonic = new Sonic(this.sampleRateHz, this.channelCount, this.speed, this.pitch, this.outputSampleRateHz);
            } else {
                sonic.flush();
            }
        }
        this.outputBuffer = EMPTY_BUFFER;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.speed = 1.0f;
        this.pitch = 1.0f;
        this.channelCount = -1;
        this.sampleRateHz = -1;
        this.outputSampleRateHz = -1;
        ByteBuffer byteBuffer = EMPTY_BUFFER;
        this.buffer = byteBuffer;
        this.shortBuffer = byteBuffer.asShortBuffer();
        this.outputBuffer = EMPTY_BUFFER;
        this.pendingOutputSampleRateHz = -1;
        this.sonic = null;
        this.inputBytes = 0L;
        this.outputBytes = 0L;
        this.inputEnded = false;
    }
}
