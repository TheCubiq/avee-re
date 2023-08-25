package com.daaw;

import android.content.Context;
import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public final class d18 {
    public final Context a;
    public xp4 b;
    public iz6 c;
    public iz6 d;
    public iz6 e;
    public iz6 f;
    public iz6 g;
    public ey6 h;
    public Looper i;
    public o98 j;
    public int k;
    public boolean l;
    public aa8 m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;
    public zo7 r;

    public d18(final Context context, g64 g64Var, byte[] bArr) {
        gz7 gz7Var = new gz7(g64Var, null);
        j08 j08Var = new j08(context);
        iz6 iz6Var = new iz6() { // from class: com.daaw.r08
            @Override // com.daaw.iz6
            public final Object zza() {
                return new rv8(context);
            }
        };
        u08 u08Var = new iz6() { // from class: com.daaw.u08
            @Override // com.daaw.iz6
            public final Object zza() {
                return new cq7();
            }
        };
        x08 x08Var = new x08(context);
        a18 a18Var = new ey6() { // from class: com.daaw.a18
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new tg8((xp4) obj);
            }
        };
        Objects.requireNonNull(context);
        this.a = context;
        this.c = gz7Var;
        this.d = j08Var;
        this.e = iz6Var;
        this.f = u08Var;
        this.g = x08Var;
        this.h = a18Var;
        this.i = it5.e();
        this.j = o98.c;
        this.k = 1;
        this.l = true;
        this.m = aa8.g;
        this.r = new zo7(0.97f, 1.03f, 1000L, 1.0E-7f, it5.f0(20L), it5.f0(500L), 0.999f, null);
        this.b = xp4.a;
        this.n = 500L;
        this.o = 2000L;
        this.p = true;
    }

    public static /* synthetic */ or8 a(Context context) {
        return new wq8(context, new e09());
    }
}
