package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.daaw.cw1;
import com.daaw.g86;
import com.daaw.i86;
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends cw1 implements g86 {

    /* renamed from: r */
    public i86 f37052r;

    @Override // com.daaw.g86
    /* renamed from: a */
    public void mo1085a(Context context, Intent intent) {
        cw1.m24947c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f37052r == null) {
            this.f37052r = new i86(this);
        }
        this.f37052r.m20028a(context, intent);
    }
}
