package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ym8 implements hi8 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public di8 e;
    public di8 f;
    public di8 g;
    public di8 h;
    public boolean i;
    public wm8 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public ym8() {
        di8 di8Var = di8.e;
        this.e = di8Var;
        this.f = di8Var;
        this.g = di8Var;
        this.h = di8Var;
        ByteBuffer byteBuffer = hi8.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // com.daaw.hi8
    public final di8 a(di8 di8Var) {
        if (di8Var.c == 2) {
            int i = this.b;
            if (i == -1) {
                i = di8Var.a;
            }
            this.e = di8Var;
            di8 di8Var2 = new di8(i, di8Var.b, 2);
            this.f = di8Var2;
            this.i = true;
            return di8Var2;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.hi8
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            wm8 wm8Var = this.j;
            Objects.requireNonNull(wm8Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            wm8Var.f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final long c(long j) {
        wm8 wm8Var;
        long j2 = this.o;
        if (j2 < 1024) {
            double d = this.c;
            double d2 = j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        long j3 = this.n;
        Objects.requireNonNull(this.j);
        long b = j3 - wm8Var.b();
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? it5.g0(j, b, j2) : it5.g0(j, b * i, j2 * i2);
    }

    public final void d(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void e(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    @Override // com.daaw.hi8
    public final ByteBuffer zzb() {
        int a;
        wm8 wm8Var = this.j;
        if (wm8Var != null && (a = wm8Var.a()) > 0) {
            if (this.k.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            wm8Var.d(this.l);
            this.o += a;
            this.k.limit(a);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = hi8.a;
        return byteBuffer;
    }

    @Override // com.daaw.hi8
    public final void zzc() {
        if (zzg()) {
            di8 di8Var = this.e;
            this.g = di8Var;
            di8 di8Var2 = this.f;
            this.h = di8Var2;
            if (this.i) {
                this.j = new wm8(di8Var.a, di8Var.b, this.c, this.d, di8Var2.a);
            } else {
                wm8 wm8Var = this.j;
                if (wm8Var != null) {
                    wm8Var.c();
                }
            }
        }
        this.m = hi8.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.daaw.hi8
    public final void zzd() {
        wm8 wm8Var = this.j;
        if (wm8Var != null) {
            wm8Var.e();
        }
        this.p = true;
    }

    @Override // com.daaw.hi8
    public final void zzf() {
        this.c = 1.0f;
        this.d = 1.0f;
        di8 di8Var = di8.e;
        this.e = di8Var;
        this.f = di8Var;
        this.g = di8Var;
        this.h = di8Var;
        ByteBuffer byteBuffer = hi8.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // com.daaw.hi8
    public final boolean zzg() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // com.daaw.hi8
    public final boolean zzh() {
        wm8 wm8Var;
        return this.p && ((wm8Var = this.j) == null || wm8Var.a() == 0);
    }
}
