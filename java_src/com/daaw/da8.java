package com.daaw;

import android.content.Context;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public final class da8 {
    public final d18 a;

    @Deprecated
    public da8(Context context, g64 g64Var, byte[] bArr) {
        this.a = new d18(context, g64Var, null);
    }

    @Deprecated
    public final da8 a(final d78 d78Var) {
        d18 d18Var = this.a;
        uo4.f(!d18Var.q);
        Objects.requireNonNull(d78Var);
        d18Var.f = new iz6() { // from class: com.daaw.bx7
            @Override // com.daaw.iz6
            public final Object zza() {
                return d78.this;
            }
        };
        return this;
    }

    @Deprecated
    public final da8 b(final zv8 zv8Var) {
        d18 d18Var = this.a;
        uo4.f(!d18Var.q);
        Objects.requireNonNull(zv8Var);
        d18Var.e = new iz6() { // from class: com.daaw.dy7
            @Override // com.daaw.iz6
            public final Object zza() {
                return zv8.this;
            }
        };
        return this;
    }

    @Deprecated
    public final ga8 c() {
        d18 d18Var = this.a;
        uo4.f(!d18Var.q);
        d18Var.q = true;
        return new ga8(d18Var);
    }
}
