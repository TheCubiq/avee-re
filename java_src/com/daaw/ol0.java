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
public class ol0 extends kt {
    public WeakReference<VisualizerViewCore> b = new WeakReference<>(null);
    public tx0 c = null;
    public volatile boolean d = false;
    public volatile boolean e = false;
    public boolean f = false;
    public boolean g = false;

    /* loaded from: classes.dex */
    public class a implements qw1.a<VisualizerViewCore> {
        public a() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(VisualizerViewCore visualizerViewCore) {
            ol0.this.b = new WeakReference(visualizerViewCore);
        }
    }

    /* loaded from: classes.dex */
    public class b implements pw1.a {
        public final /* synthetic */ az0 a;

        public b(az0 az0Var) {
            this.a = az0Var;
        }

        @Override // com.daaw.pw1.a
        public void a() {
            if (dx0.e() == null) {
                return;
            }
            ol0.this.f = this.a.a();
        }
    }

    /* loaded from: classes.dex */
    public class c implements pw1.a {
        public c() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            if ((nc0.g.a(Boolean.FALSE).booleanValue() && ol0.this.f) || ol0.this.g) {
                return;
            }
            if (ol0.this.d && ol0.this.e) {
                return;
            }
            long d = b5.d();
            long c = b5.c();
            boolean z = c > 5000;
            boolean z2 = c > 60000;
            if (z && d > 10000 && d < 20000 && !ol0.this.d) {
                ol0.this.d = true;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) ol0.this.b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.q(1, -1);
                }
            }
            if (!z2 || d <= c - 15000 || d >= c - 5000 || ol0.this.e) {
                return;
            }
            ol0.this.e = true;
            VisualizerViewCore visualizerViewCore2 = (VisualizerViewCore) ol0.this.b.get();
            if (visualizerViewCore2 != null) {
                visualizerViewCore2.q(1, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements tw1.a<tx0, vd0, tx0.b, hx0> {
        public d() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(tx0 tx0Var, vd0 vd0Var, tx0.b bVar, hx0 hx0Var) {
            if (tx0Var == null) {
                return;
            }
            tx0 tx0Var2 = ol0.this.c;
            if (tx0Var2 == null || !tx0Var.equals(tx0Var2)) {
                ol0 ol0Var = ol0.this;
                ol0Var.c = tx0Var;
                ol0Var.d = false;
                ol0.this.e = false;
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) ol0.this.b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.q(2, -1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements sw1.a<Boolean, Long, Boolean> {
        public e() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Boolean bool, Long l, Boolean bool2) {
            if (!bool.booleanValue()) {
                ol0.this.g = false;
                return;
            }
            ol0.this.g = bool2.booleanValue();
            ol0 ol0Var = ol0.this;
            ol0Var.c = null;
            ol0Var.d = false;
            ol0.this.e = false;
        }
    }

    public ol0(az0 az0Var) {
        o30.w.b(new a(), this.a);
        ty.b.b(new b(az0Var), this.a);
        ty.a.b(new c(), this.a);
        MediaPlaybackService.h0.b(new d(), this.a);
        qv1.Q.b(new e(), this.a);
    }
}
