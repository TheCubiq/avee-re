package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class w52 extends y52 {

    /* renamed from: b */
    public long f30895b;

    /* renamed from: c */
    public long[] f30896c;

    /* renamed from: d */
    public long[] f30897d;

    public w52() {
        super(new i09());
        this.f30895b = -9223372036854775807L;
        this.f30896c = new long[0];
        this.f30897d = new long[0];
    }

    /* renamed from: g */
    public static Double m6522g(ik5 ik5Var) {
        return Double.valueOf(Double.longBitsToDouble(ik5Var.m19696z()));
    }

    /* renamed from: h */
    public static Object m6521h(ik5 ik5Var, int i) {
        if (i == 0) {
            return m6522g(ik5Var);
        }
        if (i == 1) {
            return Boolean.valueOf(ik5Var.m19703s() == 1);
        } else if (i == 2) {
            return m6520i(ik5Var);
        } else {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) m6522g(ik5Var).doubleValue());
                        ik5Var.m19715g(2);
                        return date;
                    }
                    int m19700v = ik5Var.m19700v();
                    ArrayList arrayList = new ArrayList(m19700v);
                    for (int i2 = 0; i2 < m19700v; i2++) {
                        Object m6521h = m6521h(ik5Var, ik5Var.m19703s());
                        if (m6521h != null) {
                            arrayList.add(m6521h);
                        }
                    }
                    return arrayList;
                }
                return m6519j(ik5Var);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String m6520i = m6520i(ik5Var);
                int m19703s = ik5Var.m19703s();
                if (m19703s == 9) {
                    return hashMap;
                }
                Object m6521h2 = m6521h(ik5Var, m19703s);
                if (m6521h2 != null) {
                    hashMap.put(m6520i, m6521h2);
                }
            }
        }
    }

    /* renamed from: i */
    public static String m6520i(ik5 ik5Var) {
        int m19699w = ik5Var.m19699w();
        int m19711k = ik5Var.m19711k();
        ik5Var.m19715g(m19699w);
        return new String(ik5Var.m19714h(), m19711k, m19699w);
    }

    /* renamed from: j */
    public static HashMap m6519j(ik5 ik5Var) {
        int m19700v = ik5Var.m19700v();
        HashMap hashMap = new HashMap(m19700v);
        for (int i = 0; i < m19700v; i++) {
            String m6520i = m6520i(ik5Var);
            Object m6521h = m6521h(ik5Var, ik5Var.m19703s());
            if (m6521h != null) {
                hashMap.put(m6520i, m6521h);
            }
        }
        return hashMap;
    }

    @Override // com.daaw.y52
    /* renamed from: a */
    public final boolean mo2810a(ik5 ik5Var) {
        return true;
    }

    @Override // com.daaw.y52
    /* renamed from: b */
    public final boolean mo2809b(ik5 ik5Var, long j) {
        if (ik5Var.m19703s() == 2 && "onMetaData".equals(m6520i(ik5Var)) && ik5Var.m19713i() != 0 && ik5Var.m19703s() == 8) {
            HashMap m6519j = m6519j(ik5Var);
            Object obj = m6519j.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f30895b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = m6519j.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f30896c = new long[size];
                    this.f30897d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f30896c = new long[0];
                            this.f30897d = new long[0];
                            break;
                        }
                        this.f30896c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f30897d[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: d */
    public final long m6525d() {
        return this.f30895b;
    }

    /* renamed from: e */
    public final long[] m6524e() {
        return this.f30897d;
    }

    /* renamed from: f */
    public final long[] m6523f() {
        return this.f30896c;
    }
}
