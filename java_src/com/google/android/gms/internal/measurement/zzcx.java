package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzcx implements zzcs {
    private static zzcx zza;
    @Nullable
    private final Context zzb;
    @Nullable
    private final ContentObserver zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcx zza(Context context) {
        zzcx zzcxVar;
        synchronized (zzcx.class) {
            if (zza == null) {
                zza = PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzcx(context) : new zzcx();
            }
            zzcxVar = zza;
        }
        return zzcxVar;
    }

    private zzcx(Context context) {
        this.zzb = context;
        this.zzc = new zzcz(this, null);
        context.getContentResolver().registerContentObserver(zzck.zza, true, this.zzc);
    }

    private zzcx() {
        this.zzb = null;
        this.zzc = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.zzcs
    /* renamed from: zzc */
    public final String zza(final String str) {
        if (this.zzb == null) {
            return null;
        }
        try {
            return (String) zzcv.zza(new zzcu(this, str) { // from class: com.google.android.gms.internal.measurement.zzcw
                private final zzcx zza;
                private final String zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = str;
                }

                @Override // com.google.android.gms.internal.measurement.zzcu
                public final Object zza() {
                    return this.zza.zzb(this.zzb);
                }
            });
        } catch (IllegalStateException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void zza() {
        synchronized (zzcx.class) {
            if (zza != null && zza.zzb != null && zza.zzc != null) {
                zza.zzb.getContentResolver().unregisterContentObserver(zza.zzc);
            }
            zza = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzb(String str) {
        return zzck.zza(this.zzb.getContentResolver(), str, (String) null);
    }
}
