package com.daaw;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class st8 {

    /* renamed from: a */
    public String f26640a;

    /* renamed from: b */
    public boolean f26641b;

    /* renamed from: c */
    public ka7 f26642c;

    /* renamed from: d */
    public BitSet f26643d;

    /* renamed from: e */
    public BitSet f26644e;

    /* renamed from: f */
    public Map f26645f;

    /* renamed from: g */
    public Map f26646g;

    /* renamed from: h */
    public final /* synthetic */ u32 f26647h;

    public /* synthetic */ st8(u32 u32Var, String str, ka7 ka7Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ls8 ls8Var) {
        this.f26647h = u32Var;
        this.f26640a = str;
        this.f26643d = bitSet;
        this.f26644e = bitSet2;
        this.f26645f = map;
        this.f26646g = new C1370g6();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f26646g.put(num, arrayList);
        }
        this.f26641b = false;
        this.f26642c = ka7Var;
    }

    public /* synthetic */ st8(u32 u32Var, String str, ls8 ls8Var) {
        this.f26647h = u32Var;
        this.f26640a = str;
        this.f26641b = true;
        this.f26643d = new BitSet();
        this.f26644e = new BitSet();
        this.f26645f = new C1370g6();
        this.f26646g = new C1370g6();
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ BitSet m9881b(st8 st8Var) {
        return st8Var.f26643d;
    }

    /* renamed from: a */
    public final xo6 m9882a(int i) {
        ArrayList arrayList;
        List list;
        wn6 m4873E = xo6.m4873E();
        m4873E.m5932s(i);
        m4873E.m5930u(this.f26641b);
        ka7 ka7Var = this.f26642c;
        if (ka7Var != null) {
            m4873E.m5929v(ka7Var);
        }
        h97 m17871I = ka7.m17871I();
        m17871I.m20919t(ec8.m23596H(this.f26643d));
        m17871I.m20917v(ec8.m23596H(this.f26644e));
        Map map = this.f26645f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f26645f.keySet()) {
                int intValue = num.intValue();
                Long l = (Long) this.f26645f.get(Integer.valueOf(intValue));
                if (l != null) {
                    aq6 m23240F = er6.m23240F();
                    m23240F.m27165t(intValue);
                    m23240F.m27166s(l.longValue());
                    arrayList2.add((er6) m23240F.m3975m());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m17871I.m20920s(arrayList);
        }
        Map map2 = this.f26646g;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f26646g.keySet()) {
                nb7 m12619G = qc7.m12619G();
                m12619G.m15303t(num2.intValue());
                List list2 = (List) this.f26646g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    m12619G.m15304s(list2);
                }
                arrayList3.add((qc7) m12619G.m3975m());
            }
            list = arrayList3;
        }
        m17871I.m20918u(list);
        m4873E.m5931t(m17871I);
        return (xo6) m4873E.m3975m();
    }

    /* renamed from: c */
    public final void m9880c(qy8 qy8Var) {
        int mo4372a = qy8Var.mo4372a();
        Boolean bool = qy8Var.f24650c;
        if (bool != null) {
            this.f26644e.set(mo4372a, bool.booleanValue());
        }
        Boolean bool2 = qy8Var.f24651d;
        if (bool2 != null) {
            this.f26643d.set(mo4372a, bool2.booleanValue());
        }
        if (qy8Var.f24652e != null) {
            Map map = this.f26645f;
            Integer valueOf = Integer.valueOf(mo4372a);
            Long l = (Long) map.get(valueOf);
            long longValue = qy8Var.f24652e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f26645f.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (qy8Var.f24653f != null) {
            Map map2 = this.f26646g;
            Integer valueOf2 = Integer.valueOf(mo4372a);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.f26646g.put(valueOf2, list);
            }
            if (qy8Var.mo4370c()) {
                list.clear();
            }
            wj8.m6042b();
            qa2 m24020z = this.f26647h.f25143a.m24020z();
            String str = this.f26640a;
            j65 j65Var = m75.f18517Y;
            if (m24020z.m12677B(str, j65Var) && qy8Var.mo4371b()) {
                list.clear();
            }
            wj8.m6042b();
            boolean m12677B = this.f26647h.f25143a.m24020z().m12677B(this.f26640a, j65Var);
            Long valueOf3 = Long.valueOf(qy8Var.f24653f.longValue() / 1000);
            if (!m12677B) {
                list.add(valueOf3);
            } else if (list.contains(valueOf3)) {
            } else {
                list.add(valueOf3);
            }
        }
    }
}
