package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class b38 {
    /* renamed from: a */
    public static gl2 m26496a(gs7 gs7Var) {
        if (gs7Var == null) {
            return gl2.f11420g;
        }
        int m21243M = gs7Var.m21243M() - 1;
        if (m21243M == 1) {
            return gs7Var.m21244L() ? new wp2(gs7Var.m21249G()) : gl2.f11427n;
        } else if (m21243M == 2) {
            return gs7Var.m21245K() ? new tb2(Double.valueOf(gs7Var.m21252D())) : new tb2(null);
        } else if (m21243M == 3) {
            return gs7Var.m21246J() ? new g92(Boolean.valueOf(gs7Var.m21247I())) : new g92(null);
        } else if (m21243M == 4) {
            List<gs7> m21248H = gs7Var.m21248H();
            ArrayList arrayList = new ArrayList();
            for (gs7 gs7Var2 : m21248H) {
                arrayList.add(m26496a(gs7Var2));
            }
            return new km2(gs7Var.m21250F(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    /* renamed from: b */
    public static gl2 m26495b(Object obj) {
        if (obj == null) {
            return gl2.f11421h;
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
                    z72Var.m2696s(z72Var.m2704j(), m26495b(obj2));
                }
                return z72Var;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        th2 th2Var = new th2();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            gl2 m26495b = m26495b(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                th2Var.mo2705h((String) obj3, m26495b);
            }
        }
        return th2Var;
    }
}
