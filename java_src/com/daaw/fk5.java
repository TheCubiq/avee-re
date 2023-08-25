package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzccb;
/* loaded from: classes.dex */
public final class fk5 implements pt4 {

    /* renamed from: p */
    public final Context f9638p;

    /* renamed from: q */
    public final ky3 f9639q;

    public fk5(Context context, ky3 ky3Var) {
        this.f9638p = context;
        this.f9639q = ky3Var;
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
        if (TextUtils.isEmpty(fi6Var.f9624b.f8508b.f31254d)) {
            return;
        }
        this.f9639q.m17322u(this.f9638p, fi6Var.f9623a.f5824a.f25344d);
        this.f9639q.m17326q(this.f9638p, fi6Var.f9624b.f8508b.f31254d);
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
    }
}
