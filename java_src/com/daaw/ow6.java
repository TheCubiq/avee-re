package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class ow6 extends ax6 {
    public final uw6 p;
    public final /* synthetic */ pw6 q;

    public ow6(pw6 pw6Var, uw6 uw6Var) {
        this.q = pw6Var;
        this.p = uw6Var;
    }

    @Override // com.daaw.bx6
    public final void R1(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        sw6 c = tw6.c();
        c.b(i);
        if (string != null) {
            c.a(string);
        }
        this.p.a(c.c());
        if (i == 8157) {
            this.q.c();
        }
    }
}
