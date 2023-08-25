package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.daaw.cw1;
import com.daaw.g86;
import com.daaw.i86;
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends cw1 implements g86 {
    public i86 r;

    @Override // com.daaw.g86
    public void a(Context context, Intent intent) {
        cw1.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.r == null) {
            this.r = new i86(this);
        }
        this.r.a(context, intent);
    }
}
