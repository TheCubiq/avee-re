package com.daaw;

import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class lb0 extends nb0 {

    /* renamed from: c */
    public final int f17185c;

    /* renamed from: d */
    public final long f17186d;

    /* renamed from: e */
    public final long f17187e;

    /* renamed from: f */
    public final boolean f17188f;

    /* renamed from: g */
    public final int f17189g;

    /* renamed from: h */
    public final long f17190h;

    /* renamed from: i */
    public final int f17191i;

    /* renamed from: j */
    public final long f17192j;

    /* renamed from: k */
    public final boolean f17193k;

    /* renamed from: l */
    public final boolean f17194l;

    /* renamed from: m */
    public final boolean f17195m;

    /* renamed from: n */
    public final DrmInitData f17196n;

    /* renamed from: o */
    public final List<C2025a> f17197o;

    /* renamed from: p */
    public final long f17198p;

    /* renamed from: com.daaw.lb0$a */
    /* loaded from: classes.dex */
    public static final class C2025a implements Comparable<Long> {

        /* renamed from: p */
        public final String f17199p;

        /* renamed from: q */
        public final C2025a f17200q;

        /* renamed from: r */
        public final long f17201r;

        /* renamed from: s */
        public final int f17202s;

        /* renamed from: t */
        public final long f17203t;

        /* renamed from: u */
        public final String f17204u;

        /* renamed from: v */
        public final String f17205v;

        /* renamed from: w */
        public final long f17206w;

        /* renamed from: x */
        public final long f17207x;

        /* renamed from: y */
        public final boolean f17208y;

        public C2025a(String str, long j, long j2) {
            this(str, null, 0L, -1, -9223372036854775807L, null, null, j, j2, false);
        }

        public C2025a(String str, C2025a c2025a, long j, int i, long j2, String str2, String str3, long j3, long j4, boolean z) {
            this.f17199p = str;
            this.f17200q = c2025a;
            this.f17201r = j;
            this.f17202s = i;
            this.f17203t = j2;
            this.f17204u = str2;
            this.f17205v = str3;
            this.f17206w = j3;
            this.f17207x = j4;
            this.f17208y = z;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f17203t > l.longValue()) {
                return 1;
            }
            return this.f17203t < l.longValue() ? -1 : 0;
        }
    }

    public lb0(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, boolean z2, boolean z3, boolean z4, DrmInitData drmInitData, List<C2025a> list2) {
        super(str, list);
        this.f17185c = i;
        this.f17187e = j2;
        this.f17188f = z;
        this.f17189g = i2;
        this.f17190h = j3;
        this.f17191i = i3;
        this.f17192j = j4;
        this.f17193k = z2;
        this.f17194l = z3;
        this.f17195m = z4;
        this.f17196n = drmInitData;
        this.f17197o = Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f17198p = 0L;
        } else {
            C2025a c2025a = list2.get(list2.size() - 1);
            this.f17198p = c2025a.f17203t + c2025a.f17201r;
        }
        this.f17186d = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.f17198p + j;
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public lb0 mo5189a(List<f41> list) {
        return this;
    }

    /* renamed from: c */
    public lb0 m17070c(long j, int i) {
        return new lb0(this.f17185c, this.f19774a, this.f19775b, this.f17186d, j, true, i, this.f17190h, this.f17191i, this.f17192j, this.f17193k, this.f17194l, this.f17195m, this.f17196n, this.f17197o);
    }

    /* renamed from: d */
    public lb0 m17069d() {
        return this.f17194l ? this : new lb0(this.f17185c, this.f19774a, this.f19775b, this.f17186d, this.f17187e, this.f17188f, this.f17189g, this.f17190h, this.f17191i, this.f17192j, this.f17193k, true, this.f17195m, this.f17196n, this.f17197o);
    }

    /* renamed from: e */
    public long m17068e() {
        return this.f17187e + this.f17198p;
    }

    /* renamed from: f */
    public boolean m17067f(lb0 lb0Var) {
        if (lb0Var != null) {
            long j = this.f17190h;
            long j2 = lb0Var.f17190h;
            if (j > j2) {
                return true;
            }
            if (j < j2) {
                return false;
            }
            int size = this.f17197o.size();
            int size2 = lb0Var.f17197o.size();
            if (size <= size2) {
                return size == size2 && this.f17194l && !lb0Var.f17194l;
            }
            return true;
        }
        return true;
    }
}
