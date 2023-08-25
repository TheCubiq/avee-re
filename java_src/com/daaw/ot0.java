package com.daaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class ot0 {

    /* renamed from: com.daaw.ot0$a */
    /* loaded from: classes.dex */
    public static final class C2476a {

        /* renamed from: a */
        public final List f21950a;

        /* renamed from: b */
        public final Object f21951b;

        public /* synthetic */ C2476a(Object obj, wb2 wb2Var) {
            ry0.m10830j(obj);
            this.f21951b = obj;
            this.f21950a = new ArrayList();
        }

        /* renamed from: a */
        public C2476a m13978a(String str, Object obj) {
            List list = this.f21950a;
            ry0.m10830j(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f21951b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f21950a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f21950a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m13981a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m13980b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C2476a m13979c(Object obj) {
        return new C2476a(obj, null);
    }
}
