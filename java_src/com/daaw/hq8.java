package com.daaw;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class hq8 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;
    public static final /* synthetic */ int d = 0;

    public static int a() {
        int i;
        int i2 = c;
        if (i2 == -1) {
            ep8 c2 = c("video/avc", false, false);
            if (c2 != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c2.g()) {
                    int i4 = codecProfileLevel.level;
                    if (i4 == 1 || i4 == 2) {
                        i = 25344;
                    } else {
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i = 101376;
                                continue;
                            case 64:
                                i = 202752;
                                continue;
                            case 128:
                            case 256:
                                i = 414720;
                                continue;
                            case 512:
                                i = 921600;
                                continue;
                            case NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV /* 1024 */:
                                i = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i = 2097152;
                                continue;
                            case 8192:
                                i = 2228224;
                                continue;
                            case 16384:
                                i = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i = 35651584;
                                continue;
                            default:
                                i = -1;
                                continue;
                        }
                    }
                    i3 = Math.max(i, i3);
                }
                i2 = Math.max(i3, it5.a >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            c = i2;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a5 A[Catch: NumberFormatException -> 0x023a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x023a, blocks: (B:149:0x024a, B:151:0x025c, B:162:0x0278, B:178:0x02a5), top: B:495:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(com.daaw.f92 r17) {
        /*
            Method dump skipped, instructions count: 2328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hq8.b(com.daaw.f92):android.util.Pair");
    }

    public static ep8 c(String str, boolean z, boolean z2) {
        List f = f(str, false, false);
        if (f.isEmpty()) {
            return null;
        }
        return (ep8) f.get(0);
    }

    public static ep8 d() {
        return c("audio/raw", false, false);
    }

    public static String e(f92 f92Var) {
        Pair b2;
        if ("audio/eac3-joc".equals(f92Var.l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(f92Var.l) || (b2 = b(f92Var)) == null) {
            return null;
        }
        int intValue = ((Integer) b2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List f(String str, boolean z, boolean z2) {
        synchronized (hq8.class) {
            op8 op8Var = new op8(str, z, z2);
            HashMap hashMap = b;
            List list = (List) hashMap.get(op8Var);
            if (list != null) {
                return list;
            }
            int i = it5.a;
            ArrayList h = h(op8Var, i >= 21 ? new fq8(z, z2) : new eq8(null));
            if (z && h.isEmpty() && i >= 21 && i <= 23) {
                h = h(op8Var, new eq8(null));
                if (!h.isEmpty()) {
                    String str2 = ((ep8) h.get(0)).a;
                    s95.e("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && it5.b.equals("R9") && h.size() == 1 && ((ep8) h.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    h.add(ep8.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                i(h, new gq8() { // from class: com.daaw.mp8
                    @Override // com.daaw.gq8
                    public final int zza(Object obj) {
                        int i2 = hq8.d;
                        String str3 = ((ep8) obj).a;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (it5.a >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i < 21 && h.size() > 1) {
                String str3 = ((ep8) h.get(0)).a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    i(h, new gq8() { // from class: com.daaw.np8
                        @Override // com.daaw.gq8
                        public final int zza(Object obj) {
                            int i2 = hq8.d;
                            return ((ep8) obj).a.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i < 32 && h.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((ep8) h.get(0)).a)) {
                h.add((ep8) h.remove(0));
            }
            y17 s = y17.s(h);
            hashMap.put(op8Var, s);
            return s;
        }
    }

    public static List g(List list, final f92 f92Var) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new gq8() { // from class: com.daaw.kp8
            @Override // com.daaw.gq8
            public final int zza(Object obj) {
                f92 f92Var2 = f92.this;
                ep8 ep8Var = (ep8) obj;
                int i = hq8.d;
                try {
                    return !ep8Var.d(f92Var2) ? 0 : 1;
                } catch (qp8 unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:
        if (r1.b == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00da, code lost:
        if ("SCV31".equals(r10) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e7 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0201 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0206 A[Catch: Exception -> 0x029e, TryCatch #1 {Exception -> 0x029e, blocks: (B:115:0x01b6, B:121:0x01cd, B:127:0x01e1, B:129:0x01e7, B:134:0x01f9, B:136:0x0201, B:146:0x022b, B:137:0x0206, B:139:0x0216, B:141:0x021e, B:130:0x01ee), top: B:188:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b0 A[Catch: Exception -> 0x02ff, TRY_ENTER, TryCatch #0 {Exception -> 0x02ff, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0064, B:26:0x006c, B:28:0x0074, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a4, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c4, B:50:0x00cc, B:52:0x00d4, B:56:0x00e2, B:58:0x00ea, B:60:0x00f2, B:62:0x00fc, B:64:0x0104, B:66:0x010a, B:68:0x0112, B:71:0x011c, B:73:0x0124, B:77:0x0130, B:79:0x0138, B:81:0x0140, B:83:0x0148, B:172:0x02a8, B:175:0x02b0, B:177:0x02b6, B:178:0x02d0, B:179:0x02f3, B:86:0x0151, B:87:0x0154, B:89:0x015c, B:92:0x0167, B:94:0x016f, B:97:0x017a, B:99:0x0182, B:102:0x018d, B:104:0x0195, B:107:0x01a0, B:109:0x01a8), top: B:186:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d0 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList h(com.daaw.op8 r27, com.daaw.rp8 r28) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hq8.h(com.daaw.op8, com.daaw.rp8):java.util.ArrayList");
    }

    public static void i(List list, final gq8 gq8Var) {
        Collections.sort(list, new Comparator() { // from class: com.daaw.lp8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                gq8 gq8Var2 = gq8.this;
                int i = hq8.d;
                return gq8Var2.zza(obj2) - gq8Var2.zza(obj);
            }
        });
    }

    public static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (it5.a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ak3.g(str)) {
            return true;
        }
        String a2 = wx6.a(mediaCodecInfo.getName());
        if (a2.startsWith("arc.")) {
            return false;
        }
        if (a2.startsWith("omx.google.") || a2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((a2.startsWith("omx.sec.") && a2.contains(".sw.")) || a2.equals("omx.qcom.video.decoder.hevcswvdec") || a2.startsWith("c2.android.") || a2.startsWith("c2.google.")) {
            return true;
        }
        return (a2.startsWith("omx.") || a2.startsWith("c2.")) ? false : true;
    }
}
