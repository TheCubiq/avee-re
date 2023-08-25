package com.daaw;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class tg8 implements fb8 {
    public final xp4 a;
    public final d34 b;
    public final i54 c;
    public final rg8 d;
    public final SparseArray e;
    public k65 f;
    public ty3 g;
    public vz4 h;
    public boolean i;

    public tg8(xp4 xp4Var) {
        Objects.requireNonNull(xp4Var);
        this.a = xp4Var;
        this.f = new k65(it5.e(), xp4Var, new e45() { // from class: com.daaw.hc8
            @Override // com.daaw.e45
            public final void a(Object obj, r32 r32Var) {
                ob8 ob8Var = (ob8) obj;
            }
        });
        d34 d34Var = new d34();
        this.b = d34Var;
        this.c = new i54();
        this.d = new rg8(d34Var);
        this.e = new SparseArray();
    }

    public static /* synthetic */ void Z(tg8 tg8Var) {
        final ib8 X = tg8Var.X();
        tg8Var.b0(X, 1028, new c35() { // from class: com.daaw.ae8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
        tg8Var.f.e();
    }

    @Override // com.daaw.mv3
    public final void A(final ni4 ni4Var) {
        final ib8 X = X();
        b0(X, 2, new c35() { // from class: com.daaw.od8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void B(final f53 f53Var, final int i) {
        final ib8 X = X();
        b0(X, 1, new c35(f53Var, i) { // from class: com.daaw.af8
            public final /* synthetic */ f53 b;

            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void C(final boolean z, final int i) {
        final ib8 X = X();
        b0(X, 5, new c35(z, i) { // from class: com.daaw.se8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void D(final nx3 nx3Var, final nx3 nx3Var2, final int i) {
        if (i == 1) {
            this.i = false;
            i = 1;
        }
        rg8 rg8Var = this.d;
        ty3 ty3Var = this.g;
        Objects.requireNonNull(ty3Var);
        rg8Var.g(ty3Var);
        final ib8 X = X();
        b0(X, 11, new c35() { // from class: com.daaw.id8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
                ob8Var.p(ib8.this, nx3Var, nx3Var2, i);
            }
        });
    }

    @Override // com.daaw.mv3
    public final void E(final jn3 jn3Var) {
        final ib8 g0 = g0(jn3Var);
        b0(g0, 10, new c35() { // from class: com.daaw.ke8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).x(ib8.this, jn3Var);
            }
        });
    }

    @Override // com.daaw.mv3
    public final void F(final int i) {
        final ib8 X = X();
        b0(X, 4, new c35() { // from class: com.daaw.ye8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).u(ib8.this, i);
            }
        });
    }

    @Override // com.daaw.mv3
    public final void G(final lu3 lu3Var) {
        final ib8 X = X();
        b0(X, 13, new c35() { // from class: com.daaw.kd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void H(final jn3 jn3Var) {
        final ib8 g0 = g0(jn3Var);
        b0(g0, 10, new c35() { // from class: com.daaw.pf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void I(final boolean z, final int i) {
        final ib8 X = X();
        b0(X, -1, new c35(z, i) { // from class: com.daaw.rb8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void J(final int i, final long j, final long j2) {
        final ib8 f0 = f0();
        b0(f0, 1011, new c35(i, j, j2) { // from class: com.daaw.zb8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.zr8
    public final void K(int i, pr8 pr8Var, final ar8 ar8Var, final lr8 lr8Var) {
        final ib8 d0 = d0(i, pr8Var);
        b0(d0, 1000, new c35() { // from class: com.daaw.qe8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void L(final is8 is8Var) {
        final ib8 X = X();
        b0(X, 29, new c35() { // from class: com.daaw.md8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void M(l64 l64Var, final int i) {
        rg8 rg8Var = this.d;
        ty3 ty3Var = this.g;
        Objects.requireNonNull(ty3Var);
        rg8Var.i(ty3Var);
        final ib8 X = X();
        b0(X, 0, new c35(i) { // from class: com.daaw.ce8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.zr8
    public final void N(int i, pr8 pr8Var, final ar8 ar8Var, final lr8 lr8Var, final IOException iOException, final boolean z) {
        final ib8 d0 = d0(i, pr8Var);
        b0(d0, 1003, new c35() { // from class: com.daaw.yd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).s(ib8.this, ar8Var, lr8Var, iOException, z);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void O(final String str, final long j, final long j2) {
        final ib8 f0 = f0();
        b0(f0, 1008, new c35(str, j2, j) { // from class: com.daaw.me8
            public final /* synthetic */ String b;

            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.lw8
    public final void P(final int i, final long j, final long j2) {
        final ib8 c0 = c0(this.d.c());
        b0(c0, 1006, new c35() { // from class: com.daaw.bd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).b(ib8.this, i, j, j2);
            }
        });
    }

    @Override // com.daaw.mv3
    public final void Q(final int i, final boolean z) {
        final ib8 X = X();
        b0(X, 30, new c35(i, z) { // from class: com.daaw.sd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void R(final ty3 ty3Var, Looper looper) {
        y17 y17Var;
        boolean z = true;
        if (this.g != null) {
            y17Var = this.d.b;
            if (!y17Var.isEmpty()) {
                z = false;
            }
        }
        uo4.f(z);
        Objects.requireNonNull(ty3Var);
        this.g = ty3Var;
        this.h = this.a.a(looper, null);
        this.f = this.f.a(looper, new e45() { // from class: com.daaw.ud8
            @Override // com.daaw.e45
            public final void a(Object obj, r32 r32Var) {
                tg8.this.a0(ty3Var, (ob8) obj, r32Var);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void S(final f92 f92Var, final tm7 tm7Var) {
        final ib8 f0 = f0();
        b0(f0, 1017, new c35() { // from class: com.daaw.tb8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).e(ib8.this, f92Var, tm7Var);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void T(final long j) {
        final ib8 f0 = f0();
        b0(f0, 1010, new c35(j) { // from class: com.daaw.zf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void U(final Object obj, final long j) {
        final ib8 f0 = f0();
        b0(f0, 26, new c35() { // from class: com.daaw.hg8
            @Override // com.daaw.c35
            public final void zza(Object obj2) {
                ((ob8) obj2).n(ib8.this, obj, j);
            }
        });
    }

    @Override // com.daaw.zr8
    public final void V(int i, pr8 pr8Var, final ar8 ar8Var, final lr8 lr8Var) {
        final ib8 d0 = d0(i, pr8Var);
        b0(d0, 1001, new c35() { // from class: com.daaw.nf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.zr8
    public final void W(int i, pr8 pr8Var, final ar8 ar8Var, final lr8 lr8Var) {
        final ib8 d0 = d0(i, pr8Var);
        b0(d0, 1002, new c35() { // from class: com.daaw.ie8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    public final ib8 X() {
        return c0(this.d.b());
    }

    @RequiresNonNull({"player"})
    public final ib8 Y(l64 l64Var, int i, pr8 pr8Var) {
        boolean z = true;
        pr8 pr8Var2 = true == l64Var.o() ? null : pr8Var;
        long zza = this.a.zza();
        z = (l64Var.equals(this.g.zzn()) && i == this.g.zzf()) ? false : false;
        long j = 0;
        if (pr8Var2 == null || !pr8Var2.b()) {
            if (z) {
                j = this.g.zzk();
            } else if (!l64Var.o()) {
                long j2 = l64Var.e(i, this.c, 0L).k;
                j = it5.j0(0L);
            }
        } else if (z && this.g.zzd() == pr8Var2.b && this.g.zze() == pr8Var2.c) {
            j = this.g.zzl();
        }
        return new ib8(zza, l64Var, i, pr8Var2, j, this.g.zzn(), this.g.zzf(), this.d.b(), this.g.zzl(), this.g.zzm());
    }

    @Override // com.daaw.mv3
    public final void a(final ll4 ll4Var) {
        final ib8 f0 = f0();
        b0(f0, 25, new c35() { // from class: com.daaw.dg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ib8 ib8Var = ib8.this;
                ll4 ll4Var2 = ll4Var;
                ((ob8) obj).r(ib8Var, ll4Var2);
                int i = ll4Var2.a;
            }
        });
    }

    public final /* synthetic */ void a0(ty3 ty3Var, ob8 ob8Var, r32 r32Var) {
        ob8Var.k(ty3Var, new lb8(r32Var, this.e));
    }

    @Override // com.daaw.fb8
    public final void b(final ql7 ql7Var) {
        final ib8 f0 = f0();
        b0(f0, 1007, new c35() { // from class: com.daaw.oe8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    public final void b0(ib8 ib8Var, int i, c35 c35Var) {
        this.e.put(i, ib8Var);
        k65 k65Var = this.f;
        k65Var.d(i, c35Var);
        k65Var.c();
    }

    @Override // com.daaw.fb8
    public final void c(final int i, final long j) {
        final ib8 e0 = e0();
        b0(e0, 1018, new c35() { // from class: com.daaw.ee8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).q(ib8.this, i, j);
            }
        });
    }

    public final ib8 c0(pr8 pr8Var) {
        Objects.requireNonNull(this.g);
        l64 a = pr8Var == null ? null : this.d.a(pr8Var);
        if (pr8Var == null || a == null) {
            int zzf = this.g.zzf();
            l64 zzn = this.g.zzn();
            if (zzf >= zzn.c()) {
                zzn = l64.a;
            }
            return Y(zzn, zzf, null);
        }
        return Y(a, a.n(pr8Var.a, this.b).c, pr8Var);
    }

    @Override // com.daaw.zr8
    public final void d(int i, pr8 pr8Var, final lr8 lr8Var) {
        final ib8 d0 = d0(i, pr8Var);
        b0(d0, 1004, new c35() { // from class: com.daaw.nc8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).y(ib8.this, lr8Var);
            }
        });
    }

    public final ib8 d0(int i, pr8 pr8Var) {
        ty3 ty3Var = this.g;
        Objects.requireNonNull(ty3Var);
        if (pr8Var != null) {
            return this.d.a(pr8Var) != null ? c0(pr8Var) : Y(l64.a, i, pr8Var);
        }
        l64 zzn = ty3Var.zzn();
        if (i >= zzn.c()) {
            zzn = l64.a;
        }
        return Y(zzn, i, null);
    }

    @Override // com.daaw.fb8
    public final void e(final Exception exc) {
        final ib8 f0 = f0();
        b0(f0, 1030, new c35() { // from class: com.daaw.qc8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    public final ib8 e0() {
        return c0(this.d.d());
    }

    @Override // com.daaw.fb8
    public final void f(final String str, final long j, final long j2) {
        final ib8 f0 = f0();
        b0(f0, 1016, new c35(str, j2, j) { // from class: com.daaw.wd8
            public final /* synthetic */ String b;

            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    public final ib8 f0() {
        return c0(this.d.e());
    }

    @Override // com.daaw.fb8
    public final void g(final ql7 ql7Var) {
        final ib8 e0 = e0();
        b0(e0, 1013, new c35() { // from class: com.daaw.vf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    public final ib8 g0(jn3 jn3Var) {
        md3 md3Var;
        return (!(jn3Var instanceof vu7) || (md3Var = ((vu7) jn3Var).x) == null) ? X() : c0(new pr8(md3Var));
    }

    @Override // com.daaw.fb8
    public final void h(ob8 ob8Var) {
        this.f.f(ob8Var);
    }

    @Override // com.daaw.fb8
    public final void i(List list, pr8 pr8Var) {
        rg8 rg8Var = this.d;
        ty3 ty3Var = this.g;
        Objects.requireNonNull(ty3Var);
        rg8Var.h(list, pr8Var, ty3Var);
    }

    @Override // com.daaw.fb8
    public final void j(ob8 ob8Var) {
        this.f.b(ob8Var);
    }

    @Override // com.daaw.mv3
    public final void k(final boolean z) {
        final ib8 f0 = f0();
        b0(f0, 23, new c35(z) { // from class: com.daaw.we8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void l(final ql7 ql7Var) {
        final ib8 f0 = f0();
        b0(f0, 1015, new c35() { // from class: com.daaw.ge8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void m(final String str) {
        final ib8 f0 = f0();
        b0(f0, 1019, new c35() { // from class: com.daaw.wb8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void n(final long j, final int i) {
        final ib8 e0 = e0();
        b0(e0, 1021, new c35(j, i) { // from class: com.daaw.gd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void o() {
        vz4 vz4Var = this.h;
        uo4.b(vz4Var);
        vz4Var.b(new Runnable() { // from class: com.daaw.xf8
            @Override // java.lang.Runnable
            public final void run() {
                tg8.Z(tg8.this);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void p(final ql7 ql7Var) {
        final ib8 e0 = e0();
        b0(e0, 1020, new c35() { // from class: com.daaw.fg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).j(ib8.this, ql7Var);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void q(final f92 f92Var, final tm7 tm7Var) {
        final ib8 f0 = f0();
        b0(f0, 1009, new c35() { // from class: com.daaw.tf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ((ob8) obj).o(ib8.this, f92Var, tm7Var);
            }
        });
    }

    @Override // com.daaw.fb8
    public final void r(final Exception exc) {
        final ib8 f0 = f0();
        b0(f0, 1014, new c35() { // from class: com.daaw.ed8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void s(final Exception exc) {
        final ib8 f0 = f0();
        b0(f0, 1029, new c35() { // from class: com.daaw.qd8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void t(final boolean z) {
        final ib8 X = X();
        b0(X, 7, new c35(z) { // from class: com.daaw.ue8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void u(final int i) {
        final ib8 X = X();
        b0(X, 6, new c35(i) { // from class: com.daaw.lg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void v(final int i, final int i2) {
        final ib8 f0 = f0();
        b0(f0, 24, new c35(i, i2) { // from class: com.daaw.jg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void w(final pp3 pp3Var) {
        final ib8 X = X();
        b0(X, 12, new c35() { // from class: com.daaw.fc8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void x(final boolean z) {
        final ib8 X = X();
        b0(X, 3, new c35(z) { // from class: com.daaw.ng8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void y(final float f) {
        final ib8 f0 = f0();
        b0(f0, 22, new c35(f) { // from class: com.daaw.cc8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void z(final gc3 gc3Var) {
        final ib8 X = X();
        b0(X, 14, new c35() { // from class: com.daaw.rf8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void zzA(final String str) {
        final ib8 f0 = f0();
        b0(f0, 1012, new c35() { // from class: com.daaw.pg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.mv3
    public final void zzp() {
        final ib8 X = X();
        b0(X, -1, new c35() { // from class: com.daaw.kc8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }

    @Override // com.daaw.fb8
    public final void zzx() {
        if (this.i) {
            return;
        }
        final ib8 X = X();
        this.i = true;
        b0(X, -1, new c35() { // from class: com.daaw.bg8
            @Override // com.daaw.c35
            public final void zza(Object obj) {
                ob8 ob8Var = (ob8) obj;
            }
        });
    }
}
