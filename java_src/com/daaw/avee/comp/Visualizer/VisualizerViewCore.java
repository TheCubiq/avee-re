package com.daaw.avee.comp.Visualizer;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import com.daaw.C1496h2;
import com.daaw.C1652i2;
import com.daaw.C3355vn;
import com.daaw.InterfaceC1153e0;
import com.daaw.af0;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.bq0;
import com.daaw.bs1;
import com.daaw.d41;
import com.daaw.de0;
import com.daaw.f40;
import com.daaw.f61;
import com.daaw.g40;
import com.daaw.gr1;
import com.daaw.od0;
import com.daaw.om1;
import com.daaw.pw1;
import com.daaw.rw1;
import com.daaw.sg0;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.vk1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import com.daaw.zw1;
/* loaded from: classes.dex */
public class VisualizerViewCore extends GLSurfaceView {

    /* renamed from: p */
    public int f3833p;

    /* renamed from: q */
    public d41 f3834q;

    /* renamed from: r */
    public int f3835r;

    /* renamed from: s */
    public sg0 f3836s;

    /* renamed from: t */
    public static ww1<Integer, C0729a> f3826t = new ww1<>();

    /* renamed from: u */
    public static xw1<String, VisualizerViewCore, String> f3827u = new xw1<>();

    /* renamed from: v */
    public static zw1<String, bs1, bs1, bq0, de0, bs1> f3828v = new zw1<>();

    /* renamed from: w */
    public static vw1<C1652i2> f3829w = new vw1<>();

    /* renamed from: x */
    public static rw1<af0, C1496h2> f3830x = new rw1<>();

    /* renamed from: y */
    public static vw1<C3355vn> f3831y = new vw1<>();

    /* renamed from: z */
    public static pw1 f3832z = new pw1();

    /* renamed from: A */
    public static rw1<Float, Float> f3816A = new rw1<>();

    /* renamed from: B */
    public static vw1<f40> f3817B = new vw1<>();

    /* renamed from: C */
    public static tw1<int[], Integer, Integer, int[]> f3818C = new tw1<>();

    /* renamed from: D */
    public static vw1<Boolean> f3819D = new vw1<>();

    /* renamed from: E */
    public static vw1<Integer> f3820E = new vw1<>();

    /* renamed from: F */
    public static sw1<vk1, Boolean, String> f3821F = new sw1<>();

    /* renamed from: G */
    public static ww1<Integer, Integer> f3822G = new ww1<>();

    /* renamed from: H */
    public static ww1<Context, Integer> f3823H = new ww1<>();

    /* renamed from: I */
    public static ww1<Context, Integer> f3824I = new ww1<>();

    /* renamed from: J */
    public static ww1<Context, om1> f3825J = new ww1<>();

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$a */
    /* loaded from: classes.dex */
    public class C0706a implements sg0 {
        public C0706a() {
        }

        @Override // com.daaw.sg0
        /* renamed from: a */
        public bs1 mo2876a(String str, bs1 bs1Var, bs1 bs1Var2, bq0 bq0Var, de0 de0Var) {
            return VisualizerViewCore.f3828v.m1825a(str, bs1Var, bs1Var2, bq0Var, de0Var, bs1Var2);
        }

        @Override // com.daaw.sg0
        /* renamed from: b */
        public int mo2875b() {
            return VisualizerViewCore.f3820E.m6692a(0).intValue();
        }

        @Override // com.daaw.sg0
        /* renamed from: c */
        public void mo2874c(af0 af0Var, C1496h2 c1496h2) {
            VisualizerViewCore.f3830x.m10862a(af0Var, c1496h2);
        }

        @Override // com.daaw.sg0
        /* renamed from: d */
        public String mo2873d(String str) {
            return VisualizerViewCore.f3827u.m4425a(str, VisualizerViewCore.this, str);
        }

        @Override // com.daaw.sg0
        /* renamed from: e */
        public boolean mo2872e() {
            return VisualizerViewCore.f3819D.m6692a(Boolean.FALSE).booleanValue();
        }

        @Override // com.daaw.sg0
        /* renamed from: f */
        public void mo2871f() {
            VisualizerViewCore.f3832z.m12990a();
        }

        @Override // com.daaw.sg0
        /* renamed from: g */
        public int mo2870g() {
            return VisualizerViewCore.f3824I.m5753a(VisualizerViewCore.this.getContext(), 3).intValue();
        }

        @Override // com.daaw.sg0
        /* renamed from: h */
        public void mo2869h(vk1 vk1Var, boolean z, String str) {
            VisualizerViewCore.f3821F.m9795a(vk1Var, Boolean.valueOf(z), str);
        }

        @Override // com.daaw.sg0
        /* renamed from: i */
        public om1 mo2868i() {
            return VisualizerViewCore.f3825J.m5753a(VisualizerViewCore.this.getContext(), null);
        }

        @Override // com.daaw.sg0
        /* renamed from: j */
        public C0729a mo2867j(int i) {
            return VisualizerViewCore.f3826t.m5753a(Integer.valueOf(i), null);
        }

        @Override // com.daaw.sg0
        /* renamed from: k */
        public C1652i2 mo2866k() {
            return VisualizerViewCore.f3829w.m6692a(null);
        }

        @Override // com.daaw.sg0
        /* renamed from: l */
        public int mo2865l() {
            return VisualizerViewCore.f3823H.m5753a(VisualizerViewCore.this.getContext(), 0).intValue();
        }
    }

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$b */
    /* loaded from: classes.dex */
    public class RunnableC0707b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ C3355vn f3838p;

        public RunnableC0707b(C3355vn c3355vn) {
            this.f3838p = c3355vn;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.f3838p);
        }
    }

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$c */
    /* loaded from: classes.dex */
    public class RunnableC0708c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ f61 f3840p;

        public RunnableC0708c(f61 f61Var) {
            this.f3840p = f61Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeElements(this.f3840p);
        }
    }

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$d */
    /* loaded from: classes.dex */
    public class RunnableC0709d implements Runnable {
        public RunnableC0709d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.m26843k();
        }
    }

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$e */
    /* loaded from: classes.dex */
    public class RunnableC0710e implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ String f3843p;

        /* renamed from: q */
        public final /* synthetic */ InterfaceC1153e0 f3844q;

        /* renamed from: r */
        public final /* synthetic */ VisualizerViewCore f3845r;

        public RunnableC0710e(String str, InterfaceC1153e0 interfaceC1153e0, VisualizerViewCore visualizerViewCore) {
            this.f3843p = str;
            this.f3844q = interfaceC1153e0;
            this.f3845r = visualizerViewCore;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.setThemeCustomizationData(C3355vn.m7015e(this.f3843p));
            InterfaceC1153e0 interfaceC1153e0 = this.f3844q;
            if (interfaceC1153e0 != null) {
                interfaceC1153e0.mo7884a(this.f3845r);
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.Visualizer.VisualizerViewCore$f */
    /* loaded from: classes.dex */
    public class RunnableC0711f implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ int f3847p;

        /* renamed from: q */
        public final /* synthetic */ int f3848q;

        public RunnableC0711f(int i, int i2) {
            this.f3847p = i;
            this.f3848q = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            VisualizerViewCore.this.m26838p(this.f3847p, this.f3848q);
        }
    }

    public VisualizerViewCore(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3833p = 2;
        this.f3835r = 0;
        this.f3836s = new C0706a();
        setEGLContextClientVersion(this.f3833p);
        setEGLConfigChooser(true);
        d41 d41Var = new d41(context, context.getResources(), this.f3836s);
        this.f3834q = d41Var;
        setRenderer(d41Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m26847g(C3355vn c3355vn, od0 od0Var, InterfaceC1153e0 interfaceC1153e0, VisualizerViewCore visualizerViewCore) {
        this.f3834q.m24654c(c3355vn, od0Var);
        if (interfaceC1153e0 != null) {
            interfaceC1153e0.mo7884a(visualizerViewCore);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(f61 f61Var) {
        this.f3834q.m24649h(f61Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThemeElements(C3355vn c3355vn) {
        this.f3834q.m24650g(c3355vn);
    }

    public g40 getFrameStats() {
        return this.f3834q.m24656a();
    }

    public int getFrameTimeMs() {
        return this.f3834q.m24655b();
    }

    /* renamed from: i */
    public void m26845i(C3355vn c3355vn, od0 od0Var) {
        this.f3834q.m24654c(c3355vn, od0Var);
    }

    /* renamed from: j */
    public void m26844j(final C3355vn c3355vn, final od0 od0Var, final InterfaceC1153e0<VisualizerViewCore> interfaceC1153e0) {
        queueEvent(new Runnable() { // from class: com.daaw.vv1
            @Override // java.lang.Runnable
            public final void run() {
                VisualizerViewCore.this.m26847g(c3355vn, od0Var, interfaceC1153e0, this);
            }
        });
    }

    /* renamed from: k */
    public final void m26843k() {
        this.f3834q.m24653d();
    }

    /* renamed from: l */
    public void m26842l() {
        queueEvent(new RunnableC0709d());
    }

    /* renamed from: m */
    public final void m26841m() {
        this.f3834q.m24652e();
    }

    /* renamed from: n */
    public void m26840n() {
        queueEvent(new Runnable() { // from class: com.daaw.uv1
            @Override // java.lang.Runnable
            public final void run() {
                VisualizerViewCore.this.m26841m();
            }
        });
    }

    /* renamed from: o */
    public void m26839o(C3355vn c3355vn, InterfaceC1153e0<VisualizerViewCore> interfaceC1153e0) {
        queueEvent(new RunnableC0710e(c3355vn.m7005o(), interfaceC1153e0, this));
    }

    /* renamed from: p */
    public final void m26838p(int i, int i2) {
        this.f3834q.m24648i(i, i2);
    }

    /* renamed from: q */
    public void m26837q(int i, int i2) {
        queueEvent(new RunnableC0711f(i, i2));
    }

    public void setThemeCustomizationData(C3355vn c3355vn) {
        gr1.m21333b();
        this.f3834q.m24651f(c3355vn);
    }

    public void setThemeElementsUiTh(f61 f61Var) {
        queueEvent(new RunnableC0708c(f61Var));
    }

    public void setThemeElementsUiTh(C3355vn c3355vn) {
        queueEvent(new RunnableC0707b(c3355vn));
    }
}
