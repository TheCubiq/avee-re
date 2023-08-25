package com.daaw;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.daaw.bx1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class cx1 {

    /* renamed from: b */
    public static final Pattern f6247b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c */
    public static final Pattern f6248c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a */
    public final StringBuilder f6249a = new StringBuilder();

    /* renamed from: com.daaw.cx1$a */
    /* loaded from: classes.dex */
    public static final class C1024a {

        /* renamed from: e */
        public static final String[] f6250e = new String[0];

        /* renamed from: a */
        public final String f6251a;

        /* renamed from: b */
        public final int f6252b;

        /* renamed from: c */
        public final String f6253c;

        /* renamed from: d */
        public final String[] f6254d;

        public C1024a(String str, int i, String str2, String[] strArr) {
            this.f6252b = i;
            this.f6251a = str;
            this.f6253c = str2;
            this.f6254d = strArr;
        }

        /* renamed from: a */
        public static C1024a m24916a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] m10022W = sq1.m10022W(trim, "\\.");
            return new C1024a(m10022W[0], i, str2, m10022W.length > 1 ? (String[]) Arrays.copyOfRange(m10022W, 1, m10022W.length) : f6250e);
        }

        /* renamed from: b */
        public static C1024a m24915b() {
            return new C1024a("", 0, "", new String[0]);
        }
    }

    /* renamed from: com.daaw.cx1$b */
    /* loaded from: classes.dex */
    public static final class C1025b implements Comparable<C1025b> {

        /* renamed from: p */
        public final int f6255p;

        /* renamed from: q */
        public final ax1 f6256q;

        public C1025b(int i, ax1 ax1Var) {
            this.f6255p = i;
            this.f6256q = ax1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C1025b c1025b) {
            return this.f6255p - c1025b.f6255p;
        }
    }

    /* renamed from: a */
    public static void m24931a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                c = '>';
                break;
            case 1:
                c = '<';
                break;
            case 2:
                c = '&';
                break;
            case 3:
                c = ' ';
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                return;
        }
        spannableStringBuilder.append(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[LOOP:0: B:41:0x0087->B:42:0x0089, LOOP_END] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m24930b(String str, C1024a c1024a, SpannableStringBuilder spannableStringBuilder, List<ax1> list, List<C1025b> list2) {
        int size;
        Object styleSpan;
        int i = c1024a.f6252b;
        int length = spannableStringBuilder.length();
        String str2 = c1024a.f6251a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case p21.f22310Q0 /* 98 */:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case p21.f22316R0 /* 99 */:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case 105:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case x21.f31774D0 /* 117 */:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                break;
            case x21.f31779E0 /* 118 */:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 5:
            case 6:
                list2.clear();
                m24927e(list, str, c1024a, list2);
                size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    m24929c(spannableStringBuilder, list2.get(i2).f6256q, i, length);
                }
                return;
            case 1:
                styleSpan = new StyleSpan(1);
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                list2.clear();
                m24927e(list, str, c1024a, list2);
                size = list2.size();
                while (i2 < size) {
                }
                return;
            case 3:
                styleSpan = new StyleSpan(2);
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                list2.clear();
                m24927e(list, str, c1024a, list2);
                size = list2.size();
                while (i2 < size) {
                }
                return;
            case 4:
                styleSpan = new UnderlineSpan();
                spannableStringBuilder.setSpan(styleSpan, i, length, 33);
                list2.clear();
                m24927e(list, str, c1024a, list2);
                size = list2.size();
                while (i2 < size) {
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public static void m24929c(SpannableStringBuilder spannableStringBuilder, ax1 ax1Var, int i, int i2) {
        Object absoluteSizeSpan;
        if (ax1Var == null) {
            return;
        }
        if (ax1Var.m26619g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(ax1Var.m26619g()), i, i2, 33);
        }
        if (ax1Var.m26615k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ax1Var.m26614l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ax1Var.m26616j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ax1Var.m26624b()), i, i2, 33);
        }
        if (ax1Var.m26617i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(ax1Var.m26625a()), i, i2, 33);
        }
        if (ax1Var.m26623c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(ax1Var.m26623c()), i, i2, 33);
        }
        if (ax1Var.m26618h() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(ax1Var.m26618h()), i, i2, 33);
        }
        int m26621e = ax1Var.m26621e();
        if (m26621e == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) ax1Var.m26622d(), true);
        } else if (m26621e == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(ax1Var.m26622d());
        } else if (m26621e != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(ax1Var.m26622d() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }

    /* renamed from: d */
    public static int m24928d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: e */
    public static void m24927e(List<ax1> list, String str, C1024a c1024a, List<C1025b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ax1 ax1Var = list.get(i);
            int m26620f = ax1Var.m26620f(str, c1024a.f6251a, c1024a.f6254d, c1024a.f6253c);
            if (m26620f > 0) {
                list2.add(new C1025b(m26620f, ax1Var));
            }
        }
        Collections.sort(list2);
    }

    /* renamed from: f */
    public static String m24926f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return sq1.m10021X(trim, "[ \\.]")[0];
    }

    /* renamed from: g */
    public static boolean m24925g(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case p21.f22310Q0 /* 98 */:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case p21.f22316R0 /* 99 */:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case x21.f31774D0 /* 117 */:
                if (str.equals("u")) {
                    c = 3;
                    break;
                }
                break;
            case x21.f31779E0 /* 118 */:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: i */
    public static boolean m24923i(String str, Matcher matcher, rv0 rv0Var, bx1.C0895b c0895b, StringBuilder sb, List<ax1> list) {
        try {
            c0895b.m25768j(fx1.m22152c(matcher.group(1))).m25774d(fx1.m22152c(matcher.group(2)));
            m24922j(matcher.group(3), c0895b);
            sb.setLength(0);
            while (true) {
                String m10909k = rv0Var.m10909k();
                if (TextUtils.isEmpty(m10909k)) {
                    m24921k(str, sb.toString(), c0895b, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(m10909k.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            return false;
        }
    }

    /* renamed from: j */
    public static void m24922j(String str, bx1.C0895b c0895b) {
        Matcher matcher = f6248c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m24920l(group2, c0895b);
                } else if ("align".equals(group)) {
                    c0895b.m25766l(m24917o(group2));
                } else if ("position".equals(group)) {
                    m24918n(group2, c0895b);
                } else if ("size".equals(group)) {
                    c0895b.m25765m(fx1.m22153b(group2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping bad cue setting: ");
                sb2.append(matcher.group());
            }
        }
    }

    /* renamed from: k */
    public static void m24921k(String str, String str2, bx1.C0895b c0895b, List<ax1> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m24931a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m24928d(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    String m24926f = m24926f(substring);
                    if (m24926f != null && m24925g(m24926f)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                C1024a c1024a = (C1024a) arrayDeque.pop();
                                m24930b(str, c1024a, spannableStringBuilder, list, arrayList);
                                if (c1024a.f6251a.equals(m24926f)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(C1024a.m24916a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m24930b(str, (C1024a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        m24930b(str, C1024a.m24915b(), spannableStringBuilder, list, arrayList);
        c0895b.m25767k(spannableStringBuilder);
    }

    /* renamed from: l */
    public static void m24920l(String str, bx1.C0895b c0895b) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0895b.m25772f(m24919m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c0895b.m25772f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            c0895b.m25773e(fx1.m22153b(str)).m25771g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        c0895b.m25773e(parseInt).m25771g(1);
    }

    /* renamed from: m */
    public static int m24919m(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid anchor value: ");
                sb.append(str);
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: n */
    public static void m24918n(String str, bx1.C0895b c0895b) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            c0895b.m25769i(m24919m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            c0895b.m25769i(Integer.MIN_VALUE);
        }
        c0895b.m25770h(fx1.m22153b(str));
    }

    /* renamed from: o */
    public static Layout.Alignment m24917o(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return Layout.Alignment.ALIGN_CENTER;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 3:
            case 5:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid alignment value: ");
                sb.append(str);
                return null;
        }
    }

    /* renamed from: h */
    public boolean m24924h(rv0 rv0Var, bx1.C0895b c0895b, List<ax1> list) {
        String m10909k = rv0Var.m10909k();
        if (m10909k == null) {
            return false;
        }
        Pattern pattern = f6247b;
        Matcher matcher = pattern.matcher(m10909k);
        if (matcher.matches()) {
            return m24923i(null, matcher, rv0Var, c0895b, this.f6249a, list);
        }
        String m10909k2 = rv0Var.m10909k();
        if (m10909k2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(m10909k2);
        if (matcher2.matches()) {
            return m24923i(m10909k.trim(), matcher2, rv0Var, c0895b, this.f6249a, list);
        }
        return false;
    }
}
