package com.daaw;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class gf5 extends bi3 {

    /* renamed from: p */
    public final jf5 f11151p;

    /* renamed from: q */
    public final ef5 f11152q;

    /* renamed from: r */
    public final Map f11153r = new HashMap();

    public gf5(jf5 jf5Var, ef5 ef5Var) {
        this.f11151p = jf5Var;
        this.f11152q = ef5Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: h3 */
    public static zzl m21718h3(Map map) {
        char c;
        zzm zzmVar = new zzm();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zzmVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                switch (nextName.hashCode()) {
                    case -1289032093:
                        if (nextName.equals("extras")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -839117230:
                        if (nextName.equals("isTestDevice")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -733436947:
                        if (nextName.equals("tagForUnderAgeOfConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -99890337:
                        if (nextName.equals("httpTimeoutMillis")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 523149226:
                        if (nextName.equals("keywords")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 597632527:
                        if (nextName.equals("maxAdContentRating")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1411582723:
                        if (nextName.equals("tagForChildDirectedTreatment")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zzmVar.zzb(bundle);
                        break;
                    case 1:
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zzmVar.zze(arrayList);
                        break;
                    case 2:
                        zzmVar.zzd(jsonReader.nextBoolean());
                        break;
                    case 3:
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzg(0);
                            break;
                        } else {
                            zzmVar.zzg(1);
                            break;
                        }
                    case 4:
                        if (!jsonReader.nextBoolean()) {
                            zzmVar.zzh(0);
                            break;
                        } else {
                            zzmVar.zzh(1);
                            break;
                        }
                    case 5:
                        String nextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(nextString)) {
                            break;
                        } else {
                            zzmVar.zzf(nextString);
                            break;
                        }
                    case 6:
                        zzmVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            k04.zze("Ad Request json was malformed, parsing ended early.");
        }
        zzl zza = zzmVar.zza();
        Bundle bundle2 = zza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zza.zzc;
            zza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzl(zza.zza, zza.zzb, bundle2, zza.zzd, zza.zze, zza.zzf, zza.zzg, zza.zzh, zza.zzi, zza.zzj, zza.zzk, zza.zzl, zza.zzm, zza.zzn, zza.zzo, zza.zzp, zza.zzq, zza.zzr, zza.zzs, zza.zzt, zza.zzu, zza.zzv, zza.zzw, zza.zzx);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r0.equals("create_interstitial_ad") != false) goto L26;
     */
    @Override // com.daaw.ci3
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo18491f(String str) {
        char c;
        if (((Boolean) zzba.zzc().m23658b(g93.f10420F8)).booleanValue()) {
            zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri parse = Uri.parse(str);
            zzt.zzp();
            Map zzL = zzs.zzL(parse);
            String str2 = (String) zzL.get("action");
            if (TextUtils.isEmpty(str2)) {
                k04.zze("H5 gmsg did not contain an action");
                return;
            }
            int hashCode = str2.hashCode();
            char c2 = 0;
            if (hashCode != 579053441) {
                if (hashCode == 871091088 && str2.equals("initialize")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str2.equals("dispose_all")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                this.f11153r.clear();
                this.f11152q.m23522a();
            } else if (c == 1) {
                for (ze5 ze5Var : this.f11153r.values()) {
                    ze5Var.zza();
                }
                this.f11153r.clear();
            } else {
                String str3 = (String) zzL.get("obj_id");
                try {
                    str3.getClass();
                    long parseLong = Long.parseLong(str3);
                    switch (str2.hashCode()) {
                        case -1790951212:
                            if (str2.equals("show_interstitial_ad")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1266374734:
                            if (str2.equals("show_rewarded_ad")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -257098725:
                            if (str2.equals("load_rewarded_ad")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 393881811:
                            break;
                        case 585513149:
                            if (str2.equals("load_interstitial_ad")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1671767583:
                            if (str2.equals("dispose")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 2109237041:
                            if (str2.equals("create_rewarded_ad")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                            if (this.f11153r.size() >= ((Integer) zzba.zzc().m23658b(g93.f10430G8)).intValue()) {
                                k04.zzj("Could not create H5 ad, too many existing objects");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            Map map = this.f11153r;
                            Long valueOf = Long.valueOf(parseLong);
                            if (map.containsKey(valueOf)) {
                                k04.zze("Could not create H5 ad, object ID already exists");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            String str4 = (String) zzL.get("ad_unit");
                            if (TextUtils.isEmpty(str4)) {
                                k04.zzj("Could not create H5 ad, missing ad unit id");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            af5 zzb = this.f11151p.zzb();
                            zzb.mo17050a(parseLong);
                            zzb.zza(str4);
                            this.f11153r.put(valueOf, zzb.zzc().zza());
                            this.f11152q.m23515h(parseLong);
                            zze.zza("Created H5 interstitial #" + parseLong + " with ad unit " + str4);
                            return;
                        case 1:
                            ze5 ze5Var2 = (ze5) this.f11153r.get(Long.valueOf(parseLong));
                            if (ze5Var2 != null) {
                                ze5Var2.mo2418a(m21718h3(zzL));
                                return;
                            }
                            k04.zze("Could not load H5 ad, object ID does not exist");
                            this.f11152q.m23517f(parseLong);
                            return;
                        case 2:
                            ze5 ze5Var3 = (ze5) this.f11153r.get(Long.valueOf(parseLong));
                            if (ze5Var3 != null) {
                                ze5Var3.zzc();
                                return;
                            }
                            k04.zze("Could not show H5 ad, object ID does not exist");
                            this.f11152q.m23517f(parseLong);
                            return;
                        case 3:
                            if (this.f11153r.size() >= ((Integer) zzba.zzc().m23658b(g93.f10430G8)).intValue()) {
                                k04.zzj("Could not create H5 ad, too many existing objects");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            Map map2 = this.f11153r;
                            Long valueOf2 = Long.valueOf(parseLong);
                            if (map2.containsKey(valueOf2)) {
                                k04.zze("Could not create H5 ad, object ID already exists");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            String str5 = (String) zzL.get("ad_unit");
                            if (TextUtils.isEmpty(str5)) {
                                k04.zzj("Could not create H5 ad, missing ad unit id");
                                this.f11152q.m23514i(parseLong);
                                return;
                            }
                            af5 zzb2 = this.f11151p.zzb();
                            zzb2.mo17050a(parseLong);
                            zzb2.zza(str5);
                            this.f11153r.put(valueOf2, zzb2.zzc().zzb());
                            this.f11152q.m23515h(parseLong);
                            zze.zza("Created H5 rewarded #" + parseLong + " with ad unit " + str5);
                            return;
                        case 4:
                            ze5 ze5Var4 = (ze5) this.f11153r.get(Long.valueOf(parseLong));
                            if (ze5Var4 != null) {
                                ze5Var4.mo2418a(m21718h3(zzL));
                                return;
                            }
                            k04.zze("Could not load H5 ad, object ID does not exist");
                            this.f11152q.m23506q(parseLong);
                            return;
                        case 5:
                            ze5 ze5Var5 = (ze5) this.f11153r.get(Long.valueOf(parseLong));
                            if (ze5Var5 != null) {
                                ze5Var5.zzc();
                                return;
                            }
                            k04.zze("Could not show H5 ad, object ID does not exist");
                            this.f11152q.m23506q(parseLong);
                            return;
                        case 6:
                            Map map3 = this.f11153r;
                            Long valueOf3 = Long.valueOf(parseLong);
                            ze5 ze5Var6 = (ze5) map3.get(valueOf3);
                            if (ze5Var6 == null) {
                                k04.zze("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            ze5Var6.zza();
                            this.f11153r.remove(valueOf3);
                            zze.zza("Disposed H5 ad #" + parseLong);
                            return;
                        default:
                            k04.zze("H5 gmsg contained invalid action: ".concat(str2));
                            return;
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                    k04.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
                }
            }
        }
    }

    @Override // com.daaw.ci3
    public final void zze() {
        this.f11153r.clear();
    }
}
