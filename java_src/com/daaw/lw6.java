package com.daaw;

import android.os.Bundle;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class lw6 extends dx6 {

    /* renamed from: q */
    public final /* synthetic */ rw6 f17872q;

    /* renamed from: r */
    public final /* synthetic */ uw6 f17873r;

    /* renamed from: s */
    public final /* synthetic */ tj1 f17874s;

    /* renamed from: t */
    public final /* synthetic */ pw6 f17875t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw6(pw6 pw6Var, tj1 tj1Var, rw6 rw6Var, uw6 uw6Var, tj1 tj1Var2) {
        super(tj1Var);
        this.f17875t = pw6Var;
        this.f17872q = rw6Var;
        this.f17873r = uw6Var;
        this.f17874s = tj1Var2;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.daaw.zw6, android.os.IInterface] */
    @Override // com.daaw.dx6
    /* renamed from: a */
    public final void mo14744a() {
        cx6 cx6Var;
        String str;
        String str2;
        String str3;
        try {
            ?? m11966e = this.f17875t.f23466a.m11966e();
            pw6 pw6Var = this.f17875t;
            str2 = pw6Var.f23467b;
            rw6 rw6Var = this.f17872q;
            str3 = pw6Var.f23467b;
            Bundle bundle = new Bundle();
            bundle.putBinder("windowToken", rw6Var.mo6732e());
            bundle.putString("adFieldEnifd", rw6Var.mo6731f());
            bundle.putInt("layoutGravity", rw6Var.mo6734c());
            bundle.putFloat("layoutVerticalMargin", rw6Var.mo6736a());
            bundle.putInt("displayMode", 0);
            bundle.putInt("windowWidthPx", rw6Var.mo6733d());
            bundle.putBoolean("stableSessionToken", false);
            bundle.putString("callerPackage", str3);
            if (rw6Var.mo6730g() != null) {
                bundle.putString("appId", rw6Var.mo6730g());
            }
            m11966e.mo1820Q0(str2, bundle, new ow6(this.f17875t, this.f17873r));
        } catch (RemoteException e) {
            cx6Var = pw6.f23464c;
            str = this.f17875t.f23467b;
            cx6Var.m24910c(e, "show overlay display from: %s", str);
            this.f17874s.m9079d(new RuntimeException(e));
        }
    }
}
