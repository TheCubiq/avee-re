package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class hx6 extends dx6 {

    /* renamed from: q */
    public final /* synthetic */ qx6 f13051q;

    public hx6(qx6 qx6Var) {
        this.f13051q = qx6Var;
    }

    @Override // com.daaw.dx6
    /* renamed from: a */
    public final void mo14744a() {
        IInterface iInterface;
        cx6 cx6Var;
        Context context;
        ServiceConnection serviceConnection;
        qx6 qx6Var = this.f13051q;
        iInterface = qx6Var.f24619m;
        if (iInterface != null) {
            cx6Var = qx6Var.f24608b;
            cx6Var.m24909d("Unbind from service.", new Object[0]);
            qx6 qx6Var2 = this.f13051q;
            context = qx6Var2.f24607a;
            serviceConnection = qx6Var2.f24618l;
            context.unbindService(serviceConnection);
            this.f13051q.f24613g = false;
            this.f13051q.f24619m = null;
            this.f13051q.f24618l = null;
        }
        this.f13051q.m11951t();
    }
}
