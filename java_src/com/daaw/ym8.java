package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ym8 implements hi8 {

    /* renamed from: b */
    public int f33849b;

    /* renamed from: c */
    public float f33850c = 1.0f;

    /* renamed from: d */
    public float f33851d = 1.0f;

    /* renamed from: e */
    public di8 f33852e;

    /* renamed from: f */
    public di8 f33853f;

    /* renamed from: g */
    public di8 f33854g;

    /* renamed from: h */
    public di8 f33855h;

    /* renamed from: i */
    public boolean f33856i;

    /* renamed from: j */
    public wm8 f33857j;

    /* renamed from: k */
    public ByteBuffer f33858k;

    /* renamed from: l */
    public ShortBuffer f33859l;

    /* renamed from: m */
    public ByteBuffer f33860m;

    /* renamed from: n */
    public long f33861n;

    /* renamed from: o */
    public long f33862o;

    /* renamed from: p */
    public boolean f33863p;

    public ym8() {
        di8 di8Var = di8.f7132e;
        this.f33852e = di8Var;
        this.f33853f = di8Var;
        this.f33854g = di8Var;
        this.f33855h = di8Var;
        ByteBuffer byteBuffer = hi8.f12557a;
        this.f33858k = byteBuffer;
        this.f33859l = byteBuffer.asShortBuffer();
        this.f33860m = byteBuffer;
        this.f33849b = -1;
    }

    @Override // com.daaw.hi8
    /* renamed from: a */
    public final di8 mo3499a(di8 di8Var) {
        if (di8Var.f7135c == 2) {
            int i = this.f33849b;
            if (i == -1) {
                i = di8Var.f7133a;
            }
            this.f33852e = di8Var;
            di8 di8Var2 = new di8(i, di8Var.f7134b, 2);
            this.f33853f = di8Var2;
            this.f33856i = true;
            return di8Var2;
        }
        throw new fi8(di8Var);
    }

    @Override // com.daaw.hi8
    /* renamed from: b */
    public final void mo3498b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            wm8 wm8Var = this.f33857j;
            Objects.requireNonNull(wm8Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f33861n += remaining;
            wm8Var.m5964f(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: c */
    public final long m3497c(long j) {
        wm8 wm8Var;
        long j2 = this.f33862o;
        if (j2 < 1024) {
            double d = this.f33850c;
            double d2 = j;
            Double.isNaN(d);
            Double.isNaN(d2);
            return (long) (d * d2);
        }
        long j3 = this.f33861n;
        Objects.requireNonNull(this.f33857j);
        long m5968b = j3 - wm8Var.m5968b();
        int i = this.f33855h.f7133a;
        int i2 = this.f33854g.f7133a;
        return i == i2 ? it5.m19392g0(j, m5968b, j2) : it5.m19392g0(j, m5968b * i, j2 * i2);
    }

    /* renamed from: d */
    public final void m3496d(float f) {
        if (this.f33851d != f) {
            this.f33851d = f;
            this.f33856i = true;
        }
    }

    /* renamed from: e */
    public final void m3495e(float f) {
        if (this.f33850c != f) {
            this.f33850c = f;
            this.f33856i = true;
        }
    }

    @Override // com.daaw.hi8
    public final ByteBuffer zzb() {
        int m5969a;
        wm8 wm8Var = this.f33857j;
        if (wm8Var != null && (m5969a = wm8Var.m5969a()) > 0) {
            if (this.f33858k.capacity() < m5969a) {
                ByteBuffer order = ByteBuffer.allocateDirect(m5969a).order(ByteOrder.nativeOrder());
                this.f33858k = order;
                this.f33859l = order.asShortBuffer();
            } else {
                this.f33858k.clear();
                this.f33859l.clear();
            }
            wm8Var.m5966d(this.f33859l);
            this.f33862o += m5969a;
            this.f33858k.limit(m5969a);
            this.f33860m = this.f33858k;
        }
        ByteBuffer byteBuffer = this.f33860m;
        this.f33860m = hi8.f12557a;
        return byteBuffer;
    }

    @Override // com.daaw.hi8
    public final void zzc() {
        if (zzg()) {
            di8 di8Var = this.f33852e;
            this.f33854g = di8Var;
            di8 di8Var2 = this.f33853f;
            this.f33855h = di8Var2;
            if (this.f33856i) {
                this.f33857j = new wm8(di8Var.f7133a, di8Var.f7134b, this.f33850c, this.f33851d, di8Var2.f7133a);
            } else {
                wm8 wm8Var = this.f33857j;
                if (wm8Var != null) {
                    wm8Var.m5967c();
                }
            }
        }
        this.f33860m = hi8.f12557a;
        this.f33861n = 0L;
        this.f33862o = 0L;
        this.f33863p = false;
    }

    @Override // com.daaw.hi8
    public final void zzd() {
        wm8 wm8Var = this.f33857j;
        if (wm8Var != null) {
            wm8Var.m5965e();
        }
        this.f33863p = true;
    }

    @Override // com.daaw.hi8
    public final void zzf() {
        this.f33850c = 1.0f;
        this.f33851d = 1.0f;
        di8 di8Var = di8.f7132e;
        this.f33852e = di8Var;
        this.f33853f = di8Var;
        this.f33854g = di8Var;
        this.f33855h = di8Var;
        ByteBuffer byteBuffer = hi8.f12557a;
        this.f33858k = byteBuffer;
        this.f33859l = byteBuffer.asShortBuffer();
        this.f33860m = byteBuffer;
        this.f33849b = -1;
        this.f33856i = false;
        this.f33857j = null;
        this.f33861n = 0L;
        this.f33862o = 0L;
        this.f33863p = false;
    }

    @Override // com.daaw.hi8
    public final boolean zzg() {
        if (this.f33853f.f7133a != -1) {
            return Math.abs(this.f33850c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f33851d + (-1.0f)) >= 1.0E-4f || this.f33853f.f7133a != this.f33852e.f7133a;
        }
        return false;
    }

    @Override // com.daaw.hi8
    public final boolean zzh() {
        wm8 wm8Var;
        return this.f33863p && ((wm8Var = this.f33857j) == null || wm8Var.m5969a() == 0);
    }
}
