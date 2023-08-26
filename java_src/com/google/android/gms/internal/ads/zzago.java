package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
@zzadh
/* loaded from: classes2.dex */
public final class zzago {
    private static final zzxm zzcku = new zzxm();
    private final zzxn zzckv;
    private final com.google.android.gms.ads.internal.zzbw zzckw;
    private final Map<String, zzaib> zzckx = new HashMap();
    private final zzahu zzcky;
    private final com.google.android.gms.ads.internal.gmsg.zzb zzckz;
    private final zzabm zzcla;

    public zzago(com.google.android.gms.ads.internal.zzbw zzbwVar, zzxn zzxnVar, zzahu zzahuVar, com.google.android.gms.ads.internal.gmsg.zzb zzbVar, zzabm zzabmVar) {
        this.zzckw = zzbwVar;
        this.zzckv = zzxnVar;
        this.zzcky = zzahuVar;
        this.zzckz = zzbVar;
        this.zzcla = zzabmVar;
    }

    public static boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        return true;
    }

    public final void destroy() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        for (String str : this.zzckx.keySet()) {
            try {
                zzaib zzaibVar = this.zzckx.get(str);
                if (zzaibVar != null && zzaibVar.zzpe() != null) {
                    zzaibVar.zzpe().destroy();
                }
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final void onContextChanged(Context context) {
        for (zzaib zzaibVar : this.zzckx.values()) {
            try {
                zzaibVar.zzpe().zzi(ObjectWrapper.wrap(context));
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call Adapter.onContextChanged.", e);
            }
        }
    }

    public final void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        for (String str : this.zzckx.keySet()) {
            try {
                zzaib zzaibVar = this.zzckx.get(str);
                if (zzaibVar != null && zzaibVar.zzpe() != null) {
                    zzaibVar.zzpe().pause();
                }
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        for (String str : this.zzckx.keySet()) {
            try {
                zzaib zzaibVar = this.zzckx.get(str);
                if (zzaibVar != null && zzaibVar.zzpe() != null) {
                    zzaibVar.zzpe().resume();
                }
            } catch (RemoteException e) {
                zzakb.zzd("#007 Could not call remote method.", e);
            }
        }
    }

    public final zzaib zzca(String str) {
        zzaib zzaibVar;
        zzaib zzaibVar2 = this.zzckx.get(str);
        if (zzaibVar2 == null) {
            try {
                zzxn zzxnVar = this.zzckv;
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    zzxnVar = zzcku;
                }
                zzaibVar = new zzaib(zzxnVar.zzbm(str), this.zzcky);
            } catch (Exception e) {
                e = e;
            }
            try {
                this.zzckx.put(str, zzaibVar);
                return zzaibVar;
            } catch (Exception e2) {
                e = e2;
                zzaibVar2 = zzaibVar;
                String valueOf = String.valueOf(str);
                zzakb.zzc(valueOf.length() != 0 ? "Fail to instantiate adapter ".concat(valueOf) : new String("Fail to instantiate adapter "), e);
                return zzaibVar2;
            }
        }
        return zzaibVar2;
    }

    public final zzaig zzd(zzaig zzaigVar) {
        if (this.zzckw.zzacw != null && this.zzckw.zzacw.zzcod != null && !TextUtils.isEmpty(this.zzckw.zzacw.zzcod.zzbsv)) {
            zzaigVar = new zzaig(this.zzckw.zzacw.zzcod.zzbsv, this.zzckw.zzacw.zzcod.zzbsw);
        }
        if (this.zzckw.zzacw != null && this.zzckw.zzacw.zzbtw != null) {
            com.google.android.gms.ads.internal.zzbv.zzfd();
            zzxg.zza(this.zzckw.zzrt, this.zzckw.zzacr.zzcw, this.zzckw.zzacw.zzbtw.zzbsd, this.zzckw.zzadr, zzaigVar);
        }
        return zzaigVar;
    }

    public final com.google.android.gms.ads.internal.gmsg.zzb zzos() {
        return this.zzckz;
    }

    public final zzabm zzot() {
        return this.zzcla;
    }

    public final void zzou() {
        this.zzckw.zzadv = 0;
        com.google.android.gms.ads.internal.zzbw zzbwVar = this.zzckw;
        com.google.android.gms.ads.internal.zzbv.zzej();
        zzahx zzahxVar = new zzahx(this.zzckw.zzrt, this.zzckw.zzacx, this);
        String valueOf = String.valueOf(zzahxVar.getClass().getName());
        zzakb.zzck(valueOf.length() != 0 ? "AdRenderer: ".concat(valueOf) : new String("AdRenderer: "));
        zzahxVar.zznt();
        zzbwVar.zzacu = zzahxVar;
    }

    public final void zzov() {
        if (this.zzckw.zzacw == null || this.zzckw.zzacw.zzbtw == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzbv.zzfd();
        zzxg.zza(this.zzckw.zzrt, this.zzckw.zzacr.zzcw, this.zzckw.zzacw, this.zzckw.zzacp, false, this.zzckw.zzacw.zzbtw.zzbsc);
    }

    public final void zzow() {
        if (this.zzckw.zzacw == null || this.zzckw.zzacw.zzbtw == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzbv.zzfd();
        zzxg.zza(this.zzckw.zzrt, this.zzckw.zzacr.zzcw, this.zzckw.zzacw, this.zzckw.zzacp, false, this.zzckw.zzacw.zzbtw.zzbse);
    }

    public final void zzw(boolean z) {
        zzaib zzca = zzca(this.zzckw.zzacw.zzbty);
        if (zzca == null || zzca.zzpe() == null) {
            return;
        }
        try {
            zzca.zzpe().setImmersiveMode(z);
            zzca.zzpe().showVideo();
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
