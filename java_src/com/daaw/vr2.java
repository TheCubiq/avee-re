package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class vr2 implements qq2 {

    /* renamed from: d */
    public ur2 f30528d;

    /* renamed from: g */
    public ByteBuffer f30531g;

    /* renamed from: h */
    public ShortBuffer f30532h;

    /* renamed from: i */
    public ByteBuffer f30533i;

    /* renamed from: j */
    public long f30534j;

    /* renamed from: k */
    public long f30535k;

    /* renamed from: l */
    public boolean f30536l;

    /* renamed from: e */
    public float f30529e = 1.0f;

    /* renamed from: f */
    public float f30530f = 1.0f;

    /* renamed from: b */
    public int f30526b = -1;

    /* renamed from: c */
    public int f30527c = -1;

    public vr2() {
        ByteBuffer byteBuffer = qq2.f24260a;
        this.f30531g = byteBuffer;
        this.f30532h = byteBuffer.asShortBuffer();
        this.f30533i = byteBuffer;
    }

    @Override // com.daaw.qq2
    /* renamed from: a */
    public final void mo6842a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f30534j += remaining;
            this.f30528d.m7790d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int m7793a = this.f30528d.m7793a() * this.f30526b;
        int i = m7793a + m7793a;
        if (i > 0) {
            if (this.f30531g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f30531g = order;
                this.f30532h = order.asShortBuffer();
            } else {
                this.f30531g.clear();
                this.f30532h.clear();
            }
            this.f30528d.m7792b(this.f30532h);
            this.f30535k += i;
            this.f30531g.limit(i);
            this.f30533i = this.f30531g;
        }
    }

    @Override // com.daaw.qq2
    /* renamed from: b */
    public final boolean mo6841b(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.f30527c == i && this.f30526b == i2) {
                return false;
            }
            this.f30527c = i;
            this.f30526b = i2;
            return true;
        }
        throw new pq2(i, i2, i3);
    }

    /* renamed from: c */
    public final float m6840c(float f) {
        this.f30530f = pz2.m12849a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    /* renamed from: d */
    public final float m6839d(float f) {
        float m12849a = pz2.m12849a(f, 0.1f, 8.0f);
        this.f30529e = m12849a;
        return m12849a;
    }

    /* renamed from: e */
    public final long m6838e() {
        return this.f30534j;
    }

    /* renamed from: f */
    public final long m6837f() {
        return this.f30535k;
    }

    @Override // com.daaw.qq2
    public final int zza() {
        return this.f30526b;
    }

    @Override // com.daaw.qq2
    public final int zzb() {
        return 2;
    }

    @Override // com.daaw.qq2
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.f30533i;
        this.f30533i = qq2.f24260a;
        return byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void zzd() {
        ur2 ur2Var = new ur2(this.f30527c, this.f30526b);
        this.f30528d = ur2Var;
        ur2Var.m7788f(this.f30529e);
        this.f30528d.m7789e(this.f30530f);
        this.f30533i = qq2.f24260a;
        this.f30534j = 0L;
        this.f30535k = 0L;
        this.f30536l = false;
    }

    @Override // com.daaw.qq2
    public final void zze() {
        this.f30528d.m7791c();
        this.f30536l = true;
    }

    @Override // com.daaw.qq2
    public final void zzg() {
        this.f30528d = null;
        ByteBuffer byteBuffer = qq2.f24260a;
        this.f30531g = byteBuffer;
        this.f30532h = byteBuffer.asShortBuffer();
        this.f30533i = byteBuffer;
        this.f30526b = -1;
        this.f30527c = -1;
        this.f30534j = 0L;
        this.f30535k = 0L;
        this.f30536l = false;
    }

    @Override // com.daaw.qq2
    public final boolean zzi() {
        return Math.abs(this.f30529e + (-1.0f)) >= 0.01f || Math.abs(this.f30530f + (-1.0f)) >= 0.01f;
    }

    @Override // com.daaw.qq2
    public final boolean zzj() {
        ur2 ur2Var;
        return this.f30536l && ((ur2Var = this.f30528d) == null || ur2Var.m7793a() == 0);
    }
}
