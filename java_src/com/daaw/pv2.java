package com.daaw;

import android.net.Uri;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pv2 implements wy2 {

    /* renamed from: a */
    public final Uri f23401a;

    /* renamed from: b */
    public final kx2 f23402b;

    /* renamed from: c */
    public final qv2 f23403c;

    /* renamed from: d */
    public final cz2 f23404d;

    /* renamed from: e */
    public final ss2 f23405e;

    /* renamed from: f */
    public volatile boolean f23406f;

    /* renamed from: g */
    public boolean f23407g;

    /* renamed from: h */
    public long f23408h;

    /* renamed from: i */
    public long f23409i;

    /* renamed from: j */
    public final /* synthetic */ sv2 f23410j;

    public pv2(sv2 sv2Var, Uri uri, kx2 kx2Var, qv2 qv2Var, cz2 cz2Var) {
        this.f23410j = sv2Var;
        Objects.requireNonNull(uri);
        this.f23401a = uri;
        Objects.requireNonNull(kx2Var);
        this.f23402b = kx2Var;
        Objects.requireNonNull(qv2Var);
        this.f23403c = qv2Var;
        this.f23404d = cz2Var;
        this.f23405e = new ss2();
        this.f23407g = true;
        this.f23409i = -1L;
    }

    /* renamed from: b */
    public final void m13018b(long j, long j2) {
        this.f23405e.f26600a = j;
        this.f23408h = j2;
        this.f23407g = true;
    }

    @Override // com.daaw.wy2
    public final void zzb() {
        this.f23406f = true;
    }

    @Override // com.daaw.wy2
    public final void zzc() {
        ms2 ms2Var;
        while (!this.f23406f) {
            int i = 0;
            try {
                long j = this.f23405e.f26600a;
                long mo5584b = this.f23402b.mo5584b(new mx2(this.f23401a, null, j, j, -1L, null, 0));
                this.f23409i = mo5584b;
                if (mo5584b != -1) {
                    mo5584b += j;
                    this.f23409i = mo5584b;
                }
                ms2Var = new ms2(this.f23402b, j, mo5584b);
                try {
                    ns2 m12032b = this.f23403c.m12032b(ms2Var, this.f23402b.zzc());
                    if (this.f23407g) {
                        m12032b.mo1912d(j, this.f23408h);
                        this.f23407g = false;
                    }
                    long j2 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f23406f) {
                                i2 = 0;
                                break;
                            }
                            this.f23404d.m24860a();
                            i2 = m12032b.mo1911e(ms2Var, this.f23405e);
                            if (ms2Var.m15801d() > sv2.m9809s(this.f23410j) + j2) {
                                j2 = ms2Var.m15801d();
                                this.f23404d.m24859b();
                                sv2 sv2Var = this.f23410j;
                                sv2.m9808t(sv2Var).post(sv2.m9804x(sv2Var));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && ms2Var != null) {
                                this.f23405e.f26600a = ms2Var.m15801d();
                            }
                            pz2.m12837m(this.f23402b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f23405e.f26600a = ms2Var.m15801d();
                        i = i2;
                    }
                    pz2.m12837m(this.f23402b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                ms2Var = null;
            }
        }
    }

    @Override // com.daaw.wy2
    public final boolean zze() {
        return this.f23406f;
    }
}
