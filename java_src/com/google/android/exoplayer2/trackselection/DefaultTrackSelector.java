package com.google.android.exoplayer2.trackselection;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.daaw.C2914s6;
import com.daaw.c41;
import com.daaw.m20;
import com.daaw.sq1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.AbstractC3968b;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class DefaultTrackSelector extends AbstractC3968b {

    /* renamed from: e */
    public static final int[] f35851e = new int[0];

    /* renamed from: c */
    public final InterfaceC3970c.InterfaceC3971a f35852c;

    /* renamed from: d */
    public final AtomicReference<Parameters> f35853d = new AtomicReference<>(Parameters.f35854H);

    /* loaded from: classes.dex */
    public static final class Parameters implements Parcelable {

        /* renamed from: A */
        public final int f35855A;

        /* renamed from: B */
        public final boolean f35856B;

        /* renamed from: C */
        public final boolean f35857C;

        /* renamed from: D */
        public final boolean f35858D;

        /* renamed from: E */
        public final boolean f35859E;

        /* renamed from: F */
        public final boolean f35860F;

        /* renamed from: G */
        public final int f35861G;

        /* renamed from: p */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f35862p;

        /* renamed from: q */
        public final SparseBooleanArray f35863q;

        /* renamed from: r */
        public final String f35864r;

        /* renamed from: s */
        public final String f35865s;

        /* renamed from: t */
        public final boolean f35866t;

        /* renamed from: u */
        public final int f35867u;

        /* renamed from: v */
        public final int f35868v;

        /* renamed from: w */
        public final int f35869w;

        /* renamed from: x */
        public final int f35870x;

        /* renamed from: y */
        public final boolean f35871y;

        /* renamed from: z */
        public final int f35872z;

        /* renamed from: H */
        public static final Parameters f35854H = new Parameters();
        public static final Parcelable.Creator<Parameters> CREATOR = new C3962a();

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters$a */
        /* loaded from: classes.dex */
        public static class C3962a implements Parcelable.Creator<Parameters> {
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
            this.f35862p = m1559l(parcel);
            this.f35863q = parcel.readSparseBooleanArray();
            this.f35864r = parcel.readString();
            this.f35865s = parcel.readString();
            this.f35866t = sq1.m10028Q(parcel);
            this.f35867u = parcel.readInt();
            this.f35857C = sq1.m10028Q(parcel);
            this.f35858D = sq1.m10028Q(parcel);
            this.f35859E = sq1.m10028Q(parcel);
            this.f35868v = parcel.readInt();
            this.f35869w = parcel.readInt();
            this.f35870x = parcel.readInt();
            this.f35871y = sq1.m10028Q(parcel);
            this.f35860F = sq1.m10028Q(parcel);
            this.f35872z = parcel.readInt();
            this.f35855A = parcel.readInt();
            this.f35856B = sq1.m10028Q(parcel);
            this.f35861G = parcel.readInt();
        }

        public Parameters(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
            this.f35862p = sparseArray;
            this.f35863q = sparseBooleanArray;
            this.f35864r = sq1.m10032M(str);
            this.f35865s = sq1.m10032M(str2);
            this.f35866t = z;
            this.f35867u = i;
            this.f35857C = z2;
            this.f35858D = z3;
            this.f35859E = z4;
            this.f35868v = i2;
            this.f35869w = i3;
            this.f35870x = i4;
            this.f35871y = z5;
            this.f35860F = z6;
            this.f35872z = i5;
            this.f35855A = i6;
            this.f35856B = z7;
            this.f35861G = i7;
        }

        /* renamed from: a */
        public static boolean m1565a(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
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

        /* renamed from: b */
        public static boolean m1564b(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !m1563c(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean m1563c(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !sq1.m10016b(entry.getValue(), map2.get(key))) {
                    return false;
                }
                while (r4.hasNext()) {
                }
            }
            return true;
        }

        /* renamed from: l */
        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> m1559l(Parcel parcel) {
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

        /* renamed from: q */
        public static void m1558q(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
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
            return this.f35866t == parameters.f35866t && this.f35867u == parameters.f35867u && this.f35857C == parameters.f35857C && this.f35858D == parameters.f35858D && this.f35859E == parameters.f35859E && this.f35868v == parameters.f35868v && this.f35869w == parameters.f35869w && this.f35871y == parameters.f35871y && this.f35860F == parameters.f35860F && this.f35856B == parameters.f35856B && this.f35872z == parameters.f35872z && this.f35855A == parameters.f35855A && this.f35870x == parameters.f35870x && this.f35861G == parameters.f35861G && TextUtils.equals(this.f35864r, parameters.f35864r) && TextUtils.equals(this.f35865s, parameters.f35865s) && m1565a(this.f35863q, parameters.f35863q) && m1564b(this.f35862p, parameters.f35862p);
        }

        /* renamed from: g */
        public final boolean m1562g(int i) {
            return this.f35863q.get(i);
        }

        /* renamed from: h */
        public final SelectionOverride m1561h(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.f35862p.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        public int hashCode() {
            int i = (((((((((((((((((((((((((((this.f35866t ? 1 : 0) * 31) + this.f35867u) * 31) + (this.f35857C ? 1 : 0)) * 31) + (this.f35858D ? 1 : 0)) * 31) + (this.f35859E ? 1 : 0)) * 31) + this.f35868v) * 31) + this.f35869w) * 31) + (this.f35871y ? 1 : 0)) * 31) + (this.f35860F ? 1 : 0)) * 31) + (this.f35856B ? 1 : 0)) * 31) + this.f35872z) * 31) + this.f35855A) * 31) + this.f35870x) * 31) + this.f35861G) * 31;
            String str = this.f35864r;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f35865s;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        /* renamed from: i */
        public final boolean m1560i(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.f35862p.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            m1558q(parcel, this.f35862p);
            parcel.writeSparseBooleanArray(this.f35863q);
            parcel.writeString(this.f35864r);
            parcel.writeString(this.f35865s);
            sq1.m10013c0(parcel, this.f35866t);
            parcel.writeInt(this.f35867u);
            sq1.m10013c0(parcel, this.f35857C);
            sq1.m10013c0(parcel, this.f35858D);
            sq1.m10013c0(parcel, this.f35859E);
            parcel.writeInt(this.f35868v);
            parcel.writeInt(this.f35869w);
            parcel.writeInt(this.f35870x);
            sq1.m10013c0(parcel, this.f35871y);
            sq1.m10013c0(parcel, this.f35860F);
            parcel.writeInt(this.f35872z);
            parcel.writeInt(this.f35855A);
            sq1.m10013c0(parcel, this.f35856B);
            parcel.writeInt(this.f35861G);
        }
    }

    /* loaded from: classes.dex */
    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new C3963a();

        /* renamed from: p */
        public final int f35873p;

        /* renamed from: q */
        public final int[] f35874q;

        /* renamed from: r */
        public final int f35875r;

        /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride$a */
        /* loaded from: classes.dex */
        public static class C3963a implements Parcelable.Creator<SelectionOverride> {
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
            this.f35873p = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f35874q = copyOf;
            this.f35875r = iArr.length;
            Arrays.sort(copyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.f35873p = parcel.readInt();
            int readByte = parcel.readByte();
            this.f35875r = readByte;
            int[] iArr = new int[readByte];
            this.f35874q = iArr;
            parcel.readIntArray(iArr);
        }

        /* renamed from: a */
        public boolean m1555a(int i) {
            for (int i2 : this.f35874q) {
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
            return this.f35873p == selectionOverride.f35873p && Arrays.equals(this.f35874q, selectionOverride.f35874q);
        }

        public int hashCode() {
            return (this.f35873p * 31) + Arrays.hashCode(this.f35874q);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f35873p);
            parcel.writeInt(this.f35874q.length);
            parcel.writeIntArray(this.f35874q);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a */
    /* loaded from: classes.dex */
    public static final class C3964a {

        /* renamed from: a */
        public final int f35876a;

        /* renamed from: b */
        public final int f35877b;

        /* renamed from: c */
        public final String f35878c;

        public C3964a(int i, int i2, String str) {
            this.f35876a = i;
            this.f35877b = i2;
            this.f35878c = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3964a.class != obj.getClass()) {
                return false;
            }
            C3964a c3964a = (C3964a) obj;
            return this.f35876a == c3964a.f35876a && this.f35877b == c3964a.f35877b && TextUtils.equals(this.f35878c, c3964a.f35878c);
        }

        public int hashCode() {
            int i = ((this.f35876a * 31) + this.f35877b) * 31;
            String str = this.f35878c;
            return i + (str != null ? str.hashCode() : 0);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b */
    /* loaded from: classes.dex */
    public static final class C3965b implements Comparable<C3965b> {

        /* renamed from: p */
        public final Parameters f35879p;

        /* renamed from: q */
        public final int f35880q;

        /* renamed from: r */
        public final int f35881r;

        /* renamed from: s */
        public final int f35882s;

        /* renamed from: t */
        public final int f35883t;

        /* renamed from: u */
        public final int f35884u;

        /* renamed from: v */
        public final int f35885v;

        public C3965b(Format format, Parameters parameters, int i) {
            this.f35879p = parameters;
            this.f35880q = DefaultTrackSelector.m1570v(i, false) ? 1 : 0;
            this.f35881r = DefaultTrackSelector.m1579m(format, parameters.f35864r) ? 1 : 0;
            this.f35882s = (format.f35712M & 1) != 0 ? 1 : 0;
            this.f35883t = format.f35706G;
            this.f35884u = format.f35707H;
            this.f35885v = format.f35717q;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C3965b c3965b) {
            int i = this.f35880q;
            int i2 = c3965b.f35880q;
            if (i != i2) {
                return DefaultTrackSelector.m1581k(i, i2);
            }
            int i3 = this.f35881r;
            int i4 = c3965b.f35881r;
            if (i3 != i4) {
                return DefaultTrackSelector.m1581k(i3, i4);
            }
            int i5 = this.f35882s;
            int i6 = c3965b.f35882s;
            if (i5 != i6) {
                return DefaultTrackSelector.m1581k(i5, i6);
            }
            if (this.f35879p.f35857C) {
                return DefaultTrackSelector.m1581k(c3965b.f35885v, this.f35885v);
            }
            int i7 = i != 1 ? -1 : 1;
            int i8 = this.f35883t;
            int i9 = c3965b.f35883t;
            return i7 * ((i8 == i9 && (i8 = this.f35884u) == (i9 = c3965b.f35884u)) ? DefaultTrackSelector.m1581k(this.f35885v, c3965b.f35885v) : DefaultTrackSelector.m1581k(i8, i9));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C3965b.class != obj.getClass()) {
                return false;
            }
            C3965b c3965b = (C3965b) obj;
            return this.f35880q == c3965b.f35880q && this.f35881r == c3965b.f35881r && this.f35882s == c3965b.f35882s && this.f35883t == c3965b.f35883t && this.f35884u == c3965b.f35884u && this.f35885v == c3965b.f35885v;
        }

        public int hashCode() {
            return (((((((((this.f35880q * 31) + this.f35881r) * 31) + this.f35882s) * 31) + this.f35883t) * 31) + this.f35884u) * 31) + this.f35885v;
        }
    }

    public DefaultTrackSelector(InterfaceC3970c.InterfaceC3971a interfaceC3971a) {
        this.f35852c = interfaceC3971a;
    }

    /* renamed from: A */
    public static InterfaceC3970c m1590A(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, InterfaceC3970c.InterfaceC3971a interfaceC3971a) {
        int i2 = parameters.f35859E ? 24 : 16;
        boolean z = parameters.f35858D && (i & i2) != 0;
        for (int i3 = 0; i3 < trackGroupArray.f35848p; i3++) {
            TrackGroup m1594a = trackGroupArray.m1594a(i3);
            int[] m1574r = m1574r(m1594a, iArr[i3], z, i2, parameters.f35868v, parameters.f35869w, parameters.f35870x, parameters.f35872z, parameters.f35855A, parameters.f35856B);
            if (m1574r.length > 0) {
                return ((InterfaceC3970c.InterfaceC3971a) C2914s6.m10686e(interfaceC3971a)).mo1518a(m1594a, m1574r);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        if (m1582j(r2.f35717q, r10) < 0) goto L42;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC3970c m1587D(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        int i;
        int i2;
        int i3;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        int i4 = -1;
        int i5 = 0;
        TrackGroup trackGroup = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = -1;
        int i9 = -1;
        while (i5 < trackGroupArray2.f35848p) {
            TrackGroup m1594a = trackGroupArray2.m1594a(i5);
            List<Integer> m1571u = m1571u(m1594a, parameters.f35872z, parameters.f35855A, parameters.f35856B);
            int[] iArr2 = iArr[i5];
            int i10 = 0;
            while (i10 < m1594a.f35844p) {
                if (m1570v(iArr2[i10], parameters.f35860F)) {
                    Format m1598a = m1594a.m1598a(i10);
                    boolean z = true;
                    boolean z2 = m1571u.contains(Integer.valueOf(i10)) && ((i = m1598a.f35725y) == i4 || i <= parameters.f35868v) && (((i2 = m1598a.f35726z) == i4 || i2 <= parameters.f35869w) && ((i3 = m1598a.f35717q) == i4 || i3 <= parameters.f35870x));
                    if (z2 || parameters.f35871y) {
                        int i11 = z2 ? 2 : 1;
                        boolean m1570v = m1570v(iArr2[i10], false);
                        if (m1570v) {
                            i11 += 1000;
                        }
                        boolean z3 = i11 > i7;
                        if (i11 == i7) {
                            if (!parameters.f35857C) {
                                int m1735K = m1598a.m1735K();
                                int m1582j = m1735K != i8 ? m1582j(m1735K, i8) : m1582j(m1598a.f35717q, i9);
                                if (m1570v) {
                                }
                                z = false;
                                z3 = z;
                            }
                        }
                        if (z3) {
                            i9 = m1598a.f35717q;
                            i8 = m1598a.m1735K();
                            trackGroup = m1594a;
                            i6 = i10;
                            i7 = i11;
                        }
                    }
                }
                i10++;
                i4 = -1;
            }
            i5++;
            trackGroupArray2 = trackGroupArray;
            i4 = -1;
        }
        if (trackGroup == null) {
            return null;
        }
        return new m20(trackGroup, i6);
    }

    /* renamed from: j */
    public static int m1582j(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    /* renamed from: k */
    public static int m1581k(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    /* renamed from: l */
    public static void m1580l(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!m1568x(trackGroup.m1598a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                list.remove(size);
            }
        }
    }

    /* renamed from: m */
    public static boolean m1579m(Format format, String str) {
        return str != null && TextUtils.equals(str, sq1.m10032M(format.f35713N));
    }

    /* renamed from: n */
    public static boolean m1578n(Format format) {
        return TextUtils.isEmpty(format.f35713N) || m1579m(format, "und");
    }

    /* renamed from: o */
    public static int m1577o(TrackGroup trackGroup, int[] iArr, C3964a c3964a) {
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.f35844p; i2++) {
            if (m1569w(trackGroup.m1598a(i2), iArr[i2], c3964a)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: p */
    public static int[] m1576p(TrackGroup trackGroup, int[] iArr, boolean z) {
        int m1577o;
        HashSet hashSet = new HashSet();
        C3964a c3964a = null;
        int i = 0;
        for (int i2 = 0; i2 < trackGroup.f35844p; i2++) {
            Format m1598a = trackGroup.m1598a(i2);
            C3964a c3964a2 = new C3964a(m1598a.f35706G, m1598a.f35707H, z ? null : m1598a.f35721u);
            if (hashSet.add(c3964a2) && (m1577o = m1577o(trackGroup, iArr, c3964a2)) > i) {
                i = m1577o;
                c3964a = c3964a2;
            }
        }
        if (i > 1) {
            int[] iArr2 = new int[i];
            int i3 = 0;
            for (int i4 = 0; i4 < trackGroup.f35844p; i4++) {
                if (m1569w(trackGroup.m1598a(i4), iArr[i4], (C3964a) C2914s6.m10686e(c3964a))) {
                    iArr2[i3] = i4;
                    i3++;
                }
            }
            return iArr2;
        }
        return f35851e;
    }

    /* renamed from: q */
    public static int m1575q(TrackGroup trackGroup, int[] iArr, int i, String str, int i2, int i3, int i4, List<Integer> list) {
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            int intValue = list.get(i6).intValue();
            if (m1568x(trackGroup.m1598a(intValue), str, iArr[intValue], i, i2, i3, i4)) {
                i5++;
            }
        }
        return i5;
    }

    /* renamed from: r */
    public static int[] m1574r(TrackGroup trackGroup, int[] iArr, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        String str;
        int m1575q;
        if (trackGroup.f35844p < 2) {
            return f35851e;
        }
        List<Integer> m1571u = m1571u(trackGroup, i5, i6, z2);
        if (m1571u.size() < 2) {
            return f35851e;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i7 = 0;
            for (int i8 = 0; i8 < m1571u.size(); i8++) {
                String str3 = trackGroup.m1598a(m1571u.get(i8).intValue()).f35721u;
                if (hashSet.add(str3) && (m1575q = m1575q(trackGroup, iArr, i, str3, i2, i3, i4, m1571u)) > i7) {
                    i7 = m1575q;
                    str2 = str3;
                }
            }
            str = str2;
        }
        m1580l(trackGroup, iArr, i, str, i2, i3, i4, m1571u);
        return m1571u.size() < 2 ? f35851e : sq1.m10019Z(m1571u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point m1573s(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
        }
        i2 = i;
        i = i2;
        int i5 = i3 * i;
        int i6 = i4 * i2;
        return i5 >= i6 ? new Point(i2, sq1.m10010f(i6, i3)) : new Point(sq1.m10010f(i5, i4), i);
    }

    /* renamed from: u */
    public static List<Integer> m1571u(TrackGroup trackGroup, int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = new ArrayList(trackGroup.f35844p);
        for (int i4 = 0; i4 < trackGroup.f35844p; i4++) {
            arrayList.add(Integer.valueOf(i4));
        }
        if (i != Integer.MAX_VALUE && i2 != Integer.MAX_VALUE) {
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < trackGroup.f35844p; i6++) {
                Format m1598a = trackGroup.m1598a(i6);
                int i7 = m1598a.f35725y;
                if (i7 > 0 && (i3 = m1598a.f35726z) > 0) {
                    Point m1573s = m1573s(z, i, i2, i7, i3);
                    int i8 = m1598a.f35725y;
                    int i9 = m1598a.f35726z;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (m1573s.x * 0.98f)) && i9 >= ((int) (m1573s.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
            if (i5 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int m1735K = trackGroup.m1598a(((Integer) arrayList.get(size)).intValue()).m1735K();
                    if (m1735K == -1 || m1735K > i5) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    public static boolean m1570v(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    /* renamed from: w */
    public static boolean m1569w(Format format, int i, C3964a c3964a) {
        if (m1570v(i, false) && format.f35706G == c3964a.f35876a && format.f35707H == c3964a.f35877b) {
            String str = c3964a.f35878c;
            return str == null || TextUtils.equals(str, format.f35721u);
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m1568x(Format format, String str, int i, int i2, int i3, int i4, int i5) {
        if (!m1570v(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str == null || sq1.m10016b(format.f35721u, str)) {
            int i6 = format.f35725y;
            if (i6 == -1 || i6 <= i3) {
                int i7 = format.f35726z;
                if (i7 == -1 || i7 <= i4) {
                    int i8 = format.f35717q;
                    return i8 == -1 || i8 <= i5;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: y */
    public static void m1567y(AbstractC3968b.C3969a c3969a, int[][][] iArr, c41[] c41VarArr, InterfaceC3970c[] interfaceC3970cArr, int i) {
        boolean z;
        if (i == 0) {
            return;
        }
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < c3969a.m1539c(); i4++) {
            int m1538d = c3969a.m1538d(i4);
            InterfaceC3970c interfaceC3970c = interfaceC3970cArr[i4];
            if ((m1538d == 1 || m1538d == 2) && interfaceC3970c != null && m1566z(iArr[i4], c3969a.m1537e(i4), interfaceC3970c)) {
                if (m1538d == 1) {
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

    /* renamed from: z */
    public static boolean m1566z(int[][] iArr, TrackGroupArray trackGroupArray, InterfaceC3970c interfaceC3970c) {
        if (interfaceC3970c == null) {
            return false;
        }
        int m1593b = trackGroupArray.m1593b(interfaceC3970c.mo1534a());
        for (int i = 0; i < interfaceC3970c.length(); i++) {
            if ((iArr[m1593b][interfaceC3970c.mo1529f(i)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public InterfaceC3970c[] m1589B(AbstractC3968b.C3969a c3969a, int[][][] iArr, int[] iArr2, Parameters parameters) {
        int m1539c = c3969a.m1539c();
        InterfaceC3970c[] interfaceC3970cArr = new InterfaceC3970c[m1539c];
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= m1539c) {
                break;
            }
            if (2 == c3969a.m1538d(i)) {
                if (!z) {
                    interfaceC3970cArr[i] = m1584G(c3969a.m1537e(i), iArr[i], iArr2[i], parameters, this.f35852c);
                    z = interfaceC3970cArr[i] != null;
                }
                z2 |= c3969a.m1537e(i).f35848p > 0;
            }
            i++;
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i2 = 0; i2 < m1539c; i2++) {
            int m1538d = c3969a.m1538d(i2);
            if (m1538d != 1) {
                if (m1538d != 2) {
                    if (m1538d != 3) {
                        interfaceC3970cArr[i2] = m1586E(m1538d, c3969a.m1537e(i2), iArr[i2], parameters);
                    } else if (!z4) {
                        interfaceC3970cArr[i2] = m1585F(c3969a.m1537e(i2), iArr[i2], parameters);
                        z4 = interfaceC3970cArr[i2] != null;
                    }
                }
            } else if (!z3) {
                interfaceC3970cArr[i2] = m1588C(c3969a.m1537e(i2), iArr[i2], iArr2[i2], parameters, z2 ? null : this.f35852c);
                z3 = interfaceC3970cArr[i2] != null;
            }
        }
        return interfaceC3970cArr;
    }

    /* renamed from: C */
    public InterfaceC3970c m1588C(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, InterfaceC3970c.InterfaceC3971a interfaceC3971a) {
        C3965b c3965b = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < trackGroupArray.f35848p; i4++) {
            TrackGroup m1594a = trackGroupArray.m1594a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < m1594a.f35844p; i5++) {
                if (m1570v(iArr2[i5], parameters.f35860F)) {
                    C3965b c3965b2 = new C3965b(m1594a.m1598a(i5), parameters, iArr2[i5]);
                    if (c3965b == null || c3965b2.compareTo(c3965b) > 0) {
                        i2 = i4;
                        i3 = i5;
                        c3965b = c3965b2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup m1594a2 = trackGroupArray.m1594a(i2);
        if (!parameters.f35857C && interfaceC3971a != null) {
            int[] m1576p = m1576p(m1594a2, iArr[i2], parameters.f35858D);
            if (m1576p.length > 0) {
                return interfaceC3971a.mo1518a(m1594a2, m1576p);
            }
        }
        return new m20(m1594a2, i3);
    }

    /* renamed from: E */
    public InterfaceC3970c m1586E(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < trackGroupArray.f35848p; i4++) {
            TrackGroup m1594a = trackGroupArray.m1594a(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < m1594a.f35844p; i5++) {
                if (m1570v(iArr2[i5], parameters.f35860F)) {
                    int i6 = (m1594a.m1598a(i5).f35712M & 1) != 0 ? 2 : 1;
                    if (m1570v(iArr2[i5], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i3) {
                        trackGroup = m1594a;
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

    /* renamed from: F */
    public InterfaceC3970c m1585F(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < trackGroupArray.f35848p; i3++) {
            TrackGroup m1594a = trackGroupArray.m1594a(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < m1594a.f35844p; i4++) {
                if (m1570v(iArr2[i4], parameters.f35860F)) {
                    Format m1598a = m1594a.m1598a(i4);
                    int i5 = m1598a.f35712M & (parameters.f35867u ^ (-1));
                    int i6 = 1;
                    boolean z = (i5 & 1) != 0;
                    boolean z2 = (i5 & 2) != 0;
                    boolean m1579m = m1579m(m1598a, parameters.f35865s);
                    if (m1579m || (parameters.f35866t && m1578n(m1598a))) {
                        i6 = (z ? 8 : !z2 ? 6 : 4) + (m1579m ? 1 : 0);
                    } else if (z) {
                        i6 = 3;
                    } else if (z2) {
                        if (m1579m(m1598a, parameters.f35864r)) {
                            i6 = 2;
                        }
                    }
                    if (m1570v(iArr2[i4], false)) {
                        i6 += 1000;
                    }
                    if (i6 > i2) {
                        trackGroup = m1594a;
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

    /* renamed from: G */
    public InterfaceC3970c m1584G(TrackGroupArray trackGroupArray, int[][] iArr, int i, Parameters parameters, InterfaceC3970c.InterfaceC3971a interfaceC3971a) {
        InterfaceC3970c m1590A = (parameters.f35857C || interfaceC3971a == null) ? null : m1590A(trackGroupArray, iArr, i, parameters, interfaceC3971a);
        return m1590A == null ? m1587D(trackGroupArray, iArr, parameters) : m1590A;
    }

    @Override // com.google.android.exoplayer2.trackselection.AbstractC3968b
    /* renamed from: h */
    public final Pair<c41[], InterfaceC3970c[]> mo1542h(AbstractC3968b.C3969a c3969a, int[][][] iArr, int[] iArr2) {
        Parameters parameters = this.f35853d.get();
        int m1539c = c3969a.m1539c();
        InterfaceC3970c[] m1589B = m1589B(c3969a, iArr, iArr2, parameters);
        for (int i = 0; i < m1539c; i++) {
            if (parameters.m1562g(i)) {
                m1589B[i] = null;
            } else {
                TrackGroupArray m1537e = c3969a.m1537e(i);
                if (parameters.m1560i(i, m1537e)) {
                    SelectionOverride m1561h = parameters.m1561h(i, m1537e);
                    if (m1561h == null) {
                        m1589B[i] = null;
                    } else if (m1561h.f35875r == 1) {
                        m1589B[i] = new m20(m1537e.m1594a(m1561h.f35873p), m1561h.f35874q[0]);
                    } else {
                        m1589B[i] = ((InterfaceC3970c.InterfaceC3971a) C2914s6.m10686e(this.f35852c)).mo1518a(m1537e.m1594a(m1561h.f35873p), m1561h.f35874q);
                    }
                }
            }
        }
        c41[] c41VarArr = new c41[m1539c];
        for (int i2 = 0; i2 < m1539c; i2++) {
            c41VarArr[i2] = !parameters.m1562g(i2) && (c3969a.m1538d(i2) == 5 || m1589B[i2] != null) ? c41.f5460b : null;
        }
        m1567y(c3969a, iArr, c41VarArr, m1589B, parameters.f35861G);
        return Pair.create(c41VarArr, m1589B);
    }

    /* renamed from: t */
    public Parameters m1572t() {
        return this.f35853d.get();
    }
}
