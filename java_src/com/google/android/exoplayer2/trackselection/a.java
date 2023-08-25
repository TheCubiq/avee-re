package com.google.android.exoplayer2.trackselection;

import com.daaw.ia;
import com.daaw.sq1;
import com.daaw.za;
import com.daaw.zf;
import com.daaw.zn0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.c;
import java.util.List;
/* loaded from: classes.dex */
public class a extends za {
    public final ia g;
    public final long h;
    public final long i;
    public final long j;
    public final float k;
    public final float l;
    public final long m;
    public final zf n;
    public float o;
    public int p;
    public int q;
    public long r;

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0095a implements c.a {
        public final ia a;
        public final int b;
        public final int c;
        public final int d;
        public final float e;
        public final float f;
        public final long g;
        public final zf h;

        public C0095a(ia iaVar) {
            this(iaVar, 10000, 25000, 25000, 0.75f, 0.75f, 2000L, zf.a);
        }

        public C0095a(ia iaVar, int i, int i2, int i3, float f, float f2, long j, zf zfVar) {
            this.a = iaVar;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = f;
            this.f = f2;
            this.g = j;
            this.h = zfVar;
        }

        @Override // com.google.android.exoplayer2.trackselection.c.a
        /* renamed from: b */
        public a a(TrackGroup trackGroup, int... iArr) {
            return new a(trackGroup, iArr, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    public a(TrackGroup trackGroup, int[] iArr, ia iaVar, long j, long j2, long j3, float f, float f2, long j4, zf zfVar) {
        super(trackGroup, iArr);
        this.g = iaVar;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = f;
        this.l = f2;
        this.m = j4;
        this.n = zfVar;
        this.o = 1.0f;
        this.q = 1;
        this.r = -9223372036854775807L;
        this.p = r(Long.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int b() {
        return this.p;
    }

    @Override // com.daaw.za, com.google.android.exoplayer2.trackselection.c
    public void e() {
        this.r = -9223372036854775807L;
    }

    @Override // com.daaw.za, com.google.android.exoplayer2.trackselection.c
    public int h(long j, List<? extends zn0> list) {
        int i;
        int i2;
        long b = this.n.b();
        long j2 = this.r;
        if (j2 == -9223372036854775807L || b - j2 >= this.m) {
            this.r = b;
            if (list.isEmpty()) {
                return 0;
            }
            int size = list.size();
            if (sq1.z(list.get(size - 1).f - j, this.o) < this.j) {
                return size;
            }
            Format d = d(r(b));
            for (int i3 = 0; i3 < size; i3++) {
                zn0 zn0Var = list.get(i3);
                Format format = zn0Var.c;
                if (sq1.z(zn0Var.f - j, this.o) >= this.j && format.q < d.q && (i = format.z) != -1 && i < 720 && (i2 = format.y) != -1 && i2 < 1280 && i < d.z) {
                    return i3;
                }
            }
            return size;
        }
        return list.size();
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int l() {
        return this.q;
    }

    @Override // com.daaw.za, com.google.android.exoplayer2.trackselection.c
    public void m(float f) {
        this.o = f;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void n(long j, long j2, long j3) {
        long b = this.n.b();
        int i = this.p;
        int r = r(b);
        this.p = r;
        if (r == i) {
            return;
        }
        if (!q(i, b)) {
            Format d = d(i);
            Format d2 = d(this.p);
            if ((d2.q > d.q && j2 < s(j3)) || (d2.q < d.q && j2 >= this.i)) {
                this.p = i;
            }
        }
        if (this.p != i) {
            this.q = 3;
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public Object o() {
        return null;
    }

    public final int r(long j) {
        long d = ((float) this.g.d()) * this.k;
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            if (j == Long.MIN_VALUE || !q(i2, j)) {
                if (Math.round(d(i2).q * this.o) <= d) {
                    return i2;
                }
                i = i2;
            }
        }
        return i;
    }

    public final long s(long j) {
        return (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1)) != 0 && (j > this.h ? 1 : (j == this.h ? 0 : -1)) <= 0 ? ((float) j) * this.l : this.h;
    }
}
