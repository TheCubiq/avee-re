package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class vr2 implements qq2 {
    public ur2 d;
    public ByteBuffer g;
    public ShortBuffer h;
    public ByteBuffer i;
    public long j;
    public long k;
    public boolean l;
    public float e = 1.0f;
    public float f = 1.0f;
    public int b = -1;
    public int c = -1;

    public vr2() {
        ByteBuffer byteBuffer = qq2.a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.j += remaining;
            this.d.d(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int a = this.d.a() * this.b;
        int i = a + a;
        if (i > 0) {
            if (this.g.capacity() < i) {
                ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.g = order;
                this.h = order.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            this.d.b(this.h);
            this.k += i;
            this.g.limit(i);
            this.i = this.g;
        }
    }

    @Override // com.daaw.qq2
    public final boolean b(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            return true;
        }
        throw new pq2(i, i2, i3);
    }

    public final float c(float f) {
        this.f = pz2.a(1.0f, 0.1f, 8.0f);
        return 1.0f;
    }

    public final float d(float f) {
        float a = pz2.a(f, 0.1f, 8.0f);
        this.e = a;
        return a;
    }

    public final long e() {
        return this.j;
    }

    public final long f() {
        return this.k;
    }

    @Override // com.daaw.qq2
    public final int zza() {
        return this.b;
    }

    @Override // com.daaw.qq2
    public final int zzb() {
        return 2;
    }

    @Override // com.daaw.qq2
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.i;
        this.i = qq2.a;
        return byteBuffer;
    }

    @Override // com.daaw.qq2
    public final void zzd() {
        ur2 ur2Var = new ur2(this.c, this.b);
        this.d = ur2Var;
        ur2Var.f(this.e);
        this.d.e(this.f);
        this.i = qq2.a;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.daaw.qq2
    public final void zze() {
        this.d.c();
        this.l = true;
    }

    @Override // com.daaw.qq2
    public final void zzg() {
        this.d = null;
        ByteBuffer byteBuffer = qq2.a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.daaw.qq2
    public final boolean zzi() {
        return Math.abs(this.e + (-1.0f)) >= 0.01f || Math.abs(this.f + (-1.0f)) >= 0.01f;
    }

    @Override // com.daaw.qq2
    public final boolean zzj() {
        ur2 ur2Var;
        return this.l && ((ur2Var = this.d) == null || ur2Var.a() == 0);
    }
}
