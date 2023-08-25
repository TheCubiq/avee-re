package com.daaw;
/* loaded from: classes.dex */
public final class cp implements bp {
    public final hf a;
    public final long b;

    public cp(hf hfVar, long j) {
        this.a = hfVar;
        this.b = j;
    }

    @Override // com.daaw.bp
    public long b(long j) {
        return this.a.e[(int) j] - this.b;
    }

    @Override // com.daaw.bp
    public long c(long j, long j2) {
        return this.a.d[(int) j];
    }

    @Override // com.daaw.bp
    public d31 d(long j) {
        hf hfVar = this.a;
        int i = (int) j;
        return new d31(null, hfVar.c[i], hfVar.b[i]);
    }

    @Override // com.daaw.bp
    public long e(long j, long j2) {
        return this.a.a(j + this.b);
    }

    @Override // com.daaw.bp
    public boolean f() {
        return true;
    }

    @Override // com.daaw.bp
    public long g() {
        return 0L;
    }

    @Override // com.daaw.bp
    public int h(long j) {
        return this.a.a;
    }
}
