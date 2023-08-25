package com.daaw;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
/* loaded from: classes.dex */
public final class r25 extends rc3 {

    /* renamed from: p */
    public final j35 f24786p;

    /* renamed from: q */
    public yd0 f24787q;

    public r25(j35 j35Var) {
        this.f24786p = j35Var;
    }

    /* renamed from: g3 */
    public static float m11830g3(yd0 yd0Var) {
        Drawable drawable;
        if (yd0Var == null || (drawable = (Drawable) nt0.m14831M(yd0Var)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.daaw.sc3
    /* renamed from: p0 */
    public final void mo10457p0(ge3 ge3Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10447I5)).booleanValue() && (this.f24786p.m19138R() instanceof z74)) {
            ((z74) this.f24786p.m19138R()).m2688l3(ge3Var);
        }
    }

    @Override // com.daaw.sc3
    public final float zze() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10437H5)).booleanValue()) {
            if (this.f24786p.m19146J() != 0.0f) {
                return this.f24786p.m19146J();
            }
            if (this.f24786p.m19138R() != null) {
                try {
                    return this.f24786p.m19138R().zze();
                } catch (RemoteException e) {
                    k04.zzh("Remote exception getting video controller aspect ratio.", e);
                    return 0.0f;
                }
            }
            yd0 yd0Var = this.f24787q;
            if (yd0Var != null) {
                return m11830g3(yd0Var);
            }
            vc3 m19135U = this.f24786p.m19135U();
            if (m19135U == null) {
                return 0.0f;
            }
            float zzd = (m19135U.zzd() == -1 || m19135U.zzc() == -1) ? 0.0f : m19135U.zzd() / m19135U.zzc();
            return zzd == 0.0f ? m11830g3(m19135U.zzf()) : zzd;
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final float zzf() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10447I5)).booleanValue() && this.f24786p.m19138R() != null) {
            return this.f24786p.m19138R().zzf();
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final float zzg() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10447I5)).booleanValue() && this.f24786p.m19138R() != null) {
            return this.f24786p.m19138R().zzg();
        }
        return 0.0f;
    }

    @Override // com.daaw.sc3
    public final zzdq zzh() {
        if (((Boolean) zzba.zzc().m23658b(g93.f10447I5)).booleanValue()) {
            return this.f24786p.m19138R();
        }
        return null;
    }

    @Override // com.daaw.sc3
    public final yd0 zzi() {
        yd0 yd0Var = this.f24787q;
        if (yd0Var != null) {
            return yd0Var;
        }
        vc3 m19135U = this.f24786p.m19135U();
        if (m19135U == null) {
            return null;
        }
        return m19135U.zzf();
    }

    @Override // com.daaw.sc3
    public final void zzj(yd0 yd0Var) {
        this.f24787q = yd0Var;
    }

    @Override // com.daaw.sc3
    public final boolean zzk() {
        return ((Boolean) zzba.zzc().m23658b(g93.f10447I5)).booleanValue() && this.f24786p.m19138R() != null;
    }
}
