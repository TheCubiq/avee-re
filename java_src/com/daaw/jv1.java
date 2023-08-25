package com.daaw;

import android.app.FragmentManager;
import android.content.Context;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.ho;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.uw1;
import com.daaw.ww1;
import com.daaw.yw1;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class jv1 extends kt {
    public WeakReference<VisualizerViewCore> b = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public class a implements ww1.a<ho, Boolean> {
        public a() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(ho hoVar) {
            if (hoVar == null || (!hoVar.i() && !hoVar.m(0))) {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class b implements e0<VisualizerViewCore> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ int b;

        public b(boolean z, int i) {
            this.a = z;
            this.b = i;
        }

        @Override // com.daaw.e0
        /* renamed from: b */
        public void a(VisualizerViewCore visualizerViewCore) {
            pv1.b0(visualizerViewCore, this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    public class c implements ww1.a<String, Boolean> {
        public c() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(String str) {
            return Boolean.valueOf(!"Composition".equals(str));
        }
    }

    /* loaded from: classes.dex */
    public class d implements qw1.a<VisualizerViewCore> {
        public d() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(VisualizerViewCore visualizerViewCore) {
            jv1.this.b = new WeakReference(visualizerViewCore);
        }
    }

    /* loaded from: classes.dex */
    public class e implements uw1.a<al, Integer, Integer, vn, String> {
        public e() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(al alVar, Integer num, Integer num2, vn vnVar, String str) {
            jv1.this.c(vnVar, str);
            jv1.this.d(vnVar, true, -1);
        }
    }

    /* loaded from: classes.dex */
    public class f implements sw1.a<Context, Integer, vn> {
        public f() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Context context, Integer num, vn vnVar) {
            un b;
            un l;
            ho k = ho.k();
            if (k == null) {
                return;
            }
            ho.i l2 = k.l(num.intValue());
            if (l2.a() == null && (b = l2.b()) != null && (l = b.l()) != null && (l instanceof rn)) {
                rn rnVar = (rn) l;
                rnVar.x0(b);
                jv1.this.d(vnVar, false, rnVar.u0());
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements sw1.a<Context, Integer, vn> {
        public g() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Context context, Integer num, vn vnVar) {
            ho k = ho.k();
            if (k != null) {
                k.z(num.intValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements sw1.a<ho, String, String> {
        public h() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(ho hoVar, String str, String str2) {
            FragmentManager fragmentManager;
            int i;
            if ("AppLogo".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_app_logo;
            } else if ("AudioProvider".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_audio_provider;
            } else if ("BlurEffect".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_blur_effect;
            } else if ("Composition".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_composition;
            } else if ("Image".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_image;
            } else if ("MirrorEffect".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_mirror_effect;
            } else if ("MotionBlurEffect".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_motion_blur_effect;
            } else if ("Particles".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_particles_element;
            } else if ("RgbSplitEffect".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_rgb_split_effect;
            } else if ("Bars".equals(str)) {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_segment_bars;
            } else if (!"Text".equals(str)) {
                return;
            } else {
                fragmentManager = hoVar.getFragmentManager();
                i = R.raw.element_text;
            }
            lj0.e(fragmentManager, true, i, 0, "");
        }
    }

    /* loaded from: classes.dex */
    public class i implements tw1.a<ho, vn, un, String> {
        public i() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(ho hoVar, vn vnVar, un unVar, String str) {
            if (vnVar == null || unVar == null) {
                return;
            }
            unVar.g(unVar.B(), unVar.D());
            Context e = dx0.e();
            if (e != null) {
                vy.a.a(e.getString(R.string.vis_customization_element_reset));
            }
            jv1.this.d(vnVar, false, -1);
        }
    }

    /* loaded from: classes.dex */
    public class j implements ww1.a<String, Integer> {
        public j() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(String str) {
            return Integer.valueOf("customization_general".equals(str) ? R.raw.customization_general : "customization_segment_renderers".equals(str) ? R.raw.customization_segment_renderers : 0);
        }
    }

    /* loaded from: classes.dex */
    public class k implements yw1.a<ho, String, String, lo1<String[], String>> {
        public k() {
        }

        @Override // com.daaw.yw1.a
        /* renamed from: b */
        public lo1<String[], String> a(ho hoVar, String str, String str2) {
            return new lo1<>(new String[]{"10"}, "10");
        }
    }

    public jv1() {
        ho.T.b(new c(), this.a);
        o30.w.b(new d(), this.a);
        ho.F.b(new e(), this.a);
        ho.R.b(new f(), this.a);
        ho.Q.b(new g(), this.a);
        ho.N.b(new h(), this.a);
        ho.S.b(new i(), this.a);
        lj0.u.b(new j(), this.a);
        ho.O.b(new k(), this.a);
        ho.P.b(new a(), this.a);
    }

    public void c(vn vnVar, String str) {
        un b2 = "Composition".equals(str) ? vnVar.b() : vnVar.c() > 0 ? vnVar.a(vnVar.c() - 1).b() : null;
        if (b2 != null) {
            b2.E(str);
        }
    }

    public final void d(vn vnVar, boolean z, int i2) {
        VisualizerViewCore visualizerViewCore = this.b.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.o(vnVar, new b(z, i2));
        }
    }
}
