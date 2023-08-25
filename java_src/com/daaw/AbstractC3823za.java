package com.daaw;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* renamed from: com.daaw.za */
/* loaded from: classes.dex */
public abstract class AbstractC3823za implements InterfaceC3970c {

    /* renamed from: a */
    public final TrackGroup f34634a;

    /* renamed from: b */
    public final int f34635b;

    /* renamed from: c */
    public final int[] f34636c;

    /* renamed from: d */
    public final Format[] f34637d;

    /* renamed from: e */
    public final long[] f34638e;

    /* renamed from: f */
    public int f34639f;

    /* renamed from: com.daaw.za$b */
    /* loaded from: classes.dex */
    public static final class C3825b implements Comparator<Format> {
        public C3825b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Format format, Format format2) {
            return format2.f35717q - format.f35717q;
        }
    }

    public AbstractC3823za(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        C2914s6.m10685f(iArr.length > 0);
        this.f34634a = (TrackGroup) C2914s6.m10686e(trackGroup);
        int length = iArr.length;
        this.f34635b = length;
        this.f34637d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f34637d[i2] = trackGroup.m1598a(iArr[i2]);
        }
        Arrays.sort(this.f34637d, new C3825b());
        this.f34636c = new int[this.f34635b];
        while (true) {
            int i3 = this.f34635b;
            if (i >= i3) {
                this.f34638e = new long[i3];
                return;
            } else {
                this.f34636c[i] = trackGroup.m1597b(this.f34637d[i]);
                i++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: a */
    public final TrackGroup mo1534a() {
        return this.f34634a;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: c */
    public final boolean mo1532c(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean m2581q = m2581q(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f34635b && !m2581q) {
            m2581q = (i2 == i || m2581q(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (m2581q) {
            long[] jArr = this.f34638e;
            jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: d */
    public final Format mo1531d(int i) {
        return this.f34637d[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: e */
    public void mo1530e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3823za abstractC3823za = (AbstractC3823za) obj;
        return this.f34634a == abstractC3823za.f34634a && Arrays.equals(this.f34636c, abstractC3823za.f34636c);
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: f */
    public final int mo1529f(int i) {
        return this.f34636c[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: g */
    public void mo1528g() {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: h */
    public int mo1527h(long j, List<? extends zn0> list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f34639f == 0) {
            this.f34639f = (System.identityHashCode(this.f34634a) * 31) + Arrays.hashCode(this.f34636c);
        }
        return this.f34639f;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: i */
    public final int mo1526i(Format format) {
        for (int i = 0; i < this.f34635b; i++) {
            if (this.f34637d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: j */
    public final int mo1525j() {
        return this.f34636c[mo1533b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: k */
    public final Format mo1524k() {
        return this.f34637d[mo1533b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    public final int length() {
        return this.f34636c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: m */
    public void mo1522m(float f) {
    }

    @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
    /* renamed from: p */
    public final int mo1519p(int i) {
        for (int i2 = 0; i2 < this.f34635b; i2++) {
            if (this.f34636c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final boolean m2581q(int i, long j) {
        return this.f34638e[i] > j;
    }
}
