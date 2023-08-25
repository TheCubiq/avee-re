package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzcl;
/* loaded from: classes2.dex */
public final class ih4 extends l75 {

    /* renamed from: t */
    public final /* synthetic */ String f13634t;

    /* renamed from: u */
    public final /* synthetic */ String f13635u;

    /* renamed from: v */
    public final /* synthetic */ Context f13636v;

    /* renamed from: w */
    public final /* synthetic */ Bundle f13637w;

    /* renamed from: x */
    public final /* synthetic */ gk5 f13638x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih4(gk5 gk5Var, String str, String str2, Context context, Bundle bundle) {
        super(gk5Var, true);
        this.f13638x = gk5Var;
        this.f13634t = str;
        this.f13635u = str2;
        this.f13636v = context;
        this.f13637w = bundle;
    }

    @Override // com.daaw.l75
    /* renamed from: a */
    public final void mo2297a() {
        boolean m21522n;
        String str;
        String str2;
        String str3;
        ju3 ju3Var;
        int m1147c;
        ju3 ju3Var2;
        String str4;
        String unused;
        try {
            m21522n = this.f13638x.m21522n(this.f13634t, this.f13635u);
            if (m21522n) {
                String str5 = this.f13635u;
                String str6 = this.f13634t;
                str4 = this.f13638x.f11389a;
                str2 = str6;
                str3 = str5;
                str = str4;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            ry0.m10830j(this.f13636v);
            gk5 gk5Var = this.f13638x;
            gk5Var.f11397i = gk5Var.m21516t(this.f13636v, true);
            ju3Var = this.f13638x.f11397i;
            if (ju3Var == null) {
                unused = this.f13638x.f11389a;
                return;
            }
            int m1149a = DynamiteModule.m1149a(this.f13636v, ModuleDescriptor.MODULE_ID);
            zzcl zzclVar = new zzcl(74029L, Math.max(m1149a, m1147c), DynamiteModule.m1147c(this.f13636v, ModuleDescriptor.MODULE_ID) < m1149a, str, str2, str3, this.f13637w, ji6.m18489a(this.f13636v));
            ju3Var2 = this.f13638x.f11397i;
            ((ju3) ry0.m10830j(ju3Var2)).initialize(nt0.m14830g3(this.f13636v), zzclVar, this.f17103p);
        } catch (Exception e) {
            this.f13638x.m21525k(e, true, false);
        }
    }
}
