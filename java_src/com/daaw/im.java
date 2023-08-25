package com.daaw;

import com.daaw.es;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class im implements fm {
    public static final yr0 c = new b();
    public final es<fm> a;
    public final AtomicReference<fm> b = new AtomicReference<>(null);

    /* loaded from: classes2.dex */
    public static final class b implements yr0 {
        public b() {
        }

        @Override // com.daaw.yr0
        public File a() {
            return null;
        }

        @Override // com.daaw.yr0
        public File b() {
            return null;
        }

        @Override // com.daaw.yr0
        public File c() {
            return null;
        }

        @Override // com.daaw.yr0
        public File d() {
            return null;
        }

        @Override // com.daaw.yr0
        public File e() {
            return null;
        }

        @Override // com.daaw.yr0
        public File f() {
            return null;
        }
    }

    public im(es<fm> esVar) {
        this.a = esVar;
        esVar.a(new es.a() { // from class: com.daaw.gm
            @Override // com.daaw.es.a
            public final void a(b01 b01Var) {
                im.this.g(b01Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(b01 b01Var) {
        ml0.f().b("Crashlytics native component now available.");
        this.b.set((fm) b01Var.get());
    }

    public static /* synthetic */ void h(String str, String str2, long j, of1 of1Var, b01 b01Var) {
        ((fm) b01Var.get()).d(str, str2, j, of1Var);
    }

    @Override // com.daaw.fm
    public yr0 a(String str) {
        fm fmVar = this.b.get();
        return fmVar == null ? c : fmVar.a(str);
    }

    @Override // com.daaw.fm
    public boolean b() {
        fm fmVar = this.b.get();
        return fmVar != null && fmVar.b();
    }

    @Override // com.daaw.fm
    public boolean c(String str) {
        fm fmVar = this.b.get();
        return fmVar != null && fmVar.c(str);
    }

    @Override // com.daaw.fm
    public void d(final String str, final String str2, final long j, final of1 of1Var) {
        ml0 f = ml0.f();
        f.i("Deferring native open session: " + str);
        this.a.a(new es.a() { // from class: com.daaw.hm
            @Override // com.daaw.es.a
            public final void a(b01 b01Var) {
                im.h(str, str2, j, of1Var, b01Var);
            }
        });
    }
}
