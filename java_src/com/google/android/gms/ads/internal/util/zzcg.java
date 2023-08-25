package com.google.android.gms.ads.internal.util;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.daaw.g93;
import com.daaw.qx3;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzcg {
    public boolean d;
    public Context e;
    public boolean c = false;
    @GuardedBy("this")
    public final Map b = new WeakHashMap();
    @GuardedBy("this")
    public final BroadcastReceiver a = new qx3(this);

    public final synchronized void b(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
        }
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzb(Context context) {
        if (this.c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext == null) {
            this.e = context;
        }
        g93.c(this.e);
        this.d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.n3)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.e.registerReceiver(this.a, intentFilter);
        } else {
            this.e.registerReceiver(this.a, intentFilter, 4);
        }
        this.c = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.d) {
            this.b.put(broadcastReceiver, intentFilter);
            return;
        }
        g93.c(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
