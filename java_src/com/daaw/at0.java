package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.daaw.k3;
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class at0 implements k3.f, ServiceConnection {
    public static final String l = at0.class.getSimpleName();
    public final String a;
    public final String b;
    public final ComponentName c;
    public final Context d;
    public final ej e;
    public final Handler f;
    public final du0 g;
    public IBinder h;
    public boolean i;
    public String j;
    public String k;

    @Override // com.daaw.k3.f
    public final Set<Scope> a() {
        return Collections.emptySet();
    }

    public final /* synthetic */ void c() {
        this.i = false;
        this.h = null;
        g("Disconnected.");
        this.e.D(1);
    }

    @Override // com.daaw.k3.f
    public final void connect(pa.c cVar) {
        f();
        g("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.a).setAction(this.b);
            }
            boolean bindService = this.d.bindService(intent, this, u70.a());
            this.i = bindService;
            if (!bindService) {
                this.h = null;
                this.g.I(new ConnectionResult(16));
            }
            g("Finished connect.");
        } catch (SecurityException e) {
            this.i = false;
            this.h = null;
            throw e;
        }
    }

    public final /* synthetic */ void d(IBinder iBinder) {
        this.i = false;
        this.h = iBinder;
        g("Connected.");
        this.e.M(new Bundle());
    }

    @Override // com.daaw.k3.f
    public final void disconnect() {
        f();
        g("Disconnect called.");
        try {
            this.d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.i = false;
        this.h = null;
    }

    @Override // com.daaw.k3.f
    public final void disconnect(String str) {
        f();
        this.j = str;
        disconnect();
    }

    public final void e(String str) {
        this.k = str;
    }

    public final void f() {
        if (Thread.currentThread() != this.f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void g(String str) {
        String.valueOf(this.h);
    }

    @Override // com.daaw.k3.f
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // com.daaw.k3.f
    public final String getEndpointPackageName() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ry0.j(this.c);
        return this.c.getPackageName();
    }

    @Override // com.daaw.k3.f
    public final String getLastDisconnectMessage() {
        return this.j;
    }

    @Override // com.daaw.k3.f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.daaw.k3.f
    public final void getRemoteService(com.google.android.gms.common.internal.b bVar, Set<Scope> set) {
    }

    @Override // com.daaw.k3.f
    public final boolean isConnected() {
        f();
        return this.h != null;
    }

    @Override // com.daaw.k3.f
    public final boolean isConnecting() {
        f();
        return this.i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f.post(new Runnable() { // from class: com.daaw.z02
            @Override // java.lang.Runnable
            public final void run() {
                at0.this.d(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.post(new Runnable() { // from class: com.daaw.y02
            @Override // java.lang.Runnable
            public final void run() {
                at0.this.c();
            }
        });
    }

    @Override // com.daaw.k3.f
    public final void onUserSignOut(pa.e eVar) {
    }

    @Override // com.daaw.k3.f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.daaw.k3.f
    public final boolean requiresSignIn() {
        return false;
    }
}
