package com.daaw;

import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class ol0 extends C1983kt {

    /* renamed from: b */
    public WeakReference<VisualizerViewCore> f21620b = new WeakReference<>(null);

    /* renamed from: c */
    public tx0 f21621c = null;

    /* renamed from: d */
    public volatile boolean f21622d = false;

    /* renamed from: e */
    public volatile boolean f21623e = false;

    /* renamed from: f */
    public boolean f21624f = false;

    /* renamed from: g */
    public boolean f21625g = false;

    /* renamed from: com.daaw.ol0$a */
    /* loaded from: classes.dex */
    public class C2448a implements qw1.InterfaceC2788a<VisualizerViewCore> {
        public C2448a() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(VisualizerViewCore visualizerViewCore) {
            ol0.this.f21620b = new WeakReference(visualizerViewCore);
        }
    }

    /* renamed from: com.daaw.ol0$b */
    /* loaded from: classes.dex */
    public class C2449b implements pw1.InterfaceC2649a {

        /* renamed from: a */
        public final /* synthetic */ az0 f21627a;

        public C2449b(az0 az0Var) {
            this.f21627a = az0Var;
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            if (dx0.m23837e() == null) {
                return;
            }
            ol0.this.f21624f = this.f21627a.m26593a();
        }
    }

    /* renamed from: com.daaw.ol0$c */
    /* loaded from: classes.dex */
    public class C2450c implements pw1.InterfaceC2649a {
        public C2450c() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            if ((nc0.f19989g.m6692a(Boolean.FALSE).booleanValue() && ol0.this.f21624f) || ol0.this.f21625g) {
                return;
            }
            if (ol0.this.f21622d && ol0.this.f21623e) {
                return;
            }
            long m26490d = C0812b5.m26490d();
            long m26491c = C0812b5.m26491c();
            boolean z = m26491c > 5000;
            boolean z2 = m26491c > 60000;
            if (z && m26490d > 10000 && m26490d < 20000 && !ol0.this.f21622d) {
                ol0.this.f21622d = true;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) ol0.this.f21620b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.m26837q(1, -1);
                }
            }
            if (!z2 || m26490d <= m26491c - 15000 || m26490d >= m26491c - 5000 || ol0.this.f21623e) {
                return;
            }
            ol0.this.f21623e = true;
            VisualizerViewCore visualizerViewCore2 = (VisualizerViewCore) ol0.this.f21620b.get();
            if (visualizerViewCore2 != null) {
                visualizerViewCore2.m26837q(1, -1);
            }
        }
    }

    /* renamed from: com.daaw.ol0$d */
    /* loaded from: classes.dex */
    public class C2451d implements tw1.InterfaceC3140a<tx0, vd0, tx0.C3143b, hx0> {
        public C2451d() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(tx0 tx0Var, vd0 vd0Var, tx0.C3143b c3143b, hx0 hx0Var) {
            if (tx0Var == null) {
                return;
            }
            tx0 tx0Var2 = ol0.this.f21621c;
            if (tx0Var2 == null || !tx0Var.equals(tx0Var2)) {
                ol0 ol0Var = ol0.this;
                ol0Var.f21621c = tx0Var;
                ol0Var.f21622d = false;
                ol0.this.f21623e = false;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) ol0.this.f21620b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.m26837q(2, -1);
                }
            }
        }
    }

    /* renamed from: com.daaw.ol0$e */
    /* loaded from: classes.dex */
    public class C2452e implements sw1.InterfaceC2987a<Boolean, Long, Boolean> {
        public C2452e() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Boolean bool, Long l, Boolean bool2) {
            if (!bool.booleanValue()) {
                ol0.this.f21625g = false;
                return;
            }
            ol0.this.f21625g = bool2.booleanValue();
            ol0 ol0Var = ol0.this;
            ol0Var.f21621c = null;
            ol0Var.f21622d = false;
            ol0.this.f21623e = false;
        }
    }

    public ol0(az0 az0Var) {
        o30.f20983w.m12017b(new C2448a(), this.f16736a);
        C3146ty.f28246b.m12989b(new C2449b(az0Var), this.f16736a);
        C3146ty.f28245a.m12989b(new C2450c(), this.f16736a);
        MediaPlaybackService.f3864h0.m8755b(new C2451d(), this.f16736a);
        qv1.f24437Q.m9794b(new C2452e(), this.f16736a);
    }
}
