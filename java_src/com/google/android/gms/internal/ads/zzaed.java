package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
@zzadh
/* loaded from: classes2.dex */
public final class zzaed extends zzadz implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    private Context mContext;
    private final Object mLock;
    private zzaol<zzaef> zzccp;
    private final zzadx zzccq;
    private zzaee zzcct;
    private zzang zzyf;

    public zzaed(Context context, zzang zzangVar, zzaol<zzaef> zzaolVar, zzadx zzadxVar) {
        super(zzaolVar, zzadxVar);
        this.mLock = new Object();
        this.mContext = context;
        this.zzyf = zzangVar;
        this.zzccp = zzaolVar;
        this.zzccq = zzadxVar;
        zzaee zzaeeVar = new zzaee(context, ((Boolean) zzkb.zzik().zzd(zznk.zzavz)).booleanValue() ? com.google.android.gms.ads.internal.zzbv.zzez().zzsa() : context.getMainLooper(), this, this);
        this.zzcct = zzaeeVar;
        zzaeeVar.checkAvailabilityAndConnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zznt();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzakb.zzck("Cannot connect to remote service, fallback to local instance.");
        new zzaec(this.mContext, this.zzccp, this.zzccq).zznt();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        com.google.android.gms.ads.internal.zzbv.zzek().zzb(this.mContext, this.zzyf.zzcw, "gmob-apps", bundle, true);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzakb.zzck("Disconnected from remote ad request service.");
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final void zznz() {
        synchronized (this.mLock) {
            if (this.zzcct.isConnected() || this.zzcct.isConnecting()) {
                this.zzcct.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadz
    public final zzaen zzoa() {
        zzaen zzob;
        synchronized (this.mLock) {
            try {
                try {
                    zzob = this.zzcct.zzob();
                } catch (DeadObjectException | IllegalStateException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzob;
    }
}
