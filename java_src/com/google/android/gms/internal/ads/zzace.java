package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzace {
    private final Context mContext;
    private final Object mLock = new Object();
    private int zzadx = -1;
    private int zzady = -1;
    private zzamj zzadz = new zzamj(200);
    private final DisplayMetrics zzagj;
    private final zzci zzbjc;
    private final zzaji zzbze;
    private final com.google.android.gms.ads.internal.zzbc zzcbc;
    private ViewTreeObserver.OnGlobalLayoutListener zzcbd;
    private ViewTreeObserver.OnScrollChangedListener zzcbe;
    private final zznx zzvr;

    public zzace(Context context, zzci zzciVar, zzaji zzajiVar, zznx zznxVar, com.google.android.gms.ads.internal.zzbc zzbcVar) {
        this.mContext = context;
        this.zzbjc = zzciVar;
        this.zzbze = zzajiVar;
        this.zzvr = zznxVar;
        this.zzcbc = zzbcVar;
        com.google.android.gms.ads.internal.zzbv.zzek();
        this.zzagj = zzakk.zza((WindowManager) context.getSystemService("window"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(WeakReference<zzaqw> weakReference, boolean z) {
        zzaqw zzaqwVar;
        if (weakReference == null || (zzaqwVar = weakReference.get()) == null || zzaqwVar.getView() == null) {
            return;
        }
        if (!z || this.zzadz.tryAcquire()) {
            int[] iArr = new int[2];
            zzaqwVar.getView().getLocationOnScreen(iArr);
            zzkb.zzif();
            int zzb = zzamu.zzb(this.zzagj, iArr[0]);
            zzkb.zzif();
            int zzb2 = zzamu.zzb(this.zzagj, iArr[1]);
            synchronized (this.mLock) {
                if (this.zzadx != zzb || this.zzady != zzb2) {
                    this.zzadx = zzb;
                    this.zzady = zzb2;
                    zzaqwVar.zzuf().zza(this.zzadx, this.zzady, z ? false : true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzaoj zzaojVar, zzaqw zzaqwVar, boolean z) {
        this.zzcbc.zzdw();
        zzaojVar.set(zzaqwVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final JSONObject jSONObject, final zzaoj zzaojVar) {
        try {
            com.google.android.gms.ads.internal.zzbv.zzel();
            final zzaqw zza = zzarc.zza(this.mContext, zzasi.zzvq(), "native-video", false, false, this.zzbjc, this.zzbze.zzcgs.zzacr, this.zzvr, null, this.zzcbc.zzbi(), this.zzbze.zzcoq);
            zza.zza(zzasi.zzvr());
            this.zzcbc.zzf(zza);
            WeakReference weakReference = new WeakReference(zza);
            zzasc zzuf = zza.zzuf();
            if (this.zzcbd == null) {
                this.zzcbd = new zzack(this, weakReference);
            }
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzcbd;
            if (this.zzcbe == null) {
                this.zzcbe = new zzacl(this, weakReference);
            }
            zzuf.zza(onGlobalLayoutListener, this.zzcbe);
            zza.zza("/video", com.google.android.gms.ads.internal.gmsg.zzf.zzblz);
            zza.zza("/videoMeta", com.google.android.gms.ads.internal.gmsg.zzf.zzbma);
            zza.zza("/precache", new zzaql());
            zza.zza("/delayPageLoaded", com.google.android.gms.ads.internal.gmsg.zzf.zzbmd);
            zza.zza("/instrument", com.google.android.gms.ads.internal.gmsg.zzf.zzbmb);
            zza.zza("/log", com.google.android.gms.ads.internal.gmsg.zzf.zzblu);
            zza.zza("/videoClicked", com.google.android.gms.ads.internal.gmsg.zzf.zzblv);
            zza.zza("/trackActiveViewUnit", new zzaci(this));
            zza.zza("/untrackActiveViewUnit", new zzacj(this));
            zza.zzuf().zza(new zzase(zza, jSONObject) { // from class: com.google.android.gms.internal.ads.zzacg
                private final JSONObject zzcbg;
                private final zzaqw zzcbh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcbh = zza;
                    this.zzcbg = jSONObject;
                }

                @Override // com.google.android.gms.internal.ads.zzase
                public final void zzly() {
                    this.zzcbh.zzb("google.afma.nativeAds.renderVideo", this.zzcbg);
                }
            });
            zza.zzuf().zza(new zzasd(this, zzaojVar, zza) { // from class: com.google.android.gms.internal.ads.zzach
                private final zzaoj zzcag;
                private final zzace zzcbf;
                private final zzaqw zzzp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcbf = this;
                    this.zzcag = zzaojVar;
                    this.zzzp = zza;
                }

                @Override // com.google.android.gms.internal.ads.zzasd
                public final void zze(boolean z) {
                    this.zzcbf.zza(this.zzcag, this.zzzp, z);
                }
            });
            zza.loadUrl((String) zzkb.zzik().zzd(zznk.zzbbs));
        } catch (Exception e) {
            zzakb.zzc("Exception occurred while getting video view", e);
            zzaojVar.set(null);
        }
    }
}
