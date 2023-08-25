package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccy;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class qh6 extends ev3 {

    /* renamed from: p */
    public final dh6 f23960p;

    /* renamed from: q */
    public final tg6 f23961q;

    /* renamed from: r */
    public final gi6 f23962r;
    @GuardedBy("this")

    /* renamed from: s */
    public j95 f23963s;
    @GuardedBy("this")

    /* renamed from: t */
    public boolean f23964t = false;

    public qh6(dh6 dh6Var, tg6 tg6Var, gi6 gi6Var) {
        this.f23960p = dh6Var;
        this.f23961q = tg6Var;
        this.f23962r = gi6Var;
    }

    @Override // com.daaw.fv3
    /* renamed from: B2 */
    public final void mo12529B2(zzby zzbyVar) {
        ry0.m10835e("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.f23961q.m9171l(null);
        } else {
            this.f23961q.m9171l(new ph6(this, zzbyVar));
        }
    }

    @Override // com.daaw.fv3
    /* renamed from: C0 */
    public final synchronized void mo12528C0(boolean z) {
        ry0.m10835e("setImmersiveMode must be called on the main UI thread.");
        this.f23964t = z;
    }

    @Override // com.daaw.fv3
    /* renamed from: G */
    public final synchronized void mo12527G(yd0 yd0Var) {
        ry0.m10835e("destroy must be called on the main UI thread.");
        Context context = null;
        this.f23961q.m9171l(null);
        if (this.f23963s != null) {
            if (yd0Var != null) {
                context = (Context) nt0.m14831M(yd0Var);
            }
            this.f23963s.m2129d().m14853C0(context);
        }
    }

    @Override // com.daaw.fv3
    /* renamed from: H1 */
    public final void mo12526H1(dv3 dv3Var) {
        ry0.m10835e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f23961q.m9174W(dv3Var);
    }

    @Override // com.daaw.fv3
    /* renamed from: h1 */
    public final synchronized void mo12524h1(yd0 yd0Var) {
        ry0.m10835e("resume must be called on the main UI thread.");
        if (this.f23963s != null) {
            this.f23963s.m2129d().m14851E0(yd0Var == null ? null : (Context) nt0.m14831M(yd0Var));
        }
    }

    @Override // com.daaw.fv3
    /* renamed from: j2 */
    public final void mo12521j2(iv3 iv3Var) {
        ry0.m10835e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f23961q.m9175S(iv3Var);
    }

    /* renamed from: j3 */
    public final synchronized boolean m12520j3() {
        boolean z;
        j95 j95Var = this.f23963s;
        if (j95Var != null) {
            z = j95Var.m18705k() ? false : true;
        }
        return z;
    }

    @Override // com.daaw.fv3
    /* renamed from: o1 */
    public final synchronized void mo12519o1(String str) {
        ry0.m10835e("#008 Must be called on the main UI thread.: setCustomData");
        this.f23962r.f11332b = str;
    }

    @Override // com.daaw.fv3
    /* renamed from: q */
    public final synchronized void mo12518q(yd0 yd0Var) {
        ry0.m10835e("showAd must be called on the main UI thread.");
        if (this.f23963s != null) {
            Activity activity = null;
            if (yd0Var != null) {
                Object m14831M = nt0.m14831M(yd0Var);
                if (m14831M instanceof Activity) {
                    activity = (Activity) m14831M;
                }
            }
            this.f23963s.m18702n(this.f23964t, activity);
        }
    }

    @Override // com.daaw.fv3
    /* renamed from: r */
    public final synchronized void mo12517r(String str) {
        ry0.m10835e("setUserId must be called on the main UI thread.");
        this.f23962r.f11331a = str;
    }

    @Override // com.daaw.fv3
    /* renamed from: r0 */
    public final synchronized void mo12516r0(zzccy zzccyVar) {
        ry0.m10835e("loadAd must be called on the main UI thread.");
        String str = zzccyVar.f36976q;
        String str2 = (String) zzba.zzc().m23658b(g93.f10526Q4);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                zzt.zzo().m11902u(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (m12520j3()) {
            if (!((Boolean) zzba.zzc().m23658b(g93.f10546S4)).booleanValue()) {
                return;
            }
        }
        vg6 vg6Var = new vg6(null);
        this.f23963s = null;
        this.f23960p.m24380i(1);
        this.f23960p.mo4385a(zzccyVar.f36975p, zzccyVar.f36976q, vg6Var, new oh6(this));
    }

    @Override // com.daaw.fv3
    public final Bundle zzb() {
        ry0.m10835e("getAdMetadata can only be called from the UI thread.");
        j95 j95Var = this.f23963s;
        return j95Var != null ? j95Var.m18708h() : new Bundle();
    }

    @Override // com.daaw.fv3
    public final synchronized zzdn zzc() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10716i6)).booleanValue()) {
            j95 j95Var = this.f23963s;
            if (j95Var != null) {
                return j95Var.m2130c();
            }
            return null;
        }
        return null;
    }

    @Override // com.daaw.fv3
    public final synchronized String zzd() {
        j95 j95Var = this.f23963s;
        if (j95Var == null || j95Var.m2130c() == null) {
            return null;
        }
        return j95Var.m2130c().zzg();
    }

    @Override // com.daaw.fv3
    public final void zze() {
        mo12527G(null);
    }

    @Override // com.daaw.fv3
    public final void zzh() {
        zzi(null);
    }

    @Override // com.daaw.fv3
    public final synchronized void zzi(yd0 yd0Var) {
        ry0.m10835e("pause must be called on the main UI thread.");
        if (this.f23963s != null) {
            this.f23963s.m2129d().m14852D0(yd0Var == null ? null : (Context) nt0.m14831M(yd0Var));
        }
    }

    @Override // com.daaw.fv3
    public final void zzj() {
        mo12524h1(null);
    }

    @Override // com.daaw.fv3
    public final synchronized void zzq() {
        mo12518q(null);
    }

    @Override // com.daaw.fv3
    public final boolean zzs() {
        ry0.m10835e("isLoaded must be called on the main UI thread.");
        return m12520j3();
    }

    @Override // com.daaw.fv3
    public final boolean zzt() {
        j95 j95Var = this.f23963s;
        return j95Var != null && j95Var.m18703m();
    }
}
