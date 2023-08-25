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

    /* renamed from: p */
    public final Context f17403p;

    /* renamed from: q */
    public final zzchu f17404q;

    /* renamed from: r */
    public dh5 f17405r;

    /* renamed from: s */
    public a74 f17406s;

    /* renamed from: t */
    public boolean f17407t;

    /* renamed from: u */
    public boolean f17408u;

    /* renamed from: v */
    public long f17409v;

    /* renamed from: w */
    public zzda f17410w;

    /* renamed from: x */
    public boolean f17411x;

    public lh5(Context context, zzchu zzchuVar) {
        this.f17403p = context;
        this.f17404q = zzchuVar;
    }

    /* renamed from: a */
    public final Activity m16953a() {
        a74 a74Var = this.f17406s;
        if (a74Var == null || a74Var.mo6407o0()) {
            return null;
        }
        return this.f17406s.zzk();
    }

    /* renamed from: b */
    public final void m16952b(dh5 dh5Var) {
        this.f17405r = dh5Var;
    }

    /* renamed from: c */
    public final /* synthetic */ void m16951c(String str) {
        JSONObject m24406e = this.f17405r.m24406e();
        if (!TextUtils.isEmpty(str)) {
            try {
                m24406e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f17406s.mo6049c("window.inspectorInfo", m24406e.toString());
    }

    /* renamed from: d */
    public final synchronized void m16950d(zzda zzdaVar, rh3 rh3Var, kh3 kh3Var) {
        if (m16948f(zzdaVar)) {
            try {
                zzt.zzz();
                a74 m13613a = p74.m13613a(this.f17403p, v84.m7337a(), "", false, false, null, null, this.f17404q, null, null, null, x33.m5591a(), null, null);
                this.f17406s = m13613a;
                t84 zzP = m13613a.zzP();
                if (zzP == null) {
                    k04.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzdaVar.zze(tj6.m9071d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.f17410w = zzdaVar;
                zzP.mo9452J(null, null, null, null, null, false, null, null, null, null, null, null, null, null, rh3Var, null, new qh3(this.f17403p), kh3Var);
                zzP.mo9454E(this);
                this.f17406s.loadUrl((String) zzba.zzc().m23658b(g93.f10609Y7));
                zzt.zzi();
                zzm.zza(this.f17403p, new AdOverlayInfoParcel(this, this.f17406s, 1, this.f17404q), true);
                this.f17409v = zzt.zzB().mo15860a();
            } catch (l74 e) {
                k04.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzdaVar.zze(tj6.m9071d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m16949e(final String str) {
        if (this.f17407t && this.f17408u) {
            z04.f34309e.execute(new Runnable() { // from class: com.daaw.kh5
                @Override // java.lang.Runnable
                public final void run() {
                    lh5.this.m16951c(str);
                }
            });
        }
    }

    /* renamed from: f */
    public final synchronized boolean m16948f(zzda zzdaVar) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10599X7)).booleanValue()) {
            k04.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(tj6.m9071d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.f17405r == null) {
            k04.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(tj6.m9071d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.f17407t && !this.f17408u) {
                if (zzt.zzB().mo15860a() >= this.f17409v + ((Integer) zzba.zzc().m23658b(g93.f10630a8)).intValue()) {
                    return true;
                }
            }
            k04.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdaVar.zze(tj6.m9071d(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.daaw.o84
    public final synchronized void zza(boolean z) {
        if (z) {
            zze.zza("Ad inspector loaded.");
            this.f17407t = true;
            m16949e("");
            return;
        }
        k04.zzj("Ad inspector failed to load.");
        try {
            zzda zzdaVar = this.f17410w;
            if (zzdaVar != null) {
                zzdaVar.zze(tj6.m9071d(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.f17411x = true;
        this.f17406s.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.f17408u = true;
        m16949e("");
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
        this.f17406s.destroy();
        if (!this.f17411x) {
            zze.zza("Inspector closed.");
            zzda zzdaVar = this.f17410w;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f17408u = false;
        this.f17407t = false;
        this.f17409v = 0L;
        this.f17411x = false;
        this.f17410w = null;
    }
}
