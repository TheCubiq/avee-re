package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class hx6 extends dx6 {
    public final /* synthetic */ qx6 q;

    public hx6(qx6 qx6Var) {
        this.q = qx6Var;
    }

    @Override // com.daaw.dx6
    public final void a() {
        IInterface iInterface;
        cx6 cx6Var;
        Context context;
        ServiceConnection serviceConnection;
        qx6 qx6Var = this.q;
        iInterface = qx6Var.m;
        if (iInterface != null) {
            cx6Var = qx6Var.b;
            cx6Var.d("Unbind from service.", new Object[0]);
            qx6 qx6Var2 = this.q;
            context = qx6Var2.a;
            serviceConnection = qx6Var2.l;
            context.unbindService(serviceConnection);
            this.q.g = false;
            this.q.m = null;
            this.q.l = null;
        }
        this.q.t();
    }
}
