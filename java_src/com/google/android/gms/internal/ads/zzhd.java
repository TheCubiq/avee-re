package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
@zzadh
/* loaded from: classes2.dex */
public final class zzhd {
    private Context mContext;
    private zzhk zzajr;
    private zzho zzajs;
    private final Runnable zzajq = new zzhe(this);
    private final Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.mLock) {
            if (this.mContext != null && this.zzajr == null) {
                zzhk zzhkVar = new zzhk(this.mContext, com.google.android.gms.ads.internal.zzbv.zzez().zzsa(), new zzhg(this), new zzhh(this));
                this.zzajr = zzhkVar;
                zzhkVar.checkAvailabilityAndConnect();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.mLock) {
            if (this.zzajr == null) {
                return;
            }
            if (this.zzajr.isConnected() || this.zzajr.isConnecting()) {
                this.zzajr.disconnect();
            }
            this.zzajr = null;
            this.zzajs = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzhk zza(zzhd zzhdVar, zzhk zzhkVar) {
        zzhdVar.zzajr = null;
        return null;
    }

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mContext != null) {
                return;
            }
            this.mContext = context.getApplicationContext();
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbdo)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzkb.zzik().zzd(zznk.zzbdn)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzbv.zzen().zza(new zzhf(this));
                }
            }
        }
    }

    public final zzhi zza(zzhl zzhlVar) {
        synchronized (this.mLock) {
            if (this.zzajs == null) {
                return new zzhi();
            }
            try {
                return this.zzajs.zza(zzhlVar);
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call into cache service.", e);
                return new zzhi();
            }
        }
    }

    public final void zzhh() {
        if (((Boolean) zzkb.zzik().zzd(zznk.zzbdp)).booleanValue()) {
            synchronized (this.mLock) {
                connect();
                com.google.android.gms.ads.internal.zzbv.zzek();
                zzakk.zzcrm.removeCallbacks(this.zzajq);
                com.google.android.gms.ads.internal.zzbv.zzek();
                zzakk.zzcrm.postDelayed(this.zzajq, ((Long) zzkb.zzik().zzd(zznk.zzbdq)).longValue());
            }
        }
    }
}
