package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.daaw.AbstractC2527pa;
import com.daaw.C1897k3;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.InterfaceC3989b;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes.dex */
public final class at0 implements C1897k3.InterfaceC1906f, ServiceConnection {

    /* renamed from: l */
    public static final String f3541l = at0.class.getSimpleName();

    /* renamed from: a */
    public final String f3542a;

    /* renamed from: b */
    public final String f3543b;

    /* renamed from: c */
    public final ComponentName f3544c;

    /* renamed from: d */
    public final Context f3545d;

    /* renamed from: e */
    public final InterfaceC1192ej f3546e;

    /* renamed from: f */
    public final Handler f3547f;

    /* renamed from: g */
    public final du0 f3548g;

    /* renamed from: h */
    public IBinder f3549h;

    /* renamed from: i */
    public boolean f3550i;

    /* renamed from: j */
    public String f3551j;

    /* renamed from: k */
    public String f3552k;

    @Override // com.daaw.C1897k3.InterfaceC1906f
    /* renamed from: a */
    public final Set<Scope> mo9478a() {
        return Collections.emptySet();
    }

    /* renamed from: c */
    public final /* synthetic */ void m27093c() {
        this.f3550i = false;
        this.f3549h = null;
        m27089g("Disconnected.");
        this.f3546e.mo20267D(1);
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final void connect(AbstractC2527pa.InterfaceC2530c interfaceC2530c) {
        m27090f();
        m27089g("Connect started.");
        if (isConnected()) {
            try {
                disconnect("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f3544c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f3542a).setAction(this.f3543b);
            }
            boolean bindService = this.f3545d.bindService(intent, this, u70.m8462a());
            this.f3550i = bindService;
            if (!bindService) {
                this.f3549h = null;
                this.f3548g.mo20262I(new ConnectionResult(16));
            }
            m27089g("Finished connect.");
        } catch (SecurityException e) {
            this.f3550i = false;
            this.f3549h = null;
            throw e;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void m27092d(IBinder iBinder) {
        this.f3550i = false;
        this.f3549h = iBinder;
        m27089g("Connected.");
        this.f3546e.mo20258M(new Bundle());
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final void disconnect() {
        m27090f();
        m27089g("Disconnect called.");
        try {
            this.f3545d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f3550i = false;
        this.f3549h = null;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final void disconnect(String str) {
        m27090f();
        this.f3551j = str;
        disconnect();
    }

    /* renamed from: e */
    public final void m27091e(String str) {
        this.f3552k = str;
    }

    /* renamed from: f */
    public final void m27090f() {
        if (Thread.currentThread() != this.f3547f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: g */
    public final void m27089g(String str) {
        String.valueOf(this.f3549h);
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final Feature[] getAvailableFeatures() {
        return new Feature[0];
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final String getEndpointPackageName() {
        String str = this.f3542a;
        if (str != null) {
            return str;
        }
        ry0.m10830j(this.f3544c);
        return this.f3544c.getPackageName();
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final String getLastDisconnectMessage() {
        return this.f3551j;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final int getMinApkVersion() {
        return 0;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final void getRemoteService(InterfaceC3989b interfaceC3989b, Set<Scope> set) {
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final boolean isConnected() {
        m27090f();
        return this.f3549h != null;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final boolean isConnecting() {
        m27090f();
        return this.f3550i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f3547f.post(new Runnable() { // from class: com.daaw.z02
            @Override // java.lang.Runnable
            public final void run() {
                at0.this.m27092d(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f3547f.post(new Runnable() { // from class: com.daaw.y02
            @Override // java.lang.Runnable
            public final void run() {
                at0.this.m27093c();
            }
        });
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final void onUserSignOut(AbstractC2527pa.InterfaceC2532e interfaceC2532e) {
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final boolean requiresGooglePlayServices() {
        return false;
    }

    @Override // com.daaw.C1897k3.InterfaceC1906f
    public final boolean requiresSignIn() {
        return false;
    }
}
