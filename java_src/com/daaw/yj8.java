package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.zzs;
import com.google.android.gms.internal.ads.zzchu;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class yj8 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ zzs f33739a;

    public yj8(zzs zzsVar) {
        this.f33739a = zzsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzchu zzchuVar;
        Context context;
        zzs zzsVar = this.f33739a;
        zzchuVar = zzsVar.f36366p;
        String str = zzchuVar.f36993p;
        context = zzsVar.f36369s;
        return new sl2(rl2.m11197p(str, context, false));
    }
}
