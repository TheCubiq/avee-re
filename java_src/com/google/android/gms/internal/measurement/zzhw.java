package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhv;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: classes2.dex */
final class zzhw implements zzjd {
    private static final zzhw zza = new zzhw();

    private zzhw() {
    }

    public static zzhw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final boolean zza(Class<?> cls) {
        return zzhv.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.zzjd
    public final zzje zzb(Class<?> cls) {
        if (!zzhv.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzje) zzhv.zza((Class<zzhv>) cls.asSubclass(zzhv.class)).zza(zzhv.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
