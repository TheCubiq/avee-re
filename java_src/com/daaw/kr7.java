package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class kr7 implements iu7 {
    public final jr7 a;
    public int b;
    public int c;
    public int d = 0;

    public kr7(jr7 jr7Var) {
        vs7.f(jr7Var, "input");
        this.a = jr7Var;
        jr7Var.c = this;
    }

    public static kr7 A(jr7 jr7Var) {
        kr7 kr7Var = jr7Var.c;
        return kr7Var != null ? kr7Var : new kr7(jr7Var);
    }

    public static final void y(int i) {
        if ((i & 3) != 0) {
            throw xs7.g();
        }
    }

    public static final void z(int i) {
        if ((i & 7) != 0) {
            throw xs7.g();
        }
    }

    @Override // com.daaw.iu7
    @Deprecated
    public final void a(List list, cv7 cv7Var, vr7 vr7Var) {
        int r;
        int i = this.b;
        if ((i & 7) != 3) {
            throw xs7.a();
        }
        do {
            Object zze = cv7Var.zze();
            u(zze, cv7Var, vr7Var);
            cv7Var.b(zze);
            list.add(zze);
            if (this.a.b() || this.d != 0) {
                return;
            }
            r = this.a.r();
        } while (r == i);
        this.d = r;
    }

    @Override // com.daaw.iu7
    public final void b(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.m()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Integer.valueOf(this.a.m()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ms7Var.i(this.a.m());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                ms7Var.i(this.a.m());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void c(List list) {
        int r;
        int r2;
        if (!(list instanceof mt7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.u()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Long.valueOf(this.a.u()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                mt7Var.h(this.a.u());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                mt7Var.h(this.a.u());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void d(List list) {
        int r;
        int r2;
        if (!(list instanceof mt7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.x()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Long.valueOf(this.a.x()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                mt7Var.h(this.a.x());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                mt7Var.h(this.a.x());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void e(List list) {
        int r;
        int r2;
        if (!(list instanceof sr7)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(this.a.i()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int s = this.a.s();
                z(s);
                int k = this.a.k() + s;
                do {
                    list.add(Double.valueOf(this.a.i()));
                } while (this.a.k() < k);
                return;
            }
        }
        sr7 sr7Var = (sr7) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                sr7Var.e(this.a.i());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int s2 = this.a.s();
            z(s2);
            int k2 = this.a.k() + s2;
            do {
                sr7Var.e(this.a.i());
            } while (this.a.k() < k2);
        }
    }

    @Override // com.daaw.iu7
    public final void f(List list) {
        int r;
        if ((this.b & 7) != 2) {
            throw xs7.a();
        }
        do {
            list.add(zzp());
            if (this.a.b()) {
                return;
            }
            r = this.a.r();
        } while (r == this.b);
        this.d = r;
    }

    @Override // com.daaw.iu7
    public final void g(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.o()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Integer.valueOf(this.a.o()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ms7Var.i(this.a.o());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                ms7Var.i(this.a.o());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void h(Object obj, cv7 cv7Var, vr7 vr7Var) {
        x(3);
        u(obj, cv7Var, vr7Var);
    }

    @Override // com.daaw.iu7
    public final void i(List list) {
        int r;
        int r2;
        if (!(list instanceof mt7)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.a.v()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int s = this.a.s();
                z(s);
                int k = this.a.k() + s;
                do {
                    list.add(Long.valueOf(this.a.v()));
                } while (this.a.k() < k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                mt7Var.h(this.a.v());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int s2 = this.a.s();
            z(s2);
            int k2 = this.a.k() + s2;
            do {
                mt7Var.h(this.a.v());
            } while (this.a.k() < k2);
        }
    }

    @Override // com.daaw.iu7
    public final void j(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 2) {
                int s = this.a.s();
                y(s);
                int k = this.a.k() + s;
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.k() < k);
                return;
            } else if (i != 5) {
                throw xs7.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.p()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int s2 = this.a.s();
            y(s2);
            int k2 = this.a.k() + s2;
            do {
                ms7Var.i(this.a.p());
            } while (this.a.k() < k2);
        } else if (i2 != 5) {
            throw xs7.a();
        } else {
            do {
                ms7Var.i(this.a.p());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        }
    }

    @Override // com.daaw.iu7
    public final void k(Object obj, cv7 cv7Var, vr7 vr7Var) {
        x(2);
        v(obj, cv7Var, vr7Var);
    }

    @Override // com.daaw.iu7
    public final void l(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 2) {
                int s = this.a.s();
                y(s);
                int k = this.a.k() + s;
                do {
                    list.add(Integer.valueOf(this.a.n()));
                } while (this.a.k() < k);
                return;
            } else if (i != 5) {
                throw xs7.a();
            } else {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int s2 = this.a.s();
            y(s2);
            int k2 = this.a.k() + s2;
            do {
                ms7Var.i(this.a.n());
            } while (this.a.k() < k2);
        } else if (i2 != 5) {
            throw xs7.a();
        } else {
            do {
                ms7Var.i(this.a.n());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        }
    }

    @Override // com.daaw.iu7
    public final void m(List list) {
        int r;
        int r2;
        if (!(list instanceof mt7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(this.a.w()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Long.valueOf(this.a.w()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                mt7Var.h(this.a.w());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                mt7Var.h(this.a.w());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void n(List list) {
        int r;
        int r2;
        if (!(list instanceof mt7)) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(this.a.t()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int s = this.a.s();
                z(s);
                int k = this.a.k() + s;
                do {
                    list.add(Long.valueOf(this.a.t()));
                } while (this.a.k() < k);
                return;
            }
        }
        mt7 mt7Var = (mt7) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                mt7Var.h(this.a.t());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int s2 = this.a.s();
            z(s2);
            int k2 = this.a.k() + s2;
            do {
                mt7Var.h(this.a.t());
            } while (this.a.k() < k2);
        }
    }

    @Override // com.daaw.iu7
    public final void o(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.q()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Integer.valueOf(this.a.q()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ms7Var.i(this.a.q());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                ms7Var.i(this.a.q());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void p(List list) {
        int r;
        int r2;
        if (!(list instanceof ms7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(this.a.s()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Integer.valueOf(this.a.s()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        ms7 ms7Var = (ms7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ms7Var.i(this.a.s());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                ms7Var.i(this.a.s());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void q(List list) {
        int r;
        int r2;
        if (!(list instanceof mq7)) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.c()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            } else if (i != 2) {
                throw xs7.a();
            } else {
                int k = this.a.k() + this.a.s();
                do {
                    list.add(Boolean.valueOf(this.a.c()));
                } while (this.a.k() < k);
                w(k);
                return;
            }
        }
        mq7 mq7Var = (mq7) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                mq7Var.e(this.a.c());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        } else if (i2 != 2) {
            throw xs7.a();
        } else {
            int k2 = this.a.k() + this.a.s();
            do {
                mq7Var.e(this.a.c());
            } while (this.a.k() < k2);
            w(k2);
        }
    }

    @Override // com.daaw.iu7
    public final void r(List list, cv7 cv7Var, vr7 vr7Var) {
        int r;
        int i = this.b;
        if ((i & 7) != 2) {
            throw xs7.a();
        }
        do {
            Object zze = cv7Var.zze();
            v(zze, cv7Var, vr7Var);
            cv7Var.b(zze);
            list.add(zze);
            if (this.a.b() || this.d != 0) {
                return;
            }
            r = this.a.r();
        } while (r == i);
        this.d = r;
    }

    @Override // com.daaw.iu7
    public final void s(List list) {
        int r;
        int r2;
        if (!(list instanceof cs7)) {
            int i = this.b & 7;
            if (i == 2) {
                int s = this.a.s();
                y(s);
                int k = this.a.k() + s;
                do {
                    list.add(Float.valueOf(this.a.j()));
                } while (this.a.k() < k);
                return;
            } else if (i != 5) {
                throw xs7.a();
            } else {
                do {
                    list.add(Float.valueOf(this.a.j()));
                    if (this.a.b()) {
                        return;
                    }
                    r = this.a.r();
                } while (r == this.b);
                this.d = r;
                return;
            }
        }
        cs7 cs7Var = (cs7) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int s2 = this.a.s();
            y(s2);
            int k2 = this.a.k() + s2;
            do {
                cs7Var.e(this.a.j());
            } while (this.a.k() < k2);
        } else if (i2 != 5) {
            throw xs7.a();
        } else {
            do {
                cs7Var.e(this.a.j());
                if (this.a.b()) {
                    return;
                }
                r2 = this.a.r();
            } while (r2 == this.b);
            this.d = r2;
        }
    }

    public final void t(List list, boolean z) {
        int r;
        int r2;
        if ((this.b & 7) != 2) {
            throw xs7.a();
        }
        if (!(list instanceof ct7) || z) {
            do {
                list.add(z ? zzs() : zzr());
                if (this.a.b()) {
                    return;
                }
                r = this.a.r();
            } while (r == this.b);
            this.d = r;
            return;
        }
        ct7 ct7Var = (ct7) list;
        do {
            ct7Var.l(zzp());
            if (this.a.b()) {
                return;
            }
            r2 = this.a.r();
        } while (r2 == this.b);
        this.d = r2;
    }

    public final void u(Object obj, cv7 cv7Var, vr7 vr7Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            cv7Var.h(obj, this, vr7Var);
            if (this.b == this.c) {
                return;
            }
            throw xs7.g();
        } finally {
            this.c = i;
        }
    }

    public final void v(Object obj, cv7 cv7Var, vr7 vr7Var) {
        jr7 jr7Var;
        int s = this.a.s();
        jr7 jr7Var2 = this.a;
        if (jr7Var2.a >= jr7Var2.b) {
            throw new xs7("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int l = jr7Var2.l(s);
        this.a.a++;
        cv7Var.h(obj, this, vr7Var);
        this.a.B(0);
        jr7Var.a--;
        this.a.a(l);
    }

    public final void w(int i) {
        if (this.a.k() != i) {
            throw xs7.j();
        }
    }

    public final void x(int i) {
        if ((this.b & 7) != i) {
            throw xs7.a();
        }
    }

    @Override // com.daaw.iu7
    public final boolean zzN() {
        x(0);
        return this.a.c();
    }

    @Override // com.daaw.iu7
    public final boolean zzO() {
        int i;
        if (this.a.b() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.d(i);
    }

    @Override // com.daaw.iu7
    public final double zza() {
        x(1);
        return this.a.i();
    }

    @Override // com.daaw.iu7
    public final float zzb() {
        x(5);
        return this.a.j();
    }

    @Override // com.daaw.iu7
    public final int zzc() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            i = this.a.r();
            this.b = i;
        }
        if (i == 0 || i == this.c) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    @Override // com.daaw.iu7
    public final int zzd() {
        return this.b;
    }

    @Override // com.daaw.iu7
    public final int zze() {
        x(0);
        return this.a.m();
    }

    @Override // com.daaw.iu7
    public final int zzf() {
        x(5);
        return this.a.n();
    }

    @Override // com.daaw.iu7
    public final int zzg() {
        x(0);
        return this.a.o();
    }

    @Override // com.daaw.iu7
    public final int zzh() {
        x(5);
        return this.a.p();
    }

    @Override // com.daaw.iu7
    public final int zzi() {
        x(0);
        return this.a.q();
    }

    @Override // com.daaw.iu7
    public final int zzj() {
        x(0);
        return this.a.s();
    }

    @Override // com.daaw.iu7
    public final long zzk() {
        x(1);
        return this.a.t();
    }

    @Override // com.daaw.iu7
    public final long zzl() {
        x(0);
        return this.a.u();
    }

    @Override // com.daaw.iu7
    public final long zzm() {
        x(1);
        return this.a.v();
    }

    @Override // com.daaw.iu7
    public final long zzn() {
        x(0);
        return this.a.w();
    }

    @Override // com.daaw.iu7
    public final long zzo() {
        x(0);
        return this.a.x();
    }

    @Override // com.daaw.iu7
    public final yq7 zzp() {
        x(2);
        return this.a.y();
    }

    @Override // com.daaw.iu7
    public final String zzr() {
        x(2);
        return this.a.z();
    }

    @Override // com.daaw.iu7
    public final String zzs() {
        x(2);
        return this.a.A();
    }
}
