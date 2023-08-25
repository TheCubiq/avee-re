package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.daaw.d04;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzp {
    public static final zzp zza = new zzp();

    public final zzl zza(Context context, zzdx zzdxVar) {
        Context context2;
        List list;
        zzc zzcVar;
        String str;
        Date zzo = zzdxVar.zzo();
        long time = zzo != null ? zzo.getTime() : -1L;
        String zzl = zzdxVar.zzl();
        int zza2 = zzdxVar.zza();
        Set zzr = zzdxVar.zzr();
        if (zzr.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(zzr));
            context2 = context;
        }
        boolean zzt = zzdxVar.zzt(context2);
        Bundle zzf = zzdxVar.zzf(AdMobAdapter.class);
        AdInfo zzi = zzdxVar.zzi();
        if (zzi != null) {
            QueryInfo queryInfo = zzi.getQueryInfo();
            zzcVar = new zzc(zzdxVar.zzi().getAdString(), queryInfo != null ? queryInfo.zza().a() : "");
        } else {
            zzcVar = null;
        }
        String zzm = zzdxVar.zzm();
        SearchAdRequest zzj = zzdxVar.zzj();
        zzfh zzfhVar = zzj != null ? new zzfh(zzj) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zzb();
            str = d04.w(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzs = zzdxVar.zzs();
        RequestConfiguration zzc = zzej.zzf().zzc();
        return new zzl(8, time, zzf, zza2, list, zzt, Math.max(zzdxVar.zzc(), zzc.getTagForChildDirectedTreatment()), false, zzm, zzfhVar, null, zzl, zzdxVar.zzg(), zzdxVar.zze(), Collections.unmodifiableList(new ArrayList(zzdxVar.zzq())), zzdxVar.zzn(), str, zzs, zzcVar, Math.max(-1, zzc.getTagForUnderAgeOfConsent()), (String) Collections.max(Arrays.asList(null, zzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzo
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list2 = RequestConfiguration.zza;
                return list2.indexOf((String) obj) - list2.indexOf((String) obj2);
            }
        }), zzdxVar.zzp(), zzdxVar.zzb(), zzdxVar.zzk());
    }
}
