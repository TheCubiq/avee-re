package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class ih4 extends l75 {
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ Context v;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ gk5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih4(gk5 gk5Var, String str, String str2, Context context, Bundle bundle) {
        super(gk5Var, true);
        this.x = gk5Var;
        this.t = str;
        this.u = str2;
        this.v = context;
        this.w = bundle;
    }

    @Override // com.daaw.l75
    public final void a() {
        boolean n;
        String str;
        String str2;
        String str3;
        ju3 ju3Var;
        int c;
        ju3 ju3Var2;
        String str4;
        String unused;
        try {
            n = this.x.n(this.t, this.u);
            if (n) {
                String str5 = this.u;
                String str6 = this.t;
                str4 = this.x.a;
                str2 = str6;
                str3 = str5;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            ry0.j(this.v);
            gk5 gk5Var = this.x;
            gk5Var.i = gk5Var.t(this.v, true);
            ju3Var = this.x.i;
            if (ju3Var == null) {
                unused = this.x.a;
                return;
            }
            int a = DynamiteModule.a(this.v, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(74029L, Math.max(a, c), DynamiteModule.c(this.v, ModuleDescriptor.MODULE_ID) < a, str, str2, str3, this.w, ji6.a(this.v));
            ju3Var2 = this.x.i;
            ((ju3) ry0.j(ju3Var2)).initialize(nt0.g3(this.v), zzclVar, this.p);
        } catch (Exception e) {
            this.x.k(e, true, false);
        }
    }
}
