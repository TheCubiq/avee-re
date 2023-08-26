package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbdg {
    private static final zzbdg zzdxa = new zzbdg();
    private final zzbdn zzdxb;
    private final ConcurrentMap<Class<?>, zzbdm<?>> zzdxc = new ConcurrentHashMap();

    private zzbdg() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzbdn zzbdnVar = null;
        for (int i = 0; i <= 0; i++) {
            zzbdnVar = zzeq(strArr[0]);
            if (zzbdnVar != null) {
                break;
            }
        }
        this.zzdxb = zzbdnVar == null ? new zzbcj() : zzbdnVar;
    }

    public static zzbdg zzaeo() {
        return zzdxa;
    }

    private static zzbdn zzeq(String str) {
        try {
            return (zzbdn) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> zzbdm<T> zzab(T t) {
        return zze(t.getClass());
    }

    public final <T> zzbdm<T> zze(Class<T> cls) {
        zzbbq.zza(cls, "messageType");
        zzbdm<T> zzbdmVar = (zzbdm<T>) this.zzdxc.get(cls);
        if (zzbdmVar == null) {
            zzbdm<T> zzd = this.zzdxb.zzd(cls);
            zzbbq.zza(cls, "messageType");
            zzbbq.zza(zzd, "schema");
            zzbdm<T> zzbdmVar2 = (zzbdm<T>) this.zzdxc.putIfAbsent(cls, zzd);
            return zzbdmVar2 != null ? zzbdmVar2 : zzd;
        }
        return zzbdmVar;
    }
}
