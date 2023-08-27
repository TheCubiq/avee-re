package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public abstract class zzei implements Callable {
    private final String TAG = getClass().getSimpleName();
    private final String className;
    protected final zzcz zzps;
    protected final zzba zztq;
    private final String zztx;
    protected Method zztz;
    private final int zzud;
    private final int zzue;

    public zzei(zzcz zzczVar, String str, String str2, zzba zzbaVar, int i, int i2) {
        this.zzps = zzczVar;
        this.className = str;
        this.zztx = str2;
        this.zztq = zzbaVar;
        this.zzud = i;
        this.zzue = i2;
    }

    protected abstract void zzar() throws IllegalAccessException, InvocationTargetException;

    @Override // java.util.concurrent.Callable
    /* renamed from: zzat */
    public Void call() throws Exception {
        long nanoTime;
        Method zza;
        try {
            nanoTime = System.nanoTime();
            zza = this.zzps.zza(this.className, this.zztx);
            this.zztz = zza;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zza == null) {
            return null;
        }
        zzar();
        zzcc zzag = this.zzps.zzag();
        if (zzag != null && this.zzud != Integer.MIN_VALUE) {
            zzag.zza(this.zzue, this.zzud, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
