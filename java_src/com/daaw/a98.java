package com.daaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class a98 {
    public static final a98 d = new a98(true);
    public final gg8 a = new mf8(16);
    public boolean b;
    public boolean c;

    public a98() {
    }

    public a98(boolean z) {
        b();
        b();
    }

    public static a98 a() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.daaw.x88 r4, java.lang.Object r5) {
        /*
            com.daaw.gi8 r0 = r4.zzb()
            com.daaw.gb8.e(r5)
            com.daaw.gi8 r1 = com.daaw.gi8.q
            com.daaw.ii8 r1 = com.daaw.ii8.INT
            com.daaw.ii8 r0 = r0.a()
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof com.daaw.zd8
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof com.daaw.y68
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.zza()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            com.daaw.gi8 r4 = r4.zzb()
            com.daaw.ii8 r4 = r4.a()
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
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.a98.d(com.daaw.x88, java.lang.Object):void");
    }

    public final void b() {
        if (this.b) {
            return;
        }
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            if (g.getValue() instanceof ja8) {
                ((ja8) g.getValue()).t();
            }
        }
        this.a.a();
        this.b = true;
    }

    public final void c(x88 x88Var, Object obj) {
        if (!x88Var.zzc()) {
            d(x88Var, obj);
        } else if (!(obj instanceof List)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d(x88Var, arrayList.get(i));
            }
            obj = arrayList;
        }
        this.a.put(x88Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        a98 a98Var = new a98();
        for (int i = 0; i < this.a.b(); i++) {
            Map.Entry g = this.a.g(i);
            a98Var.c((x88) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.a.c()) {
            a98Var.c((x88) entry.getKey(), entry.getValue());
        }
        a98Var.c = this.c;
        return a98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a98) {
            return this.a.equals(((a98) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
