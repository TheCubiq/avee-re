package com.daaw;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.daaw.C2392o2;
import com.daaw.bx0;
import com.daaw.fx0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C3929c;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
@TargetApi(16)
/* loaded from: classes.dex */
public class fd1 implements InterfaceC2898rz {

    /* renamed from: a */
    public final a41[] f9445a;

    /* renamed from: b */
    public final InterfaceC2898rz f9446b;

    /* renamed from: c */
    public final Handler f9447c;

    /* renamed from: d */
    public final SurfaceHolder$CallbackC1271b f9448d;

    /* renamed from: e */
    public final CopyOnWriteArraySet<qs1> f9449e;

    /* renamed from: f */
    public final CopyOnWriteArraySet<pk1> f9450f;

    /* renamed from: g */
    public final CopyOnWriteArraySet<xp0> f9451g;

    /* renamed from: h */
    public final CopyOnWriteArraySet<rs1> f9452h;

    /* renamed from: i */
    public final CopyOnWriteArraySet<InterfaceC2251n7> f9453i;

    /* renamed from: j */
    public final C2392o2 f9454j;

    /* renamed from: k */
    public Format f9455k;

    /* renamed from: l */
    public Format f9456l;

    /* renamed from: m */
    public Surface f9457m;

    /* renamed from: n */
    public boolean f9458n;

    /* renamed from: o */
    public int f9459o;

    /* renamed from: p */
    public SurfaceHolder f9460p;

    /* renamed from: q */
    public TextureView f9461q;

    /* renamed from: r */
    public C1321fq f9462r;

    /* renamed from: s */
    public C1321fq f9463s;

    /* renamed from: t */
    public int f9464t;

    /* renamed from: u */
    public C1255f7 f9465u;

    /* renamed from: v */
    public float f9466v;

    /* renamed from: w */
    public bp0 f9467w;

    /* renamed from: x */
    public List<C2099ln> f9468x;

    /* renamed from: com.daaw.fd1$b */
    /* loaded from: classes.dex */
    public final class SurfaceHolder$CallbackC1271b implements rs1, InterfaceC2251n7, pk1, xp0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public SurfaceHolder$CallbackC1271b() {
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: B */
        public void mo14645B(int i, long j, long j2) {
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14645B(i, j, j2);
            }
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: D */
        public void mo14643D(C1321fq c1321fq) {
            fd1.this.f9463s = c1321fq;
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14643D(c1321fq);
            }
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: a */
        public void mo14631a(int i) {
            fd1.this.f9464t = i;
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14631a(i);
            }
        }

        @Override // com.daaw.rs1
        /* renamed from: b */
        public void mo10992b(int i, int i2, int i3, float f) {
            Iterator it = fd1.this.f9449e.iterator();
            while (it.hasNext()) {
                ((qs1) it.next()).mo12235b(i, i2, i3, f);
            }
            Iterator it2 = fd1.this.f9452h.iterator();
            while (it2.hasNext()) {
                ((rs1) it2.next()).mo10992b(i, i2, i3, f);
            }
        }

        @Override // com.daaw.rs1
        /* renamed from: f */
        public void mo10991f(String str, long j, long j2) {
            Iterator it = fd1.this.f9452h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).mo10991f(str, j, j2);
            }
        }

        @Override // com.daaw.pk1
        /* renamed from: h */
        public void mo1491h(List<C2099ln> list) {
            fd1.this.f9468x = list;
            Iterator it = fd1.this.f9450f.iterator();
            while (it.hasNext()) {
                ((pk1) it.next()).mo1491h(list);
            }
        }

        @Override // com.daaw.rs1
        /* renamed from: i */
        public void mo10990i(Surface surface) {
            if (fd1.this.f9457m == surface) {
                Iterator it = fd1.this.f9449e.iterator();
                while (it.hasNext()) {
                    ((qs1) it.next()).mo12234f();
                }
            }
            Iterator it2 = fd1.this.f9452h.iterator();
            while (it2.hasNext()) {
                ((rs1) it2.next()).mo10990i(surface);
            }
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: j */
        public void mo14629j(C1321fq c1321fq) {
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14629j(c1321fq);
            }
            fd1.this.f9456l = null;
            fd1.this.f9463s = null;
            fd1.this.f9464t = 0;
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: n */
        public void mo14626n(String str, long j, long j2) {
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14626n(str, j, j2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            fd1.this.m22786K(new Surface(surfaceTexture), true);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            fd1.this.m22786K(null, true);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.daaw.xp0
        /* renamed from: p */
        public void mo4856p(Metadata metadata) {
            Iterator it = fd1.this.f9451g.iterator();
            while (it.hasNext()) {
                ((xp0) it.next()).mo4856p(metadata);
            }
        }

        @Override // com.daaw.rs1
        /* renamed from: q */
        public void mo10989q(int i, long j) {
            Iterator it = fd1.this.f9452h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).mo10989q(i, j);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            fd1.this.m22786K(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            fd1.this.m22786K(null, false);
        }

        @Override // com.daaw.rs1
        /* renamed from: u */
        public void mo10988u(C1321fq c1321fq) {
            Iterator it = fd1.this.f9452h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).mo10988u(c1321fq);
            }
            fd1.this.f9455k = null;
            fd1.this.f9462r = null;
        }

        @Override // com.daaw.rs1
        /* renamed from: x */
        public void mo10987x(Format format) {
            fd1.this.f9455k = format;
            Iterator it = fd1.this.f9452h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).mo10987x(format);
            }
        }

        @Override // com.daaw.rs1
        /* renamed from: y */
        public void mo10986y(C1321fq c1321fq) {
            fd1.this.f9462r = c1321fq;
            Iterator it = fd1.this.f9452h.iterator();
            while (it.hasNext()) {
                ((rs1) it.next()).mo10986y(c1321fq);
            }
        }

        @Override // com.daaw.InterfaceC2251n7
        /* renamed from: z */
        public void mo14621z(Format format) {
            fd1.this.f9456l = format;
            Iterator it = fd1.this.f9453i.iterator();
            while (it.hasNext()) {
                ((InterfaceC2251n7) it.next()).mo14621z(format);
            }
        }
    }

    @Deprecated
    /* renamed from: com.daaw.fd1$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1272c extends qs1 {
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, InterfaceC3746yu<i40> interfaceC3746yu) {
        this(e41Var, wm1Var, hk0Var, interfaceC3746yu, new C2392o2.C2393a());
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, InterfaceC3746yu<i40> interfaceC3746yu, C2392o2.C2393a c2393a) {
        this(e41Var, wm1Var, hk0Var, interfaceC3746yu, c2393a, InterfaceC3836zf.f35013a);
    }

    public fd1(e41 e41Var, wm1 wm1Var, hk0 hk0Var, InterfaceC3746yu<i40> interfaceC3746yu, C2392o2.C2393a c2393a, InterfaceC3836zf interfaceC3836zf) {
        SurfaceHolder$CallbackC1271b surfaceHolder$CallbackC1271b = new SurfaceHolder$CallbackC1271b();
        this.f9448d = surfaceHolder$CallbackC1271b;
        this.f9449e = new CopyOnWriteArraySet<>();
        this.f9450f = new CopyOnWriteArraySet<>();
        this.f9451g = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<rs1> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        this.f9452h = copyOnWriteArraySet;
        CopyOnWriteArraySet<InterfaceC2251n7> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f9453i = copyOnWriteArraySet2;
        Handler handler = new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.f9447c = handler;
        a41[] mo14064a = e41Var.mo14064a(handler, surfaceHolder$CallbackC1271b, surfaceHolder$CallbackC1271b, surfaceHolder$CallbackC1271b, surfaceHolder$CallbackC1271b, interfaceC3746yu);
        this.f9445a = mo14064a;
        this.f9466v = 1.0f;
        this.f9464t = 0;
        this.f9465u = C1255f7.f9202e;
        this.f9459o = 1;
        this.f9468x = Collections.emptyList();
        InterfaceC2898rz m22791F = m22791F(mo14064a, wm1Var, hk0Var, interfaceC3836zf);
        this.f9446b = m22791F;
        C2392o2 m14620a = c2393a.m14620a(m22791F, interfaceC3836zf);
        this.f9454j = m14620a;
        mo8693b(m14620a);
        copyOnWriteArraySet.add(m14620a);
        copyOnWriteArraySet2.add(m14620a);
        m22793D(m14620a);
        if (interfaceC3746yu instanceof C3929c) {
            ((C3929c) interfaceC3746yu).m1669h(handler, m14620a);
        }
    }

    /* renamed from: C */
    public void m22794C(InterfaceC3494x2 interfaceC3494x2) {
        this.f9454j.m14640G(interfaceC3494x2);
    }

    /* renamed from: D */
    public void m22793D(xp0 xp0Var) {
        this.f9451g.add(xp0Var);
    }

    /* renamed from: E */
    public void m22792E(qs1 qs1Var) {
        this.f9449e.add(qs1Var);
    }

    /* renamed from: F */
    public InterfaceC2898rz m22791F(a41[] a41VarArr, wm1 wm1Var, hk0 hk0Var, InterfaceC3836zf interfaceC3836zf) {
        return new C3147tz(a41VarArr, wm1Var, hk0Var, interfaceC3836zf);
    }

    /* renamed from: G */
    public void m22790G(bp0 bp0Var) {
        mo8683l(bp0Var, true, true);
    }

    /* renamed from: H */
    public final void m22789H() {
        TextureView textureView = this.f9461q;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() == this.f9448d) {
                this.f9461q.setSurfaceTextureListener(null);
            }
            this.f9461q = null;
        }
        SurfaceHolder surfaceHolder = this.f9460p;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f9448d);
            this.f9460p = null;
        }
    }

    @Deprecated
    /* renamed from: I */
    public void m22788I(InterfaceC1272c interfaceC1272c) {
        this.f9449e.clear();
        if (interfaceC1272c != null) {
            m22792E(interfaceC1272c);
        }
    }

    /* renamed from: J */
    public void m22787J(Surface surface) {
        m22789H();
        m22786K(surface, false);
    }

    /* renamed from: K */
    public final void m22786K(Surface surface, boolean z) {
        a41[] a41VarArr;
        ArrayList<fx0> arrayList = new ArrayList();
        for (a41 a41Var : this.f9445a) {
            if (a41Var.mo5361i() == 2) {
                arrayList.add(this.f9446b.mo8691d(a41Var).m22155n(1).m22156m(surface).m22157l());
            }
        }
        Surface surface2 = this.f9457m;
        if (surface2 != null && surface2 != surface) {
            try {
                for (fx0 fx0Var : arrayList) {
                    fx0Var.m22168a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.f9458n) {
                this.f9457m.release();
            }
        }
        this.f9457m = surface;
        this.f9458n = z;
    }

    /* renamed from: L */
    public void m22785L(float f) {
        a41[] a41VarArr;
        this.f9466v = f;
        for (a41 a41Var : this.f9445a) {
            if (a41Var.mo5361i() == 1) {
                this.f9446b.mo8691d(a41Var).m22155n(2).m22156m(Float.valueOf(f)).m22157l();
            }
        }
    }

    @Override // com.daaw.bx0
    /* renamed from: a */
    public void mo8694a() {
        this.f9446b.mo8694a();
        m22789H();
        Surface surface = this.f9457m;
        if (surface != null) {
            if (this.f9458n) {
                surface.release();
            }
            this.f9457m = null;
        }
        bp0 bp0Var = this.f9467w;
        if (bp0Var != null) {
            bp0Var.mo8401i(this.f9454j);
        }
        this.f9468x = Collections.emptyList();
    }

    @Override // com.daaw.bx0
    /* renamed from: b */
    public void mo8693b(bx0.InterfaceC0893a interfaceC0893a) {
        this.f9446b.mo8693b(interfaceC0893a);
    }

    @Override // com.daaw.bx0
    /* renamed from: c */
    public boolean mo8692c() {
        return this.f9446b.mo8692c();
    }

    @Override // com.daaw.InterfaceC2898rz
    /* renamed from: d */
    public fx0 mo8691d(fx0.InterfaceC1343b interfaceC1343b) {
        return this.f9446b.mo8691d(interfaceC1343b);
    }

    @Override // com.daaw.bx0
    /* renamed from: e */
    public int mo8690e() {
        return this.f9446b.mo8690e();
    }

    @Override // com.daaw.bx0
    /* renamed from: f */
    public void mo8689f(long j) {
        this.f9454j.m14633N();
        this.f9446b.mo8689f(j);
    }

    @Override // com.daaw.bx0
    /* renamed from: g */
    public int mo8688g() {
        return this.f9446b.mo8688g();
    }

    @Override // com.daaw.bx0
    public long getDuration() {
        return this.f9446b.getDuration();
    }

    @Override // com.daaw.bx0
    /* renamed from: h */
    public void mo8687h(boolean z) {
        this.f9446b.mo8687h(z);
    }

    @Override // com.daaw.bx0
    /* renamed from: i */
    public long mo8686i() {
        return this.f9446b.mo8686i();
    }

    @Override // com.daaw.bx0
    /* renamed from: j */
    public long mo8685j() {
        return this.f9446b.mo8685j();
    }

    @Override // com.daaw.bx0
    /* renamed from: k */
    public int mo8684k() {
        return this.f9446b.mo8684k();
    }

    @Override // com.daaw.InterfaceC2898rz
    /* renamed from: l */
    public void mo8683l(bp0 bp0Var, boolean z, boolean z2) {
        bp0 bp0Var2 = this.f9467w;
        if (bp0Var2 != bp0Var) {
            if (bp0Var2 != null) {
                bp0Var2.mo8401i(this.f9454j);
                this.f9454j.m14632O();
            }
            bp0Var.mo8404c(this.f9447c, this.f9454j);
            this.f9467w = bp0Var;
        }
        this.f9446b.mo8683l(bp0Var, z, z2);
    }

    @Override // com.daaw.bx0
    /* renamed from: m */
    public int mo8682m() {
        return this.f9446b.mo8682m();
    }

    @Override // com.daaw.bx0
    /* renamed from: n */
    public nl1 mo8681n() {
        return this.f9446b.mo8681n();
    }

    @Override // com.daaw.bx0
    /* renamed from: o */
    public long mo8680o() {
        return this.f9446b.mo8680o();
    }
}
