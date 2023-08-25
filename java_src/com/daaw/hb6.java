package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashSet;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class hb6 implements wz7 {
    public static l76 a(Context context, ez3 ez3Var, fz3 fz3Var, Object obj, r86 r86Var, ka6 ka6Var, qz7 qz7Var, qz7 qz7Var2, qz7 qz7Var3, qz7 qz7Var4, qz7 qz7Var5, qz7 qz7Var6, qz7 qz7Var7, qz7 qz7Var8, qz7 qz7Var9, Executor executor, to6 to6Var, kd5 kd5Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((da6) obj);
        hashSet.add(r86Var);
        hashSet.add(ka6Var);
        if (((Boolean) zzba.zzc().b(g93.g5)).booleanValue()) {
            hashSet.add((i76) qz7Var.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.h5)).booleanValue()) {
            hashSet.add((i76) qz7Var2.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.i5)).booleanValue()) {
            hashSet.add((i76) qz7Var3.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.j5)).booleanValue()) {
            hashSet.add((i76) qz7Var4.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.n5)).booleanValue()) {
            hashSet.add((i76) qz7Var6.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.o5)).booleanValue()) {
            hashSet.add((i76) qz7Var7.zzb());
        }
        if (((Boolean) zzba.zzc().b(g93.v2)).booleanValue()) {
            hashSet.add((i76) qz7Var9.zzb());
        }
        return new l76(context, executor, hashSet, to6Var, kd5Var);
    }
}
