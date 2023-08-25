package com.daaw;

import com.daaw.InterfaceC1216es;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.daaw.im */
/* loaded from: classes2.dex */
public final class C1720im implements InterfaceC1306fm {

    /* renamed from: c */
    public static final yr0 f13779c = new C1722b();

    /* renamed from: a */
    public final InterfaceC1216es<InterfaceC1306fm> f13780a;

    /* renamed from: b */
    public final AtomicReference<InterfaceC1306fm> f13781b = new AtomicReference<>(null);

    /* renamed from: com.daaw.im$b */
    /* loaded from: classes2.dex */
    public static final class C1722b implements yr0 {
        public C1722b() {
        }

        @Override // com.daaw.yr0
        /* renamed from: a */
        public File mo3388a() {
            return null;
        }

        @Override // com.daaw.yr0
        /* renamed from: b */
        public File mo3387b() {
            return null;
        }

        @Override // com.daaw.yr0
        /* renamed from: c */
        public File mo3386c() {
            return null;
        }

        @Override // com.daaw.yr0
        /* renamed from: d */
        public File mo3385d() {
            return null;
        }

        @Override // com.daaw.yr0
        /* renamed from: e */
        public File mo3384e() {
            return null;
        }

        @Override // com.daaw.yr0
        /* renamed from: f */
        public File mo3383f() {
            return null;
        }
    }

    public C1720im(InterfaceC1216es<InterfaceC1306fm> interfaceC1216es) {
        this.f13780a = interfaceC1216es;
        interfaceC1216es.mo5793a(new InterfaceC1216es.InterfaceC1217a() { // from class: com.daaw.gm
            @Override // com.daaw.InterfaceC1216es.InterfaceC1217a
            /* renamed from: a */
            public final void mo7704a(b01 b01Var) {
                C1720im.this.m19649g(b01Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m19649g(b01 b01Var) {
        ml0.m15976f().m15980b("Crashlytics native component now available.");
        this.f13781b.set((InterfaceC1306fm) b01Var.get());
    }

    /* renamed from: h */
    public static /* synthetic */ void m19648h(String str, String str2, long j, of1 of1Var, b01 b01Var) {
        ((InterfaceC1306fm) b01Var.get()).mo19652d(str, str2, j, of1Var);
    }

    @Override // com.daaw.InterfaceC1306fm
    /* renamed from: a */
    public yr0 mo19655a(String str) {
        InterfaceC1306fm interfaceC1306fm = this.f13781b.get();
        return interfaceC1306fm == null ? f13779c : interfaceC1306fm.mo19655a(str);
    }

    @Override // com.daaw.InterfaceC1306fm
    /* renamed from: b */
    public boolean mo19654b() {
        InterfaceC1306fm interfaceC1306fm = this.f13781b.get();
        return interfaceC1306fm != null && interfaceC1306fm.mo19654b();
    }

    @Override // com.daaw.InterfaceC1306fm
    /* renamed from: c */
    public boolean mo19653c(String str) {
        InterfaceC1306fm interfaceC1306fm = this.f13781b.get();
        return interfaceC1306fm != null && interfaceC1306fm.mo19653c(str);
    }

    @Override // com.daaw.InterfaceC1306fm
    /* renamed from: d */
    public void mo19652d(final String str, final String str2, final long j, final of1 of1Var) {
        ml0 m15976f = ml0.m15976f();
        m15976f.m15973i("Deferring native open session: " + str);
        this.f13780a.mo5793a(new InterfaceC1216es.InterfaceC1217a() { // from class: com.daaw.hm
            @Override // com.daaw.InterfaceC1216es.InterfaceC1217a
            /* renamed from: a */
            public final void mo7704a(b01 b01Var) {
                C1720im.m19648h(str, str2, j, of1Var, b01Var);
            }
        });
    }
}
