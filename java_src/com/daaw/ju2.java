package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;
@TargetApi(16)
/* loaded from: classes.dex */
public final class ju2 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final MediaCodecInfo.CodecCapabilities f;

    public ju2(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.a = str;
        this.e = str2;
        this.f = codecCapabilities;
        boolean z3 = true;
        this.b = !z && codecCapabilities != null && pz2.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.c = codecCapabilities != null && pz2.a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || pz2.a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.d = z3;
    }

    public static ju2 a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new ju2(str, str2, codecCapabilities, z, z2);
    }

    public static ju2 b(String str) {
        return new ju2("OMX.google.raw.decoder", null, null, false, false);
    }

    @TargetApi(21)
    public static boolean i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    public final boolean c(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "channelCount.caps";
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                str = "channelCount.aCaps";
            } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
                return true;
            } else {
                str = "channelCount.support, " + i;
            }
        }
        h(str);
        return false;
    }

    @TargetApi(21)
    public final boolean d(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
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
        h(str);
        return false;
    }

    public final boolean e(String str) {
        MediaCodecInfo.CodecProfileLevel[] g;
        StringBuilder sb;
        String str2;
        if (str == null || this.e == null) {
            return true;
        }
        String trim = str.trim();
        String str3 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str3 == null) {
            return true;
        }
        if (this.e.equals(str3)) {
            Pair b = av2.b(str);
            if (b == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g()) {
                if (codecProfileLevel.profile == ((Integer) b.first).intValue() && codecProfileLevel.level >= ((Integer) b.second).intValue()) {
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
        sb.append(str3);
        h(sb.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean f(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (i(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i < i2 && i(videoCapabilities, i2, i, d)) {
                    String str2 = this.a;
                    String str3 = this.e;
                    String str4 = pz2.e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("AssumedSupport [");
                    sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append(", ");
                    sb.append(str3);
                    sb.append("] [");
                    sb.append(str4);
                    sb.append("]");
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d;
            }
        }
        h(str);
        return false;
    }

    public final MediaCodecInfo.CodecProfileLevel[] g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final void h(String str) {
        String str2 = this.a;
        String str3 = this.e;
        String str4 = pz2.e;
        StringBuilder sb = new StringBuilder();
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
    }
}
