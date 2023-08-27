package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.math.BigInteger;
import java.util.Locale;
@zzadh
/* loaded from: classes2.dex */
public final class zzajw {
    private static final Object sLock = new Object();
    private static String zzcqq;

    public static String zzc(Context context, String str, String str2) {
        String str3;
        String str4;
        synchronized (sLock) {
            if (zzcqq == null && !TextUtils.isEmpty(str)) {
                try {
                    ClassLoader classLoader = context.createPackageContext(str2, 3).getClassLoader();
                    Class<?> cls = Class.forName("com.google.ads.mediation.MediationAdapter", false, classLoader);
                    BigInteger bigInteger = new BigInteger(new byte[1]);
                    String[] split = str.split(",");
                    for (int i = 0; i < split.length; i++) {
                        com.google.android.gms.ads.internal.zzbv.zzek();
                        if (zzakk.zza(classLoader, cls, split[i])) {
                            bigInteger = bigInteger.setBit(i);
                        }
                    }
                    str4 = String.format(Locale.US, "%X", bigInteger);
                } catch (Throwable unused) {
                    str4 = NotificationCompat.CATEGORY_ERROR;
                }
                zzcqq = str4;
            }
            str3 = zzcqq;
        }
        return str3;
    }

    public static String zzqn() {
        String str;
        synchronized (sLock) {
            str = zzcqq;
        }
        return str;
    }
}
