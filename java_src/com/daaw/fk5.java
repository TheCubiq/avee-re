package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class fk5 implements pt4 {
    public final Context p;
    public final ky3 q;

    public fk5(Context context, ky3 ky3Var) {
        this.p = context;
        this.q = ky3Var;
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
        if (TextUtils.isEmpty(fi6Var.b.b.d)) {
            return;
        }
        this.q.u(this.p, fi6Var.a.a.d);
        this.q.q(this.p, fi6Var.b.b.d);
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
    }
}
