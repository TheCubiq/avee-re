package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
@TargetApi(16)
/* loaded from: classes.dex */
public final class co0 {
    public final String a;
    public final String b;
    public final MediaCodecInfo.CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public co0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.a = (String) s6.e(str);
        this.b = str2;
        this.c = codecCapabilities;
        this.g = z;
        boolean z4 = true;
        this.d = (z2 || codecCapabilities == null || !e(codecCapabilities)) ? false : true;
        this.e = codecCapabilities != null && l(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !j(codecCapabilities))) {
            z4 = false;
        }
        this.f = z4;
    }

    public static int a(String str, String str2, int i) {
        if (i > 1 || ((sq1.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        return i2;
    }

    @TargetApi(21)
    public static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    public static boolean e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.a >= 19 && f(codecCapabilities);
    }

    @TargetApi(19)
    public static boolean f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    public static boolean j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.a >= 21 && k(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static boolean l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.a >= 21 && m(codecCapabilities);
    }

    @TargetApi(21)
    public static boolean m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    public static co0 q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new co0(str, str2, codecCapabilities, false, z, z2);
    }

    public static co0 r(String str) {
        return new co0(str, null, null, true, false, false);
    }

    @TargetApi(21)
    public Point b(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(sq1.f(i, widthAlignment) * widthAlignment, sq1.f(i2, heightAlignment) * heightAlignment);
            }
            str = "align.vCaps";
        }
        p(str);
        return null;
    }

    public MediaCodecInfo.CodecProfileLevel[] d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    public boolean g(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        p(str);
        return false;
    }

    @TargetApi(21)
    public boolean h(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            str = "sampleRate.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "sampleRate.aCaps";
            } else if (audioCapabilities.isSampleRateSupported(i)) {
                return true;
            } else {
                str = "sampleRate.support, " + i;
            }
        }
        p(str);
        return false;
    }

    public boolean i(String str) {
        String d;
        MediaCodecInfo.CodecProfileLevel[] d2;
        StringBuilder sb;
        String str2;
        if (str == null || this.b == null || (d = hq0.d(str)) == null) {
            return true;
        }
        if (this.b.equals(d)) {
            Pair<Integer, Integer> e = fo0.e(str);
            if (e == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : d()) {
                if (codecProfileLevel.profile == ((Integer) e.first).intValue() && codecProfileLevel.level >= ((Integer) e.second).intValue()) {
                    return true;
                }
            }
            sb = new StringBuilder();
            str2 = "codec.profileLevel, ";
        } else {
            sb = new StringBuilder();
            str2 = "codec.mime ";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(", ");
        sb.append(d);
        p(sb.toString());
        return false;
    }

    @TargetApi(21)
    public boolean n(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (c(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i < i2 && c(videoCapabilities, i2, i, d)) {
                    o("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
            }
        }
        p(str);
        return false;
    }

    public final void o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append("] [");
        sb.append(sq1.e);
        sb.append("]");
    }

    public final void p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append("] [");
        sb.append(sq1.e);
        sb.append("]");
    }
}
