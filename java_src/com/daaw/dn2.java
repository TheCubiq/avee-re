package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class dn2 extends BroadcastReceiver {
    public final /* synthetic */ en2 a;

    public dn2(en2 en2Var) {
        this.a = en2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.f();
    }
}
