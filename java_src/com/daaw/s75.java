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
    public View p;
    public zzdq q;
    public e35 r;
    public boolean s = false;
    public boolean t = false;

    public s75(e35 e35Var, j35 j35Var) {
        this.p = j35Var.N();
        this.q = j35Var.R();
        this.r = e35Var;
        if (j35Var.Z() != null) {
            j35Var.Z().q0(this);
        }
    }

    public static final void g3(pj3 pj3Var, int i) {
        try {
            pj3Var.zze(i);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.mj3
    public final void R(yd0 yd0Var, pj3 pj3Var) {
        ry0.e("#008 Must be called on the main UI thread.");
        if (this.s) {
            k04.zzg("Instream ad can not be shown after destroy().");
            g3(pj3Var, 2);
            return;
        }
        View view = this.p;
        if (view == null || this.q == null) {
            k04.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            g3(pj3Var, 0);
        } else if (this.t) {
            k04.zzg("Instream ad should not be used again.");
            g3(pj3Var, 1);
        } else {
            this.t = true;
            zzh();
            ((ViewGroup) nt0.M(yd0Var)).addView(this.p, new ViewGroup.LayoutParams(-1, -1));
            zzt.zzx();
            m14.a(this.p, this);
            zzt.zzx();
            m14.b(this.p, this);
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
        ry0.e("#008 Must be called on the main UI thread.");
        if (this.s) {
            k04.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.q;
    }

    @Override // com.daaw.mj3
    public final sc3 zzc() {
        ry0.e("#008 Must be called on the main UI thread.");
        if (this.s) {
            k04.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        e35 e35Var = this.r;
        if (e35Var == null || e35Var.I() == null) {
            return null;
        }
        return e35Var.I().a();
    }

    @Override // com.daaw.mj3
    public final void zzd() {
        ry0.e("#008 Must be called on the main UI thread.");
        zzh();
        e35 e35Var = this.r;
        if (e35Var != null) {
            e35Var.a();
        }
        this.r = null;
        this.p = null;
        this.q = null;
        this.s = true;
    }

    @Override // com.daaw.mj3
    public final void zze(yd0 yd0Var) {
        ry0.e("#008 Must be called on the main UI thread.");
        R(yd0Var, new r75(this));
    }

    public final void zzg() {
        View view;
        e35 e35Var = this.r;
        if (e35Var == null || (view = this.p) == null) {
            return;
        }
        e35Var.X(view, Collections.emptyMap(), Collections.emptyMap(), e35.A(this.p));
    }

    public final void zzh() {
        View view = this.p;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.p);
        }
    }
}
