package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class as7 {
    public static final as7 d = new as7(true);
    public final pv7 a = new fv7(16);
    public boolean b;
    public boolean c;

    public as7() {
    }

    public as7(boolean z) {
        b();
        b();
    }

    public static as7 a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.daaw.zr7 r4, java.lang.Object r5) {
        /*
            com.daaw.mw7 r0 = r4.zzb()
            com.daaw.vs7.e(r5)
            com.daaw.mw7 r1 = com.daaw.mw7.q
            com.daaw.nw7 r1 = com.daaw.nw7.INT
            com.daaw.nw7 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof com.daaw.xt7
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof com.daaw.ns7
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof com.daaw.yq7
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.daaw.mw7 r4 = r4.zzb()
            com.daaw.nw7 r4 = r4.a()
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.as7.d(com.daaw.zr7, java.lang.Object):void");
    }

    public final void b() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            if (g.getValue() instanceof ls7) {
                ((ls7) g.getValue()).A();
            }
        }
        this.a.a();
        this.b = true;
    }

    public final void c(zr7 zr7Var, Object obj) {
        if (!zr7Var.zzc()) {
            d(zr7Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d(zr7Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(zr7Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        as7 as7Var = new as7();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            as7Var.c((zr7) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.a.c()) {
            as7Var.c((zr7) entry.getKey(), entry.getValue());
        }
        as7Var.c = this.c;
        return as7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof as7) {
            return this.a.equals(((as7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
