package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class nw6 extends dx6 {
    public final /* synthetic */ ww6 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ uw6 s;
    public final /* synthetic */ tj1 t;
    public final /* synthetic */ pw6 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw6(pw6 pw6Var, tj1 tj1Var, ww6 ww6Var, int i, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.u = pw6Var;
        this.q = ww6Var;
        this.r = i;
        this.s = uw6Var;
        this.t = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    public final void a() {
        cx6 cx6Var;
        String str;
        String str2;
        try {
            ?? e = this.u.a.e();
            ww6 ww6Var = this.q;
            str2 = this.u.b;
            int i = this.r;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", ww6Var.b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", ww6Var.a());
            e.M0(bundle, new ow6(this.u, this.s));
        } catch (RemoteException e2) {
            cx6Var = pw6.c;
            str = this.u.b;
            cx6Var.c(e2, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.r), str);
            this.t.d(new RuntimeException(e2));
        }
    }
}
