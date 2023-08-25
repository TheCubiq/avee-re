package com.daaw;

import android.os.Bundle;
import com.daaw.k81;
import java.util.Map;
/* loaded from: classes.dex */
public final class h81 implements k81.InterfaceC1922c {

    /* renamed from: a */
    public final k81 f12177a;

    /* renamed from: b */
    public boolean f12178b;

    /* renamed from: c */
    public Bundle f12179c;

    /* renamed from: d */
    public final wi0 f12180d;

    /* renamed from: com.daaw.h81$a */
    /* loaded from: classes.dex */
    public static final class C1516a extends si0 implements x40<i81> {

        /* renamed from: q */
        public final /* synthetic */ nt1 f12181q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1516a(nt1 nt1Var) {
            super(0);
            this.f12181q = nt1Var;
        }

        @Override // com.daaw.x40
        /* renamed from: d */
        public final i81 mo5541a() {
            return g81.m21889b(this.f12181q);
        }
    }

    public h81(k81 k81Var, nt1 nt1Var) {
        ug0.m8268f(k81Var, "savedStateRegistry");
        ug0.m8268f(nt1Var, "viewModelStoreOwner");
        this.f12177a = k81Var;
        this.f12180d = aj0.m27445a(new C1516a(nt1Var));
    }

    @Override // com.daaw.k81.InterfaceC1922c
    /* renamed from: a */
    public Bundle mo5117a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f12179c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, f81> entry : m20948b().m20032e().entrySet()) {
            String key = entry.getKey();
            Bundle mo5117a = entry.getValue().m22851c().mo5117a();
            if (!ug0.m8273a(mo5117a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo5117a);
            }
        }
        this.f12178b = false;
        return bundle;
    }

    /* renamed from: b */
    public final i81 m20948b() {
        return (i81) this.f12180d.getValue();
    }

    /* renamed from: c */
    public final void m20947c() {
        if (this.f12178b) {
            return;
        }
        this.f12179c = this.f12177a.m17972b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        this.f12178b = true;
        m20948b();
    }
}
