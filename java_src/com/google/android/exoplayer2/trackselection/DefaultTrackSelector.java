package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.daaw.c41;
import com.daaw.m20;
import com.daaw.s6;
import com.daaw.sq1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.b;
import com.google.android.exoplayer2.trackselection.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class DefaultTrackSelector extends com.google.android.exoplayer2.trackselection.b {
    public static final int[] e = new int[0];
    public final c.a c;
    public final AtomicReference<Parameters> d = new AtomicReference<>(Parameters.H);

    /* loaded from: classes.dex */
    public static final class Parameters implements Parcelable {
        public final int A;
        public final boolean B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final int G;
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> p;
        public final SparseBooleanArray q;
        public final String r;
        public final String s;
        public final boolean t;
        public final int u;
        public final int v;
        public final int w;
        public final int x;
        public final boolean y;
        public final int z;
        public static final Parameters H = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new a();

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public Parameters[] newArray(int i) {
                return new Parameters[i];
            }
        }

        public Parameters() {
            this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
        }

        public Parameters(Parcel parcel) {
            this.p = l(parcel);
            this.q = parcel.readSparseBooleanArray();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = sq1.Q(parcel);
            this.u = parcel.readInt();
            this.C = sq1.Q(parcel);
            this.D = sq1.Q(parcel);
            this.E = sq1.Q(parcel);
            this.v = parcel.readInt();
            this.w = parcel.readInt();
            this.x = parcel.readInt();
            this.y = sq1.Q(parcel);
            this.F = sq1.Q(parcel);
            this.z = parcel.readInt();
            this.A = parcel.readInt();
            this.B = sq1.Q(parcel);
            this.G = parcel.readInt();
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
            this.p = sparseArray;
            this.q = sparseBooleanArray;
            this.r = sq1.M(str);
            this.s = sq1.M(str2);
            this.t = z;
            this.u = i;
            this.C = z2;
            this.D = z3;
            this.E = z4;
            this.v = i2;
            this.w = i3;
            this.x = i4;
            this.y = z5;
            this.F = z6;
            this.z = i5;
            this.A = i6;
            this.B = z7;
            this.G = i7;
        }

        public static boolean a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean b(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !c(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static boolean c(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = com.daaw.sq1.b(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.c(java.util.Map, java.util.Map):boolean");
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> l(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i2 = 0; i2 < readInt3; i2++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        public static void q(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Map<TrackGroupArray, SelectionOverride> valueAt = sparseArray.valueAt(i);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return this.t == parameters.t && this.u == parameters.u && this.C == parameters.C && this.D == parameters.D && this.E == parameters.E && this.v == parameters.v && this.w == parameters.w && this.y == parameters.y && this.F == parameters.F && this.B == parameters.B && this.z == parameters.z && this.A == parameters.A && this.x == parameters.x && this.G == parameters.G && TextUtils.equals(this.r, parameters.r) && TextUtils.equals(this.s, parameters.s) && a(this.q, parameters.q) && b(this.p, parameters.p);
        }

        public final boolean g(int i) {
            return this.q.get(i);
        }

        public final SelectionOverride h(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.p.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public int hashCode() {
            int i = (((((((((((((((((((((((((((this.t ? 1 : 0) * 31) + this.u) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + this.v) * 31) + this.w) * 31) + (this.y ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + this.z) * 31) + this.A) * 31) + this.x) * 31) + this.G) * 31;
            String str = this.r;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.s;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean i(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.p.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            q(parcel, this.p);
            parcel.writeSparseBooleanArray(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            sq1.c0(parcel, this.t);
            parcel.writeInt(this.u);
            sq1.c0(parcel, this.C);
            sq1.c0(parcel, this.D);
            sq1.c0(parcel, this.E);
            parcel.writeInt(this.v);
            parcel.writeInt(this.w);
            parcel.writeInt(this.x);
            sq1.c0(parcel, this.y);
            sq1.c0(parcel, this.F);
            parcel.writeInt(this.z);
            parcel.writeInt(this.A);
            sq1.c0(parcel, this.B);
            parcel.writeInt(this.G);
        }
    }

    /* loaded from: classes.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();
        public final int p;
        public final int[] q;
        public final int r;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SelectionOverride[] newArray(int i) {
                return new SelectionOverride[i];
            }
        }

        public SelectionOverride(int i, int... iArr) {
            this.p = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.q = copyOf;
            this.r = iArr.length;
            Arrays.sort(copyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.p = parcel.readInt();
            int readByte = parcel.readByte();
            this.r = readByte;
            int[] iArr = new int[readByte];
            this.q = iArr;
            parcel.readIntArray(iArr);
        }

        public boolean a(int i) {
            for (int i2 : this.q) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.p == selectionOverride.p && Arrays.equals(this.q, selectionOverride.q);
        }

        public int hashCode() {
            return (this.p * 31) + Arrays.hashCode(this.q);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.p);
            parcel.writeInt(this.q.length);
            parcel.writeIntArray(this.q);
        }
    }

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;
        public final String c;

        public a(int i, int i2, String str) {
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && TextUtils.equals(this.c, aVar.c);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {
        public final Parameters p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;
        public final int u;
        public final int v;

        public b(Format format, Parameters parameters, int i) {
            this.p = parameters;
            this.q = DefaultTrackSelector.v(i, false) ? 1 : 0;
            this.r = DefaultTrackSelector.m(format, parameters.r) ? 1 : 0;
            this.s = (format.M & 1) != 0 ? 1 : 0;
            this.t = format.G;
            this.u = format.H;
            this.v = format.q;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            int i = this.q;
            int i2 = bVar.q;
            if (i != i2) {
                return DefaultTrackSelector.k(i, i2);
            }
            int i3 = this.r;
            int i4 = bVar.r;
            if (i3 != i4) {
                return DefaultTrackSelector.k(i3, i4);
            }
            int i5 = this.s;
            int i6 = bVar.s;
            if (i5 != i6) {
                return DefaultTrackSelector.k(i5, i6);
            }
            if (this.p.C) {
                return DefaultTrackSelector.k(bVar.v, this.v);
            }
            int i7 = i != 1 ? -1 : 1;
            int i8 = this.t;
            int i9 = bVar.t;
            return i7 * ((i8 == i9 && (i8 = this.u) == (i9 = bVar.u)) ? DefaultTrackSelector.k(this.v, bVar.v) : DefaultTrackSelector.k(i8, i9));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.q == bVar.q && this.r == bVar.r && this.s == bVar.s && this.t == bVar.t && this.u == bVar.u && this.v == bVar.v;
        }

        public int hashCode() {
            return (((((((((this.q * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v;
        }
    }

    public DefaultTrackSelector(c.a aVar) {
        this.c = aVar;
    }

    public static c A(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        int i2 = parameters.E ? 24 : 16;
        boolean z = parameters.D && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.p; i3++) {
            TrackGroup a2 = trackGroupArray.a(i3);
            int[] r = r(a2, iArr[i3], z, i2, parameters.v, parameters.w, parameters.x, parameters.z, parameters.A, parameters.B);
            if (r.length > 0) {
                return ((c.a) s6.e(aVar)).a(a2, r);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (j(r2.q, r10) < 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.trackselection.c D(com.google.android.exoplayer2.source.TrackGroupArray r18, int[][] r19, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r20) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.D(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer2.trackselection.c");
    }

    public static int j(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    public static int k(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static void l(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!x(trackGroup.a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    public static boolean m(Format format, String str) {
        return str != null && TextUtils.equals(str, sq1.M(format.N));
    }

    public static boolean n(Format format) {
        return TextUtils.isEmpty(format.N) || m(format, "und");
    }

    public static int o(TrackGroup trackGroup, int[] iArr, a aVar) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.p; i2++) {
            if (w(trackGroup.a(i2), iArr[i2], aVar)) {
                i++;
            }
        }
        return i;
    }

    public static int[] p(TrackGroup trackGroup, int[] iArr, boolean z) {
        int o;
        HashSet hashSet = new HashSet();
        a aVar = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.p; i2++) {
            Format a2 = trackGroup.a(i2);
            a aVar2 = new a(a2.G, a2.H, z ? null : a2.u);
            if (hashSet.add(aVar2) && (o = o(trackGroup, iArr, aVar2)) > i) {
                i = o;
                aVar = aVar2;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int i3 = 0;
            for (int i4 = 0; i4 < trackGroup.p; i4++) {
                if (w(trackGroup.a(i4), iArr[i4], (a) s6.e(aVar))) {
                    iArr2[i3] = i4;
                    i3++;
                }
            }
            return iArr2;
        }
        return e;
    }

    public static int q(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (x(trackGroup.a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    public static int[] r(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        String str;
        int q;
        if (trackGroup.p < 2) {
            return e;
        }
        List<Integer> u = u(trackGroup, i5, i6, z2);
        if (u.size() < 2) {
            return e;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < u.size(); i8++) {
                String str3 = trackGroup.a(u.get(i8).intValue()).u;
                if (hashSet.add(str3) && (q = q(trackGroup, iArr, i, str3, i2, i3, i4, u)) > i7) {
                    i7 = q;
                    str2 = str3;
                }
            }
            str = str2;
        }
        l(trackGroup, iArr, i, str, i2, i3, i4, u);
        return u.size() < 2 ? e : sq1.Z(u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point s(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = com.daaw.sq1.f(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = com.daaw.sq1.f(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.s(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List<Integer> u(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(trackGroup.p);
        for (int i4 = 0; i4 < trackGroup.p; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < trackGroup.p; i6++) {
                Format a2 = trackGroup.a(i6);
                int i7 = a2.y;
                if (i7 > 0 && (i3 = a2.z) > 0) {
                    Point s = s(z, i, i2, i7, i3);
                    int i8 = a2.y;
                    int i9 = a2.z;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (s.x * 0.98f)) && i9 >= ((int) (s.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int K = trackGroup.a(((Integer) arrayList.get(size)).intValue()).K();
                    if (K == -1 || K > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean v(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean w(Format format, int i, a aVar) {
        if (v(i, false) && format.G == aVar.a && format.H == aVar.b) {
            String str = aVar.c;
            return str == null || TextUtils.equals(str, format.u);
        }
        return false;
    }

    public static boolean x(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!v(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || sq1.b(format.u, str)) {
            int i6 = format.y;
            if (i6 == -1 || i6 <= i3) {
                int i7 = format.z;
                if (i7 == -1 || i7 <= i4) {
                    int i8 = format.q;
                    return i8 == -1 || i8 <= i5;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static void y(b.a aVar, int[][][] iArr, c41[] c41VarArr, c[] cVarArr, int i) {
        boolean z;
        if (i == 0) {
            return;
        }
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.c(); i4++) {
            int d = aVar.d(i4);
            c cVar = cVarArr[i4];
            if ((d == 1 || d == 2) && cVar != null && z(iArr[i4], aVar.e(i4), cVar)) {
                if (d == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else if (i2 != -1) {
                    z = false;
                    break;
                } else {
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z && z2) {
            c41 c41Var = new c41(i);
            c41VarArr[i3] = c41Var;
            c41VarArr[i2] = c41Var;
        }
    }

    public static boolean z(int[][] iArr, TrackGroupArray trackGroupArray, c cVar) {
        if (cVar == null) {
            return false;
        }
        int b2 = trackGroupArray.b(cVar.a());
        for (int i = 0; i < cVar.length(); i++) {
            if ((iArr[b2][cVar.f(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    public c[] B(b.a aVar, int[][][] iArr, int[] iArr2, Parameters parameters) {
        int c = aVar.c();
        c[] cVarArr = new c[c];
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= c) {
                break;
            }
            if (2 == aVar.d(i)) {
                if (!z) {
                    cVarArr[i] = G(aVar.e(i), iArr[i], iArr2[i], parameters, this.c);
                    z = cVarArr[i] != null;
                }
                z2 |= aVar.e(i).p > 0;
            }
            i++;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < c; i2++) {
            int d = aVar.d(i2);
            if (d != 1) {
                if (d != 2) {
                    if (d != 3) {
                        cVarArr[i2] = E(d, aVar.e(i2), iArr[i2], parameters);
                    } else if (!z4) {
                        cVarArr[i2] = F(aVar.e(i2), iArr[i2], parameters);
                        z4 = cVarArr[i2] != null;
                    }
                }
            } else if (!z3) {
                cVarArr[i2] = C(aVar.e(i2), iArr[i2], iArr2[i2], parameters, z2 ? null : this.c);
                z3 = cVarArr[i2] != null;
            }
        }
        return cVarArr;
    }

    public c C(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        b bVar = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < trackGroupArray.p; i4++) {
            TrackGroup a2 = trackGroupArray.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.p; i5++) {
                if (v(iArr2[i5], parameters.F)) {
                    b bVar2 = new b(a2.a(i5), parameters, iArr2[i5]);
                    if (bVar == null || bVar2.compareTo(bVar) > 0) {
                        i2 = i4;
                        i3 = i5;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup a3 = trackGroupArray.a(i2);
        if (!parameters.C && aVar != null) {
            int[] p = p(a3, iArr[i2], parameters.D);
            if (p.length > 0) {
                return aVar.a(a3, p);
            }
        }
        return new m20(a3, i3);
    }

    public c E(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroupArray.p; i4++) {
            TrackGroup a2 = trackGroupArray.a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < a2.p; i5++) {
                if (v(iArr2[i5], parameters.F)) {
                    int i6 = (a2.a(i5).M & 1) != 0 ? 2 : 1;
                    if (v(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        trackGroup = a2;
                        i2 = i5;
                        i3 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new m20(trackGroup, i2);
    }

    public c F(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.p; i3++) {
            TrackGroup a2 = trackGroupArray.a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < a2.p; i4++) {
                if (v(iArr2[i4], parameters.F)) {
                    Format a3 = a2.a(i4);
                    int i5 = a3.M & (parameters.u ^ (-1));
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean m = m(a3, parameters.s);
                    if (m || (parameters.t && n(a3))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (m ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (m(a3, parameters.r)) {
                            i6 = 2;
                        }
                    }
                    if (v(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        trackGroup = a2;
                        i = i4;
                        i2 = i6;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new m20(trackGroup, i);
    }

    public c G(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, c.a aVar) {
        c A = (parameters.C || aVar == null) ? null : A(trackGroupArray, iArr, i, parameters, aVar);
        return A == null ? D(trackGroupArray, iArr, parameters) : A;
    }

    @Override // com.google.android.exoplayer2.trackselection.b
    public final Pair<c41[], c[]> h(b.a aVar, int[][][] iArr, int[] iArr2) {
        Parameters parameters = this.d.get();
        int c = aVar.c();
        c[] B = B(aVar, iArr, iArr2, parameters);
        for (int i = 0; i < c; i++) {
            if (parameters.g(i)) {
                B[i] = null;
            } else {
                TrackGroupArray e2 = aVar.e(i);
                if (parameters.i(i, e2)) {
                    SelectionOverride h = parameters.h(i, e2);
                    if (h == null) {
                        B[i] = null;
                    } else if (h.r == 1) {
                        B[i] = new m20(e2.a(h.p), h.q[0]);
                    } else {
                        B[i] = ((c.a) s6.e(this.c)).a(e2.a(h.p), h.q);
                    }
                }
            }
        }
        c41[] c41VarArr = new c41[c];
        for (int i2 = 0; i2 < c; i2++) {
            c41VarArr[i2] = !parameters.g(i2) && (aVar.d(i2) == 5 || B[i2] != null) ? c41.b : null;
        }
        y(aVar, iArr, c41VarArr, B, parameters.G);
        return Pair.create(c41VarArr, B);
    }

    public Parameters t() {
        return this.d.get();
    }
}
