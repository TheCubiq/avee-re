package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzbcl implements zzbct {
    private zzbct[] zzdvx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcl(zzbct... zzbctVarArr) {
        this.zzdvx = zzbctVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final boolean zza(Class<?> cls) {
        for (zzbct zzbctVar : this.zzdvx) {
            if (zzbctVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbct
    public final zzbcs zzb(Class<?> cls) {
        zzbct[] zzbctVarArr;
        for (zzbct zzbctVar : this.zzdvx) {
            if (zzbctVar.zza(cls)) {
                return zzbctVar.zzb(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
