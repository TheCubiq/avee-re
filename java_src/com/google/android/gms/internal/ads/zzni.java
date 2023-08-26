package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzni {
    private Context zzatx;
    private final Object mLock = new Object();
    private final ConditionVariable zzatv = new ConditionVariable();
    private volatile boolean zzzv = false;
    private SharedPreferences zzatw = null;

    public final void initialize(Context context) {
        if (this.zzzv) {
            return;
        }
        synchronized (this.mLock) {
            if (this.zzzv) {
                return;
            }
            this.zzatx = context.getApplicationContext() == null ? context : context.getApplicationContext();
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null && context != null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                remoteContext = context;
            }
            if (remoteContext == null) {
                this.zzatv.open();
                return;
            }
            zzkb.zzii();
            this.zzatw = remoteContext.getSharedPreferences("google_ads_flags", 0);
            this.zzzv = true;
            this.zzatv.open();
        }
    }

    public final <T> T zzd(zzna<T> zznaVar) {
        if (this.zzatv.block(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS)) {
            if (!this.zzzv || this.zzatw == null) {
                synchronized (this.mLock) {
                    if (this.zzzv && this.zzatw != null) {
                    }
                    return zznaVar.zzja();
                }
            }
            return (T) zzaml.zza(this.zzatx, new zznj(this, zznaVar));
        }
        throw new IllegalStateException("Flags.initialize() was not called!");
    }
}
