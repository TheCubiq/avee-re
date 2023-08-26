package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzadk;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzajj;
import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzajx;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaki;
import com.google.android.gms.internal.ads.zzakk;
import com.google.android.gms.internal.ads.zzakq;
import com.google.android.gms.internal.ads.zzang;
import com.google.android.gms.internal.ads.zzano;
import com.google.android.gms.internal.ads.zzanz;
import com.google.android.gms.internal.ads.zzaoe;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzgk;
import com.google.android.gms.internal.ads.zzhu;
import com.google.android.gms.internal.ads.zzhx;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzkb;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zznx;
import com.google.android.gms.internal.ads.zzpl;
import com.google.android.gms.internal.ads.zzqs;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzua;
import com.google.android.gms.internal.ads.zzwz;
import com.google.android.gms.internal.ads.zzxg;
import com.google.android.gms.internal.ads.zzxn;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public abstract class zzd extends zza implements com.google.android.gms.ads.internal.overlay.zzn, zzbo, zzwz {
    protected final zzxn zzwh;
    private transient boolean zzwi;

    public zzd(Context context, zzjn zzjnVar, String str, zzxn zzxnVar, zzang zzangVar, zzw zzwVar) {
        this(new zzbw(context, zzjnVar, str, zzangVar), zzxnVar, null, zzwVar);
    }

    private zzd(zzbw zzbwVar, zzxn zzxnVar, zzbl zzblVar, zzw zzwVar) {
        super(zzbwVar, null, zzwVar);
        this.zzwh = zzxnVar;
        this.zzwi = false;
    }

    private final zzaeg zza(zzjj zzjjVar, Bundle bundle, zzajl zzajlVar, int i) {
        PackageInfo packageInfo;
        Bundle bundle2;
        String str;
        JSONArray optJSONArray;
        ApplicationInfo applicationInfo = this.zzvw.zzrt.getApplicationInfo();
        try {
            packageInfo = Wrappers.packageManager(this.zzvw.zzrt).getPackageInfo(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.zzvw.zzrt.getResources().getDisplayMetrics();
        if (this.zzvw.zzacs == null || this.zzvw.zzacs.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.zzvw.zzacs.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = 1;
            int i4 = iArr[1];
            int width = this.zzvw.zzacs.getWidth();
            int height = this.zzvw.zzacs.getHeight();
            i3 = (!this.zzvw.zzacs.isShown() || i2 + width <= 0 || i4 + height <= 0 || i2 > displayMetrics.widthPixels || i4 > displayMetrics.heightPixels) ? 0 : 0;
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i2);
            bundle3.putInt("y", i4);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i3);
            bundle2 = bundle3;
        }
        String zzql = zzbv.zzeo().zzpx().zzql();
        this.zzvw.zzacy = new zzajj(zzql, this.zzvw.zzacp);
        this.zzvw.zzacy.zzn(zzjjVar);
        zzbv.zzek();
        String zza = zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacs, this.zzvw.zzacv);
        long j = 0;
        if (this.zzvw.zzadd != null) {
            try {
                j = this.zzvw.zzadd.getValue();
            } catch (RemoteException unused2) {
                zzakb.zzdk("Cannot get correlation id, default to 0.");
            }
        }
        long j2 = j;
        String uuid = UUID.randomUUID().toString();
        Bundle zza2 = zzbv.zzep().zza(this.zzvw.zzrt, this, zzql);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i5 = 0; i5 < this.zzvw.zzadi.size(); i5++) {
            String keyAt = this.zzvw.zzadi.keyAt(i5);
            arrayList.add(keyAt);
            if (this.zzvw.zzadh.containsKey(keyAt) && this.zzvw.zzadh.get(keyAt) != null) {
                arrayList2.add(keyAt);
            }
        }
        zzanz zza3 = zzaki.zza(new zzg(this));
        zzanz zza4 = zzaki.zza(new zzh(this));
        String zzpu = zzajlVar != null ? zzajlVar.zzpu() : null;
        if (this.zzvw.zzads != null && this.zzvw.zzads.size() > 0) {
            int i6 = packageInfo != null ? packageInfo.versionCode : 0;
            if (i6 > zzbv.zzeo().zzqh().zzqz()) {
                zzbv.zzeo().zzqh().zzrf();
                zzbv.zzeo().zzqh().zzae(i6);
            } else {
                JSONObject zzre = zzbv.zzeo().zzqh().zzre();
                if (zzre != null && (optJSONArray = zzre.optJSONArray(this.zzvw.zzacp)) != null) {
                    str = optJSONArray.toString();
                    zzjn zzjnVar = this.zzvw.zzacv;
                    String str2 = this.zzvw.zzacp;
                    String zzih = zzkb.zzih();
                    zzang zzangVar = this.zzvw.zzacr;
                    List<String> list = this.zzvw.zzads;
                    boolean zzqt = zzbv.zzeo().zzqh().zzqt();
                    int i7 = displayMetrics.widthPixels;
                    int i8 = displayMetrics.heightPixels;
                    float f = displayMetrics.density;
                    List<String> zzjb = zznk.zzjb();
                    String str3 = this.zzvw.zzaco;
                    zzpl zzplVar = this.zzvw.zzadj;
                    String zzfq = this.zzvw.zzfq();
                    float zzdo = zzbv.zzfj().zzdo();
                    boolean zzdp = zzbv.zzfj().zzdp();
                    zzbv.zzek();
                    int zzas = zzakk.zzas(this.zzvw.zzrt);
                    zzbv.zzek();
                    int zzx = zzakk.zzx(this.zzvw.zzacs);
                    boolean z = this.zzvw.zzrt instanceof Activity;
                    boolean zzqy = zzbv.zzeo().zzqh().zzqy();
                    boolean zzqa = zzbv.zzeo().zzqa();
                    int zztx = zzbv.zzff().zztx();
                    zzbv.zzek();
                    Bundle zzrk = zzakk.zzrk();
                    String zzrw = zzbv.zzeu().zzrw();
                    zzlu zzluVar = this.zzvw.zzadl;
                    boolean zzrx = zzbv.zzeu().zzrx();
                    Bundle zzlt = zzua.zzlk().zzlt();
                    boolean zzcr = zzbv.zzeo().zzqh().zzcr(this.zzvw.zzacp);
                    List<Integer> list2 = this.zzvw.zzadn;
                    boolean isCallerInstantApp = Wrappers.packageManager(this.zzvw.zzrt).isCallerInstantApp();
                    boolean zzqb = zzbv.zzeo().zzqb();
                    zzbv.zzem();
                    return new zzaeg(bundle2, zzjjVar, zzjnVar, str2, applicationInfo, packageInfo, zzql, zzih, zzangVar, zza2, list, arrayList, bundle, zzqt, i7, i8, f, zza, j2, uuid, zzjb, str3, zzplVar, zzfq, zzdo, zzdp, zzas, zzx, z, zzqy, zza3, zzpu, zzqa, zztx, zzrk, zzrw, zzluVar, zzrx, zzlt, zzcr, zza4, list2, str, arrayList2, i, isCallerInstantApp, zzqb, zzakq.zzrp(), (ArrayList) zzano.zza(zzbv.zzeo().zzqi(), (Object) null, 1000L, TimeUnit.MILLISECONDS));
                }
            }
        }
        str = null;
        zzjn zzjnVar2 = this.zzvw.zzacv;
        String str22 = this.zzvw.zzacp;
        String zzih2 = zzkb.zzih();
        zzang zzangVar2 = this.zzvw.zzacr;
        List<String> list3 = this.zzvw.zzads;
        boolean zzqt2 = zzbv.zzeo().zzqh().zzqt();
        int i72 = displayMetrics.widthPixels;
        int i82 = displayMetrics.heightPixels;
        float f2 = displayMetrics.density;
        List<String> zzjb2 = zznk.zzjb();
        String str32 = this.zzvw.zzaco;
        zzpl zzplVar2 = this.zzvw.zzadj;
        String zzfq2 = this.zzvw.zzfq();
        float zzdo2 = zzbv.zzfj().zzdo();
        boolean zzdp2 = zzbv.zzfj().zzdp();
        zzbv.zzek();
        int zzas2 = zzakk.zzas(this.zzvw.zzrt);
        zzbv.zzek();
        int zzx2 = zzakk.zzx(this.zzvw.zzacs);
        boolean z2 = this.zzvw.zzrt instanceof Activity;
        boolean zzqy2 = zzbv.zzeo().zzqh().zzqy();
        boolean zzqa2 = zzbv.zzeo().zzqa();
        int zztx2 = zzbv.zzff().zztx();
        zzbv.zzek();
        Bundle zzrk2 = zzakk.zzrk();
        String zzrw2 = zzbv.zzeu().zzrw();
        zzlu zzluVar2 = this.zzvw.zzadl;
        boolean zzrx2 = zzbv.zzeu().zzrx();
        Bundle zzlt2 = zzua.zzlk().zzlt();
        boolean zzcr2 = zzbv.zzeo().zzqh().zzcr(this.zzvw.zzacp);
        List<Integer> list22 = this.zzvw.zzadn;
        boolean isCallerInstantApp2 = Wrappers.packageManager(this.zzvw.zzrt).isCallerInstantApp();
        boolean zzqb2 = zzbv.zzeo().zzqb();
        zzbv.zzem();
        return new zzaeg(bundle2, zzjjVar, zzjnVar2, str22, applicationInfo, packageInfo, zzql, zzih2, zzangVar2, zza2, list3, arrayList, bundle, zzqt2, i72, i82, f2, zza, j2, uuid, zzjb2, str32, zzplVar2, zzfq2, zzdo2, zzdp2, zzas2, zzx2, z2, zzqy2, zza3, zzpu, zzqa2, zztx2, zzrk2, zzrw2, zzluVar2, zzrx2, zzlt2, zzcr2, zza4, list22, str, arrayList2, i, isCallerInstantApp2, zzqb2, zzakq.zzrp(), (ArrayList) zzano.zza(zzbv.zzeo().zzqi(), (Object) null, 1000L, TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc(zzajh zzajhVar) {
        if (zzajhVar == null) {
            return null;
        }
        String str = zzajhVar.zzbty;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzajhVar.zzbtw != null) {
            try {
                return new JSONObject(zzajhVar.zzbtw.zzbsb).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String getMediationAdapterClassName() {
        if (this.zzvw.zzacw == null) {
            return null;
        }
        return this.zzvw.zzacw.zzbty;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzjd
    public void onAdClicked() {
        if (this.zzvw.zzacw == null) {
            zzakb.zzdk("Ad state was null when trying to ping click URLs.");
            return;
        }
        if (this.zzvw.zzacw.zzcod != null && this.zzvw.zzacw.zzcod.zzbsn != null) {
            zzbv.zzfd();
            zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, this.zzvw.zzacw, this.zzvw.zzacp, false, zzc(this.zzvw.zzacw.zzcod.zzbsn));
        }
        if (this.zzvw.zzacw.zzbtw != null && this.zzvw.zzacw.zzbtw.zzbrw != null) {
            zzbv.zzfd();
            zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, this.zzvw.zzacw, this.zzvw.zzacp, false, this.zzvw.zzacw.zzbtw.zzbrw);
        }
        super.onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onPause() {
        this.zzvy.zzj(this.zzvw.zzacw);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onResume() {
        this.zzvy.zzk(this.zzvw.zzacw);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public void pause() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzbyo != null && this.zzvw.zzfo()) {
            zzbv.zzem();
            zzakq.zzi(this.zzvw.zzacw.zzbyo);
        }
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzbtx != null) {
            try {
                this.zzvw.zzacw.zzbtx.pause();
            } catch (RemoteException unused) {
                zzakb.zzdk("Could not pause mediation adapter.");
            }
        }
        this.zzvy.zzj(this.zzvw.zzacw);
        this.zzvv.pause();
    }

    public final void recordImpression() {
        zza(this.zzvw.zzacw, false);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzks
    public void resume() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzaqw zzaqwVar = (this.zzvw.zzacw == null || this.zzvw.zzacw.zzbyo == null) ? null : this.zzvw.zzacw.zzbyo;
        if (zzaqwVar != null && this.zzvw.zzfo()) {
            zzbv.zzem();
            zzakq.zzj(this.zzvw.zzacw.zzbyo);
        }
        if (this.zzvw.zzacw != null && this.zzvw.zzacw.zzbtx != null) {
            try {
                this.zzvw.zzacw.zzbtx.resume();
            } catch (RemoteException unused) {
                zzakb.zzdk("Could not resume mediation adapter.");
            }
        }
        if (zzaqwVar == null || !zzaqwVar.zzum()) {
            this.zzvv.resume();
        }
        this.zzvy.zzk(this.zzvw.zzacw);
    }

    public void showInterstitial() {
        zzakb.zzdk("showInterstitial is not supported for current ad type");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzajh zzajhVar, boolean z) {
        if (zzajhVar == null) {
            zzakb.zzdk("Ad state was null when trying to ping impression URLs.");
            return;
        }
        if (zzajhVar == null) {
            zzakb.zzdk("Ad state was null when trying to ping impression URLs.");
        } else {
            zzakb.zzck("Pinging Impression URLs.");
            if (this.zzvw.zzacy != null) {
                this.zzvw.zzacy.zzpm();
            }
            zzajhVar.zzcoq.zza(zzhu.zza.zzb.AD_IMPRESSION);
            if (zzajhVar.zzbso != null && !zzajhVar.zzcok) {
                zzbv.zzek();
                zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzc(zzajhVar.zzbso));
                zzajhVar.zzcok = true;
            }
        }
        if (!zzajhVar.zzcom || z) {
            if (zzajhVar.zzcod != null && zzajhVar.zzcod.zzbso != null) {
                zzbv.zzfd();
                zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, z, zzc(zzajhVar.zzcod.zzbso));
            }
            if (zzajhVar.zzbtw != null && zzajhVar.zzbtw.zzbrx != null) {
                zzbv.zzfd();
                zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, z, zzajhVar.zzbtw.zzbrx);
            }
            zzajhVar.zzcom = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zza(zzqs zzqsVar, String str) {
        String customTemplateId;
        zzrc zzrcVar = null;
        if (zzqsVar != null) {
            try {
                customTemplateId = zzqsVar.getCustomTemplateId();
            } catch (RemoteException e) {
                zzakb.zzc("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            customTemplateId = null;
        }
        if (this.zzvw.zzadh != null && customTemplateId != null) {
            zzrcVar = this.zzvw.zzadh.get(customTemplateId);
        }
        if (zzrcVar == null) {
            zzakb.zzdk("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzrcVar.zzb(zzqsVar, str);
        }
    }

    public final boolean zza(zzaeg zzaegVar, zznx zznxVar) {
        this.zzvr = zznxVar;
        zznxVar.zze("seq_num", zzaegVar.zzccy);
        zznxVar.zze("request_id", zzaegVar.zzcdi);
        zznxVar.zze("session_id", zzaegVar.zzccz);
        if (zzaegVar.zzccw != null) {
            zznxVar.zze("app_version", String.valueOf(zzaegVar.zzccw.versionCode));
        }
        zzbw zzbwVar = this.zzvw;
        zzbv.zzeg();
        Context context = this.zzvw.zzrt;
        zzhx zzhxVar = this.zzwc.zzxb;
        zzajx zzafaVar = zzaegVar.zzccv.extras.getBundle("sdk_less_server_data") != null ? new zzafa(context, zzaegVar, this, zzhxVar) : new zzadk(context, zzaegVar, this, zzhxVar);
        zzafaVar.zzqo();
        zzbwVar.zzact = zzafaVar;
        return true;
    }

    @Override // com.google.android.gms.ads.internal.zza
    final boolean zza(zzajh zzajhVar) {
        zzjj zzjjVar;
        boolean z = false;
        if (this.zzvx != null) {
            zzjjVar = this.zzvx;
            this.zzvx = null;
        } else {
            zzjjVar = zzajhVar.zzccv;
            if (zzjjVar.extras != null) {
                z = zzjjVar.extras.getBoolean("_noRefresh", false);
            }
        }
        return zza(zzjjVar, zzajhVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public boolean zza(zzajh zzajhVar, zzajh zzajhVar2) {
        int i;
        if (zzajhVar != null && zzajhVar.zzbtz != null) {
            zzajhVar.zzbtz.zza((zzwz) null);
        }
        if (zzajhVar2.zzbtz != null) {
            zzajhVar2.zzbtz.zza(this);
        }
        int i2 = 0;
        if (zzajhVar2.zzcod != null) {
            i2 = zzajhVar2.zzcod.zzbtc;
            i = zzajhVar2.zzcod.zzbtd;
        } else {
            i = 0;
        }
        this.zzvw.zzadt.zze(i2, i);
        return true;
    }

    protected boolean zza(zzjj zzjjVar, zzajh zzajhVar, boolean z) {
        zzbl zzblVar;
        long j;
        if (!z && this.zzvw.zzfo()) {
            if (zzajhVar.zzbsu > 0) {
                zzblVar = this.zzvv;
                j = zzajhVar.zzbsu;
            } else if (zzajhVar.zzcod != null && zzajhVar.zzcod.zzbsu > 0) {
                zzblVar = this.zzvv;
                j = zzajhVar.zzcod.zzbsu;
            } else if (!zzajhVar.zzceq && zzajhVar.errorCode == 2) {
                this.zzvv.zzg(zzjjVar);
            }
            zzblVar.zza(zzjjVar, j);
        }
        return this.zzvv.zzdz();
    }

    @Override // com.google.android.gms.ads.internal.zza
    public boolean zza(zzjj zzjjVar, zznx zznxVar) {
        return zza(zzjjVar, zznxVar, 1);
    }

    public final boolean zza(zzjj zzjjVar, zznx zznxVar, int i) {
        if (zzca()) {
            zzbv.zzek();
            zzgk zzaf = zzbv.zzeo().zzaf(this.zzvw.zzrt);
            zzajl zzajlVar = null;
            Bundle zza = zzaf == null ? null : zzakk.zza(zzaf);
            this.zzvv.cancel();
            this.zzvw.zzadv = 0;
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbcs)).booleanValue()) {
                zzajl zzra = zzbv.zzeo().zzqh().zzra();
                zzbv.zzes().zza(this.zzvw.zzrt, this.zzvw.zzacr, false, zzra, zzra != null ? zzra.zzpv() : null, this.zzvw.zzacp, null);
                zzajlVar = zzra;
            }
            return zza(zza(zzjjVar, zza, zzajlVar, i), zznxVar);
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.ads.zzabm
    public final void zzb(zzajh zzajhVar) {
        super.zzb(zzajhVar);
        if (zzajhVar.zzbtw != null) {
            zzakb.zzck("Disable the debug gesture detector on the mediation ad frame.");
            if (this.zzvw.zzacs != null) {
                this.zzvw.zzacs.zzfu();
            }
            zzakb.zzck("Pinging network fill URLs.");
            zzbv.zzfd();
            zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, false, zzajhVar.zzbtw.zzbsa);
            if (zzajhVar.zzcod != null && zzajhVar.zzcod.zzbsr != null && zzajhVar.zzcod.zzbsr.size() > 0) {
                zzakb.zzck("Pinging urls remotely");
                zzbv.zzek().zza(this.zzvw.zzrt, zzajhVar.zzcod.zzbsr);
            }
        } else {
            zzakb.zzck("Enable the debug gesture detector on the admob ad frame.");
            if (this.zzvw.zzacs != null) {
                this.zzvw.zzacs.zzft();
            }
        }
        if (zzajhVar.errorCode != 3 || zzajhVar.zzcod == null || zzajhVar.zzcod.zzbsq == null) {
            return;
        }
        zzakb.zzck("Pinging no fill URLs.");
        zzbv.zzfd();
        zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, false, zzajhVar.zzcod.zzbsq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb(zzajh zzajhVar, boolean z) {
        if (zzajhVar == null) {
            return;
        }
        if (zzajhVar != null && zzajhVar.zzbsp != null && !zzajhVar.zzcol) {
            zzbv.zzek();
            zzakk.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzb(zzajhVar.zzbsp));
            zzajhVar.zzcol = true;
        }
        if (!zzajhVar.zzcon || z) {
            if (zzajhVar.zzcod != null && zzajhVar.zzcod.zzbsp != null) {
                zzbv.zzfd();
                zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, z, zzb(zzajhVar.zzcod.zzbsp));
            }
            if (zzajhVar.zzbtw != null && zzajhVar.zzbtw.zzbry != null) {
                zzbv.zzfd();
                zzxg.zza(this.zzvw.zzrt, this.zzvw.zzacr.zzcw, zzajhVar, this.zzvw.zzacp, z, zzajhVar.zzbtw.zzbry);
            }
            zzajhVar.zzcon = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzb(String str, String str2) {
        onAppEvent(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.internal.zza
    public final boolean zzc(zzjj zzjjVar) {
        return super.zzc(zzjjVar) && !this.zzwi;
    }

    protected boolean zzca() {
        zzbv.zzek();
        if (zzakk.zzl(this.zzvw.zzrt, "android.permission.INTERNET")) {
            zzbv.zzek();
            if (zzakk.zzaj(this.zzvw.zzrt)) {
                return true;
            }
        }
        return false;
    }

    public void zzcb() {
        this.zzwi = false;
        zzbn();
        this.zzvw.zzacy.zzpo();
    }

    public void zzcc() {
        this.zzwi = true;
        zzbp();
    }

    public void zzcd() {
        zzakb.zzdk("Mediated ad does not support onVideoEnd callback");
    }

    public void zzce() {
        onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzcf() {
        zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzcg() {
        zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzch() {
        zzcc();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzci() {
        if (this.zzvw.zzacw != null) {
            String str = this.zzvw.zzacw.zzbty;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            zzakb.zzdk(sb.toString());
        }
        zza(this.zzvw.zzacw, true);
        zzb(this.zzvw.zzacw, true);
        zzbq();
    }

    public void zzcj() {
        recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzks
    public final String zzck() {
        if (this.zzvw.zzacw == null) {
            return null;
        }
        return zzc(this.zzvw.zzacw);
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final void zzcl() {
        Executor executor = zzaoe.zzcvy;
        zzbl zzblVar = this.zzvv;
        zzblVar.getClass();
        executor.execute(zze.zza(zzblVar));
    }

    @Override // com.google.android.gms.ads.internal.zzbo
    public final void zzcm() {
        Executor executor = zzaoe.zzcvy;
        zzbl zzblVar = this.zzvv;
        zzblVar.getClass();
        executor.execute(zzf.zza(zzblVar));
    }
}
