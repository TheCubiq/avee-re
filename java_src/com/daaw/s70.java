package com.daaw;
/* loaded from: classes.dex */
public class s70 {

    /* renamed from: c */
    public static tw1<Integer, Integer, ee0, Boolean> f25949c = new tw1<>();

    /* renamed from: d */
    public static final Object f25950d = new Object();

    /* renamed from: e */
    public static volatile s70 f25951e = null;

    /* renamed from: a */
    public int f25952a = -1;

    /* renamed from: b */
    public final l91[] f25953b = new l91[2];

    public s70() {
        int i = 0;
        while (true) {
            l91[] l91VarArr = this.f25953b;
            if (i >= l91VarArr.length) {
                m10604e(this.f25952a, true);
                return;
            } else {
                l91VarArr[i] = new l91(i);
                i++;
            }
        }
    }

    /* renamed from: a */
    public static s70 m10608a() {
        s70 s70Var;
        s70 s70Var2 = f25951e;
        if (s70Var2 != null) {
            return s70Var2;
        }
        synchronized (f25950d) {
            if (f25951e == null) {
                f25951e = new s70();
            }
            s70Var = f25951e;
        }
        return s70Var;
    }

    /* renamed from: c */
    public static s70 m10606c() {
        return f25951e;
    }

    /* renamed from: b */
    public ee0 m10607b() {
        return m10605d(this.f25952a);
    }

    /* renamed from: d */
    public l91 m10605d(int i) {
        if (i >= 0) {
            l91[] l91VarArr = this.f25953b;
            if (i >= l91VarArr.length) {
                return null;
            }
            return l91VarArr[i];
        }
        return null;
    }

    /* renamed from: e */
    public void m10604e(int i, boolean z) {
        i = (i < 0 || i >= this.f25953b.length) ? -1 : -1;
        f25949c.m8756a(Integer.valueOf(this.f25952a), Integer.valueOf(i), i >= 0 ? this.f25953b[i] : null, Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void m10603f(int i, String str) {
        if (i >= 0) {
            l91[] l91VarArr = this.f25953b;
            if (i < l91VarArr.length && !l91VarArr[i].f17150f.equals(str)) {
                this.f25953b[i].f17150f = str == null ? "" : new String(str);
                m10604e(i, true);
            }
        }
    }

    /* renamed from: g */
    public void m10602g(String str) {
        m10603f(this.f25952a, str);
    }

    /* renamed from: h */
    public void m10601h(int i) {
        this.f25952a = (i < 0 || i >= this.f25953b.length) ? -1 : -1;
        m10604e(this.f25952a, false);
    }

    /* renamed from: i */
    public void m10600i(int i, boolean z, String str, sd0 sd0Var) {
        if (i >= 0) {
            l91[] l91VarArr = this.f25953b;
            if (i >= l91VarArr.length) {
                return;
            }
            sd0 sd0Var2 = l91VarArr[i].f18682c;
            if (sd0Var2 == null || !sd0Var2.equals(sd0Var)) {
                this.f25953b[i].f17150f = "";
            }
            l91[] l91VarArr2 = this.f25953b;
            l91VarArr2[i].f18680a = z;
            l91VarArr2[i].f18681b = str;
            l91VarArr2[i].f18682c = sd0Var;
            m10604e(i, true);
        }
    }
}
