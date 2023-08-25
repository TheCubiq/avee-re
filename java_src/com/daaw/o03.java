package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class o03 extends BroadcastReceiver {
    public final /* synthetic */ r03 a;

    public o03(r03 r03Var) {
        this.a = r03Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.j(3);
    }
}
