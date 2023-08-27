package com.mpatric.mp3agic;

import com.AOSP.MyThumbnailUtils;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
/* loaded from: classes2.dex */
public class MpegFrame {
    private static final long BITMASK_BITRATE = 61440;
    private static final long BITMASK_CHANNEL_MODE = 192;
    private static final long BITMASK_COPYRIGHT = 8;
    private static final long BITMASK_EMPHASIS = 3;
    private static final long BITMASK_FRAME_SYNC = 4292870144L;
    private static final long BITMASK_LAYER = 393216;
    private static final long BITMASK_MODE_EXTENSION = 48;
    private static final long BITMASK_ORIGINAL = 4;
    private static final long BITMASK_PADDING = 512;
    private static final long BITMASK_PRIVATE = 256;
    private static final long BITMASK_PROTECTION = 65536;
    private static final long BITMASK_SAMPLE_RATE = 3072;
    private static final long BITMASK_VERSION = 1572864;
    public static final String CHANNEL_MODE_DUAL_MONO = "Dual mono";
    public static final String CHANNEL_MODE_JOINT_STEREO = "Joint stereo";
    public static final String CHANNEL_MODE_MONO = "Mono";
    public static final String CHANNEL_MODE_STEREO = "Stereo";
    public static final String EMPHASIS_CCITT_J_17 = "CCITT J.17";
    public static final String EMPHASIS_NONE = "None";
    public static final String EMPHASIS__50_15_MS = "50/15 ms";
    private static final int FRAME_DATA_LENGTH = 4;
    private static final int FRAME_SYNC = 2047;
    public static final String MODE_EXTENSION_BANDS_12_31 = "Bands 12-31";
    public static final String MODE_EXTENSION_BANDS_16_31 = "Bands 16-31";
    public static final String MODE_EXTENSION_BANDS_4_31 = "Bands 4-31";
    public static final String MODE_EXTENSION_BANDS_8_31 = "Bands 8-31";
    public static final String MODE_EXTENSION_INTENSITY_M_S_STEREO = "Intensity & M/S stereo";
    public static final String MODE_EXTENSION_INTENSITY_STEREO = "Intensity stereo";
    public static final String MODE_EXTENSION_M_S_STEREO = "M/S stereo";
    public static final String MODE_EXTENSION_NA = "n/a";
    public static final String MODE_EXTENSION_NONE = "None";
    public static final String MPEG_VERSION_1_0 = "1.0";
    public static final String MPEG_VERSION_2_0 = "2.0";
    public static final String MPEG_VERSION_2_5 = "2.5";
    private int bitrate;
    private String channelMode;
    private boolean copyright;
    private String emphasis;
    private int layer;
    private String modeExtension;
    private boolean original;
    private boolean padding;
    private boolean privat;
    private boolean protection;
    private int sampleRate;
    private String version;
    public static final String MPEG_LAYER_1 = "I";
    public static final String MPEG_LAYER_2 = "II";
    public static final String MPEG_LAYER_3 = "III";
    public static final String[] MPEG_LAYERS = {null, MPEG_LAYER_1, MPEG_LAYER_2, MPEG_LAYER_3};

    protected int extractField(long j, long j2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 > 31) {
                break;
            } else if (((j2 >> i2) & 1) != 0) {
                i = i2;
                break;
            } else {
                i2++;
            }
        }
        return (int) ((j >> i) & (j2 >> i));
    }

    public MpegFrame(byte[] bArr) throws InvalidDataException {
        if (bArr.length < 4) {
            throw new InvalidDataException("Mpeg frame too short");
        }
        setFields(BufferTools.unpackInteger(bArr[0], bArr[1], bArr[2], bArr[3]));
    }

    public MpegFrame(byte b, byte b2, byte b3, byte b4) throws InvalidDataException {
        setFields(BufferTools.unpackInteger(b, b2, b3, b4));
    }

    protected MpegFrame() {
    }

    private void setFields(long j) throws InvalidDataException {
        if (extractField(j, BITMASK_FRAME_SYNC) != 2047) {
            throw new InvalidDataException("Frame sync missing");
        }
        setVersion(extractField(j, BITMASK_VERSION));
        setLayer(extractField(j, BITMASK_LAYER));
        setProtection(extractField(j, 65536L));
        setBitRate(extractField(j, BITMASK_BITRATE));
        setSampleRate(extractField(j, BITMASK_SAMPLE_RATE));
        setPadding(extractField(j, 512L));
        setPrivate(extractField(j, 256L));
        setChannelMode(extractField(j, BITMASK_CHANNEL_MODE));
        setModeExtension(extractField(j, BITMASK_MODE_EXTENSION));
        setCopyright(extractField(j, 8L));
        setOriginal(extractField(j, 4L));
        setEmphasis(extractField(j, 3L));
    }

    private void setVersion(int i) throws InvalidDataException {
        if (i == 0) {
            this.version = MPEG_VERSION_2_5;
        } else if (i == 2) {
            this.version = "2.0";
        } else if (i == 3) {
            this.version = MPEG_VERSION_1_0;
        } else {
            throw new InvalidDataException("Invalid mpeg audio version in frame header");
        }
    }

    private void setLayer(int i) throws InvalidDataException {
        if (i == 1) {
            this.layer = 3;
        } else if (i == 2) {
            this.layer = 2;
        } else if (i == 3) {
            this.layer = 1;
        } else {
            throw new InvalidDataException("Invalid mpeg layer description in frame header");
        }
    }

    private void setProtection(int i) {
        this.protection = i == 1;
    }

    private void setBitRate(int i) throws InvalidDataException {
        if (MPEG_VERSION_1_0.equals(this.version)) {
            int i2 = this.layer;
            if (i2 == 1) {
                switch (i) {
                    case 1:
                        this.bitrate = 32;
                        return;
                    case 2:
                        this.bitrate = 64;
                        return;
                    case 3:
                        this.bitrate = 96;
                        return;
                    case 4:
                        this.bitrate = 128;
                        return;
                    case 5:
                        this.bitrate = 160;
                        return;
                    case 6:
                        this.bitrate = PsExtractor.AUDIO_STREAM;
                        return;
                    case 7:
                        this.bitrate = 224;
                        return;
                    case 8:
                        this.bitrate = 256;
                        return;
                    case 9:
                        this.bitrate = 288;
                        return;
                    case 10:
                        this.bitrate = MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL;
                        return;
                    case 11:
                        this.bitrate = 352;
                        return;
                    case 12:
                        this.bitrate = 384;
                        return;
                    case 13:
                        this.bitrate = 416;
                        return;
                    case 14:
                        this.bitrate = 448;
                        return;
                }
            } else if (i2 == 2) {
                switch (i) {
                    case 1:
                        this.bitrate = 32;
                        return;
                    case 2:
                        this.bitrate = 48;
                        return;
                    case 3:
                        this.bitrate = 56;
                        return;
                    case 4:
                        this.bitrate = 64;
                        return;
                    case 5:
                        this.bitrate = 80;
                        return;
                    case 6:
                        this.bitrate = 96;
                        return;
                    case 7:
                        this.bitrate = 112;
                        return;
                    case 8:
                        this.bitrate = 128;
                        return;
                    case 9:
                        this.bitrate = 160;
                        return;
                    case 10:
                        this.bitrate = PsExtractor.AUDIO_STREAM;
                        return;
                    case 11:
                        this.bitrate = 224;
                        return;
                    case 12:
                        this.bitrate = 256;
                        return;
                    case 13:
                        this.bitrate = MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL;
                        return;
                    case 14:
                        this.bitrate = 384;
                        return;
                }
            } else if (i2 == 3) {
                switch (i) {
                    case 1:
                        this.bitrate = 32;
                        return;
                    case 2:
                        this.bitrate = 40;
                        return;
                    case 3:
                        this.bitrate = 48;
                        return;
                    case 4:
                        this.bitrate = 56;
                        return;
                    case 5:
                        this.bitrate = 64;
                        return;
                    case 6:
                        this.bitrate = 80;
                        return;
                    case 7:
                        this.bitrate = 96;
                        return;
                    case 8:
                        this.bitrate = 112;
                        return;
                    case 9:
                        this.bitrate = 128;
                        return;
                    case 10:
                        this.bitrate = 160;
                        return;
                    case 11:
                        this.bitrate = PsExtractor.AUDIO_STREAM;
                        return;
                    case 12:
                        this.bitrate = 224;
                        return;
                    case 13:
                        this.bitrate = 256;
                        return;
                    case 14:
                        this.bitrate = MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL;
                        return;
                }
            }
        } else if ("2.0".equals(this.version) || MPEG_VERSION_2_5.equals(this.version)) {
            int i3 = this.layer;
            if (i3 == 1) {
                switch (i) {
                    case 1:
                        this.bitrate = 32;
                        return;
                    case 2:
                        this.bitrate = 48;
                        return;
                    case 3:
                        this.bitrate = 56;
                        return;
                    case 4:
                        this.bitrate = 64;
                        return;
                    case 5:
                        this.bitrate = 80;
                        return;
                    case 6:
                        this.bitrate = 96;
                        return;
                    case 7:
                        this.bitrate = 112;
                        return;
                    case 8:
                        this.bitrate = 128;
                        return;
                    case 9:
                        this.bitrate = 144;
                        return;
                    case 10:
                        this.bitrate = 160;
                        return;
                    case 11:
                        this.bitrate = 176;
                        return;
                    case 12:
                        this.bitrate = PsExtractor.AUDIO_STREAM;
                        return;
                    case 13:
                        this.bitrate = 224;
                        return;
                    case 14:
                        this.bitrate = 256;
                        return;
                }
            } else if (i3 == 2 || i3 == 3) {
                switch (i) {
                    case 1:
                        this.bitrate = 8;
                        return;
                    case 2:
                        this.bitrate = 16;
                        return;
                    case 3:
                        this.bitrate = 24;
                        return;
                    case 4:
                        this.bitrate = 32;
                        return;
                    case 5:
                        this.bitrate = 40;
                        return;
                    case 6:
                        this.bitrate = 48;
                        return;
                    case 7:
                        this.bitrate = 56;
                        return;
                    case 8:
                        this.bitrate = 64;
                        return;
                    case 9:
                        this.bitrate = 80;
                        return;
                    case 10:
                        this.bitrate = 96;
                        return;
                    case 11:
                        this.bitrate = 112;
                        return;
                    case 12:
                        this.bitrate = 128;
                        return;
                    case 13:
                        this.bitrate = 144;
                        return;
                    case 14:
                        this.bitrate = 160;
                        return;
                }
            }
        }
        throw new InvalidDataException("Invalid bitrate in frame header");
    }

    private void setSampleRate(int i) throws InvalidDataException {
        if (MPEG_VERSION_1_0.equals(this.version)) {
            if (i == 0) {
                this.sampleRate = 44100;
                return;
            } else if (i == 1) {
                this.sampleRate = 48000;
                return;
            } else if (i == 2) {
                this.sampleRate = 32000;
                return;
            }
        } else if ("2.0".equals(this.version)) {
            if (i == 0) {
                this.sampleRate = 22050;
                return;
            } else if (i == 1) {
                this.sampleRate = 24000;
                return;
            } else if (i == 2) {
                this.sampleRate = 16000;
                return;
            }
        } else if (MPEG_VERSION_2_5.equals(this.version)) {
            if (i == 0) {
                this.sampleRate = 11025;
                return;
            } else if (i == 1) {
                this.sampleRate = 12000;
                return;
            } else if (i == 2) {
                this.sampleRate = 8000;
                return;
            }
        }
        throw new InvalidDataException("Invalid sample rate in frame header");
    }

    private void setPadding(int i) {
        this.padding = i == 1;
    }

    private void setPrivate(int i) {
        this.privat = i == 1;
    }

    private void setChannelMode(int i) throws InvalidDataException {
        if (i == 0) {
            this.channelMode = CHANNEL_MODE_STEREO;
        } else if (i == 1) {
            this.channelMode = CHANNEL_MODE_JOINT_STEREO;
        } else if (i == 2) {
            this.channelMode = CHANNEL_MODE_DUAL_MONO;
        } else if (i == 3) {
            this.channelMode = CHANNEL_MODE_MONO;
        } else {
            throw new InvalidDataException("Invalid channel mode in frame header");
        }
    }

    private void setModeExtension(int i) throws InvalidDataException {
        if (!CHANNEL_MODE_JOINT_STEREO.equals(this.channelMode)) {
            this.modeExtension = MODE_EXTENSION_NA;
            return;
        }
        int i2 = this.layer;
        if (i2 == 1 || i2 == 2) {
            if (i == 0) {
                this.modeExtension = MODE_EXTENSION_BANDS_4_31;
                return;
            } else if (i == 1) {
                this.modeExtension = MODE_EXTENSION_BANDS_8_31;
                return;
            } else if (i == 2) {
                this.modeExtension = MODE_EXTENSION_BANDS_12_31;
                return;
            } else if (i == 3) {
                this.modeExtension = MODE_EXTENSION_BANDS_16_31;
                return;
            }
        } else if (i2 == 3) {
            if (i == 0) {
                this.modeExtension = "None";
                return;
            } else if (i == 1) {
                this.modeExtension = MODE_EXTENSION_INTENSITY_STEREO;
                return;
            } else if (i == 2) {
                this.modeExtension = MODE_EXTENSION_M_S_STEREO;
                return;
            } else if (i == 3) {
                this.modeExtension = MODE_EXTENSION_INTENSITY_M_S_STEREO;
                return;
            }
        }
        throw new InvalidDataException("Invalid mode extension in frame header");
    }

    private void setCopyright(int i) {
        this.copyright = i == 1;
    }

    private void setOriginal(int i) {
        this.original = i == 1;
    }

    private void setEmphasis(int i) throws InvalidDataException {
        if (i == 0) {
            this.emphasis = "None";
        } else if (i == 1) {
            this.emphasis = EMPHASIS__50_15_MS;
        } else if (i == 3) {
            this.emphasis = EMPHASIS_CCITT_J_17;
        } else {
            throw new InvalidDataException("Invalid emphasis in frame header");
        }
    }

    public int getBitrate() {
        return this.bitrate;
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
        return MPEG_LAYERS[this.layer];
    }

    public String getModeExtension() {
        return this.modeExtension;
    }

    public boolean isOriginal() {
        return this.original;
    }

    public boolean hasPadding() {
        return this.padding;
    }

    public boolean isPrivate() {
        return this.privat;
    }

    public boolean isProtection() {
        return this.protection;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public String getVersion() {
        return this.version;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int getLengthInBytes() {
        int i;
        int i2;
        ?? r0 = this.padding;
        if (this.layer == 1) {
            i = (this.bitrate * 48000) / this.sampleRate;
            i2 = r0 * 4;
        } else {
            i = (this.bitrate * 144000) / this.sampleRate;
            i2 = r0;
        }
        return i + i2;
    }
}
