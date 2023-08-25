package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class r25 extends rc3 {
    public final j35 p;
    public yd0 q;

    public r25(j35 j35Var) {
        this.p = j35Var;
    }

    public static float g3(yd0 yd0Var) {
        Drawable drawable;
        if (yd0Var == null || (drawable = (Drawable) nt0.M(yd0Var)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.daaw.sc3
    public final void p0(ge3 ge3Var) {
        if (((Boolean) zzba.zzc().b(g93.I5)).booleanValue() && (this.p.R() instanceof z74)) {
            ((z74) this.p.R()).l3(ge3Var);
        }
    }

    @Override // com.daaw.sc3
    public final float zze() {
        if (((Boolean) zzba.zzc().b(g93.H5)).booleanValue()) {
            if (this.p.J() != 0.0f) {
                return this.p.J();
            }
            if (this.p.R() != null) {
                try {
                    return this.p.R().zze();
                } catch (RemoteException e) {
                    k04.zzh("Remote exception getting video controller aspect ratio.", e);
                    return 0.0f;
                }
            }
            yd0 yd0Var = this.q;
            if (yd0Var != null) {
                return g3(yd0Var);
            }
            vc3 U = this.p.U();
            if (U == null) {
                return 0.0f;
            }
            float zzd = (U.zzd() == -1 || U.zzc() == -1) ? 0.0f : U.zzd() / U.zzc();
            return zzd == 0.0f ? g3(U.zzf()) : zzd;
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final float zzf() {
        if (((Boolean) zzba.zzc().b(g93.I5)).booleanValue() && this.p.R() != null) {
            return this.p.R().zzf();
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final float zzg() {
        if (((Boolean) zzba.zzc().b(g93.I5)).booleanValue() && this.p.R() != null) {
            return this.p.R().zzg();
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final zzdq zzh() {
        if (((Boolean) zzba.zzc().b(g93.I5)).booleanValue()) {
            return this.p.R();
        }
        return null;
    }

    @Override // com.daaw.sc3
    public final yd0 zzi() {
        yd0 yd0Var = this.q;
        if (yd0Var != null) {
            return yd0Var;
        }
        vc3 U = this.p.U();
        if (U == null) {
            return null;
        }
        return U.zzf();
    }

    @Override // com.daaw.sc3
    public final void zzj(yd0 yd0Var) {
        this.q = yd0Var;
    }

    @Override // com.daaw.sc3
    public final boolean zzk() {
        return ((Boolean) zzba.zzc().b(g93.I5)).booleanValue() && this.p.R() != null;
    }
}
