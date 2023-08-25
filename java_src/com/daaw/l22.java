package com.daaw;

import android.app.Dialog;
/* loaded from: classes.dex */
public final class l22 extends o02 {
    public final /* synthetic */ Dialog a;
    public final /* synthetic */ n22 b;

    public l22(n22 n22Var, Dialog dialog) {
        this.b = n22Var;
        this.a = dialog;
    }

    @Override // com.daaw.o02
    public final void a() {
        this.b.q.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
