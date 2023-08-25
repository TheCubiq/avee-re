package com.daaw;

import android.content.Context;
import java.util.Locale;
/* loaded from: classes.dex */
public class xn0 {
    public String a;
    public bs1 b = new bs1(0.0f, 0.0f);
    public bs1 c = new bs1(0.0f, 0.0f);

    public xn0(xn0 xn0Var) {
        this.a = xn0Var.a;
        bs1 bs1Var = this.b;
        bs1 bs1Var2 = xn0Var.b;
        bs1Var.a = bs1Var2.a;
        bs1Var.b = bs1Var2.b;
        c();
    }

    public xn0(String str, float f) {
        this.a = str;
        bs1 bs1Var = this.b;
        bs1Var.a = f;
        bs1Var.b = f;
        c();
    }

    public xn0(String str, float f, float f2) {
        this.a = str;
        bs1 bs1Var = this.b;
        bs1Var.a = f;
        bs1Var.b = f2;
        c();
    }

    public xn0(String str, bs1 bs1Var) {
        this.a = str;
        bs1 bs1Var2 = this.b;
        bs1Var2.a = bs1Var.a;
        bs1Var2.b = bs1Var.b;
        c();
    }

    public static final xn0 a() {
        return new xn0("Nothing", 0.5f, 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        return r6.d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.daaw.xn0 b(java.lang.String r5, com.daaw.xn0 r6) {
        /*
            java.lang.String r0 = " "
            r1 = 0
            if (r5 != 0) goto Lc
            if (r6 == 0) goto Lb
            com.daaw.xn0 r1 = r6.clone()
        Lb:
            return r1
        Lc:
            int r2 = r5.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L3f
            int r3 = r2 + 1
            int r0 = r5.indexOf(r0, r3)     // Catch: java.lang.NumberFormatException -> L3f
            if (r2 < 0) goto L38
            if (r0 >= 0) goto L1b
            goto L38
        L1b:
            r4 = 0
            java.lang.String r2 = r5.substring(r4, r2)     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.String r3 = r5.substring(r3, r0)     // Catch: java.lang.NumberFormatException -> L3f
            int r0 = r0 + 1
            java.lang.String r5 = r5.substring(r0)     // Catch: java.lang.NumberFormatException -> L3f
            com.daaw.xn0 r0 = new com.daaw.xn0     // Catch: java.lang.NumberFormatException -> L3f
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L3f
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L3f
            r0.<init>(r2, r3, r5)     // Catch: java.lang.NumberFormatException -> L3f
            return r0
        L38:
            if (r6 == 0) goto L3e
            com.daaw.xn0 r1 = r6.clone()     // Catch: java.lang.NumberFormatException -> L3f
        L3e:
            return r1
        L3f:
            if (r6 == 0) goto L46
            com.daaw.xn0 r1 = r6.clone()
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xn0.b(java.lang.String, com.daaw.xn0):com.daaw.xn0");
    }

    public final void c() {
        String str = this.a;
        if (str == null || str.length() < 1) {
            this.a = "";
        }
    }

    /* renamed from: d */
    public xn0 clone() {
        String str = this.a;
        bs1 bs1Var = this.b;
        return new xn0(str, bs1Var.a, bs1Var.b);
    }

    public String e() {
        return this.a;
    }

    public float f() {
        return this.b.a;
    }

    public bs1 g() {
        return this.b;
    }

    public String h(Context context) {
        int a = wn0.a(this.a);
        return (a <= 0 || context == null) ? this.a : context.getString(a);
    }

    public float i(aq0 aq0Var) {
        bs1 n = aq0Var.n(this.a, this.b, this.c);
        this.c = n;
        return n.a;
    }

    public float j(aq0 aq0Var, float f) {
        bs1 bs1Var = this.c;
        bs1Var.a = f;
        bs1Var.b = f;
        bs1 n = aq0Var.n(this.a, this.b, bs1Var);
        this.c = n;
        return n.a;
    }

    public String k(aq0 aq0Var) {
        return aq0Var.m(this.a);
    }

    public bs1 l(aq0 aq0Var) {
        bs1 n = aq0Var.n(this.a, this.b, this.c);
        this.c = n;
        return n;
    }

    public void m(un unVar, String str, float f) {
        n(unVar, str, f, f);
    }

    public void n(un unVar, String str, float f, float f2) {
        if (unVar == null) {
            return;
        }
        this.a = unVar.h("measureWhat").C(str);
        this.b.a = unVar.o("A", f);
        this.b.b = unVar.o("B", f2);
        c();
    }

    public void o(un unVar) {
        unVar.F("measureWhat", this.a, "misc", wn0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        unVar.P("A", this.b.a, "misc", 0.0f, 1.0f, wn0.b(this.a));
        unVar.P("B", this.b.b, "misc", 0.0f, 1.0f, wn0.c(this.a));
    }

    public void p(un unVar) {
        unVar.F("measureWhat", this.a, "misc", new String[]{"Nothing", "BeatCamShakeMore", "BeatCamShakeLess", "BeatRandomShake", "ConstantShakeMore", "ConstantShake", "TrackPosition"});
        if (this.a.equals("Nothing")) {
            return;
        }
        unVar.P("A", this.b.a, "misc", 0.0f, 2.0f, wn0.b(this.a));
        unVar.P("B", this.b.b, "misc", 0.0f, 2.0f, wn0.c(this.a));
    }

    public void q(un unVar) {
        unVar.F("measureWhat", this.a, "misc", wn0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        unVar.P("A", this.b.a, "misc", -1.0f, 1.0f, wn0.b(this.a));
        unVar.P("B", this.b.b, "misc", -1.0f, 1.0f, wn0.c(this.a));
    }

    public void r(un unVar) {
        unVar.F("measureWhat", this.a, "misc", wn0.c);
        if (this.a.equals("Nothing")) {
            return;
        }
        unVar.P("A", this.b.a, "misc", 0.0f, 2.0f, wn0.b(this.a));
        unVar.P("B", this.b.b, "misc", 0.0f, 2.0f, wn0.c(this.a));
    }

    public void s(StringBuilder sb, boolean z, Context context) {
        String format;
        if (!"Constant".equals(this.a) && !"Nothing".equals(this.a)) {
            sb.append(h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.a)));
            sb.append(" ");
            format = String.format(locale, "%.3f", Float.valueOf(this.b.b));
        } else if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.a)));
            sb.append(" ");
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.b)));
            return;
        } else {
            sb.append("(");
            Locale locale3 = Locale.US;
            sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.a)));
            sb.append(" ");
            format = String.format(locale3, "%.3f", Float.valueOf(this.b.b));
        }
        sb.append(format);
        sb.append(")");
    }

    public void t(StringBuilder sb, boolean z, Context context) {
        String format;
        boolean d = wn0.d(this.a);
        if (!"Constant".equals(this.a) && !"Nothing".equals(this.a)) {
            sb.append(h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.b.a)));
            if (d) {
                sb.append(" ");
                format = String.format(locale, "%.3f", Float.valueOf(this.b.b));
                sb.append(format);
            }
            sb.append(")");
        } else if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.a)));
            if (d) {
                sb.append(" ");
                sb.append(String.format(locale2, "%.3f", Float.valueOf(this.b.b)));
            }
        } else {
            sb.append("(");
            Locale locale3 = Locale.US;
            sb.append(String.format(locale3, "%.3f", Float.valueOf(this.b.a)));
            if (d) {
                sb.append(" ");
                format = String.format(locale3, "%.3f", Float.valueOf(this.b.b));
                sb.append(format);
            }
            sb.append(")");
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s %f %f", this.a, Float.valueOf(this.b.a), Float.valueOf(this.b.b));
    }

    public void u(StringBuilder sb) {
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.b.a);
        sb.append(" ");
        sb.append(this.b.b);
    }
}
