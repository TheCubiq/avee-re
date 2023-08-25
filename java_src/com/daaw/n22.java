package com.daaw;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
/* loaded from: classes.dex */
public final class n22 implements Runnable {

    /* renamed from: p */
    public final i22 f19423p;

    /* renamed from: q */
    public final /* synthetic */ p22 f19424q;

    public n22(p22 p22Var, i22 i22Var) {
        this.f19424q = p22Var;
        this.f19423p = i22Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19424q.f22534q) {
            ConnectionResult m20169b = this.f19423p.m20169b();
            if (m20169b.m1206t()) {
                p22 p22Var = this.f19424q;
                p22Var.f36613p.startActivityForResult(GoogleApiActivity.m1201a(p22Var.m1182b(), (PendingIntent) ry0.m10830j(m20169b.m1207s()), this.f19423p.m20170a(), false), 1);
                return;
            }
            p22 p22Var2 = this.f19424q;
            if (p22Var2.f22537t.mo5496b(p22Var2.m1182b(), m20169b.m1209h(), null) != null) {
                p22 p22Var3 = this.f19424q;
                p22Var3.f22537t.m6468v(p22Var3.m1182b(), this.f19424q.f36613p, m20169b.m1209h(), 2, this.f19424q);
            } else if (m20169b.m1209h() != 18) {
                this.f19424q.m13757l(m20169b, this.f19423p.m20170a());
            } else {
                p22 p22Var4 = this.f19424q;
                Dialog m6473q = p22Var4.f22537t.m6473q(p22Var4.m1182b(), this.f19424q);
                p22 p22Var5 = this.f19424q;
                p22Var5.f22537t.m6472r(p22Var5.m1182b().getApplicationContext(), new l22(this, m6473q));
            }
        }
    }
}
