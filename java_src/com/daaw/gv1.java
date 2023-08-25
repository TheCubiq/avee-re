package com.daaw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.in1;
/* loaded from: classes.dex */
public abstract class gv1 extends in1 {

    /* renamed from: Z */
    public static final String[] f11746Z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Y */
    public int f11747Y = 3;

    /* renamed from: com.daaw.gv1$a */
    /* loaded from: classes.dex */
    public class C1474a extends jn1 {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f11748a;

        /* renamed from: b */
        public final /* synthetic */ View f11749b;

        /* renamed from: c */
        public final /* synthetic */ View f11750c;

        public C1474a(ViewGroup viewGroup, View view, View view2) {
            this.f11748a = viewGroup;
            this.f11749b = view;
            this.f11750c = view2;
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            this.f11750c.setTag(v11.save_overlay_view, null);
            et1.m23201a(this.f11748a).mo23952d(this.f11749b);
            in1Var.mo15921T(this);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: b */
        public void mo9243b(in1 in1Var) {
            et1.m23201a(this.f11748a).mo23952d(this.f11749b);
        }

        @Override // com.daaw.jn1, com.daaw.in1.InterfaceC1729f
        /* renamed from: e */
        public void mo9241e(in1 in1Var) {
            if (this.f11749b.getParent() == null) {
                et1.m23201a(this.f11748a).mo23953c(this.f11749b);
            } else {
                gv1.this.m19603f();
            }
        }
    }

    /* renamed from: com.daaw.gv1$b */
    /* loaded from: classes.dex */
    public static class C1475b extends AnimatorListenerAdapter implements in1.InterfaceC1729f {

        /* renamed from: a */
        public final View f11752a;

        /* renamed from: b */
        public final int f11753b;

        /* renamed from: c */
        public final ViewGroup f11754c;

        /* renamed from: d */
        public final boolean f11755d;

        /* renamed from: e */
        public boolean f11756e;

        /* renamed from: f */
        public boolean f11757f = false;

        public C1475b(View view, int i, boolean z) {
            this.f11752a = view;
            this.f11753b = i;
            this.f11754c = (ViewGroup) view.getParent();
            this.f11755d = z;
            m21201g(true);
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: a */
        public void mo9244a(in1 in1Var) {
            m21202f();
            in1Var.mo15921T(this);
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: b */
        public void mo9243b(in1 in1Var) {
            m21201g(false);
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: c */
        public void mo9242c(in1 in1Var) {
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: d */
        public void mo15892d(in1 in1Var) {
        }

        @Override // com.daaw.in1.InterfaceC1729f
        /* renamed from: e */
        public void mo9241e(in1 in1Var) {
            m21201g(true);
        }

        /* renamed from: f */
        public final void m21202f() {
            if (!this.f11757f) {
                gu1.m21222h(this.f11752a, this.f11753b);
                ViewGroup viewGroup = this.f11754c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m21201g(false);
        }

        /* renamed from: g */
        public final void m21201g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f11755d || this.f11756e == z || (viewGroup = this.f11754c) == null) {
                return;
            }
            this.f11756e = z;
            et1.m23199c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11757f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m21202f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f11757f) {
                return;
            }
            gu1.m21222h(this.f11752a, this.f11753b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f11757f) {
                return;
            }
            gu1.m21222h(this.f11752a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.daaw.gv1$c */
    /* loaded from: classes.dex */
    public static class C1476c {

        /* renamed from: a */
        public boolean f11758a;

        /* renamed from: b */
        public boolean f11759b;

        /* renamed from: c */
        public int f11760c;

        /* renamed from: d */
        public int f11761d;

        /* renamed from: e */
        public ViewGroup f11762e;

        /* renamed from: f */
        public ViewGroup f11763f;
    }

    @Override // com.daaw.in1
    /* renamed from: H */
    public String[] mo9262H() {
        return f11746Z;
    }

    @Override // com.daaw.in1
    /* renamed from: J */
    public boolean mo19617J(on1 on1Var, on1 on1Var2) {
        if (on1Var == null && on1Var2 == null) {
            return false;
        }
        if (on1Var == null || on1Var2 == null || on1Var2.f21675a.containsKey("android:visibility:visibility") == on1Var.f21675a.containsKey("android:visibility:visibility")) {
            C1476c m21206h0 = m21206h0(on1Var, on1Var2);
            if (m21206h0.f11758a) {
                return m21206h0.f11760c == 0 || m21206h0.f11761d == 0;
            }
            return false;
        }
        return false;
    }

    /* renamed from: g0 */
    public final void m21207g0(on1 on1Var) {
        on1Var.f21675a.put("android:visibility:visibility", Integer.valueOf(on1Var.f21676b.getVisibility()));
        on1Var.f21675a.put("android:visibility:parent", on1Var.f21676b.getParent());
        int[] iArr = new int[2];
        on1Var.f21676b.getLocationOnScreen(iArr);
        on1Var.f21675a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.f11762e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r0.f11760c == 0) goto L25;
     */
    /* renamed from: h0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1476c m21206h0(on1 on1Var, on1 on1Var2) {
        C1476c c1476c = new C1476c();
        c1476c.f11758a = false;
        c1476c.f11759b = false;
        if (on1Var == null || !on1Var.f21675a.containsKey("android:visibility:visibility")) {
            c1476c.f11760c = -1;
            c1476c.f11762e = null;
        } else {
            c1476c.f11760c = ((Integer) on1Var.f21675a.get("android:visibility:visibility")).intValue();
            c1476c.f11762e = (ViewGroup) on1Var.f21675a.get("android:visibility:parent");
        }
        if (on1Var2 == null || !on1Var2.f21675a.containsKey("android:visibility:visibility")) {
            c1476c.f11761d = -1;
            c1476c.f11763f = null;
        } else {
            c1476c.f11761d = ((Integer) on1Var2.f21675a.get("android:visibility:visibility")).intValue();
            c1476c.f11763f = (ViewGroup) on1Var2.f21675a.get("android:visibility:parent");
        }
        if (on1Var == null || on1Var2 == null) {
            if (on1Var != null || c1476c.f11761d != 0) {
                if (on1Var2 == null) {
                }
                return c1476c;
            }
            c1476c.f11759b = true;
        } else {
            int i = c1476c.f11760c;
            int i2 = c1476c.f11761d;
            if (i == i2 && c1476c.f11762e == c1476c.f11763f) {
                return c1476c;
            }
            if (i != i2) {
                if (i != 0) {
                }
                c1476c.f11759b = false;
            } else {
                if (c1476c.f11763f != null) {
                }
                c1476c.f11759b = false;
            }
        }
        c1476c.f11758a = true;
        return c1476c;
    }

    @Override // com.daaw.in1
    /* renamed from: i */
    public void mo9259i(on1 on1Var) {
        m21207g0(on1Var);
    }

    /* renamed from: i0 */
    public abstract Animator mo21123i0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2);

    /* renamed from: j0 */
    public Animator m21205j0(ViewGroup viewGroup, on1 on1Var, int i, on1 on1Var2, int i2) {
        if ((this.f11747Y & 1) != 1 || on1Var2 == null) {
            return null;
        }
        if (on1Var == null) {
            View view = (View) on1Var2.f21676b.getParent();
            if (m21206h0(m19595x(view, false), m19618I(view, false)).f11758a) {
                return null;
            }
        }
        return mo21123i0(viewGroup, on1Var2.f21676b, on1Var, on1Var2);
    }

    /* renamed from: k0 */
    public abstract Animator mo21122k0(ViewGroup viewGroup, View view, on1 on1Var, on1 on1Var2);

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.f13819L != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* renamed from: l0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator m21204l0(ViewGroup viewGroup, on1 on1Var, int i, on1 on1Var2, int i2) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.f11747Y & 2) == 2 && on1Var != null) {
            View view3 = on1Var.f21676b;
            View view4 = on1Var2 != null ? on1Var2.f21676b : null;
            int i3 = v11.save_overlay_view;
            View view5 = (View) view3.getTag(i3);
            if (view5 != null) {
                view2 = null;
                z2 = true;
            } else if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z = false;
                    if (z) {
                        if (view3.getParent() != null) {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (m21206h0(m19618I(view6, true), m19595x(view6, true)).f11758a) {
                                    int id = view6.getId();
                                    if (view6.getParent() == null) {
                                        if (id != -1) {
                                            if (viewGroup.findViewById(id) != null) {
                                            }
                                        }
                                    }
                                } else {
                                    view4 = nn1.m14957a(viewGroup, view3, view6);
                                }
                            }
                        }
                        view2 = view;
                        z2 = false;
                        view5 = view3;
                    }
                    z2 = false;
                    View view7 = view;
                    view5 = view4;
                    view2 = view7;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                z2 = false;
                View view72 = view;
                view5 = view4;
                view2 = view72;
            } else {
                if (i2 == 4 || view3 == view4) {
                    view = view4;
                    z = false;
                    view4 = null;
                    if (z) {
                    }
                    z2 = false;
                    View view722 = view;
                    view5 = view4;
                    view2 = view722;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                z2 = false;
                View view7222 = view;
                view5 = view4;
                view2 = view7222;
            }
            if (view5 == null) {
                if (view2 != null) {
                    int visibility = view2.getVisibility();
                    gu1.m21222h(view2, 0);
                    Animator mo21122k0 = mo21122k0(viewGroup, view2, on1Var, on1Var2);
                    if (mo21122k0 != null) {
                        C1475b c1475b = new C1475b(view2, i2, true);
                        mo21122k0.addListener(c1475b);
                        C1781j3.m19161a(mo21122k0, c1475b);
                        mo15915a(c1475b);
                    } else {
                        gu1.m21222h(view2, visibility);
                    }
                    return mo21122k0;
                }
                return null;
            }
            if (!z2) {
                int[] iArr = (int[]) on1Var.f21675a.get("android:visibility:screenLocation");
                int i4 = iArr[0];
                int i5 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i4 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i5 - iArr2[1]) - view5.getTop());
                et1.m23201a(viewGroup).mo23953c(view5);
            }
            Animator mo21122k02 = mo21122k0(viewGroup, view5, on1Var, on1Var2);
            if (!z2) {
                if (mo21122k02 == null) {
                    et1.m23201a(viewGroup).mo23952d(view5);
                } else {
                    view3.setTag(i3, view5);
                    mo15915a(new C1474a(viewGroup, view5, view3));
                }
            }
            return mo21122k02;
        }
        return null;
    }

    @Override // com.daaw.in1
    /* renamed from: m */
    public void mo9258m(on1 on1Var) {
        m21207g0(on1Var);
    }

    /* renamed from: m0 */
    public void m21203m0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f11747Y = i;
    }

    @Override // com.daaw.in1
    /* renamed from: r */
    public Animator mo9257r(ViewGroup viewGroup, on1 on1Var, on1 on1Var2) {
        C1476c m21206h0 = m21206h0(on1Var, on1Var2);
        if (m21206h0.f11758a) {
            if (m21206h0.f11762e == null && m21206h0.f11763f == null) {
                return null;
            }
            return m21206h0.f11759b ? m21205j0(viewGroup, on1Var, m21206h0.f11760c, on1Var2, m21206h0.f11761d) : m21204l0(viewGroup, on1Var, m21206h0.f11760c, on1Var2, m21206h0.f11761d);
        }
        return null;
    }
}
