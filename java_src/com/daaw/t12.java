package com.daaw;

import android.content.Intent;
/* loaded from: classes.dex */
public final class t12 extends u12 {

    /* renamed from: p */
    public final /* synthetic */ Intent f26891p;

    /* renamed from: q */
    public final /* synthetic */ pj0 f26892q;

    public t12(Intent intent, pj0 pj0Var, int i) {
        this.f26891p = intent;
        this.f26892q = pj0Var;
    }

    @Override // com.daaw.u12
    /* renamed from: a */
    public final void mo8639a() {
        Intent intent = this.f26891p;
        if (intent != null) {
            this.f26892q.startActivityForResult(intent, 2);
        }
    }
}
