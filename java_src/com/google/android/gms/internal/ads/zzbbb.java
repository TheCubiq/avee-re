package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class zzbbb {
    private static volatile boolean zzdqr = false;
    private static final Class<?> zzdqs = zzacq();
    static final zzbbb zzdqt = new zzbbb(true);
    private final Map<zzbbc, zzbbo.zzd<?, ?>> zzdqu;

    zzbbb() {
        this.zzdqu = new HashMap();
    }

    private zzbbb(boolean z) {
        this.zzdqu = Collections.emptyMap();
    }

    private static Class<?> zzacq() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zzbbb zzacr() {
        return zzbba.zzacp();
    }

    public final <ContainingType extends zzbcu> zzbbo.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzbbo.zzd<ContainingType, ?>) this.zzdqu.get(new zzbbc(containingtype, i));
    }
}
