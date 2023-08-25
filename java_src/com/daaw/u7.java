package com.daaw;

import com.daaw.lm;
/* loaded from: classes2.dex */
public final class u7 implements dj {
    public static final dj a = new u7();

    /* loaded from: classes2.dex */
    public static final class a implements lt0<lm.a> {
        public static final a a = new a();
        public static final q00 b = q00.d("pid");
        public static final q00 c = q00.d("processName");
        public static final q00 d = q00.d("reasonCode");
        public static final q00 e = q00.d("importance");
        public static final q00 f = q00.d("pss");
        public static final q00 g = q00.d("rss");
        public static final q00 h = q00.d("timestamp");
        public static final q00 i = q00.d("traceFile");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.a aVar, mt0 mt0Var) {
            mt0Var.a(b, aVar.c());
            mt0Var.e(c, aVar.d());
            mt0Var.a(d, aVar.f());
            mt0Var.a(e, aVar.b());
            mt0Var.b(f, aVar.e());
            mt0Var.b(g, aVar.g());
            mt0Var.b(h, aVar.h());
            mt0Var.e(i, aVar.i());
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements lt0<lm.c> {
        public static final b a = new b();
        public static final q00 b = q00.d("key");
        public static final q00 c = q00.d("value");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.c cVar, mt0 mt0Var) {
            mt0Var.e(b, cVar.b());
            mt0Var.e(c, cVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements lt0<lm> {
        public static final c a = new c();
        public static final q00 b = q00.d("sdkVersion");
        public static final q00 c = q00.d("gmpAppId");
        public static final q00 d = q00.d("platform");
        public static final q00 e = q00.d("installationUuid");
        public static final q00 f = q00.d("buildVersion");
        public static final q00 g = q00.d("displayVersion");
        public static final q00 h = q00.d("session");
        public static final q00 i = q00.d("ndkPayload");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm lmVar, mt0 mt0Var) {
            mt0Var.e(b, lmVar.i());
            mt0Var.e(c, lmVar.e());
            mt0Var.a(d, lmVar.h());
            mt0Var.e(e, lmVar.f());
            mt0Var.e(f, lmVar.c());
            mt0Var.e(g, lmVar.d());
            mt0Var.e(h, lmVar.j());
            mt0Var.e(i, lmVar.g());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements lt0<lm.d> {
        public static final d a = new d();
        public static final q00 b = q00.d("files");
        public static final q00 c = q00.d("orgId");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.d dVar, mt0 mt0Var) {
            mt0Var.e(b, dVar.b());
            mt0Var.e(c, dVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements lt0<lm.d.b> {
        public static final e a = new e();
        public static final q00 b = q00.d("filename");
        public static final q00 c = q00.d("contents");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.d.b bVar, mt0 mt0Var) {
            mt0Var.e(b, bVar.c());
            mt0Var.e(c, bVar.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f implements lt0<lm.e.a> {
        public static final f a = new f();
        public static final q00 b = q00.d("identifier");
        public static final q00 c = q00.d("version");
        public static final q00 d = q00.d("displayVersion");
        public static final q00 e = q00.d("organization");
        public static final q00 f = q00.d("installationUuid");
        public static final q00 g = q00.d("developmentPlatform");
        public static final q00 h = q00.d("developmentPlatformVersion");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.a aVar, mt0 mt0Var) {
            mt0Var.e(b, aVar.e());
            mt0Var.e(c, aVar.h());
            mt0Var.e(d, aVar.d());
            mt0Var.e(e, aVar.g());
            mt0Var.e(f, aVar.f());
            mt0Var.e(g, aVar.b());
            mt0Var.e(h, aVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class g implements lt0<lm.e.a.b> {
        public static final g a = new g();
        public static final q00 b = q00.d("clsId");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.a.b bVar, mt0 mt0Var) {
            mt0Var.e(b, bVar.a());
        }
    }

    /* loaded from: classes2.dex */
    public static final class h implements lt0<lm.e.c> {
        public static final h a = new h();
        public static final q00 b = q00.d("arch");
        public static final q00 c = q00.d("model");
        public static final q00 d = q00.d("cores");
        public static final q00 e = q00.d("ram");
        public static final q00 f = q00.d("diskSpace");
        public static final q00 g = q00.d("simulator");
        public static final q00 h = q00.d("state");
        public static final q00 i = q00.d("manufacturer");
        public static final q00 j = q00.d("modelClass");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.c cVar, mt0 mt0Var) {
            mt0Var.a(b, cVar.b());
            mt0Var.e(c, cVar.f());
            mt0Var.a(d, cVar.c());
            mt0Var.b(e, cVar.h());
            mt0Var.b(f, cVar.d());
            mt0Var.f(g, cVar.j());
            mt0Var.a(h, cVar.i());
            mt0Var.e(i, cVar.e());
            mt0Var.e(j, cVar.g());
        }
    }

    /* loaded from: classes2.dex */
    public static final class i implements lt0<lm.e> {
        public static final i a = new i();
        public static final q00 b = q00.d("generator");
        public static final q00 c = q00.d("identifier");
        public static final q00 d = q00.d("startedAt");
        public static final q00 e = q00.d("endedAt");
        public static final q00 f = q00.d("crashed");
        public static final q00 g = q00.d("app");
        public static final q00 h = q00.d("user");
        public static final q00 i = q00.d("os");
        public static final q00 j = q00.d("device");
        public static final q00 k = q00.d("events");
        public static final q00 l = q00.d("generatorType");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e eVar, mt0 mt0Var) {
            mt0Var.e(b, eVar.f());
            mt0Var.e(c, eVar.i());
            mt0Var.b(d, eVar.k());
            mt0Var.e(e, eVar.d());
            mt0Var.f(f, eVar.m());
            mt0Var.e(g, eVar.b());
            mt0Var.e(h, eVar.l());
            mt0Var.e(i, eVar.j());
            mt0Var.e(j, eVar.c());
            mt0Var.e(k, eVar.e());
            mt0Var.a(l, eVar.g());
        }
    }

    /* loaded from: classes2.dex */
    public static final class j implements lt0<lm.e.d.a> {
        public static final j a = new j();
        public static final q00 b = q00.d("execution");
        public static final q00 c = q00.d("customAttributes");
        public static final q00 d = q00.d("internalKeys");
        public static final q00 e = q00.d("background");
        public static final q00 f = q00.d("uiOrientation");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a aVar, mt0 mt0Var) {
            mt0Var.e(b, aVar.d());
            mt0Var.e(c, aVar.c());
            mt0Var.e(d, aVar.e());
            mt0Var.e(e, aVar.b());
            mt0Var.a(f, aVar.f());
        }
    }

    /* loaded from: classes2.dex */
    public static final class k implements lt0<lm.e.d.a.b.AbstractC0064a> {
        public static final k a = new k();
        public static final q00 b = q00.d("baseAddress");
        public static final q00 c = q00.d("size");
        public static final q00 d = q00.d("name");
        public static final q00 e = q00.d("uuid");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b.AbstractC0064a abstractC0064a, mt0 mt0Var) {
            mt0Var.b(b, abstractC0064a.b());
            mt0Var.b(c, abstractC0064a.d());
            mt0Var.e(d, abstractC0064a.c());
            mt0Var.e(e, abstractC0064a.f());
        }
    }

    /* loaded from: classes2.dex */
    public static final class l implements lt0<lm.e.d.a.b> {
        public static final l a = new l();
        public static final q00 b = q00.d("threads");
        public static final q00 c = q00.d("exception");
        public static final q00 d = q00.d("appExitInfo");
        public static final q00 e = q00.d("signal");
        public static final q00 f = q00.d("binaries");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b bVar, mt0 mt0Var) {
            mt0Var.e(b, bVar.f());
            mt0Var.e(c, bVar.d());
            mt0Var.e(d, bVar.b());
            mt0Var.e(e, bVar.e());
            mt0Var.e(f, bVar.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class m implements lt0<lm.e.d.a.b.c> {
        public static final m a = new m();
        public static final q00 b = q00.d("type");
        public static final q00 c = q00.d("reason");
        public static final q00 d = q00.d("frames");
        public static final q00 e = q00.d("causedBy");
        public static final q00 f = q00.d("overflowCount");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b.c cVar, mt0 mt0Var) {
            mt0Var.e(b, cVar.f());
            mt0Var.e(c, cVar.e());
            mt0Var.e(d, cVar.c());
            mt0Var.e(e, cVar.b());
            mt0Var.a(f, cVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class n implements lt0<lm.e.d.a.b.AbstractC0068d> {
        public static final n a = new n();
        public static final q00 b = q00.d("name");
        public static final q00 c = q00.d("code");
        public static final q00 d = q00.d("address");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b.AbstractC0068d abstractC0068d, mt0 mt0Var) {
            mt0Var.e(b, abstractC0068d.d());
            mt0Var.e(c, abstractC0068d.c());
            mt0Var.b(d, abstractC0068d.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class o implements lt0<lm.e.d.a.b.AbstractC0070e> {
        public static final o a = new o();
        public static final q00 b = q00.d("name");
        public static final q00 c = q00.d("importance");
        public static final q00 d = q00.d("frames");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b.AbstractC0070e abstractC0070e, mt0 mt0Var) {
            mt0Var.e(b, abstractC0070e.d());
            mt0Var.a(c, abstractC0070e.c());
            mt0Var.e(d, abstractC0070e.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class p implements lt0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> {
        public static final p a = new p();
        public static final q00 b = q00.d("pc");
        public static final q00 c = q00.d("symbol");
        public static final q00 d = q00.d("file");
        public static final q00 e = q00.d("offset");
        public static final q00 f = q00.d("importance");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.a.b.AbstractC0070e.AbstractC0072b abstractC0072b, mt0 mt0Var) {
            mt0Var.b(b, abstractC0072b.e());
            mt0Var.e(c, abstractC0072b.f());
            mt0Var.e(d, abstractC0072b.b());
            mt0Var.b(e, abstractC0072b.d());
            mt0Var.a(f, abstractC0072b.c());
        }
    }

    /* loaded from: classes2.dex */
    public static final class q implements lt0<lm.e.d.c> {
        public static final q a = new q();
        public static final q00 b = q00.d("batteryLevel");
        public static final q00 c = q00.d("batteryVelocity");
        public static final q00 d = q00.d("proximityOn");
        public static final q00 e = q00.d("orientation");
        public static final q00 f = q00.d("ramUsed");
        public static final q00 g = q00.d("diskUsed");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.c cVar, mt0 mt0Var) {
            mt0Var.e(b, cVar.b());
            mt0Var.a(c, cVar.c());
            mt0Var.f(d, cVar.g());
            mt0Var.a(e, cVar.e());
            mt0Var.b(f, cVar.f());
            mt0Var.b(g, cVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class r implements lt0<lm.e.d> {
        public static final r a = new r();
        public static final q00 b = q00.d("timestamp");
        public static final q00 c = q00.d("type");
        public static final q00 d = q00.d("app");
        public static final q00 e = q00.d("device");
        public static final q00 f = q00.d("log");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d dVar, mt0 mt0Var) {
            mt0Var.b(b, dVar.e());
            mt0Var.e(c, dVar.f());
            mt0Var.e(d, dVar.b());
            mt0Var.e(e, dVar.c());
            mt0Var.e(f, dVar.d());
        }
    }

    /* loaded from: classes2.dex */
    public static final class s implements lt0<lm.e.d.AbstractC0074d> {
        public static final s a = new s();
        public static final q00 b = q00.d("content");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.d.AbstractC0074d abstractC0074d, mt0 mt0Var) {
            mt0Var.e(b, abstractC0074d.b());
        }
    }

    /* loaded from: classes2.dex */
    public static final class t implements lt0<lm.e.AbstractC0075e> {
        public static final t a = new t();
        public static final q00 b = q00.d("platform");
        public static final q00 c = q00.d("version");
        public static final q00 d = q00.d("buildVersion");
        public static final q00 e = q00.d("jailbroken");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.AbstractC0075e abstractC0075e, mt0 mt0Var) {
            mt0Var.a(b, abstractC0075e.c());
            mt0Var.e(c, abstractC0075e.d());
            mt0Var.e(d, abstractC0075e.b());
            mt0Var.f(e, abstractC0075e.e());
        }
    }

    /* loaded from: classes2.dex */
    public static final class u implements lt0<lm.e.f> {
        public static final u a = new u();
        public static final q00 b = q00.d("identifier");

        @Override // com.daaw.yw
        /* renamed from: b */
        public void a(lm.e.f fVar, mt0 mt0Var) {
            mt0Var.e(b, fVar.b());
        }
    }

    @Override // com.daaw.dj
    public void a(ax<?> axVar) {
        c cVar = c.a;
        axVar.a(lm.class, cVar);
        axVar.a(e8.class, cVar);
        i iVar = i.a;
        axVar.a(lm.e.class, iVar);
        axVar.a(k8.class, iVar);
        f fVar = f.a;
        axVar.a(lm.e.a.class, fVar);
        axVar.a(l8.class, fVar);
        g gVar = g.a;
        axVar.a(lm.e.a.b.class, gVar);
        axVar.a(m8.class, gVar);
        u uVar = u.a;
        axVar.a(lm.e.f.class, uVar);
        axVar.a(z8.class, uVar);
        t tVar = t.a;
        axVar.a(lm.e.AbstractC0075e.class, tVar);
        axVar.a(y8.class, tVar);
        h hVar = h.a;
        axVar.a(lm.e.c.class, hVar);
        axVar.a(n8.class, hVar);
        r rVar = r.a;
        axVar.a(lm.e.d.class, rVar);
        axVar.a(o8.class, rVar);
        j jVar = j.a;
        axVar.a(lm.e.d.a.class, jVar);
        axVar.a(p8.class, jVar);
        l lVar = l.a;
        axVar.a(lm.e.d.a.b.class, lVar);
        axVar.a(q8.class, lVar);
        o oVar = o.a;
        axVar.a(lm.e.d.a.b.AbstractC0070e.class, oVar);
        axVar.a(u8.class, oVar);
        p pVar = p.a;
        axVar.a(lm.e.d.a.b.AbstractC0070e.AbstractC0072b.class, pVar);
        axVar.a(v8.class, pVar);
        m mVar = m.a;
        axVar.a(lm.e.d.a.b.c.class, mVar);
        axVar.a(s8.class, mVar);
        a aVar = a.a;
        axVar.a(lm.a.class, aVar);
        axVar.a(g8.class, aVar);
        n nVar = n.a;
        axVar.a(lm.e.d.a.b.AbstractC0068d.class, nVar);
        axVar.a(t8.class, nVar);
        k kVar = k.a;
        axVar.a(lm.e.d.a.b.AbstractC0064a.class, kVar);
        axVar.a(r8.class, kVar);
        b bVar = b.a;
        axVar.a(lm.c.class, bVar);
        axVar.a(h8.class, bVar);
        q qVar = q.a;
        axVar.a(lm.e.d.c.class, qVar);
        axVar.a(w8.class, qVar);
        s sVar = s.a;
        axVar.a(lm.e.d.AbstractC0074d.class, sVar);
        axVar.a(x8.class, sVar);
        d dVar = d.a;
        axVar.a(lm.d.class, dVar);
        axVar.a(i8.class, dVar);
        e eVar = e.a;
        axVar.a(lm.d.b.class, eVar);
        axVar.a(j8.class, eVar);
    }
}
