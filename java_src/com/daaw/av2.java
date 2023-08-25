package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
@SuppressLint({"InlinedApi"})
@TargetApi(16)
/* loaded from: classes.dex */
public final class av2 {

    /* renamed from: d */
    public static final SparseIntArray f3677d;

    /* renamed from: e */
    public static final SparseIntArray f3678e;

    /* renamed from: f */
    public static final Map f3679f;

    /* renamed from: a */
    public static final ju2 f3674a = ju2.m18247b("OMX.google.raw.decoder");

    /* renamed from: b */
    public static final Pattern f3675b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    public static final HashMap f3676c = new HashMap();

    /* renamed from: g */
    public static int f3680g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3677d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f3678e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f3679f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", Integer.valueOf((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV));
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", Integer.valueOf((int) NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE));
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static int m26961a() {
        int i = f3680g;
        if (i == -1) {
            ju2 m26959c = m26959c("video/avc", false);
            if (m26959c != null) {
                int i2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m26959c.m18242g()) {
                    int i3 = codecProfileLevel.level;
                    int i4 = 9437184;
                    if (i3 == 1 || i3 == 2) {
                        i4 = 25344;
                    } else {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                continue;
                            case 64:
                                i4 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i4 = 414720;
                                continue;
                            case 512:
                                i4 = 921600;
                                continue;
                            case NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV /* 1024 */:
                                i4 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                continue;
                            case 8192:
                                i4 = 2228224;
                                continue;
                            case 16384:
                                i4 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                continue;
                        }
                    }
                    i2 = Math.max(i4, i2);
                }
                i = Math.max(i2, pz2.f23547a >= 21 ? 345600 : 172800);
            } else {
                i = 0;
            }
            f3680g = i;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static Pair m26960b(String str) {
        char c;
        String valueOf;
        String str2;
        Integer valueOf2;
        int parseInt;
        String[] split = str.split("\\.");
        String str3 = split[0];
        int i = 2;
        switch (str3.hashCode()) {
            case 3006243:
                if (str3.equals("avc1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str3.equals("avc2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str3.equals("hev1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str3.equals("hvc1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0 && c != 1) {
            if (c == 2 || c == 3) {
                int length = split.length;
                if (length >= 2) {
                    try {
                        if (split[1].length() == 6) {
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[1].substring(0, 2), 16));
                            parseInt = Integer.parseInt(split[1].substring(4), 16);
                        } else if (length < 3) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring malformed AVC codec string: ");
                            sb.append(str);
                            return null;
                        } else {
                            valueOf2 = Integer.valueOf(Integer.parseInt(split[1]));
                            parseInt = Integer.parseInt(split[2]);
                        }
                        return new Pair(Integer.valueOf(f3677d.get(valueOf2.intValue())), Integer.valueOf(f3678e.get(Integer.valueOf(parseInt).intValue())));
                    } catch (NumberFormatException unused) {
                    }
                }
                "Ignoring malformed AVC codec string: ".concat(str);
                return null;
            }
            return null;
        }
        if (split.length >= 4) {
            Matcher matcher = f3675b.matcher(split[1]);
            if (matcher.matches()) {
                String group = matcher.group(1);
                if ("1".equals(group)) {
                    i = 1;
                } else if (!"2".equals(group)) {
                    valueOf = String.valueOf(group);
                    str2 = "Unknown HEVC profile string: ";
                    str2.concat(valueOf);
                    return null;
                }
                Integer num = (Integer) f3679f.get(split[3]);
                if (num == null) {
                    valueOf = String.valueOf(matcher.group(1));
                    str2 = "Unknown HEVC level string: ";
                    str2.concat(valueOf);
                    return null;
                }
                return new Pair(Integer.valueOf(i), num);
            }
        }
        "Ignoring malformed HEVC codec string: ".concat(str);
        return null;
    }

    /* renamed from: c */
    public static ju2 m26959c(String str, boolean z) {
        List m26958d = m26958d(str, z);
        if (m26958d.isEmpty()) {
            return null;
        }
        return (ju2) m26958d.get(0);
    }

    /* renamed from: d */
    public static synchronized List m26958d(String str, boolean z) {
        synchronized (av2.class) {
            tu2 tu2Var = new tu2(str, z);
            HashMap hashMap = f3676c;
            List list = (List) hashMap.get(tu2Var);
            if (list != null) {
                return list;
            }
            int i = pz2.f23547a;
            List m26957e = m26957e(tu2Var, i >= 21 ? new zu2(z) : new yu2(null));
            if (z && m26957e.isEmpty() && i >= 21 && i <= 23) {
                m26957e = m26957e(tu2Var, new yu2(null));
                if (!m26957e.isEmpty()) {
                    String str2 = ((ju2) m26957e.get(0)).f15415a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(m26957e);
            hashMap.put(tu2Var, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #1 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:151:0x0195 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m26957e(tu2 tu2Var, wu2 wu2Var) {
        int i;
        int i2;
        MediaCodecInfo mediaCodecInfo;
        boolean z;
        wu2 wu2Var2 = wu2Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str = tu2Var.f28070a;
            int zza = wu2Var.zza();
            boolean zzd = wu2Var.zzd();
            int i3 = 0;
            while (i3 < zza) {
                MediaCodecInfo zzb = wu2Var2.zzb(i3);
                String name = zzb.getName();
                if (!zzb.isEncoder() && ((zzd || !name.endsWith(".secure")) && (((i = pz2.f23547a) >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((i >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && (i >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(pz2.f23548b)))))) {
                    if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(name)) {
                        String str2 = pz2.f23548b;
                        if ("dlxu".equals(str2)) {
                            continue;
                        } else if ("protou".equals(str2)) {
                            continue;
                        } else if ("ville".equals(str2)) {
                            continue;
                        } else if ("villeplus".equals(str2)) {
                            continue;
                        } else if ("villec2".equals(str2)) {
                            continue;
                        } else if (str2.startsWith("gee")) {
                            continue;
                        } else if ("C6602".equals(str2)) {
                            continue;
                        } else if ("C6603".equals(str2)) {
                            continue;
                        } else if ("C6606".equals(str2)) {
                            continue;
                        } else if ("C6616".equals(str2)) {
                            continue;
                        } else if ("L36h".equals(str2)) {
                            continue;
                        } else if ("SO-02E".equals(str2)) {
                            continue;
                        }
                    }
                    if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(name)) {
                        String str3 = pz2.f23548b;
                        if ("C1504".equals(str3)) {
                            continue;
                        } else if ("C1505".equals(str3)) {
                            continue;
                        } else if ("C1604".equals(str3)) {
                            continue;
                        } else if ("C1605".equals(str3)) {
                            continue;
                        }
                    }
                    if (i <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(pz2.f23549c)) {
                        String str4 = pz2.f23548b;
                        if (str4.startsWith("d2")) {
                            continue;
                        } else if (str4.startsWith("serrano")) {
                            continue;
                        } else if (str4.startsWith("jflte")) {
                            continue;
                        } else if (str4.startsWith("santos")) {
                            continue;
                        } else if (str4.startsWith("t0")) {
                            continue;
                        }
                    }
                    if (i > 19 || !pz2.f23548b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) {
                        String[] supportedTypes = zzb.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i4 = 0;
                        while (i4 < length) {
                            String str5 = supportedTypes[i4];
                            if (str5.equalsIgnoreCase(str)) {
                                try {
                                    MediaCodecInfo.CodecCapabilities capabilitiesForType = zzb.getCapabilitiesForType(str5);
                                    boolean mo1871a = wu2Var2.mo1871a(str, capabilitiesForType);
                                    i2 = zza;
                                    mediaCodecInfo = zzb;
                                    if (pz2.f23547a <= 22) {
                                        try {
                                            String str6 = pz2.f23550d;
                                            if ((str6.equals("ODROID-XU3") || str6.equals("Nexus 10")) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                                z = true;
                                                try {
                                                    if (zzd) {
                                                        if (tu2Var.f28071b == mo1871a) {
                                                        }
                                                        arrayList.add(ju2.m18248a(name, str, capabilitiesForType, z, false));
                                                    }
                                                    arrayList.add(ju2.m18248a(name, str, capabilitiesForType, z, false));
                                                } catch (Exception e) {
                                                    e = e;
                                                    if (pz2.f23547a <= 23) {
                                                    }
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append("Failed to query codec ");
                                                    sb.append(name);
                                                    sb.append(" (");
                                                    sb.append(str5);
                                                    sb.append(")");
                                                    throw e;
                                                }
                                                if (!zzd || tu2Var.f28071b) {
                                                    if (!zzd && mo1871a) {
                                                        arrayList.add(ju2.m18248a(name + ".secure", str, capabilitiesForType, z, true));
                                                        return arrayList;
                                                    }
                                                }
                                            }
                                        } catch (Exception e2) {
                                            e = e2;
                                            if (pz2.f23547a <= 23 || arrayList.isEmpty()) {
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("Failed to query codec ");
                                                sb2.append(name);
                                                sb2.append(" (");
                                                sb2.append(str5);
                                                sb2.append(")");
                                                throw e;
                                            }
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("Skipping codec ");
                                            sb3.append(name);
                                            sb3.append(" (failed to query capabilities)");
                                            i4++;
                                            wu2Var2 = wu2Var;
                                            zza = i2;
                                            zzb = mediaCodecInfo;
                                        }
                                    }
                                    z = false;
                                    if (zzd) {
                                    }
                                    if (!zzd) {
                                    }
                                    if (!zzd) {
                                        arrayList.add(ju2.m18248a(name + ".secure", str, capabilitiesForType, z, true));
                                        return arrayList;
                                    }
                                    continue;
                                } catch (Exception e3) {
                                    e = e3;
                                    i2 = zza;
                                    mediaCodecInfo = zzb;
                                }
                            } else {
                                i2 = zza;
                                mediaCodecInfo = zzb;
                            }
                            i4++;
                            wu2Var2 = wu2Var;
                            zza = i2;
                            zzb = mediaCodecInfo;
                        }
                        continue;
                    }
                }
                i3++;
                wu2Var2 = wu2Var;
                zza = zza;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new vu2(e4, null);
        }
    }
}
