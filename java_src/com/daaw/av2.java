package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Pair;
import android.util.SparseIntArray;
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
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final Map f;
    public static final ju2 a = ju2.b("OMX.google.raw.decoder");
    public static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap c = new HashMap();
    public static int g = -1;

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

    public static int a() {
        int i = g;
        if (i == -1) {
            ju2 c2 = c("video/avc", false);
            if (c2 != null) {
                int i2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c2.g()) {
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
                i = Math.max(i2, pz2.a >= 21 ? 345600 : 172800);
            } else {
                i = 0;
            }
            g = i;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair b(String str) {
        char c2;
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
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str3.equals("avc2")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str3.equals("hev1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str3.equals("hvc1")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0 && c2 != 1) {
            if (c2 == 2 || c2 == 3) {
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
                        return new Pair(Integer.valueOf(d.get(valueOf2.intValue())), Integer.valueOf(e.get(Integer.valueOf(parseInt).intValue())));
                    } catch (NumberFormatException unused) {
                    }
                }
                "Ignoring malformed AVC codec string: ".concat(str);
                return null;
            }
            return null;
        }
        if (split.length >= 4) {
            Matcher matcher = b.matcher(split[1]);
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
                Integer num = (Integer) f.get(split[3]);
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

    public static ju2 c(String str, boolean z) {
        List d2 = d(str, z);
        if (d2.isEmpty()) {
            return null;
        }
        return (ju2) d2.get(0);
    }

    public static synchronized List d(String str, boolean z) {
        synchronized (av2.class) {
            tu2 tu2Var = new tu2(str, z);
            HashMap hashMap = c;
            List list = (List) hashMap.get(tu2Var);
            if (list != null) {
                return list;
            }
            int i = pz2.a;
            List e2 = e(tu2Var, i >= 21 ? new zu2(z) : new yu2(null));
            if (z && e2.isEmpty() && i >= 21 && i <= 23) {
                e2 = e(tu2Var, new yu2(null));
                if (!e2.isEmpty()) {
                    String str2 = ((ju2) e2.get(0)).a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(e2);
            hashMap.put(tu2Var, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01be A[Catch: Exception -> 0x01b9, TryCatch #1 {Exception -> 0x01b9, blocks: (B:102:0x0195, B:104:0x019f, B:106:0x01a7, B:108:0x01af, B:115:0x01be, B:120:0x01c7), top: B:151:0x0195 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List e(com.daaw.tu2 r18, com.daaw.wu2 r19) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.av2.e(com.daaw.tu2, com.daaw.wu2):java.util.List");
    }
}
