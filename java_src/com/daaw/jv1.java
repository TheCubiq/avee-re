package com.daaw;

import android.app.FragmentManager;
import android.content.Context;
import com.daaw.DialogFragmentC1593ho;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.uw1;
import com.daaw.ww1;
import com.daaw.yw1;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class jv1 extends C1983kt {

    /* renamed from: b */
    public WeakReference<VisualizerViewCore> f15441b = new WeakReference<>(null);

    /* renamed from: com.daaw.jv1$a */
    /* loaded from: classes.dex */
    public class C1872a implements ww1.InterfaceC3477a<DialogFragmentC1593ho, Boolean> {
        public C1872a() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(DialogFragmentC1593ho dialogFragmentC1593ho) {
            if (dialogFragmentC1593ho == null || (!dialogFragmentC1593ho.m20597i() && !dialogFragmentC1593ho.m20593m(0))) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.daaw.jv1$b */
    /* loaded from: classes.dex */
    public class C1873b implements InterfaceC1153e0<VisualizerViewCore> {

        /* renamed from: a */
        public final /* synthetic */ boolean f15443a;

        /* renamed from: b */
        public final /* synthetic */ int f15444b;

        public C1873b(boolean z, int i) {
            this.f15443a = z;
            this.f15444b = i;
        }

        @Override // com.daaw.InterfaceC1153e0
        /* renamed from: b */
        public void mo7884a(VisualizerViewCore visualizerViewCore) {
            pv1.m13087b0(visualizerViewCore, this.f15443a, this.f15444b);
        }
    }

    /* renamed from: com.daaw.jv1$c */
    /* loaded from: classes.dex */
    public class C1874c implements ww1.InterfaceC3477a<String, Boolean> {
        public C1874c() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Boolean mo5751b(String str) {
            return Boolean.valueOf(!"Composition".equals(str));
        }
    }

    /* renamed from: com.daaw.jv1$d */
    /* loaded from: classes.dex */
    public class C1875d implements qw1.InterfaceC2788a<VisualizerViewCore> {
        public C1875d() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(VisualizerViewCore visualizerViewCore) {
            jv1.this.f15441b = new WeakReference(visualizerViewCore);
        }
    }

    /* renamed from: com.daaw.jv1$e */
    /* loaded from: classes.dex */
    public class C1876e implements uw1.InterfaceC3263a<C0645al, Integer, Integer, C3355vn, String> {
        public C1876e() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(C0645al c0645al, Integer num, Integer num2, C3355vn c3355vn, String str) {
            jv1.this.m18232c(c3355vn, str);
            jv1.this.m18231d(c3355vn, true, -1);
        }
    }

    /* renamed from: com.daaw.jv1$f */
    /* loaded from: classes.dex */
    public class C1877f implements sw1.InterfaceC2987a<Context, Integer, C3355vn> {
        public C1877f() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Context context, Integer num, C3355vn c3355vn) {
            C3239un m20572b;
            C3239un m7959l;
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k == null) {
                return;
            }
            DialogFragmentC1593ho.C1602i m20594l = m20595k.m20594l(num.intValue());
            if (m20594l.m20573a() == null && (m20572b = m20594l.m20572b()) != null && (m7959l = m20572b.m7959l()) != null && (m7959l instanceof C2872rn)) {
                C2872rn c2872rn = (C2872rn) m7959l;
                c2872rn.m11163x0(m20572b);
                jv1.this.m18231d(c3355vn, false, c2872rn.m11166u0());
            }
        }
    }

    /* renamed from: com.daaw.jv1$g */
    /* loaded from: classes.dex */
    public class C1878g implements sw1.InterfaceC2987a<Context, Integer, C3355vn> {
        public C1878g() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Context context, Integer num, C3355vn c3355vn) {
            DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
            if (m20595k != null) {
                m20595k.m20580z(num.intValue());
            }
        }
    }

    /* renamed from: com.daaw.jv1$h */
    /* loaded from: classes.dex */
    public class C1879h implements sw1.InterfaceC2987a<DialogFragmentC1593ho, String, String> {
        public C1879h() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(DialogFragmentC1593ho dialogFragmentC1593ho, String str, String str2) {
            FragmentManager fragmentManager;
            int i;
            if ("AppLogo".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_app_logo;
            } else if ("AudioProvider".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_audio_provider;
            } else if ("BlurEffect".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_blur_effect;
            } else if ("Composition".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_composition;
            } else if ("Image".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_image;
            } else if ("MirrorEffect".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_mirror_effect;
            } else if ("MotionBlurEffect".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_motion_blur_effect;
            } else if ("Particles".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_particles_element;
            } else if ("RgbSplitEffect".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_rgb_split_effect;
            } else if ("Bars".equals(str)) {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_segment_bars;
            } else if (!"Text".equals(str)) {
                return;
            } else {
                fragmentManager = dialogFragmentC1593ho.getFragmentManager();
                i = R.raw.element_text;
            }
            lj0.m16915e(fragmentManager, true, i, 0, "");
        }
    }

    /* renamed from: com.daaw.jv1$i */
    /* loaded from: classes.dex */
    public class C1880i implements tw1.InterfaceC3140a<DialogFragmentC1593ho, C3355vn, C3239un, String> {
        public C1880i() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(DialogFragmentC1593ho dialogFragmentC1593ho, C3355vn c3355vn, C3239un c3239un, String str) {
            if (c3355vn == null || c3239un == null) {
                return;
            }
            c3239un.m7969g(c3239un.m8003B(), c3239un.m8001D());
            Context m23837e = dx0.m23837e();
            if (m23837e != null) {
                C3385vy.f30703a.m12018a(m23837e.getString(R.string.vis_customization_element_reset));
            }
            jv1.this.m18231d(c3355vn, false, -1);
        }
    }

    /* renamed from: com.daaw.jv1$j */
    /* loaded from: classes.dex */
    public class C1881j implements ww1.InterfaceC3477a<String, Integer> {
        public C1881j() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(String str) {
            return Integer.valueOf("customization_general".equals(str) ? R.raw.customization_general : "customization_segment_renderers".equals(str) ? R.raw.customization_segment_renderers : 0);
        }
    }

    /* renamed from: com.daaw.jv1$k */
    /* loaded from: classes.dex */
    public class C1882k implements yw1.InterfaceC3757a<DialogFragmentC1593ho, String, String, lo1<String[], String>> {
        public C1882k() {
        }

        @Override // com.daaw.yw1.InterfaceC3757a
        /* renamed from: b */
        public lo1<String[], String> mo3153a(DialogFragmentC1593ho dialogFragmentC1593ho, String str, String str2) {
            return new lo1<>(new String[]{"10"}, "10");
        }
    }

    public jv1() {
        DialogFragmentC1593ho.f12712T.m5752b(new C1874c(), this.f16736a);
        o30.f20983w.m12017b(new C1875d(), this.f16736a);
        DialogFragmentC1593ho.f12698F.m7666b(new C1876e(), this.f16736a);
        DialogFragmentC1593ho.f12710R.m9794b(new C1877f(), this.f16736a);
        DialogFragmentC1593ho.f12709Q.m9794b(new C1878g(), this.f16736a);
        DialogFragmentC1593ho.f12706N.m9794b(new C1879h(), this.f16736a);
        DialogFragmentC1593ho.f12711S.m8755b(new C1880i(), this.f16736a);
        lj0.f17448u.m5752b(new C1881j(), this.f16736a);
        DialogFragmentC1593ho.f12707O.m3154b(new C1882k(), this.f16736a);
        DialogFragmentC1593ho.f12708P.m5752b(new C1872a(), this.f16736a);
    }

    /* renamed from: c */
    public void m18232c(C3355vn c3355vn, String str) {
        C3239un mo7018b = "Composition".equals(str) ? c3355vn.mo7018b() : c3355vn.mo7017c() > 0 ? c3355vn.mo7019a(c3355vn.mo7017c() - 1).mo7018b() : null;
        if (mo7018b != null) {
            mo7018b.m8000E(str);
        }
    }

    /* renamed from: d */
    public final void m18231d(C3355vn c3355vn, boolean z, int i) {
        VisualizerViewCore visualizerViewCore = this.f15441b.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.m26839o(c3355vn, new C1873b(z, i));
        }
    }
}
