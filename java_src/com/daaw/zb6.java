package com.daaw;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.Collections;
/* loaded from: classes.dex */
public final class zb6 implements pz5 {

    /* renamed from: a */
    public final /* synthetic */ ac6 f34934a;

    public zb6(ac6 ac6Var) {
        this.f34934a = ac6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r0.f36995r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(com.daaw.g93.f10436H4)).intValue()) goto L11;
     */
    @Override // com.daaw.pz5
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void mo2496a(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        zzq m7131a;
        ViewGroup viewGroup5;
        zzq m7131a2;
        dd6 dd6Var;
        zzchu zzchuVar;
        ei4 ei4Var = (ei4) obj;
        ei4 ei4Var2 = this.f34934a.f3087z;
        if (ei4Var2 != null) {
            ei4Var2.mo2132a();
        }
        ac6 ac6Var = this.f34934a;
        ac6Var.f3087z = ei4Var;
        viewGroup = ac6Var.f3079r;
        viewGroup.removeAllViews();
        viewGroup2 = this.f34934a.f3079r;
        View m23463i = ei4Var.m23463i();
        zzt.zzp();
        viewGroup2.addView(m23463i, zzs.zzn());
        if (!ei4Var.m23460l()) {
            zzchuVar = this.f34934a.f3084w;
        }
        zzr m27531i3 = ac6.m27531i3(this.f34934a, ei4Var);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        boolean z = true;
        layoutParams.addRule(true != ei4Var.m23457o() ? 9 : 11);
        m27531i3.zzb((!ei4Var.m23458n() || ei4Var.m23459m()) ? false : false);
        viewGroup3 = this.f34934a.f3079r;
        viewGroup3.addView(m27531i3, layoutParams);
        ei4Var.m23461k(this.f34934a);
        ac6 ac6Var2 = this.f34934a;
        viewGroup4 = ac6Var2.f3079r;
        m7131a = vi6.m7131a(ac6Var2.f3078q, Collections.singletonList(ac6Var2.f3087z.m23462j()));
        viewGroup4.setMinimumHeight(m7131a.zzc);
        ac6 ac6Var3 = this.f34934a;
        viewGroup5 = ac6Var3.f3079r;
        m7131a2 = vi6.m7131a(ac6Var3.f3078q, Collections.singletonList(ac6Var3.f3087z.m23462j()));
        viewGroup5.setMinimumWidth(m7131a2.zzf);
        ac6 ac6Var4 = this.f34934a;
        dd6Var = ac6Var4.f3083v;
        dd6Var.m24520k(new vi4(ei4Var, ac6Var4));
        ei4Var.mo2131b();
    }

    @Override // com.daaw.pz5
    public final void zza() {
        this.f34934a.f3087z = null;
    }
}
