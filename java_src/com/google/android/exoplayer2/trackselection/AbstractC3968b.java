package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.daaw.b41;
import com.daaw.c41;
import com.daaw.sq1;
import com.daaw.wm1;
import com.daaw.xm1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;
/* renamed from: com.google.android.exoplayer2.trackselection.b */
/* loaded from: classes.dex */
public abstract class AbstractC3968b extends wm1 {

    /* renamed from: b */
    public C3969a f35906b;

    /* renamed from: com.google.android.exoplayer2.trackselection.b$a */
    /* loaded from: classes.dex */
    public static final class C3969a {
        @Deprecated

        /* renamed from: a */
        public final int f35907a;

        /* renamed from: b */
        public final int f35908b;

        /* renamed from: c */
        public final int[] f35909c;

        /* renamed from: d */
        public final TrackGroupArray[] f35910d;

        /* renamed from: e */
        public final int[] f35911e;

        /* renamed from: f */
        public final int[][][] f35912f;

        /* renamed from: g */
        public final TrackGroupArray f35913g;

        public C3969a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.f35909c = iArr;
            this.f35910d = trackGroupArrayArr;
            this.f35912f = iArr3;
            this.f35911e = iArr2;
            this.f35913g = trackGroupArray;
            int length = iArr.length;
            this.f35908b = length;
            this.f35907a = length;
        }

        /* renamed from: a */
        public int m1541a(int i, int i2, boolean z) {
            int i3 = this.f35910d[i].m1594a(i2).f35844p;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int m1536f = m1536f(i, i2, i5);
                if (m1536f == 4 || (z && m1536f == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return m1540b(i, i2, Arrays.copyOf(iArr, i4));
        }

        /* renamed from: b */
        public int m1540b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.f35910d[i].m1594a(i2).m1598a(iArr[i3]).f35721u;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !sq1.m10016b(str, str2);
                }
                i5 = Math.min(i5, this.f35912f[i][i2][i3] & 24);
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.f35911e[i]) : i5;
        }

        /* renamed from: c */
        public int m1539c() {
            return this.f35908b;
        }

        /* renamed from: d */
        public int m1538d(int i) {
            return this.f35909c[i];
        }

        /* renamed from: e */
        public TrackGroupArray m1537e(int i) {
            return this.f35910d[i];
        }

        /* renamed from: f */
        public int m1536f(int i, int i2, int i3) {
            return this.f35912f[i][i2][i3] & 7;
        }

        /* renamed from: g */
        public TrackGroupArray m1535g() {
            return this.f35913g;
        }
    }

    /* renamed from: d */
    public static int m1546d(b41[] b41VarArr, TrackGroup trackGroup) {
        int length = b41VarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < b41VarArr.length; i2++) {
            b41 b41Var = b41VarArr[i2];
            for (int i3 = 0; i3 < trackGroup.f35844p; i3++) {
                int mo3460a = b41Var.mo3460a(trackGroup.m1598a(i3)) & 7;
                if (mo3460a > i) {
                    if (mo3460a == 4) {
                        return i2;
                    }
                    length = i2;
                    i = mo3460a;
                }
            }
        }
        return length;
    }

    /* renamed from: f */
    public static int[] m1544f(b41 b41Var, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.f35844p];
        for (int i = 0; i < trackGroup.f35844p; i++) {
            iArr[i] = b41Var.mo3460a(trackGroup.m1598a(i));
        }
        return iArr;
    }

    /* renamed from: g */
    public static int[] m1543g(b41[] b41VarArr) {
        int length = b41VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = b41VarArr[i].mo5355p();
        }
        return iArr;
    }

    @Override // com.daaw.wm1
    /* renamed from: b */
    public final void mo1548b(Object obj) {
        this.f35906b = (C3969a) obj;
    }

    @Override // com.daaw.wm1
    /* renamed from: c */
    public final xm1 mo1547c(b41[] b41VarArr, TrackGroupArray trackGroupArray) {
        int[] iArr = new int[b41VarArr.length + 1];
        int length = b41VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length];
        int[][][] iArr2 = new int[b41VarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.f35848p;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr2[i] = new int[i2];
        }
        int[] m1543g = m1543g(b41VarArr);
        for (int i3 = 0; i3 < trackGroupArray.f35848p; i3++) {
            TrackGroup m1594a = trackGroupArray.m1594a(i3);
            int m1546d = m1546d(b41VarArr, m1594a);
            int[] m1544f = m1546d == b41VarArr.length ? new int[m1594a.f35844p] : m1544f(b41VarArr[m1546d], m1594a);
            int i4 = iArr[m1546d];
            trackGroupArr[m1546d][i4] = m1594a;
            iArr2[m1546d][i4] = m1544f;
            iArr[m1546d] = iArr[m1546d] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[b41VarArr.length];
        int[] iArr3 = new int[b41VarArr.length];
        for (int i5 = 0; i5 < b41VarArr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) sq1.m10031N(trackGroupArr[i5], i6));
            iArr2[i5] = (int[][]) sq1.m10031N(iArr2[i5], i6);
            iArr3[i5] = b41VarArr[i5].mo5361i();
        }
        C3969a c3969a = new C3969a(iArr3, trackGroupArrayArr, m1543g, iArr2, new TrackGroupArray((TrackGroup[]) sq1.m10031N(trackGroupArr[b41VarArr.length], iArr[b41VarArr.length])));
        Pair<c41[], InterfaceC3970c[]> mo1542h = mo1542h(c3969a, iArr2, m1543g);
        return new xm1((c41[]) mo1542h.first, (InterfaceC3970c[]) mo1542h.second, c3969a);
    }

    /* renamed from: e */
    public final C3969a m1545e() {
        return this.f35906b;
    }

    /* renamed from: h */
    public abstract Pair<c41[], InterfaceC3970c[]> mo1542h(C3969a c3969a, int[][][] iArr, int[] iArr2);
}
