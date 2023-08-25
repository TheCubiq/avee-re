package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class na5 implements jr4 {

    /* renamed from: p */
    public final a74 f19769p;

    public na5(a74 a74Var) {
        this.f19769p = a74Var;
    }

    @Override // com.daaw.jr4
    /* renamed from: f */
    public final void mo5173f(Context context) {
        a74 a74Var = this.f19769p;
        if (a74Var != null) {
            a74Var.destroy();
        }
    }

    @Override // com.daaw.jr4
    /* renamed from: l */
    public final void mo5171l(Context context) {
        a74 a74Var = this.f19769p;
        if (a74Var != null) {
            a74Var.onResume();
        }
    }

    @Override // com.daaw.jr4
    /* renamed from: s */
    public final void mo5169s(Context context) {
        a74 a74Var = this.f19769p;
        if (a74Var != null) {
            a74Var.onPause();
        }
    }
}
