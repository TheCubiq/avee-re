package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.List;
/* loaded from: classes.dex */
public final class cb1 {

    /* renamed from: a */
    public final List<Format> f5688a;

    /* renamed from: b */
    public final sm1[] f5689b;

    public cb1(List<Format> list) {
        this.f5688a = list;
        this.f5689b = new sm1[list.size()];
    }

    /* renamed from: a */
    public void m25456a(long j, rv0 rv0Var) {
        C2432oe.m14327a(j, rv0Var, this.f5689b);
    }

    /* renamed from: b */
    public void m25455b(d00 d00Var, eo1.C1208d c1208d) {
        for (int i = 0; i < this.f5689b.length; i++) {
            c1208d.m23336a();
            sm1 mo11478a = d00Var.mo11478a(c1208d.m23334c(), 3);
            Format format = this.f5688a.get(i);
            String str = format.f35721u;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            C2914s6.m10689b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.f35716p;
            if (str2 == null) {
                str2 = c1208d.m23335b();
            }
            mo11478a.mo10156d(Format.m1742D(str2, str, null, -1, format.f35712M, format.f35713N, format.f35714O, null));
            this.f5689b[i] = mo11478a;
        }
    }
}
