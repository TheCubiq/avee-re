package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class lh5 implements zzo, o84 {
    public final Context p;
    public final zzchu q;
    public dh5 r;
    public a74 s;
    public boolean t;
    public boolean u;
    public long v;
    public zzda w;
    public boolean x;

    public lh5(Context context, zzchu zzchuVar) {
        this.p = context;
        this.q = zzchuVar;
    }

    public final Activity a() {
        a74 a74Var = this.s;
        if (a74Var == null || a74Var.o0()) {
            return null;
        }
        return this.s.zzk();
    }

    public final void b(dh5 dh5Var) {
        this.r = dh5Var;
    }

    public final /* synthetic */ void c(String str) {
        JSONObject e = this.r.e();
        if (!TextUtils.isEmpty(str)) {
            try {
                e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.s.c("window.inspectorInfo", e.toString());
    }

    public final synchronized void d(zzda zzdaVar, rh3 rh3Var, kh3 kh3Var) {
        if (f(zzdaVar)) {
            try {
                zzt.zzz();
                a74 a = p74.a(this.p, v84.a(), "", false, false, null, null, this.q, null, null, null, x33.a(), null, null);
                this.s = a;
                t84 zzP = a.zzP();
                if (zzP == null) {
                    k04.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzdaVar.zze(tj6.d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.w = zzdaVar;
                zzP.J(null, null, null, null, null, false, null, null, null, null, null, null, null, null, rh3Var, null, new qh3(this.p), kh3Var);
                zzP.E(this);
                this.s.loadUrl((String) zzba.zzc().b(g93.Y7));
                zzt.zzi();
                zzm.zza(this.p, new AdOverlayInfoParcel(this, this.s, 1, this.q), true);
                this.v = zzt.zzB().a();
            } catch (l74 e) {
                k04.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzdaVar.zze(tj6.d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    public final synchronized void e(final String str) {
        if (this.t && this.u) {
            z04.e.execute(new Runnable() { // from class: com.daaw.kh5
                @Override // java.lang.Runnable
                public final void run() {
                    lh5.this.c(str);
                }
            });
        }
    }

    public final synchronized boolean f(zzda zzdaVar) {
        if (!((Boolean) zzba.zzc().b(g93.X7)).booleanValue()) {
            k04.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(tj6.d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.r == null) {
            k04.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(tj6.d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.t && !this.u) {
                if (zzt.zzB().a() >= this.v + ((Integer) zzba.zzc().b(g93.a8)).intValue()) {
                    return true;
                }
            }
            k04.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdaVar.zze(tj6.d(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.daaw.o84
    public final synchronized void zza(boolean z) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.t = true;
            e("");
            return;
        }
        k04.zzj("Ad inspector failed to load.");
        try {
            zzda zzdaVar = this.w;
            if (zzdaVar != null) {
                zzdaVar.zze(tj6.d(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.x = true;
        this.s.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.u = true;
        e("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbM() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        this.s.destroy();
        if (!this.x) {
            zze.zza("Inspector closed.");
            zzda zzdaVar = this.w;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.u = false;
        this.t = false;
        this.v = 0L;
        this.x = false;
        this.w = null;
    }
}
