package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class mw6 extends dx6 {

    /* renamed from: q */
    public final /* synthetic */ dw6 f19194q;

    /* renamed from: r */
    public final /* synthetic */ uw6 f19195r;

    /* renamed from: s */
    public final /* synthetic */ tj1 f19196s;

    /* renamed from: t */
    public final /* synthetic */ pw6 f19197t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw6(pw6 pw6Var, tj1 tj1Var, dw6 dw6Var, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.f19197t = pw6Var;
        this.f19194q = dw6Var;
        this.f19195r = uw6Var;
        this.f19196s = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    /* renamed from: a */
    public final void mo14744a() {
        cx6 cx6Var;
        String str;
        String str2;
        try {
            ?? m11966e = this.f19197t.f23466a.m11966e();
            dw6 dw6Var = this.f19194q;
            str2 = this.f19197t.f23467b;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", dw6Var.mo9799b());
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", dw6Var.mo9800a());
            m11966e.mo1821O(bundle, new ow6(this.f19197t, this.f19195r));
        } catch (RemoteException e) {
            cx6Var = pw6.f23464c;
            str = this.f19197t.f23467b;
            cx6Var.m24910c(e, "dismiss overlay display from: %s", str);
            this.f19196s.m9079d(new RuntimeException(e));
        }
    }
}
