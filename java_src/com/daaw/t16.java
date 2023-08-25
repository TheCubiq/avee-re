package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class t16 implements i76 {

    /* renamed from: a */
    public final Executor f26901a;

    /* renamed from: b */
    public final qz3 f26902b;

    public t16(Executor executor, qz3 qz3Var) {
        this.f26901a = executor;
        this.f26902b = qz3Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 10;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return ((Boolean) zzba.zzc().m23658b(g93.f10778o2)).booleanValue() ? s67.m10634i(null) : s67.m10630m(this.f26902b.m11913j(), new ey6() { // from class: com.daaw.r16
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new h76() { // from class: com.daaw.s16
                    @Override // com.daaw.h76
                    /* renamed from: b */
                    public final void mo2851b(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.f26901a);
    }
}
