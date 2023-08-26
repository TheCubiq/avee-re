package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.Window;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzaej;
import com.google.android.gms.internal.ads.zzafs;
import com.google.android.gms.internal.ads.zzago;
import com.google.android.gms.internal.ads.zzaig;
import com.google.android.gms.internal.ads.zzait;
import com.google.android.gms.internal.ads.zzaix;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzarc;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzasf;
import com.google.android.gms.internal.ads.zzasi;
import com.google.android.gms.internal.ads.zzfp;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzwx;
import com.google.android.gms.internal.ads.zzwy;
import com.google.android.gms.internal.ads.zzxn;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzal extends zzi implements com.google.android.gms.ads.internal.gmsg.zzai, com.google.android.gms.ads.internal.gmsg.zzz {
    private transient boolean zzyq;
    private int zzyr;
    private boolean zzys;
    private float zzyt;
    private boolean zzyu;
    private zzaix zzyv;
    private String zzyw;
    private final String zzyx;
    private final zzago zzyy;

    public zzal(Context context, zzjn zzjnVar, String str, zzxn zzxnVar, zzang zzangVar, zzw zzwVar) {
        super(context, zzjnVar, str, zzxnVar, zzangVar, zzwVar);
        this.zzyr = -1;
        boolean z = false;
        this.zzyq = false;
        if (zzjnVar != null && "reward_mb".equals(zzjnVar.zzarb)) {
            z = true;
        }
        this.zzyx = z ? "/Rewarded" : "/Interstitial";
        this.zzyy = z ? new zzago(this.zzvw, this.zzwh, new zzan(this), this, this) : null;
    }

    private static zzaji zzb(zzaji zzajiVar) {
        try {
            String jSONObject = zzafs.zzb(zzajiVar.zzcos).toString();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzajiVar.zzcgs.zzacp);
            zzwx zzwxVar = new zzwx(jSONObject, null, Collections.singletonList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject2.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L);
            zzaej zzaejVar = zzajiVar.zzcos;
            zzwy zzwyVar = new zzwy(Collections.singletonList(zzwxVar), ((Long) zzkb.zzik().zzd(zznk.zzbao)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), zzaejVar.zzbsr, zzaejVar.zzbss, "", -1L, 0, 1, null, 0, -1, -1L, false);
            return new zzaji(zzajiVar.zzcgs, new zzaej(zzajiVar.zzcgs, zzaejVar.zzbyq, zzaejVar.zzceo, Collections.emptyList(), Collections.emptyList(), zzaejVar.zzcep, true, zzaejVar.zzcer, Collections.emptyList(), zzaejVar.zzbsu, zzaejVar.orientation, zzaejVar.zzcet, zzaejVar.zzceu, zzaejVar.zzcev, zzaejVar.zzcew, zzaejVar.zzcex, null, zzaejVar.zzcez, zzaejVar.zzare, zzaejVar.zzcdd, zzaejVar.zzcfa, zzaejVar.zzcfb, zzaejVar.zzamj, zzaejVar.zzarf, zzaejVar.zzarg, null, Collections.emptyList(), Collections.emptyList(), zzaejVar.zzcfh, zzaejVar.zzcfi, zzaejVar.zzcdr, zzaejVar.zzcds, zzaejVar.zzbsr, zzaejVar.zzbss, zzaejVar.zzcfj, null, zzaejVar.zzcfl, zzaejVar.zzcfm, zzaejVar.zzced, zzaejVar.zzzl, 0, zzaejVar.zzcfp, Collections.emptyList(), zzaejVar.zzzm, zzaejVar.zzcfq), zzwyVar, zzajiVar.zzacv, zzajiVar.errorCode, zzajiVar.zzcoh, zzajiVar.zzcoi, null, zzajiVar.zzcoq, null);
        } catch (JSONException e) {
            zzakb.zzb("Unable to generate ad state for an interstitial ad with pooling.", e);
            return zzajiVar;
        }
    }

    private final void zzb(Bundle bundle) {
        zzbv.zzek().zzb(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, "gmob-apps", bundle, false);
    }

    private final boolean zzc(boolean z) {
        return this.zzyy != null && z;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzyu = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.ads.zzks
    public final void showInterstitial() {
        Bitmap bitmap;
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (zzc(this.zzvw.zzacw != null && this.zzvw.zzacw.zzceq)) {
            this.zzyy.zzw(this.zzyu);
            return;
        }
        if (zzbv.zzfh().zzv(this.zzvw.zzrt)) {
            String zzy = zzbv.zzfh().zzy(this.zzvw.zzrt);
            this.zzyw = zzy;
            String valueOf = String.valueOf(zzy);
            String valueOf2 = String.valueOf(this.zzyx);
            this.zzyw = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        if (this.zzvw.zzacw == null) {
            zzakb.zzdk("The interstitial has not loaded.");
            return;
        }
        if (((Boolean) zzkb.zzik().zzd(zznk.zzazx)).booleanValue()) {
            String packageName = (this.zzvw.zzrt.getApplicationContext() != null ? this.zzvw.zzrt.getApplicationContext() : this.zzvw.zzrt).getPackageName();
            if (!this.zzyq) {
                zzakb.zzdk("It is not recommended to show an interstitial before onAdLoaded completes.");
                Bundle bundle = new Bundle();
                bundle.putString("appid", packageName);
                bundle.putString("action", "show_interstitial_before_load_finish");
                zzb(bundle);
            }
            zzbv.zzek();
            if (!zzakk.zzaq(this.zzvw.zzrt)) {
                zzakb.zzdk("It is not recommended to show an interstitial when app is not in foreground.");
                Bundle bundle2 = new Bundle();
                bundle2.putString("appid", packageName);
                bundle2.putString("action", "show_interstitial_app_not_in_foreground");
                zzb(bundle2);
            }
        }
        if (this.zzvw.zzfp()) {
            return;
        }
        if (this.zzvw.zzacw.zzceq && this.zzvw.zzacw.zzbtx != null) {
            try {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzayr)).booleanValue()) {
                    this.zzvw.zzacw.zzbtx.setImmersiveMode(this.zzyu);
                }
                this.zzvw.zzacw.zzbtx.showInterstitial();
            } catch (RemoteException e) {
                zzakb.zzc("Could not show interstitial.", e);
                zzdj();
            }
        } else if (this.zzvw.zzacw.zzbyo == null) {
            zzakb.zzdk("The interstitial failed to load.");
        } else if (this.zzvw.zzacw.zzbyo.zzuj()) {
            zzakb.zzdk("The interstitial is already showing.");
        } else {
            this.zzvw.zzacw.zzbyo.zzai(true);
            this.zzvw.zzj(this.zzvw.zzacw.zzbyo.getView());
            if (this.zzvw.zzacw.zzcob != null) {
                this.zzvy.zza(this.zzvw.zzacv, this.zzvw.zzacw);
            }
            if (PlatformVersion.isAtLeastIceCreamSandwich()) {
                final zzajh zzajhVar = this.zzvw.zzacw;
                if (zzajhVar.zzfz()) {
                    new zzfp(this.zzvw.zzrt, zzajhVar.zzbyo.getView()).zza(zzajhVar.zzbyo);
                } else {
                    zzajhVar.zzbyo.zzuf().zza(new zzasf(this, zzajhVar) { // from class: com.google.android.gms.ads.internal.zzam
                        private final zzajh zzxk;
                        private final zzal zzyz;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzyz = this;
                            this.zzxk = zzajhVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzasf
                        public final void zzdb() {
                            zzal zzalVar = this.zzyz;
                            zzajh zzajhVar2 = this.zzxk;
                            new zzfp(zzalVar.zzvw.zzrt, zzajhVar2.zzbyo.getView()).zza(zzajhVar2.zzbyo);
                        }
                    });
                }
            }
            if (this.zzvw.zzze) {
                zzbv.zzek();
                bitmap = zzakk.zzar(this.zzvw.zzrt);
            } else {
                bitmap = null;
            }
            this.zzyr = zzbv.zzfe().zzb(bitmap);
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbg)).booleanValue() && bitmap != null) {
                new zzao(this, this.zzyr).zzqo();
                return;
            }
            zzaq zzaqVar = new zzaq(this.zzvw.zzze, zzdi(), false, 0.0f, -1, this.zzyu, this.zzvw.zzacw.zzzl, this.zzvw.zzacw.zzzm);
            int requestedOrientation = this.zzvw.zzacw.zzbyo.getRequestedOrientation();
            if (requestedOrientation == -1) {
                requestedOrientation = this.zzvw.zzacw.orientation;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzvw.zzacw.zzbyo, requestedOrientation, this.zzvw.zzacr, this.zzvw.zzacw.zzcev, zzaqVar);
            zzbv.zzei();
            com.google.android.gms.ads.internal.overlay.zzl.zza(this.zzvw.zzrt, adOverlayInfoParcel, true);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzi
    protected final zzaqw zza(zzaji zzajiVar, zzx zzxVar, zzait zzaitVar) throws zzarg {
        zzbv.zzel();
        zzaqw zza = zzarc.zza(this.zzvw.zzrt, zzasi.zzb(this.zzvw.zzacv), this.zzvw.zzacv.zzarb, false, false, this.zzvw.zzacq, this.zzvw.zzacr, this.zzvr, this, this.zzwc, zzajiVar.zzcoq);
        zza.zzuf().zza(this, this, null, this, this, ((Boolean) zzkb.zzik().zzd(zznk.zzaxe)).booleanValue(), this, zzxVar, this, zzaitVar);
        zza(zza);
        zza.zzdr(zzajiVar.zzcgs.zzcdi);
        zza.zza("/reward", new com.google.android.gms.ads.internal.gmsg.zzah(this));
        return zza;
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zza
    public final void zza(zzaji zzajiVar, zznx zznxVar) {
        if (zzajiVar.errorCode != -2) {
            super.zza(zzajiVar, zznxVar);
            return;
        }
        if (zzc(zzajiVar.zzcod != null)) {
            this.zzyy.zzou();
            return;
        }
        if (!((Boolean) zzkb.zzik().zzd(zznk.zzayy)).booleanValue()) {
            super.zza(zzajiVar, zznxVar);
            return;
        }
        boolean z = !zzajiVar.zzcos.zzceq;
        if (zza(zzajiVar.zzcgs.zzccv) && z) {
            this.zzvw.zzacx = zzb(zzajiVar);
        }
        super.zza(this.zzvw.zzacx, zznxVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzz
    public final void zza(boolean z, float f) {
        this.zzys = z;
        this.zzyt = f;
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        if (zzc(zzajhVar2.zzceq)) {
            return zzago.zza(zzajhVar, zzajhVar2);
        }
        if (super.zza(zzajhVar, zzajhVar2)) {
            if (!this.zzvw.zzfo() && this.zzvw.zzadu != null && zzajhVar2.zzcob != null) {
                this.zzvy.zza(this.zzvw.zzacv, zzajhVar2, this.zzvw.zzadu);
            }
            zzb(zzajhVar2, false);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.zzd
    protected final boolean zza(zzjj zzjjVar, zzajh zzajhVar, boolean z) {
        if (this.zzvw.zzfo() && zzajhVar.zzbyo != null) {
            zzbv.zzem();
            zzakq.zzi(zzajhVar.zzbyo);
        }
        return this.zzvv.zzdz();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzjj zzjjVar, zznx zznxVar) {
        if (this.zzvw.zzacw != null) {
            zzakb.zzdk("An interstitial is already loading. Aborting.");
            return false;
        }
        if (this.zzyv == null && zza(zzjjVar) && zzbv.zzfh().zzv(this.zzvw.zzrt) && !TextUtils.isEmpty(this.zzvw.zzacp)) {
            this.zzyv = new zzaix(this.zzvw.zzrt, this.zzvw.zzacp);
        }
        return super.zza(zzjjVar, zznxVar);
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzai
    public final void zzb(zzaig zzaigVar) {
        if (zzc(this.zzvw.zzacw != null && this.zzvw.zzacw.zzceq)) {
            zza(this.zzyy.zzd(zzaigVar));
            return;
        }
        if (this.zzvw.zzacw != null) {
            if (this.zzvw.zzacw.zzcfg != null) {
                zzbv.zzek();
                zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, this.zzvw.zzacw.zzcfg);
            }
            if (this.zzvw.zzacw.zzcfe != null) {
                zzaigVar = this.zzvw.zzacw.zzcfe;
            }
        }
        zza(zzaigVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public final void zzbn() {
        zzdj();
        super.zzbn();
    }

    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zza
    protected final void zzbq() {
        zzaqw zzaqwVar = this.zzvw.zzacw != null ? this.zzvw.zzacw.zzbyo : null;
        zzaji zzajiVar = this.zzvw.zzacx;
        if (zzajiVar != null && zzajiVar.zzcos != null && zzajiVar.zzcos.zzcfp && zzaqwVar != null && zzbv.zzfa().zzi(this.zzvw.zzrt)) {
            int i = this.zzvw.zzacr.zzcve;
            int i2 = this.zzvw.zzacr.zzcvf;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            this.zzwb = zzbv.zzfa().zza(sb.toString(), zzaqwVar.getWebView(), "", "javascript", zzbz());
            if (this.zzwb != null && zzaqwVar.getView() != null) {
                zzbv.zzfa().zza(this.zzwb, zzaqwVar.getView());
                zzbv.zzfa().zzm(this.zzwb);
            }
        }
        super.zzbq();
        this.zzyq = true;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcb() {
        super.zzcb();
        this.zzvy.zzh(this.zzvw.zzacw);
        zzaix zzaixVar = this.zzyv;
        if (zzaixVar != null) {
            zzaixVar.zzx(false);
        }
        zzby();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.overlay.zzn
    public final void zzcc() {
        zzasc zzuf;
        recordImpression();
        super.zzcc();
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzbyo != null && (zzuf = this.zzvw.zzacw.zzbyo.zzuf()) != null) {
            zzuf.zzuz();
        }
        if (zzbv.zzfh().zzv(this.zzvw.zzrt) && this.zzvw.zzacw != null && this.zzvw.zzacw.zzbyo != null) {
            zzbv.zzfh().zzd(this.zzvw.zzacw.zzbyo.getContext(), this.zzyw);
        }
        zzaix zzaixVar = this.zzyv;
        if (zzaixVar != null) {
            zzaixVar.zzx(true);
        }
        if (this.zzwb == null || this.zzvw.zzacw == null || this.zzvw.zzacw.zzbyo == null) {
            return;
        }
        this.zzvw.zzacw.zzbyo.zza("onSdkImpression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.zzaam
    public final void zzcz() {
        com.google.android.gms.ads.internal.overlay.zzd zzub = this.zzvw.zzacw.zzbyo.zzub();
        if (zzub != null) {
            zzub.close();
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzz
    public final void zzd(boolean z) {
        this.zzvw.zzze = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzdi() {
        Window window;
        if ((this.zzvw.zzrt instanceof Activity) && (window = ((Activity) this.zzvw.zzrt).getWindow()) != null && window.getDecorView() != null) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom != 0 && rect2.bottom != 0 && rect.top == rect2.top) {
                return true;
            }
        }
        return false;
    }

    public final void zzdj() {
        zzbv.zzfe().zzb(Integer.valueOf(this.zzyr));
        if (this.zzvw.zzfo()) {
            this.zzvw.zzfm();
            this.zzvw.zzacw = null;
            this.zzvw.zzze = false;
            this.zzyq = false;
        }
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzai
    public final void zzdk() {
        if (zzc(this.zzvw.zzacw != null && this.zzvw.zzacw.zzceq)) {
            this.zzyy.zzov();
            zzbt();
            return;
        }
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzcog != null) {
            zzbv.zzek();
            zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, this.zzvw.zzacw.zzcog);
        }
        zzbt();
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzai
    public final void zzdl() {
        if (zzc(this.zzvw.zzacw != null && this.zzvw.zzacw.zzceq)) {
            this.zzyy.zzow();
        }
        zzbu();
    }
}
