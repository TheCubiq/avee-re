package com.daaw;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
/* loaded from: classes.dex */
public final class s75 extends lj3 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, cc3 {

    /* renamed from: p */
    public View f25962p;

    /* renamed from: q */
    public zzdq f25963q;

    /* renamed from: r */
    public e35 f25964r;

    /* renamed from: s */
    public boolean f25965s = false;

    /* renamed from: t */
    public boolean f25966t = false;

    public s75(e35 e35Var, j35 j35Var) {
        this.f25962p = j35Var.m19142N();
        this.f25963q = j35Var.m19138R();
        this.f25964r = e35Var;
        if (j35Var.m19130Z() != null) {
            j35Var.m19130Z().mo6403q0(this);
        }
    }

    /* renamed from: g3 */
    public static final void m10594g3(pj3 pj3Var, int i) {
        try {
            pj3Var.zze(i);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.mj3
    /* renamed from: R */
    public final void mo10595R(yd0 yd0Var, pj3 pj3Var) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        if (this.f25965s) {
            k04.zzg("Instream ad can not be shown after destroy().");
            m10594g3(pj3Var, 2);
            return;
        }
        View view = this.f25962p;
        if (view == null || this.f25963q == null) {
            k04.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            m10594g3(pj3Var, 0);
        } else if (this.f25966t) {
            k04.zzg("Instream ad should not be used again.");
            m10594g3(pj3Var, 1);
        } else {
            this.f25966t = true;
            zzh();
            ((ViewGroup) nt0.m14831M(yd0Var)).addView(this.f25962p, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            m14.m16299a(this.f25962p, this);
            zzt.zzx();
            m14.m16298b(this.f25962p, this);
            zzg();
            try {
                pj3Var.zzf();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.daaw.mj3
    public final zzdq zzb() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        if (this.f25965s) {
            k04.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.f25963q;
    }

    @Override // com.daaw.mj3
    public final sc3 zzc() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        if (this.f25965s) {
            k04.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        e35 e35Var = this.f25964r;
        if (e35Var == null || e35Var.m23770I() == null) {
            return null;
        }
        return e35Var.m23770I().m22051a();
    }

    @Override // com.daaw.mj3
    public final void zzd() {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        zzh();
        e35 e35Var = this.f25964r;
        if (e35Var != null) {
            e35Var.mo2132a();
        }
        this.f25964r = null;
        this.f25962p = null;
        this.f25963q = null;
        this.f25965s = true;
    }

    @Override // com.daaw.mj3
    public final void zze(yd0 yd0Var) {
        ry0.m10835e("#008 Must be called on the main UI thread.");
        mo10595R(yd0Var, new r75(this));
    }

    public final void zzg() {
        View view;
        e35 e35Var = this.f25964r;
        if (e35Var == null || (view = this.f25962p) == null) {
            return;
        }
        e35Var.m23755X(view, Collections.emptyMap(), Collections.emptyMap(), e35.m23778A(this.f25962p));
    }

    public final void zzh() {
        View view = this.f25962p;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f25962p);
        }
    }
}
