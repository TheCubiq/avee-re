package com.daaw;
/* loaded from: classes.dex */
public final class v54 implements d78 {

    /* renamed from: a */
    public final nw8 f29917a = new nw8(true, 65536);

    /* renamed from: b */
    public long f29918b = 15000000;

    /* renamed from: c */
    public long f29919c = 30000000;

    /* renamed from: d */
    public long f29920d = 2500000;

    /* renamed from: e */
    public long f29921e = 5000000;

    /* renamed from: f */
    public int f29922f;

    /* renamed from: g */
    public boolean f29923g;

    @Override // com.daaw.d78
    /* renamed from: a */
    public final boolean mo7406a(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f29921e : this.f29920d;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.daaw.d78
    /* renamed from: b */
    public final void mo7405b(i98[] i98VarArr, au8 au8Var, tv8[] tv8VarArr) {
        int i = 0;
        this.f29922f = 0;
        while (true) {
            int length = i98VarArr.length;
            if (i >= 2) {
                this.f29917a.m14754f(this.f29922f);
                return;
            }
            if (tv8VarArr[i] != null) {
                this.f29922f += i98VarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.daaw.d78
    /* renamed from: c */
    public final boolean mo7404c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.f29919c ? (char) 0 : j2 < this.f29918b ? (char) 2 : (char) 1;
        int m14759a = this.f29917a.m14759a();
        int i = this.f29922f;
        if (c != 2 && (c != 1 || !this.f29923g || m14759a >= i)) {
            z = false;
        }
        this.f29923g = z;
        return z;
    }

    /* renamed from: d */
    public final void m7403d(boolean z) {
        this.f29922f = 0;
        this.f29923g = false;
        if (z) {
            this.f29917a.m14755e();
        }
    }

    /* renamed from: e */
    public final synchronized void m7402e(int i) {
        this.f29920d = i * 1000;
    }

    /* renamed from: f */
    public final synchronized void m7401f(int i) {
        this.f29921e = i * 1000;
    }

    /* renamed from: g */
    public final synchronized void m7400g(int i) {
        this.f29919c = i * 1000;
    }

    /* renamed from: h */
    public final synchronized void m7399h(int i) {
        this.f29918b = i * 1000;
    }

    @Override // com.daaw.d78
    public final long zza() {
        return 0L;
    }

    @Override // com.daaw.d78
    public final void zzb() {
        m7403d(false);
    }

    @Override // com.daaw.d78
    public final void zzc() {
        m7403d(true);
    }

    @Override // com.daaw.d78
    public final void zzd() {
        m7403d(true);
    }

    @Override // com.daaw.d78
    public final boolean zzf() {
        return false;
    }

    @Override // com.daaw.d78
    public final nw8 zzi() {
        return this.f29917a;
    }
}
