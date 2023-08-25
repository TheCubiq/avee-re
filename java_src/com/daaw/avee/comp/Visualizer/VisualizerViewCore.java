package com.daaw.avee.comp.Visualizer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.daaw.af0;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.bq0;
import com.daaw.bs1;
import com.daaw.d41;
import com.daaw.de0;
import com.daaw.e0;
import com.daaw.f40;
import com.daaw.f61;
import com.daaw.g40;
import com.daaw.gr1;
import com.daaw.h2;
import com.daaw.i2;
import com.daaw.od0;
import com.daaw.om1;
import com.daaw.pw1;
import com.daaw.rw1;
import com.daaw.sg0;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.vk1;
import com.daaw.vn;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import com.daaw.zw1;
/* loaded from: classes.dex */
public class VisualizerViewCore extends GLSurfaceView {
    public int p;
    public d41 q;
    public int r;
    public sg0 s;
    public static ww1<Integer, com.daaw.avee.comp.playback.a> t = new ww1<>();
    public static xw1<String, VisualizerViewCore, String> u = new xw1<>();
    public static zw1<String, bs1, bs1, bq0, de0, bs1> v = new zw1<>();
    public static vw1<i2> w = new vw1<>();
    public static rw1<af0, h2> x = new rw1<>();
    public static vw1<vn> y = new vw1<>();
    public static pw1 z = new pw1();
    public static rw1<Float, Float> A = new rw1<>();
    public static vw1<f40> B = new vw1<>();
    public static tw1<int[], Integer, Integer, int[]> C = new tw1<>();
    public static vw1<Boolean> D = new vw1<>();
    public static vw1<Integer> E = new vw1<>();
    public static sw1<vk1, Boolean, String> F = new sw1<>();
    public static ww1<Integer, Integer> G = new ww1<>();
    public static ww1<Context, Integer> H = new ww1<>();
    public static ww1<Context, Integer> I = new ww1<>();
    public static ww1<Context, om1> J = new ww1<>();

    /* loaded from: classes.dex */
    public class a implements sg0 {
        public a() {
        }

        @Override // com.daaw.sg0
        public bs1 a(String str, bs1 bs1Var, bs1 bs1Var2, bq0 bq0Var, de0 de0Var) {
            return VisualizerViewCore.v.a(str, bs1Var, bs1Var2, bq0Var, de0Var, bs1Var2);
        }

        @Override // com.daaw.sg0
        public int b() {
            return VisualizerViewCore.E.a(0).intValue();
        }

        @Override // com.daaw.sg0
        public void c(af0 af0Var, h2 h2Var) {
            VisualizerViewCore.x.a(af0Var, h2Var);
        }

        @Override // com.daaw.sg0
        public String d(String str) {
            return VisualizerViewCore.u.a(str, VisualizerViewCore.this, str);
        }

        @Override // com.daaw.sg0
        public boolean e() {
            return VisualizerViewCore.D.a(Boolean.FALSE).booleanValue();
        }

        @Override // com.daaw.sg0
        public void f() {
            VisualizerViewCore.z.a();
        }

        @Override // com.daaw.sg0
        public int g() {
            return VisualizerViewCore.I.a(VisualizerViewCore.this.getContext(), 3).intValue();
        }

        @Override // com.daaw.sg0
        public void h(vk1 vk1Var, boolean z, String str) {
            VisualizerViewCore.F.a(vk1Var, Boolean.valueOf(z), str);
        }

        @Override // com.daaw.sg0
        public om1 i() {
            return VisualizerViewCore.J.a(VisualizerViewCore.this.getContext(), null);
        }

        @Override // com.daaw.sg0
        public com.daaw.avee.comp.playback.a j(int i) {
            return VisualizerViewCore.t.a(Integer.valueOf(i), null);
        }

        @Override // com.daaw.sg0
        public i2 k() {
            return VisualizerViewCore.w.a(null);
        }

        @Override // com.daaw.sg0
        public int l() {
            return VisualizerViewCore.H.a(VisualizerViewCore.this.getContext(), 0).intValue();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ vn p;

        public b(vn vnVar) {
            this.p = vnVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ f61 p;

        public c(f61 f61Var) {
            this.p = f61Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.k();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public final /* synthetic */ String p;
        public final /* synthetic */ e0 q;
        public final /* synthetic */ VisualizerViewCore r;

        public e(String str, e0 e0Var, VisualizerViewCore visualizerViewCore) {
            this.p = str;
            this.q = e0Var;
            this.r = visualizerViewCore;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeCustomizationData(vn.e(this.p));
            e0 e0Var = this.q;
            if (e0Var != null) {
                e0Var.a(this.r);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public final /* synthetic */ int p;
        public final /* synthetic */ int q;

        public f(int i, int i2) {
            this.p = i;
            this.q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.p(this.p, this.q);
        }
    }

    public VisualizerViewCore(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = 2;
        this.r = 0;
        this.s = new a();
        setEGLContextClientVersion(this.p);
        setEGLConfigChooser(true);
        d41 d41Var = new d41(context, context.getResources(), this.s);
        this.q = d41Var;
        setRenderer(d41Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(vn vnVar, od0 od0Var, e0 e0Var, VisualizerViewCore visualizerViewCore) {
        this.q.c(vnVar, od0Var);
        if (e0Var != null) {
            e0Var.a(visualizerViewCore);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(f61 f61Var) {
        this.q.h(f61Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(vn vnVar) {
        this.q.g(vnVar);
    }

    public g40 getFrameStats() {
        return this.q.a();
    }

    public int getFrameTimeMs() {
        return this.q.b();
    }

    public void i(vn vnVar, od0 od0Var) {
        this.q.c(vnVar, od0Var);
    }

    public void j(final vn vnVar, final od0 od0Var, final e0<VisualizerViewCore> e0Var) {
        queueEvent(new Runnable() { // from class: com.daaw.vv1
            @Override // java.lang.Runnable
            public final void run() {
                VisualizerViewCore.this.g(vnVar, od0Var, e0Var, this);
            }
        });
    }

    public final void k() {
        this.q.d();
    }

    public void l() {
        queueEvent(new d());
    }

    public final void m() {
        this.q.e();
    }

    public void n() {
        queueEvent(new Runnable() { // from class: com.daaw.uv1
            @Override // java.lang.Runnable
            public final void run() {
                VisualizerViewCore.this.m();
            }
        });
    }

    public void o(vn vnVar, e0<VisualizerViewCore> e0Var) {
        queueEvent(new e(vnVar.o(), e0Var, this));
    }

    public final void p(int i, int i2) {
        this.q.i(i, i2);
    }

    public void q(int i, int i2) {
        queueEvent(new f(i, i2));
    }

    public void setThemeCustomizationData(vn vnVar) {
        gr1.b();
        this.q.f(vnVar);
    }

    public void setThemeElementsUiTh(f61 f61Var) {
        queueEvent(new c(f61Var));
    }

    public void setThemeElementsUiTh(vn vnVar) {
        queueEvent(new b(vnVar));
    }
}
