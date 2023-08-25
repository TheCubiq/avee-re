package com.daaw;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ep8 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public ep8(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z4;
        this.f = z6;
        this.h = ak3.h(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.ep8 c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.daaw.ep8 r11 = new com.daaw.ep8
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            int r3 = com.daaw.it5.a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3b
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = com.daaw.it5.d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = 1
            goto L3c
        L3b:
            r8 = 0
        L3c:
            r3 = 21
            if (r4 == 0) goto L4e
            int r5 = com.daaw.it5.a
            if (r5 < r3) goto L4e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L4e
            r9 = 1
            goto L4f
        L4e:
            r9 = 0
        L4f:
            if (r20 != 0) goto L62
            if (r4 == 0) goto L60
            int r5 = com.daaw.it5.a
            if (r5 < r3) goto L60
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L60
            goto L62
        L60:
            r10 = 0
            goto L63
        L62:
            r10 = 1
        L63:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ep8.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.daaw.ep8");
    }

    public static Point h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(it5.O(i, widthAlignment) * widthAlignment, it5.O(i2, heightAlignment) * heightAlignment);
    }

    public static boolean j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return h(videoCapabilities, i, i2);
    }

    public final tm7 b(f92 f92Var, f92 f92Var2) {
        int i = true != it5.t(f92Var.l, f92Var2.l) ? 8 : 0;
        if (this.h) {
            if (f92Var.t != f92Var2.t) {
                i |= NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
            }
            if (!this.e && (f92Var.q != f92Var2.q || f92Var.r != f92Var2.r)) {
                i |= 512;
            }
            if (!it5.t(f92Var.x, f92Var2.x)) {
                i |= 2048;
            }
            String str = this.a;
            if (it5.d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !f92Var.d(f92Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new tm7(this.a, f92Var, f92Var2, true != f92Var.d(f92Var2) ? 2 : 3, 0);
            }
        } else {
            if (f92Var.y != f92Var2.y) {
                i |= 4096;
            }
            if (f92Var.z != f92Var2.z) {
                i |= 8192;
            }
            if (f92Var.A != f92Var2.A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair b = hq8.b(f92Var);
                Pair b2 = hq8.b(f92Var2);
                if (b != null && b2 != null) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new tm7(this.a, f92Var, f92Var2, 3, 0);
                    }
                }
            }
            if (!f92Var.d(f92Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new tm7(this.a, f92Var, f92Var2, 1, 0);
            }
        }
        return new tm7(this.a, f92Var, f92Var2, 0, i);
    }

    public final boolean d(f92 f92Var) {
        String str;
        String str2;
        int i;
        Pair b;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (this.b.equals(f92Var.l) || this.b.equals(hq8.e(f92Var))) {
            int i2 = 16;
            if (f92Var.i != null && (b = hq8.b(f92Var)) != null) {
                int intValue = ((Integer) b.first).intValue();
                int intValue2 = ((Integer) b.second).intValue();
                int i3 = 8;
                if ("video/dolby-vision".equals(f92Var.l)) {
                    if ("video/avc".equals(this.b)) {
                        intValue2 = 0;
                        intValue = 8;
                    } else if ("video/hevc".equals(this.b)) {
                        intValue2 = 0;
                        intValue = 2;
                    }
                }
                if (!this.h) {
                    if (intValue == 42) {
                        intValue = 42;
                    }
                }
                MediaCodecInfo.CodecProfileLevel[] g = g();
                if (it5.a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && g.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
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
                    g = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : g) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.b) && intValue == 2) {
                            String str3 = it5.b;
                            if (!"sailfish".equals(str3) && !"marlin".equals(str3)) {
                            }
                        }
                    }
                }
                i("codec.profileLevel, " + f92Var.i + ", " + this.c);
                return false;
            }
            if (this.h) {
                int i4 = f92Var.q;
                if (i4 <= 0 || (i = f92Var.r) <= 0) {
                    return true;
                }
                if (it5.a >= 21) {
                    return f(i4, i, f92Var.s);
                }
                boolean z = i4 * i <= hq8.a();
                if (!z) {
                    i("legacyFrameSize, " + f92Var.q + "x" + f92Var.r);
                }
                return z;
            }
            int i5 = it5.a;
            if (i5 >= 21) {
                int i6 = f92Var.z;
                if (i6 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
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
                    i(str2);
                    return false;
                }
                int i7 = f92Var.y;
                if (i7 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
                    if (codecCapabilities3 == null) {
                        str = "channelCount.caps";
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities3.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            str = "channelCount.aCaps";
                        } else {
                            String str4 = this.a;
                            String str5 = this.b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                                if ("audio/ac3".equals(str5)) {
                                    i2 = 6;
                                } else if (!"audio/eac3".equals(str5)) {
                                    i2 = 30;
                                }
                                s95.e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str4 + ", [" + maxInputChannelCount + " to " + i2 + "]");
                                maxInputChannelCount = i2;
                            }
                            if (maxInputChannelCount < i7) {
                                str = "channelCount.support, " + i7;
                            }
                        }
                    }
                    i(str);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean e(f92 f92Var) {
        if (this.h) {
            return this.e;
        }
        Pair b = hq8.b(f92Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final boolean f(int i, int i2, double d) {
        StringBuilder sb;
        String str;
        String sb2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            sb2 = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities != null) {
                if (it5.a >= 29) {
                    int a = dp8.a(videoCapabilities, i, i2, d);
                    if (a == 2) {
                        return true;
                    }
                    if (a == 1) {
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
                if (!j(videoCapabilities, i, i2, d)) {
                    if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.a) && "mcv5a".equals(it5.b)) || !j(videoCapabilities, i2, i, d))) {
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
                        String str2 = this.a;
                        String str3 = this.b;
                        String str4 = it5.e;
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
                        s95.a("MediaCodecInfo", sb3.toString());
                    }
                }
                return true;
            }
            sb2 = "sizeAndRate.vCaps";
        }
        i(sb2);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final void i(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = it5.e;
        s95.a("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    public final String toString() {
        return this.a;
    }
}
