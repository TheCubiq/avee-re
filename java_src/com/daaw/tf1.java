package com.daaw;

import com.daaw.ie1;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class tf1 {
    /* renamed from: d */
    public static <T extends pf1> Comparator<lo1<tx0, T>> m9203d(ie1.C1695h c1695h, int i) {
        Comparator<lo1<tx0, T>> comparator = null;
        if (c1695h == null) {
            return null;
        }
        int i2 = c1695h.f13560a;
        if (i2 != 8) {
            i = i2;
        }
        if (i == 0) {
            comparator = new Comparator() { // from class: com.daaw.rf1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m9202e;
                    m9202e = tf1.m9202e((lo1) obj, (lo1) obj2);
                    return m9202e;
                }
            };
        } else if (i != 3) {
            switch (i) {
                case 9:
                    comparator = new Comparator() { // from class: com.daaw.sf1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int m9200g;
                            m9200g = tf1.m9200g((lo1) obj, (lo1) obj2);
                            return m9200g;
                        }
                    };
                    break;
            }
        } else {
            comparator = new Comparator() { // from class: com.daaw.qf1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m9201f;
                    m9201f = tf1.m9201f((lo1) obj, (lo1) obj2);
                    return m9201f;
                }
            };
        }
        return (comparator == null || !c1695h.f13561b) ? comparator : Collections.reverseOrder(comparator);
    }

    /* renamed from: e */
    public static /* synthetic */ int m9202e(lo1 lo1Var, lo1 lo1Var2) {
        return ((pf1) lo1Var.f17577b).f22889a.compareTo(((pf1) lo1Var2.f17577b).f22889a);
    }

    /* renamed from: f */
    public static /* synthetic */ int m9201f(lo1 lo1Var, lo1 lo1Var2) {
        return ((pf1) lo1Var.f17577b).f22890b.compareTo(((pf1) lo1Var2.f17577b).f22890b);
    }

    /* renamed from: g */
    public static /* synthetic */ int m9200g(lo1 lo1Var, lo1 lo1Var2) {
        return Long.compare(((pf1) lo1Var.f17577b).f22891c, ((pf1) lo1Var2.f17577b).f22891c);
    }
}
