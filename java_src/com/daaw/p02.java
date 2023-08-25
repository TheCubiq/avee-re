package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public final class p02 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f22174a;

    /* renamed from: b */
    public final o02 f22175b;

    public p02(o02 o02Var) {
        this.f22175b = o02Var;
    }

    /* renamed from: a */
    public final void m13774a(Context context) {
        this.f22174a = context;
    }

    /* renamed from: b */
    public final synchronized void m13773b() {
        Context context = this.f22174a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f22174a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22175b.mo14658a();
            m13773b();
        }
    }
}
