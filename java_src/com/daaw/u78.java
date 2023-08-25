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
import com.daaw.pa;
import com.google.android.gms.common.ConnectionResult;
/* loaded from: classes2.dex */
public final class u78 implements ServiceConnection, pa.a, pa.b {
    public volatile boolean a;
    public volatile ai5 b;
    public final /* synthetic */ x78 c;

    public u78(x78 x78Var) {
        this.c = x78Var;
    }

    @Override // com.daaw.pa.a
    public final void D(int i) {
        ry0.e("MeasurementServiceConnection.onConnectionSuspended");
        this.c.a.i().p().a("Service connection suspended");
        this.c.a.r().z(new o78(this));
    }

    @Override // com.daaw.pa.b
    public final void I(ConnectionResult connectionResult) {
        ry0.e("MeasurementServiceConnection.onConnectionFailed");
        om5 E = this.c.a.E();
        if (E != null) {
            E.w().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.a.r().z(new r78(this));
    }

    @Override // com.daaw.pa.a
    public final void M(Bundle bundle) {
        ry0.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                ry0.j(this.b);
                this.c.a.r().z(new l78(this, (ua5) this.b.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    public final void b(Intent intent) {
        u78 u78Var;
        this.c.f();
        Context d = this.c.a.d();
        fj b = fj.b();
        synchronized (this) {
            if (this.a) {
                this.c.a.i().v().a("Connection attempt already in progress");
                return;
            }
            this.c.a.i().v().a("Using local app measurement service");
            this.a = true;
            u78Var = this.c.c;
            b.a(d, intent, u78Var, 129);
        }
    }

    public final void c() {
        this.c.f();
        Context d = this.c.a.d();
        synchronized (this) {
            if (this.a) {
                this.c.a.i().v().a("Connection attempt already in progress");
            } else if (this.b != null && (this.b.isConnecting() || this.b.isConnected())) {
                this.c.a.i().v().a("Already awaiting connection attempt");
            } else {
                this.b = new ai5(d, Looper.getMainLooper(), this, this);
                this.c.a.i().v().a("Connecting to remote service");
                this.a = true;
                ry0.j(this.b);
                this.b.checkAvailabilityAndConnect();
            }
        }
    }

    public final void d() {
        if (this.b != null && (this.b.isConnected() || this.b.isConnecting())) {
            this.b.disconnect();
        }
        this.b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        u78 u78Var;
        ry0.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.a.i().q().a("Service connected with null binder");
                return;
            }
            ua5 ua5Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    ua5Var = queryLocalInterface instanceof ua5 ? (ua5) queryLocalInterface : new o85(iBinder);
                    this.c.a.i().v().a("Bound to IMeasurementService interface");
                } else {
                    this.c.a.i().q().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.a.i().q().a("Service connect failed to get IMeasurementService");
            }
            if (ua5Var == null) {
                this.a = false;
                try {
                    fj b = fj.b();
                    Context d = this.c.a.d();
                    u78Var = this.c.c;
                    b.c(d, u78Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.a.r().z(new f78(this, ua5Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ry0.e("MeasurementServiceConnection.onServiceDisconnected");
        this.c.a.i().p().a("Service disconnected");
        this.c.a.r().z(new i78(this, componentName));
    }
}
