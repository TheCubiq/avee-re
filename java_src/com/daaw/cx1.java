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
    public static final Pattern b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern c = Pattern.compile("(\\S+?):(\\S+)");
    public final StringBuilder a = new StringBuilder();

    /* loaded from: classes.dex */
    public static final class a {
        public static final String[] e = new String[0];
        public final String a;
        public final int b;
        public final String c;
        public final String[] d;

        public a(String str, int i, String str2, String[] strArr) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = strArr;
        }

        public static a a(String str, int i) {
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
            String[] W = sq1.W(trim, "\\.");
            return new a(W[0], i, str2, W.length > 1 ? (String[]) Arrays.copyOfRange(W, 1, W.length) : e);
        }

        public static a b() {
            return new a("", 0, "", new String[0]);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {
        public final int p;
        public final ax1 q;

        public b(int i, ax1 ax1Var) {
            this.p = i;
            this.q = ax1Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            return this.p - bVar.p;
        }
    }

    public static void a(String str, SpannableStringBuilder spannableStringBuilder) {
        char c2;
        str.hashCode();
        char c3 = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c3 = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c3 = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c3 = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c3 = 3;
                    break;
                }
                break;
        }
        switch (c3) {
            case 0:
                c2 = '>';
                break;
            case 1:
                c2 = '<';
                break;
            case 2:
                c2 = '&';
                break;
            case 3:
                c2 = ' ';
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("ignoring unsupported entity: '&");
                sb.append(str);
                sb.append(";'");
                return;
        }
        spannableStringBuilder.append(c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0089 A[LOOP:0: B:41:0x0087->B:42:0x0089, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r8, com.daaw.cx1.a r9, android.text.SpannableStringBuilder r10, java.util.List<com.daaw.ax1> r11, java.util.List<com.daaw.cx1.b> r12) {
        /*
            int r0 = r9.b
            int r1 = r10.length()
            java.lang.String r2 = r9.a
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = -1
            switch(r3) {
                case 0: goto L59;
                case 98: goto L4e;
                case 99: goto L43;
                case 105: goto L38;
                case 117: goto L2d;
                case 118: goto L22;
                case 3314158: goto L17;
                default: goto L16;
            }
        L16:
            goto L63
        L17:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            goto L63
        L20:
            r7 = 6
            goto L63
        L22:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            goto L63
        L2b:
            r7 = 5
            goto L63
        L2d:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            goto L63
        L36:
            r7 = 4
            goto L63
        L38:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            goto L63
        L41:
            r7 = 3
            goto L63
        L43:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            goto L63
        L4c:
            r7 = 2
            goto L63
        L4e:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L57
            goto L63
        L57:
            r7 = 1
            goto L63
        L59:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            r2 = 33
            switch(r7) {
                case 0: goto L7d;
                case 1: goto L75;
                case 2: goto L7d;
                case 3: goto L6f;
                case 4: goto L69;
                case 5: goto L7d;
                case 6: goto L7d;
                default: goto L68;
            }
        L68:
            return
        L69:
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            goto L7a
        L6f:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r4)
            goto L7a
        L75:
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r6)
        L7a:
            r10.setSpan(r3, r0, r1, r2)
        L7d:
            r12.clear()
            e(r11, r8, r9, r12)
            int r8 = r12.size()
        L87:
            if (r5 >= r8) goto L97
            java.lang.Object r9 = r12.get(r5)
            com.daaw.cx1$b r9 = (com.daaw.cx1.b) r9
            com.daaw.ax1 r9 = r9.q
            c(r10, r9, r0, r1)
            int r5 = r5 + 1
            goto L87
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cx1.b(java.lang.String, com.daaw.cx1$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, ax1 ax1Var, int i, int i2) {
        Object absoluteSizeSpan;
        if (ax1Var == null) {
            return;
        }
        if (ax1Var.g() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(ax1Var.g()), i, i2, 33);
        }
        if (ax1Var.k()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (ax1Var.l()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (ax1Var.j()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(ax1Var.b()), i, i2, 33);
        }
        if (ax1Var.i()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(ax1Var.a()), i, i2, 33);
        }
        if (ax1Var.c() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(ax1Var.c()), i, i2, 33);
        }
        if (ax1Var.h() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(ax1Var.h()), i, i2, 33);
        }
        int e = ax1Var.e();
        if (e == 1) {
            absoluteSizeSpan = new AbsoluteSizeSpan((int) ax1Var.d(), true);
        } else if (e == 2) {
            absoluteSizeSpan = new RelativeSizeSpan(ax1Var.d());
        } else if (e != 3) {
            return;
        } else {
            absoluteSizeSpan = new RelativeSizeSpan(ax1Var.d() / 100.0f);
        }
        spannableStringBuilder.setSpan(absoluteSizeSpan, i, i2, 33);
    }

    public static int d(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static void e(List<ax1> list, String str, a aVar, List<b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ax1 ax1Var = list.get(i);
            int f = ax1Var.f(str, aVar.a, aVar.d, aVar.c);
            if (f > 0) {
                list2.add(new b(f, ax1Var));
            }
        }
        Collections.sort(list2);
    }

    public static String f(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return sq1.X(trim, "[ \\.]")[0];
    }

    public static boolean g(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case p21.Q0 /* 98 */:
                if (str.equals("b")) {
                    c2 = 0;
                    break;
                }
                break;
            case p21.R0 /* 99 */:
                if (str.equals("c")) {
                    c2 = 1;
                    break;
                }
                break;
            case 105:
                if (str.equals("i")) {
                    c2 = 2;
                    break;
                }
                break;
            case x21.D0 /* 117 */:
                if (str.equals("u")) {
                    c2 = 3;
                    break;
                }
                break;
            case x21.E0 /* 118 */:
                if (str.equals("v")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
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

    public static boolean i(String str, Matcher matcher, rv0 rv0Var, bx1.b bVar, StringBuilder sb, List<ax1> list) {
        try {
            bVar.j(fx1.c(matcher.group(1))).d(fx1.c(matcher.group(2)));
            j(matcher.group(3), bVar);
            sb.setLength(0);
            while (true) {
                String k = rv0Var.k();
                if (TextUtils.isEmpty(k)) {
                    k(str, sb.toString(), bVar, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(k.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            return false;
        }
    }

    public static void j(String str, bx1.b bVar) {
        Matcher matcher = c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    l(group2, bVar);
                } else if ("align".equals(group)) {
                    bVar.l(o(group2));
                } else if ("position".equals(group)) {
                    n(group2, bVar);
                } else if ("size".equals(group)) {
                    bVar.m(fx1.b(group2));
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

    public static void k(String str, String str2, bx1.b bVar, List<ax1> list) {
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
                    a(str2.substring(i, indexOf), spannableStringBuilder);
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
                    i2 = d(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    String f = f(substring);
                    if (f != null && g(f)) {
                        if (z) {
                            while (!arrayDeque.isEmpty()) {
                                a aVar = (a) arrayDeque.pop();
                                b(str, aVar, spannableStringBuilder, list, arrayList);
                                if (aVar.a.equals(f)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            arrayDeque.push(a.a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            b(str, (a) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
        }
        b(str, a.b(), spannableStringBuilder, list, arrayList);
        bVar.k(spannableStringBuilder);
    }

    public static void l(String str, bx1.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.f(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.f(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            bVar.e(fx1.b(str)).g(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        bVar.e(parseInt).g(1);
    }

    public static int m(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
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

    public static void n(String str, bx1.b bVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            bVar.i(m(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            bVar.i(Integer.MIN_VALUE);
        }
        bVar.h(fx1.b(str));
    }

    public static Layout.Alignment o(String str) {
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c2 = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c2 = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c2 = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c2 = 5;
                    break;
                }
                break;
        }
        switch (c2) {
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

    public boolean h(rv0 rv0Var, bx1.b bVar, List<ax1> list) {
        String k = rv0Var.k();
        if (k == null) {
            return false;
        }
        Pattern pattern = b;
        Matcher matcher = pattern.matcher(k);
        if (matcher.matches()) {
            return i(null, matcher, rv0Var, bVar, this.a, list);
        }
        String k2 = rv0Var.k();
        if (k2 == null) {
            return false;
        }
        Matcher matcher2 = pattern.matcher(k2);
        if (matcher2.matches()) {
            return i(k.trim(), matcher2, rv0Var, bVar, this.a, list);
        }
        return false;
    }
}
