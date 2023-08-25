package com.daaw;

import android.app.Dialog;
/* loaded from: classes.dex */
public final class l22 extends o02 {

    /* renamed from: a */
    public final /* synthetic */ Dialog f16970a;

    /* renamed from: b */
    public final /* synthetic */ n22 f16971b;

    public l22(n22 n22Var, Dialog dialog) {
        this.f16971b = n22Var;
        this.f16970a = dialog;
    }

    @Override // com.daaw.o02
    /* renamed from: a */
    public final void mo14658a() {
        this.f16971b.f19424q.m13756o();
        if (this.f16970a.isShowing()) {
            this.f16970a.dismiss();
        }
    }
}
