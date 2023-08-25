package com.daaw;
/* loaded from: classes.dex */
public class s70 {
    public static tw1<Integer, Integer, ee0, Boolean> c = new tw1<>();
    public static final Object d = new Object();
    public static volatile s70 e = null;
    public int a = -1;
    public final l91[] b = new l91[2];

    public s70() {
        int i = 0;
        while (true) {
            l91[] l91VarArr = this.b;
            if (i >= l91VarArr.length) {
                e(this.a, true);
                return;
            } else {
                l91VarArr[i] = new l91(i);
                i++;
            }
        }
    }

    public static s70 a() {
        s70 s70Var;
        s70 s70Var2 = e;
        if (s70Var2 != null) {
            return s70Var2;
        }
        synchronized (d) {
            if (e == null) {
                e = new s70();
            }
            s70Var = e;
        }
        return s70Var;
    }

    public static s70 c() {
        return e;
    }

    public ee0 b() {
        return d(this.a);
    }

    public l91 d(int i) {
        if (i >= 0) {
            l91[] l91VarArr = this.b;
            if (i >= l91VarArr.length) {
                return null;
            }
            return l91VarArr[i];
        }
        return null;
    }

    public void e(int i, boolean z) {
        i = (i < 0 || i >= this.b.length) ? -1 : -1;
        c.a(Integer.valueOf(this.a), Integer.valueOf(i), i >= 0 ? this.b[i] : null, Boolean.valueOf(z));
    }

    public void f(int i, String str) {
        if (i >= 0) {
            l91[] l91VarArr = this.b;
            if (i < l91VarArr.length && !l91VarArr[i].f.equals(str)) {
                this.b[i].f = str == null ? "" : new String(str);
                e(i, true);
            }
        }
    }

    public void g(String str) {
        f(this.a, str);
    }

    public void h(int i) {
        this.a = (i < 0 || i >= this.b.length) ? -1 : -1;
        e(this.a, false);
    }

    public void i(int i, boolean z, String str, sd0 sd0Var) {
        if (i >= 0) {
            l91[] l91VarArr = this.b;
            if (i >= l91VarArr.length) {
                return;
            }
            sd0 sd0Var2 = l91VarArr[i].c;
            if (sd0Var2 == null || !sd0Var2.equals(sd0Var)) {
                this.b[i].f = "";
            }
            l91[] l91VarArr2 = this.b;
            l91VarArr2[i].a = z;
            l91VarArr2[i].b = str;
            l91VarArr2[i].c = sd0Var;
            e(i, true);
        }
    }
}
