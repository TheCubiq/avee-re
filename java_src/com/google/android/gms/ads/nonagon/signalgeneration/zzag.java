package com.google.android.gms.ads.nonagon.signalgeneration;

import com.daaw.k43;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzag {
    public final String a;

    public /* synthetic */ zzag(zzae zzaeVar, zzaf zzafVar) {
        String str;
        str = zzaeVar.a;
        this.a = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final k43 zza() {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? k43.AD_INITIATER_UNSPECIFIED : k43.REWARD_BASED_VIDEO_AD : k43.AD_LOADER : k43.INTERSTITIAL : k43.BANNER;
    }

    public final String zzb() {
        return this.a.toLowerCase(Locale.ROOT);
    }

    public final Set zzc() {
        HashSet hashSet = new HashSet();
        hashSet.add(this.a.toLowerCase(Locale.ROOT));
        return hashSet;
    }
}
