package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class mw6 extends dx6 {
    public final /* synthetic */ dw6 q;
    public final /* synthetic */ uw6 r;
    public final /* synthetic */ tj1 s;
    public final /* synthetic */ pw6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw6(pw6 pw6Var, tj1 tj1Var, dw6 dw6Var, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.t = pw6Var;
        this.q = dw6Var;
        this.r = uw6Var;
        this.s = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    public final void a() {
        cx6 cx6Var;
        String str;
        String str2;
        try {
            ?? e = this.t.a.e();
            dw6 dw6Var = this.q;
            str2 = this.t.b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", dw6Var.b());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", dw6Var.a());
            e.O(bundle, new ow6(this.t, this.r));
        } catch (RemoteException e2) {
            cx6Var = pw6.c;
            str = this.t.b;
            cx6Var.c(e2, "dismiss overlay display from: %s", str);
            this.s.d(new RuntimeException(e2));
        }
    }
}
