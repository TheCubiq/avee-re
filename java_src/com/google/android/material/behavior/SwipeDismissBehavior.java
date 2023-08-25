package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.at1;
import com.daaw.b0;
import com.daaw.xs1;
import com.daaw.y;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public at1 a;
    public c b;
    public boolean c;
    public boolean e;
    public float d = 0.0f;
    public int f = 2;
    public float g = 0.5f;
    public float h = 0.0f;
    public float i = 0.5f;
    public final at1.c j = new a();

    /* loaded from: classes2.dex */
    public class a extends at1.c {
        public int a;
        public int b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.a - r3.getWidth();
            r3 = r2.a;
         */
        @Override // com.daaw.at1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = com.daaw.xs1.E(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.a
                goto L37
            L1c:
                int r5 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.G(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // com.daaw.at1.c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // com.daaw.at1.c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // com.daaw.at1.c
        public void i(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // com.daaw.at1.c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // com.daaw.at1.c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = this.a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f), 1.0f));
            }
        }

        @Override // com.daaw.at1.c
        public void l(View view, float f, float f2) {
            int i;
            boolean z;
            c cVar;
            this.b = -1;
            int width = view.getWidth();
            if (n(view, f)) {
                int left = view.getLeft();
                int i2 = this.a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.a;
                z = false;
            }
            if (SwipeDismissBehavior.this.a.M(i, view.getTop())) {
                xs1.j0(view, new d(view, z));
            } else if (!z || (cVar = SwipeDismissBehavior.this.b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // com.daaw.at1.c
        public boolean m(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f) {
            if (f == 0.0f) {
                return Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = xs1.E(view) == 1;
            int i = SwipeDismissBehavior.this.f;
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

    /* loaded from: classes2.dex */
    public class b implements b0 {
        public b() {
        }

        @Override // com.daaw.b0
        public boolean a(View view, b0.a aVar) {
            boolean z = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z2 = xs1.E(view) == 1;
                int i = SwipeDismissBehavior.this.f;
                if ((i == 0 && z2) || (i == 1 && !z2)) {
                    z = true;
                }
                int width = view.getWidth();
                if (z) {
                    width = -width;
                }
                xs1.b0(view, width);
                view.setAlpha(0.0f);
                c cVar = SwipeDismissBehavior.this.b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(View view);

        void b(int i);
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {
        public final View p;
        public final boolean q;

        public d(View view, boolean z) {
            this.p = view;
            this.q = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            at1 at1Var = SwipeDismissBehavior.this.a;
            if (at1Var != null && at1Var.m(true)) {
                xs1.j0(this.p, this);
            } else if (!this.q || (cVar = SwipeDismissBehavior.this.b) == null) {
            } else {
                cVar.a(this.p);
            }
        }
    }

    public static float F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public static float I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        at1 at1Var = this.a;
        if (at1Var != null) {
            at1Var.E(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        if (this.a == null) {
            this.a = this.e ? at1.n(viewGroup, this.d, this.j) : at1.o(viewGroup, this.j);
        }
    }

    public void J(float f) {
        this.i = F(0.0f, f, 1.0f);
    }

    public void K(float f) {
        this.h = F(0.0f, f, 1.0f);
    }

    public void L(int i) {
        this.f = i;
    }

    public final void M(View view) {
        xs1.l0(view, 1048576);
        if (E(view)) {
            xs1.n0(view, y.a.y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (z) {
            H(coordinatorLayout);
            return this.a.N(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.l(coordinatorLayout, v, i);
        if (xs1.C(v) == 0) {
            xs1.B0(v, 1);
            M(v);
        }
        return l;
    }
}
