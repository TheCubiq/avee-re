package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class n26 implements i76 {

    /* renamed from: a */
    public final g77 f19431a;

    /* renamed from: b */
    public final Context f19432b;

    public n26(g77 g77Var, Context context) {
        this.f19431a = g77Var;
        this.f19432b = context;
    }

    /* renamed from: a */
    public final /* synthetic */ o26 m15563a() {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) zzba.zzc().m23658b(g93.f10675e9)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.f19432b.registerReceiver(null, intentFilter) : this.f19432b.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new o26(d, z);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 14;
    }

    @Override // com.daaw.i76
    @SuppressLint({"UnprotectedReceiver"})
    public final f77 zzb() {
        return this.f19431a.mo20112M(new Callable() { // from class: com.daaw.m26
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return n26.this.m15563a();
            }
        });
    }
}
