package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hq0 {

    /* renamed from: a */
    public static final ArrayList<C1606a> f12842a = new ArrayList<>();

    /* renamed from: com.daaw.hq0$a */
    /* loaded from: classes.dex */
    public static final class C1606a {

        /* renamed from: a */
        public final String f12843a;

        /* renamed from: b */
        public final String f12844b;

        /* renamed from: c */
        public final int f12845c;
    }

    /* renamed from: a */
    public static String m20504a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sq1.m10022W(str, ",")) {
            String m20501d = m20501d(str2);
            if (m20501d != null && m20494k(m20501d)) {
                return m20501d;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m20503b(String str) {
        int size = f12842a.size();
        for (int i = 0; i < size; i++) {
            C1606a c1606a = f12842a.get(i);
            if (str.startsWith(c1606a.f12844b)) {
                return c1606a.f12843a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static int m20502c(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 4;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                return 6;
            case 1:
                return 7;
            case 2:
                return 5;
            case 4:
                return 8;
            case 5:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: d */
    public static String m20501d(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (!trim.startsWith("mp4a")) {
            return (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : trim.startsWith("ec+3") ? "audio/eac3-joc" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : m20503b(trim);
        }
        if (trim.startsWith("mp4a.")) {
            String substring = trim.substring(5);
            if (substring.length() >= 2) {
                try {
                    str2 = m20500e(Integer.parseInt(sq1.m10015b0(substring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    /* renamed from: e */
    public static String m20500e(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case p21.f22298O0 /* 96 */:
                                            case p21.f22304P0 /* 97 */:
                                            case p21.f22310Q0 /* 98 */:
                                            case p21.f22316R0 /* 99 */:
                                            case p21.f22322S0 /* 100 */:
                                            case p21.f22328T0 /* 101 */:
                                                return "video/mpeg2";
                                            case p21.f22334U0 /* 102 */:
                                            case p21.f22340V0 /* 103 */:
                                            case p21.f22346W0 /* 104 */:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case p21.f22358Y0 /* 107 */:
                                                return "audio/mpeg";
                                            case p21.f22352X0 /* 106 */:
                                                return "video/mpeg";
                                            default:
                                                switch (i) {
                                                    case 169:
                                                    case 172:
                                                        return "audio/vnd.dts";
                                                    case 170:
                                                    case 171:
                                                        return "audio/vnd.dts.hd";
                                                    case 173:
                                                        return "audio/opus";
                                                    default:
                                                        return null;
                                                }
                                        }
                                    }
                                    return "audio/eac3";
                                }
                                return "audio/ac3";
                            }
                            return "video/x-vnd.on2.vp9";
                        }
                        return "video/wvc1";
                    }
                    return "audio/mp4a-latm";
                }
                return "video/hevc";
            }
            return "video/avc";
        }
        return "video/mp4v-es";
    }

    /* renamed from: f */
    public static String m20499f(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    /* renamed from: g */
    public static int m20498g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m20494k(str)) {
            return 1;
        }
        if (m20492m(str)) {
            return 2;
        }
        if (m20493l(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) {
            return 4;
        }
        return m20497h(str);
    }

    /* renamed from: h */
    public static int m20497h(String str) {
        int size = f12842a.size();
        for (int i = 0; i < size; i++) {
            C1606a c1606a = f12842a.get(i);
            if (str.equals(c1606a.f12843a)) {
                return c1606a.f12845c;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static int m20496i(String str) {
        return m20498g(m20501d(str));
    }

    /* renamed from: j */
    public static String m20495j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sq1.m10022W(str, ",")) {
            String m20501d = m20501d(str2);
            if (m20501d != null && m20492m(m20501d)) {
                return m20501d;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m20494k(String str) {
        return "audio".equals(m20499f(str));
    }

    /* renamed from: l */
    public static boolean m20493l(String str) {
        return "text".equals(m20499f(str));
    }

    /* renamed from: m */
    public static boolean m20492m(String str) {
        return "video".equals(m20499f(str));
    }
}
