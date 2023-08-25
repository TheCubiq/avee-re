package com.daaw;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class sz4 {
    public final c15 a;
    public final a74 b;

    public sz4(c15 c15Var, a74 a74Var) {
        this.a = c15Var;
        this.b = a74Var;
    }

    public static final ly4 h(fo6 fo6Var) {
        return new ly4(fo6Var, z04.f);
    }

    public static final ly4 i(h15 h15Var) {
        return new ly4(h15Var, z04.f);
    }

    public final View a() {
        a74 a74Var = this.b;
        if (a74Var == null) {
            return null;
        }
        return a74Var.h();
    }

    public final View b() {
        a74 a74Var = this.b;
        if (a74Var != null) {
            return a74Var.h();
        }
        return null;
    }

    public final a74 c() {
        return this.b;
    }

    public final ly4 d(Executor executor) {
        final a74 a74Var = this.b;
        return new ly4(new nv4() { // from class: com.daaw.qz4
            @Override // com.daaw.nv4
            public final void zza() {
                a74 a74Var2 = a74.this;
                if (a74Var2.zzN() != null) {
                    a74Var2.zzN().zzb();
                }
            }
        }, executor);
    }

    public final c15 e() {
        return this.a;
    }

    public Set f(ip4 ip4Var) {
        return Collections.singleton(new ly4(ip4Var, z04.f));
    }

    public Set g(ip4 ip4Var) {
        return Collections.singleton(new ly4(ip4Var, z04.f));
    }
}
