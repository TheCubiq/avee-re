package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
/* loaded from: classes.dex */
public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.wav.WavExtractor.1
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new WavExtractor()};
        }
    };
    private static final int MAX_INPUT_SIZE = 32768;
    private int bytesPerFrame;
    private ExtractorOutput extractorOutput;
    private int pendingBytes;
    private TrackOutput trackOutput;
    private WavHeader wavHeader;

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return WavHeaderReader.peek(extractorInput) != null;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        this.wavHeader = null;
        extractorOutput.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.pendingBytes = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        if (this.wavHeader == null) {
            WavHeader peek = WavHeaderReader.peek(extractorInput);
            this.wavHeader = peek;
            if (peek == null) {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
            this.trackOutput.format(Format.createAudioSampleFormat(null, MimeTypes.AUDIO_RAW, null, peek.getBitrate(), 32768, this.wavHeader.getNumChannels(), this.wavHeader.getSampleRateHz(), this.wavHeader.getEncoding(), null, null, 0, null));
            this.bytesPerFrame = this.wavHeader.getBytesPerFrame();
        }
        if (!this.wavHeader.hasDataBounds()) {
            WavHeaderReader.skipToData(extractorInput, this.wavHeader);
            this.extractorOutput.seekMap(this.wavHeader);
        }
        int sampleData = this.trackOutput.sampleData(extractorInput, 32768 - this.pendingBytes, true);
        if (sampleData != -1) {
            this.pendingBytes += sampleData;
        }
        int i = this.pendingBytes / this.bytesPerFrame;
        if (i > 0) {
            long timeUs = this.wavHeader.getTimeUs(extractorInput.getPosition() - this.pendingBytes);
            int i2 = i * this.bytesPerFrame;
            int i3 = this.pendingBytes - i2;
            this.pendingBytes = i3;
            this.trackOutput.sampleMetadata(timeUs, 1, i2, i3, null);
        }
        return sampleData == -1 ? -1 : 0;
    }
}
