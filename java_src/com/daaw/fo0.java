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
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final Map<String, Integer> f;
    public static final co0 a = co0.r("OMX.google.raw.decoder");
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap<b, List<co0>> c = new HashMap<>();
    public static int g = -1;

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final boolean b;

        public b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != b.class) {
                return false;
            }
            b bVar = (b) obj;
            return TextUtils.equals(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Exception {
        public c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        MediaCodecInfo a(int i);

        boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int c();

        boolean d();
    }

    /* loaded from: classes.dex */
    public static final class e implements d {
        public e() {
        }

        @Override // com.daaw.fo0.d
        public MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.daaw.fo0.d
        public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        @Override // com.daaw.fo0.d
        public int c() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.daaw.fo0.d
        public boolean d() {
            return false;
        }
    }

    @TargetApi(21)
    /* loaded from: classes.dex */
    public static final class f implements d {
        public final int a;
        public MediaCodecInfo[] b;

        public f(boolean z) {
            this.a = z ? 1 : 0;
        }

        @Override // com.daaw.fo0.d
        public MediaCodecInfo a(int i) {
            e();
            return this.b[i];
        }

        @Override // com.daaw.fo0.d
        public boolean b(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.daaw.fo0.d
        public int c() {
            e();
            return this.b.length;
        }

        @Override // com.daaw.fo0.d
        public boolean d() {
            return true;
        }

        public final void e() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.a).getCodecInfos();
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
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
        f = hashMap;
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

    public static void a(List<co0> list) {
        if (sq1.a < 26) {
            if (list.size() <= 1 || !"OMX.MTK.AUDIO.DECODER.RAW".equals(list.get(0).a)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                co0 co0Var = list.get(i);
                if ("OMX.google.raw.decoder".equals(co0Var.a)) {
                    list.remove(i);
                    list.add(0, co0Var);
                    return;
                }
            }
        }
    }

    public static int b(int i) {
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

    public static boolean c(String str) {
        if (sq1.a <= 22) {
            String str2 = sq1.d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    public static Pair<Integer, Integer> d(String str, String[] strArr) {
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
            int i = d.get(num.intValue(), -1);
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown AVC profile: ");
                sb3.append(num);
                return null;
            }
            int i2 = e.get(valueOf.intValue(), -1);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> e(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r6.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3006243: goto L3b;
                case 3006244: goto L30;
                case 3199032: goto L25;
                case 3214780: goto L1a;
                default: goto L18;
            }
        L18:
            r2 = -1
            goto L44
        L1a:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L23
            goto L18
        L23:
            r2 = 3
            goto L44
        L25:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L2e
            goto L18
        L2e:
            r2 = 2
            goto L44
        L30:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L39
            goto L18
        L39:
            r2 = 1
            goto L44
        L3b:
            java.lang.String r5 = "avc1"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L44
            goto L18
        L44:
            switch(r2) {
                case 0: goto L4d;
                case 1: goto L4d;
                case 2: goto L48;
                case 3: goto L48;
                default: goto L47;
            }
        L47:
            return r0
        L48:
            android.util.Pair r6 = i(r6, r1)
            return r6
        L4d:
            android.util.Pair r6 = d(r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.fo0.e(java.lang.String):android.util.Pair");
    }

    public static co0 f(String str, boolean z) {
        List<co0> g2 = g(str, z);
        if (g2.isEmpty()) {
            return null;
        }
        return g2.get(0);
    }

    public static synchronized List<co0> g(String str, boolean z) {
        synchronized (fo0.class) {
            b bVar = new b(str, z);
            HashMap<b, List<co0>> hashMap = c;
            List<co0> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = sq1.a;
            d fVar = i >= 21 ? new f(z) : new e();
            ArrayList<co0> h = h(bVar, fVar, str);
            if (z && h.isEmpty() && 21 <= i && i <= 23) {
                fVar = new e();
                h = h(bVar, fVar, str);
                if (!h.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(h.get(0).a);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                h.addAll(h(new b("audio/eac3", bVar.b), fVar, str));
            }
            a(h);
            List<co0> unmodifiableList = Collections.unmodifiableList(h);
            hashMap.put(bVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static ArrayList<co0> h(b bVar, d dVar, String str) {
        int i;
        d dVar2 = dVar;
        try {
            ArrayList<co0> arrayList = new ArrayList<>();
            String str2 = bVar.a;
            int c2 = dVar.c();
            boolean d2 = dVar.d();
            int i2 = 0;
            while (i2 < c2) {
                MediaCodecInfo a2 = dVar2.a(i2);
                String name = a2.getName();
                if (k(a2, name, d2, str)) {
                    String[] supportedTypes = a2.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i3 = 0;
                    while (i3 < length) {
                        String str3 = supportedTypes[i3];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = a2.getCapabilitiesForType(str3);
                                boolean b2 = dVar2.b(str2, capabilitiesForType);
                                boolean c3 = c(name);
                                if (d2) {
                                    i = c2;
                                    try {
                                        if (bVar.b != b2) {
                                        }
                                        arrayList.add(co0.q(name, str2, capabilitiesForType, c3, false));
                                    } catch (Exception e2) {
                                        e = e2;
                                        if (sq1.a > 23 || arrayList.isEmpty()) {
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
                                        dVar2 = dVar;
                                        c2 = i;
                                    }
                                } else {
                                    i = c2;
                                }
                                if (!d2 && !bVar.b) {
                                    arrayList.add(co0.q(name, str2, capabilitiesForType, c3, false));
                                } else if (!d2 && b2) {
                                    arrayList.add(co0.q(name + ".secure", str2, capabilitiesForType, c3, true));
                                    return arrayList;
                                }
                            } catch (Exception e3) {
                                e = e3;
                                i = c2;
                            }
                        } else {
                            i = c2;
                        }
                        i3++;
                        dVar2 = dVar;
                        c2 = i;
                    }
                    continue;
                }
                i2++;
                dVar2 = dVar;
                c2 = c2;
            }
            return arrayList;
        } catch (Exception e4) {
            throw new c(e4);
        }
    }

    public static Pair<Integer, Integer> i(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring malformed HEVC codec string: ");
            sb.append(str);
            return null;
        }
        Matcher matcher = b.matcher(strArr[1]);
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
        Integer num = f.get(strArr[3]);
        if (num == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown HEVC level string: ");
            sb4.append(matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i), num);
    }

    public static co0 j() {
        return a;
    }

    public static boolean k(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = sq1.a;
        if (i >= 21 || !("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            if (i >= 18 || !"OMX.SEC.MP3.Decoder".equals(str)) {
                if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
                    String str3 = sq1.b;
                    if ("a70".equals(str3) || ("Xiaomi".equals(sq1.c) && str3.startsWith("HM"))) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
                    String str4 = sq1.b;
                    if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                        return false;
                    }
                }
                if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
                    String str5 = sq1.b;
                    if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                        return false;
                    }
                }
                if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(sq1.c))) {
                    String str6 = sq1.b;
                    if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                        return false;
                    }
                }
                if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(sq1.c)) {
                    String str7 = sq1.b;
                    if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                        return false;
                    }
                }
                if (i <= 19 && sq1.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
                    return false;
                }
                return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
            }
            return false;
        }
        return false;
    }

    public static int l() {
        if (g == -1) {
            int i = 0;
            co0 f2 = f("video/avc", false);
            if (f2 != null) {
                MediaCodecInfo.CodecProfileLevel[] d2 = f2.d();
                int length = d2.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(b(d2[i].level), i2);
                    i++;
                }
                i = Math.max(i2, sq1.a >= 21 ? 345600 : 172800);
            }
            g = i;
        }
        return g;
    }
}
