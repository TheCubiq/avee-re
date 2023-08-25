package com.daaw;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class it5 {

    /* renamed from: a */
    public static final int f13991a;

    /* renamed from: b */
    public static final String f13992b;

    /* renamed from: c */
    public static final String f13993c;

    /* renamed from: d */
    public static final String f13994d;

    /* renamed from: e */
    public static final String f13995e;

    /* renamed from: f */
    public static final byte[] f13996f;

    /* renamed from: g */
    public static final Pattern f13997g;

    /* renamed from: h */
    public static final Pattern f13998h;

    /* renamed from: i */
    public static final Pattern f13999i;

    /* renamed from: j */
    public static final Pattern f14000j;

    /* renamed from: k */
    public static HashMap f14001k;

    /* renamed from: l */
    public static final String[] f14002l;

    /* renamed from: m */
    public static final String[] f14003m;

    /* renamed from: n */
    public static final int[] f14004n;

    /* renamed from: o */
    public static final int[] f14005o;

    static {
        int i = Build.VERSION.SDK_INT;
        f13991a = i;
        String str = Build.DEVICE;
        f13992b = str;
        String str2 = Build.MANUFACTURER;
        f13993c = str2;
        String str3 = Build.MODEL;
        f13994d = str3;
        f13995e = str + ", " + str3 + ", " + str2 + ", " + i;
        f13996f = new byte[0];
        f13997g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f13998h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f13999i = Pattern.compile("%([A-Fa-f0-9]{2})");
        f14000j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f14002l = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f14003m = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f14004n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f14005o = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, x21.f31784F0, x21.f31819M0, x21.f31794H0, p21.f22364Z0, p21.f22358Y0, 98, p21.f22328T0, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, p21.f22346W0, 97, p21.f22334U0, 115, x21.f31769C0, x21.f31814L0, x21.f31799I0, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, p21.f22340V0, 96, x21.f31774D0, 114, x21.f31804J0, x21.f31809K0, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, x21.f31779E0, 113, x21.f31789G0, 127, p21.f22352X0, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    /* renamed from: A */
    public static float m19431A(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: B */
    public static byte[] m19430B(String str) {
        return str.getBytes(cy6.f6275c);
    }

    /* renamed from: C */
    public static byte[] m19429C(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: D */
    public static Object[] m19428D(Object[] objArr) {
        return objArr;
    }

    /* renamed from: E */
    public static Object[] m19427E(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: F */
    public static Object[] m19426F(Object[] objArr, int i) {
        uo4.m7874d(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: G */
    public static String[] m19425G() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] split = f13991a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{m19382n(configuration.locale)};
        for (int i = 0; i < split.length; i++) {
            split[i] = m19380p(split[i]);
        }
        return split;
    }

    /* renamed from: H */
    public static String[] m19424H(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: I */
    public static String[] m19423I(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: J */
    public static String m19422J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            s95.m10495c("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    /* renamed from: K */
    public static HashMap m19421K() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = f14002l.length;
        HashMap hashMap = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f14002l;
            int length3 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: L */
    public static int m19420L(long[] jArr, long j, boolean z, boolean z2) {
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            return binarySearch ^ (-1);
        }
        do {
            binarySearch++;
            if (binarySearch >= jArr.length) {
                break;
            }
        } while (jArr[binarySearch] == j);
        return !z ? binarySearch : binarySearch - 1;
    }

    /* renamed from: M */
    public static int m19419M(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    /* renamed from: N */
    public static int m19418N(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* renamed from: O */
    public static int m19417O(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: P */
    public static int m19416P(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: Q */
    public static int m19415Q(byte[] bArr, int i, int i2, int i3) {
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = f14004n[(i4 >>> 24) ^ (bArr[i5] & 255)] ^ (i4 << 8);
        }
        return i4;
    }

    /* renamed from: R */
    public static int m19414R(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = f14005o[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    /* renamed from: S */
    public static int m19413S(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: T */
    public static int m19412T(int i) {
        if (i == 12) {
            return f13991a >= 32 ? 743676 : 0;
        }
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f13991a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: U */
    public static int m19411U(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: V */
    public static int m19410V(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i != 10) {
            if (i != 7) {
                if (i != 8) {
                    switch (i) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }
                return 6003;
            }
            return 6005;
        }
        return 6004;
    }

    /* renamed from: W */
    public static int m19409W(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
            Objects.requireNonNull(str2);
            try {
                i = Integer.parseInt(str2);
                if (z) {
                    return -i;
                }
            } catch (NumberFormatException unused) {
            }
            return i;
        }
        return 0;
    }

    /* renamed from: X */
    public static int m19408X(int i) {
        if (i != 8) {
            if (i != 16) {
                if (i != 24) {
                    return i != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: Y */
    public static int m19407Y(int i, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 268435456) {
                        if (i == 536870912) {
                            return i2 * 3;
                        }
                        if (i != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i2 * 4;
            }
            return i2;
        }
        return i2 + i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: Z */
    public static int m19406Z(Uri uri) {
        char c;
        String scheme = uri.getScheme();
        if (scheme == null || !wx6.m5724c("rtsp", scheme)) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                return 4;
            }
            int lastIndexOf = lastPathSegment.lastIndexOf(46);
            if (lastIndexOf >= 0) {
                String m5726a = wx6.m5726a(lastPathSegment.substring(lastIndexOf + 1));
                switch (m5726a.hashCode()) {
                    case 104579:
                        if (m5726a.equals("ism")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108321:
                        if (m5726a.equals("mpd")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3242057:
                        if (m5726a.equals("isml")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3299913:
                        if (m5726a.equals("m3u8")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i = c != 0 ? c != 1 ? (c == 2 || c == 3) ? 1 : 4 : 2 : 0;
                if (i != 4) {
                    return i;
                }
            }
            Pattern pattern = f14000j;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            Matcher matcher = pattern.matcher(path);
            if (matcher.matches()) {
                String group = matcher.group(2);
                if (group != null) {
                    if (group.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
            return 4;
        }
        return 3;
    }

    /* renamed from: a */
    public static Intent m19405a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return f13991a < 33 ? context.registerReceiver(broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    /* renamed from: a0 */
    public static long m19404a0(long j, long j2, long j3) {
        long j4 = j + j2;
        if (((j ^ j4) & (j2 ^ j4)) < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    /* renamed from: b */
    public static Point m19403b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m19372x(context)) {
            String m19422J = m19422J(f13991a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(m19422J)) {
                try {
                    String[] split = m19422J.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                s95.m10496b("Util", "Invalid display size: ".concat(String.valueOf(m19422J)));
            }
            if ("Sony".equals(f13993c) && f13994d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (f13991a < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    /* renamed from: b0 */
    public static long m19402b0(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: c */
    public static Handler m19401c(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: c0 */
    public static long m19400c0(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j;
        double d2 = f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: d */
    public static Handler m19399d(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        uo4.m7876b(myLooper);
        return new Handler(myLooper, null);
    }

    /* renamed from: d0 */
    public static long m19398d0(long j) {
        return j == -9223372036854775807L ? System.currentTimeMillis() : j + SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public static Looper m19397e() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: e0 */
    public static long m19396e0(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = j;
        double d2 = f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: f */
    public static f92 m19395f(int i, int i2, int i3) {
        b72 b72Var = new b72();
        b72Var.m26372s("audio/raw");
        b72Var.m26389e0(i2);
        b72Var.m26371t(i3);
        b72Var.m26377n(i);
        return b72Var.m26366y();
    }

    /* renamed from: f0 */
    public static long m19394f0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00be A[ADDED_TO_REGION] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lu3 m19393g(ty3 ty3Var, lu3 lu3Var) {
        boolean z;
        l64 zzn;
        boolean z2;
        boolean zzs = ty3Var.zzs();
        boolean zzc = ty3Var.zzc();
        gf8 gf8Var = (gf8) ty3Var;
        l64 zzn2 = gf8Var.zzn();
        boolean z3 = true;
        if (!zzn2.m17121o()) {
            int zzf = gf8Var.zzf();
            gf8Var.zzj();
            gf8Var.zzr();
            if (zzn2.mo4797k(zzf, 0, false) != -1) {
                z = true;
                zzn = gf8Var.zzn();
                if (!zzn.m17121o()) {
                    int zzf2 = gf8Var.zzf();
                    gf8Var.zzj();
                    gf8Var.zzr();
                    if (zzn.mo4798j(zzf2, 0, false) != -1) {
                        z2 = true;
                        boolean zzb = ty3Var.zzb();
                        boolean zza = ty3Var.zza();
                        boolean m17121o = ty3Var.zzn().m17121o();
                        ls3 ls3Var = new ls3();
                        ls3Var.m16608b(lu3Var);
                        boolean z4 = !zzs;
                        ls3Var.m16606d(4, z4);
                        ls3Var.m16606d(5, (zzc || zzs) ? false : true);
                        ls3Var.m16606d(6, (z || zzs) ? false : true);
                        ls3Var.m16606d(7, m17121o && (z || !zzb || zzc) && !zzs);
                        ls3Var.m16606d(8, (z2 || zzs) ? false : true);
                        ls3Var.m16606d(9, m17121o && (z2 || (zzb && zza)) && !zzs);
                        ls3Var.m16606d(10, z4);
                        ls3Var.m16606d(11, (zzc || zzs) ? false : true);
                        ls3Var.m16606d(12, (zzc || zzs) ? false : false);
                        return ls3Var.m16605e();
                    }
                }
                z2 = false;
                boolean zzb2 = ty3Var.zzb();
                boolean zza2 = ty3Var.zza();
                boolean m17121o2 = ty3Var.zzn().m17121o();
                ls3 ls3Var2 = new ls3();
                ls3Var2.m16608b(lu3Var);
                boolean z42 = !zzs;
                ls3Var2.m16606d(4, z42);
                ls3Var2.m16606d(5, (zzc || zzs) ? false : true);
                ls3Var2.m16606d(6, (z || zzs) ? false : true);
                ls3Var2.m16606d(7, m17121o2 && (z || !zzb2 || zzc) && !zzs);
                ls3Var2.m16606d(8, (z2 || zzs) ? false : true);
                ls3Var2.m16606d(9, m17121o2 && (z2 || (zzb2 && zza2)) && !zzs);
                ls3Var2.m16606d(10, z42);
                ls3Var2.m16606d(11, (zzc || zzs) ? false : true);
                ls3Var2.m16606d(12, (zzc || zzs) ? false : false);
                return ls3Var2.m16605e();
            }
        }
        z = false;
        zzn = gf8Var.zzn();
        if (!zzn.m17121o()) {
        }
        z2 = false;
        boolean zzb22 = ty3Var.zzb();
        boolean zza22 = ty3Var.zza();
        boolean m17121o22 = ty3Var.zzn().m17121o();
        ls3 ls3Var22 = new ls3();
        ls3Var22.m16608b(lu3Var);
        boolean z422 = !zzs;
        ls3Var22.m16606d(4, z422);
        ls3Var22.m16606d(5, (zzc || zzs) ? false : true);
        ls3Var22.m16606d(6, (z || zzs) ? false : true);
        ls3Var22.m16606d(7, m17121o22 && (z || !zzb22 || zzc) && !zzs);
        ls3Var22.m16606d(8, (z2 || zzs) ? false : true);
        ls3Var22.m16606d(9, m17121o22 && (z2 || (zzb22 && zza22)) && !zzs);
        ls3Var22.m16606d(10, z422);
        ls3Var22.m16606d(11, (zzc || zzs) ? false : true);
        ls3Var22.m16606d(12, (zzc || zzs) ? false : false);
        return ls3Var22.m16605e();
    }

    /* renamed from: g0 */
    public static long m19392g0(long j, long j2, long j3) {
        if (j3 < j2 || j3 % j2 != 0) {
            if (j3 >= j2 || j2 % j3 != 0) {
                double d = j;
                double d2 = j2;
                double d3 = j3;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                return (long) (d * (d2 / d3));
            }
            return j * (j2 / j3);
        }
        return j / (j3 / j2);
    }

    @EnsuresNonNull({"#1"})
    /* renamed from: h */
    public static Object m19391h(Object obj) {
        return obj;
    }

    /* renamed from: h0 */
    public static long m19390h0(long j, long j2, long j3) {
        long j4 = j - j2;
        if (((j ^ j4) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j4;
    }

    /* renamed from: i */
    public static String m19389i(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: i0 */
    public static long m19388i0(int i, int i2) {
        return (i2 & 4294967295L) | ((i & 4294967295L) << 32);
    }

    /* renamed from: j */
    public static String m19387j(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, cy6.f6275c);
    }

    /* renamed from: j0 */
    public static long m19386j0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: k */
    public static String m19385k(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: l */
    public static String m19384l(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return wx6.m5725b(networkCountryIso);
            }
        }
        return wx6.m5725b(Locale.getDefault().getCountry());
    }

    /* renamed from: m */
    public static String m19383m(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "YES";
                        }
                        throw new IllegalStateException();
                    }
                    return "NO_EXCEEDS_CAPABILITIES";
                }
                return "NO_UNSUPPORTED_DRM";
            }
            return "NO_UNSUPPORTED_TYPE";
        }
        return "NO";
    }

    /* renamed from: n */
    public static String m19382n(Locale locale) {
        return f13991a >= 21 ? locale.toLanguageTag() : locale.toString();
    }

    /* renamed from: o */
    public static String m19381o(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    /* renamed from: p */
    public static String m19380p(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String m5726a = wx6.m5726a(str);
        int i = 0;
        String str2 = m5726a.split("-", 2)[0];
        if (f14001k == null) {
            f14001k = m19421K();
        }
        String str3 = (String) f14001k.get(str2);
        if (str3 != null) {
            m5726a = str3.concat(String.valueOf(m5726a.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return m5726a;
        }
        while (true) {
            String[] strArr = f14003m;
            int length = strArr.length;
            if (i >= 18) {
                return m5726a;
            }
            if (m5726a.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(m5726a.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    /* renamed from: q */
    public static ExecutorService m19379q(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.daaw.fs5
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, str);
            }
        });
    }

    /* renamed from: r */
    public static void m19378r(long[] jArr, long j, long j2) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        } else {
            double d = j2;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        }
    }

    /* renamed from: s */
    public static void m19377s(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: t */
    public static boolean m19376t(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: u */
    public static boolean m19375u(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: v */
    public static boolean m19374v(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: w */
    public static boolean m19373w(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: x */
    public static boolean m19372x(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: y */
    public static boolean m19371y(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
                return true;
            }
            return handler.post(runnable);
        }
        return false;
    }

    /* renamed from: z */
    public static boolean m19370z(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
