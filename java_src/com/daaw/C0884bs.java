package com.daaw;

import android.util.SparseArray;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.bs */
/* loaded from: classes.dex */
public final class C0884bs implements eo1.InterfaceC1207c {

    /* renamed from: a */
    public final int f5088a;

    /* renamed from: b */
    public final List<Format> f5089b;

    public C0884bs(int i) {
        this(i, Collections.emptyList());
    }

    public C0884bs(int i, List<Format> list) {
        this.f5088a = i;
        if (!m25863d(32) && list.isEmpty()) {
            list = Collections.singletonList(Format.m1744B(null, "application/cea-608", 0, null));
        }
        this.f5089b = list;
    }

    @Override // com.daaw.eo1.InterfaceC1207c
    /* renamed from: a */
    public eo1 mo23338a(int i, eo1.C1206b c1206b) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new mw0(new zq0(c1206b.f8615b));
            }
            if (i == 15) {
                if (m25863d(2)) {
                    return null;
                }
                return new mw0(new C3007t1(false, c1206b.f8615b));
            } else if (i == 17) {
                if (m25863d(2)) {
                    return null;
                }
                return new mw0(new ti0(c1206b.f8615b));
            } else if (i != 21) {
                if (i == 27) {
                    if (m25863d(4)) {
                        return null;
                    }
                    return new mw0(new n80(m25864c(c1206b), m25863d(1), m25863d(8)));
                } else if (i != 36) {
                    if (i != 89) {
                        if (i != 138) {
                            if (i != 129) {
                                if (i != 130) {
                                    if (i == 134) {
                                        if (m25863d(16)) {
                                            return null;
                                        }
                                        return new aa1(new se1());
                                    } else if (i != 135) {
                                        return null;
                                    }
                                }
                            }
                            return new mw0(new C3000t(c1206b.f8615b));
                        }
                        return new mw0(new C1009cv(c1206b.f8615b));
                    }
                    return new mw0(new C1871jv(c1206b.f8616c));
                } else {
                    return new mw0(new o80(m25864c(c1206b)));
                }
            } else {
                return new mw0(new se0());
            }
        }
        return new mw0(new m80());
    }

    @Override // com.daaw.eo1.InterfaceC1207c
    /* renamed from: b */
    public SparseArray<eo1> mo23337b() {
        return new SparseArray<>();
    }

    /* renamed from: c */
    public final cb1 m25864c(eo1.C1206b c1206b) {
        String str;
        int i;
        if (m25863d(32)) {
            return new cb1(this.f5089b);
        }
        rv0 rv0Var = new rv0(c1206b.f8617d);
        List<Format> list = this.f5089b;
        while (rv0Var.m10919a() > 0) {
            int m10896x = rv0Var.m10896x();
            int m10917c = rv0Var.m10917c() + rv0Var.m10896x();
            if (m10896x == 134) {
                list = new ArrayList<>();
                int m10896x2 = rv0Var.m10896x() & 31;
                for (int i2 = 0; i2 < m10896x2; i2++) {
                    String m10899u = rv0Var.m10899u(3);
                    int m10896x3 = rv0Var.m10896x();
                    if ((m10896x3 & 128) != 0) {
                        i = m10896x3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    list.add(Format.m1742D(null, str, null, -1, 0, m10899u, i, null));
                    rv0Var.m10920K(2);
                }
            }
            rv0Var.m10921J(m10917c);
        }
        return new cb1(list);
    }

    /* renamed from: d */
    public final boolean m25863d(int i) {
        return (i & this.f5088a) != 0;
    }
}
