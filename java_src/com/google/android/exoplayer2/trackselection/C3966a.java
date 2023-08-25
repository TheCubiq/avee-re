package com.google.android.exoplayer2.trackselection;

import com.daaw.AbstractC3823za;
import com.daaw.InterfaceC1671ia;
import com.daaw.InterfaceC3836zf;
import com.daaw.sq1;
import com.daaw.zn0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.List;
/* renamed from: com.google.android.exoplayer2.trackselection.a */
/* loaded from: classes.dex */
public class C3966a extends AbstractC3823za {

    /* renamed from: g */
    public final InterfaceC1671ia f35886g;

    /* renamed from: h */
    public final long f35887h;

    /* renamed from: i */
    public final long f35888i;

    /* renamed from: j */
    public final long f35889j;

    /* renamed from: k */
    public final float f35890k;

    /* renamed from: l */
    public final float f35891l;

    /* renamed from: m */
    public final long f35892m;

    /* renamed from: n */
    public final InterfaceC3836zf f35893n;

    /* renamed from: o */
    public float f35894o;

    /* renamed from: p */
    public int f35895p;

    /* renamed from: q */
    public int f35896q;

    /* renamed from: r */
    public long f35897r;

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a */
    /* loaded from: classes.dex */
    public static final class C3967a implements InterfaceC3970c.InterfaceC3971a {

        /* renamed from: a */
        public final InterfaceC1671ia f35898a;

        /* renamed from: b */
        public final int f35899b;

        /* renamed from: c */
        public final int f35900c;

        /* renamed from: d */
        public final int f35901d;

        /* renamed from: e */
        public final float f35902e;

        /* renamed from: f */
        public final float f35903f;

        /* renamed from: g */
        public final long f35904g;

        /* renamed from: h */
        public final InterfaceC3836zf f35905h;

        public C3967a(InterfaceC1671ia interfaceC1671ia) {
            this(interfaceC1671ia, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC3836zf.f35013a);
        }

        public C3967a(InterfaceC1671ia interfaceC1671ia, int i, int i2, int i3, float f, float f2, long j, InterfaceC3836zf interfaceC3836zf) {
            this.f35898a = interfaceC1671ia;
            this.f35899b = i;
            this.f35900c = i2;
            this.f35901d = i3;
            this.f35902e = f;
            this.f35903f = f2;
            this.f35904g = j;
            this.f35905h = interfaceC3836zf;
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c.InterfaceC3971a
        /* renamed from: b */
        public C3966a mo1518a(TrackGroup trackGroup, int... iArr) {
            return new C3966a(trackGroup, iArr, this.f35898a, this.f35899b, this.f35900c, this.f35901d, this.f35902e, this.f35903f, this.f35904g, this.f35905h);
        }
    }

    public C3966a(TrackGroup trackGroup, int[] iArr, InterfaceC1671ia interfaceC1671ia, long j, long j2, long j3, float f, float f2, long j4, InterfaceC3836zf interfaceC3836zf) {
        super(trackGroup, iArr);
        this.f35886g = interfaceC1671ia;
        this.f35887h = j * 1000;
        this.f35888i = j2 * 1000;
        this.f35889j = j3 * 1000;
        this.f35890k = f;
        this.f35891l = f2;
        this.f35892m = j4;
        this.f35893n = interfaceC3836zf;
        this.f35894o = 1.0f;
        this.f35896q = 1;
        this.f35897r = -9223372036854775807L;
        this.f35895p = m1551r(Long.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: b */
    public int mo1533b() {
        return this.f35895p;
    }

    @Override // com.daaw.AbstractC3823za, com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: e */
    public void mo1530e() {
        this.f35897r = -9223372036854775807L;
    }

    @Override // com.daaw.AbstractC3823za, com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: h */
    public int mo1527h(long j, List<? extends zn0> list) {
        int i;
        int i2;
        long mo2363b = this.f35893n.mo2363b();
        long j2 = this.f35897r;
        if (j2 == -9223372036854775807L || mo2363b - j2 >= this.f35892m) {
            this.f35897r = mo2363b;
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            if (sq1.m9990z(list.get(size - 1).f8433f - j, this.f35894o) < this.f35889j) {
                return size;
            }
            Format mo1531d = mo1531d(m1551r(mo2363b));
            for (int i3 = 0; i3 < size; i3++) {
                zn0 zn0Var = list.get(i3);
                Format format = zn0Var.f8430c;
                if (sq1.m9990z(zn0Var.f8433f - j, this.f35894o) >= this.f35889j && format.f35717q < mo1531d.f35717q && (i = format.f35726z) != -1 && i < 720 && (i2 = format.f35725y) != -1 && i2 < 1280 && i < mo1531d.f35726z) {
                    return i3;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: l */
    public int mo1523l() {
        return this.f35896q;
    }

    @Override // com.daaw.AbstractC3823za, com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: m */
    public void mo1522m(float f) {
        this.f35894o = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: n */
    public void mo1521n(long j, long j2, long j3) {
        long mo2363b = this.f35893n.mo2363b();
        int i = this.f35895p;
        int m1551r = m1551r(mo2363b);
        this.f35895p = m1551r;
        if (m1551r == i) {
            return;
        }
        if (!m2581q(i, mo2363b)) {
            Format mo1531d = mo1531d(i);
            Format mo1531d2 = mo1531d(this.f35895p);
            if ((mo1531d2.f35717q > mo1531d.f35717q && j2 < m1550s(j3)) || (mo1531d2.f35717q < mo1531d.f35717q && j2 >= this.f35888i)) {
                this.f35895p = i;
            }
        }
        if (this.f35895p != i) {
            this.f35896q = 3;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: o */
    public Object mo1520o() {
        return null;
    }

    /* renamed from: r */
    public final int m1551r(long j) {
        long mo16677d = ((float) this.f35886g.mo16677d()) * this.f35890k;
        int i = 0;
        for (int i2 = 0; i2 < this.f34635b; i2++) {
            if (j == Long.MIN_VALUE || !m2581q(i2, j)) {
                if (Math.round(mo1531d(i2).f35717q * this.f35894o) <= mo16677d) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: s */
    public final long m1550s(long j) {
        return (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1)) != 0 && (j > this.f35887h ? 1 : (j == this.f35887h ? 0 : -1)) <= 0 ? ((float) j) * this.f35891l : this.f35887h;
    }
}
