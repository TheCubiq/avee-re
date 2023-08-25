package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.List;
/* loaded from: classes.dex */
public final class cb1 {
    public final List<Format> a;
    public final sm1[] b;

    public cb1(List<Format> list) {
        this.a = list;
        this.b = new sm1[list.size()];
    }

    public void a(long j, rv0 rv0Var) {
        oe.a(j, rv0Var, this.b);
    }

    public void b(d00 d00Var, eo1.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            dVar.a();
            sm1 a = d00Var.a(dVar.c(), 3);
            Format format = this.a.get(i);
            String str = format.u;
            boolean z = "application/cea-608".equals(str) || "application/cea-708".equals(str);
            s6.b(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.p;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a.d(Format.D(str2, str, null, -1, format.M, format.N, format.O, null));
            this.b[i] = a;
        }
    }
}
