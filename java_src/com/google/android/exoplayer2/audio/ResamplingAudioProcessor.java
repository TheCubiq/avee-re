package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UByte;
/* loaded from: classes.dex */
final class ResamplingAudioProcessor implements AudioProcessor {
    private boolean inputEnded;
    private int sampleRateHz = -1;
    private int channelCount = -1;
    private int encoding = 0;
    private ByteBuffer buffer = EMPTY_BUFFER;
    private ByteBuffer outputBuffer = EMPTY_BUFFER;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputEncoding() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean configure(int i, int i2, int i3) throws AudioProcessor.UnhandledFormatException {
        if (i3 != 3 && i3 != 2 && i3 != Integer.MIN_VALUE && i3 != 1073741824) {
            throw new AudioProcessor.UnhandledFormatException(i, i2, i3);
        }
        if (this.sampleRateHz == i && this.channelCount == i2 && this.encoding == i3) {
            return false;
        }
        this.sampleRateHz = i;
        this.channelCount = i2;
        this.encoding = i3;
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        int i = this.encoding;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputChannelCount() {
        return this.channelCount;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public int getOutputSampleRateHz() {
        return this.sampleRateHz;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void queueInput(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.encoding;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 == 1073741824) {
                i = i3 / 2;
                if (this.buffer.capacity() >= i) {
                    this.buffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.buffer.clear();
                }
                i2 = this.encoding;
                if (i2 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        this.buffer.put(byteBuffer.get(position + 1));
                        this.buffer.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i2 == 3) {
                    while (position < limit) {
                        this.buffer.put((byte) 0);
                        this.buffer.put((byte) ((byteBuffer.get(position) & UByte.MAX_VALUE) - 128));
                        position++;
                    }
                } else if (i2 != 1073741824) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        this.buffer.put(byteBuffer.get(position + 2));
                        this.buffer.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.buffer.flip();
                this.outputBuffer = this.buffer;
            }
            throw new IllegalStateException();
        }
        i = i3 * 2;
        if (this.buffer.capacity() >= i) {
        }
        i2 = this.encoding;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.buffer.flip();
        this.outputBuffer = this.buffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueEndOfStream() {
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
        return this.inputEnded && this.outputBuffer == EMPTY_BUFFER;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        this.outputBuffer = EMPTY_BUFFER;
        this.inputEnded = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        flush();
        this.sampleRateHz = -1;
        this.channelCount = -1;
        this.encoding = 0;
        this.buffer = EMPTY_BUFFER;
    }
}
