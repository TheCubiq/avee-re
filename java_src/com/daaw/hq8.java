package com.daaw;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class hq8 {

    /* renamed from: a */
    public static final Pattern f12861a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    public static final HashMap f12862b = new HashMap();

    /* renamed from: c */
    public static int f12863c = -1;

    /* renamed from: d */
    public static final /* synthetic */ int f12864d = 0;

    /* renamed from: a */
    public static int m20481a() {
        int i;
        int i2 = f12863c;
        if (i2 == -1) {
            ep8 m20479c = m20479c("video/avc", false, false);
            if (m20479c != null) {
                int i3 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m20479c.m23306g()) {
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
                i2 = Math.max(i3, it5.f13991a >= 21 ? 345600 : 172800);
            } else {
                i2 = 0;
            }
            f12863c = i2;
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
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair m20480b(f92 f92Var) {
        char c;
        int parseInt;
        int parseInt2;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String valueOf;
        String str3;
        int i4;
        char c2;
        Integer num;
        int i5;
        int i6;
        int i7;
        StringBuilder sb;
        int i8;
        String sb2;
        int i9;
        int i10;
        char c3;
        Integer num2;
        Integer num3;
        int i11;
        String valueOf2;
        String str4;
        String str5 = f92Var.f9272i;
        if (str5 == null) {
            return null;
        }
        String[] split = str5.split("\\.");
        int i12 = 2;
        int i13 = 1;
        if ("video/dolby-vision".equals(f92Var.f9275l)) {
            String str6 = f92Var.f9272i;
            if (split.length >= 3) {
                Matcher matcher = f12861a.matcher(split[1]);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case NativeConstants.SSL_SIGN_RSA_PKCS1_SHA512 /* 1537 */:
                                if (group.equals("01")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case NativeConstants.SSL_SIGN_ECDSA_SECP521R1_SHA512 /* 1539 */:
                                if (group.equals("03")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            valueOf2 = String.valueOf(group);
                            str4 = "Unknown Dolby Vision profile string: ";
                        } else {
                            String str7 = split[2];
                            if (str7 != null) {
                                int hashCode = str7.hashCode();
                                switch (hashCode) {
                                    case NativeConstants.SSL_SIGN_RSA_PKCS1_SHA512 /* 1537 */:
                                        if (str7.equals("01")) {
                                            num3 = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str7.equals("02")) {
                                            num3 = 2;
                                            break;
                                        }
                                        break;
                                    case NativeConstants.SSL_SIGN_ECDSA_SECP521R1_SHA512 /* 1539 */:
                                        if (str7.equals("03")) {
                                            num3 = 4;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str7.equals("04")) {
                                            num3 = 8;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str7.equals("05")) {
                                            num3 = 16;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str7.equals("06")) {
                                            num3 = 32;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str7.equals("07")) {
                                            num3 = 64;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str7.equals("08")) {
                                            num3 = 128;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str7.equals("09")) {
                                            num3 = 256;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str7.equals("10")) {
                                                    num3 = 512;
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (str7.equals("11")) {
                                                    i11 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                                    num3 = Integer.valueOf(i11);
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (str7.equals("12")) {
                                                    i11 = 2048;
                                                    num3 = Integer.valueOf(i11);
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (str7.equals("13")) {
                                                    num3 = 4096;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                                if (num3 == null) {
                                    return new Pair(num2, num3);
                                }
                                valueOf2 = String.valueOf(str7);
                                str4 = "Unknown Dolby Vision level string: ";
                            }
                            num3 = null;
                            if (num3 == null) {
                            }
                        }
                        s95.m10493e("MediaCodecUtil", str4.concat(valueOf2));
                        return null;
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                    s95.m10493e("MediaCodecUtil", str4.concat(valueOf2));
                    return null;
                }
            }
            valueOf2 = String.valueOf(str6);
            str4 = "Ignoring malformed Dolby Vision codec string: ";
            s95.m10493e("MediaCodecUtil", str4.concat(valueOf2));
            return null;
        }
        String str8 = split[0];
        switch (str8.hashCode()) {
            case 3004662:
                if (str8.equals("av01")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3006243:
                if (str8.equals("avc1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3006244:
                if (str8.equals("avc2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3199032:
                if (str8.equals("hev1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3214780:
                if (str8.equals("hvc1")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3356560:
                if (str8.equals("mp4a")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3624515:
                if (str8.equals("vp09")) {
                    c = 2;
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
                String str9 = f92Var.f9272i;
                int length = split.length;
                if (length >= 2) {
                    if (split[1].length() == 6) {
                        parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                        parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                    } else if (length < 3) {
                        s95.m10493e("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str9);
                        return null;
                    } else {
                        parseInt = Integer.parseInt(split[1]);
                        parseInt2 = Integer.parseInt(split[2]);
                    }
                    if (parseInt == 66) {
                        i = -1;
                        i12 = 1;
                    } else if (parseInt == 77) {
                        i = -1;
                    } else if (parseInt == 88) {
                        i = -1;
                        i12 = 4;
                    } else if (parseInt == 100) {
                        i = -1;
                        i12 = 8;
                    } else if (parseInt == 110) {
                        i = -1;
                        i12 = 16;
                    } else if (parseInt == 122) {
                        i = -1;
                        i12 = 32;
                    } else if (parseInt != 244) {
                        i = -1;
                        i12 = -1;
                    } else {
                        i = -1;
                        i12 = 64;
                    }
                    if (i12 == i) {
                        str = "Unknown AVC profile: " + parseInt;
                    } else {
                        switch (parseInt2) {
                            case 10:
                                i2 = 1;
                                break;
                            case 11:
                                i2 = 4;
                                break;
                            case 12:
                                i2 = 8;
                                break;
                            case 13:
                                i2 = 16;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i2 = 32;
                                        break;
                                    case 21:
                                        i2 = 64;
                                        break;
                                    case 22:
                                        i2 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i2 = 256;
                                                break;
                                            case 31:
                                                i2 = 512;
                                                break;
                                            case 32:
                                                i2 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i2 = 2048;
                                                        break;
                                                    case 41:
                                                        i2 = 4096;
                                                        break;
                                                    case 42:
                                                        i2 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i2 = 16384;
                                                                break;
                                                            case 51:
                                                                i2 = 32768;
                                                                break;
                                                            case 52:
                                                                i2 = 65536;
                                                                break;
                                                            default:
                                                                i2 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i2 != -1) {
                            return new Pair(Integer.valueOf(i12), Integer.valueOf(i2));
                        }
                        str = "Unknown AVC level: " + parseInt2;
                    }
                    s95.m10493e("MediaCodecUtil", str);
                    return null;
                }
                str = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str9));
                s95.m10493e("MediaCodecUtil", str);
                return null;
            case 2:
                String str10 = f92Var.f9272i;
                if (split.length >= 3) {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i14 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i14 == -1) {
                            str2 = "Unknown VP9 profile: " + parseInt3;
                        } else {
                            if (parseInt4 == 10) {
                                i3 = -1;
                            } else if (parseInt4 == 11) {
                                i3 = -1;
                                i13 = 2;
                            } else if (parseInt4 == 20) {
                                i3 = -1;
                                i13 = 4;
                            } else if (parseInt4 == 21) {
                                i3 = -1;
                                i13 = 8;
                            } else if (parseInt4 == 30) {
                                i3 = -1;
                                i13 = 16;
                            } else if (parseInt4 == 31) {
                                i3 = -1;
                                i13 = 32;
                            } else if (parseInt4 == 40) {
                                i3 = -1;
                                i13 = 64;
                            } else if (parseInt4 == 41) {
                                i3 = -1;
                                i13 = 128;
                            } else if (parseInt4 == 50) {
                                i3 = -1;
                                i13 = 256;
                            } else if (parseInt4 != 51) {
                                i3 = -1;
                                switch (parseInt4) {
                                    case 60:
                                        i13 = 2048;
                                        break;
                                    case 61:
                                        i13 = 4096;
                                        break;
                                    case 62:
                                        i13 = 8192;
                                        break;
                                    default:
                                        i13 = -1;
                                        break;
                                }
                            } else {
                                i3 = -1;
                                i13 = 512;
                            }
                            if (i13 != i3) {
                                return new Pair(Integer.valueOf(i14), Integer.valueOf(i13));
                            }
                            str2 = "Unknown VP9 level: " + parseInt4;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    s95.m10493e("MediaCodecUtil", str2);
                    return null;
                }
                str2 = "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str10));
                s95.m10493e("MediaCodecUtil", str2);
                return null;
            case 3:
            case 4:
                String str11 = f92Var.f9272i;
                if (split.length >= 4) {
                    Matcher matcher2 = f12861a.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i4 = 1;
                        } else if (!"2".equals(group2)) {
                            valueOf = String.valueOf(group2);
                            str3 = "Unknown HEVC profile string: ";
                            s95.m10493e("MediaCodecUtil", str3.concat(valueOf));
                            return null;
                        } else {
                            i4 = 2;
                        }
                        String str12 = split[3];
                        if (str12 != null) {
                            switch (str12.hashCode()) {
                                case 70821:
                                    if (str12.equals("H30")) {
                                        c2 = '\r';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 70914:
                                    if (str12.equals("H60")) {
                                        c2 = 14;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 70917:
                                    if (str12.equals("H63")) {
                                        c2 = 15;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 71007:
                                    if (str12.equals("H90")) {
                                        c2 = 16;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 71010:
                                    if (str12.equals("H93")) {
                                        c2 = 17;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74665:
                                    if (str12.equals("L30")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74758:
                                    if (str12.equals("L60")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74761:
                                    if (str12.equals("L63")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74851:
                                    if (str12.equals("L90")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 74854:
                                    if (str12.equals("L93")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193639:
                                    if (str12.equals("H120")) {
                                        c2 = 18;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193642:
                                    if (str12.equals("H123")) {
                                        c2 = 19;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193732:
                                    if (str12.equals("H150")) {
                                        c2 = 20;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193735:
                                    if (str12.equals("H153")) {
                                        c2 = 21;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193738:
                                    if (str12.equals("H156")) {
                                        c2 = 22;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193825:
                                    if (str12.equals("H180")) {
                                        c2 = 23;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193828:
                                    if (str12.equals("H183")) {
                                        c2 = 24;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2193831:
                                    if (str12.equals("H186")) {
                                        c2 = 25;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312803:
                                    if (str12.equals("L120")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312806:
                                    if (str12.equals("L123")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312896:
                                    if (str12.equals("L150")) {
                                        c2 = 7;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312899:
                                    if (str12.equals("L153")) {
                                        c2 = '\b';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312902:
                                    if (str12.equals("L156")) {
                                        c2 = '\t';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312989:
                                    if (str12.equals("L180")) {
                                        c2 = '\n';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312992:
                                    if (str12.equals("L183")) {
                                        c2 = 11;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2312995:
                                    if (str12.equals("L186")) {
                                        c2 = '\f';
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    i5 = 16;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = Integer.valueOf((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    i5 = 16384;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\b':
                                    i5 = 65536;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\t':
                                    i5 = 262144;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\n':
                                    i5 = 1048576;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 11:
                                    i5 = NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\f':
                                    i5 = 16777216;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\r':
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case 16:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    i5 = 2048;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    i5 = 32768;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 21:
                                    i5 = 131072;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 22:
                                    i5 = 524288;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 23:
                                    i5 = 2097152;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 24:
                                    i5 = 8388608;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 25:
                                    i5 = 33554432;
                                    num = Integer.valueOf(i5);
                                    break;
                            }
                            if (num != null) {
                                valueOf = String.valueOf(str12);
                                str3 = "Unknown HEVC level string: ";
                                s95.m10493e("MediaCodecUtil", str3.concat(valueOf));
                                return null;
                            }
                            return new Pair(Integer.valueOf(i4), num);
                        }
                        num = null;
                        if (num != null) {
                        }
                    }
                }
                valueOf = String.valueOf(str11);
                str3 = "Ignoring malformed HEVC codec string: ";
                s95.m10493e("MediaCodecUtil", str3.concat(valueOf));
                return null;
            case 5:
                String str13 = f92Var.f9272i;
                mo8 mo8Var = f92Var.f9287x;
                if (split.length >= 4) {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            sb = new StringBuilder();
                            sb.append("Unknown AV1 profile: ");
                            sb.append(parseInt5);
                        } else {
                            if (parseInt7 == 8) {
                                i6 = 1;
                            } else if (parseInt7 != 10) {
                                sb = new StringBuilder();
                                sb.append("Unknown AV1 bit depth: ");
                                sb.append(parseInt7);
                            } else {
                                i6 = (mo8Var == null || !(mo8Var.f19054d != null || (i8 = mo8Var.f19053c) == 7 || i8 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 4;
                                    break;
                                case 3:
                                    i7 = 8;
                                    break;
                                case 4:
                                    i7 = 16;
                                    break;
                                case 5:
                                    i7 = 32;
                                    break;
                                case 6:
                                    i7 = 64;
                                    break;
                                case 7:
                                    i7 = 128;
                                    break;
                                case 8:
                                    i7 = 256;
                                    break;
                                case 9:
                                    i7 = 512;
                                    break;
                                case 10:
                                    i7 = NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV;
                                    break;
                                case 11:
                                    i7 = 2048;
                                    break;
                                case 12:
                                    i7 = 4096;
                                    break;
                                case 13:
                                    i7 = 8192;
                                    break;
                                case 14:
                                    i7 = 16384;
                                    break;
                                case 15:
                                    i7 = 32768;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    break;
                                case 17:
                                    i7 = 131072;
                                    break;
                                case 18:
                                    i7 = 262144;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    break;
                                case 22:
                                    i7 = NativeConstants.SSL_OP_CIPHER_SERVER_PREFERENCE;
                                    break;
                                case 23:
                                    i7 = 8388608;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i6), Integer.valueOf(i7));
                            }
                            sb = new StringBuilder();
                            sb.append("Unknown AV1 level: ");
                            sb.append(parseInt6);
                        }
                        sb2 = sb.toString();
                    } catch (NumberFormatException unused2) {
                    }
                    s95.m10493e("MediaCodecUtil", sb2);
                    return null;
                }
                sb2 = "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str13));
                s95.m10493e("MediaCodecUtil", sb2);
                return null;
            case 6:
                String str14 = f92Var.f9272i;
                if (split.length == 3) {
                    try {
                        if ("audio/mp4a-latm".equals(ak3.m27386d(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 == 20) {
                                    i10 = -1;
                                    i9 = 20;
                                } else if (parseInt8 == 23) {
                                    i9 = 23;
                                } else if (parseInt8 == 29) {
                                    i9 = 29;
                                } else if (parseInt8 == 39) {
                                    i9 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i10 = -1;
                                            i9 = 1;
                                            break;
                                        case 2:
                                            i10 = -1;
                                            i9 = 2;
                                            break;
                                        case 3:
                                            i10 = -1;
                                            i9 = 3;
                                            break;
                                        case 4:
                                            i10 = -1;
                                            i9 = 4;
                                            break;
                                        case 5:
                                            i10 = -1;
                                            i9 = 5;
                                            break;
                                        case 6:
                                            i10 = -1;
                                            i9 = 6;
                                            break;
                                        default:
                                            i10 = -1;
                                            i9 = -1;
                                            break;
                                    }
                                } else {
                                    i9 = 42;
                                }
                                if (i9 != i10) {
                                    return new Pair(Integer.valueOf(i9), 0);
                                }
                            } else {
                                i9 = 17;
                            }
                            i10 = -1;
                            if (i9 != i10) {
                            }
                        }
                    } catch (NumberFormatException unused3) {
                    }
                    return null;
                }
                s95.m10493e("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str14)));
                return null;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static ep8 m20479c(String str, boolean z, boolean z2) {
        List m20476f = m20476f(str, false, false);
        if (m20476f.isEmpty()) {
            return null;
        }
        return (ep8) m20476f.get(0);
    }

    /* renamed from: d */
    public static ep8 m20478d() {
        return m20479c("audio/raw", false, false);
    }

    /* renamed from: e */
    public static String m20477e(f92 f92Var) {
        Pair m20480b;
        if ("audio/eac3-joc".equals(f92Var.f9275l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(f92Var.f9275l) || (m20480b = m20480b(f92Var)) == null) {
            return null;
        }
        int intValue = ((Integer) m20480b.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* renamed from: f */
    public static synchronized List m20476f(String str, boolean z, boolean z2) {
        synchronized (hq8.class) {
            op8 op8Var = new op8(str, z, z2);
            HashMap hashMap = f12862b;
            List list = (List) hashMap.get(op8Var);
            if (list != null) {
                return list;
            }
            int i = it5.f13991a;
            ArrayList m20474h = m20474h(op8Var, i >= 21 ? new fq8(z, z2) : new eq8(null));
            if (z && m20474h.isEmpty() && i >= 21 && i <= 23) {
                m20474h = m20474h(op8Var, new eq8(null));
                if (!m20474h.isEmpty()) {
                    String str2 = ((ep8) m20474h.get(0)).f8666a;
                    s95.m10493e("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && it5.f13992b.equals("R9") && m20474h.size() == 1 && ((ep8) m20474h.get(0)).f8666a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    m20474h.add(ep8.m23310c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                m20473i(m20474h, new gq8() { // from class: com.daaw.mp8
                    @Override // com.daaw.gq8
                    public final int zza(Object obj) {
                        int i2 = hq8.f12864d;
                        String str3 = ((ep8) obj).f8666a;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        return (it5.f13991a >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (i < 21 && m20474h.size() > 1) {
                String str3 = ((ep8) m20474h.get(0)).f8666a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    m20473i(m20474h, new gq8() { // from class: com.daaw.np8
                        @Override // com.daaw.gq8
                        public final int zza(Object obj) {
                            int i2 = hq8.f12864d;
                            return ((ep8) obj).f8666a.startsWith("OMX.google") ? 1 : 0;
                        }
                    });
                }
            }
            if (i < 32 && m20474h.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((ep8) m20474h.get(0)).f8666a)) {
                m20474h.add((ep8) m20474h.remove(0));
            }
            y17 m4262s = y17.m4262s(m20474h);
            hashMap.put(op8Var, m4262s);
            return m4262s;
        }
    }

    /* renamed from: g */
    public static List m20475g(List list, final f92 f92Var) {
        ArrayList arrayList = new ArrayList(list);
        m20473i(arrayList, new gq8() { // from class: com.daaw.kp8
            @Override // com.daaw.gq8
            public final int zza(Object obj) {
                f92 f92Var2 = f92.this;
                ep8 ep8Var = (ep8) obj;
                int i = hq8.f12864d;
                try {
                    return !ep8Var.m23309d(f92Var2) ? 0 : 1;
                } catch (qp8 unused) {
                    return -1;
                }
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0233, code lost:
        if (r1.f21813b == false) goto L109;
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
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m20474h(op8 op8Var, rp8 rp8Var) {
        String str;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean mo11079a;
        boolean mo11078b;
        int i3;
        boolean isHardwareAccelerated;
        boolean m20472j;
        boolean z;
        op8 op8Var2 = op8Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = op8Var2.f21812a;
            int zza = rp8Var.zza();
            boolean zze = rp8Var.zze();
            int i4 = 0;
            while (i4 < zza) {
                MediaCodecInfo zzb = rp8Var.zzb(i4);
                int i5 = it5.f13991a;
                if (i5 < 29 || !zzb.isAlias()) {
                    String name = zzb.getName();
                    if (!zzb.isEncoder() && ((zze || !name.endsWith(".secure")) && (i5 >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))))) {
                        if (i5 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(it5.f13993c))) {
                            String str6 = it5.f13992b;
                            if (!str6.startsWith("zeroflte")) {
                                if (!str6.startsWith("zerolte")) {
                                    if (!str6.startsWith("zenlte")) {
                                        if (!"SC-05G".equals(str6)) {
                                            if (!"marinelteatt".equals(str6)) {
                                                if (!"404SC".equals(str6)) {
                                                    if (!"SC-04G".equals(str6)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i5 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(it5.f13993c)) {
                            String str7 = it5.f13992b;
                            if (!str7.startsWith("d2")) {
                                if (!str7.startsWith("serrano")) {
                                    if (!str7.startsWith("jflte")) {
                                        if (!str7.startsWith("santos")) {
                                        }
                                    }
                                }
                            }
                        }
                        if ((i5 > 19 || !it5.f13992b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (i5 > 23 || !"audio/eac3-joc".equals(str5) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                            String[] supportedTypes = zzb.getSupportedTypes();
                            int length = supportedTypes.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    str = supportedTypes[i6];
                                    if (str.equalsIgnoreCase(str5)) {
                                        break;
                                    }
                                    i6++;
                                } else if (str5.equals("video/dolby-vision")) {
                                    if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        str = "video/hevcdv";
                                    } else {
                                        if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                            str = "video/dv_hevc";
                                        }
                                        str = null;
                                    }
                                } else if (str5.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                    str = "audio/x-lg-alac";
                                } else if (str5.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                    str = "audio/x-lg-flac";
                                } else {
                                    if (str5.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                        str = "audio/lg-ac3";
                                    }
                                    str = null;
                                }
                            }
                            if (str != null) {
                                try {
                                    capabilitiesForType = zzb.getCapabilitiesForType(str);
                                    mo11079a = rp8Var.mo11079a("tunneled-playback", str, capabilitiesForType);
                                    mo11078b = rp8Var.mo11078b("tunneled-playback", str, capabilitiesForType);
                                } catch (Exception e) {
                                    e = e;
                                    str2 = str;
                                    str3 = name;
                                    i = i4;
                                    i2 = zza;
                                    str4 = str5;
                                }
                                if (op8Var2.f21814c) {
                                    if (!mo11079a) {
                                    }
                                    boolean mo11079a2 = rp8Var.mo11079a("secure-playback", str, capabilitiesForType);
                                    boolean mo11078b2 = rp8Var.mo11078b("secure-playback", str, capabilitiesForType);
                                    if (op8Var2.f21813b) {
                                    }
                                    i4 = i + 1;
                                    op8Var2 = op8Var;
                                    zza = i2;
                                    str5 = str4;
                                } else if (!mo11078b) {
                                    boolean mo11079a22 = rp8Var.mo11079a("secure-playback", str, capabilitiesForType);
                                    boolean mo11078b22 = rp8Var.mo11078b("secure-playback", str, capabilitiesForType);
                                    if (op8Var2.f21813b) {
                                        if (!mo11078b22) {
                                            i3 = it5.f13991a;
                                            isHardwareAccelerated = i3 < 29 ? zzb.isHardwareAccelerated() : !m20472j(zzb, str5);
                                            m20472j = m20472j(zzb, str5);
                                            if (i3 < 29) {
                                                z = zzb.isVendor();
                                            } else {
                                                String m5726a = wx6.m5726a(zzb.getName());
                                                z = (m5726a.startsWith("omx.google.") || m5726a.startsWith("c2.android.") || m5726a.startsWith("c2.google.")) ? false : true;
                                            }
                                            if (zze || op8Var2.f21813b != mo11079a22) {
                                                if (!zze) {
                                                    try {
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        str2 = str;
                                                        i = i4;
                                                        i2 = zza;
                                                        str4 = str5;
                                                        str3 = name;
                                                        if (it5.f13991a > 23 || arrayList.isEmpty()) {
                                                            s95.m10496b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                            throw e;
                                                        }
                                                        s95.m10496b("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                        i4 = i + 1;
                                                        op8Var2 = op8Var;
                                                        zza = i2;
                                                        str5 = str4;
                                                    }
                                                }
                                                str2 = str;
                                                i = i4;
                                                i2 = zza;
                                                str4 = str5;
                                                if (!zze && mo11079a22) {
                                                    StringBuilder sb = new StringBuilder();
                                                    try {
                                                        sb.append(name);
                                                        sb.append(".secure");
                                                        str3 = name;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        str3 = name;
                                                    }
                                                    try {
                                                        arrayList.add(ep8.m23310c(sb.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, m20472j, z, false, true));
                                                        return arrayList;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        if (it5.f13991a > 23) {
                                                        }
                                                        s95.m10496b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                        throw e;
                                                    }
                                                }
                                            }
                                            str2 = str;
                                            i = i4;
                                            i2 = zza;
                                            str4 = str5;
                                            try {
                                                arrayList.add(ep8.m23310c(name, str5, str, capabilitiesForType, isHardwareAccelerated, m20472j, z, false, false));
                                            } catch (Exception e5) {
                                                e = e5;
                                                str3 = name;
                                                if (it5.f13991a > 23) {
                                                }
                                                s95.m10496b("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                throw e;
                                            }
                                        }
                                    } else if (mo11079a22) {
                                        mo11079a22 = true;
                                        i3 = it5.f13991a;
                                        if (i3 < 29) {
                                        }
                                        m20472j = m20472j(zzb, str5);
                                        if (i3 < 29) {
                                        }
                                        if (zze) {
                                        }
                                        if (!zze) {
                                        }
                                        str2 = str;
                                        i = i4;
                                        i2 = zza;
                                        str4 = str5;
                                        if (!zze) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(name);
                                            sb2.append(".secure");
                                            str3 = name;
                                            arrayList.add(ep8.m23310c(sb2.toString(), str4, str2, capabilitiesForType, isHardwareAccelerated, m20472j, z, false, true));
                                            return arrayList;
                                        }
                                        continue;
                                    }
                                    i4 = i + 1;
                                    op8Var2 = op8Var;
                                    zza = i2;
                                    str5 = str4;
                                }
                            }
                        }
                    }
                }
                i = i4;
                i2 = zza;
                str4 = str5;
                i4 = i + 1;
                op8Var2 = op8Var;
                zza = i2;
                str5 = str4;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new qp8(e6, null);
        }
    }

    /* renamed from: i */
    public static void m20473i(List list, final gq8 gq8Var) {
        Collections.sort(list, new Comparator() { // from class: com.daaw.lp8
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                gq8 gq8Var2 = gq8.this;
                int i = hq8.f12864d;
                return gq8Var2.zza(obj2) - gq8Var2.zza(obj);
            }
        });
    }

    /* renamed from: j */
    public static boolean m20472j(MediaCodecInfo mediaCodecInfo, String str) {
        if (it5.f13991a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ak3.m27383g(str)) {
            return true;
        }
        String m5726a = wx6.m5726a(mediaCodecInfo.getName());
        if (m5726a.startsWith("arc.")) {
            return false;
        }
        if (m5726a.startsWith("omx.google.") || m5726a.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m5726a.startsWith("omx.sec.") && m5726a.contains(".sw.")) || m5726a.equals("omx.qcom.video.decoder.hevcswvdec") || m5726a.startsWith("c2.android.") || m5726a.startsWith("c2.google.")) {
            return true;
        }
        return (m5726a.startsWith("omx.") || m5726a.startsWith("c2.")) ? false : true;
    }
}
