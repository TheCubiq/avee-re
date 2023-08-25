package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class na5 implements jr4 {
    public final a74 p;

    public na5(a74 a74Var) {
        this.p = a74Var;
    }

    @Override // com.daaw.jr4
    public final void f(Context context) {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.destroy();
        }
    }

    @Override // com.daaw.jr4
    public final void l(Context context) {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.onResume();
        }
    }

    @Override // com.daaw.jr4
    public final void s(Context context) {
        a74 a74Var = this.p;
        if (a74Var != null) {
            a74Var.onPause();
        }
    }
}
