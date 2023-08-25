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
/* loaded from: classes.dex */
public abstract class b extends wm1 {
    public a b;

    /* loaded from: classes.dex */
    public static final class a {
        @Deprecated
        public final int a;
        public final int b;
        public final int[] c;
        public final TrackGroupArray[] d;
        public final int[] e;
        public final int[][][] f;
        public final TrackGroupArray g;

        public a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.c = iArr;
            this.d = trackGroupArrayArr;
            this.f = iArr3;
            this.e = iArr2;
            this.g = trackGroupArray;
            int length = iArr.length;
            this.b = length;
            this.a = length;
        }

        public int a(int i, int i2, boolean z) {
            int i3 = this.d[i].a(i2).p;
            int[] iArr = new int[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                int f = f(i, i2, i5);
                if (f == 4 || (z && f == 3)) {
                    iArr[i4] = i5;
                    i4++;
                }
            }
            return b(i, i2, Arrays.copyOf(iArr, i4));
        }

        public int b(int i, int i2, int[] iArr) {
            int i3 = 0;
            String str = null;
            boolean z = false;
            int i4 = 0;
            int i5 = 16;
            while (i3 < iArr.length) {
                String str2 = this.d[i].a(i2).a(iArr[i3]).u;
                int i6 = i4 + 1;
                if (i4 == 0) {
                    str = str2;
                } else {
                    z |= !sq1.b(str, str2);
                }
                i5 = Math.min(i5, this.f[i][i2][i3] & 24);
                i3++;
                i4 = i6;
            }
            return z ? Math.min(i5, this.e[i]) : i5;
        }

        public int c() {
            return this.b;
        }

        public int d(int i) {
            return this.c[i];
        }

        public TrackGroupArray e(int i) {
            return this.d[i];
        }

        public int f(int i, int i2, int i3) {
            return this.f[i][i2][i3] & 7;
        }

        public TrackGroupArray g() {
            return this.g;
        }
    }

    public static int d(b41[] b41VarArr, TrackGroup trackGroup) {
        int length = b41VarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < b41VarArr.length; i2++) {
            b41 b41Var = b41VarArr[i2];
            for (int i3 = 0; i3 < trackGroup.p; i3++) {
                int a2 = b41Var.a(trackGroup.a(i3)) & 7;
                if (a2 > i) {
                    if (a2 == 4) {
                        return i2;
                    }
                    length = i2;
                    i = a2;
                }
            }
        }
        return length;
    }

    public static int[] f(b41 b41Var, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.p];
        for (int i = 0; i < trackGroup.p; i++) {
            iArr[i] = b41Var.a(trackGroup.a(i));
        }
        return iArr;
    }

    public static int[] g(b41[] b41VarArr) {
        int length = b41VarArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = b41VarArr[i].p();
        }
        return iArr;
    }

    @Override // com.daaw.wm1
    public final void b(Object obj) {
        this.b = (a) obj;
    }

    @Override // com.daaw.wm1
    public final xm1 c(b41[] b41VarArr, TrackGroupArray trackGroupArray) {
        int[] iArr = new int[b41VarArr.length + 1];
        int length = b41VarArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length];
        int[][][] iArr2 = new int[b41VarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroupArray.p;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr2[i] = new int[i2];
        }
        int[] g = g(b41VarArr);
        for (int i3 = 0; i3 < trackGroupArray.p; i3++) {
            TrackGroup a2 = trackGroupArray.a(i3);
            int d = d(b41VarArr, a2);
            int[] f = d == b41VarArr.length ? new int[a2.p] : f(b41VarArr[d], a2);
            int i4 = iArr[d];
            trackGroupArr[d][i4] = a2;
            iArr2[d][i4] = f;
            iArr[d] = iArr[d] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[b41VarArr.length];
        int[] iArr3 = new int[b41VarArr.length];
        for (int i5 = 0; i5 < b41VarArr.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) sq1.N(trackGroupArr[i5], i6));
            iArr2[i5] = (int[][]) sq1.N(iArr2[i5], i6);
            iArr3[i5] = b41VarArr[i5].i();
        }
        a aVar = new a(iArr3, trackGroupArrayArr, g, iArr2, new TrackGroupArray((TrackGroup[]) sq1.N(trackGroupArr[b41VarArr.length], iArr[b41VarArr.length])));
        Pair<c41[], c[]> h = h(aVar, iArr2, g);
        return new xm1((c41[]) h.first, (c[]) h.second, aVar);
    }

    public final a e() {
        return this.b;
    }

    public abstract Pair<c41[], c[]> h(a aVar, int[][][] iArr, int[] iArr2);
}
