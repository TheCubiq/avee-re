package com.daaw;
/* loaded from: classes.dex */
public final class v54 implements d78 {
    public final nw8 a = new nw8(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.daaw.d78
    public final boolean a(long j, float f, boolean z, long j2) {
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.daaw.d78
    public final void b(i98[] i98VarArr, au8 au8Var, tv8[] tv8VarArr) {
        int i = 0;
        this.f = 0;
        while (true) {
            int length = i98VarArr.length;
            if (i >= 2) {
                this.a.f(this.f);
                return;
            }
            if (tv8VarArr[i] != null) {
                this.f += i98VarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.daaw.d78
    public final boolean c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.c ? (char) 0 : j2 < this.b ? (char) 2 : (char) 1;
        int a = this.a.a();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || a >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    public final void d(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.a.e();
        }
    }

    public final synchronized void e(int i) {
        this.d = i * 1000;
    }

    public final synchronized void f(int i) {
        this.e = i * 1000;
    }

    public final synchronized void g(int i) {
        this.c = i * 1000;
    }

    public final synchronized void h(int i) {
        this.b = i * 1000;
    }

    @Override // com.daaw.d78
    public final long zza() {
        return 0L;
    }

    @Override // com.daaw.d78
    public final void zzb() {
        d(false);
    }

    @Override // com.daaw.d78
    public final void zzc() {
        d(true);
    }

    @Override // com.daaw.d78
    public final void zzd() {
        d(true);
    }

    @Override // com.daaw.d78
    public final boolean zzf() {
        return false;
    }

    @Override // com.daaw.d78
    public final nw8 zzi() {
        return this.a;
    }
}
