package com.mpatric.mp3agic;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class Mp3File extends FileWrapper {
    private static final int DEFAULT_BUFFER_LENGTH = 65536;
    private static final int MINIMUM_BUFFER_LENGTH = 40;
    private static final int XING_MARKER_OFFSET_1 = 13;
    private static final int XING_MARKER_OFFSET_2 = 21;
    private static final int XING_MARKER_OFFSET_3 = 36;
    private double bitrate;
    private Map<Integer, MutableInteger> bitrates;
    protected int bufferLength;
    private String channelMode;
    private boolean copyright;
    private byte[] customTag;
    private String emphasis;
    private int endOffset;
    private int frameCount;
    private ID3v1 id3v1Tag;
    private ID3v2 id3v2Tag;
    private String layer;
    private String modeExtension;
    private boolean original;
    private int sampleRate;
    private boolean scanFile;
    private int startOffset;
    private String version;
    private int xingBitrate;
    private int xingOffset;

    protected Mp3File() {
        this.xingOffset = -1;
        this.startOffset = -1;
        this.endOffset = -1;
        this.frameCount = 0;
        this.bitrates = new HashMap();
        this.bitrate = 0.0d;
    }

    public Mp3File(String str) throws IOException, UnsupportedTagException, InvalidDataException {
        super(str);
        this.xingOffset = -1;
        this.startOffset = -1;
        this.endOffset = -1;
        this.frameCount = 0;
        this.bitrates = new HashMap();
        this.bitrate = 0.0d;
        init(65536, true);
    }

    private void init(int i, boolean z) throws IOException, UnsupportedTagException, InvalidDataException {
        if (i < 41) {
            throw new IllegalArgumentException("Buffer too small");
        }
        this.bufferLength = i;
        this.scanFile = z;
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.file.getPath(), "r");
        try {
            initId3v1Tag(randomAccessFile);
            scanFile(randomAccessFile);
            if (this.startOffset < 0) {
                throw new InvalidDataException("No mpegs frames found");
            }
            initId3v2Tag(randomAccessFile);
            if (z) {
                initCustomTag(randomAccessFile);
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
    }

    protected int preScanFile(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[10];
        try {
            randomAccessFile.seek(0L);
            if (randomAccessFile.read(bArr, 0, 10) == 10) {
                ID3v2TagFactory.sanityCheckTag(bArr);
                return BufferTools.unpackSynchsafeInteger(bArr[6], bArr[7], bArr[8], bArr[9]) + 10;
            }
        } catch (NoSuchTagException | UnsupportedTagException | IOException unused) {
        }
        return 0;
    }

    private void scanFile(RandomAccessFile randomAccessFile) throws IOException, InvalidDataException {
        int i;
        byte[] bArr = new byte[this.bufferLength];
        int preScanFile = preScanFile(randomAccessFile);
        randomAccessFile.seek(preScanFile);
        int i2 = preScanFile;
        while (true) {
            boolean z = false;
            while (!z) {
                int read = randomAccessFile.read(bArr, 0, this.bufferLength);
                if (read < this.bufferLength) {
                    z = true;
                }
                if (read >= 40) {
                    try {
                        if (this.startOffset < 0) {
                            i = scanBlockForStart(bArr, read, preScanFile, 0);
                            if (this.startOffset >= 0 && !this.scanFile) {
                                return;
                            }
                            i2 = this.startOffset;
                        } else {
                            i = 0;
                        }
                        preScanFile += scanBlock(bArr, read, preScanFile, i);
                        randomAccessFile.seek(preScanFile);
                    } catch (InvalidDataException e) {
                        if (this.frameCount >= 2) {
                            return;
                        }
                        this.startOffset = -1;
                        this.xingOffset = -1;
                        this.frameCount = 0;
                        this.bitrates.clear();
                        int i3 = i2 + 1;
                        if (i3 == 0) {
                            throw new InvalidDataException("Valid start of mpeg frames not found", e);
                        }
                        randomAccessFile.seek(i3);
                        preScanFile = i3;
                    }
                }
            }
            return;
        }
    }

    private int scanBlockForStart(byte[] bArr, int i, int i2, int i3) {
        MpegFrame mpegFrame;
        while (i3 < i - 40) {
            if (bArr[i3] == -1) {
                int i4 = i3 + 1;
                if ((bArr[i4] & (-32)) == -32) {
                    try {
                        mpegFrame = new MpegFrame(bArr[i3], bArr[i4], bArr[i3 + 2], bArr[i3 + 3]);
                    } catch (InvalidDataException unused) {
                        i3 = i4;
                    }
                    if (this.xingOffset < 0 && isXingFrame(bArr, i3)) {
                        this.xingOffset = i2 + i3;
                        this.xingBitrate = mpegFrame.getBitrate();
                        i3 += mpegFrame.getLengthInBytes();
                    } else {
                        this.startOffset = i2 + i3;
                        this.channelMode = mpegFrame.getChannelMode();
                        this.emphasis = mpegFrame.getEmphasis();
                        this.layer = mpegFrame.getLayer();
                        this.modeExtension = mpegFrame.getModeExtension();
                        this.sampleRate = mpegFrame.getSampleRate();
                        this.version = mpegFrame.getVersion();
                        this.copyright = mpegFrame.isCopyright();
                        this.original = mpegFrame.isOriginal();
                        this.frameCount++;
                        addBitrate(mpegFrame.getBitrate());
                        return i3 + mpegFrame.getLengthInBytes();
                    }
                }
            }
            i3++;
        }
        return i3;
    }

    private int scanBlock(byte[] bArr, int i, int i2, int i3) throws InvalidDataException {
        int i4;
        while (i3 < i - 40) {
            MpegFrame mpegFrame = new MpegFrame(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            sanityCheckFrame(mpegFrame, i2 + i3);
            if ((mpegFrame.getLengthInBytes() + i4) - 1 >= maxEndOffset()) {
                break;
            }
            this.endOffset = (i4 + mpegFrame.getLengthInBytes()) - 1;
            this.frameCount++;
            addBitrate(mpegFrame.getBitrate());
            i3 += mpegFrame.getLengthInBytes();
        }
        return i3;
    }

    private int maxEndOffset() {
        int length = (int) getLength();
        return hasId3v1Tag() ? length - 128 : length;
    }

    private boolean isXingFrame(byte[] bArr, int i) {
        int i2 = i + 13;
        if (bArr.length >= i2 + 3) {
            if ("Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i2, 4)) || "Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i2, 4))) {
                return true;
            }
            int i3 = i + 21;
            if (bArr.length >= i3 + 3) {
                if ("Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i3, 4)) || "Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i3, 4))) {
                    return true;
                }
                int i4 = i + 36;
                if (bArr.length >= i4 + 3) {
                    return "Xing".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i4, 4)) || "Info".equals(BufferTools.byteBufferToStringIgnoringEncodingIssues(bArr, i4, 4));
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private void sanityCheckFrame(MpegFrame mpegFrame, int i) throws InvalidDataException {
        if (this.sampleRate != mpegFrame.getSampleRate()) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (!this.layer.equals(mpegFrame.getLayer())) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (!this.version.equals(mpegFrame.getVersion())) {
            throw new InvalidDataException("Inconsistent frame header");
        }
        if (i + mpegFrame.getLengthInBytes() > getLength()) {
            throw new InvalidDataException("Frame would extend beyond end of file");
        }
    }

    private void addBitrate(int i) {
        Integer num = new Integer(i);
        MutableInteger mutableInteger = this.bitrates.get(num);
        if (mutableInteger != null) {
            mutableInteger.increment();
        } else {
            this.bitrates.put(num, new MutableInteger(1));
        }
        double d = this.bitrate;
        int i2 = this.frameCount;
        double d2 = i2 - 1;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = i;
        Double.isNaN(d4);
        double d5 = i2;
        Double.isNaN(d5);
        this.bitrate = (d3 + d4) / d5;
    }

    private void initId3v1Tag(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[128];
        randomAccessFile.seek(getLength() - 128);
        if (randomAccessFile.read(bArr, 0, 128) < 128) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.id3v1Tag = new ID3v1Tag(bArr);
        } catch (NoSuchTagException unused) {
            this.id3v1Tag = null;
        }
    }

    private void initId3v2Tag(RandomAccessFile randomAccessFile) throws IOException, UnsupportedTagException, InvalidDataException {
        if (this.xingOffset == 0 || this.startOffset == 0) {
            this.id3v2Tag = null;
            return;
        }
        int i = hasXingFrame() ? this.xingOffset : this.startOffset;
        byte[] bArr = new byte[i];
        randomAccessFile.seek(0L);
        if (randomAccessFile.read(bArr, 0, i) < i) {
            throw new IOException("Not enough bytes read");
        }
        try {
            this.id3v2Tag = ID3v2TagFactory.createTag(bArr);
        } catch (NoSuchTagException unused) {
            this.id3v2Tag = null;
        }
    }

    private void initCustomTag(RandomAccessFile randomAccessFile) throws IOException {
        int length = (int) (getLength() - (this.endOffset + 1));
        if (hasId3v1Tag()) {
            length -= 128;
        }
        if (length <= 0) {
            this.customTag = null;
            return;
        }
        this.customTag = new byte[length];
        randomAccessFile.seek(this.endOffset + 1);
        if (randomAccessFile.read(this.customTag, 0, length) < length) {
            throw new IOException("Not enough bytes read");
        }
    }

    public int getFrameCount() {
        return this.frameCount;
    }

    public int getStartOffset() {
        return this.startOffset;
    }

    public int getEndOffset() {
        return this.endOffset;
    }

    public long getLengthInMilliseconds() {
        double d = (this.endOffset - this.startOffset) * 8;
        double d2 = this.bitrate;
        Double.isNaN(d);
        return (long) ((d / d2) + 0.5d);
    }

    public long getLengthInSeconds() {
        return (getLengthInMilliseconds() + 500) / 1000;
    }

    public boolean isVbr() {
        return this.bitrates.size() > 1;
    }

    public int getBitrate() {
        return (int) (this.bitrate + 0.5d);
    }

    public Map<Integer, MutableInteger> getBitrates() {
        return this.bitrates;
    }

    public String getChannelMode() {
        return this.channelMode;
    }

    public boolean isCopyright() {
        return this.copyright;
    }

    public String getEmphasis() {
        return this.emphasis;
    }

    public String getLayer() {
        return this.layer;
    }

    public String getModeExtension() {
        return this.modeExtension;
    }

    public boolean isOriginal() {
        return this.original;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public String getVersion() {
        return this.version;
    }

    public boolean hasXingFrame() {
        return this.xingOffset >= 0;
    }

    public int getXingOffset() {
        return this.xingOffset;
    }

    public int getXingBitrate() {
        return this.xingBitrate;
    }

    public boolean hasId3v1Tag() {
        return this.id3v1Tag != null;
    }

    public ID3v1 getId3v1Tag() {
        return this.id3v1Tag;
    }

    public void setId3v1Tag(ID3v1 iD3v1) {
        this.id3v1Tag = iD3v1;
    }

    public void removeId3v1Tag() {
        this.id3v1Tag = null;
    }

    public boolean hasId3v2Tag() {
        return this.id3v2Tag != null;
    }

    public ID3v2 getId3v2Tag() {
        return this.id3v2Tag;
    }

    public void setId3v2Tag(ID3v2 iD3v2) {
        this.id3v2Tag = iD3v2;
    }

    public void removeId3v2Tag() {
        this.id3v2Tag = null;
    }

    public boolean hasCustomTag() {
        return this.customTag != null;
    }

    public byte[] getCustomTag() {
        return this.customTag;
    }

    public void setCustomTag(byte[] bArr) {
        this.customTag = bArr;
    }

    public void removeCustomTag() {
        this.customTag = null;
    }

    public void save(String str) throws IOException, NotSupportedException {
        if (this.file.compareTo(new File(str)) == 0) {
            throw new IllegalArgumentException("Save filename same as source filename");
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
        try {
            if (hasId3v2Tag()) {
                randomAccessFile.write(this.id3v2Tag.toBytes());
            }
            saveMpegFrames(randomAccessFile);
            if (hasCustomTag()) {
                randomAccessFile.write(this.customTag);
            }
            if (hasId3v1Tag()) {
                randomAccessFile.write(this.id3v1Tag.toBytes());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                try {
                    randomAccessFile.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void saveMpegFrames(RandomAccessFile randomAccessFile) throws IOException {
        int i = this.xingOffset;
        if (i < 0) {
            i = this.startOffset;
        }
        if (i < 0 || this.endOffset < i) {
            return;
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.file.getPath(), "r");
        byte[] bArr = new byte[this.bufferLength];
        try {
            randomAccessFile2.seek(i);
            while (true) {
                int read = randomAccessFile2.read(bArr, 0, this.bufferLength);
                int i2 = i + read;
                if (i2 <= this.endOffset) {
                    randomAccessFile.write(bArr, 0, read);
                    i = i2;
                } else {
                    randomAccessFile.write(bArr, 0, (this.endOffset - i) + 1);
                    return;
                }
            }
        } finally {
            randomAccessFile2.close();
        }
    }
}
