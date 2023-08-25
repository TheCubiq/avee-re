package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class lw6 extends dx6 {
    public final /* synthetic */ rw6 q;
    public final /* synthetic */ uw6 r;
    public final /* synthetic */ tj1 s;
    public final /* synthetic */ pw6 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw6(pw6 pw6Var, tj1 tj1Var, rw6 rw6Var, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.t = pw6Var;
        this.q = rw6Var;
        this.r = uw6Var;
        this.s = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    public final void a() {
        cx6 cx6Var;
        String str;
        String str2;
        String str3;
        try {
            ?? e = this.t.a.e();
            pw6 pw6Var = this.t;
            str2 = pw6Var.b;
            rw6 rw6Var = this.q;
            str3 = pw6Var.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", rw6Var.e());
            bundle.putString("adFieldEnifd", rw6Var.f());
            bundle.putInt("layoutGravity", rw6Var.c());
            bundle.putFloat("layoutVerticalMargin", rw6Var.a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", rw6Var.d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (rw6Var.g() != null) {
                bundle.putString("appId", rw6Var.g());
            }
            e.Q0(str2, bundle, new ow6(this.t, this.r));
        } catch (RemoteException e2) {
            cx6Var = pw6.c;
            str = this.t.b;
            cx6Var.c(e2, "show overlay display from: %s", str);
            this.s.d(new RuntimeException(e2));
        }
    }
}
