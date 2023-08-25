package com.daaw;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public final class n22 implements Runnable {
    public final i22 p;
    public final /* synthetic */ p22 q;

    public n22(p22 p22Var, i22 i22Var) {
        this.q = p22Var;
        this.p = i22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.q.q) {
            ConnectionResult b = this.p.b();
            if (b.t()) {
                p22 p22Var = this.q;
                p22Var.p.startActivityForResult(GoogleApiActivity.a(p22Var.b(), (PendingIntent) ry0.j(b.s()), this.p.a(), false), 1);
                return;
            }
            p22 p22Var2 = this.q;
            if (p22Var2.t.b(p22Var2.b(), b.h(), null) != null) {
                p22 p22Var3 = this.q;
                p22Var3.t.v(p22Var3.b(), this.q.p, b.h(), 2, this.q);
            } else if (b.h() != 18) {
                this.q.l(b, this.p.a());
            } else {
                p22 p22Var4 = this.q;
                Dialog q = p22Var4.t.q(p22Var4.b(), this.q);
                p22 p22Var5 = this.q;
                p22Var5.t.r(p22Var5.b().getApplicationContext(), new l22(this, q));
            }
        }
    }
}
