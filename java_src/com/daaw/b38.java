package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class b38 {
    public static gl2 a(gs7 gs7Var) {
        if (gs7Var == null) {
            return gl2.g;
        }
        int M = gs7Var.M() - 1;
        if (M == 1) {
            return gs7Var.L() ? new wp2(gs7Var.G()) : gl2.n;
        } else if (M == 2) {
            return gs7Var.K() ? new tb2(Double.valueOf(gs7Var.D())) : new tb2(null);
        } else if (M == 3) {
            return gs7Var.J() ? new g92(Boolean.valueOf(gs7Var.I())) : new g92(null);
        } else if (M == 4) {
            List<gs7> H = gs7Var.H();
            ArrayList arrayList = new ArrayList();
            for (gs7 gs7Var2 : H) {
                arrayList.add(a(gs7Var2));
            }
            return new km2(gs7Var.F(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static gl2 b(Object obj) {
        if (obj == null) {
            return gl2.h;
        }
        if (obj instanceof String) {
            return new wp2((String) obj);
        }
        if (obj instanceof Double) {
            return new tb2((Double) obj);
        }
        if (obj instanceof Long) {
            return new tb2(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new tb2(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g92((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                z72 z72Var = new z72();
                for (Object obj2 : (List) obj) {
                    z72Var.s(z72Var.j(), b(obj2));
                }
                return z72Var;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        th2 th2Var = new th2();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            gl2 b = b(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                th2Var.h((String) obj3, b);
            }
        }
        return th2Var;
    }
}
