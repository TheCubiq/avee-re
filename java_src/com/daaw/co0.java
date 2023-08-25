package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
@TargetApi(16)
/* loaded from: classes.dex */
public final class co0 {

    /* renamed from: a */
    public final String f5990a;

    /* renamed from: b */
    public final String f5991b;

    /* renamed from: c */
    public final MediaCodecInfo.CodecCapabilities f5992c;

    /* renamed from: d */
    public final boolean f5993d;

    /* renamed from: e */
    public final boolean f5994e;

    /* renamed from: f */
    public final boolean f5995f;

    /* renamed from: g */
    public final boolean f5996g;

    public co0(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f5990a = (String) C2914s6.m10686e(str);
        this.f5991b = str2;
        this.f5992c = codecCapabilities;
        this.f5996g = z;
        boolean z4 = true;
        this.f5993d = (z2 || codecCapabilities == null || !m25186e(codecCapabilities)) ? false : true;
        this.f5994e = codecCapabilities != null && m25179l(codecCapabilities);
        if (!z3 && (codecCapabilities == null || !m25181j(codecCapabilities))) {
            z4 = false;
        }
        this.f5995f = z4;
    }

    /* renamed from: a */
    public static int m25190a(String str, String str2, int i) {
        if (i > 1 || ((sq1.f26525a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
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
    /* renamed from: c */
    public static boolean m25188c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* renamed from: e */
    public static boolean m25186e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.f26525a >= 19 && m25185f(codecCapabilities);
    }

    @TargetApi(19)
    /* renamed from: f */
    public static boolean m25185f(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: j */
    public static boolean m25181j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.f26525a >= 21 && m25180k(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: k */
    public static boolean m25180k(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: l */
    public static boolean m25179l(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return sq1.f26525a >= 21 && m25178m(codecCapabilities);
    }

    @TargetApi(21)
    /* renamed from: m */
    public static boolean m25178m(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: q */
    public static co0 m25174q(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new co0(str, str2, codecCapabilities, false, z, z2);
    }

    /* renamed from: r */
    public static co0 m25173r(String str) {
        return new co0(str, null, null, true, false, false);
    }

    @TargetApi(21)
    /* renamed from: b */
    public Point m25189b(int i, int i2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5992c;
        if (codecCapabilities == null) {
            str = "align.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                int widthAlignment = videoCapabilities.getWidthAlignment();
                int heightAlignment = videoCapabilities.getHeightAlignment();
                return new Point(sq1.m10010f(i, widthAlignment) * widthAlignment, sq1.m10010f(i2, heightAlignment) * heightAlignment);
            }
            str = "align.vCaps";
        }
        m25175p(str);
        return null;
    }

    /* renamed from: d */
    public MediaCodecInfo.CodecProfileLevel[] m25187d() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5992c;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @TargetApi(21)
    /* renamed from: g */
    public boolean m25184g(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5992c;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (m25190a(this.f5990a, this.f5991b, audioCapabilities.getMaxInputChannelCount()) >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        m25175p(str);
        return false;
    }

    @TargetApi(21)
    /* renamed from: h */
    public boolean m25183h(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5992c;
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
        m25175p(str);
        return false;
    }

    /* renamed from: i */
    public boolean m25182i(String str) {
        String m20501d;
        MediaCodecInfo.CodecProfileLevel[] m25187d;
        StringBuilder sb;
        String str2;
        if (str == null || this.f5991b == null || (m20501d = hq0.m20501d(str)) == null) {
            return true;
        }
        if (this.f5991b.equals(m20501d)) {
            Pair<Integer, Integer> m22470e = fo0.m22470e(str);
            if (m22470e == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m25187d()) {
                if (codecProfileLevel.profile == ((Integer) m22470e.first).intValue() && codecProfileLevel.level >= ((Integer) m22470e.second).intValue()) {
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
        sb.append(m20501d);
        m25175p(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: n */
    public boolean m25177n(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f5992c;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (m25188c(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i < i2 && m25188c(videoCapabilities, i2, i, d)) {
                    m25176o("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
            }
        }
        m25175p(str);
        return false;
    }

    /* renamed from: o */
    public final void m25176o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.f5990a);
        sb.append(", ");
        sb.append(this.f5991b);
        sb.append("] [");
        sb.append(sq1.f26529e);
        sb.append("]");
    }

    /* renamed from: p */
    public final void m25175p(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(this.f5990a);
        sb.append(", ");
        sb.append(this.f5991b);
        sb.append("] [");
        sb.append(sq1.f26529e);
        sb.append("]");
    }
}
