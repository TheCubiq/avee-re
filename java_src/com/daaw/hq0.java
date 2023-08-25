package com.daaw;

import android.text.TextUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class hq0 {
    public static final ArrayList<a> a = new ArrayList<>();

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sq1.W(str, ",")) {
            String d = d(str2);
            if (d != null && k(d)) {
                return d;
            }
        }
        return null;
    }

    public static String b(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (str.startsWith(aVar.b)) {
                return aVar.a;
            }
        }
        return null;
    }

    public static int c(String str) {
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

    public static String d(String str) {
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
            return (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : trim.startsWith("ec+3") ? "audio/eac3-joc" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : b(trim);
        }
        if (trim.startsWith("mp4a.")) {
            String substring = trim.substring(5);
            if (substring.length() >= 2) {
                try {
                    str2 = e(Integer.parseInt(sq1.b0(substring.substring(0, 2)), 16));
                } catch (NumberFormatException unused) {
                }
            }
        }
        return str2 == null ? "audio/mp4a-latm" : str2;
    }

    public static String e(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 35) {
                    if (i != 64) {
                        if (i != 163) {
                            if (i != 177) {
                                if (i != 165) {
                                    if (i != 166) {
                                        switch (i) {
                                            case p21.O0 /* 96 */:
                                            case p21.P0 /* 97 */:
                                            case p21.Q0 /* 98 */:
                                            case p21.R0 /* 99 */:
                                            case p21.S0 /* 100 */:
                                            case p21.T0 /* 101 */:
                                                return "video/mpeg2";
                                            case p21.U0 /* 102 */:
                                            case p21.V0 /* 103 */:
                                            case p21.W0 /* 104 */:
                                                return "audio/mp4a-latm";
                                            case 105:
                                            case p21.Y0 /* 107 */:
                                                return "audio/mpeg";
                                            case p21.X0 /* 106 */:
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

    public static String f(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        throw new IllegalArgumentException("Invalid mime type: " + str);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-camera-motion".equals(str)) {
            return 4;
        }
        return h(str);
    }

    public static int h(String str) {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = a.get(i);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    public static int i(String str) {
        return g(d(str));
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : sq1.W(str, ",")) {
            String d = d(str2);
            if (d != null && m(d)) {
                return d;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(f(str));
    }

    public static boolean l(String str) {
        return "text".equals(f(str));
    }

    public static boolean m(String str) {
        return "video".equals(f(str));
    }
}
