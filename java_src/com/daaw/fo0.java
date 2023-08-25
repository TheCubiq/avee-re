package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
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
public final class fo0 {

    /* renamed from: d */
    public static final SparseIntArray f9717d;

    /* renamed from: e */
    public static final SparseIntArray f9718e;

    /* renamed from: f */
    public static final Map<String, Integer> f9719f;

    /* renamed from: a */
    public static final co0 f9714a = co0.m25173r("OMX.google.raw.decoder");

    /* renamed from: b */
    public static final Pattern f9715b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    public static final HashMap<C1311b, List<co0>> f9716c = new HashMap<>();

    /* renamed from: g */
    public static int f9720g = -1;

    /* renamed from: com.daaw.fo0$b */
    /* loaded from: classes.dex */
    public static final class C1311b {

        /* renamed from: a */
        public final String f9721a;

        /* renamed from: b */
        public final boolean f9722b;

        public C1311b(String str, boolean z) {
            this.f9721a = str;
            this.f9722b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C1311b.class) {
                return false;
            }
            C1311b c1311b = (C1311b) obj;
            return TextUtils.equals(this.f9721a, c1311b.f9721a) && this.f9722b == c1311b.f9722b;
        }

        public int hashCode() {
            String str = this.f9721a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f9722b ? 1231 : 1237);
        }
    }

    /* renamed from: com.daaw.fo0$c */
    /* loaded from: classes.dex */
    public static class C1312c extends Exception {
        public C1312c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: com.daaw.fo0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1313d {
        /* renamed from: a */
        MediaCodecInfo mo22462a(int i);

        /* renamed from: b */
        boolean mo22461b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        int mo22460c();

        /* renamed from: d */
        boolean mo22459d();
    }

    /* renamed from: com.daaw.fo0$e */
    /* loaded from: classes.dex */
    public static final class C1314e implements InterfaceC1313d {
        public C1314e() {
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: a */
        public MediaCodecInfo mo22462a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: b */
        public boolean mo22461b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: c */
        public int mo22460c() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: d */
        public boolean mo22459d() {
            return false;
        }
    }

    @TargetApi(21)
    /* renamed from: com.daaw.fo0$f */
    /* loaded from: classes.dex */
    public static final class C1315f implements InterfaceC1313d {

        /* renamed from: a */
        public final int f9723a;

        /* renamed from: b */
        public MediaCodecInfo[] f9724b;

        public C1315f(boolean z) {
            this.f9723a = z ? 1 : 0;
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: a */
        public MediaCodecInfo mo22462a(int i) {
            m22458e();
            return this.f9724b[i];
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: b */
        public boolean mo22461b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: c */
        public int mo22460c() {
            m22458e();
            return this.f9724b.length;
        }

        @Override // com.daaw.fo0.InterfaceC1313d
        /* renamed from: d */
        public boolean mo22459d() {
            return true;
        }

        /* renamed from: e */
        public final void m22458e() {
            if (this.f9724b == null) {
                this.f9724b = new MediaCodecList(this.f9723a).getCodecInfos();
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9717d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9718e = sparseIntArray2;
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
        f9719f = hashMap;
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
    public static void m22474a(List<co0> list) {
        if (sq1.f26525a < 26) {
            if (list.size() <= 1 || !"OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).f5990a)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                co0 co0Var = list.get(i);
                if ("OMX.google.raw.decoder".equals(co0Var.f5990a)) {
                    list.remove(i);
                    list.add(0, co0Var);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static int m22473b(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV /* 1024 */:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    /* renamed from: c */
    public static boolean m22472c(String str) {
        if (sq1.f26525a <= 22) {
            String str2 = sq1.f26528d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Pair<Integer, Integer> m22471d(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed AVC codec string: ");
            sb.append(str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length < 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignoring malformed AVC codec string: ");
                sb2.append(str);
                return null;
            } else {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            }
            int i = f9717d.get(num.intValue(), -1);
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(num);
                return null;
            }
            int i2 = f9718e.get(valueOf.intValue(), -1);
            if (i2 == -1) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unknown AVC level: ");
                sb4.append(valueOf);
                return null;
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        } catch (NumberFormatException unused) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Ignoring malformed AVC codec string: ");
            sb5.append(str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r3.equals("avc1") == false) goto L7;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> m22470e(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        char c = 0;
        String str2 = split[0];
        str2.hashCode();
        switch (str2.hashCode()) {
            case 3006243:
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return m22471d(str, split);
            case 2:
            case 3:
                return m22466i(str, split);
            default:
                return null;
        }
    }

    /* renamed from: f */
    public static co0 m22469f(String str, boolean z) {
        List<co0> m22468g = m22468g(str, z);
        if (m22468g.isEmpty()) {
            return null;
        }
        return m22468g.get(0);
    }

    /* renamed from: g */
    public static synchronized List<co0> m22468g(String str, boolean z) {
        synchronized (fo0.class) {
            C1311b c1311b = new C1311b(str, z);
            HashMap<C1311b, List<co0>> hashMap = f9716c;
            List<co0> list = hashMap.get(c1311b);
            if (list != null) {
                return list;
            }
            int i = sq1.f26525a;
            InterfaceC1313d c1315f = i >= 21 ? new C1315f(z) : new C1314e();
            ArrayList<co0> m22467h = m22467h(c1311b, c1315f, str);
            if (z && m22467h.isEmpty() && 21 <= i && i <= 23) {
                c1315f = new C1314e();
                m22467h = m22467h(c1311b, c1315f, str);
                if (!m22467h.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(m22467h.get(0).f5990a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                m22467h.addAll(m22467h(new C1311b("audio/eac3", c1311b.f9722b), c1315f, str));
            }
            m22474a(m22467h);
            List<co0> unmodifiableList = Collections.unmodifiableList(m22467h);
            hashMap.put(c1311b, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* renamed from: h */
    public static ArrayList<co0> m22467h(C1311b c1311b, InterfaceC1313d interfaceC1313d, String str) {
        int i;
        InterfaceC1313d interfaceC1313d2 = interfaceC1313d;
        try {
            ArrayList<co0> arrayList = new ArrayList<>();
            String str2 = c1311b.f9721a;
            int mo22460c = interfaceC1313d.mo22460c();
            boolean mo22459d = interfaceC1313d.mo22459d();
            int i2 = 0;
            while (i2 < mo22460c) {
                MediaCodecInfo mo22462a = interfaceC1313d2.mo22462a(i2);
                String name = mo22462a.getName();
                if (m22464k(mo22462a, name, mo22459d, str)) {
                    String[] supportedTypes = mo22462a.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str3 = supportedTypes[i3];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mo22462a.getCapabilitiesForType(str3);
                                boolean mo22461b = interfaceC1313d2.mo22461b(str2, capabilitiesForType);
                                boolean m22472c = m22472c(name);
                                if (mo22459d) {
                                    i = mo22460c;
                                    try {
                                        if (c1311b.f9722b != mo22461b) {
                                        }
                                        arrayList.add(co0.m25174q(name, str2, capabilitiesForType, m22472c, false));
                                    } catch (Exception e) {
                                        e = e;
                                        if (sq1.f26525a > 23 || arrayList.isEmpty()) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Failed to query codec ");
                                            sb.append(name);
                                            sb.append(" (");
                                            sb.append(str3);
                                            sb.append(")");
                                            throw e;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Skipping codec ");
                                        sb2.append(name);
                                        sb2.append(" (failed to query capabilities)");
                                        i3++;
                                        interfaceC1313d2 = interfaceC1313d;
                                        mo22460c = i;
                                    }
                                } else {
                                    i = mo22460c;
                                }
                                if (!mo22459d && !c1311b.f9722b) {
                                    arrayList.add(co0.m25174q(name, str2, capabilitiesForType, m22472c, false));
                                } else if (!mo22459d && mo22461b) {
                                    arrayList.add(co0.m25174q(name + ".secure", str2, capabilitiesForType, m22472c, true));
                                    return arrayList;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                i = mo22460c;
                            }
                        } else {
                            i = mo22460c;
                        }
                        i3++;
                        interfaceC1313d2 = interfaceC1313d;
                        mo22460c = i;
                    }
                    continue;
                }
                i2++;
                interfaceC1313d2 = interfaceC1313d;
                mo22460c = mo22460c;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new C1312c(e3);
        }
    }

    /* renamed from: i */
    public static Pair<Integer, Integer> m22466i(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed HEVC codec string: ");
            sb.append(str);
            return null;
        }
        Matcher matcher = f9715b.matcher(strArr[1]);
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring malformed HEVC codec string: ");
            sb2.append(str);
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i = 1;
        } else if (!"2".equals(group)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown HEVC profile string: ");
            sb3.append(group);
            return null;
        } else {
            i = 2;
        }
        Integer num = f9719f.get(strArr[3]);
        if (num == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown HEVC level string: ");
            sb4.append(matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), num);
    }

    /* renamed from: j */
    public static co0 m22465j() {
        return f9714a;
    }

    /* renamed from: k */
    public static boolean m22464k(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = sq1.f26525a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i >= 18 || !"OMX.SEC.MP3.Decoder".equals(str)) {
                if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                    String str3 = sq1.f26526b;
                    if ("a70".equals(str3) || ("Xiaomi".equals(sq1.f26527c) && str3.startsWith("HM"))) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str4 = sq1.f26526b;
                    if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str5 = sq1.f26526b;
                    if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                        return false;
                    }
                }
                if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(sq1.f26527c))) {
                    String str6 = sq1.f26526b;
                    if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                        return false;
                    }
                }
                if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(sq1.f26527c)) {
                    String str7 = sq1.f26526b;
                    if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                        return false;
                    }
                }
                if (i <= 19 && sq1.f26526b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                    return false;
                }
                return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: l */
    public static int m22463l() {
        if (f9720g == -1) {
            int i = 0;
            co0 m22469f = m22469f("video/avc", false);
            if (m22469f != null) {
                MediaCodecInfo.CodecProfileLevel[] m25187d = m22469f.m25187d();
                int length = m25187d.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m22473b(m25187d[i].level), i2);
                    i++;
                }
                i = Math.max(i2, sq1.f26525a >= 21 ? 345600 : 172800);
            }
            f9720g = i;
        }
        return f9720g;
    }
}
