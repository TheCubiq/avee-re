package com.daaw;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
@Deprecated
/* loaded from: classes.dex */
public abstract class cw1 extends BroadcastReceiver {

    /* renamed from: p */
    public static final SparseArray<PowerManager.WakeLock> f6218p = new SparseArray<>();

    /* renamed from: q */
    public static int f6219q = 1;

    /* renamed from: b */
    public static boolean m24948b(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        SparseArray<PowerManager.WakeLock> sparseArray = f6218p;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            return true;
        }
    }

    /* renamed from: c */
    public static ComponentName m24947c(Context context, Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = f6218p;
        synchronized (sparseArray) {
            int i = f6219q;
            int i2 = i + 1;
            f6219q = i2;
            if (i2 <= 0) {
                f6219q = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000L);
            sparseArray.put(i, newWakeLock);
            return startService;
        }
    }
}
