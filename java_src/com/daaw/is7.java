package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class is7 implements g78 {
    public final ia8 p;
    public final fr7 q;
    public i98 r;
    public g78 s;
    public boolean t = true;
    public boolean u;

    public is7(fr7 fr7Var, xp4 xp4Var) {
        this.q = fr7Var;
        this.p = new ia8(xp4Var);
    }

    public final long a(boolean z) {
        i98 i98Var = this.r;
        if (i98Var == null || i98Var.zzM() || (!this.r.zzN() && (z || this.r.j()))) {
            this.t = true;
            if (this.u) {
                this.p.b();
            }
        } else {
            g78 g78Var = this.s;
            Objects.requireNonNull(g78Var);
            long zza = g78Var.zza();
            if (this.t) {
                if (zza < this.p.zza()) {
                    this.p.c();
                } else {
                    this.t = false;
                    if (this.u) {
                        this.p.b();
                    }
                }
            }
            this.p.a(zza);
            pp3 zzc = g78Var.zzc();
            if (!zzc.equals(this.p.zzc())) {
                this.p.l(zzc);
                this.q.b(zzc);
            }
        }
        if (this.t) {
            return this.p.zza();
        }
        g78 g78Var2 = this.s;
        Objects.requireNonNull(g78Var2);
        return g78Var2.zza();
    }

    public final void b(i98 i98Var) {
        if (i98Var == this.r) {
            this.s = null;
            this.r = null;
            this.t = true;
        }
    }

    public final void c(i98 i98Var) {
        g78 g78Var;
        g78 zzi = i98Var.zzi();
        if (zzi == null || zzi == (g78Var = this.s)) {
            return;
        }
        if (g78Var != null) {
            throw vu7.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.s = zzi;
        this.r = i98Var;
        zzi.l(this.p.zzc());
    }

    public final void d(long j) {
        this.p.a(j);
    }

    public final void e() {
        this.u = true;
        this.p.b();
    }

    public final void f() {
        this.u = false;
        this.p.c();
    }

    @Override // com.daaw.g78
    public final void l(pp3 pp3Var) {
        g78 g78Var = this.s;
        if (g78Var != null) {
            g78Var.l(pp3Var);
            pp3Var = this.s.zzc();
        }
        this.p.l(pp3Var);
    }

    @Override // com.daaw.g78
    public final long zza() {
        throw null;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        g78 g78Var = this.s;
        return g78Var != null ? g78Var.zzc() : this.p.zzc();
    }
}
