package com.daaw;

import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class se1 implements z91 {
    public ol1 a;
    public sm1 b;
    public boolean c;

    @Override // com.daaw.z91
    public void a(rv0 rv0Var) {
        if (!this.c) {
            if (this.a.e() == -9223372036854775807L) {
                return;
            }
            this.b.d(Format.x(null, "application/x-scte35", this.a.e()));
            this.c = true;
        }
        int a = rv0Var.a();
        this.b.c(rv0Var, a);
        this.b.a(this.a.d(), 1, a, 0, null);
    }

    @Override // com.daaw.z91
    public void c(ol1 ol1Var, d00 d00Var, eo1.d dVar) {
        this.a = ol1Var;
        dVar.a();
        sm1 a = d00Var.a(dVar.c(), 4);
        this.b = a;
        a.d(Format.y(dVar.b(), "application/x-scte35", null, -1, null));
    }
}
