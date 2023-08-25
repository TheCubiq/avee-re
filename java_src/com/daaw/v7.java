package com.daaw;
/* loaded from: classes.dex */
public final class v7 implements dj {
    public static final dj a = new v7();

    /* loaded from: classes.dex */
    public static final class a implements lt0<wf> {
        public static final a a = new a();
        public static final q00 b = q00.a("window").b(w6.b().c(1).a()).a();
        public static final q00 c = q00.a("logSourceMetrics").b(w6.b().c(2).a()).a();
        public static final q00 d = q00.a("globalMetrics").b(w6.b().c(3).a()).a();
        public static final q00 e = q00.a("appNamespace").b(w6.b().c(4).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(wf wfVar, mt0 mt0Var) {
            mt0Var.e(b, wfVar.d());
            mt0Var.e(c, wfVar.c());
            mt0Var.e(d, wfVar.b());
            mt0Var.e(e, wfVar.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements lt0<q70> {
        public static final b a = new b();
        public static final q00 b = q00.a("storageMetrics").b(w6.b().c(1).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(q70 q70Var, mt0 mt0Var) {
            mt0Var.e(b, q70Var.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements lt0<dl0> {
        public static final c a = new c();
        public static final q00 b = q00.a("eventsDroppedCount").b(w6.b().c(1).a()).a();
        public static final q00 c = q00.a("reason").b(w6.b().c(3).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(dl0 dl0Var, mt0 mt0Var) {
            mt0Var.b(b, dl0Var.a());
            mt0Var.e(c, dl0Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements lt0<il0> {
        public static final d a = new d();
        public static final q00 b = q00.a("logSource").b(w6.b().c(1).a()).a();
        public static final q00 c = q00.a("logEventDropped").b(w6.b().c(2).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(il0 il0Var, mt0 mt0Var) {
            mt0Var.e(b, il0Var.b());
            mt0Var.e(c, il0Var.a());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements lt0<sz0> {
        public static final e a = new e();
        public static final q00 b = q00.d("clientMetrics");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(sz0 sz0Var, mt0 mt0Var) {
            mt0Var.e(b, sz0Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements lt0<zf1> {
        public static final f a = new f();
        public static final q00 b = q00.a("currentCacheSizeBytes").b(w6.b().c(1).a()).a();
        public static final q00 c = q00.a("maxCacheSizeBytes").b(w6.b().c(2).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(zf1 zf1Var, mt0 mt0Var) {
            mt0Var.b(b, zf1Var.a());
            mt0Var.b(c, zf1Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements lt0<ml1> {
        public static final g a = new g();
        public static final q00 b = q00.a("startMs").b(w6.b().c(1).a()).a();
        public static final q00 c = q00.a("endMs").b(w6.b().c(2).a()).a();

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(ml1 ml1Var, mt0 mt0Var) {
            mt0Var.b(b, ml1Var.b());
            mt0Var.b(c, ml1Var.a());
        }
    }

    @Override // com.daaw.dj
    public void a(ax<?> axVar) {
        axVar.a(sz0.class, e.a);
        axVar.a(wf.class, a.a);
        axVar.a(ml1.class, g.a);
        axVar.a(il0.class, d.a);
        axVar.a(dl0.class, c.a);
        axVar.a(q70.class, b.a);
        axVar.a(zf1.class, f.a);
    }
}
