package com.daaw;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class t06 implements i76 {

    /* renamed from: a */
    public final f77 f26866a;

    /* renamed from: b */
    public final Executor f26867b;

    public t06(f77 f77Var, Executor executor) {
        this.f26866a = f77Var;
        this.f26867b = executor;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 6;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10629n(this.f26866a, new w57() { // from class: com.daaw.s06
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                final String str = (String) obj;
                return s67.m10634i(new h76() { // from class: com.daaw.r06
                    @Override // com.daaw.h76
                    /* renamed from: b */
                    public final void mo2851b(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.f26867b);
    }
}
