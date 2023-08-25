package com.daaw;

import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import com.daaw.ow1;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
/* loaded from: classes.dex */
public class ew0 extends kt {
    public volatile wz b = null;
    public pz d = new pz();
    public final Object e = new Object();
    public dw0 c = null;

    /* loaded from: classes.dex */
    public class a implements qw1.a<pz> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(pz pzVar) {
            ew0.this.d = pzVar;
            if (pzVar.a) {
                wz wzVar = ew0.this.b;
                if (wzVar != null) {
                    wzVar.d(pzVar.b, pzVar.c, pzVar.d, pzVar.e, pzVar.f, pzVar.g);
                }
                dw0 dw0Var = ew0.this.c;
                if (dw0Var != null) {
                    dw0Var.e(pzVar.b, pzVar.c, pzVar.d, pzVar.e, pzVar.f, pzVar.g);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements pw1.a {
        public b() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            wz wzVar = ew0.this.b;
            if (wzVar != null) {
                wzVar.c();
            }
            dw0 dw0Var = ew0.this.c;
            if (dw0Var != null) {
                dw0Var.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements sw1.a<Boolean, Long, Boolean> {
        public c() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Boolean bool, Long l, Boolean bool2) {
            if (bool.booleanValue()) {
                ew0.this.c = new dw0("tempexport", l.longValue() * 1000);
                return;
            }
            if (ew0.this.c != null) {
                ew0.this.c.b();
            }
            ew0.this.c = null;
        }
    }

    /* loaded from: classes.dex */
    public class d implements ow1.a<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> {
        public d() {
        }

        @Override // com.daaw.ow1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a c(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            return ew0.this.f(aVar, gVar, false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ow1.a<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> {
        public e() {
        }

        @Override // com.daaw.ow1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a c(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            return ew0.this.f(aVar, gVar, true);
        }
    }

    public ew0() {
        MediaPlaybackService.B0.b(new a(), this.a);
        MediaPlaybackService.A0.b(new b(), this.a);
        qv1.Q.b(new c(), this.a);
        pv1.u.b(new d(), this.a);
        qv1.R.b(new e(), this.a);
    }

    public final com.daaw.avee.comp.playback.a f(com.daaw.avee.comp.playback.a aVar, a.g gVar, boolean z) {
        com.daaw.avee.comp.playback.a a2 = com.daaw.avee.comp.playback.c.d.a(aVar, gVar, null);
        if (a2 == null) {
            if (z) {
                lz1.c("AudioFrameData is null, MediaService not started?");
            }
            return a2;
        } else if (a2.r) {
            dw0 dw0Var = this.c;
            if (dw0Var != null) {
                long j = gVar.g;
                if (j < 0) {
                    j = a2.s;
                }
                return dw0Var.c(j, gVar, aVar, this.d.g);
            }
            return g(a2.s, aVar, gVar);
        } else {
            return a2;
        }
    }

    public com.daaw.avee.comp.playback.a g(long j, com.daaw.avee.comp.playback.a aVar, a.g gVar) {
        com.daaw.avee.comp.playback.a b2;
        if (aVar == null) {
            return null;
        }
        synchronized (this.e) {
            wz wzVar = this.b;
            if (wzVar == null) {
                wzVar = new wz();
            }
            wz wzVar2 = wzVar;
            long j2 = gVar.g;
            b2 = wzVar2.b(j2 < 0 ? j : j2, gVar, aVar, gVar.h);
            this.b = wzVar2;
        }
        return b2;
    }
}
