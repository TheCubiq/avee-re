package com.daaw;

import com.daaw.lj;
import com.daaw.qj;
/* loaded from: classes.dex */
public abstract class kx1 implements zs {
    public int a;
    public qj b;
    public l61 c;
    public qj.b d;
    public pt e = new pt(this);
    public int f = 0;
    public boolean g = false;
    public ft h = new ft(this);
    public ft i = new ft(this);
    public b j = b.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[lj.b.values().length];
            a = iArr;
            try {
                iArr[lj.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[lj.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[lj.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[lj.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[lj.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public kx1(qj qjVar) {
        this.b = qjVar;
    }

    @Override // com.daaw.zs
    public void a(zs zsVar) {
    }

    public final void b(ft ftVar, ft ftVar2, int i) {
        ftVar.l.add(ftVar2);
        ftVar.f = i;
        ftVar2.k.add(ftVar);
    }

    public final void c(ft ftVar, ft ftVar2, int i, pt ptVar) {
        ftVar.l.add(ftVar2);
        ftVar.l.add(this.e);
        ftVar.h = i;
        ftVar.i = ptVar;
        ftVar2.k.add(ftVar);
        ptVar.k.add(ftVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            qj qjVar = this.b;
            int i3 = qjVar.p;
            max = Math.max(qjVar.o, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            qj qjVar2 = this.b;
            int i4 = qjVar2.s;
            max = Math.max(qjVar2.r, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public final ft h(lj ljVar) {
        kx1 kx1Var;
        kx1 kx1Var2;
        lj ljVar2 = ljVar.d;
        if (ljVar2 == null) {
            return null;
        }
        qj qjVar = ljVar2.b;
        int i = a.a[ljVar2.c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                kx1Var2 = qjVar.e;
            } else if (i == 3) {
                kx1Var = qjVar.f;
            } else if (i == 4) {
                return qjVar.f.k;
            } else {
                if (i != 5) {
                    return null;
                }
                kx1Var2 = qjVar.f;
            }
            return kx1Var2.i;
        }
        kx1Var = qjVar.e;
        return kx1Var.h;
    }

    public final ft i(lj ljVar, int i) {
        lj ljVar2 = ljVar.d;
        if (ljVar2 == null) {
            return null;
        }
        qj qjVar = ljVar2.b;
        kx1 kx1Var = i == 0 ? qjVar.e : qjVar.f;
        int i2 = a.a[ljVar2.c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return kx1Var.i;
        }
        return kx1Var.h;
    }

    public long j() {
        pt ptVar = this.e;
        if (ptVar.j) {
            return ptVar.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    public final void l(int i, int i2) {
        pt ptVar;
        int g;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                int g2 = g(this.e.m, i);
                ptVar = this.e;
                g = Math.min(g2, i2);
                ptVar.d(g);
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                qj qjVar = this.b;
                kx1 kx1Var = qjVar.e;
                qj.b bVar = kx1Var.d;
                qj.b bVar2 = qj.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && kx1Var.a == 3) {
                    ms1 ms1Var = qjVar.f;
                    if (ms1Var.d == bVar2 && ms1Var.a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    kx1Var = qjVar.f;
                }
                if (kx1Var.e.j) {
                    float r = qjVar.r();
                    this.e.d(i == 1 ? (int) ((kx1Var.e.g / r) + 0.5f) : (int) ((r * kx1Var.e.g) + 0.5f));
                    return;
                }
                return;
            } else {
                qj E = this.b.E();
                if (E == null) {
                    return;
                }
                pt ptVar2 = (i == 0 ? E.e : E.f).e;
                if (!ptVar2.j) {
                    return;
                }
                qj qjVar2 = this.b;
                i2 = (int) ((ptVar2.g * (i == 0 ? qjVar2.q : qjVar2.t)) + 0.5f);
            }
        }
        ptVar = this.e;
        g = g(i2, i);
        ptVar.d(g);
    }

    public abstract boolean m();

    public void n(zs zsVar, lj ljVar, lj ljVar2, int i) {
        ft ftVar;
        ft h = h(ljVar);
        ft h2 = h(ljVar2);
        if (h.j && h2.j) {
            int b2 = h.g + ljVar.b();
            int b3 = h2.g - ljVar2.b();
            int i2 = b3 - b2;
            if (!this.e.j && this.d == qj.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            pt ptVar = this.e;
            if (ptVar.j) {
                if (ptVar.g == i2) {
                    this.h.d(b2);
                    ftVar = this.i;
                } else {
                    qj qjVar = this.b;
                    float u = i == 0 ? qjVar.u() : qjVar.I();
                    if (h == h2) {
                        b2 = h.g;
                        b3 = h2.g;
                        u = 0.5f;
                    }
                    this.h.d((int) (b2 + 0.5f + (((b3 - b2) - this.e.g) * u)));
                    ftVar = this.i;
                    b3 = this.h.g + this.e.g;
                }
                ftVar.d(b3);
            }
        }
    }

    public void o(zs zsVar) {
    }

    public void p(zs zsVar) {
    }
}
