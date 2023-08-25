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
import com.google.android.exoplayer2.p002ui.AspectRatioFrameLayout;
/* loaded from: classes.dex */
public class o30 extends Fragment {

    /* renamed from: p */
    public View f20987p;

    /* renamed from: q */
    public AspectRatioFrameLayout f20988q;

    /* renamed from: r */
    public VisualizerViewCore f20989r;

    /* renamed from: s */
    public SurfaceView f20990s;

    /* renamed from: t */
    public int f20991t = 0;

    /* renamed from: u */
    public int f20992u = 0;

    /* renamed from: v */
    public float f20993v = 0.0f;

    /* renamed from: w */
    public static qw1<VisualizerViewCore> f20983w = new qw1<>();

    /* renamed from: x */
    public static vw1<Boolean> f20984x = new vw1<>();

    /* renamed from: y */
    public static vw1<Integer> f20985y = new vw1<>();

    /* renamed from: z */
    public static vw1<Float> f20986z = new vw1<>();

    /* renamed from: A */
    public static vw1<Boolean> f20975A = new vw1<>();

    /* renamed from: B */
    public static qw1<C0645al> f20976B = new qw1<>();

    /* renamed from: C */
    public static qw1<SurfaceHolder> f20977C = new qw1<>();

    /* renamed from: D */
    public static pw1 f20978D = new pw1();

    /* renamed from: E */
    public static vw1<Boolean> f20979E = new vw1<>();

    /* renamed from: F */
    public static pw1 f20980F = new pw1();

    /* renamed from: G */
    public static qw1<Boolean> f20981G = new qw1<>();

    /* renamed from: H */
    public static qw1<C0645al> f20982H = new qw1<>();

    /* renamed from: com.daaw.o30$a */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC2397a implements View.OnLayoutChangeListener {

        /* renamed from: com.daaw.o30$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2398a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f20995p;

            /* renamed from: q */
            public final /* synthetic */ int f20996q;

            public RunnableC2398a(int i, int i2) {
                this.f20995p = i;
                this.f20996q = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o30.this.m14584o(this.f20995p, this.f20996q);
            }
        }

        public View$OnLayoutChangeListenerC2397a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            o30.this.f20987p.post(new RunnableC2398a(i3 - i, i4 - i2));
        }
    }

    /* renamed from: com.daaw.o30$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2399b implements View.OnClickListener {
        public View$OnClickListenerC2399b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.f20980F.m12990a();
        }
    }

    /* renamed from: com.daaw.o30$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2400c implements View.OnClickListener {
        public View$OnClickListenerC2400c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.f20980F.m12990a();
        }
    }

    /* renamed from: com.daaw.o30$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2401d implements View.OnClickListener {
        public View$OnClickListenerC2401d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o30.f20980F.m12990a();
        }
    }

    /* renamed from: com.daaw.o30$e */
    /* loaded from: classes.dex */
    public class RunnableC2402e implements Runnable {
        public RunnableC2402e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o30.this.f20992u == 1) {
                o30.this.f20990s.setVisibility(0);
                o30.f20977C.m12018a(o30.this.f20990s.getHolder());
            }
        }
    }

    /* renamed from: com.daaw.o30$f */
    /* loaded from: classes.dex */
    public class RunnableC2403f implements Runnable {
        public RunnableC2403f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o30.this.f20991t == 1) {
                o30.this.f20989r.setVisibility(0);
            }
        }
    }

    /* renamed from: com.daaw.o30$g */
    /* loaded from: classes.dex */
    public class RunnableC2404g implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ float f21003p;

        public RunnableC2404g(float f) {
            this.f21003p = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            o30.this.f20993v = this.f21003p;
            o30 o30Var = o30.this;
            o30Var.m14584o(o30Var.f20987p.getWidth(), o30.this.f20987p.getHeight());
        }
    }

    /* renamed from: i */
    public static o30 m14590i() {
        o30 o30Var = new o30();
        o30Var.setArguments(new Bundle());
        return o30Var;
    }

    /* renamed from: g */
    public boolean m14592g() {
        SurfaceView surfaceView = this.f20990s;
        if (surfaceView == null || !(surfaceView.getVisibility() == 0 || this.f20992u == 1)) {
            VisualizerViewCore visualizerViewCore = this.f20989r;
            return visualizerViewCore != null && (visualizerViewCore.getVisibility() == 0 || this.f20991t == 1);
        }
        return true;
    }

    /* renamed from: h */
    public boolean m14591h() {
        return this.f20987p != null;
    }

    /* renamed from: j */
    public void m14589j(boolean z) {
        m14586m(m14592g(), z);
    }

    /* renamed from: k */
    public void m14588k(float f) {
        if (m14591h()) {
            this.f20993v = f;
            m14584o(this.f20987p.getWidth(), this.f20987p.getHeight());
        }
    }

    /* renamed from: l */
    public void m14587l(float f) {
        if (m14591h()) {
            this.f20987p.post(new RunnableC2404g(f));
        }
    }

    /* renamed from: m */
    public void m14586m(boolean z, boolean z2) {
        if (!z) {
            SurfaceView surfaceView = this.f20990s;
            if (surfaceView != null) {
                this.f20992u = 0;
                surfaceView.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore = this.f20989r;
            if (visualizerViewCore != null) {
                this.f20991t = 0;
                visualizerViewCore.setVisibility(8);
            }
        } else if (z2) {
            VisualizerViewCore visualizerViewCore2 = this.f20989r;
            if (visualizerViewCore2 != null) {
                this.f20991t = 0;
                visualizerViewCore2.setVisibility(8);
            }
            SurfaceView surfaceView2 = this.f20990s;
            if (surfaceView2 != null) {
                this.f20992u = 1;
                surfaceView2.postDelayed(new RunnableC2402e(), 250L);
            }
        } else {
            SurfaceView surfaceView3 = this.f20990s;
            if (surfaceView3 != null) {
                this.f20992u = 0;
                surfaceView3.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore3 = this.f20989r;
            if (visualizerViewCore3 != null) {
                this.f20991t = 1;
                visualizerViewCore3.postDelayed(new RunnableC2403f(), 250L);
            }
        }
    }

    /* renamed from: n */
    public void m14585n(int i) {
    }

    /* renamed from: o */
    public void m14584o(float f, float f2) {
        float f3 = this.f20993v;
        if (f3 != 0.0f) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.f20988q;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setAspectRatio(f3);
            }
        } else if (f <= 0.0f || f2 <= 0.0f) {
        } else {
            float f4 = f / f2;
            AspectRatioFrameLayout aspectRatioFrameLayout2 = this.f20988q;
            if (aspectRatioFrameLayout2 != null) {
                aspectRatioFrameLayout2.setAspectRatio(f4);
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_2, viewGroup, false);
        this.f20987p = inflate;
        gr1.m21314u(inflate.findViewById(R.id.viewStatusBarBg));
        this.f20987p.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC2397a());
        ((MyView) this.f20987p.findViewById(R.id.surfaceViewBackground)).setOnClickListener(new View$OnClickListenerC2399b());
        this.f20988q = (AspectRatioFrameLayout) this.f20987p.findViewById(R.id.videoFrame);
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.f20987p.findViewById(R.id.surfaceViewVisualizer);
        this.f20989r = visualizerViewCore;
        if (visualizerViewCore != null) {
            visualizerViewCore.setOnClickListener(new View$OnClickListenerC2400c());
        }
        SurfaceView surfaceView = (SurfaceView) this.f20987p.findViewById(R.id.surfaceViewVideo);
        this.f20990s = surfaceView;
        surfaceView.setOnClickListener(new View$OnClickListenerC2401d());
        f20983w.m12018a(this.f20989r);
        SurfaceView surfaceView2 = this.f20990s;
        if (surfaceView2 != null) {
            f20977C.m12018a(surfaceView2.getHolder());
        }
        m14585n(f20985y.m6692a(0).intValue());
        m14588k(f20986z.m6692a(Float.valueOf(1.0f)).floatValue());
        m14586m(f20979E.m6692a(Boolean.TRUE).booleanValue(), f20984x.m6692a(Boolean.FALSE).booleanValue());
        return this.f20987p;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        f20978D.m12990a();
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
