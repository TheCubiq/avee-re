package com.daaw;

import com.daaw.qj;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class re {
    public qj a;
    public qj b;
    public qj c;
    public qj d;
    public qj e;
    public qj f;
    public qj g;
    public ArrayList<qj> h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;

    public re(qj qjVar, int i, boolean z) {
        this.a = qjVar;
        this.p = i;
        this.q = z;
    }

    public static boolean c(qj qjVar, int i) {
        if (qjVar.M() != 8 && qjVar.M[i] == qj.b.MATCH_CONSTRAINT) {
            int[] iArr = qjVar.n;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public final void b() {
        int i = this.p * 2;
        qj qjVar = this.a;
        boolean z = true;
        this.o = true;
        qj qjVar2 = qjVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            qj[] qjVarArr = qjVar.s0;
            int i2 = this.p;
            qj qjVar3 = null;
            qjVarArr[i2] = null;
            qjVar.r0[i2] = null;
            if (qjVar.M() != 8) {
                this.l++;
                qj.b q = qjVar.q(this.p);
                qj.b bVar = qj.b.MATCH_CONSTRAINT;
                if (q != bVar) {
                    this.m += qjVar.y(this.p);
                }
                int b = this.m + qjVar.J[i].b();
                this.m = b;
                int i3 = i + 1;
                this.m = b + qjVar.J[i3].b();
                int b2 = this.n + qjVar.J[i].b();
                this.n = b2;
                this.n = b2 + qjVar.J[i3].b();
                if (this.b == null) {
                    this.b = qjVar;
                }
                this.d = qjVar;
                qj.b[] bVarArr = qjVar.M;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = qjVar.n;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = qjVar.q0;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (c(qjVar, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(qjVar);
                        }
                        if (this.f == null) {
                            this.f = qjVar;
                        }
                        qj qjVar4 = this.g;
                        if (qjVar4 != null) {
                            qjVar4.r0[this.p] = qjVar;
                        }
                        this.g = qjVar;
                    }
                    if (this.p != 0 ? !(qjVar.m == 0 && qjVar.r == 0 && qjVar.s == 0) : !(qjVar.l == 0 && qjVar.o == 0 && qjVar.p == 0)) {
                        this.o = false;
                    }
                    if (qjVar.Q != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (qjVar2 != qjVar) {
                qjVar2.s0[this.p] = qjVar;
            }
            lj ljVar = qjVar.J[i + 1].d;
            if (ljVar != null) {
                qj qjVar5 = ljVar.b;
                lj[] ljVarArr = qjVar5.J;
                if (ljVarArr[i].d != null && ljVarArr[i].d.b == qjVar) {
                    qjVar3 = qjVar5;
                }
            }
            if (qjVar3 == null) {
                qjVar3 = qjVar;
                z2 = true;
            }
            qjVar2 = qjVar;
            qjVar = qjVar3;
        }
        qj qjVar6 = this.b;
        if (qjVar6 != null) {
            this.m -= qjVar6.J[i].b();
        }
        qj qjVar7 = this.d;
        if (qjVar7 != null) {
            this.m -= qjVar7.J[i + 1].b();
        }
        this.c = qjVar;
        if (this.p == 0 && this.q) {
            this.e = qjVar;
        } else {
            this.e = this.a;
        }
        this.t = (this.s && this.r) ? false : false;
    }
}
