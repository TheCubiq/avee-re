package com.daaw;
/* loaded from: classes.dex */
public final class cq7 implements d78 {
    public final nw8 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public cq7() {
        nw8 nw8Var = new nw8(true, 65536);
        d(2500, 0, "bufferForPlaybackMs", "0");
        d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(50000, 50000, "maxBufferMs", "minBufferMs");
        d(0, 0, "backBufferDurationMs", "0");
        this.a = nw8Var;
        this.b = it5.f0(50000L);
        this.c = it5.f0(50000L);
        this.d = it5.f0(2500L);
        this.e = it5.f0(5000L);
        this.g = 13107200;
        this.f = it5.f0(0L);
    }

    public static void d(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        uo4.e(z, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.d78
    public final boolean a(long j, float f, boolean z, long j2) {
        long e0 = it5.e0(j, f);
        long j3 = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || e0 >= j3 || this.a.a() >= this.g;
    }

    @Override // com.daaw.d78
    public final void b(i98[] i98VarArr, au8 au8Var, tv8[] tv8VarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = i98VarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.g = max;
                this.a.f(max);
                return;
            }
            if (tv8VarArr[i] != null) {
                i2 += i98VarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.daaw.d78
    public final boolean c(long j, long j2, float f) {
        int a = this.a.a();
        int i = this.g;
        long j3 = this.b;
        if (f > 1.0f) {
            j3 = Math.min(it5.c0(j3, f), this.c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = a < i;
            this.h = z;
            if (!z && j2 < 500000) {
                s95.e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || a >= i) {
            this.h = false;
        }
        return this.h;
    }

    public final void e(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.e();
        }
    }

    @Override // com.daaw.d78
    public final long zza() {
        return this.f;
    }

    @Override // com.daaw.d78
    public final void zzb() {
        e(false);
    }

    @Override // com.daaw.d78
    public final void zzc() {
        e(true);
    }

    @Override // com.daaw.d78
    public final void zzd() {
        e(true);
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
