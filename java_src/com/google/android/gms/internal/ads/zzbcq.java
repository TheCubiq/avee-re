package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
final class zzbcq implements zzbcp {
    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int zzb(int i, Object obj, Object obj2) {
        zzbco zzbcoVar = (zzbco) obj;
        if (zzbcoVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzbcoVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final Object zzb(Object obj, Object obj2) {
        zzbco zzbcoVar = (zzbco) obj;
        zzbco zzbcoVar2 = (zzbco) obj2;
        if (!zzbcoVar2.isEmpty()) {
            if (!zzbcoVar.isMutable()) {
                zzbcoVar = zzbcoVar.zzaec();
            }
            zzbcoVar.zza(zzbcoVar2);
        }
        return zzbcoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final Map<?, ?> zzs(Object obj) {
        return (zzbco) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final Map<?, ?> zzt(Object obj) {
        return (zzbco) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final boolean zzu(Object obj) {
        return !((zzbco) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final Object zzv(Object obj) {
        ((zzbco) obj).zzaaz();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final Object zzw(Object obj) {
        return zzbco.zzaeb().zzaec();
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final zzbcn<?, ?> zzx(Object obj) {
        throw new NoSuchMethodError();
    }
}
