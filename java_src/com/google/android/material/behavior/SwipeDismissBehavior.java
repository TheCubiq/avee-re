package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.C3654y;
import com.daaw.InterfaceC0785b0;
import com.daaw.at1;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0194c<V> {

    /* renamed from: a */
    public at1 f37163a;

    /* renamed from: b */
    public InterfaceC4015c f37164b;

    /* renamed from: c */
    public boolean f37165c;

    /* renamed from: e */
    public boolean f37167e;

    /* renamed from: d */
    public float f37166d = 0.0f;

    /* renamed from: f */
    public int f37168f = 2;

    /* renamed from: g */
    public float f37169g = 0.5f;

    /* renamed from: h */
    public float f37170h = 0.0f;

    /* renamed from: i */
    public float f37171i = 0.5f;

    /* renamed from: j */
    public final at1.AbstractC0673c f37172j = new C4013a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: classes2.dex */
    public class C4013a extends at1.AbstractC0673c {

        /* renamed from: a */
        public int f37173a;

        /* renamed from: b */
        public int f37174b = -1;

        public C4013a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.f37173a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.f37173a - r3.getWidth();
            r3 = r2.f37173a;
         */
        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo872a(View view, int i, int i2) {
            int width;
            int width2;
            boolean z = xs1.m4768E(view) == 1;
            int i3 = SwipeDismissBehavior.this.f37168f;
            if (i3 != 0) {
                if (i3 != 1) {
                    width = this.f37173a - view.getWidth();
                    width2 = view.getWidth() + this.f37173a;
                }
            }
            return SwipeDismissBehavior.m988G(width, i, width2);
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: b */
        public int mo871b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: d */
        public int mo981d(View view) {
            return view.getWidth();
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: i */
        public void mo980i(View view, int i) {
            this.f37174b = i;
            this.f37173a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: j */
        public void mo869j(int i) {
            InterfaceC4015c interfaceC4015c = SwipeDismissBehavior.this.f37164b;
            if (interfaceC4015c != null) {
                interfaceC4015c.m977b(i);
            }
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: k */
        public void mo868k(View view, int i, int i2, int i3, int i4) {
            float width = this.f37173a + (view.getWidth() * SwipeDismissBehavior.this.f37170h);
            float width2 = this.f37173a + (view.getWidth() * SwipeDismissBehavior.this.f37171i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m989F(0.0f, 1.0f - SwipeDismissBehavior.m986I(width, width2, f), 1.0f));
            }
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: l */
        public void mo867l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC4015c interfaceC4015c;
            this.f37174b = -1;
            int width = view.getWidth();
            if (m979n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f37173a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f37173a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f37163a.m27076M(i, view.getTop())) {
                xs1.m4718j0(view, new RunnableC4016d(view, z));
            } else if (!z || (interfaceC4015c = SwipeDismissBehavior.this.f37164b) == null) {
            } else {
                interfaceC4015c.m978a(view);
            }
        }

        @Override // com.daaw.at1.AbstractC0673c
        /* renamed from: m */
        public boolean mo866m(View view, int i) {
            int i2 = this.f37174b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo327E(view);
        }

        /* renamed from: n */
        public final boolean m979n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.f37173a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f37169g);
            }
            boolean z = xs1.m4768E(view) == 1;
            int i = SwipeDismissBehavior.this.f37168f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (f <= 0.0f) {
                    return false;
                }
                return true;
            } else if (i == 1) {
                if (z) {
                    if (f <= 0.0f) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: classes2.dex */
    public class C4014b implements InterfaceC0785b0 {
        public C4014b() {
        }

        @Override // com.daaw.InterfaceC0785b0
        /* renamed from: a */
        public boolean mo864a(View view, InterfaceC0785b0.AbstractC0786a abstractC0786a) {
            boolean z = false;
            if (SwipeDismissBehavior.this.mo327E(view)) {
                boolean z2 = xs1.m4768E(view) == 1;
                int i = SwipeDismissBehavior.this.f37168f;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                xs1.m4734b0(view, width);
                view.setAlpha(0.0f);
                InterfaceC4015c interfaceC4015c = SwipeDismissBehavior.this.f37164b;
                if (interfaceC4015c != null) {
                    interfaceC4015c.m978a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC4015c {
        /* renamed from: a */
        void m978a(View view);

        /* renamed from: b */
        void m977b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: classes2.dex */
    public class RunnableC4016d implements Runnable {

        /* renamed from: p */
        public final View f37177p;

        /* renamed from: q */
        public final boolean f37178q;

        public RunnableC4016d(View view, boolean z) {
            this.f37177p = view;
            this.f37178q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4015c interfaceC4015c;
            at1 at1Var = SwipeDismissBehavior.this.f37163a;
            if (at1Var != null && at1Var.m27060m(true)) {
                xs1.m4718j0(this.f37177p, this);
            } else if (!this.f37178q || (interfaceC4015c = SwipeDismissBehavior.this.f37164b) == null) {
            } else {
                interfaceC4015c.m978a(this.f37177p);
            }
        }
    }

    /* renamed from: F */
    public static float m989F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    public static int m988G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: I */
    public static float m986I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: D */
    public boolean mo102D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        at1 at1Var = this.f37163a;
        if (at1Var != null) {
            at1Var.m27084E(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo327E(View view) {
        return true;
    }

    /* renamed from: H */
    public final void m987H(ViewGroup viewGroup) {
        if (this.f37163a == null) {
            this.f37163a = this.f37167e ? at1.m27059n(viewGroup, this.f37166d, this.f37172j) : at1.m27058o(viewGroup, this.f37172j);
        }
    }

    /* renamed from: J */
    public void m985J(float f) {
        this.f37171i = m989F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m984K(float f) {
        this.f37170h = m989F(0.0f, f, 1.0f);
    }

    /* renamed from: L */
    public void m983L(int i) {
        this.f37168f = i;
    }

    /* renamed from: M */
    public final void m982M(View view) {
        xs1.m4714l0(view, 1048576);
        if (mo327E(view)) {
            xs1.m4710n0(view, C3654y.C3655a.f33189y, null, new C4014b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: k */
    public boolean mo326k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f37165c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.m29823B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f37165c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f37165c = false;
        }
        if (z) {
            m987H(coordinatorLayout);
            return this.f37163a.m27075N(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: l */
    public boolean mo126l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean mo126l = super.mo126l(coordinatorLayout, v, i);
        if (xs1.m4772C(v) == 0) {
            xs1.m4773B0(v, 1);
            m982M(v);
        }
        return mo126l;
    }
}
