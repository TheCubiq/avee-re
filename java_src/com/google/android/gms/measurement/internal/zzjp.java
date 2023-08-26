package com.google.android.gms.measurement.internal;

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
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjp implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zziv zza;
    private volatile boolean zzb;
    private volatile zzeu zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzjp(zziv zzivVar) {
        this.zza = zzivVar;
    }

    public final void zza(Intent intent) {
        zzjp zzjpVar;
        this.zza.zzc();
        Context zzm = this.zza.zzm();
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzq().zzw().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzq().zzw().zza("Using local app measurement service");
            this.zzb = true;
            zzjpVar = this.zza.zza;
            connectionTracker.bindService(zzm, intent, zzjpVar, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    public final void zza() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzjp zzjpVar;
        zzep zzerVar;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.zzb = false;
                this.zza.zzq().zze().zza("Service connected with null binder");
                return;
            }
            zzep zzepVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                        if (queryLocalInterface instanceof zzep) {
                            zzerVar = (zzep) queryLocalInterface;
                        } else {
                            zzerVar = new zzer(iBinder);
                        }
                        zzepVar = zzerVar;
                    }
                    this.zza.zzq().zzw().zza("Bound to IMeasurementService interface");
                } else {
                    this.zza.zzq().zze().zza("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.zza.zzq().zze().zza("Service connect failed to get IMeasurementService");
            }
            if (zzepVar == null) {
                this.zzb = false;
                try {
                    ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                    Context zzm = this.zza.zzm();
                    zzjpVar = this.zza.zza;
                    connectionTracker.unbindService(zzm, zzjpVar);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.zza.zzp().zza(new zzjo(this, zzepVar));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzq().zzv().zza("Service disconnected");
        this.zza.zzp().zza(new zzjr(this, componentName));
    }

    public final void zzb() {
        this.zza.zzc();
        Context zzm = this.zza.zzm();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzq().zzw().zza("Connection attempt already in progress");
            } else if (this.zzc != null && (this.zzc.isConnecting() || this.zzc.isConnected())) {
                this.zza.zzq().zzw().zza("Already awaiting connection attempt");
            } else {
                this.zzc = new zzeu(zzm, Looper.getMainLooper(), this, this);
                this.zza.zzq().zzw().zza("Connecting to remote service");
                this.zzb = true;
                this.zzc.checkAvailabilityAndConnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.zza.zzp().zza(new zzjq(this, this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzq().zzv().zza("Service connection suspended");
        this.zza.zzp().zza(new zzjt(this));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzex zzc = this.zza.zzy.zzc();
        if (zzc != null) {
            zzc.zzh().zza("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzp().zza(new zzjs(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zza(zzjp zzjpVar, boolean z) {
        zzjpVar.zzb = false;
        return false;
    }
}
