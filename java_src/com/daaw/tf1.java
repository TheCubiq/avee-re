package com.daaw;

import com.daaw.ie1;
import java.util.Collections;
import java.util.Comparator;
/* loaded from: classes.dex */
public class tf1 {
    public static <T extends pf1> Comparator<lo1<tx0, T>> d(ie1.h hVar, int i) {
        Comparator<lo1<tx0, T>> comparator = null;
        if (hVar == null) {
            return null;
        }
        int i2 = hVar.a;
        if (i2 != 8) {
            i = i2;
        }
        if (i == 0) {
            comparator = new Comparator() { // from class: com.daaw.rf1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e;
                    e = tf1.e((lo1) obj, (lo1) obj2);
                    return e;
                }
            };
        } else if (i != 3) {
            switch (i) {
                case 9:
                    comparator = new Comparator() { // from class: com.daaw.sf1
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            int g;
                            g = tf1.g((lo1) obj, (lo1) obj2);
                            return g;
                        }
                    };
                    break;
            }
        } else {
            comparator = new Comparator() { // from class: com.daaw.qf1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = tf1.f((lo1) obj, (lo1) obj2);
                    return f;
                }
            };
        }
        return (comparator == null || !hVar.b) ? comparator : Collections.reverseOrder(comparator);
    }

    public static /* synthetic */ int e(lo1 lo1Var, lo1 lo1Var2) {
        return ((pf1) lo1Var.b).a.compareTo(((pf1) lo1Var2.b).a);
    }

    public static /* synthetic */ int f(lo1 lo1Var, lo1 lo1Var2) {
        return ((pf1) lo1Var.b).b.compareTo(((pf1) lo1Var2.b).b);
    }

    public static /* synthetic */ int g(lo1 lo1Var, lo1 lo1Var2) {
        return Long.compare(((pf1) lo1Var.b).c, ((pf1) lo1Var2.b).c);
    }
}
