package com.daaw;

import com.daaw.cp0;
import com.daaw.ib0;
import com.daaw.pb0;
import com.daaw.qo0;
import com.daaw.rb0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class kb0 implements qo0, rb0.c, pb0.a {
    public int A;
    public TrackGroupArray B;
    public gb1 E;
    public boolean F;
    public final gb0 p;
    public final pb0 q;
    public final fb0 r;
    public final int s;
    public final cp0.a t;
    public final l2 u;
    public final wi x;
    public final boolean y;
    public qo0.a z;
    public final IdentityHashMap<d81, Integer> v = new IdentityHashMap<>();
    public final pl1 w = new pl1();
    public rb0[] C = new rb0[0];
    public rb0[] D = new rb0[0];

    public kb0(gb0 gb0Var, pb0 pb0Var, fb0 fb0Var, int i, cp0.a aVar, l2 l2Var, wi wiVar, boolean z) {
        this.p = gb0Var;
        this.q = pb0Var;
        this.r = fb0Var;
        this.s = i;
        this.t = aVar;
        this.u = l2Var;
        this.x = wiVar;
        this.y = z;
        this.E = wiVar.a(new gb1[0]);
        aVar.q();
    }

    public static Format v(Format format, Format format2, int i) {
        String str;
        String s;
        int i2;
        int i3;
        if (format2 != null) {
            String str2 = format2.r;
            int i4 = format2.G;
            int i5 = format2.M;
            str = format2.N;
            s = str2;
            i2 = i4;
            i3 = i5;
        } else {
            str = null;
            s = sq1.s(format.r, 1);
            i2 = -1;
            i3 = 0;
        }
        return Format.u(format.p, hq0.d(s), s, i, -1, i2, -1, null, null, i3, str);
    }

    public static Format w(Format format) {
        String s = sq1.s(format.r, 2);
        return Format.J(format.p, hq0.d(s), s, format.q, -1, format.y, format.z, format.A, null, null);
    }

    @Override // com.daaw.rb0.c
    public void a() {
        rb0[] rb0VarArr;
        int i = this.A - 1;
        this.A = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (rb0 rb0Var : this.C) {
            i2 += rb0Var.s().p;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (rb0 rb0Var2 : this.C) {
            int i4 = rb0Var2.s().p;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = rb0Var2.s().a(i5);
                i5++;
                i3++;
            }
        }
        this.B = new TrackGroupArray(trackGroupArr);
        this.z.j(this);
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long b() {
        return this.E.b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public boolean c(long j) {
        if (this.B == null) {
            for (rb0 rb0Var : this.C) {
                rb0Var.y();
            }
            return false;
        }
        return this.E.c(j);
    }

    @Override // com.daaw.pb0.a
    public boolean d(ib0.a aVar, boolean z) {
        boolean z2 = true;
        for (rb0 rb0Var : this.C) {
            z2 &= rb0Var.O(aVar, z);
        }
        this.z.n(this);
        return z2;
    }

    @Override // com.daaw.qo0
    public long e(long j, ea1 ea1Var) {
        return j;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long f() {
        return this.E.f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public void g(long j) {
        this.E.g(j);
    }

    @Override // com.daaw.pb0.a
    public void h() {
        this.z.n(this);
    }

    @Override // com.daaw.qo0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        d81[] d81VarArr2 = d81VarArr;
        int[] iArr = new int[cVarArr.length];
        int[] iArr2 = new int[cVarArr.length];
        for (int i = 0; i < cVarArr.length; i++) {
            iArr[i] = d81VarArr2[i] == null ? -1 : this.v.get(d81VarArr2[i]).intValue();
            iArr2[i] = -1;
            if (cVarArr[i] != null) {
                TrackGroup a = cVarArr[i].a();
                int i2 = 0;
                while (true) {
                    rb0[] rb0VarArr = this.C;
                    if (i2 >= rb0VarArr.length) {
                        break;
                    } else if (rb0VarArr[i2].s().b(a) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.v.clear();
        int length = cVarArr.length;
        d81[] d81VarArr3 = new d81[length];
        d81[] d81VarArr4 = new d81[cVarArr.length];
        com.google.android.exoplayer2.trackselection.c[] cVarArr2 = new com.google.android.exoplayer2.trackselection.c[cVarArr.length];
        rb0[] rb0VarArr2 = new rb0[this.C.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.C.length) {
            for (int i5 = 0; i5 < cVarArr.length; i5++) {
                com.google.android.exoplayer2.trackselection.c cVar = null;
                d81VarArr4[i5] = iArr[i5] == i4 ? d81VarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    cVar = cVarArr[i5];
                }
                cVarArr2[i5] = cVar;
            }
            rb0 rb0Var = this.C[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            com.google.android.exoplayer2.trackselection.c[] cVarArr3 = cVarArr2;
            rb0[] rb0VarArr3 = rb0VarArr2;
            boolean W = rb0Var.W(cVarArr2, zArr, d81VarArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= cVarArr.length) {
                    break;
                }
                if (iArr2[i9] == i8) {
                    s6.f(d81VarArr4[i9] != null);
                    d81VarArr3[i9] = d81VarArr4[i9];
                    this.v.put(d81VarArr4[i9], Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    s6.f(d81VarArr4[i9] == null);
                }
                i9++;
            }
            if (z2) {
                rb0VarArr3[i6] = rb0Var;
                i3 = i6 + 1;
                if (i6 == 0) {
                    rb0Var.X(true);
                    if (!W) {
                        rb0[] rb0VarArr4 = this.D;
                        if (rb0VarArr4.length != 0) {
                            if (rb0Var == rb0VarArr4[0]) {
                            }
                            this.w.b();
                            z = true;
                        }
                    }
                    this.w.b();
                    z = true;
                } else {
                    rb0Var.X(false);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            d81VarArr2 = d81VarArr;
            rb0VarArr2 = rb0VarArr3;
            length = i7;
            cVarArr2 = cVarArr3;
        }
        System.arraycopy(d81VarArr3, 0, d81VarArr2, 0, length);
        rb0[] rb0VarArr5 = (rb0[]) Arrays.copyOf(rb0VarArr2, i3);
        this.D = rb0VarArr5;
        this.E = this.x.a(rb0VarArr5);
        return j;
    }

    @Override // com.daaw.rb0.c
    public void k(ib0.a aVar) {
        this.q.e(aVar);
    }

    @Override // com.daaw.qo0
    public void l() {
        for (rb0 rb0Var : this.C) {
            rb0Var.l();
        }
    }

    @Override // com.daaw.qo0
    public long m(long j) {
        rb0[] rb0VarArr = this.D;
        if (rb0VarArr.length > 0) {
            boolean V = rb0VarArr[0].V(j, false);
            int i = 1;
            while (true) {
                rb0[] rb0VarArr2 = this.D;
                if (i >= rb0VarArr2.length) {
                    break;
                }
                rb0VarArr2[i].V(j, V);
                i++;
            }
            if (V) {
                this.w.b();
            }
        }
        return j;
    }

    public final void o(ib0 ib0Var, long j) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(ib0Var.c);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            ib0.a aVar = (ib0.a) arrayList2.get(i);
            Format format = aVar.b;
            if (format.z > 0 || sq1.s(format.r, 2) != null) {
                arrayList3.add(aVar);
            } else if (sq1.s(format.r, 1) != null) {
                arrayList4.add(aVar);
            }
        }
        if (arrayList3.isEmpty()) {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList3;
        }
        s6.a(!arrayList.isEmpty());
        ib0.a[] aVarArr = (ib0.a[]) arrayList.toArray(new ib0.a[0]);
        String str = aVarArr[0].b.r;
        rb0 u = u(0, aVarArr, ib0Var.f, ib0Var.g, j);
        this.C[0] = u;
        if (!this.y || str == null) {
            u.X(true);
            u.y();
            return;
        }
        boolean z = sq1.s(str, 2) != null;
        boolean z2 = sq1.s(str, 1) != null;
        ArrayList arrayList5 = new ArrayList();
        if (z) {
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i2 = 0; i2 < size; i2++) {
                formatArr[i2] = w(aVarArr[i2].b);
            }
            arrayList5.add(new TrackGroup(formatArr));
            if (z2 && (ib0Var.f != null || ib0Var.d.isEmpty())) {
                arrayList5.add(new TrackGroup(v(aVarArr[0].b, ib0Var.f, -1)));
            }
            List<Format> list = ib0Var.g;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    arrayList5.add(new TrackGroup(list.get(i3)));
                }
            }
        } else if (!z2) {
            throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
        } else {
            int size2 = arrayList.size();
            Format[] formatArr2 = new Format[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                Format format2 = aVarArr[i4].b;
                formatArr2[i4] = v(format2, ib0Var.f, format2.q);
            }
            arrayList5.add(new TrackGroup(formatArr2));
        }
        TrackGroup trackGroup = new TrackGroup(Format.y("ID3", "application/id3", null, -1, null));
        arrayList5.add(trackGroup);
        u.Q(new TrackGroupArray((TrackGroup[]) arrayList5.toArray(new TrackGroup[0])), 0, new TrackGroupArray(trackGroup));
    }

    @Override // com.daaw.qo0
    public void p(qo0.a aVar, long j) {
        this.z = aVar;
        this.q.l(this);
        r(j);
    }

    @Override // com.daaw.qo0
    public long q() {
        if (this.F) {
            return -9223372036854775807L;
        }
        this.t.t();
        this.F = true;
        return -9223372036854775807L;
    }

    public final void r(long j) {
        ib0 i = this.q.i();
        List<ib0.a> list = i.d;
        List<ib0.a> list2 = i.e;
        int size = list.size() + 1 + list2.size();
        this.C = new rb0[size];
        this.A = size;
        o(i, j);
        char c = 0;
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            ib0.a aVar = list.get(i2);
            ib0.a[] aVarArr = new ib0.a[1];
            aVarArr[c] = aVar;
            rb0 u = u(1, aVarArr, null, Collections.emptyList(), j);
            int i4 = i3 + 1;
            this.C[i3] = u;
            Format format = aVar.b;
            if (!this.y || format.r == null) {
                u.y();
            } else {
                u.Q(new TrackGroupArray(new TrackGroup(aVar.b)), 0, TrackGroupArray.s);
            }
            i2++;
            i3 = i4;
            c = 0;
        }
        int i5 = 0;
        while (i5 < list2.size()) {
            ib0.a aVar2 = list2.get(i5);
            rb0 u2 = u(3, new ib0.a[]{aVar2}, null, Collections.emptyList(), j);
            this.C[i3] = u2;
            u2.Q(new TrackGroupArray(new TrackGroup(aVar2.b)), 0, TrackGroupArray.s);
            i5++;
            i3++;
        }
        this.D = this.C;
    }

    @Override // com.daaw.qo0
    public TrackGroupArray s() {
        return this.B;
    }

    @Override // com.daaw.qo0
    public void t(long j, boolean z) {
        for (rb0 rb0Var : this.D) {
            rb0Var.t(j, z);
        }
    }

    public final rb0 u(int i, ib0.a[] aVarArr, Format format, List<Format> list, long j) {
        return new rb0(i, this, new eb0(this.p, this.q, aVarArr, this.r, this.w, list), this.u, j, format, this.s, this.t);
    }

    @Override // com.daaw.gb1.a
    /* renamed from: x */
    public void n(rb0 rb0Var) {
        this.z.n(this);
    }

    public void y() {
        this.q.c(this);
        for (rb0 rb0Var : this.C) {
            rb0Var.S();
        }
        this.z = null;
        this.t.r();
    }
}
