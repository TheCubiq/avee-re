package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class yj8 implements Callable {
    public final /* synthetic */ zzs a;

    public yj8(zzs zzsVar) {
        this.a = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzchu zzchuVar;
        Context context;
        zzs zzsVar = this.a;
        zzchuVar = zzsVar.p;
        String str = zzchuVar.p;
        context = zzsVar.s;
        return new sl2(rl2.p(str, context, false));
    }
}
