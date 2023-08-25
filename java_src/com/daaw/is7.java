package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class is7 implements g78 {

    /* renamed from: p */
    public final ia8 f13973p;

    /* renamed from: q */
    public final fr7 f13974q;

    /* renamed from: r */
    public i98 f13975r;

    /* renamed from: s */
    public g78 f13976s;

    /* renamed from: t */
    public boolean f13977t = true;

    /* renamed from: u */
    public boolean f13978u;

    public is7(fr7 fr7Var, xp4 xp4Var) {
        this.f13974q = fr7Var;
        this.f13973p = new ia8(xp4Var);
    }

    /* renamed from: a */
    public final long m19445a(boolean z) {
        i98 i98Var = this.f13975r;
        if (i98Var == null || i98Var.zzM() || (!this.f13975r.zzN() && (z || this.f13975r.mo15109j()))) {
            this.f13977t = true;
            if (this.f13978u) {
                this.f13973p.m19995b();
            }
        } else {
            g78 g78Var = this.f13976s;
            Objects.requireNonNull(g78Var);
            long zza = g78Var.zza();
            if (this.f13977t) {
                if (zza < this.f13973p.zza()) {
                    this.f13973p.m19994c();
                } else {
                    this.f13977t = false;
                    if (this.f13978u) {
                        this.f13973p.m19995b();
                    }
                }
            }
            this.f13973p.m19996a(zza);
            pp3 zzc = g78Var.zzc();
            if (!zzc.equals(this.f13973p.zzc())) {
                this.f13973p.mo19439l(zzc);
                this.f13974q.mo8516b(zzc);
            }
        }
        if (this.f13977t) {
            return this.f13973p.zza();
        }
        g78 g78Var2 = this.f13976s;
        Objects.requireNonNull(g78Var2);
        return g78Var2.zza();
    }

    /* renamed from: b */
    public final void m19444b(i98 i98Var) {
        if (i98Var == this.f13975r) {
            this.f13976s = null;
            this.f13975r = null;
            this.f13977t = true;
        }
    }

    /* renamed from: c */
    public final void m19443c(i98 i98Var) {
        g78 g78Var;
        g78 zzi = i98Var.zzi();
        if (zzi == null || zzi == (g78Var = this.f13976s)) {
            return;
        }
        if (g78Var != null) {
            throw vu7.m6771d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f13976s = zzi;
        this.f13975r = i98Var;
        zzi.mo19439l(this.f13973p.zzc());
    }

    /* renamed from: d */
    public final void m19442d(long j) {
        this.f13973p.m19996a(j);
    }

    /* renamed from: e */
    public final void m19441e() {
        this.f13978u = true;
        this.f13973p.m19995b();
    }

    /* renamed from: f */
    public final void m19440f() {
        this.f13978u = false;
        this.f13973p.m19994c();
    }

    @Override // com.daaw.g78
    /* renamed from: l */
    public final void mo19439l(pp3 pp3Var) {
        g78 g78Var = this.f13976s;
        if (g78Var != null) {
            g78Var.mo19439l(pp3Var);
            pp3Var = this.f13976s.zzc();
        }
        this.f13973p.mo19439l(pp3Var);
    }

    @Override // com.daaw.g78
    public final long zza() {
        throw null;
    }

    @Override // com.daaw.g78
    public final pp3 zzc() {
        g78 g78Var = this.f13976s;
        return g78Var != null ? g78Var.zzc() : this.f13973p.zzc();
    }
}
