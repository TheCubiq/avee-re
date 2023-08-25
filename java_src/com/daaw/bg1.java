package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public class bg1 extends AbstractC2703qc<Boolean> {

    /* renamed from: i */
    public static final String f4781i = ll0.m16883f("StorageNotLowTracker");

    public bg1(Context context, wj1 wj1Var) {
        super(context, wj1Var);
    }

    @Override // com.daaw.AbstractC2703qc
    /* renamed from: g */
    public IntentFilter mo12626g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // com.daaw.AbstractC2703qc
    /* renamed from: h */
    public void mo12625h(Context context, Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        ll0.m16885c().mo16882a(f4781i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        m13334d(bool);
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: i */
    public Boolean mo13183b() {
        Intent registerReceiver = this.f22982b.registerReceiver(null, mo12626g());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
