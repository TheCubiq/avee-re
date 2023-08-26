package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zztw {
    private final Map<zztx, zzty> zzbok = new HashMap();
    private final LinkedList<zztx> zzbol = new LinkedList<>();
    private zzss zzbom;

    private static void zza(String str, zztx zztxVar) {
        if (zzakb.isLoggable(2)) {
            zzakb.v(String.format(str, zztxVar));
        }
    }

    private static String[] zzax(String str) {
        try {
            String[] split = str.split("\u0000");
            for (int i = 0; i < split.length; i++) {
                split[i] = new String(Base64.decode(split[i], 0), "UTF-8");
            }
            return split;
        } catch (UnsupportedEncodingException unused) {
            return new String[0];
        }
    }

    private static boolean zzay(String str) {
        try {
            return Pattern.matches((String) zzkb.zzik().zzd(zznk.zzazf), str);
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "InterstitialAdPool.isExcludedAdUnit");
            return false;
        }
    }

    private static String zzaz(String str) {
        try {
            Matcher matcher = Pattern.compile("([^/]+/[0-9]+).*").matcher(str);
            return matcher.matches() ? matcher.group(1) : str;
        } catch (RuntimeException unused) {
            return str;
        }
    }

    private static void zzb(Bundle bundle, String str) {
        while (true) {
            String[] split = str.split("/", 2);
            if (split.length == 0) {
                return;
            }
            String str2 = split[0];
            if (split.length == 1) {
                bundle.remove(str2);
                return;
            }
            bundle = bundle.getBundle(str2);
            if (bundle == null) {
                return;
            }
            str = split[1];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set<String> zzh(zzjj zzjjVar) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(zzjjVar.extras.keySet());
        Bundle bundle = zzjjVar.zzaqg.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            hashSet.addAll(bundle.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzjj zzi(zzjj zzjjVar) {
        zzjj zzk = zzk(zzjjVar);
        Bundle bundle = zzk.zzaqg.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle != null) {
            bundle.putBoolean("_skipMediation", true);
        }
        zzk.extras.putBoolean("_skipMediation", true);
        return zzk;
    }

    private static zzjj zzj(zzjj zzjjVar) {
        String[] split;
        zzjj zzk = zzk(zzjjVar);
        for (String str : ((String) zzkb.zzik().zzd(zznk.zzazb)).split(",")) {
            zzb(zzk.zzaqg, str);
            if (str.startsWith("com.google.ads.mediation.admob.AdMobAdapter/")) {
                zzb(zzk.extras, str.replaceFirst("com.google.ads.mediation.admob.AdMobAdapter/", ""));
            }
        }
        return zzk;
    }

    private static zzjj zzk(zzjj zzjjVar) {
        Parcel obtain = Parcel.obtain();
        zzjjVar.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        zzjj createFromParcel = zzjj.CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return ((Boolean) zzkb.zzik().zzd(zznk.zzayo)).booleanValue() ? createFromParcel.zzhv() : createFromParcel;
    }

    private final String zzle() {
        try {
            StringBuilder sb = new StringBuilder();
            Iterator<zztx> it = this.zzbol.iterator();
            while (it.hasNext()) {
                sb.append(Base64.encodeToString(it.next().toString().getBytes("UTF-8"), 0));
                if (it.hasNext()) {
                    sb.append("\u0000");
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zztz zza(zzjj zzjjVar, String str) {
        if (zzay(str)) {
            return null;
        }
        int i = new zzagb(this.zzbom.getApplicationContext()).zzoo().zzcjx;
        zzjj zzj = zzj(zzjjVar);
        String zzaz = zzaz(str);
        zztx zztxVar = new zztx(zzj, zzaz, i);
        zzty zztyVar = this.zzbok.get(zztxVar);
        if (zztyVar == null) {
            zza("Interstitial pool created at %s.", zztxVar);
            zztyVar = new zzty(zzj, zzaz, i);
            this.zzbok.put(zztxVar, zztyVar);
        }
        this.zzbol.remove(zztxVar);
        this.zzbol.add(zztxVar);
        zztyVar.zzli();
        while (this.zzbol.size() > ((Integer) zzkb.zzik().zzd(zznk.zzazc)).intValue()) {
            zztx remove = this.zzbol.remove();
            zzty zztyVar2 = this.zzbok.get(remove);
            zza("Evicting interstitial queue for %s.", remove);
            while (zztyVar2.size() > 0) {
                zztz zzl = zztyVar2.zzl(null);
                if (zzl.zzwa) {
                    zzua.zzlk().zzlm();
                }
                zzl.zzbor.zzdj();
            }
            this.zzbok.remove(remove);
        }
        while (zztyVar.size() > 0) {
            zztz zzl2 = zztyVar.zzl(zzj);
            if (zzl2.zzwa) {
                if (com.google.android.gms.ads.internal.zzbv.zzer().currentTimeMillis() - zzl2.zzbou > ((Integer) zzkb.zzik().zzd(zznk.zzaze)).intValue() * 1000) {
                    zza("Expired interstitial at %s.", zztxVar);
                    zzua.zzlk().zzll();
                }
            }
            String str2 = zzl2.zzbos != null ? " (inline) " : " ";
            StringBuilder sb = new StringBuilder(str2.length() + 34);
            sb.append("Pooled interstitial");
            sb.append(str2);
            sb.append("returned at %s.");
            zza(sb.toString(), zztxVar);
            return zzl2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzss zzssVar) {
        if (this.zzbom == null) {
            zzss zzlc = zzssVar.zzlc();
            this.zzbom = zzlc;
            if (zzlc != null) {
                SharedPreferences sharedPreferences = zzlc.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0);
                while (this.zzbol.size() > 0) {
                    zztx remove = this.zzbol.remove();
                    zzty zztyVar = this.zzbok.get(remove);
                    zza("Flushing interstitial queue for %s.", remove);
                    while (zztyVar.size() > 0) {
                        zztyVar.zzl(null).zzbor.zzdj();
                    }
                    this.zzbok.remove(remove);
                }
                try {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                        if (!entry.getKey().equals("PoolKeys")) {
                            zzuc zzba = zzuc.zzba((String) entry.getValue());
                            zztx zztxVar = new zztx(zzba.zzaao, zzba.zzye, zzba.zzbop);
                            if (!this.zzbok.containsKey(zztxVar)) {
                                this.zzbok.put(zztxVar, new zzty(zzba.zzaao, zzba.zzye, zzba.zzbop));
                                hashMap.put(zztxVar.toString(), zztxVar);
                                zza("Restored interstitial queue for %s.", zztxVar);
                            }
                        }
                    }
                    for (String str : zzax(sharedPreferences.getString("PoolKeys", ""))) {
                        zztx zztxVar2 = (zztx) hashMap.get(str);
                        if (this.zzbok.containsKey(zztxVar2)) {
                            this.zzbol.add(zztxVar2);
                        }
                    }
                } catch (IOException | RuntimeException e) {
                    com.google.android.gms.ads.internal.zzbv.zzeo().zza(e, "InterstitialAdPool.restore");
                    zzakb.zzc("Malformed preferences value for InterstitialAdPool.", e);
                    this.zzbok.clear();
                    this.zzbol.clear();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zzjj zzjjVar, String str) {
        zzss zzssVar = this.zzbom;
        if (zzssVar == null) {
            return;
        }
        int i = new zzagb(zzssVar.getApplicationContext()).zzoo().zzcjx;
        zzjj zzj = zzj(zzjjVar);
        String zzaz = zzaz(str);
        zztx zztxVar = new zztx(zzj, zzaz, i);
        zzty zztyVar = this.zzbok.get(zztxVar);
        if (zztyVar == null) {
            zza("Interstitial pool created at %s.", zztxVar);
            zztyVar = new zzty(zzj, zzaz, i);
            this.zzbok.put(zztxVar, zztyVar);
        }
        zztyVar.zza(this.zzbom, zzjjVar);
        zztyVar.zzli();
        zza("Inline entry added to the queue at %s.", zztxVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzld() {
        int size;
        int zzlg;
        if (this.zzbom == null) {
            return;
        }
        for (Map.Entry<zztx, zzty> entry : this.zzbok.entrySet()) {
            zztx key = entry.getKey();
            zzty value = entry.getValue();
            if (zzakb.isLoggable(2) && (zzlg = value.zzlg()) < (size = value.size())) {
                zzakb.v(String.format("Loading %s/%s pooled interstitials for %s.", Integer.valueOf(size - zzlg), Integer.valueOf(size), key));
            }
            int zzlh = value.zzlh() + 0;
            while (value.size() < ((Integer) zzkb.zzik().zzd(zznk.zzazd)).intValue()) {
                zza("Pooling and loading one new interstitial for %s.", key);
                if (value.zzb(this.zzbom)) {
                    zzlh++;
                }
            }
            zzua.zzlk().zzw(zzlh);
        }
        zzss zzssVar = this.zzbom;
        if (zzssVar != null) {
            SharedPreferences.Editor edit = zzssVar.getApplicationContext().getSharedPreferences("com.google.android.gms.ads.internal.interstitial.InterstitialAdPool", 0).edit();
            edit.clear();
            for (Map.Entry<zztx, zzty> entry2 : this.zzbok.entrySet()) {
                zztx key2 = entry2.getKey();
                zzty value2 = entry2.getValue();
                if (value2.zzlj()) {
                    edit.putString(key2.toString(), new zzuc(value2).zzlu());
                    zza("Saved interstitial queue for %s.", key2);
                }
            }
            edit.putString("PoolKeys", zzle());
            edit.apply();
        }
    }
}
