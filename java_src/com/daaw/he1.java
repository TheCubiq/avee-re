package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class he1 implements InterfaceC2154m7 {

    /* renamed from: g */
    public int f12461g;

    /* renamed from: h */
    public ge1 f12462h;

    /* renamed from: i */
    public ByteBuffer f12463i;

    /* renamed from: j */
    public ShortBuffer f12464j;

    /* renamed from: k */
    public ByteBuffer f12465k;

    /* renamed from: l */
    public long f12466l;

    /* renamed from: m */
    public long f12467m;

    /* renamed from: n */
    public boolean f12468n;

    /* renamed from: d */
    public float f12458d = 1.0f;

    /* renamed from: e */
    public float f12459e = 1.0f;

    /* renamed from: b */
    public int f12456b = -1;

    /* renamed from: c */
    public int f12457c = -1;

    /* renamed from: f */
    public int f12460f = -1;

    public he1() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f12463i = byteBuffer;
        this.f12464j = byteBuffer.asShortBuffer();
        this.f12465k = byteBuffer;
        this.f12461g = -1;
    }

    /* renamed from: a */
    public long m20835a(long j) {
        long j2 = this.f12467m;
        if (j2 >= 1024) {
            int i = this.f12460f;
            int i2 = this.f12457c;
            long j3 = this.f12466l;
            return i == i2 ? sq1.m10025T(j, j3, j2) : sq1.m10025T(j, j3 * i, j2 * i2);
        }
        double d = this.f12458d;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    /* renamed from: b */
    public float m20834b(float f) {
        float m10005k = sq1.m10005k(f, 0.1f, 8.0f);
        if (this.f12459e != m10005k) {
            this.f12459e = m10005k;
            this.f12462h = null;
        }
        flush();
        return m10005k;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        ge1 ge1Var;
        return this.f12468n && ((ge1Var = this.f12462h) == null || ge1Var.m21744j() == 0);
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        return this.f12457c != -1 && (Math.abs(this.f12458d - 1.0f) >= 0.01f || Math.abs(this.f12459e - 1.0f) >= 0.01f || this.f12460f != this.f12457c);
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        this.f12458d = 1.0f;
        this.f12459e = 1.0f;
        this.f12456b = -1;
        this.f12457c = -1;
        this.f12460f = -1;
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f12463i = byteBuffer;
        this.f12464j = byteBuffer.asShortBuffer();
        this.f12465k = byteBuffer;
        this.f12461g = -1;
        this.f12462h = null;
        this.f12466l = 0L;
        this.f12467m = 0L;
        this.f12468n = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f12465k;
        this.f12465k = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        if (mo6542d()) {
            ge1 ge1Var = this.f12462h;
            if (ge1Var == null) {
                this.f12462h = new ge1(this.f12457c, this.f12456b, this.f12458d, this.f12459e, this.f12460f);
            } else {
                ge1Var.m21745i();
            }
        }
        this.f12465k = InterfaceC2154m7.f18485a;
        this.f12466l = 0L;
        this.f12467m = 0L;
        this.f12468n = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    public void mo6539g(ByteBuffer byteBuffer) {
        C2914s6.m10685f(this.f12462h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f12466l += remaining;
            this.f12462h.m21735s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int m21744j = this.f12462h.m21744j() * this.f12456b * 2;
        if (m21744j > 0) {
            if (this.f12463i.capacity() < m21744j) {
                ByteBuffer order = ByteBuffer.allocateDirect(m21744j).order(ByteOrder.nativeOrder());
                this.f12463i = order;
                this.f12464j = order.asShortBuffer();
            } else {
                this.f12463i.clear();
                this.f12464j.clear();
            }
            this.f12462h.m21743k(this.f12464j);
            this.f12467m += m21744j;
            this.f12463i.limit(m21744j);
            this.f12465k = this.f12463i;
        }
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        return this.f12456b;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f12460f;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        C2914s6.m10685f(this.f12462h != null);
        this.f12462h.m21736r();
        this.f12468n = true;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.f12461g;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.f12457c == i && this.f12456b == i2 && this.f12460f == i4) {
                return false;
            }
            this.f12457c = i;
            this.f12456b = i2;
            this.f12460f = i4;
            this.f12462h = null;
            return true;
        }
        throw new InterfaceC2154m7.C2155a(i, i2, i3);
    }

    /* renamed from: m */
    public float m20833m(float f) {
        float m10005k = sq1.m10005k(f, 0.1f, 8.0f);
        if (this.f12458d != m10005k) {
            this.f12458d = m10005k;
            this.f12462h = null;
        }
        flush();
        return m10005k;
    }
}
