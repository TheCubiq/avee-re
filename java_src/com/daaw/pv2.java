package com.daaw;

import android.net.Uri;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pv2 implements wy2 {
    public final Uri a;
    public final kx2 b;
    public final qv2 c;
    public final cz2 d;
    public final ss2 e;
    public volatile boolean f;
    public boolean g;
    public long h;
    public long i;
    public final /* synthetic */ sv2 j;

    public pv2(sv2 sv2Var, Uri uri, kx2 kx2Var, qv2 qv2Var, cz2 cz2Var) {
        this.j = sv2Var;
        Objects.requireNonNull(uri);
        this.a = uri;
        Objects.requireNonNull(kx2Var);
        this.b = kx2Var;
        Objects.requireNonNull(qv2Var);
        this.c = qv2Var;
        this.d = cz2Var;
        this.e = new ss2();
        this.g = true;
        this.i = -1L;
    }

    public final void b(long j, long j2) {
        this.e.a = j;
        this.h = j2;
        this.g = true;
    }

    @Override // com.daaw.wy2
    public final void zzb() {
        this.f = true;
    }

    @Override // com.daaw.wy2
    public final void zzc() {
        ms2 ms2Var;
        while (!this.f) {
            int i = 0;
            try {
                long j = this.e.a;
                long b = this.b.b(new mx2(this.a, null, j, j, -1L, null, 0));
                this.i = b;
                if (b != -1) {
                    b += j;
                    this.i = b;
                }
                ms2Var = new ms2(this.b, j, b);
                try {
                    ns2 b2 = this.c.b(ms2Var, this.b.zzc());
                    if (this.g) {
                        b2.d(j, this.h);
                        this.g = false;
                    }
                    long j2 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f) {
                                i2 = 0;
                                break;
                            }
                            this.d.a();
                            i2 = b2.e(ms2Var, this.e);
                            if (ms2Var.d() > sv2.s(this.j) + j2) {
                                j2 = ms2Var.d();
                                this.d.b();
                                sv2 sv2Var = this.j;
                                sv2.t(sv2Var).post(sv2.x(sv2Var));
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            if (i != 1 && ms2Var != null) {
                                this.e.a = ms2Var.d();
                            }
                            pz2.m(this.b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.e.a = ms2Var.d();
                        i = i2;
                    }
                    pz2.m(this.b);
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
        return this.f;
    }
}
