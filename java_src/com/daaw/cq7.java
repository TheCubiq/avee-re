package com.daaw;
/* loaded from: classes.dex */
public final class cq7 implements d78 {

    /* renamed from: a */
    public final nw8 f6089a;

    /* renamed from: b */
    public final long f6090b;

    /* renamed from: c */
    public final long f6091c;

    /* renamed from: d */
    public final long f6092d;

    /* renamed from: e */
    public final long f6093e;

    /* renamed from: f */
    public final long f6094f;

    /* renamed from: g */
    public int f6095g;

    /* renamed from: h */
    public boolean f6096h;

    public cq7() {
        nw8 nw8Var = new nw8(true, 65536);
        m25114d(2500, 0, "bufferForPlaybackMs", "0");
        m25114d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m25114d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m25114d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m25114d(50000, 50000, "maxBufferMs", "minBufferMs");
        m25114d(0, 0, "backBufferDurationMs", "0");
        this.f6089a = nw8Var;
        this.f6090b = it5.m19394f0(50000L);
        this.f6091c = it5.m19394f0(50000L);
        this.f6092d = it5.m19394f0(2500L);
        this.f6093e = it5.m19394f0(5000L);
        this.f6095g = 13107200;
        this.f6094f = it5.m19394f0(0L);
    }

    /* renamed from: d */
    public static void m25114d(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        uo4.m7873e(z, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.d78
    /* renamed from: a */
    public final boolean mo7406a(long j, float f, boolean z, long j2) {
        long m19396e0 = it5.m19396e0(j, f);
        long j3 = z ? this.f6093e : this.f6092d;
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || m19396e0 >= j3 || this.f6089a.m14759a() >= this.f6095g;
    }

    @Override // com.daaw.d78
    /* renamed from: b */
    public final void mo7405b(i98[] i98VarArr, au8 au8Var, tv8[] tv8VarArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = i98VarArr.length;
            if (i >= 2) {
                int max = Math.max(13107200, i2);
                this.f6095g = max;
                this.f6089a.m14754f(max);
                return;
            }
            if (tv8VarArr[i] != null) {
                i2 += i98VarArr[i].zzb() != 1 ? 131072000 : 13107200;
            }
            i++;
        }
    }

    @Override // com.daaw.d78
    /* renamed from: c */
    public final boolean mo7404c(long j, long j2, float f) {
        int m14759a = this.f6089a.m14759a();
        int i = this.f6095g;
        long j3 = this.f6090b;
        if (f > 1.0f) {
            j3 = Math.min(it5.m19400c0(j3, f), this.f6091c);
        }
        if (j2 < Math.max(j3, 500000L)) {
            boolean z = m14759a < i;
            this.f6096h = z;
            if (!z && j2 < 500000) {
                s95.m10493e("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f6091c || m14759a >= i) {
            this.f6096h = false;
        }
        return this.f6096h;
    }

    /* renamed from: e */
    public final void m25113e(boolean z) {
        this.f6095g = 13107200;
        this.f6096h = false;
        if (z) {
            this.f6089a.m14755e();
        }
    }

    @Override // com.daaw.d78
    public final long zza() {
        return this.f6094f;
    }

    @Override // com.daaw.d78
    public final void zzb() {
        m25113e(false);
    }

    @Override // com.daaw.d78
    public final void zzc() {
        m25113e(true);
    }

    @Override // com.daaw.d78
    public final void zzd() {
        m25113e(true);
    }

    @Override // com.daaw.d78
    public final boolean zzf() {
        return false;
    }

    @Override // com.daaw.d78
    public final nw8 zzi() {
        return this.f6089a;
    }
}
