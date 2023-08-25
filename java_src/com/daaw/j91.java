package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class j91 extends nj1 {

    /* renamed from: b */
    public long f14538b;

    public j91() {
        super(null);
        this.f14538b = -9223372036854775807L;
    }

    /* renamed from: e */
    public static Boolean m18723e(rv0 rv0Var) {
        return Boolean.valueOf(rv0Var.m10896x() == 1);
    }

    /* renamed from: f */
    public static Object m18722f(rv0 rv0Var, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                return m18721g(rv0Var);
                            }
                            return m18717k(rv0Var);
                        }
                        return m18719i(rv0Var);
                    }
                    return m18718j(rv0Var);
                }
                return m18716l(rv0Var);
            }
            return m18723e(rv0Var);
        }
        return m18720h(rv0Var);
    }

    /* renamed from: g */
    public static Date m18721g(rv0 rv0Var) {
        Date date = new Date((long) m18720h(rv0Var).doubleValue());
        rv0Var.m10920K(2);
        return date;
    }

    /* renamed from: h */
    public static Double m18720h(rv0 rv0Var) {
        return Double.valueOf(Double.longBitsToDouble(rv0Var.m10903q()));
    }

    /* renamed from: i */
    public static HashMap<String, Object> m18719i(rv0 rv0Var) {
        int m10929B = rv0Var.m10929B();
        HashMap<String, Object> hashMap = new HashMap<>(m10929B);
        for (int i = 0; i < m10929B; i++) {
            hashMap.put(m18716l(rv0Var), m18722f(rv0Var, m18715m(rv0Var)));
        }
        return hashMap;
    }

    /* renamed from: j */
    public static HashMap<String, Object> m18718j(rv0 rv0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String m18716l = m18716l(rv0Var);
            int m18715m = m18715m(rv0Var);
            if (m18715m == 9) {
                return hashMap;
            }
            hashMap.put(m18716l, m18722f(rv0Var, m18715m));
        }
    }

    /* renamed from: k */
    public static ArrayList<Object> m18717k(rv0 rv0Var) {
        int m10929B = rv0Var.m10929B();
        ArrayList<Object> arrayList = new ArrayList<>(m10929B);
        for (int i = 0; i < m10929B; i++) {
            arrayList.add(m18722f(rv0Var, m18715m(rv0Var)));
        }
        return arrayList;
    }

    /* renamed from: l */
    public static String m18716l(rv0 rv0Var) {
        int m10927D = rv0Var.m10927D();
        int m10917c = rv0Var.m10917c();
        rv0Var.m10920K(m10927D);
        return new String(rv0Var.f25637a, m10917c, m10927D);
    }

    /* renamed from: m */
    public static int m18715m(rv0 rv0Var) {
        return rv0Var.m10896x();
    }

    @Override // com.daaw.nj1
    /* renamed from: b */
    public boolean mo9922b(rv0 rv0Var) {
        return true;
    }

    @Override // com.daaw.nj1
    /* renamed from: c */
    public void mo9921c(rv0 rv0Var, long j) {
        if (m18715m(rv0Var) != 2) {
            throw new tv0();
        }
        if ("onMetaData".equals(m18716l(rv0Var)) && m18715m(rv0Var) == 8) {
            HashMap<String, Object> m18719i = m18719i(rv0Var);
            if (m18719i.containsKey("duration")) {
                double doubleValue = ((Double) m18719i.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f14538b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    /* renamed from: d */
    public long m18724d() {
        return this.f14538b;
    }
}
