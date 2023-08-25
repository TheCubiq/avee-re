package com.daaw;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class t06 implements i76 {
    public final f77 a;
    public final Executor b;

    public t06(f77 f77Var, Executor executor) {
        this.a = f77Var;
        this.b = executor;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 6;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.n(this.a, new w57() { // from class: com.daaw.s06
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                final String str = (String) obj;
                return s67.i(new h76() { // from class: com.daaw.r06
                    @Override // com.daaw.h76
                    public final void b(Object obj2) {
                        ((Bundle) obj2).putString("ms", str);
                    }
                });
            }
        }, this.b);
    }
}
