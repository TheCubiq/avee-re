package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class ta8 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ wa8 f27168a;

    public /* synthetic */ ta8(wa8 wa8Var, qa8 qa8Var) {
        this.f27168a = wa8Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final wa8 wa8Var = this.f27168a;
        wa8.m6260c(wa8Var).post(new Runnable() { // from class: com.daaw.oa8
            @Override // java.lang.Runnable
            public final void run() {
                wa8.m6259d(wa8.this);
            }
        });
    }
}
