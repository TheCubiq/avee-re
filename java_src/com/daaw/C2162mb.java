package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* renamed from: com.daaw.mb */
/* loaded from: classes.dex */
public class C2162mb extends AbstractC2703qc<Boolean> {

    /* renamed from: i */
    public static final String f18736i = ll0.m16883f("BatteryNotLowTracker");

    public C2162mb(Context context, wj1 wj1Var) {
        super(context, wj1Var);
    }

    @Override // com.daaw.AbstractC2703qc
    /* renamed from: g */
    public IntentFilter mo12626g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // com.daaw.AbstractC2703qc
    /* renamed from: h */
    public void mo12625h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        ll0.m16885c().mo16882a(f18736i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        m13334d(bool);
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: i */
    public Boolean mo13183b() {
        Intent registerReceiver = this.f22982b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            return Boolean.valueOf((registerReceiver.getIntExtra("status", -1) == 1 || ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)) > 0.15f) ? true : true);
        }
        ll0.m16885c().mo16881b(f18736i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }
}
