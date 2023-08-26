package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
/* loaded from: classes2.dex */
final class zzbbn implements zzbct {
    private static final zzbbn zzdts = new zzbbn();

    private zzbbn() {
    }

    public static zzbbn zzadc() {
        return zzdts;
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zza(Class<?> cls) {
        return zzbbo.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final zzbcs zzb(Class<?> cls) {
        if (!zzbbo.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzbcs) zzbbo.zzc(cls.asSubclass(zzbbo.class)).zza(zzbbo.zze.zzduc, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
