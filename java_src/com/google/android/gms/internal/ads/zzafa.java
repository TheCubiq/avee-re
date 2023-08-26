package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.upstream.DataSchemeDataSource;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.gmsg.HttpClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzafa extends zzajx {
    private final Context mContext;
    private final Object zzbzh;
    private final zzadj zzccf;
    private final zzaeg zzccg;
    private zzhx zzcci;
    private zzvs zzcgi;
    private static final long zzcgc = TimeUnit.SECONDS.toMillis(10);
    private static final Object sLock = new Object();
    private static boolean zzcgd = false;
    private static zzvf zzcge = null;
    private static HttpClient zzcgf = null;
    private static com.google.android.gms.ads.internal.gmsg.zzaa zzcgg = null;
    private static com.google.android.gms.ads.internal.gmsg.zzv<Object> zzcgh = null;

    public zzafa(Context context, zzaeg zzaegVar, zzadj zzadjVar, zzhx zzhxVar) {
        super(true);
        this.zzbzh = new Object();
        this.zzccf = zzadjVar;
        this.mContext = context;
        this.zzccg = zzaegVar;
        this.zzcci = zzhxVar;
        synchronized (sLock) {
            if (!zzcgd) {
                zzcgg = new com.google.android.gms.ads.internal.gmsg.zzaa();
                zzcgf = new HttpClient(context.getApplicationContext(), zzaegVar.zzacr);
                zzcgh = new zzafi();
                zzcge = new zzvf(this.mContext.getApplicationContext(), this.zzccg.zzacr, (String) zzkb.zzik().zzd(zznk.zzaub), new zzafh(), new zzafg());
                zzcgd = true;
            }
        }
    }

    private final JSONObject zza(zzaef zzaefVar, String str) {
        zzaga zzagaVar;
        AdvertisingIdClient.Info info;
        Bundle bundle = zzaefVar.zzccv.extras.getBundle("sdk_less_server_data");
        if (bundle == null) {
            return null;
        }
        try {
            zzagaVar = com.google.android.gms.ads.internal.zzbv.zzev().zzq(this.mContext).get();
        } catch (Exception e) {
            zzakb.zzc("Error grabbing device info: ", e);
            zzagaVar = null;
        }
        Context context = this.mContext;
        zzafl zzaflVar = new zzafl();
        zzaflVar.zzcgs = zzaefVar;
        zzaflVar.zzcgt = zzagaVar;
        JSONObject zza = zzafs.zza(context, zzaflVar);
        if (zza == null) {
            return null;
        }
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(this.mContext);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            zzakb.zzc("Cannot get advertising id info", e2);
            info = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request_id", str);
        hashMap.put("request_param", zza);
        hashMap.put(DataSchemeDataSource.SCHEME_DATA, bundle);
        if (info != null) {
            hashMap.put("adid", info.getId());
            hashMap.put("lat", Integer.valueOf(info.isLimitAdTrackingEnabled() ? 1 : 0));
        }
        try {
            return com.google.android.gms.ads.internal.zzbv.zzek().zzn(hashMap);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzb(zzuu zzuuVar) {
        zzuuVar.zza("/loadAd", zzcgg);
        zzuuVar.zza("/fetchHttpRequest", zzcgf);
        zzuuVar.zza("/invalidRequest", zzcgh);
    }

    private final zzaej zzc(zzaef zzaefVar) {
        com.google.android.gms.ads.internal.zzbv.zzek();
        String zzrh = zzakk.zzrh();
        JSONObject zza = zza(zzaefVar, zzrh);
        if (zza == null) {
            return new zzaej(0);
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
        Future<JSONObject> zzas = zzcgg.zzas(zzrh);
        zzamu.zzsy.post(new zzafc(this, zza, zzrh));
        try {
            JSONObject jSONObject = zzas.get(zzcgc - (com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime() - elapsedRealtime), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzaej(-1);
            }
            zzaej zza2 = zzafs.zza(this.mContext, zzaefVar, jSONObject.toString());
            return (zza2.errorCode == -3 || !TextUtils.isEmpty(zza2.zzceo)) ? zza2 : new zzaej(3);
        } catch (InterruptedException | CancellationException unused) {
            return new zzaej(-1);
        } catch (ExecutionException unused2) {
            return new zzaej(0);
        } catch (TimeoutException unused3) {
            return new zzaej(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void zzc(zzuu zzuuVar) {
        zzuuVar.zzb("/loadAd", zzcgg);
        zzuuVar.zzb("/fetchHttpRequest", zzcgf);
        zzuuVar.zzb("/invalidRequest", zzcgh);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
        synchronized (this.zzbzh) {
            zzamu.zzsy.post(new zzaff(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        zzakb.zzck("SdkLessAdLoaderBackgroundTask started.");
        String zzab = com.google.android.gms.ads.internal.zzbv.zzfh().zzab(this.mContext);
        zzaef zzaefVar = new zzaef(this.zzccg, -1L, com.google.android.gms.ads.internal.zzbv.zzfh().zzz(this.mContext), com.google.android.gms.ads.internal.zzbv.zzfh().zzaa(this.mContext), zzab);
        com.google.android.gms.ads.internal.zzbv.zzfh().zzg(this.mContext, zzab);
        zzaej zzc = zzc(zzaefVar);
        zzamu.zzsy.post(new zzafb(this, new zzaji(zzaefVar, zzc, null, null, zzc.errorCode, com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime(), zzc.zzceu, null, this.zzcci)));
    }
}
