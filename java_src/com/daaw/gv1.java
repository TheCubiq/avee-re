package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.in1;
/* loaded from: classes.dex */
public abstract class gv1 extends in1 {
    public static final String[] Z = {"android:visibility:visibility", "android:visibility:parent"};
    public int Y = 3;

    /* loaded from: classes.dex */
    public class a extends jn1 {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.a = viewGroup;
            this.b = view;
            this.c = view2;
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            this.c.setTag(v11.save_overlay_view, null);
            et1.a(this.a).d(this.b);
            in1Var.T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void b(in1 in1Var) {
            et1.a(this.a).d(this.b);
        }

        @Override // com.daaw.jn1, com.daaw.in1.f
        public void e(in1 in1Var) {
            if (this.b.getParent() == null) {
                et1.a(this.a).c(this.b);
            } else {
                gv1.this.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements in1.f {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public b(View view, int i, boolean z) {
            this.a = view;
            this.b = i;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            g(true);
        }

        @Override // com.daaw.in1.f
        public void a(in1 in1Var) {
            f();
            in1Var.T(this);
        }

        @Override // com.daaw.in1.f
        public void b(in1 in1Var) {
            g(false);
        }

        @Override // com.daaw.in1.f
        public void c(in1 in1Var) {
        }

        @Override // com.daaw.in1.f
        public void d(in1 in1Var) {
        }

        @Override // com.daaw.in1.f
        public void e(in1 in1Var) {
            g(true);
        }

        public final void f() {
            if (!this.f) {
                gu1.h(this.a, this.b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.d || this.e == z || (viewGroup = this.c) == null) {
                return;
            }
            this.e = z;
            et1.c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f) {
                return;
            }
            gu1.h(this.a, this.b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f) {
                return;
            }
            gu1.h(this.a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    @Override // com.daaw.in1
    public String[] H() {
        return Z;
    }

    @Override // com.daaw.in1
    public boolean J(on1 on1Var, on1 on1Var2) {
        if (on1Var == null && on1Var2 == null) {
            return false;
        }
        if (on1Var == null || on1Var2 == null || on1Var2.a.containsKey("android:visibility:visibility") == on1Var.a.containsKey("android:visibility:visibility")) {
            c h0 = h0(on1Var, on1Var2);
            if (h0.a) {
                return h0.c == 0 || h0.d == 0;
            }
            return false;
        }
        return false;
    }

    public final void g0(on1 on1Var) {
        on1Var.a.put("android:visibility:visibility", Integer.valueOf(on1Var.b.getVisibility()));
        on1Var.a.put("android:visibility:parent", on1Var.b.getParent());
        int[] iArr = new int[2];
        on1Var.b.getLocationOnScreen(iArr);
        on1Var.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r0.c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.daaw.gv1.c h0(com.daaw.on1 r8, com.daaw.on1 r9) {
        /*
            r7 = this;
            com.daaw.gv1$c r0 = new com.daaw.gv1$c
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.d
            if (r8 != 0) goto L8d
        L88:
            r0.b = r2
        L8a:
            r0.a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.c
            if (r8 != 0) goto L96
        L93:
            r0.b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gv1.h0(com.daaw.on1, com.daaw.on1):com.daaw.gv1$c");
    }

    @Override // com.daaw.in1
    public void i(on1 on1Var) {
        g0(on1Var);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2);

    public Animator j0(ViewGroup viewGroup, on1 on1Var, int i, on1 on1Var2, int i2) {
        if ((this.Y & 1) != 1 || on1Var2 == null) {
            return null;
        }
        if (on1Var == null) {
            View view = (View) on1Var2.b.getParent();
            if (h0(x(view, false), I(view, false)).a) {
                return null;
            }
        }
        return i0(viewGroup, on1Var2.b, on1Var, on1Var2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.L != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator l0(android.view.ViewGroup r18, com.daaw.on1 r19, int r20, com.daaw.on1 r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gv1.l0(android.view.ViewGroup, com.daaw.on1, int, com.daaw.on1, int):android.animation.Animator");
    }

    @Override // com.daaw.in1
    public void m(on1 on1Var) {
        g0(on1Var);
    }

    public void m0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.Y = i;
    }

    @Override // com.daaw.in1
    public Animator r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        c h0 = h0(on1Var, on1Var2);
        if (h0.a) {
            if (h0.e == null && h0.f == null) {
                return null;
            }
            return h0.b ? j0(viewGroup, on1Var, h0.c, on1Var2, h0.d) : l0(viewGroup, on1Var, h0.c, on1Var2, h0.d);
        }
        return null;
    }
}
