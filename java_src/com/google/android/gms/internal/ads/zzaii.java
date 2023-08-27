package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzaii implements zzait {
    private static List<Future<Void>> zzcml = Collections.synchronizedList(new ArrayList());
    private static ScheduledExecutorService zzcmm = Executors.newSingleThreadScheduledExecutor();
    private final Context mContext;
    private final zzaiq zzciy;
    private final zzbfm zzcmn;
    private final LinkedHashMap<String, zzbfu> zzcmo;
    private final zzaiv zzcmr;
    private boolean zzcms;
    private final zzaiw zzcmt;
    private final List<String> zzcmp = new ArrayList();
    private final List<String> zzcmq = new ArrayList();
    private final Object mLock = new Object();
    private HashSet<String> zzcmu = new HashSet<>();
    private boolean zzcmv = false;
    private boolean zzcmw = false;
    private boolean zzcmx = false;

    public zzaii(Context context, zzang zzangVar, zzaiq zzaiqVar, String str, zzaiv zzaivVar) {
        Preconditions.checkNotNull(zzaiqVar, "SafeBrowsing config is not present.");
        this.mContext = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzcmo = new LinkedHashMap<>();
        this.zzcmr = zzaivVar;
        this.zzciy = zzaiqVar;
        for (String str2 : zzaiqVar.zzcnh) {
            this.zzcmu.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.zzcmu.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzbfm zzbfmVar = new zzbfm();
        zzbfmVar.zzamf = 8;
        zzbfmVar.url = str;
        zzbfmVar.zzech = str;
        zzbfmVar.zzecj = new zzbfn();
        zzbfmVar.zzecj.zzcnd = this.zzciy.zzcnd;
        zzbfv zzbfvVar = new zzbfv();
        zzbfvVar.zzedv = zzangVar.zzcw;
        zzbfvVar.zzedx = Boolean.valueOf(Wrappers.packageManager(this.mContext).isCallerInstantApp());
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.mContext);
        if (apkVersion > 0) {
            zzbfvVar.zzedw = Long.valueOf(apkVersion);
        }
        zzbfmVar.zzect = zzbfvVar;
        this.zzcmn = zzbfmVar;
        this.zzcmt = new zzaiw(this.mContext, this.zzciy.zzcnk, this);
    }

    private final zzbfu zzci(String str) {
        zzbfu zzbfuVar;
        synchronized (this.mLock) {
            zzbfuVar = this.zzcmo.get(str);
        }
        return zzbfuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzcj(String str) {
        return null;
    }

    private final zzanz<Void> zzpk() {
        zzanz<Void> zza;
        zzbfu[] zzbfuVarArr;
        if ((this.zzcms && this.zzciy.zzcnj) || (this.zzcmx && this.zzciy.zzcni) || (!this.zzcms && this.zzciy.zzcng)) {
            synchronized (this.mLock) {
                this.zzcmn.zzeck = new zzbfu[this.zzcmo.size()];
                this.zzcmo.values().toArray(this.zzcmn.zzeck);
                this.zzcmn.zzecu = (String[]) this.zzcmp.toArray(new String[0]);
                this.zzcmn.zzecv = (String[]) this.zzcmq.toArray(new String[0]);
                if (zzais.isEnabled()) {
                    String str = this.zzcmn.url;
                    String str2 = this.zzcmn.zzecl;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                    sb.append("Sending SB report\n  url: ");
                    sb.append(str);
                    sb.append("\n  clickUrl: ");
                    sb.append(str2);
                    sb.append("\n  resources: \n");
                    StringBuilder sb2 = new StringBuilder(sb.toString());
                    for (zzbfu zzbfuVar : this.zzcmn.zzeck) {
                        sb2.append("    [");
                        sb2.append(zzbfuVar.zzedu.length);
                        sb2.append("] ");
                        sb2.append(zzbfuVar.url);
                    }
                    zzais.zzck(sb2.toString());
                }
                zzanz<String> zza2 = new zzalt(this.mContext).zza(1, this.zzciy.zzcne, null, zzbfi.zzb(this.zzcmn));
                if (zzais.isEnabled()) {
                    zza2.zza(new zzain(this), zzaki.zzcrj);
                }
                zza = zzano.zza(zza2, zzaik.zzcmz, zzaoe.zzcvz);
            }
            return zza;
        }
        return zzano.zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zza(String str, Map<String, String> map, int i) {
        synchronized (this.mLock) {
            if (i == 3) {
                this.zzcmx = true;
            }
            if (this.zzcmo.containsKey(str)) {
                if (i == 3) {
                    this.zzcmo.get(str).zzedt = Integer.valueOf(i);
                }
                return;
            }
            zzbfu zzbfuVar = new zzbfu();
            zzbfuVar.zzedt = Integer.valueOf(i);
            zzbfuVar.zzedn = Integer.valueOf(this.zzcmo.size());
            zzbfuVar.url = str;
            zzbfuVar.zzedo = new zzbfp();
            if (this.zzcmu.size() > 0 && map != null) {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    try {
                        String key = entry.getKey() != null ? entry.getKey() : "";
                        String value = entry.getValue() != null ? entry.getValue() : "";
                        if (this.zzcmu.contains(key.toLowerCase(Locale.ENGLISH))) {
                            zzbfo zzbfoVar = new zzbfo();
                            zzbfoVar.zzecx = key.getBytes("UTF-8");
                            zzbfoVar.zzecy = value.getBytes("UTF-8");
                            arrayList.add(zzbfoVar);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        zzais.zzck("Cannot convert string to bytes, skip header.");
                    }
                }
                zzbfo[] zzbfoVarArr = new zzbfo[arrayList.size()];
                arrayList.toArray(zzbfoVarArr);
                zzbfuVar.zzedo.zzeda = zzbfoVarArr;
            }
            this.zzcmo.put(str, zzbfuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final String[] zzb(String[] strArr) {
        return (String[]) this.zzcmt.zzc(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzcf(String str) {
        synchronized (this.mLock) {
            this.zzcmn.zzecl = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzcg(String str) {
        synchronized (this.mLock) {
            this.zzcmp.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzch(String str) {
        synchronized (this.mLock) {
            this.zzcmq.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzanz zzm(Map map) throws Exception {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.mLock) {
                            int length = optJSONArray.length();
                            zzbfu zzci = zzci(str);
                            if (zzci == null) {
                                String valueOf = String.valueOf(str);
                                zzais.zzck(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                zzci.zzedu = new String[length];
                                for (int i = 0; i < length; i++) {
                                    zzci.zzedu[i] = optJSONArray.getJSONObject(i).getString("threat_type");
                                }
                                this.zzcms = (length > 0) | this.zzcms;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbdi)).booleanValue()) {
                    zzakb.zza("Failed to get SafeBrowsing metadata", e);
                }
                return zzano.zzd(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zzcms) {
            synchronized (this.mLock) {
                this.zzcmn.zzamf = 9;
            }
        }
        return zzpk();
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final zzaiq zzpg() {
        return this.zzciy;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final boolean zzph() {
        return PlatformVersion.isAtLeastKitKat() && this.zzciy.zzcnf && !this.zzcmw;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzpi() {
        this.zzcmv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzpj() {
        synchronized (this.mLock) {
            zzanz zza = zzano.zza(this.zzcmr.zza(this.mContext, this.zzcmo.keySet()), new zzanj(this) { // from class: com.google.android.gms.internal.ads.zzaij
                private final zzaii zzcmy;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcmy = this;
                }

                @Override // com.google.android.gms.internal.ads.zzanj
                public final zzanz zzc(Object obj) {
                    return this.zzcmy.zzm((Map) obj);
                }
            }, zzaoe.zzcvz);
            zzanz zza2 = zzano.zza(zza, 10L, TimeUnit.SECONDS, zzcmm);
            zzano.zza(zza, new zzaim(this, zza2), zzaoe.zzcvz);
            zzcml.add(zza2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzr(View view) {
        if (this.zzciy.zzcnf && !this.zzcmw) {
            com.google.android.gms.ads.internal.zzbv.zzek();
            Bitmap zzt = zzakk.zzt(view);
            if (zzt == null) {
                zzais.zzck("Failed to capture the webview bitmap.");
                return;
            }
            this.zzcmw = true;
            zzakk.zzd(new zzail(this, zzt));
        }
    }
}
