package com.daaw;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbei;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class x34 implements kx2 {
    public final zy2 a;
    public final Context b;
    public final kx2 c;
    public final String d;
    public final int e;
    public InputStream g;
    public boolean h;
    public Uri i;
    public volatile zzbei j;
    public final h44 r;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public long o = 0;
    public final AtomicLong q = new AtomicLong(-1);
    public f77 p = null;
    public final boolean f = ((Boolean) zzba.zzc().b(g93.F1)).booleanValue();

    public x34(Context context, kx2 kx2Var, String str, int i, zy2 zy2Var, h44 h44Var, byte[] bArr) {
        this.b = context;
        this.c = kx2Var;
        this.a = zy2Var;
        this.r = h44Var;
        this.d = str;
        this.e = i;
    }

    @Override // com.daaw.kx2
    public final int a(byte[] bArr, int i, int i2) {
        zy2 zy2Var;
        if (this.h) {
            InputStream inputStream = this.g;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.c.a(bArr, i, i2);
            if ((!this.f || this.g != null) && (zy2Var = this.a) != null) {
                ((l44) zy2Var).j0(this, read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.daaw.kx2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(com.daaw.mx2 r14) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.x34.b(com.daaw.mx2):long");
    }

    public final long c() {
        return this.o;
    }

    public final long d() {
        if (this.j == null) {
            return -1L;
        }
        if (this.q.get() == -1) {
            synchronized (this) {
                if (this.p == null) {
                    this.p = z04.a.M(new Callable() { // from class: com.daaw.w34
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return x34.this.e();
                        }
                    });
                }
            }
            if (!this.p.isDone()) {
                return -1L;
            }
            try {
                this.q.compareAndSet(-1L, ((Long) this.p.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.q.get();
    }

    public final /* synthetic */ Long e() {
        return Long.valueOf(zzt.zzc().a(this.j));
    }

    public final boolean f() {
        return this.k;
    }

    public final boolean g() {
        return this.n;
    }

    public final boolean h() {
        return this.m;
    }

    public final boolean i() {
        return this.l;
    }

    public final void j(mx2 mx2Var) {
        zy2 zy2Var = this.a;
        if (zy2Var != null) {
            ((l44) zy2Var).w(this, mx2Var);
        }
    }

    public final boolean k() {
        if (this.f) {
            if (!((Boolean) zzba.zzc().b(g93.P3)).booleanValue() || this.m) {
                return ((Boolean) zzba.zzc().b(g93.Q3)).booleanValue() && !this.n;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.kx2
    public final Uri zzc() {
        return this.i;
    }

    @Override // com.daaw.kx2
    public final void zzd() {
        if (!this.h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.h = false;
        this.i = null;
        InputStream inputStream = this.g;
        if (inputStream == null) {
            this.c.zzd();
            return;
        }
        xd0.a(inputStream);
        this.g = null;
    }
}
