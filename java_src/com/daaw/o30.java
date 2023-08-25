package com.daaw;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.MyView;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
/* loaded from: classes.dex */
public class o30 extends Fragment {
    public View p;
    public AspectRatioFrameLayout q;
    public VisualizerViewCore r;
    public SurfaceView s;
    public int t = 0;
    public int u = 0;
    public float v = 0.0f;
    public static qw1<VisualizerViewCore> w = new qw1<>();
    public static vw1<Boolean> x = new vw1<>();
    public static vw1<Integer> y = new vw1<>();
    public static vw1<Float> z = new vw1<>();
    public static vw1<Boolean> A = new vw1<>();
    public static qw1<al> B = new qw1<>();
    public static qw1<SurfaceHolder> C = new qw1<>();
    public static pw1 D = new pw1();
    public static vw1<Boolean> E = new vw1<>();
    public static pw1 F = new pw1();
    public static qw1<Boolean> G = new qw1<>();
    public static qw1<al> H = new qw1<>();

    /* loaded from: classes.dex */
    public class a implements View.OnLayoutChangeListener {

        /* renamed from: com.daaw.o30$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0081a implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ int q;

            public RunnableC0081a(int i, int i2) {
                this.p = i;
                this.q = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o30.this.o(this.p, this.q);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o30.this.p.post(new RunnableC0081a(i3 - i, i4 - i2));
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.F.a();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.F.a();
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.F.a();
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o30.this.u == 1) {
                o30.this.s.setVisibility(0);
                o30.C.a(o30.this.s.getHolder());
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o30.this.t == 1) {
                o30.this.r.setVisibility(0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {
        public final /* synthetic */ float p;

        public g(float f) {
            this.p = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            o30.this.v = this.p;
            o30 o30Var = o30.this;
            o30Var.o(o30Var.p.getWidth(), o30.this.p.getHeight());
        }
    }

    public static o30 i() {
        o30 o30Var = new o30();
        o30Var.setArguments(new Bundle());
        return o30Var;
    }

    public boolean g() {
        SurfaceView surfaceView = this.s;
        if (surfaceView == null || !(surfaceView.getVisibility() == 0 || this.u == 1)) {
            VisualizerViewCore visualizerViewCore = this.r;
            return visualizerViewCore != null && (visualizerViewCore.getVisibility() == 0 || this.t == 1);
        }
        return true;
    }

    public boolean h() {
        return this.p != null;
    }

    public void j(boolean z2) {
        m(g(), z2);
    }

    public void k(float f2) {
        if (h()) {
            this.v = f2;
            o(this.p.getWidth(), this.p.getHeight());
        }
    }

    public void l(float f2) {
        if (h()) {
            this.p.post(new g(f2));
        }
    }

    public void m(boolean z2, boolean z3) {
        if (!z2) {
            SurfaceView surfaceView = this.s;
            if (surfaceView != null) {
                this.u = 0;
                surfaceView.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore = this.r;
            if (visualizerViewCore != null) {
                this.t = 0;
                visualizerViewCore.setVisibility(8);
            }
        } else if (z3) {
            VisualizerViewCore visualizerViewCore2 = this.r;
            if (visualizerViewCore2 != null) {
                this.t = 0;
                visualizerViewCore2.setVisibility(8);
            }
            SurfaceView surfaceView2 = this.s;
            if (surfaceView2 != null) {
                this.u = 1;
                surfaceView2.postDelayed(new e(), 250L);
            }
        } else {
            SurfaceView surfaceView3 = this.s;
            if (surfaceView3 != null) {
                this.u = 0;
                surfaceView3.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore3 = this.r;
            if (visualizerViewCore3 != null) {
                this.t = 1;
                visualizerViewCore3.postDelayed(new f(), 250L);
            }
        }
    }

    public void n(int i) {
    }

    public void o(float f2, float f3) {
        float f4 = this.v;
        if (f4 != 0.0f) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.q;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setAspectRatio(f4);
            }
        } else if (f2 <= 0.0f || f3 <= 0.0f) {
        } else {
            float f5 = f2 / f3;
            AspectRatioFrameLayout aspectRatioFrameLayout2 = this.q;
            if (aspectRatioFrameLayout2 != null) {
                aspectRatioFrameLayout2.setAspectRatio(f5);
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_2, viewGroup, false);
        this.p = inflate;
        gr1.u(inflate.findViewById(R.id.viewStatusBarBg));
        this.p.addOnLayoutChangeListener(new a());
        ((MyView) this.p.findViewById(R.id.surfaceViewBackground)).setOnClickListener(new b());
        this.q = (AspectRatioFrameLayout) this.p.findViewById(R.id.videoFrame);
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.p.findViewById(R.id.surfaceViewVisualizer);
        this.r = visualizerViewCore;
        if (visualizerViewCore != null) {
            visualizerViewCore.setOnClickListener(new c());
        }
        SurfaceView surfaceView = (SurfaceView) this.p.findViewById(R.id.surfaceViewVideo);
        this.s = surfaceView;
        surfaceView.setOnClickListener(new d());
        w.a(this.r);
        SurfaceView surfaceView2 = this.s;
        if (surfaceView2 != null) {
            C.a(surfaceView2.getHolder());
        }
        n(y.a(0).intValue());
        k(z.a(Float.valueOf(1.0f)).floatValue());
        m(E.a(Boolean.TRUE).booleanValue(), x.a(Boolean.FALSE).booleanValue());
        return this.p;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        D.a();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
