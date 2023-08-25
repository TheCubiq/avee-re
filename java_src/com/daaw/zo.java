package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.daaw.Cif;
import com.daaw.cp0;
import com.daaw.ex0;
import com.daaw.gb1;
import com.daaw.qo0;
import com.daaw.vo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class zo implements qo0, gb1.a<Cif<vo>>, Cif.b<vo> {
    public qo0.a B;
    public gb1 E;
    public wo F;
    public int G;
    public List<sy> H;
    public boolean I;
    public final int p;
    public final vo.a q;
    public final int r;
    public final cp0.a s;
    public final long t;
    public final lk0 u;
    public final l2 v;
    public final TrackGroupArray w;
    public final a[] x;
    public final wi y;
    public final ex0 z;
    public Cif<vo>[] C = A(0);
    public ky[] D = new ky[0];
    public final IdentityHashMap<Cif<vo>, ex0.c> A = new IdentityHashMap<>();

    /* loaded from: classes.dex */
    public static final class a {
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.b = i;
            this.a = iArr;
            this.c = i2;
            this.e = i3;
            this.f = i4;
            this.g = i5;
            this.d = i6;
        }

        public static a a(int[] iArr, int i) {
            return new a(3, 1, iArr, i, -1, -1, -1);
        }

        public static a b(int[] iArr, int i) {
            return new a(4, 1, iArr, i, -1, -1, -1);
        }

        public static a c(int i) {
            return new a(4, 2, null, -1, -1, -1, i);
        }

        public static a d(int i, int[] iArr, int i2, int i3, int i4) {
            return new a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public zo(int i, wo woVar, int i2, vo.a aVar, int i3, cp0.a aVar2, long j, lk0 lk0Var, l2 l2Var, wi wiVar, ex0.b bVar) {
        this.p = i;
        this.F = woVar;
        this.G = i2;
        this.q = aVar;
        this.r = i3;
        this.s = aVar2;
        this.t = j;
        this.u = lk0Var;
        this.v = l2Var;
        this.y = wiVar;
        this.z = new ex0(woVar, bVar, l2Var);
        this.E = wiVar.a(this.C);
        gw0 d = woVar.d(i2);
        List<sy> list = d.d;
        this.H = list;
        Pair<TrackGroupArray, a[]> u = u(d.c, list);
        this.w = (TrackGroupArray) u.first;
        this.x = (a[]) u.second;
        aVar2.q();
    }

    public static Cif<vo>[] A(int i) {
        return new Cif[i];
    }

    public static void D(d81 d81Var) {
        if (d81Var instanceof Cif.a) {
            ((Cif.a) d81Var).c();
        }
    }

    public static void h(List<sy> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            trackGroupArr[i] = new TrackGroup(Format.y(list.get(i2).a(), "application/x-emsg", null, -1, null));
            aVarArr[i] = a.c(i2);
            i2++;
            i++;
        }
    }

    public static int o(List<e1> list, int[][] iArr, int i, boolean[] zArr, boolean[] zArr2, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).c);
            }
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                formatArr[i7] = ((j41) arrayList.get(i7)).c;
            }
            e1 e1Var = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (zArr2[i4]) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            trackGroupArr[i5] = new TrackGroup(formatArr);
            aVarArr[i5] = a.d(e1Var.b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                trackGroupArr[i8] = new TrackGroup(Format.y(e1Var.a + ":emsg", "application/x-emsg", null, -1, null));
                aVarArr[i8] = a.b(iArr2, i5);
            }
            if (i2 != -1) {
                trackGroupArr[i2] = new TrackGroup(Format.B(e1Var.a + ":cea608", "application/cea-608", 0, null));
                aVarArr[i2] = a.a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    public static Pair<TrackGroupArray, a[]> u(List<e1> list, List<sy> list2) {
        int[][] w = w(list);
        int length = w.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int z = z(length, list, w, zArr, zArr2) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[z];
        a[] aVarArr = new a[z];
        h(list2, trackGroupArr, aVarArr, o(list, w, length, zArr, zArr2, trackGroupArr, aVarArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
    }

    public static jt v(List<jt> list) {
        for (int i = 0; i < list.size(); i++) {
            jt jtVar = list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(jtVar.a)) {
                return jtVar;
            }
        }
        return null;
    }

    public static int[][] w(List<e1> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).a, i);
        }
        int[][] iArr = new int[size];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!zArr[i3]) {
                zArr[i3] = true;
                jt v = v(list.get(i3).e);
                if (v == null) {
                    int[] iArr2 = new int[1];
                    iArr2[0] = i3;
                    iArr[i2] = iArr2;
                    i2++;
                } else {
                    String[] split = v.b.split(",");
                    int[] iArr3 = new int[split.length + 1];
                    iArr3[0] = i3;
                    int i4 = 0;
                    while (i4 < split.length) {
                        int i5 = sparseIntArray.get(Integer.parseInt(split[i4]));
                        zArr[i5] = true;
                        i4++;
                        iArr3[i4] = i5;
                    }
                    iArr[i2] = iArr3;
                    i2++;
                }
            }
        }
        return i2 < size ? (int[][]) Arrays.copyOf(iArr, i2) : iArr;
    }

    public static boolean x(List<e1> list, int[] iArr) {
        for (int i : iArr) {
            List<jt> list2 = list.get(i).d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(list2.get(i2).a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y(List<e1> list, int[] iArr) {
        for (int i : iArr) {
            List<j41> list2 = list.get(i).c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int z(int i, List<e1> list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (y(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            if (x(list, iArr[i3])) {
                zArr2[i3] = true;
                i2++;
            }
        }
        return i2;
    }

    @Override // com.daaw.gb1.a
    /* renamed from: B */
    public void n(Cif<vo> cif) {
        this.B.n(this);
    }

    public void C() {
        this.z.r();
        for (Cif<vo> cif : this.C) {
            cif.N(this);
        }
        this.B = null;
        this.s.r();
    }

    public final void E(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j, SparseArray<Cif<vo>> sparseArray) {
        for (int i = 0; i < cVarArr.length; i++) {
            if (((d81VarArr[i] instanceof Cif.a) || (d81VarArr[i] instanceof sw)) && (cVarArr[i] == null || !zArr[i])) {
                D(d81VarArr[i]);
                d81VarArr[i] = null;
            }
            if (cVarArr[i] != null) {
                a aVar = this.x[this.w.b(cVarArr[i].a())];
                if (aVar.c == 1) {
                    Cif<vo> cif = sparseArray.get(aVar.e);
                    d81 d81Var = d81VarArr[i];
                    if (!(cif == null ? d81Var instanceof sw : (d81Var instanceof Cif.a) && ((Cif.a) d81Var).p == cif)) {
                        D(d81Var);
                        d81VarArr[i] = cif == null ? new sw() : cif.P(j, aVar.b);
                        zArr2[i] = true;
                    }
                }
            }
        }
    }

    public final void F(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, List<ky> list) {
        for (int i = 0; i < cVarArr.length; i++) {
            if (d81VarArr[i] instanceof ky) {
                ky kyVar = (ky) d81VarArr[i];
                if (cVarArr[i] == null || !zArr[i]) {
                    d81VarArr[i] = null;
                } else {
                    list.add(kyVar);
                }
            }
            if (d81VarArr[i] == null && cVarArr[i] != null) {
                a aVar = this.x[this.w.b(cVarArr[i].a())];
                if (aVar.c == 2) {
                    ky kyVar2 = new ky(this.H.get(aVar.d), cVarArr[i].a().a(0), this.F.d);
                    d81VarArr[i] = kyVar2;
                    zArr2[i] = true;
                    list.add(kyVar2);
                }
            }
        }
    }

    public final void G(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j, SparseArray<Cif<vo>> sparseArray) {
        for (int i = 0; i < cVarArr.length; i++) {
            if (d81VarArr[i] instanceof Cif) {
                Cif<vo> cif = (Cif) d81VarArr[i];
                if (cVarArr[i] == null || !zArr[i]) {
                    cif.N(this);
                    d81VarArr[i] = null;
                } else {
                    sparseArray.put(this.w.b(cVarArr[i].a()), cif);
                }
            }
            if (d81VarArr[i] == null && cVarArr[i] != null) {
                int b = this.w.b(cVarArr[i].a());
                a aVar = this.x[b];
                if (aVar.c == 0) {
                    Cif<vo> r = r(aVar, cVarArr[i], j);
                    sparseArray.put(b, r);
                    d81VarArr[i] = r;
                    zArr2[i] = true;
                }
            }
        }
    }

    public void H(wo woVar, int i) {
        ky[] kyVarArr;
        this.F = woVar;
        this.G = i;
        this.z.t(woVar);
        Cif<vo>[] cifArr = this.C;
        if (cifArr != null) {
            for (Cif<vo> cif : cifArr) {
                cif.B().c(woVar, i);
            }
            this.B.n(this);
        }
        this.H = woVar.d(i).d;
        for (ky kyVar : this.D) {
            Iterator<sy> it = this.H.iterator();
            while (true) {
                if (it.hasNext()) {
                    sy next = it.next();
                    if (next.a().equals(kyVar.b())) {
                        kyVar.e(next, woVar.d);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long b() {
        return this.E.b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public boolean c(long j) {
        return this.E.c(j);
    }

    @Override // com.daaw.Cif.b
    public synchronized void d(Cif<vo> cif) {
        ex0.c remove = this.A.remove(cif);
        if (remove != null) {
            remove.m();
        }
    }

    @Override // com.daaw.qo0
    public long e(long j, ea1 ea1Var) {
        Cif<vo>[] cifArr;
        for (Cif<vo> cif : this.C) {
            if (cif.p == 2) {
                return cif.e(j, ea1Var);
            }
        }
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

    @Override // com.daaw.qo0
    public long i(com.google.android.exoplayer2.trackselection.c[] cVarArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        SparseArray<Cif<vo>> sparseArray = new SparseArray<>();
        ArrayList arrayList = new ArrayList();
        G(cVarArr, zArr, d81VarArr, zArr2, j, sparseArray);
        F(cVarArr, zArr, d81VarArr, zArr2, arrayList);
        E(cVarArr, zArr, d81VarArr, zArr2, j, sparseArray);
        this.C = A(sparseArray.size());
        int i = 0;
        while (true) {
            Cif<vo>[] cifArr = this.C;
            if (i >= cifArr.length) {
                ky[] kyVarArr = new ky[arrayList.size()];
                this.D = kyVarArr;
                arrayList.toArray(kyVarArr);
                this.E = this.y.a(this.C);
                return j;
            }
            cifArr[i] = sparseArray.valueAt(i);
            i++;
        }
    }

    @Override // com.daaw.qo0
    public void l() {
        this.u.a();
    }

    @Override // com.daaw.qo0
    public long m(long j) {
        for (Cif<vo> cif : this.C) {
            cif.O(j);
        }
        for (ky kyVar : this.D) {
            kyVar.c(j);
        }
        return j;
    }

    @Override // com.daaw.qo0
    public void p(qo0.a aVar, long j) {
        this.B = aVar;
        aVar.j(this);
    }

    @Override // com.daaw.qo0
    public long q() {
        if (this.I) {
            return -9223372036854775807L;
        }
        this.s.t();
        this.I = true;
        return -9223372036854775807L;
    }

    public final Cif<vo> r(a aVar, com.google.android.exoplayer2.trackselection.c cVar, long j) {
        int i;
        Format[] formatArr;
        int[] iArr = new int[2];
        Format[] formatArr2 = new Format[2];
        int i2 = aVar.f;
        boolean z = i2 != -1;
        if (z) {
            formatArr2[0] = this.w.a(i2).a(0);
            iArr[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = aVar.g;
        boolean z2 = i3 != -1;
        if (z2) {
            formatArr2[i] = this.w.a(i3).a(0);
            iArr[i] = 3;
            i++;
        }
        if (i < 2) {
            iArr = Arrays.copyOf(iArr, i);
            formatArr = (Format[]) Arrays.copyOf(formatArr2, i);
        } else {
            formatArr = formatArr2;
        }
        int[] iArr2 = iArr;
        ex0.c n = (this.F.d && z) ? this.z.n() : null;
        Cif<vo> cif = new Cif<>(aVar.b, iArr2, formatArr, this.q.a(this.u, this.F, this.G, aVar.a, cVar, aVar.b, this.t, z, z2, n), this, this.v, j, this.r, this.s);
        synchronized (this) {
            this.A.put(cif, n);
        }
        return cif;
    }

    @Override // com.daaw.qo0
    public TrackGroupArray s() {
        return this.w;
    }

    @Override // com.daaw.qo0
    public void t(long j, boolean z) {
        for (Cif<vo> cif : this.C) {
            cif.t(j, z);
        }
    }
}
