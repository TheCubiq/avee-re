package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes2.dex */
public final class r56 implements ServiceConnection {
    public final String a;
    public final /* synthetic */ u66 b;

    public r56(u66 u66Var, String str) {
        this.b = u66Var;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.b.a.i().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            wh3 I = tg3.I(iBinder);
            if (I == null) {
                this.b.a.i().w().a("Install Referrer Service implementation was not found");
                return;
            }
            this.b.a.i().v().a("Install Referrer Service connected");
            this.b.a.r().z(new o46(this, I, this));
        } catch (RuntimeException e) {
            this.b.a.i().w().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.b.a.i().v().a("Install Referrer Service disconnected");
    }
}
