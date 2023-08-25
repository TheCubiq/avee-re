package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.daaw.AbstractC2527pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes2.dex */
public final class u78 implements ServiceConnection, AbstractC2527pa.InterfaceC2528a, AbstractC2527pa.InterfaceC2529b {

    /* renamed from: a */
    public volatile boolean f28771a;

    /* renamed from: b */
    public volatile ai5 f28772b;

    /* renamed from: c */
    public final /* synthetic */ x78 f28773c;

    public u78(x78 x78Var) {
        this.f28773c = x78Var;
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: D */
    public final void mo5044D(int i) {
        ry0.m10835e("MeasurementServiceConnection.onConnectionSuspended");
        this.f28773c.f25143a.mo3895i().m14161p().m20653a("Service connection suspended");
        this.f28773c.f25143a.mo3882r().m6978z(new o78(this));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2529b
    /* renamed from: I */
    public final void mo2982I(ConnectionResult connectionResult) {
        ry0.m10835e("MeasurementServiceConnection.onConnectionFailed");
        om5 m24054E = this.f28773c.f25143a.m24054E();
        if (m24054E != null) {
            m24054E.m14155w().m20652b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f28771a = false;
            this.f28772b = null;
        }
        this.f28773c.f25143a.mo3882r().m6978z(new r78(this));
    }

    @Override // com.daaw.AbstractC2527pa.InterfaceC2528a
    /* renamed from: M */
    public final void mo2196M(Bundle bundle) {
        ry0.m10835e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                ry0.m10830j(this.f28772b);
                this.f28773c.f25143a.mo3882r().m6978z(new l78(this, (ua5) this.f28772b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f28772b = null;
                this.f28771a = false;
            }
        }
    }

    /* renamed from: b */
    public final void m8446b(Intent intent) {
        u78 u78Var;
        this.f28773c.mo6991f();
        Context mo3905d = this.f28773c.f25143a.mo3905d();
        C1291fj m22614b = C1291fj.m22614b();
        synchronized (this) {
            if (this.f28771a) {
                this.f28773c.f25143a.mo3895i().m14156v().m20653a("Connection attempt already in progress");
                return;
            }
            this.f28773c.f25143a.mo3895i().m14156v().m20653a("Using local app measurement service");
            this.f28771a = true;
            u78Var = this.f28773c.f32172c;
            m22614b.m22615a(mo3905d, intent, u78Var, 129);
        }
    }

    /* renamed from: c */
    public final void m8445c() {
        this.f28773c.mo6991f();
        Context mo3905d = this.f28773c.f25143a.mo3905d();
        synchronized (this) {
            if (this.f28771a) {
                this.f28773c.f25143a.mo3895i().m14156v().m20653a("Connection attempt already in progress");
            } else if (this.f28772b != null && (this.f28772b.isConnecting() || this.f28772b.isConnected())) {
                this.f28773c.f25143a.mo3895i().m14156v().m20653a("Already awaiting connection attempt");
            } else {
                this.f28772b = new ai5(mo3905d, Looper.getMainLooper(), this, this);
                this.f28773c.f25143a.mo3895i().m14156v().m20653a("Connecting to remote service");
                this.f28771a = true;
                ry0.m10830j(this.f28772b);
                this.f28772b.checkAvailabilityAndConnect();
            }
        }
    }

    /* renamed from: d */
    public final void m8444d() {
        if (this.f28772b != null && (this.f28772b.isConnected() || this.f28772b.isConnecting())) {
            this.f28772b.disconnect();
        }
        this.f28772b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u78 u78Var;
        ry0.m10835e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f28771a = false;
                this.f28773c.f25143a.mo3895i().m14160q().m20653a("Service connected with null binder");
                return;
            }
            ua5 ua5Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    ua5Var = queryLocalInterface instanceof ua5 ? (ua5) queryLocalInterface : new o85(iBinder);
                    this.f28773c.f25143a.mo3895i().m14156v().m20653a("Bound to IMeasurementService interface");
                } else {
                    this.f28773c.f25143a.mo3895i().m14160q().m20652b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f28773c.f25143a.mo3895i().m14160q().m20653a("Service connect failed to get IMeasurementService");
            }
            if (ua5Var == null) {
                this.f28771a = false;
                try {
                    C1291fj m22614b = C1291fj.m22614b();
                    Context mo3905d = this.f28773c.f25143a.mo3905d();
                    u78Var = this.f28773c.f32172c;
                    m22614b.m22613c(mo3905d, u78Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f28773c.f25143a.mo3882r().m6978z(new f78(this, ua5Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ry0.m10835e("MeasurementServiceConnection.onServiceDisconnected");
        this.f28773c.f25143a.mo3895i().m14161p().m20653a("Service disconnected");
        this.f28773c.f25143a.mo3882r().m6978z(new i78(this, componentName));
    }
}
