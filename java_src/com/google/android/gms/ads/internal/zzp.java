package com.google.android.gms.ads.internal;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjn;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzp {
    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? zza((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public static Object[] zza(String str, zzjj zzjjVar, String str2, int i, zzjn zzjnVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(str2);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzjjVar.zzapw));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzjjVar.extras));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzjjVar.zzapx));
        }
        if (hashSet.contains("keywords")) {
            if (zzjjVar.zzapy != null) {
                arrayList.add(zzjjVar.zzapy.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzjjVar.zzapz));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzjjVar.zzaqa));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzjjVar.zzaqb));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzjjVar.zzaqc);
        }
        if (hashSet.contains(FirebaseAnalytics.Param.LOCATION)) {
            if (zzjjVar.zzaqe != null) {
                arrayList.add(zzjjVar.zzaqe.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzjjVar.zzaqf);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzjjVar.zzaqg));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzjjVar.zzaqh));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzjjVar.zzaqi != null) {
                arrayList.add(zzjjVar.zzaqi.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzjjVar.zzaqj);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzjjVar.zzaqk);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzjjVar.zzaql));
        }
        return arrayList.toArray();
    }
}
