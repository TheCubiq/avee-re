package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
/* loaded from: classes.dex */
public final class zi6 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ a74 f35119a;

    /* renamed from: b */
    public final /* synthetic */ op6 f35120b;

    /* renamed from: c */
    public final /* synthetic */ cq5 f35121c;

    public zi6(a74 a74Var, op6 op6Var, cq5 cq5Var) {
        this.f35119a = a74Var;
        this.f35120b = op6Var;
        this.f35121c = cq5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
        if (r8.f35119a.mo6421d().f27673T != false) goto L14;
     */
    @Override // com.daaw.o67
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        String str = (String) obj;
        if (!this.f35119a.mo6421d().f27701k0) {
            this.f35120b.m14098c(str, null);
            return;
        }
        long mo15860a = zzt.zzB().mo15860a();
        String str2 = this.f35119a.mo6398v().f31252b;
        int i = 1;
        if (!zzt.zzo().m11899x(this.f35119a.getContext())) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10457J5)).booleanValue()) {
            }
            this.f35121c.m25118u(new eq5(mo15860a, str2, str, i));
        }
        i = 2;
        this.f35121c.m25118u(new eq5(mo15860a, str2, str, i));
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
    }
}
