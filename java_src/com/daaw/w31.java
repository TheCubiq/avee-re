package com.daaw;
/* loaded from: classes.dex */
public class w31 {
    public int a;
    public le0[] b;
    public qr1 c;
    public g0<y31, sr1, w31> d;
    public qc0 e;
    public int f;
    public boolean[] g;

    public w31() {
        this.b = new le0[]{null, null};
        this.g = new boolean[]{false, false};
        h();
    }

    public w31(int i, qc0 qc0Var, qr1 qr1Var, g0<y31, sr1, w31> g0Var) {
        this(i, qc0Var, qr1Var, g0Var, 1);
    }

    public w31(int i, qc0 qc0Var, qr1 qr1Var, g0<y31, sr1, w31> g0Var, int i2) {
        le0[] le0VarArr = {null, null};
        this.b = le0VarArr;
        this.g = new boolean[]{false, false};
        this.a = i;
        le0VarArr[0] = qc0Var != null ? qc0Var.d() : null;
        this.b[1] = null;
        this.c = qr1Var;
        this.d = g0Var;
        this.f = i2;
        this.g[0] = qc0Var != null && qc0Var.g();
        boolean[] zArr = this.g;
        zArr[1] = zArr[0];
        this.e = qc0Var == null ? z6.i : qc0Var;
    }

    public w31(int i, qc0[] qc0VarArr, qr1 qr1Var, g0<y31, sr1, w31> g0Var) {
        this(i, qc0VarArr, qr1Var, g0Var, 1);
    }

    public w31(int i, qc0[] qc0VarArr, qr1 qr1Var, g0<y31, sr1, w31> g0Var, int i2) {
        le0[] le0VarArr = {null, null};
        this.b = le0VarArr;
        this.g = new boolean[]{false, false};
        this.a = i;
        le0VarArr[0] = qc0VarArr[0] != null ? qc0VarArr[0].d() : null;
        this.b[1] = qc0VarArr[1] != null ? qc0VarArr[1].d() : null;
        this.c = qr1Var;
        this.d = g0Var;
        this.f = i2;
        this.g[0] = qc0VarArr[0] != null && qc0VarArr[0].g();
        this.g[1] = qc0VarArr[1] != null && qc0VarArr[1].g();
        this.e = qc0VarArr[0] != null ? qc0VarArr[0] : z6.i;
    }

    public void a(w31 w31Var) {
        this.a = w31Var.a;
        this.c = w31Var.c;
        this.d = w31Var.d;
        int i = 0;
        int i2 = 0;
        while (true) {
            le0[] le0VarArr = this.b;
            if (i2 >= le0VarArr.length) {
                break;
            }
            le0VarArr[i2] = w31Var.b[i2];
            i2++;
        }
        this.f = w31Var.f;
        while (true) {
            boolean[] zArr = this.g;
            if (i >= zArr.length) {
                this.e = w31Var.e;
                return;
            } else {
                zArr[i] = w31Var.g[i];
                i++;
            }
        }
    }

    public boolean b(w31 w31Var) {
        if (w31Var.a != this.a || w31Var.f != this.f || !br1.g(w31Var.c, this.c) || !br1.g(w31Var.d, this.d)) {
            return false;
        }
        int i = 0;
        while (true) {
            le0[] le0VarArr = this.b;
            if (i >= le0VarArr.length) {
                return true;
            }
            if (!br1.g(le0VarArr[i], w31Var.b[i])) {
                return false;
            }
            i++;
        }
    }

    public le0 c(int i) {
        return this.b[i];
    }

    public int d() {
        return this.b.length;
    }

    public boolean e(int i) {
        return this.g[i];
    }

    public qc0 f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public void h() {
        this.d = null;
        this.c = null;
        this.a = 0;
        int i = 0;
        while (true) {
            le0[] le0VarArr = this.b;
            if (i >= le0VarArr.length) {
                break;
            }
            le0VarArr[i] = null;
            i++;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.g;
            if (i2 >= zArr.length) {
                this.e = z6.i;
                this.f = 2;
                return;
            }
            zArr[i2] = false;
            i2++;
        }
    }

    public float i(float f) {
        return this.e.e(f);
    }

    public float j(float f) {
        return this.e.b(f);
    }

    public float k() {
        return this.e.f();
    }
}
