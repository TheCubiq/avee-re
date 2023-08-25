package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
/* renamed from: com.daaw.kb */
/* loaded from: classes.dex */
public class C1932kb extends AbstractC2703qc<Boolean> {

    /* renamed from: i */
    public static final String f16091i = ll0.m16883f("BatteryChrgTracker");

    public C1932kb(Context context, wj1 wj1Var) {
        super(context, wj1Var);
    }

    @Override // com.daaw.AbstractC2703qc
    /* renamed from: g */
    public IntentFilter mo12626g() {
        String str;
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            str = "android.os.action.DISCHARGING";
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            str = "android.intent.action.ACTION_POWER_DISCONNECTED";
        }
        intentFilter.addAction(str);
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r6.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // com.daaw.AbstractC2703qc
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12625h(Context context, Intent intent) {
        Boolean bool;
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        char c = 1;
        ll0.m16885c().mo16882a(f16091i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -54942926:
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                bool = Boolean.FALSE;
                break;
            case 2:
            case 3:
                bool = Boolean.TRUE;
                break;
            default:
                return;
        }
        m13334d(bool);
    }

    @Override // com.daaw.AbstractC2554pj
    /* renamed from: i */
    public Boolean mo13183b() {
        Intent registerReceiver = this.f22982b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            ll0.m16885c().mo16881b(f16091i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        return Boolean.valueOf(m17844j(registerReceiver));
    }

    /* renamed from: j */
    public final boolean m17844j(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
