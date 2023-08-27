package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzacq implements zzacm<zzaqw> {
    private final Context mContext;
    private String zzaae;
    private final zzci zzbjc;
    private final com.google.android.gms.ads.internal.zzbc zzcbc;
    private zzanz<zzaqw> zzcbm;
    private final com.google.android.gms.ads.internal.gmsg.zzab zzcbn;
    private final zzpe zzcbo;
    private final zzang zzzw;

    public zzacq(Context context, com.google.android.gms.ads.internal.zzbc zzbcVar, String str, zzci zzciVar, zzang zzangVar) {
        zzakb.zzdj("Webview loading for native ads.");
        this.mContext = context;
        this.zzcbc = zzbcVar;
        this.zzbjc = zzciVar;
        this.zzzw = zzangVar;
        this.zzaae = str;
        com.google.android.gms.ads.internal.zzbv.zzel();
        zzanz<zzaqw> zza = zzarc.zza(this.mContext, this.zzzw, (String) zzkb.zzik().zzd(zznk.zzbbp), this.zzbjc, this.zzcbc.zzbi());
        this.zzcbn = new com.google.android.gms.ads.internal.gmsg.zzab(this.mContext);
        this.zzcbo = new zzpe(zzbcVar, str);
        zzanz<zzaqw> zza2 = zzano.zza(zza, new zzanj(this) { // from class: com.google.android.gms.internal.ads.zzacr
            private final zzacq zzcbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcbp = this;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                return this.zzcbp.zzh((zzaqw) obj);
            }
        }, zzaoe.zzcvz);
        this.zzcbm = zza2;
        zzanm.zza(zza2, "WebViewNativeAdsUtil.constructor");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zza(JSONObject jSONObject, zzaqw zzaqwVar) throws Exception {
        jSONObject.put("ads_id", this.zzaae);
        zzaqwVar.zzb("google.afma.nativeAds.handleDownloadedImpressionPing", jSONObject);
        return zzano.zzi(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zza(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        zzano.zza(this.zzcbm, new zzacx(this, str, zzvVar), zzaoe.zzcvy);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zza(String str, JSONObject jSONObject) {
        zzano.zza(this.zzcbm, new zzacz(this, str, jSONObject), zzaoe.zzcvy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zzb(JSONObject jSONObject, zzaqw zzaqwVar) throws Exception {
        jSONObject.put("ads_id", this.zzaae);
        zzaqwVar.zzb("google.afma.nativeAds.handleImpressionPing", jSONObject);
        return zzano.zzi(new JSONObject());
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzb(String str, com.google.android.gms.ads.internal.gmsg.zzv<? super zzaqw> zzvVar) {
        zzano.zza(this.zzcbm, new zzacy(this, str, zzvVar), zzaoe.zzcvy);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zzc(JSONObject jSONObject, zzaqw zzaqwVar) throws Exception {
        jSONObject.put("ads_id", this.zzaae);
        zzaqwVar.zzb("google.afma.nativeAds.handleClickGmsg", jSONObject);
        return zzano.zzi(new JSONObject());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zzd(JSONObject jSONObject, zzaqw zzaqwVar) throws Exception {
        jSONObject.put("ads_id", this.zzaae);
        zzaoj zzaojVar = new zzaoj();
        zzaqwVar.zza("/nativeAdPreProcess", new zzacw(this, zzaqwVar, zzaojVar));
        zzaqwVar.zzb("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
        return zzaojVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zzh(zzaqw zzaqwVar) throws Exception {
        zzakb.zzdj("Javascript has loaded for native ads.");
        zzasc zzuf = zzaqwVar.zzuf();
        com.google.android.gms.ads.internal.zzbc zzbcVar = this.zzcbc;
        zzuf.zza(zzbcVar, zzbcVar, zzbcVar, zzbcVar, zzbcVar, false, null, new com.google.android.gms.ads.internal.zzx(this.mContext, null, null), null, null);
        zzaqwVar.zza("/logScionEvent", this.zzcbn);
        zzaqwVar.zza("/logScionEvent", this.zzcbo);
        return zzano.zzi(zzaqwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzanz<JSONObject> zzh(final JSONObject jSONObject) {
        return zzano.zza(this.zzcbm, new zzanj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzacs
            private final JSONObject zzcbg;
            private final zzacq zzcbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcbp = this;
                this.zzcbg = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                return this.zzcbp.zzd(this.zzcbg, (zzaqw) obj);
            }
        }, zzaoe.zzcvy);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzanz<JSONObject> zzi(final JSONObject jSONObject) {
        return zzano.zza(this.zzcbm, new zzanj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzact
            private final JSONObject zzcbg;
            private final zzacq zzcbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcbp = this;
                this.zzcbg = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                return this.zzcbp.zzc(this.zzcbg, (zzaqw) obj);
            }
        }, zzaoe.zzcvy);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzanz<JSONObject> zzj(final JSONObject jSONObject) {
        return zzano.zza(this.zzcbm, new zzanj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzacu
            private final JSONObject zzcbg;
            private final zzacq zzcbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcbp = this;
                this.zzcbg = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                return this.zzcbp.zzb(this.zzcbg, (zzaqw) obj);
            }
        }, zzaoe.zzcvy);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final zzanz<JSONObject> zzk(final JSONObject jSONObject) {
        return zzano.zza(this.zzcbm, new zzanj(this, jSONObject) { // from class: com.google.android.gms.internal.ads.zzacv
            private final JSONObject zzcbg;
            private final zzacq zzcbp;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcbp = this;
                this.zzcbg = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzanj
            public final zzanz zzc(Object obj) {
                return this.zzcbp.zza(this.zzcbg, (zzaqw) obj);
            }
        }, zzaoe.zzcvy);
    }

    @Override // com.google.android.gms.internal.ads.zzacm
    public final void zzmc() {
        zzano.zza(this.zzcbm, new zzada(this), zzaoe.zzcvy);
    }
}
