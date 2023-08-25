package com.daaw;

import java.util.Iterator;
import java.util.Set;
/* loaded from: classes2.dex */
public class ds implements lq1 {
    public final String a;
    public final p70 b;

    public ds(Set<ij0> set, p70 p70Var) {
        this.a = e(set);
        this.b = p70Var;
    }

    public static vh<lq1> c() {
        return vh.e(lq1.class).b(ys.l(ij0.class)).e(new gi() { // from class: com.daaw.cs
            @Override // com.daaw.gi
            public final Object a(bi biVar) {
                lq1 d;
                d = ds.d(biVar);
                return d;
            }
        }).c();
    }

    public static /* synthetic */ lq1 d(bi biVar) {
        return new ds(biVar.f(ij0.class), p70.a());
    }

    public static String e(Set<ij0> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<ij0> it = set.iterator();
        while (it.hasNext()) {
            ij0 next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.daaw.lq1
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + e(this.b.b());
    }
}
