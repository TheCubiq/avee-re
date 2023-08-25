package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public abstract class qc<T> extends pj<T> {
    public static final String h = ll0.f("BrdcstRcvrCnstrntTrckr");
    public final BroadcastReceiver g;

    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                qc.this.h(context, intent);
            }
        }
    }

    public qc(Context context, wj1 wj1Var) {
        super(context, wj1Var);
        this.g = new a();
    }

    @Override // com.daaw.pj
    public void e() {
        ll0.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, g());
    }

    @Override // com.daaw.pj
    public void f() {
        ll0.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
