package com.daaw;

import java.util.Iterator;
import java.util.Set;
/* renamed from: com.daaw.ds */
/* loaded from: classes2.dex */
public class C1131ds implements lq1 {

    /* renamed from: a */
    public final String f7694a;

    /* renamed from: b */
    public final p70 f7695b;

    public C1131ds(Set<ij0> set, p70 p70Var) {
        this.f7694a = m24015e(set);
        this.f7695b = p70Var;
    }

    /* renamed from: c */
    public static C3330vh<lq1> m24017c() {
        return C3330vh.m7173e(lq1.class).m7156b(C3740ys.m3347l(ij0.class)).m7153e(new InterfaceC1421gi() { // from class: com.daaw.cs
            @Override // com.daaw.InterfaceC1421gi
            /* renamed from: a */
            public final Object mo3451a(InterfaceC0842bi interfaceC0842bi) {
                lq1 m24016d;
                m24016d = C1131ds.m24016d(interfaceC0842bi);
                return m24016d;
            }
        }).m7155c();
    }

    /* renamed from: d */
    public static /* synthetic */ lq1 m24016d(InterfaceC0842bi interfaceC0842bi) {
        return new C1131ds(interfaceC0842bi.mo12501f(ij0.class), p70.m13615a());
    }

    /* renamed from: e */
    public static String m24015e(Set<ij0> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<ij0> it = set.iterator();
        while (it.hasNext()) {
            ij0 next = it.next();
            sb.append(next.mo19757b());
            sb.append('/');
            sb.append(next.mo19756c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.daaw.lq1
    /* renamed from: a */
    public String mo16668a() {
        if (this.f7695b.m13614b().isEmpty()) {
            return this.f7694a;
        }
        return this.f7694a + ' ' + m24015e(this.f7695b.m13614b());
    }
}
