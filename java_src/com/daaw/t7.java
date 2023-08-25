package com.daaw;
/* loaded from: classes.dex */
public final class t7 implements dj {
    public static final dj a = new t7();

    /* loaded from: classes.dex */
    public static final class a implements lt0<z2> {
        public static final a a = new a();
        public static final q00 b = q00.d("sdkVersion");
        public static final q00 c = q00.d("model");
        public static final q00 d = q00.d("hardware");
        public static final q00 e = q00.d("device");
        public static final q00 f = q00.d("product");
        public static final q00 g = q00.d("osBuild");
        public static final q00 h = q00.d("manufacturer");
        public static final q00 i = q00.d("fingerprint");
        public static final q00 j = q00.d("locale");
        public static final q00 k = q00.d("country");
        public static final q00 l = q00.d("mccMnc");
        public static final q00 m = q00.d("applicationBuild");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(z2 z2Var, mt0 mt0Var) {
            mt0Var.e(b, z2Var.m());
            mt0Var.e(c, z2Var.j());
            mt0Var.e(d, z2Var.f());
            mt0Var.e(e, z2Var.d());
            mt0Var.e(f, z2Var.l());
            mt0Var.e(g, z2Var.k());
            mt0Var.e(h, z2Var.h());
            mt0Var.e(i, z2Var.e());
            mt0Var.e(j, z2Var.g());
            mt0Var.e(k, z2Var.c());
            mt0Var.e(l, z2Var.i());
            mt0Var.e(m, z2Var.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements lt0<ib> {
        public static final b a = new b();
        public static final q00 b = q00.d("logRequest");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(ib ibVar, mt0 mt0Var) {
            mt0Var.e(b, ibVar.c());
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements lt0<uf> {
        public static final c a = new c();
        public static final q00 b = q00.d("clientType");
        public static final q00 c = q00.d("androidClientInfo");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(uf ufVar, mt0 mt0Var) {
            mt0Var.e(b, ufVar.c());
            mt0Var.e(c, ufVar.b());
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements lt0<cl0> {
        public static final d a = new d();
        public static final q00 b = q00.d("eventTimeMs");
        public static final q00 c = q00.d("eventCode");
        public static final q00 d = q00.d("eventUptimeMs");
        public static final q00 e = q00.d("sourceExtension");
        public static final q00 f = q00.d("sourceExtensionJsonProto3");
        public static final q00 g = q00.d("timezoneOffsetSeconds");
        public static final q00 h = q00.d("networkConnectionInfo");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(cl0 cl0Var, mt0 mt0Var) {
            mt0Var.b(b, cl0Var.c());
            mt0Var.e(c, cl0Var.b());
            mt0Var.b(d, cl0Var.d());
            mt0Var.e(e, cl0Var.f());
            mt0Var.e(f, cl0Var.g());
            mt0Var.b(g, cl0Var.h());
            mt0Var.e(h, cl0Var.e());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements lt0<gl0> {
        public static final e a = new e();
        public static final q00 b = q00.d("requestTimeMs");
        public static final q00 c = q00.d("requestUptimeMs");
        public static final q00 d = q00.d("clientInfo");
        public static final q00 e = q00.d("logSource");
        public static final q00 f = q00.d("logSourceName");
        public static final q00 g = q00.d("logEvent");
        public static final q00 h = q00.d("qosTier");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(gl0 gl0Var, mt0 mt0Var) {
            mt0Var.b(b, gl0Var.g());
            mt0Var.b(c, gl0Var.h());
            mt0Var.e(d, gl0Var.b());
            mt0Var.e(e, gl0Var.d());
            mt0Var.e(f, gl0Var.e());
            mt0Var.e(g, gl0Var.c());
            mt0Var.e(h, gl0Var.f());
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements lt0<ls0> {
        public static final f a = new f();
        public static final q00 b = q00.d("networkType");
        public static final q00 c = q00.d("mobileSubtype");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(ls0 ls0Var, mt0 mt0Var) {
            mt0Var.e(b, ls0Var.c());
            mt0Var.e(c, ls0Var.b());
        }
    }

    @Override // com.daaw.dj
    public void a(ax<?> axVar) {
        b bVar = b.a;
        axVar.a(ib.class, bVar);
        axVar.a(c8.class, bVar);
        e eVar = e.a;
        axVar.a(gl0.class, eVar);
        axVar.a(i9.class, eVar);
        c cVar = c.a;
        axVar.a(uf.class, cVar);
        axVar.a(d8.class, cVar);
        a aVar = a.a;
        axVar.a(z2.class, aVar);
        axVar.a(z7.class, aVar);
        d dVar = d.a;
        axVar.a(cl0.class, dVar);
        axVar.a(h9.class, dVar);
        f fVar = f.a;
        axVar.a(ls0.class, fVar);
        axVar.a(k9.class, fVar);
    }
}
