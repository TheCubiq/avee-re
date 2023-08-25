package com.daaw;
/* loaded from: classes.dex */
public class w31 {

    /* renamed from: a */
    public int f30857a;

    /* renamed from: b */
    public le0[] f30858b;

    /* renamed from: c */
    public qr1 f30859c;

    /* renamed from: d */
    public InterfaceC1348g0<y31, sr1, w31> f30860d;

    /* renamed from: e */
    public qc0 f30861e;

    /* renamed from: f */
    public int f30862f;

    /* renamed from: g */
    public boolean[] f30863g;

    public w31() {
        this.f30858b = new le0[]{null, null};
        this.f30863g = new boolean[]{false, false};
        m6550h();
    }

    public w31(int i, qc0 qc0Var, qr1 qr1Var, InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0) {
        this(i, qc0Var, qr1Var, interfaceC1348g0, 1);
    }

    public w31(int i, qc0 qc0Var, qr1 qr1Var, InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0, int i2) {
        le0[] le0VarArr = {null, null};
        this.f30858b = le0VarArr;
        this.f30863g = new boolean[]{false, false};
        this.f30857a = i;
        le0VarArr[0] = qc0Var != null ? qc0Var.mo2798d() : null;
        this.f30858b[1] = null;
        this.f30859c = qr1Var;
        this.f30860d = interfaceC1348g0;
        this.f30862f = i2;
        this.f30863g[0] = qc0Var != null && qc0Var.mo2795g();
        boolean[] zArr = this.f30863g;
        zArr[1] = zArr[0];
        this.f30861e = qc0Var == null ? C3812z6.f34484i : qc0Var;
    }

    public w31(int i, qc0[] qc0VarArr, qr1 qr1Var, InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0) {
        this(i, qc0VarArr, qr1Var, interfaceC1348g0, 1);
    }

    public w31(int i, qc0[] qc0VarArr, qr1 qr1Var, InterfaceC1348g0<y31, sr1, w31> interfaceC1348g0, int i2) {
        le0[] le0VarArr = {null, null};
        this.f30858b = le0VarArr;
        this.f30863g = new boolean[]{false, false};
        this.f30857a = i;
        le0VarArr[0] = qc0VarArr[0] != null ? qc0VarArr[0].mo2798d() : null;
        this.f30858b[1] = qc0VarArr[1] != null ? qc0VarArr[1].mo2798d() : null;
        this.f30859c = qr1Var;
        this.f30860d = interfaceC1348g0;
        this.f30862f = i2;
        this.f30863g[0] = qc0VarArr[0] != null && qc0VarArr[0].mo2795g();
        this.f30863g[1] = qc0VarArr[1] != null && qc0VarArr[1].mo2795g();
        this.f30861e = qc0VarArr[0] != null ? qc0VarArr[0] : C3812z6.f34484i;
    }

    /* renamed from: a */
    public void m6557a(w31 w31Var) {
        this.f30857a = w31Var.f30857a;
        this.f30859c = w31Var.f30859c;
        this.f30860d = w31Var.f30860d;
        int i = 0;
        int i2 = 0;
        while (true) {
            le0[] le0VarArr = this.f30858b;
            if (i2 >= le0VarArr.length) {
                break;
            }
            le0VarArr[i2] = w31Var.f30858b[i2];
            i2++;
        }
        this.f30862f = w31Var.f30862f;
        while (true) {
            boolean[] zArr = this.f30863g;
            if (i >= zArr.length) {
                this.f30861e = w31Var.f30861e;
                return;
            } else {
                zArr[i] = w31Var.f30863g[i];
                i++;
            }
        }
    }

    /* renamed from: b */
    public boolean m6556b(w31 w31Var) {
        if (w31Var.f30857a != this.f30857a || w31Var.f30862f != this.f30862f || !br1.m25902g(w31Var.f30859c, this.f30859c) || !br1.m25902g(w31Var.f30860d, this.f30860d)) {
            return false;
        }
        int i = 0;
        while (true) {
            le0[] le0VarArr = this.f30858b;
            if (i >= le0VarArr.length) {
                return true;
            }
            if (!br1.m25902g(le0VarArr[i], w31Var.f30858b[i])) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: c */
    public le0 m6555c(int i) {
        return this.f30858b[i];
    }

    /* renamed from: d */
    public int m6554d() {
        return this.f30858b.length;
    }

    /* renamed from: e */
    public boolean m6553e(int i) {
        return this.f30863g[i];
    }

    /* renamed from: f */
    public qc0 m6552f() {
        return this.f30861e;
    }

    /* renamed from: g */
    public int m6551g() {
        return this.f30862f;
    }

    /* renamed from: h */
    public void m6550h() {
        this.f30860d = null;
        this.f30859c = null;
        this.f30857a = 0;
        int i = 0;
        while (true) {
            le0[] le0VarArr = this.f30858b;
            if (i >= le0VarArr.length) {
                break;
            }
            le0VarArr[i] = null;
            i++;
        }
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.f30863g;
            if (i2 >= zArr.length) {
                this.f30861e = C3812z6.f34484i;
                this.f30862f = 2;
                return;
            }
            zArr[i2] = false;
            i2++;
        }
    }

    /* renamed from: i */
    public float m6549i(float f) {
        return this.f30861e.mo2797e(f);
    }

    /* renamed from: j */
    public float m6548j(float f) {
        return this.f30861e.mo2800b(f);
    }

    /* renamed from: k */
    public float m6547k() {
        return this.f30861e.mo2796f();
    }
}
