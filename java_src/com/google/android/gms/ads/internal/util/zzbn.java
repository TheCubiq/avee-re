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

    /* renamed from: B */
    public final e14 f36274B;

    /* renamed from: C */
    public final j04 f36275C;

    public zzbn(String str, Map map, e14 e14Var) {
        super(0, str, new fc3(e14Var));
        this.f36274B = e14Var;
        j04 j04Var = new j04(null);
        this.f36275C = j04Var;
        j04Var.m19196d(str, "GET", null, null);
    }

    @Override // com.daaw.qf2
    /* renamed from: a */
    public final wf2 mo1348a(mf2 mf2Var) {
        return wf2.m6088b(mf2Var, sg2.m10372b(mf2Var));
    }

    @Override // com.daaw.qf2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo1347c(Object obj) {
        mf2 mf2Var = (mf2) obj;
        this.f36275C.m19194f(mf2Var.f18851c, mf2Var.f18849a);
        j04 j04Var = this.f36275C;
        byte[] bArr = mf2Var.f18850b;
        if (j04.m19188l() && bArr != null) {
            j04Var.m19192h(bArr);
        }
        this.f36274B.m23797b(mf2Var);
    }
}
