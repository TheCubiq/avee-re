package com.daaw;

import android.content.Context;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class lp4 implements fs4, jr4 {
    public final Context p;
    public final th6 q;
    public final mr3 r;

    public lp4(Context context, th6 th6Var, mr3 mr3Var, byte[] bArr) {
        this.p = context;
        this.q = th6Var;
        this.r = mr3Var;
    }

    @Override // com.daaw.jr4
    public final void f(Context context) {
    }

    @Override // com.daaw.jr4
    public final void l(Context context) {
    }

    @Override // com.daaw.jr4
    public final void s(Context context) {
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        nr3 nr3Var = this.q.e0;
        if (nr3Var == null || !nr3Var.a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.q.e0.b.isEmpty()) {
            return;
        }
        arrayList.add(this.q.e0.b);
    }
}
