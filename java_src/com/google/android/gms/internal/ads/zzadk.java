package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzhu;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzadk extends zzajx implements zzadx {
    private final Context mContext;
    private zzwy zzbtj;
    private zzaef zzbuc;
    private zzaej zzbzf;
    private Runnable zzbzg;
    private final Object zzbzh = new Object();
    private final zzadj zzccf;
    private final zzaeg zzccg;
    private final zzhs zzcch;
    private final zzhx zzcci;
    zzalc zzccj;

    public zzadk(Context context, zzaeg zzaegVar, zzadj zzadjVar, zzhx zzhxVar) {
        zzhs zzhsVar;
        zzht zzhtVar;
        this.zzccf = zzadjVar;
        this.mContext = context;
        this.zzccg = zzaegVar;
        this.zzcci = zzhxVar;
        zzhs zzhsVar2 = new zzhs(zzhxVar);
        this.zzcch = zzhsVar2;
        zzhsVar2.zza(new zzht(this) { // from class: com.google.android.gms.internal.ads.zzadl
            private final zzadk zzcck;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcck = this;
            }

            @Override // com.google.android.gms.internal.ads.zzht
            public final void zza(zzii zziiVar) {
                this.zzcck.zzc(zziiVar);
            }
        });
        final zzit zzitVar = new zzit();
        zzitVar.zzaot = Integer.valueOf(this.zzccg.zzacr.zzcve);
        zzitVar.zzaou = Integer.valueOf(this.zzccg.zzacr.zzcvf);
        zzitVar.zzaov = Integer.valueOf(this.zzccg.zzacr.zzcvg ? 0 : 2);
        this.zzcch.zza(new zzht(zzitVar) { // from class: com.google.android.gms.internal.ads.zzadm
            private final zzit zzccl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzccl = zzitVar;
            }

            @Override // com.google.android.gms.internal.ads.zzht
            public final void zza(zzii zziiVar) {
                zziiVar.zzanm.zzamx = this.zzccl;
            }
        });
        if (this.zzccg.zzccw != null) {
            this.zzcch.zza(new zzht(this) { // from class: com.google.android.gms.internal.ads.zzadn
                private final zzadk zzcck;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzcck = this;
                }

                @Override // com.google.android.gms.internal.ads.zzht
                public final void zza(zzii zziiVar) {
                    this.zzcck.zzb(zziiVar);
                }
            });
        }
        zzjn zzjnVar = this.zzccg.zzacv;
        if (zzjnVar.zzarc && "interstitial_mb".equals(zzjnVar.zzarb)) {
            zzhsVar = this.zzcch;
            zzhtVar = zzado.zzccm;
        } else if (zzjnVar.zzarc && "reward_mb".equals(zzjnVar.zzarb)) {
            zzhsVar = this.zzcch;
            zzhtVar = zzadp.zzccm;
        } else if (zzjnVar.zzare || zzjnVar.zzarc) {
            zzhsVar = this.zzcch;
            zzhtVar = zzadr.zzccm;
        } else {
            zzhsVar = this.zzcch;
            zzhtVar = zzadq.zzccm;
        }
        zzhsVar.zza(zzhtVar);
        this.zzcch.zza(zzhu.zza.zzb.AD_REQUEST);
    }

    private final zzjn zza(zzaef zzaefVar) throws zzadu {
        zzjn[] zzjnVarArr;
        zzjn[] zzjnVarArr2;
        zzwy zzwyVar;
        zzaef zzaefVar2 = this.zzbuc;
        if (!((zzaefVar2 == null || zzaefVar2.zzadn == null || this.zzbuc.zzadn.size() <= 1) ? false : true) || (zzwyVar = this.zzbtj) == null || zzwyVar.zzbte) {
            if (this.zzbzf.zzarf) {
                for (zzjn zzjnVar : zzaefVar.zzacv.zzard) {
                    if (zzjnVar.zzarf) {
                        return new zzjn(zzjnVar, zzaefVar.zzacv.zzard);
                    }
                }
            }
            if (this.zzbzf.zzcet != null) {
                String[] split = this.zzbzf.zzcet.split("x");
                if (split.length != 2) {
                    String valueOf = String.valueOf(this.zzbzf.zzcet);
                    throw new zzadu(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
                }
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    for (zzjn zzjnVar2 : zzaefVar.zzacv.zzard) {
                        float f = this.mContext.getResources().getDisplayMetrics().density;
                        int i = zzjnVar2.width == -1 ? (int) (zzjnVar2.widthPixels / f) : zzjnVar2.width;
                        int i2 = zzjnVar2.height == -2 ? (int) (zzjnVar2.heightPixels / f) : zzjnVar2.height;
                        if (parseInt == i && parseInt2 == i2 && !zzjnVar2.zzarf) {
                            return new zzjn(zzjnVar2, zzaefVar.zzacv.zzard);
                        }
                    }
                    String valueOf2 = String.valueOf(this.zzbzf.zzcet);
                    throw new zzadu(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
                } catch (NumberFormatException unused) {
                    String valueOf3 = String.valueOf(this.zzbzf.zzcet);
                    throw new zzadu(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
                }
            }
            throw new zzadu("The ad response must specify one of the supported ad sizes.", 0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i, String str) {
        if (i == 3 || i == -1) {
            zzakb.zzdj(str);
        } else {
            zzakb.zzdk(str);
        }
        this.zzbzf = this.zzbzf == null ? new zzaej(i) : new zzaej(i, this.zzbzf.zzbsu);
        zzaef zzaefVar = this.zzbuc;
        if (zzaefVar == null) {
            zzaefVar = new zzaef(this.zzccg, -1L, null, null, null);
        }
        zzaej zzaejVar = this.zzbzf;
        this.zzccf.zza(new zzaji(zzaefVar, zzaejVar, this.zzbtj, null, i, -1L, zzaejVar.zzceu, null, this.zzcch, null));
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
        synchronized (this.zzbzh) {
            if (this.zzccj != null) {
                this.zzccj.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzalc zza(zzang zzangVar, zzaol<zzaef> zzaolVar) {
        Context context = this.mContext;
        if (new zzadw(context).zza(zzangVar)) {
            zzakb.zzck("Fetching ad response from local ad request service.");
            zzaec zzaecVar = new zzaec(context, zzaolVar, this);
            zzaecVar.zznt();
            return zzaecVar;
        }
        zzakb.zzck("Fetching ad response from remote ad request service.");
        zzkb.zzif();
        if (zzamu.zzbe(context)) {
            return new zzaed(context, zzangVar, zzaolVar, this);
        }
        zzakb.zzdk("Failed to connect to remote ad request service.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    @Override // com.google.android.gms.internal.ads.zzadx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzaej zzaejVar) {
        Boolean bool;
        zzjn zza;
        JSONObject jSONObject;
        Bundle bundle;
        zzakb.zzck("Received ad response.");
        this.zzbzf = zzaejVar;
        long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
        synchronized (this.zzbzh) {
            bool = null;
            this.zzccj = null;
        }
        com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzae(this.zzbzf.zzcdr);
        if (((Boolean) zzkb.zzik().zzd(zznk.zzayy)).booleanValue()) {
            if (this.zzbzf.zzced) {
                com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzcp(this.zzbuc.zzacp);
            } else {
                com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzcq(this.zzbuc.zzacp);
            }
        }
        try {
            if (this.zzbzf.errorCode != -2 && this.zzbzf.errorCode != -3) {
                int i = this.zzbzf.errorCode;
                StringBuilder sb = new StringBuilder(66);
                sb.append("There was a problem getting an ad response. ErrorCode: ");
                sb.append(i);
                throw new zzadu(sb.toString(), this.zzbzf.errorCode);
            }
            if (this.zzbzf.errorCode != -3) {
                if (TextUtils.isEmpty(this.zzbzf.zzceo)) {
                    throw new zzadu("No fill from ad server.", 3);
                }
                com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzab(this.zzbzf.zzcdd);
                if (this.zzbzf.zzceq) {
                    try {
                        this.zzbtj = new zzwy(this.zzbzf.zzceo);
                        com.google.android.gms.ads.internal.zzbv.zzeo().zzaa(this.zzbtj.zzbss);
                    } catch (JSONException e) {
                        zzakb.zzb("Could not parse mediation config.", e);
                        String valueOf = String.valueOf(this.zzbzf.zzceo);
                        throw new zzadu(valueOf.length() != 0 ? "Could not parse mediation config: ".concat(valueOf) : new String("Could not parse mediation config: "), 0);
                    }
                } else {
                    com.google.android.gms.ads.internal.zzbv.zzeo().zzaa(this.zzbzf.zzbss);
                }
                if (!TextUtils.isEmpty(this.zzbzf.zzcds)) {
                    if (((Boolean) zzkb.zzik().zzd(zznk.zzbdj)).booleanValue()) {
                        zzakb.zzck("Received cookie from server. Setting webview cookie in CookieManager.");
                        CookieManager zzax = com.google.android.gms.ads.internal.zzbv.zzem().zzax(this.mContext);
                        if (zzax != null) {
                            zzax.setCookie("googleads.g.doubleclick.net", this.zzbzf.zzcds);
                        }
                    }
                }
            }
            zza = this.zzbuc.zzacv.zzard != null ? zza(this.zzbuc) : null;
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzac(this.zzbzf.zzcfa);
            com.google.android.gms.ads.internal.zzbv.zzeo().zzqh().zzad(this.zzbzf.zzcfm);
        } catch (zzadu e2) {
            zzc(e2.getErrorCode(), e2.getMessage());
        }
        if (!TextUtils.isEmpty(this.zzbzf.zzcey)) {
            try {
                jSONObject = new JSONObject(this.zzbzf.zzcey);
            } catch (Exception e3) {
                zzakb.zzb("Error parsing the JSON for Active View.", e3);
            }
            if (this.zzbzf.zzcfo == 2) {
                bool = true;
                zzjj zzjjVar = this.zzbuc.zzccv;
                Bundle bundle2 = zzjjVar.zzaqg != null ? zzjjVar.zzaqg : new Bundle();
                if (bundle2.getBundle(AdMobAdapter.class.getName()) != null) {
                    bundle = bundle2.getBundle(AdMobAdapter.class.getName());
                } else {
                    Bundle bundle3 = new Bundle();
                    bundle2.putBundle(AdMobAdapter.class.getName(), bundle3);
                    bundle = bundle3;
                }
                bundle.putBoolean("render_test_label", true);
            }
            if (this.zzbzf.zzcfo == 1) {
                bool = false;
            }
            Boolean valueOf2 = this.zzbzf.zzcfo != 0 ? Boolean.valueOf(zzamm.zzo(this.zzbuc.zzccv)) : bool;
            zzaef zzaefVar = this.zzbuc;
            zzaej zzaejVar2 = this.zzbzf;
            this.zzccf.zza(new zzaji(zzaefVar, zzaejVar2, this.zzbtj, zza, -2, elapsedRealtime, zzaejVar2.zzceu, jSONObject, this.zzcch, valueOf2));
            zzakk.zzcrm.removeCallbacks(this.zzbzg);
        }
        jSONObject = null;
        if (this.zzbzf.zzcfo == 2) {
        }
        if (this.zzbzf.zzcfo == 1) {
        }
        if (this.zzbzf.zzcfo != 0) {
        }
        zzaef zzaefVar2 = this.zzbuc;
        zzaej zzaejVar22 = this.zzbzf;
        this.zzccf.zza(new zzaji(zzaefVar2, zzaejVar22, this.zzbtj, zza, -2, elapsedRealtime, zzaejVar22.zzceu, jSONObject, this.zzcch, valueOf2));
        zzakk.zzcrm.removeCallbacks(this.zzbzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzii zziiVar) {
        zziiVar.zzanm.zzamu = this.zzccg.zzccw.packageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzii zziiVar) {
        zziiVar.zzanh = this.zzccg.zzcdi;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        String string;
        zzakb.zzck("AdLoaderBackgroundTask started.");
        this.zzbzg = new zzads(this);
        zzakk.zzcrm.postDelayed(this.zzbzg, ((Long) zzkb.zzik().zzd(zznk.zzban)).longValue());
        long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbak)).booleanValue() && this.zzccg.zzccv.extras != null && (string = this.zzccg.zzccv.extras.getString("_ad")) != null) {
            zzaef zzaefVar = new zzaef(this.zzccg, elapsedRealtime, null, null, null);
            this.zzbuc = zzaefVar;
            zza(zzafs.zza(this.mContext, zzaefVar, string));
            return;
        }
        zzaop zzaopVar = new zzaop();
        zzaki.zzb(new zzadt(this, zzaopVar));
        String zzz = com.google.android.gms.ads.internal.zzbv.zzfh().zzz(this.mContext);
        String zzaa = com.google.android.gms.ads.internal.zzbv.zzfh().zzaa(this.mContext);
        String zzab = com.google.android.gms.ads.internal.zzbv.zzfh().zzab(this.mContext);
        com.google.android.gms.ads.internal.zzbv.zzfh().zzg(this.mContext, zzab);
        zzaef zzaefVar2 = new zzaef(this.zzccg, elapsedRealtime, zzz, zzaa, zzab);
        this.zzbuc = zzaefVar2;
        zzaopVar.zzk(zzaefVar2);
    }
}
