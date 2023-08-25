package com.daaw.avee.comp.playback;

import android.os.Handler;
import android.os.Message;
import android.view.SurfaceHolder;
import com.daaw.avee.comp.playback.b;
import com.daaw.avee.comp.playback.e;
import com.daaw.br1;
import com.daaw.pz;
import com.daaw.wd0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class d {
    public e a;
    public e.b b;
    public int c = 0;
    public int d = 0;
    public long e = 80;
    public float f = 0.25f;
    public float g = (((float) (80 + 10)) * 0.001f) / 0.25f;
    public long h = 300;
    public long i = -1;
    public b j = new b(this);

    /* loaded from: classes.dex */
    public class a implements e.b {
        public a() {
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void a(boolean z, String str) {
            d.this.b.a(z, str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void b() {
            d.this.b.b();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void c(b.C0042b c0042b) {
            d.this.b.c(c0042b);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public b.c d(String str) {
            return d.this.b.d(str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean e(String str) {
            return d.this.b.e(str);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void f(boolean z) {
            d.this.b.f(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void g(boolean z) {
            if (d.this.j.hasMessages(5) || d.this.j.hasMessages(6) || d.this.j.hasMessages(7)) {
                return;
            }
            d.this.b.g(z);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public boolean h() {
            return d.this.b.h();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void i(int i, int i2, float f) {
            d.this.b.i(i, i2, f);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void j(boolean z, int i) {
            d.this.b.j(z, i);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void k(pz pzVar) {
            d.this.b.k(pzVar);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public int l() {
            return d.this.b.l();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void m(long j) {
            d.this.b.m(j);
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public SurfaceHolder n() {
            return d.this.b.n();
        }

        @Override // com.daaw.avee.comp.playback.e.b
        public void o() {
            if (d.this.j.hasMessages(5) || d.this.j.hasMessages(6) || d.this.j.hasMessages(7)) {
                return;
            }
            d.this.b.o();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
        public WeakReference<d> a;

        public b(d dVar) {
            this.a = new WeakReference<>(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
            if (r0.a.t(-r0.g, 1) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
            r0.a.v();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
            if (r0.a.t(-r3, 1) != false) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void handleMessage(android.os.Message r14) {
            /*
                Method dump skipped, instructions count: 356
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.comp.playback.d.b.handleMessage(android.os.Message):void");
        }
    }

    public d(e eVar, e.b bVar, long j) {
        this.a = eVar;
        this.b = bVar;
        A(j);
        eVar.q(new a());
    }

    public void A(long j) {
        this.i = j;
    }

    public final void B() {
        this.c = 5;
        this.a.start();
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public final void C() {
        this.c = 3;
        this.a.start();
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void D() {
        C();
        r();
    }

    public final void E(wd0 wd0Var, boolean z, boolean z2, float f, long j) {
        this.j.removeMessages(4);
        this.j.sendMessageDelayed(this.j.obtainMessage(4), this.h);
        this.j.removeMessages(3);
        this.d = 0;
        this.c = 0;
        this.j.removeMessages(2);
        this.a.r(wd0Var);
        this.a.j(z, z2, f, j);
    }

    public void F() {
        this.a.stop();
    }

    public final void G() {
        this.c = 1;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void H() {
        G();
        r();
    }

    public final void p() {
        this.a.v();
    }

    public void q() {
        this.j.removeMessages(3);
        this.d = 6;
        this.j.sendMessageDelayed(this.j.obtainMessage(3), this.e);
    }

    public void r() {
        this.j.removeMessages(3);
        this.d = 4;
        this.j.sendMessageDelayed(this.j.obtainMessage(3), this.e);
    }

    public e s() {
        return this.a;
    }

    public final void t() {
        this.c = 5;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public final void u() {
        this.a.start();
    }

    public final void v() {
        this.c = 2;
        this.j.removeMessages(2);
        this.j.sendMessageDelayed(this.j.obtainMessage(2), this.e);
    }

    public void w() {
        v();
        r();
    }

    public void x(wd0 wd0Var, boolean z, long j) {
        this.j.removeMessages(5);
        this.j.removeMessages(6);
        this.j.removeMessages(7);
        long j2 = this.i;
        if (j2 < 0 || j2 <= this.h) {
            E(wd0Var, true, z, 1.0f, j);
            p();
            return;
        }
        E(wd0Var, false, z, 0.0f, j);
        t();
        q();
    }

    public void y(wd0 wd0Var, boolean z, long j, long j2) {
        Message obtainMessage;
        this.j.removeMessages(5);
        this.j.removeMessages(6);
        this.j.removeMessages(7);
        long F = j2 - br1.F();
        if (j2 <= 0 || F <= 0) {
            x(wd0Var, z, j);
            return;
        }
        long j3 = this.i;
        if (j3 < 0 || j3 <= this.h) {
            if (j3 >= 0) {
                E(wd0Var, false, false, 1.0f, j);
                if (!z) {
                    return;
                }
            } else {
                E(wd0Var, true, false, 1.0f, j);
                if (!z) {
                    return;
                }
            }
            obtainMessage = this.j.obtainMessage(7);
        } else {
            E(wd0Var, false, false, 0.0f, j);
            if (!z) {
                return;
            }
            obtainMessage = this.j.obtainMessage(5);
        }
        this.j.sendMessageAtTime(obtainMessage, j2);
    }

    public void z() {
        this.j.removeCallbacksAndMessages(null);
        this.a.a();
        this.a = null;
    }
}
