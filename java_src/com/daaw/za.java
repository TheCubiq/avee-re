package com.daaw;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class za implements com.google.android.exoplayer2.trackselection.c {
    public final TrackGroup a;
    public final int b;
    public final int[] c;
    public final Format[] d;
    public final long[] e;
    public int f;

    /* loaded from: classes.dex */
    public static final class b implements Comparator<Format> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.q - format.q;
        }
    }

    public za(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        s6.f(iArr.length > 0);
        this.a = (TrackGroup) s6.e(trackGroup);
        int length = iArr.length;
        this.b = length;
        this.d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = trackGroup.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = trackGroup.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final TrackGroup a() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final boolean c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean q = q(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !q) {
            q = (i2 == i || q(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (q) {
            long[] jArr = this.e;
            jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format d(int i) {
        return this.d[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        za zaVar = (za) obj;
        return this.a == zaVar.a && Arrays.equals(this.c, zaVar.c);
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int f(int i) {
        return this.c[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void g() {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int h(long j, List<? extends zn0> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.f;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int i(Format format) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int j() {
        return this.c[b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format k() {
        return this.d[b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int length() {
        return this.c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void m(float f) {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }
}
