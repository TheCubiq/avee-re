package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class j91 extends nj1 {
    public long b;

    public j91() {
        super(null);
        this.b = -9223372036854775807L;
    }

    public static Boolean e(rv0 rv0Var) {
        return Boolean.valueOf(rv0Var.x() == 1);
    }

    public static Object f(rv0 rv0Var, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                return g(rv0Var);
                            }
                            return k(rv0Var);
                        }
                        return i(rv0Var);
                    }
                    return j(rv0Var);
                }
                return l(rv0Var);
            }
            return e(rv0Var);
        }
        return h(rv0Var);
    }

    public static Date g(rv0 rv0Var) {
        Date date = new Date((long) h(rv0Var).doubleValue());
        rv0Var.K(2);
        return date;
    }

    public static Double h(rv0 rv0Var) {
        return Double.valueOf(Double.longBitsToDouble(rv0Var.q()));
    }

    public static HashMap<String, Object> i(rv0 rv0Var) {
        int B = rv0Var.B();
        HashMap<String, Object> hashMap = new HashMap<>(B);
        for (int i = 0; i < B; i++) {
            hashMap.put(l(rv0Var), f(rv0Var, m(rv0Var)));
        }
        return hashMap;
    }

    public static HashMap<String, Object> j(rv0 rv0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String l = l(rv0Var);
            int m = m(rv0Var);
            if (m == 9) {
                return hashMap;
            }
            hashMap.put(l, f(rv0Var, m));
        }
    }

    public static ArrayList<Object> k(rv0 rv0Var) {
        int B = rv0Var.B();
        ArrayList<Object> arrayList = new ArrayList<>(B);
        for (int i = 0; i < B; i++) {
            arrayList.add(f(rv0Var, m(rv0Var)));
        }
        return arrayList;
    }

    public static String l(rv0 rv0Var) {
        int D = rv0Var.D();
        int c = rv0Var.c();
        rv0Var.K(D);
        return new String(rv0Var.a, c, D);
    }

    public static int m(rv0 rv0Var) {
        return rv0Var.x();
    }

    @Override // com.daaw.nj1
    public boolean b(rv0 rv0Var) {
        return true;
    }

    @Override // com.daaw.nj1
    public void c(rv0 rv0Var, long j) {
        if (m(rv0Var) != 2) {
            throw new tv0();
        }
        if ("onMetaData".equals(l(rv0Var)) && m(rv0Var) == 8) {
            HashMap<String, Object> i = i(rv0Var);
            if (i.containsKey("duration")) {
                double doubleValue = ((Double) i.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }

    public long d() {
        return this.b;
    }
}
