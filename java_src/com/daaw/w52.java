package com.daaw;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class w52 extends y52 {
    public long b;
    public long[] c;
    public long[] d;

    public w52() {
        super(new i09());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }

    public static Double g(ik5 ik5Var) {
        return Double.valueOf(Double.longBitsToDouble(ik5Var.z()));
    }

    public static Object h(ik5 ik5Var, int i) {
        if (i == 0) {
            return g(ik5Var);
        }
        if (i == 1) {
            return Boolean.valueOf(ik5Var.s() == 1);
        } else if (i == 2) {
            return i(ik5Var);
        } else {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) g(ik5Var).doubleValue());
                        ik5Var.g(2);
                        return date;
                    }
                    int v = ik5Var.v();
                    ArrayList arrayList = new ArrayList(v);
                    for (int i2 = 0; i2 < v; i2++) {
                        Object h = h(ik5Var, ik5Var.s());
                        if (h != null) {
                            arrayList.add(h);
                        }
                    }
                    return arrayList;
                }
                return j(ik5Var);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String i3 = i(ik5Var);
                int s = ik5Var.s();
                if (s == 9) {
                    return hashMap;
                }
                Object h2 = h(ik5Var, s);
                if (h2 != null) {
                    hashMap.put(i3, h2);
                }
            }
        }
    }

    public static String i(ik5 ik5Var) {
        int w = ik5Var.w();
        int k = ik5Var.k();
        ik5Var.g(w);
        return new String(ik5Var.h(), k, w);
    }

    public static HashMap j(ik5 ik5Var) {
        int v = ik5Var.v();
        HashMap hashMap = new HashMap(v);
        for (int i = 0; i < v; i++) {
            String i2 = i(ik5Var);
            Object h = h(ik5Var, ik5Var.s());
            if (h != null) {
                hashMap.put(i2, h);
            }
        }
        return hashMap;
    }

    @Override // com.daaw.y52
    public final boolean a(ik5 ik5Var) {
        return true;
    }

    @Override // com.daaw.y52
    public final boolean b(ik5 ik5Var, long j) {
        if (ik5Var.s() == 2 && "onMetaData".equals(i(ik5Var)) && ik5Var.i() != 0 && ik5Var.s() == 8) {
            HashMap j2 = j(ik5Var);
            Object obj = j2.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = j2.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.c = new long[size];
                    this.d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.c = new long[0];
                            this.d = new long[0];
                            break;
                        }
                        this.c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long d() {
        return this.b;
    }

    public final long[] e() {
        return this.d;
    }

    public final long[] f() {
        return this.c;
    }
}
