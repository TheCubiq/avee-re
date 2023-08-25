package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class nw6 extends dx6 {

    /* renamed from: q */
    public final /* synthetic */ ww6 f20793q;

    /* renamed from: r */
    public final /* synthetic */ int f20794r;

    /* renamed from: s */
    public final /* synthetic */ uw6 f20795s;

    /* renamed from: t */
    public final /* synthetic */ tj1 f20796t;

    /* renamed from: u */
    public final /* synthetic */ pw6 f20797u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw6(pw6 pw6Var, tj1 tj1Var, ww6 ww6Var, int i, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.f20797u = pw6Var;
        this.f20793q = ww6Var;
        this.f20794r = i;
        this.f20795s = uw6Var;
        this.f20796t = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    /* renamed from: a */
    public final void mo14744a() {
        cx6 cx6Var;
        String str;
        String str2;
        try {
            ?? m11966e = this.f20797u.f23466a.m11966e();
            ww6 ww6Var = this.f20793q;
            str2 = this.f20797u.f23467b;
            int i = this.f20794r;
            Bundle bundle = new Bundle();
            bundle.putString("sessionToken", ww6Var.mo5748b());
            bundle.putInt("displayMode", i);
            bundle.putString("callerPackage", str2);
            bundle.putString("appId", ww6Var.mo5749a());
            m11966e.mo1822M0(bundle, new ow6(this.f20797u, this.f20795s));
        } catch (RemoteException e) {
            cx6Var = pw6.f23464c;
            str = this.f20797u.f23467b;
            cx6Var.m24910c(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(this.f20794r), str);
            this.f20796t.m9079d(new RuntimeException(e));
        }
    }
}
