package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzagr extends com.google.android.gms.ads.internal.zzd implements zzahu {
    private static zzagr zzcle;
    private boolean zzclf;
    private final zzago zzclg;
    private boolean zzyu;
    private final zzaix zzyv;

    public zzagr(Context context, com.google.android.gms.ads.internal.zzw zzwVar, zzjn zzjnVar, zzxn zzxnVar, zzang zzangVar) {
        super(context, zzjnVar, null, zzxnVar, zzangVar, zzwVar);
        zzcle = this;
        this.zzyv = new zzaix(context, null);
        this.zzclg = new zzago(this.zzvw, this.zzwh, this, this, this);
    }

    private static zzaji zzc(zzaji zzajiVar) {
        zzakb.v("Creating mediation ad response for non-mediated rewarded ad.");
        try {
            JSONObject zzb = zzafs.zzb(zzajiVar.zzcos);
            zzb.remove("impression_urls");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, zzajiVar.zzcgs.zzacp);
            return new zzaji(zzajiVar.zzcgs, zzajiVar.zzcos, new zzwy(Arrays.asList(new zzwx(zzb.toString(), null, Arrays.asList("com.google.ads.mediation.admob.AdMobAdapter"), null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), jSONObject.toString(), null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, null, null, null, Collections.emptyList(), null, -1L)), ((Long) zzkb.zzik().zzd(zznk.zzbao)).longValue(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), false, "", -1L, 0, 1, null, 0, -1, -1L, false), zzajiVar.zzacv, zzajiVar.errorCode, zzajiVar.zzcoh, zzajiVar.zzcoi, zzajiVar.zzcob, zzajiVar.zzcoq, null);
        } catch (JSONException e) {
            zzakb.zzb("Unable to generate ad state for non-mediated rewarded video.", e);
            return new zzaji(zzajiVar.zzcgs, zzajiVar.zzcos, null, zzajiVar.zzacv, 0, zzajiVar.zzcoh, zzajiVar.zzcoi, zzajiVar.zzcob, zzajiVar.zzcoq, null);
        }
    }

    public static zzagr zzox() {
        return zzcle;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void destroy() {
        this.zzclg.destroy();
        super.destroy();
    }

    public final boolean isLoaded() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.zzvw.zzact == null && this.zzvw.zzacu == null && this.zzvw.zzacw != null;
    }

    public final void onContextChanged(Context context) {
        this.zzclg.onContextChanged(context);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdClosed() {
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzw(this.zzvw.zzrt)) {
            this.zzyv.zzx(false);
        }
        zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdLeftApplication() {
        zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdOpened() {
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzw(this.zzvw.zzrt)) {
            this.zzyv.zzx(true);
        }
        zza(this.zzvw.zzacw, false);
        zzbp();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoCompleted() {
        this.zzclg.zzow();
        zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoStarted() {
        this.zzclg.zzov();
        zzbt();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void pause() {
        this.zzclg.pause();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void resume() {
        this.zzclg.resume();
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public final void setImmersiveMode(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzyu = z;
    }

    public final void zza(zzahk zzahkVar) {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (TextUtils.isEmpty(zzahkVar.zzacp)) {
            zzakb.zzdk("Invalid ad unit id. Aborting.");
            zzakk.zzcrm.post(new zzags(this));
            return;
        }
        this.zzclf = false;
        this.zzvw.zzacp = zzahkVar.zzacp;
        this.zzyv.setAdUnitId(zzahkVar.zzacp);
        super.zzb(zzahkVar.zzccv);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zza(zzaji zzajiVar, zznx zznxVar) {
        if (zzajiVar.errorCode != -2) {
            zzakk.zzcrm.post(new zzagt(this, zzajiVar));
            return;
        }
        this.zzvw.zzacx = zzajiVar;
        if (zzajiVar.zzcod == null) {
            this.zzvw.zzacx = zzc(zzajiVar);
        }
        this.zzclg.zzou();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    public final boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        zzb(zzajhVar2, false);
        return zzago.zza(zzajhVar, zzajhVar2);
    }

    @Override // com.google.android.gms.ads.internal.zzd
    protected final boolean zza(zzjj zzjjVar, zzajh zzajhVar, boolean z) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public final void zzbn() {
        this.zzvw.zzacw = null;
        super.zzbn();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzc(zzaig zzaigVar) {
        zzaig zzd = this.zzclg.zzd(zzaigVar);
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzw(this.zzvw.zzrt) && zzd != null) {
            com.google.android.gms.ads.internal.zzbv.zzfh().zza(this.zzvw.zzrt, com.google.android.gms.ads.internal.zzbv.zzfh().zzab(this.zzvw.zzrt), this.zzvw.zzacp, zzd.type, zzd.zzcmk);
        }
        zza(zzd);
    }

    public final zzaib zzca(String str) {
        return this.zzclg.zzca(str);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzdm() {
        onAdClicked();
    }

    public final void zzoy() {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (isLoaded()) {
            this.zzclg.zzw(this.zzyu);
        } else {
            zzakb.zzdk("The reward video has not loaded.");
        }
    }
}
