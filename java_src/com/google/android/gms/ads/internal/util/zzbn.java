package com.google.android.gms.ads.internal.util;

import com.daaw.e14;
import com.daaw.fc3;
import com.daaw.j04;
import com.daaw.mf2;
import com.daaw.qf2;
import com.daaw.sg2;
import com.daaw.wf2;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzbn extends qf2 {
    public final e14 B;
    public final j04 C;

    public zzbn(String str, Map map, e14 e14Var) {
        super(0, str, new fc3(e14Var));
        this.B = e14Var;
        j04 j04Var = new j04(null);
        this.C = j04Var;
        j04Var.d(str, "GET", null, null);
    }

    @Override // com.daaw.qf2
    public final wf2 a(mf2 mf2Var) {
        return wf2.b(mf2Var, sg2.b(mf2Var));
    }

    @Override // com.daaw.qf2
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        mf2 mf2Var = (mf2) obj;
        this.C.f(mf2Var.c, mf2Var.a);
        j04 j04Var = this.C;
        byte[] bArr = mf2Var.b;
        if (j04.l() && bArr != null) {
            j04Var.h(bArr);
        }
        this.B.b(mf2Var);
    }
}
