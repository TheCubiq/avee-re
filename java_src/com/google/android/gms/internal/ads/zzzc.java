package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;
import com.google.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.HashSet;
@zzadh
/* loaded from: classes2.dex */
public final class zzzc {
    public static int zza(AdRequest.ErrorCode errorCode) {
        int i = zzzd.zzbvg[errorCode.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return i != 4 ? 0 : 3;
            }
            return 2;
        }
        return 1;
    }

    public static MediationAdRequest zza(zzjj zzjjVar, boolean z) {
        HashSet hashSet = zzjjVar.zzapy != null ? new HashSet(zzjjVar.zzapy) : null;
        Date date = new Date(zzjjVar.zzapw);
        int i = zzjjVar.zzapx;
        return new MediationAdRequest(date, i != 1 ? i != 2 ? AdRequest.Gender.UNKNOWN : AdRequest.Gender.FEMALE : AdRequest.Gender.MALE, hashSet, z, zzjjVar.zzaqe);
    }
}
