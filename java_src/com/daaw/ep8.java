package com.daaw;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ep8 {

    /* renamed from: a */
    public final String f8666a;

    /* renamed from: b */
    public final String f8667b;

    /* renamed from: c */
    public final String f8668c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f8669d;

    /* renamed from: e */
    public final boolean f8670e;

    /* renamed from: f */
    public final boolean f8671f;

    /* renamed from: g */
    public final boolean f8672g;

    /* renamed from: h */
    public final boolean f8673h;

    public ep8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f8666a = str;
        this.f8667b = str2;
        this.f8668c = str3;
        this.f8669d = codecCapabilities;
        this.f8672g = z;
        this.f8670e = z4;
        this.f8671f = z6;
        this.f8673h = ak3.m27382h(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ep8 m23310c(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null) {
            int i = it5.f13991a;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (i <= 22) {
                    String str4 = it5.f13994d;
                    if (!"ODROID-XU3".equals(str4)) {
                    }
                    if (!"OMX.Exynos.AVC.Decoder".equals(str)) {
                    }
                }
                z6 = true;
                return new ep8(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && it5.f13991a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && it5.f13991a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
            }
        }
        z6 = false;
        return new ep8(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities == null && it5.f13991a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback"), !z5 || (codecCapabilities != null && it5.f13991a >= 21 && codecCapabilities.isFeatureSupported("secure-playback")));
    }

    /* renamed from: h */
    public static Point m23305h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(it5.m19417O(i, widthAlignment) * widthAlignment, it5.m19417O(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: j */
    public static boolean m23303j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point m23305h = m23305h(videoCapabilities, i, i2);
        int i3 = m23305h.x;
        int i4 = m23305h.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: a */
    public final Point m23312a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8669d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m23305h(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public final tm7 m23311b(f92 f92Var, f92 f92Var2) {
        int i = true != it5.m19376t(f92Var.f9275l, f92Var2.f9275l) ? 8 : 0;
        if (this.f8673h) {
            if (f92Var.f9283t != f92Var2.f9283t) {
                i |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
            }
            if (!this.f8670e && (f92Var.f9280q != f92Var2.f9280q || f92Var.f9281r != f92Var2.f9281r)) {
                i |= 512;
            }
            if (!it5.m19376t(f92Var.f9287x, f92Var2.f9287x)) {
                i |= 2048;
            }
            String str = this.f8666a;
            if (it5.f13994d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !f92Var.m22828d(f92Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new tm7(this.f8666a, f92Var, f92Var2, true != f92Var.m22828d(f92Var2) ? 2 : 3, 0);
            }
        } else {
            if (f92Var.f9288y != f92Var2.f9288y) {
                i |= 4096;
            }
            if (f92Var.f9289z != f92Var2.f9289z) {
                i |= 8192;
            }
            if (f92Var.f9258A != f92Var2.f9258A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f8667b)) {
                Pair m20480b = hq8.m20480b(f92Var);
                Pair m20480b2 = hq8.m20480b(f92Var2);
                if (m20480b != null && m20480b2 != null) {
                    int intValue = ((Integer) m20480b.first).intValue();
                    int intValue2 = ((Integer) m20480b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new tm7(this.f8666a, f92Var, f92Var2, 3, 0);
                    }
                }
            }
            if (!f92Var.m22828d(f92Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f8667b)) {
                i |= 2;
            }
            if (i == 0) {
                return new tm7(this.f8666a, f92Var, f92Var2, 1, 0);
            }
        }
        return new tm7(this.f8666a, f92Var, f92Var2, 0, i);
    }

    /* renamed from: d */
    public final boolean m23309d(f92 f92Var) {
        String str;
        String str2;
        int i;
        Pair m20480b;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.f8667b.equals(f92Var.f9275l) || this.f8667b.equals(hq8.m20477e(f92Var))) {
            int i2 = 16;
            if (f92Var.f9272i != null && (m20480b = hq8.m20480b(f92Var)) != null) {
                int intValue = ((Integer) m20480b.first).intValue();
                int intValue2 = ((Integer) m20480b.second).intValue();
                int i3 = 8;
                if ("video/dolby-vision".equals(f92Var.f9275l)) {
                    if ("video/avc".equals(this.f8667b)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if ("video/hevc".equals(this.f8667b)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (!this.f8673h) {
                    if (intValue == 42) {
                        intValue = 42;
                    }
                }
                MediaCodecInfo.CodecProfileLevel[] m23306g = m23306g();
                if (it5.f13991a <= 23 && "video/x-vnd.on2.vp9".equals(this.f8667b) && m23306g.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8669d;
                    int intValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i3 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                    } else if (intValue3 >= 120000000) {
                        i3 = 512;
                    } else if (intValue3 >= 60000000) {
                        i3 = 256;
                    } else if (intValue3 >= 30000000) {
                        i3 = 128;
                    } else if (intValue3 >= 18000000) {
                        i3 = 64;
                    } else if (intValue3 >= 12000000) {
                        i3 = 32;
                    } else if (intValue3 >= 7200000) {
                        i3 = 16;
                    } else if (intValue3 < 3600000) {
                        i3 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    m23306g = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : m23306g) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.f8667b) && intValue == 2) {
                            String str3 = it5.f13992b;
                            if (!"sailfish".equals(str3) && !"marlin".equals(str3)) {
                            }
                        }
                    }
                }
                m23304i("codec.profileLevel, " + f92Var.f9272i + ", " + this.f8668c);
                return false;
            }
            if (this.f8673h) {
                int i4 = f92Var.f9280q;
                if (i4 <= 0 || (i = f92Var.f9281r) <= 0) {
                    return true;
                }
                if (it5.f13991a >= 21) {
                    return m23307f(i4, i, f92Var.f9282s);
                }
                boolean z = i4 * i <= hq8.m20481a();
                if (!z) {
                    m23304i("legacyFrameSize, " + f92Var.f9280q + "x" + f92Var.f9281r);
                }
                return z;
            }
            int i5 = it5.f13991a;
            if (i5 >= 21) {
                int i6 = f92Var.f9289z;
                if (i6 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f8669d;
                    if (codecCapabilities2 == null) {
                        str2 = "sampleRate.caps";
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities == null) {
                            str2 = "sampleRate.aCaps";
                        } else if (!audioCapabilities.isSampleRateSupported(i6)) {
                            str2 = "sampleRate.support, " + i6;
                        }
                    }
                    m23304i(str2);
                    return false;
                }
                int i7 = f92Var.f9288y;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.f8669d;
                    if (codecCapabilities3 == null) {
                        str = "channelCount.caps";
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            str = "channelCount.aCaps";
                        } else {
                            String str4 = this.f8666a;
                            String str5 = this.f8667b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                                if ("audio/ac3".equals(str5)) {
                                    i2 = 6;
                                } else if (!"audio/eac3".equals(str5)) {
                                    i2 = 30;
                                }
                                s95.m10493e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str4 + ", [" + maxInputChannelCount + " to " + i2 + "]");
                                maxInputChannelCount = i2;
                            }
                            if (maxInputChannelCount < i7) {
                                str = "channelCount.support, " + i7;
                            }
                        }
                    }
                    m23304i(str);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m23308e(f92 f92Var) {
        if (this.f8673h) {
            return this.f8670e;
        }
        Pair m20480b = hq8.m20480b(f92Var);
        return m20480b != null && ((Integer) m20480b.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean m23307f(int i, int i2, double d) {
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8669d;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (it5.f13991a >= 29) {
                    int m24096a = dp8.m24096a(videoCapabilities, i, i2, d);
                    if (m24096a == 2) {
                        return true;
                    }
                    if (m24096a == 1) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.cover, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    }
                }
                if (!m23303j(videoCapabilities, i, i2, d)) {
                    if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f8666a) && "mcv5a".equals(it5.f13992b)) || !m23303j(videoCapabilities, i2, i, d))) {
                        sb = new StringBuilder();
                        str = "sizeAndRate.support, ";
                        sb.append(str);
                        sb.append(i);
                        sb.append("x");
                        sb.append(i2);
                        sb.append("@");
                        sb.append(d);
                        sb2 = sb.toString();
                    } else {
                        String str2 = this.f8666a;
                        String str3 = this.f8667b;
                        String str4 = it5.f13995e;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("AssumedSupport [");
                        sb3.append("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d);
                        sb3.append("] [");
                        sb3.append(str2);
                        sb3.append(", ");
                        sb3.append(str3);
                        sb3.append("] [");
                        sb3.append(str4);
                        sb3.append("]");
                        s95.m10497a("MediaCodecInfo", sb3.toString());
                    }
                }
                return true;
            }
            sb2 = "sizeAndRate.vCaps";
        }
        m23304i(sb2);
        return false;
    }

    /* renamed from: g */
    public final MediaCodecInfo.CodecProfileLevel[] m23306g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8669d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: i */
    public final void m23304i(String str) {
        String str2 = this.f8666a;
        String str3 = this.f8667b;
        String str4 = it5.f13995e;
        s95.m10497a("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    public final String toString() {
        return this.f8666a;
    }
}
