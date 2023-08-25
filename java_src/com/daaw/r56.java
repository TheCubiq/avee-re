package com.daaw;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* loaded from: classes2.dex */
public final class r56 implements ServiceConnection {

    /* renamed from: a */
    public final String f24866a;

    /* renamed from: b */
    public final /* synthetic */ u66 f24867b;

    public r56(u66 u66Var, String str) {
        this.f24867b = u66Var;
        this.f24866a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f24867b.f28593a.mo3895i().m14155w().m20653a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            wh3 m9179I = tg3.m9179I(iBinder);
            if (m9179I == null) {
                this.f24867b.f28593a.mo3895i().m14155w().m20653a("Install Referrer Service implementation was not found");
                return;
            }
            this.f24867b.f28593a.mo3895i().m14156v().m20653a("Install Referrer Service connected");
            this.f24867b.f28593a.mo3882r().m6978z(new o46(this, m9179I, this));
        } catch (RuntimeException e) {
            this.f24867b.f28593a.mo3895i().m14155w().m20652b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f24867b.f28593a.mo3895i().m14156v().m20653a("Install Referrer Service disconnected");
    }
}
