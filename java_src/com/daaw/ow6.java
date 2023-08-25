package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class ow6 extends ax6 {

    /* renamed from: p */
    public final uw6 f22044p;

    /* renamed from: q */
    public final /* synthetic */ pw6 f22045q;

    public ow6(pw6 pw6Var, uw6 uw6Var) {
        this.f22045q = pw6Var;
        this.f22044p = uw6Var;
    }

    @Override // com.daaw.bx6
    /* renamed from: R1 */
    public final void mo13902R1(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        sw6 m8753c = tw6.m8753c();
        m8753c.mo5761b(i);
        if (string != null) {
            m8753c.mo5762a(string);
        }
        this.f22044p.mo1864a(m8753c.mo5760c());
        if (i == 8157) {
            this.f22045q.m12968c();
        }
    }
}
