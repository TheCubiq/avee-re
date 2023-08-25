package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class t16 implements i76 {
    public final Executor a;
    public final qz3 b;

    public t16(Executor executor, qz3 qz3Var) {
        this.a = executor;
        this.b = qz3Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 10;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return ((Boolean) zzba.zzc().b(g93.o2)).booleanValue() ? s67.i(null) : s67.m(this.b.j(), new ey6() { // from class: com.daaw.r16
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new h76() { // from class: com.daaw.s16
                    @Override // com.daaw.h76
                    public final void b(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.a);
    }
}
