package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public class zzcm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();
    private static boolean zzc = false;

    private zzcm() {
    }

    public static boolean zza() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean zza(Context context) {
        return !zza() || zzc(context);
    }

    private static boolean zzb(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (zza == null) {
                zza = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = zza;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                zza = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            zza = null;
        }
        return z;
    }

    private static boolean zzc(Context context) {
        if (zzb) {
            return true;
        }
        synchronized (zzcm.class) {
            if (zzb) {
                return true;
            }
            boolean zzb2 = zzb(context);
            if (zzb2) {
                zzb = zzb2;
            }
            return zzb2;
        }
    }
}
