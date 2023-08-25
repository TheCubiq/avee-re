package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
/* loaded from: classes.dex */
public final class bj5 implements wz7 {
    public static bj5 a() {
        bj5 bj5Var;
        bj5Var = aj5.a;
        return bj5Var;
    }

    @Override // com.daaw.m08
    public final /* synthetic */ Object zzb() {
        zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        e08.b(uuid);
        return uuid;
    }
}
