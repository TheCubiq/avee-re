package com.daaw;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class st8 {
    public String a;
    public boolean b;
    public ka7 c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ u32 h;

    public /* synthetic */ st8(u32 u32Var, String str, ka7 ka7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ls8 ls8Var) {
        this.h = u32Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = map;
        this.g = new g6();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = ka7Var;
    }

    public /* synthetic */ st8(u32 u32Var, String str, ls8 ls8Var) {
        this.h = u32Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new g6();
        this.g = new g6();
    }

    public static /* bridge */ /* synthetic */ BitSet b(st8 st8Var) {
        return st8Var.d;
    }

    public final xo6 a(int i) {
        ArrayList arrayList;
        List list;
        wn6 E = xo6.E();
        E.s(i);
        E.u(this.b);
        ka7 ka7Var = this.c;
        if (ka7Var != null) {
            E.v(ka7Var);
        }
        h97 I = ka7.I();
        I.t(ec8.H(this.d));
        I.v(ec8.H(this.e));
        Map map = this.f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f.get(Integer.valueOf(intValue));
                if (l != null) {
                    aq6 F = er6.F();
                    F.t(intValue);
                    F.s(l.longValue());
                    arrayList2.add((er6) F.m());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            I.s(arrayList);
        }
        Map map2 = this.g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.g.keySet()) {
                nb7 G = qc7.G();
                G.t(num2.intValue());
                List list2 = (List) this.g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    G.s(list2);
                }
                arrayList3.add((qc7) G.m());
            }
            list = arrayList3;
        }
        I.u(list);
        E.t(I);
        return (xo6) E.m();
    }

    public final void c(qy8 qy8Var) {
        int a = qy8Var.a();
        Boolean bool = qy8Var.c;
        if (bool != null) {
            this.e.set(a, bool.booleanValue());
        }
        Boolean bool2 = qy8Var.d;
        if (bool2 != null) {
            this.d.set(a, bool2.booleanValue());
        }
        if (qy8Var.e != null) {
            Map map = this.f;
            Integer valueOf = Integer.valueOf(a);
            Long l = (Long) map.get(valueOf);
            long longValue = qy8Var.e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (qy8Var.f != null) {
            Map map2 = this.g;
            Integer valueOf2 = Integer.valueOf(a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.g.put(valueOf2, list);
            }
            if (qy8Var.c()) {
                list.clear();
            }
            wj8.b();
            qa2 z = this.h.a.z();
            String str = this.a;
            j65 j65Var = m75.Y;
            if (z.B(str, j65Var) && qy8Var.b()) {
                list.clear();
            }
            wj8.b();
            boolean B = this.h.a.z().B(this.a, j65Var);
            Long valueOf3 = Long.valueOf(qy8Var.f.longValue() / 1000);
            if (!B) {
                list.add(valueOf3);
            } else if (list.contains(valueOf3)) {
            } else {
                list.add(valueOf3);
            }
        }
    }
}
