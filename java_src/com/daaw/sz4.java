package com.daaw;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class sz4 {

    /* renamed from: a */
    public final c15 f26818a;

    /* renamed from: b */
    public final a74 f26819b;

    public sz4(c15 c15Var, a74 a74Var) {
        this.f26818a = c15Var;
        this.f26819b = a74Var;
    }

    /* renamed from: h */
    public static final ly4 m9682h(fo6 fo6Var) {
        return new ly4(fo6Var, z04.f34310f);
    }

    /* renamed from: i */
    public static final ly4 m9681i(h15 h15Var) {
        return new ly4(h15Var, z04.f34310f);
    }

    /* renamed from: a */
    public final View m9689a() {
        a74 a74Var = this.f26819b;
        if (a74Var == null) {
            return null;
        }
        return a74Var.mo6416h();
    }

    /* renamed from: b */
    public final View m9688b() {
        a74 a74Var = this.f26819b;
        if (a74Var != null) {
            return a74Var.mo6416h();
        }
        return null;
    }

    /* renamed from: c */
    public final a74 m9687c() {
        return this.f26819b;
    }

    /* renamed from: d */
    public final ly4 m9686d(Executor executor) {
        final a74 a74Var = this.f26819b;
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

    /* renamed from: e */
    public final c15 m9685e() {
        return this.f26818a;
    }

    /* renamed from: f */
    public Set mo9684f(ip4 ip4Var) {
        return Collections.singleton(new ly4(ip4Var, z04.f34310f));
    }

    /* renamed from: g */
    public Set mo9683g(ip4 ip4Var) {
        return Collections.singleton(new ly4(ip4Var, z04.f34310f));
    }
}
