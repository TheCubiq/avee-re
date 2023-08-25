package com.daaw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.daaw.bx0;
import com.daaw.fx0;
import com.daaw.o2;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
@TargetApi(16)
/* loaded from: classes.dex */
public class fd1 implements rz {
    public final a41[] a;
    public final rz b;
    public final Handler c;
    public final b d;
    public final CopyOnWriteArraySet<qs1> e;
    public final CopyOnWriteArraySet<pk1> f;
    public final CopyOnWriteArraySet<xp0> g;
    public final CopyOnWriteArraySet<rs1> h;
    public final CopyOnWriteArraySet<n7> i;
    public final o2 j;
    public Format k;
    public Format l;
    public Surface m;
    public boolean n;
    public int o;
    public SurfaceHolder p;
    public TextureView q;
    public fq r;
    public fq s;
    public int t;
    public f7 u;
    public float v;
    public bp0 w;
    public List<ln> x;

    /* loaded from: classes.dex */
    public final class b implements rs1, n7, pk1, xp0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public b() {
        }

        @Override // com.daaw.n7
        public void B(int i, long j, long j2) {
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).B(i, j, j2);
            }
        }

        @Override // com.daaw.n7
        public void D(fq fqVar) {
            fd1.this.s = fqVar;
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).D(fqVar);
            }
        }

        @Override // com.daaw.n7
        public void a(int i) {
            fd1.this.t = i;
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).a(i);
            }
        }

        @Override // com.daaw.rs1
        public void b(int i, int i2, int i3, float f) {
            Iterator it = fd1.this.e.iterator();
            while (it.hasNext()) {
                ((qs1) it.next()).b(i, i2, i3, f);
            }
            Iterator it2 = fd1.this.h.iterator();
            while (it2.hasNext()) {
                ((rs1) it2.next()).b(i, i2, i3, f);
            }
        }

        @Override // com.daaw.rs1
        public void f(String str, long j, long j2) {
            Iterator it = fd1.this.h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).f(str, j, j2);
            }
        }

        @Override // com.daaw.pk1
        public void h(List<ln> list) {
            fd1.this.x = list;
            Iterator it = fd1.this.f.iterator();
            while (it.hasNext()) {
                ((pk1) it.next()).h(list);
            }
        }

        @Override // com.daaw.rs1
        public void i(Surface surface) {
            if (fd1.this.m == surface) {
                Iterator it = fd1.this.e.iterator();
                while (it.hasNext()) {
                    ((qs1) it.next()).f();
                }
            }
            Iterator it2 = fd1.this.h.iterator();
            while (it2.hasNext()) {
                ((rs1) it2.next()).i(surface);
            }
        }

        @Override // com.daaw.n7
        public void j(fq fqVar) {
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).j(fqVar);
            }
            fd1.this.l = null;
            fd1.this.s = null;
            fd1.this.t = 0;
        }

        @Override // com.daaw.n7
        public void n(String str, long j, long j2) {
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).n(str, j, j2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            fd1.this.K(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            fd1.this.K(null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.daaw.xp0
        public void p(Metadata metadata) {
            Iterator it = fd1.this.g.iterator();
            while (it.hasNext()) {
                ((xp0) it.next()).p(metadata);
            }
        }

        @Override // com.daaw.rs1
        public void q(int i, long j) {
            Iterator it = fd1.this.h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).q(i, j);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            fd1.this.K(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            fd1.this.K(null, false);
        }

        @Override // com.daaw.rs1
        public void u(fq fqVar) {
            Iterator it = fd1.this.h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).u(fqVar);
            }
            fd1.this.k = null;
            fd1.this.r = null;
        }

        @Override // com.daaw.rs1
        public void x(Format format) {
            fd1.this.k = format;
            Iterator it = fd1.this.h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).x(format);
            }
        }

        @Override // com.daaw.rs1
        public void y(fq fqVar) {
            fd1.this.r = fqVar;
            Iterator it = fd1.this.h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).y(fqVar);
            }
        }

        @Override // com.daaw.n7
        public void z(Format format) {
            fd1.this.l = format;
            Iterator it = fd1.this.i.iterator();
            while (it.hasNext()) {
                ((n7) it.next()).z(format);
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c extends qs1 {
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, yu<i40> yuVar) {
        this(e41Var, wm1Var, hk0Var, yuVar, new o2.a());
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, yu<i40> yuVar, o2.a aVar) {
        this(e41Var, wm1Var, hk0Var, yuVar, aVar, zf.a);
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, yu<i40> yuVar, o2.a aVar, zf zfVar) {
        b bVar = new b();
        this.d = bVar;
        this.e = new CopyOnWriteArraySet<>();
        this.f = new CopyOnWriteArraySet<>();
        this.g = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<rs1> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.h = copyOnWriteArraySet;
        CopyOnWriteArraySet<n7> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.i = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.c = handler;
        a41[] a2 = e41Var.a(handler, bVar, bVar, bVar, bVar, yuVar);
        this.a = a2;
        this.v = 1.0f;
        this.t = 0;
        this.u = f7.e;
        this.o = 1;
        this.x = Collections.emptyList();
        rz F = F(a2, wm1Var, hk0Var, zfVar);
        this.b = F;
        o2 a3 = aVar.a(F, zfVar);
        this.j = a3;
        b(a3);
        copyOnWriteArraySet.add(a3);
        copyOnWriteArraySet2.add(a3);
        D(a3);
        if (yuVar instanceof com.google.android.exoplayer2.drm.c) {
            ((com.google.android.exoplayer2.drm.c) yuVar).h(handler, a3);
        }
    }

    public void C(x2 x2Var) {
        this.j.G(x2Var);
    }

    public void D(xp0 xp0Var) {
        this.g.add(xp0Var);
    }

    public void E(qs1 qs1Var) {
        this.e.add(qs1Var);
    }

    public rz F(a41[] a41VarArr, wm1 wm1Var, hk0 hk0Var, zf zfVar) {
        return new tz(a41VarArr, wm1Var, hk0Var, zfVar);
    }

    public void G(bp0 bp0Var) {
        l(bp0Var, true, true);
    }

    public final void H() {
        TextureView textureView = this.q;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == this.d) {
                this.q.setSurfaceTextureListener(null);
            }
            this.q = null;
        }
        SurfaceHolder surfaceHolder = this.p;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.d);
            this.p = null;
        }
    }

    @Deprecated
    public void I(c cVar) {
        this.e.clear();
        if (cVar != null) {
            E(cVar);
        }
    }

    public void J(Surface surface) {
        H();
        K(surface, false);
    }

    public final void K(Surface surface, boolean z) {
        a41[] a41VarArr;
        ArrayList<fx0> arrayList = new ArrayList();
        for (a41 a41Var : this.a) {
            if (a41Var.i() == 2) {
                arrayList.add(this.b.d(a41Var).n(1).m(surface).l());
            }
        }
        Surface surface2 = this.m;
        if (surface2 != null && surface2 != surface) {
            try {
                for (fx0 fx0Var : arrayList) {
                    fx0Var.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.n) {
                this.m.release();
            }
        }
        this.m = surface;
        this.n = z;
    }

    public void L(float f) {
        a41[] a41VarArr;
        this.v = f;
        for (a41 a41Var : this.a) {
            if (a41Var.i() == 1) {
                this.b.d(a41Var).n(2).m(Float.valueOf(f)).l();
            }
        }
    }

    @Override // com.daaw.bx0
    public void a() {
        this.b.a();
        H();
        Surface surface = this.m;
        if (surface != null) {
            if (this.n) {
                surface.release();
            }
            this.m = null;
        }
        bp0 bp0Var = this.w;
        if (bp0Var != null) {
            bp0Var.i(this.j);
        }
        this.x = Collections.emptyList();
    }

    @Override // com.daaw.bx0
    public void b(bx0.a aVar) {
        this.b.b(aVar);
    }

    @Override // com.daaw.bx0
    public boolean c() {
        return this.b.c();
    }

    @Override // com.daaw.rz
    public fx0 d(fx0.b bVar) {
        return this.b.d(bVar);
    }

    @Override // com.daaw.bx0
    public int e() {
        return this.b.e();
    }

    @Override // com.daaw.bx0
    public void f(long j) {
        this.j.N();
        this.b.f(j);
    }

    @Override // com.daaw.bx0
    public int g() {
        return this.b.g();
    }

    @Override // com.daaw.bx0
    public long getDuration() {
        return this.b.getDuration();
    }

    @Override // com.daaw.bx0
    public void h(boolean z) {
        this.b.h(z);
    }

    @Override // com.daaw.bx0
    public long i() {
        return this.b.i();
    }

    @Override // com.daaw.bx0
    public long j() {
        return this.b.j();
    }

    @Override // com.daaw.bx0
    public int k() {
        return this.b.k();
    }

    @Override // com.daaw.rz
    public void l(bp0 bp0Var, boolean z, boolean z2) {
        bp0 bp0Var2 = this.w;
        if (bp0Var2 != bp0Var) {
            if (bp0Var2 != null) {
                bp0Var2.i(this.j);
                this.j.O();
            }
            bp0Var.c(this.c, this.j);
            this.w = bp0Var;
        }
        this.b.l(bp0Var, z, z2);
    }

    @Override // com.daaw.bx0
    public int m() {
        return this.b.m();
    }

    @Override // com.daaw.bx0
    public nl1 n() {
        return this.b.n();
    }

    @Override // com.daaw.bx0
    public long o() {
        return this.b.o();
    }
}
