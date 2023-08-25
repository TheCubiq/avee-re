package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcdy;
import com.google.android.gms.internal.ads.zzchu;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class kh6 extends vv3 {

    /* renamed from: p */
    public final dh6 f16379p;

    /* renamed from: q */
    public final tg6 f16380q;

    /* renamed from: r */
    public final String f16381r;

    /* renamed from: s */
    public final gi6 f16382s;

    /* renamed from: t */
    public final Context f16383t;

    /* renamed from: u */
    public final zzchu f16384u;
    @GuardedBy("this")

    /* renamed from: v */
    public j95 f16385v;
    @GuardedBy("this")

    /* renamed from: w */
    public boolean f16386w = ((Boolean) zzba.zzc().m23658b(g93.f10360A0)).booleanValue();

    public kh6(String str, dh6 dh6Var, Context context, tg6 tg6Var, gi6 gi6Var, zzchu zzchuVar) {
        this.f16381r = str;
        this.f16379p = dh6Var;
        this.f16380q = tg6Var;
        this.f16382s = gi6Var;
        this.f16383t = context;
        this.f16384u = zzchuVar;
    }

    /* renamed from: j3 */
    public final synchronized void m17742j3(zzl zzlVar, dw3 dw3Var, int i) {
        boolean z = false;
        if (((Boolean) ya3.f33460l.m16137e()).booleanValue()) {
            if (((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue()) {
                z = true;
            }
        }
        if (this.f16384u.f36995r < ((Integer) zzba.zzc().m23658b(g93.f10785o9)).intValue() || !z) {
            ry0.m10835e("#008 Must be called on the main UI thread.");
        }
        this.f16380q.m9176M(dw3Var);
        zzt.zzp();
        if (zzs.zzD(this.f16383t) && zzlVar.zzs == null) {
            k04.zzg("Failed to load the ad because app ID is missing.");
            this.f16380q.mo2194b(tj6.m9071d(4, null, null));
            return;
        }
        if (this.f16385v != null) {
            return;
        }
        vg6 vg6Var = new vg6(null);
        this.f16379p.m24380i(i);
        this.f16379p.mo4385a(zzlVar, this.f16381r, vg6Var, new jh6(this));
    }

    @Override // com.daaw.wv3
    public final Bundle zzb() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.f16385v;
        return j95Var != null ? j95Var.m18708h() : new Bundle();
    }

    @Override // com.daaw.wv3
    public final zzdn zzc() {
        j95 j95Var;
        if (((Boolean) zzba.zzc().m23658b(g93.f10716i6)).booleanValue() && (j95Var = this.f16385v) != null) {
            return j95Var.m2130c();
        }
        return null;
    }

    @Override // com.daaw.wv3
    public final tv3 zzd() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.f16385v;
        if (j95Var != null) {
            return j95Var.m18707i();
        }
        return null;
    }

    @Override // com.daaw.wv3
    public final synchronized String zze() {
        j95 j95Var = this.f16385v;
        if (j95Var == null || j95Var.m2130c() == null) {
            return null;
        }
        return j95Var.m2130c().zzg();
    }

    @Override // com.daaw.wv3
    public final synchronized void zzf(zzl zzlVar, dw3 dw3Var) {
        m17742j3(zzlVar, dw3Var, 2);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzg(zzl zzlVar, dw3 dw3Var) {
        m17742j3(zzlVar, dw3Var, 3);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzh(boolean z) {
        ry0.m10835e("setImmersiveMode must be called on the main UI thread.");
        this.f16386w = z;
    }

    @Override // com.daaw.wv3
    public final void zzi(zzdd zzddVar) {
        if (zzddVar == null) {
            this.f16380q.m9171l(null);
        } else {
            this.f16380q.m9171l(new ih6(this, zzddVar));
        }
    }

    @Override // com.daaw.wv3
    public final void zzj(zzdg zzdgVar) {
        ry0.m10835e("setOnPaidEventListener must be called on the main UI thread.");
        this.f16380q.m9170s(zzdgVar);
    }

    @Override // com.daaw.wv3
    public final void zzk(zv3 zv3Var) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        this.f16380q.m9177F(zv3Var);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzl(zzcdy zzcdyVar) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        gi6 gi6Var = this.f16382s;
        gi6Var.f11331a = zzcdyVar.f36979p;
        gi6Var.f11332b = zzcdyVar.f36980q;
    }

    @Override // com.daaw.wv3
    public final synchronized void zzm(yd0 yd0Var) {
        zzn(yd0Var, this.f16386w);
    }

    @Override // com.daaw.wv3
    public final synchronized void zzn(yd0 yd0Var, boolean z) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        if (this.f16385v == null) {
            k04.zzj("Rewarded can not be shown before loaded");
            this.f16380q.mo9178A(tj6.m9071d(9, null, null));
            return;
        }
        this.f16385v.m18702n(z, (Activity) nt0.m14831M(yd0Var));
    }

    @Override // com.daaw.wv3
    public final boolean zzo() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        j95 j95Var = this.f16385v;
        return (j95Var == null || j95Var.m18704l()) ? false : true;
    }

    @Override // com.daaw.wv3
    public final void zzp(ew3 ew3Var) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        this.f16380q.m9173d0(ew3Var);
    }
}
