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
public final class x54 extends sx5 {
    public final Context e;
    public final p46 f;
    public final String g;
    public final int h;
    public final boolean i;
    public InputStream j;
    public boolean k;
    public Uri l;
    public volatile zzbei m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public f77 s;
    public final AtomicLong t;
    public final a64 u;

    public x54(Context context, p46 p46Var, String str, int i, qz6 qz6Var, a64 a64Var, byte[] bArr) {
        super(false);
        this.e = context;
        this.f = p46Var;
        this.u = a64Var;
        this.g = str;
        this.h = i;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = 0L;
        this.t = new AtomicLong(-1L);
        this.s = null;
        this.i = ((Boolean) zzba.zzc().b(g93.F1)).booleanValue();
        d(qz6Var);
    }

    @Override // com.daaw.xp8
    public final int a(byte[] bArr, int i, int i2) {
        if (this.k) {
            InputStream inputStream = this.j;
            int read = inputStream != null ? inputStream.read(bArr, i, i2) : this.f.a(bArr, i, i2);
            if (!this.i || this.j != null) {
                c(read);
            }
            return read;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.daaw.p46
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long g(com.daaw.pa6 r14) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.x54.g(com.daaw.pa6):long");
    }

    public final long n() {
        return this.r;
    }

    public final long o() {
        if (this.m == null) {
            return -1L;
        }
        if (this.t.get() == -1) {
            synchronized (this) {
                if (this.s == null) {
                    this.s = z04.a.M(new Callable() { // from class: com.daaw.w54
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return x54.this.p();
                        }
                    });
                }
            }
            if (!this.s.isDone()) {
                return -1L;
            }
            try {
                this.t.compareAndSet(-1L, ((Long) this.s.get()).longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.t.get();
    }

    public final /* synthetic */ Long p() {
        return Long.valueOf(zzt.zzc().a(this.m));
    }

    public final boolean q() {
        return this.n;
    }

    public final boolean r() {
        return this.q;
    }

    public final boolean s() {
        return this.p;
    }

    public final boolean t() {
        return this.o;
    }

    public final boolean v() {
        if (this.i) {
            if (!((Boolean) zzba.zzc().b(g93.P3)).booleanValue() || this.p) {
                return ((Boolean) zzba.zzc().b(g93.Q3)).booleanValue() && !this.q;
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.p46
    public final Uri zzc() {
        return this.l;
    }

    @Override // com.daaw.p46
    public final void zzd() {
        if (!this.k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        boolean z = false;
        this.k = false;
        this.l = null;
        z = (this.i && this.j == null) ? true : true;
        InputStream inputStream = this.j;
        if (inputStream != null) {
            xd0.a(inputStream);
            this.j = null;
        } else {
            this.f.zzd();
        }
        if (z) {
            k();
        }
    }
}
