package com.daaw;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzay;
/* loaded from: classes.dex */
public final class tj6 {
    public static zze a(Throwable th) {
        if (th instanceof uq5) {
            uq5 uq5Var = (uq5) th;
            return c(uq5Var.a(), uq5Var.b());
        } else if (th instanceof gi5) {
            return th.getMessage() == null ? d(((gi5) th).a(), null, null) : d(((gi5) th).a(), th.getMessage(), null);
        } else if (th instanceof zzay) {
            zzay zzayVar = (zzay) th;
            return new zze(zzayVar.zza(), hz6.c(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return d(1, null, null);
        }
    }

    public static zze b(Throwable th, vq5 vq5Var) {
        zze zzeVar;
        zze a = a(th);
        int i = a.zza;
        if ((i == 3 || i == 0) && (zzeVar = a.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            a.zzd = null;
        }
        if (vq5Var != null) {
            a.zze = vq5Var.b();
        }
        return a;
    }

    public static zze c(int i, zze zzeVar) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) zzba.zzc().b(g93.w7)).intValue() > 0) {
                    return zzeVar;
                }
                i = 8;
            }
            return d(i, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.ads.internal.client.zze d(int r8, java.lang.String r9, com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.tj6.d(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
