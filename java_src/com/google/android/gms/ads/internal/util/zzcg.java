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

    /* renamed from: d */
    public boolean f36295d;

    /* renamed from: e */
    public Context f36296e;

    /* renamed from: c */
    public boolean f36294c = false;
    @GuardedBy("this")

    /* renamed from: b */
    public final Map f36293b = new WeakHashMap();
    @GuardedBy("this")

    /* renamed from: a */
    public final BroadcastReceiver f36292a = new qx3(this);

    /* renamed from: b */
    public final synchronized void m1340b(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f36293b.entrySet()) {
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
        if (this.f36294c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f36296e = applicationContext;
        if (applicationContext == null) {
            this.f36296e = context;
        }
        g93.m21879c(this.f36296e);
        this.f36295d = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10768n3)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10675e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.f36296e.registerReceiver(this.f36292a, intentFilter);
        } else {
            this.f36296e.registerReceiver(this.f36292a, intentFilter, 4);
        }
        this.f36294c = true;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void zzc(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f36295d) {
            this.f36293b.put(broadcastReceiver, intentFilter);
            return;
        }
        g93.m21879c(context);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10675e9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void zzd(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f36295d) {
            this.f36293b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
