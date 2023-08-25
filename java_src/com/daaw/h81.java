package com.daaw;

import android.os.Bundle;
import com.daaw.k81;
import java.util.Map;
/* loaded from: classes.dex */
public final class h81 implements k81.c {
    public final k81 a;
    public boolean b;
    public Bundle c;
    public final wi0 d;

    /* loaded from: classes.dex */
    public static final class a extends si0 implements x40<i81> {
        public final /* synthetic */ nt1 q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(nt1 nt1Var) {
            super(0);
            this.q = nt1Var;
        }

        @Override // com.daaw.x40
        /* renamed from: d */
        public final i81 a() {
            return g81.b(this.q);
        }
    }

    public h81(k81 k81Var, nt1 nt1Var) {
        ug0.f(k81Var, "savedStateRegistry");
        ug0.f(nt1Var, "viewModelStoreOwner");
        this.a = k81Var;
        this.d = aj0.a(new a(nt1Var));
    }

    @Override // com.daaw.k81.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, f81> entry : b().e().entrySet()) {
            String key = entry.getKey();
            Bundle a2 = entry.getValue().c().a();
            if (!ug0.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(key, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final i81 b() {
        return (i81) this.d.getValue();
    }

    public final void c() {
        if (this.b) {
            return;
        }
        this.c = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.b = true;
        b();
    }
}
