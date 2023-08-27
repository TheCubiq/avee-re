package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
/* loaded from: classes.dex */
public final class zza {
    private static long zzgv;
    private static final IntentFilter filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private static float zzgw = Float.NaN;

    public static int zzg(Context context) {
        boolean isScreenOn;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
        int i = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (PlatformVersion.isAtLeastKitKatWatch()) {
            isScreenOn = powerManager.isInteractive();
        } else {
            isScreenOn = powerManager.isScreenOn();
        }
        return (isScreenOn ? 2 : 0) | i;
    }

    public static synchronized float zzh(Context context) {
        synchronized (zza.class) {
            if (SystemClock.elapsedRealtime() - zzgv < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS && !Float.isNaN(zzgw)) {
                return zzgw;
            }
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, filter);
            if (registerReceiver != null) {
                zzgw = registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
            }
            zzgv = SystemClock.elapsedRealtime();
            return zzgw;
        }
    }
}
