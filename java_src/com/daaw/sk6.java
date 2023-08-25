package com.daaw;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
/* loaded from: classes.dex */
public final class sk6 implements rk6 {

    /* renamed from: a */
    public final Object[] f26342a;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sk6(zzl zzlVar, String str, int i, String str2, zzw zzwVar) {
        String string;
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.zzb));
        }
        if (!hashSet.contains("extras")) {
            string = hashSet.contains("npa") ? zzlVar.zzc.getString("npa") : string;
            if (hashSet.contains("gender")) {
                arrayList.add(Integer.valueOf(zzlVar.zzd));
            }
            if (hashSet.contains("keywords")) {
                List list = zzlVar.zze;
                if (list != null) {
                    arrayList.add(list.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("isTestDevice")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzf));
            }
            if (hashSet.contains("tagForChildDirectedTreatment")) {
                arrayList.add(Integer.valueOf(zzlVar.zzg));
            }
            if (hashSet.contains("manualImpressionsEnabled")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzh));
            }
            if (hashSet.contains("publisherProvidedId")) {
                arrayList.add(zzlVar.zzi);
            }
            if (hashSet.contains("location")) {
                Location location = zzlVar.zzk;
                if (location != null) {
                    arrayList.add(location.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("contentUrl")) {
                arrayList.add(zzlVar.zzl);
            }
            if (hashSet.contains("networkExtras")) {
                arrayList.add(m10226a(zzlVar.zzm));
            }
            if (hashSet.contains("customTargeting")) {
                arrayList.add(m10226a(zzlVar.zzn));
            }
            if (hashSet.contains("categoryExclusions")) {
                List list2 = zzlVar.zzo;
                if (list2 != null) {
                    arrayList.add(list2.toString());
                } else {
                    arrayList.add(null);
                }
            }
            if (hashSet.contains("requestAgent")) {
                arrayList.add(zzlVar.zzp);
            }
            if (hashSet.contains("requestPackage")) {
                arrayList.add(zzlVar.zzq);
            }
            if (hashSet.contains("isDesignedForFamilies")) {
                arrayList.add(Boolean.valueOf(zzlVar.zzr));
            }
            if (hashSet.contains("tagForUnderAgeOfConsent")) {
                arrayList.add(Integer.valueOf(zzlVar.zzt));
            }
            if (hashSet.contains("maxAdContentRating")) {
                arrayList.add(zzlVar.zzu);
            }
            if (hashSet.contains("orientation")) {
                if (zzwVar != null) {
                    arrayList.add(Integer.valueOf(zzwVar.zza));
                } else {
                    arrayList.add(null);
                }
            }
            this.f26342a = arrayList.toArray();
        }
        m10226a(zzlVar.zzc);
        arrayList.add(string);
        if (hashSet.contains("gender")) {
        }
        if (hashSet.contains("keywords")) {
        }
        if (hashSet.contains("isTestDevice")) {
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
        }
        if (hashSet.contains("publisherProvidedId")) {
        }
        if (hashSet.contains("location")) {
        }
        if (hashSet.contains("contentUrl")) {
        }
        if (hashSet.contains("networkExtras")) {
        }
        if (hashSet.contains("customTargeting")) {
        }
        if (hashSet.contains("categoryExclusions")) {
        }
        if (hashSet.contains("requestAgent")) {
        }
        if (hashSet.contains("requestPackage")) {
        }
        if (hashSet.contains("isDesignedForFamilies")) {
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
        }
        if (hashSet.contains("maxAdContentRating")) {
        }
        if (hashSet.contains("orientation")) {
        }
        this.f26342a = arrayList.toArray();
    }

    /* renamed from: a */
    public static String m10226a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            sb.append(obj == null ? "null" : obj instanceof Bundle ? m10226a((Bundle) obj) : obj.toString());
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sk6) {
            return Arrays.equals(this.f26342a, ((sk6) obj).f26342a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26342a);
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f26342a);
        String arrays = Arrays.toString(this.f26342a);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
