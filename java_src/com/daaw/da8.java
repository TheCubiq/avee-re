package com.daaw;

import android.content.Context;
import java.util.Objects;
@Deprecated
/* loaded from: classes.dex */
public final class da8 {

    /* renamed from: a */
    public final d18 f6722a;

    @Deprecated
    public da8(Context context, g64 g64Var, byte[] bArr) {
        this.f6722a = new d18(context, g64Var, null);
    }

    @Deprecated
    /* renamed from: a */
    public final da8 m24578a(final d78 d78Var) {
        d18 d18Var = this.f6722a;
        uo4.m7872f(!d18Var.f6387q);
        Objects.requireNonNull(d78Var);
        d18Var.f6376f = new iz6() { // from class: com.daaw.bx7
            @Override // com.daaw.iz6
            public final Object zza() {
                return d78.this;
            }
        };
        return this;
    }

    @Deprecated
    /* renamed from: b */
    public final da8 m24577b(final zv8 zv8Var) {
        d18 d18Var = this.f6722a;
        uo4.m7872f(!d18Var.f6387q);
        Objects.requireNonNull(zv8Var);
        d18Var.f6375e = new iz6() { // from class: com.daaw.dy7
            @Override // com.daaw.iz6
            public final Object zza() {
                return zv8.this;
            }
        };
        return this;
    }

    @Deprecated
    /* renamed from: c */
    public final ga8 m24576c() {
        d18 d18Var = this.f6722a;
        uo4.m7872f(!d18Var.f6387q);
        d18Var.f6387q = true;
        return new ga8(d18Var);
    }
}
