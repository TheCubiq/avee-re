package com.daaw;

import android.content.Intent;
/* loaded from: classes.dex */
public final class t12 extends u12 {
    public final /* synthetic */ Intent p;
    public final /* synthetic */ pj0 q;

    public t12(Intent intent, pj0 pj0Var, int i) {
        this.p = intent;
        this.q = pj0Var;
    }

    @Override // com.daaw.u12
    public final void a() {
        Intent intent = this.p;
        if (intent != null) {
            this.q.startActivityForResult(intent, 2);
        }
    }
}
