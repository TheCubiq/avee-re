package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzx<T> {
    public final T result;
    public final zzc zzbg;
    public final zzae zzbh;
    public boolean zzbi;

    private zzx(zzae zzaeVar) {
        this.zzbi = false;
        this.result = null;
        this.zzbg = null;
        this.zzbh = zzaeVar;
    }

    private zzx(T t, zzc zzcVar) {
        this.zzbi = false;
        this.result = t;
        this.zzbg = zzcVar;
        this.zzbh = null;
    }

    public static <T> zzx<T> zza(T t, zzc zzcVar) {
        return new zzx<>(t, zzcVar);
    }

    public static <T> zzx<T> zzc(zzae zzaeVar) {
        return new zzx<>(zzaeVar);
    }
}
