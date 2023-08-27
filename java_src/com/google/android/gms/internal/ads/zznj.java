package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class zznj<T> implements Callable<T> {
    private final /* synthetic */ zzna zzaty;
    private final /* synthetic */ zzni zzatz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznj(zzni zzniVar, zzna zznaVar) {
        this.zzatz = zzniVar;
        this.zzaty = zznaVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        SharedPreferences sharedPreferences;
        zzna zznaVar = this.zzaty;
        sharedPreferences = this.zzatz.zzatw;
        return (T) zznaVar.zza(sharedPreferences);
    }
}
