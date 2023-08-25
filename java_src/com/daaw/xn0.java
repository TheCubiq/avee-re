package com.daaw;

import android.content.Context;
import java.util.Locale;
/* loaded from: classes.dex */
public class xn0 {

    /* renamed from: a */
    public String f32822a;

    /* renamed from: b */
    public bs1 f32823b = new bs1(0.0f, 0.0f);

    /* renamed from: c */
    public bs1 f32824c = new bs1(0.0f, 0.0f);

    public xn0(xn0 xn0Var) {
        this.f32822a = xn0Var.f32822a;
        bs1 bs1Var = this.f32823b;
        bs1 bs1Var2 = xn0Var.f32823b;
        bs1Var.f5090a = bs1Var2.f5090a;
        bs1Var.f5091b = bs1Var2.f5091b;
        m4970c();
    }

    public xn0(String str, float f) {
        this.f32822a = str;
        bs1 bs1Var = this.f32823b;
        bs1Var.f5090a = f;
        bs1Var.f5091b = f;
        m4970c();
    }

    public xn0(String str, float f, float f2) {
        this.f32822a = str;
        bs1 bs1Var = this.f32823b;
        bs1Var.f5090a = f;
        bs1Var.f5091b = f2;
        m4970c();
    }

    public xn0(String str, bs1 bs1Var) {
        this.f32822a = str;
        bs1 bs1Var2 = this.f32823b;
        bs1Var2.f5090a = bs1Var.f5090a;
        bs1Var2.f5091b = bs1Var.f5091b;
        m4970c();
    }

    /* renamed from: a */
    public static final xn0 m4972a() {
        return new xn0("Nothing", 0.5f, 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        return r6.m4969d();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xn0 m4971b(String str, xn0 xn0Var) {
        if (str == null) {
            if (xn0Var != null) {
                return xn0Var.clone();
            }
            return null;
        }
        try {
            int indexOf = str.indexOf(" ");
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(" ", i);
            if (indexOf >= 0 && indexOf2 >= 0) {
                return new xn0(str.substring(0, indexOf), Float.parseFloat(str.substring(i, indexOf2)), Float.parseFloat(str.substring(indexOf2 + 1)));
            }
            return null;
        } catch (NumberFormatException unused) {
            if (xn0Var != null) {
                return xn0Var.clone();
            }
            return null;
        }
    }

    /* renamed from: c */
    public final void m4970c() {
        String str = this.f32822a;
        if (str == null || str.length() < 1) {
            this.f32822a = "";
        }
    }

    /* renamed from: d */
    public xn0 clone() {
        String str = this.f32822a;
        bs1 bs1Var = this.f32823b;
        return new xn0(str, bs1Var.f5090a, bs1Var.f5091b);
    }

    /* renamed from: e */
    public String m4968e() {
        return this.f32822a;
    }

    /* renamed from: f */
    public float m4967f() {
        return this.f32823b.f5090a;
    }

    /* renamed from: g */
    public bs1 m4966g() {
        return this.f32823b;
    }

    /* renamed from: h */
    public String m4965h(Context context) {
        int m5945a = wn0.m5945a(this.f32822a);
        return (m5945a <= 0 || context == null) ? this.f32822a : context.getString(m5945a);
    }

    /* renamed from: i */
    public float m4964i(aq0 aq0Var) {
        bs1 m27211n = aq0Var.m27211n(this.f32822a, this.f32823b, this.f32824c);
        this.f32824c = m27211n;
        return m27211n.f5090a;
    }

    /* renamed from: j */
    public float m4963j(aq0 aq0Var, float f) {
        bs1 bs1Var = this.f32824c;
        bs1Var.f5090a = f;
        bs1Var.f5091b = f;
        bs1 m27211n = aq0Var.m27211n(this.f32822a, this.f32823b, bs1Var);
        this.f32824c = m27211n;
        return m27211n.f5090a;
    }

    /* renamed from: k */
    public String m4962k(aq0 aq0Var) {
        return aq0Var.m27212m(this.f32822a);
    }

    /* renamed from: l */
    public bs1 m4961l(aq0 aq0Var) {
        bs1 m27211n = aq0Var.m27211n(this.f32822a, this.f32823b, this.f32824c);
        this.f32824c = m27211n;
        return m27211n;
    }

    /* renamed from: m */
    public void m4960m(C3239un c3239un, String str, float f) {
        m4959n(c3239un, str, f, f);
    }

    /* renamed from: n */
    public void m4959n(C3239un c3239un, String str, float f, float f2) {
        if (c3239un == null) {
            return;
        }
        this.f32822a = c3239un.m7967h("measureWhat").m8002C(str);
        this.f32823b.f5090a = c3239un.m7953o("A", f);
        this.f32823b.f5091b = c3239un.m7953o("B", f2);
        m4970c();
    }

    /* renamed from: o */
    public void m4958o(C3239un c3239un) {
        c3239un.add_Dropdown("measureWhat", this.f32822a, "misc", wn0.f31384c);
        if (this.f32822a.equals("Nothing")) {
            return;
        }
        c3239un.m7989P("A", this.f32823b.f5090a, "misc", 0.0f, 1.0f, wn0.m5944b(this.f32822a));
        c3239un.m7989P("B", this.f32823b.f5091b, "misc", 0.0f, 1.0f, wn0.m5943c(this.f32822a));
    }

    /* renamed from: p */
    public void m4957p(C3239un c3239un) {
        c3239un.add_Dropdown("measureWhat", this.f32822a, "misc", new String[]{"Nothing", "BeatCamShakeMore", "BeatCamShakeLess", "BeatRandomShake", "ConstantShakeMore", "ConstantShake", "TrackPosition"});
        if (this.f32822a.equals("Nothing")) {
            return;
        }
        c3239un.m7989P("A", this.f32823b.f5090a, "misc", 0.0f, 2.0f, wn0.m5944b(this.f32822a));
        c3239un.m7989P("B", this.f32823b.f5091b, "misc", 0.0f, 2.0f, wn0.m5943c(this.f32822a));
    }

    /* renamed from: q */
    public void m4956q(C3239un c3239un) {
        c3239un.add_Dropdown("measureWhat", this.f32822a, "misc", wn0.f31384c);
        if (this.f32822a.equals("Nothing")) {
            return;
        }
        c3239un.m7989P("A", this.f32823b.f5090a, "misc", -1.0f, 1.0f, wn0.m5944b(this.f32822a));
        c3239un.m7989P("B", this.f32823b.f5091b, "misc", -1.0f, 1.0f, wn0.m5943c(this.f32822a));
    }

    /* renamed from: r */
    public void m4955r(C3239un c3239un) {
        c3239un.add_Dropdown("measureWhat", this.f32822a, "misc", wn0.f31384c);
        if (this.f32822a.equals("Nothing")) {
            return;
        }
        c3239un.m7989P("A", this.f32823b.f5090a, "misc", 0.0f, 2.0f, wn0.m5944b(this.f32822a));
        c3239un.m7989P("B", this.f32823b.f5091b, "misc", 0.0f, 2.0f, wn0.m5943c(this.f32822a));
    }

    /* renamed from: s */
    public void m4954s(StringBuilder sb, boolean z, Context context) {
        String format;
        if (!"Constant".equals(this.f32822a) && !"Nothing".equals(this.f32822a)) {
            sb.append(m4965h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            sb.append(" ");
            format = String.format(locale, "%.3f", Float.valueOf(this.f32823b.f5091b));
        } else if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            sb.append(" ");
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.f32823b.f5091b)));
            return;
        } else {
            sb.append("(");
            Locale locale3 = Locale.US;
            sb.append(String.format(locale3, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            sb.append(" ");
            format = String.format(locale3, "%.3f", Float.valueOf(this.f32823b.f5091b));
        }
        sb.append(format);
        sb.append(")");
    }

    /* renamed from: t */
    public void m4953t(StringBuilder sb, boolean z, Context context) {
        String format;
        boolean m5942d = wn0.m5942d(this.f32822a);
        if (!"Constant".equals(this.f32822a) && !"Nothing".equals(this.f32822a)) {
            sb.append(m4965h(context));
            sb.append("(");
            Locale locale = Locale.US;
            sb.append(String.format(locale, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            if (m5942d) {
                sb.append(" ");
                format = String.format(locale, "%.3f", Float.valueOf(this.f32823b.f5091b));
                sb.append(format);
            }
            sb.append(")");
        } else if (z) {
            Locale locale2 = Locale.US;
            sb.append(String.format(locale2, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            if (m5942d) {
                sb.append(" ");
                sb.append(String.format(locale2, "%.3f", Float.valueOf(this.f32823b.f5091b)));
            }
        } else {
            sb.append("(");
            Locale locale3 = Locale.US;
            sb.append(String.format(locale3, "%.3f", Float.valueOf(this.f32823b.f5090a)));
            if (m5942d) {
                sb.append(" ");
                format = String.format(locale3, "%.3f", Float.valueOf(this.f32823b.f5091b));
                sb.append(format);
            }
            sb.append(")");
        }
    }

    public String toString() {
        return String.format(Locale.US, "%s %f %f", this.f32822a, Float.valueOf(this.f32823b.f5090a), Float.valueOf(this.f32823b.f5091b));
    }

    /* renamed from: u */
    public void m4952u(StringBuilder sb) {
        sb.append(this.f32822a);
        sb.append(" ");
        sb.append(this.f32823b.f5090a);
        sb.append(" ");
        sb.append(this.f32823b.f5091b);
    }
}
