package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;
@TargetApi(16)
/* loaded from: classes.dex */
public final class ju2 {

    /* renamed from: a */
    public final String f15415a;

    /* renamed from: b */
    public final boolean f15416b;

    /* renamed from: c */
    public final boolean f15417c;

    /* renamed from: d */
    public final boolean f15418d;

    /* renamed from: e */
    public final String f15419e;

    /* renamed from: f */
    public final MediaCodecInfo.CodecCapabilities f15420f;

    public ju2(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f15415a = str;
        this.f15419e = str2;
        this.f15420f = codecCapabilities;
        boolean z3 = true;
        this.f15416b = !z && codecCapabilities != null && pz2.f23547a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f15417c = codecCapabilities != null && pz2.f23547a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || pz2.f23547a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f15418d = z3;
    }

    /* renamed from: a */
    public static ju2 m18248a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new ju2(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: b */
    public static ju2 m18247b(String str) {
        return new ju2("OMX.google.raw.decoder", null, null, false, false);
    }

    @TargetApi(21)
    /* renamed from: i */
    public static boolean m18240i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        return (d == -1.0d || d <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    @TargetApi(21)
    /* renamed from: c */
    public final boolean m18246c(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15420f;
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
        m18241h(str);
        return false;
    }

    @TargetApi(21)
    /* renamed from: d */
    public final boolean m18245d(int i) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15420f;
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
        m18241h(str);
        return false;
    }

    /* renamed from: e */
    public final boolean m18244e(String str) {
        MediaCodecInfo.CodecProfileLevel[] m18242g;
        StringBuilder sb;
        String str2;
        if (str == null || this.f15419e == null) {
            return true;
        }
        String trim = str.trim();
        String str3 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str3 == null) {
            return true;
        }
        if (this.f15419e.equals(str3)) {
            Pair m26960b = av2.m26960b(str);
            if (m26960b == null) {
                return true;
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m18242g()) {
                if (codecProfileLevel.profile == ((Integer) m26960b.first).intValue() && codecProfileLevel.level >= ((Integer) m26960b.second).intValue()) {
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
        m18241h(sb.toString());
        return false;
    }

    @TargetApi(21)
    /* renamed from: f */
    public final boolean m18243f(int i, int i2, double d) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15420f;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else if (m18240i(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i < i2 && m18240i(videoCapabilities, i2, i, d)) {
                    String str2 = this.f15415a;
                    String str3 = this.f15419e;
                    String str4 = pz2.f23551e;
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
        m18241h(str);
        return false;
    }

    /* renamed from: g */
    public final MediaCodecInfo.CodecProfileLevel[] m18242g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15420f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* renamed from: h */
    public final void m18241h(String str) {
        String str2 = this.f15415a;
        String str3 = this.f15419e;
        String str4 = pz2.f23551e;
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
