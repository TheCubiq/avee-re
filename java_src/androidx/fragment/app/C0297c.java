package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.C0316k;
import com.daaw.C3423wd;
import com.daaw.nu0;
import com.daaw.r11;
import com.daaw.s01;
/* renamed from: androidx.fragment.app.c */
/* loaded from: classes.dex */
public class C0297c {

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: classes.dex */
    public class C0298a implements C3423wd.InterfaceC3425b {

        /* renamed from: a */
        public final /* synthetic */ Fragment f1570a;

        public C0298a(Fragment fragment) {
            this.f1570a = fragment;
        }

        @Override // com.daaw.C3423wd.InterfaceC3425b
        /* renamed from: a */
        public void mo6167a() {
            if (this.f1570a.m29416q() != null) {
                View m29416q = this.f1570a.m29416q();
                this.f1570a.m29407t1(null);
                m29416q.clearAnimation();
            }
            this.f1570a.m29402v1(null);
        }
    }

    /* renamed from: androidx.fragment.app.c$b  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC0299b implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1571a;

        /* renamed from: b */
        public final /* synthetic */ Fragment f1572b;

        /* renamed from: c */
        public final /* synthetic */ C0316k.InterfaceC0323g f1573c;

        /* renamed from: d */
        public final /* synthetic */ C3423wd f1574d;

        /* renamed from: androidx.fragment.app.c$b$a */
        /* loaded from: classes.dex */
        public class RunnableC0300a implements Runnable {
            public RunnableC0300a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (animationAnimation$AnimationListenerC0299b.this.f1572b.m29416q() != null) {
                    animationAnimation$AnimationListenerC0299b.this.f1572b.m29407t1(null);
                    animationAnimation$AnimationListenerC0299b animationanimation_animationlistenerc0299b = animationAnimation$AnimationListenerC0299b.this;
                    animationanimation_animationlistenerc0299b.f1573c.mo29108b(animationanimation_animationlistenerc0299b.f1572b, animationanimation_animationlistenerc0299b.f1574d);
                }
            }
        }

        public animationAnimation$AnimationListenerC0299b(ViewGroup viewGroup, Fragment fragment, C0316k.InterfaceC0323g interfaceC0323g, C3423wd c3423wd) {
            this.f1571a = viewGroup;
            this.f1572b = fragment;
            this.f1573c = interfaceC0323g;
            this.f1574d = c3423wd;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1571a.post(new RunnableC0300a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: classes.dex */
    public class C0301c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f1576a;

        /* renamed from: b */
        public final /* synthetic */ View f1577b;

        /* renamed from: c */
        public final /* synthetic */ Fragment f1578c;

        /* renamed from: d */
        public final /* synthetic */ C0316k.InterfaceC0323g f1579d;

        /* renamed from: e */
        public final /* synthetic */ C3423wd f1580e;

        public C0301c(ViewGroup viewGroup, View view, Fragment fragment, C0316k.InterfaceC0323g interfaceC0323g, C3423wd c3423wd) {
            this.f1576a = viewGroup;
            this.f1577b = view;
            this.f1578c = fragment;
            this.f1579d = interfaceC0323g;
            this.f1580e = c3423wd;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1576a.endViewTransition(this.f1577b);
            Animator m29413r = this.f1578c.m29413r();
            this.f1578c.m29402v1(null);
            if (m29413r == null || this.f1576a.indexOfChild(this.f1577b) >= 0) {
                return;
            }
            this.f1579d.mo29108b(this.f1578c, this.f1580e);
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: classes.dex */
    public static class C0302d {

        /* renamed from: a */
        public final Animation f1581a;

        /* renamed from: b */
        public final Animator f1582b;

        public C0302d(Animator animator) {
            this.f1581a = null;
            this.f1582b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public C0302d(Animation animation) {
            this.f1581a = animation;
            this.f1582b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    /* loaded from: classes.dex */
    public static class RunnableC0303e extends AnimationSet implements Runnable {

        /* renamed from: p */
        public final ViewGroup f1583p;

        /* renamed from: q */
        public final View f1584q;

        /* renamed from: r */
        public boolean f1585r;

        /* renamed from: s */
        public boolean f1586s;

        /* renamed from: t */
        public boolean f1587t;

        public RunnableC0303e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1587t = true;
            this.f1583p = viewGroup;
            this.f1584q = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f1587t = true;
            if (this.f1585r) {
                return !this.f1586s;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1585r = true;
                nu0.m14792a(this.f1583p, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f1587t = true;
            if (this.f1585r) {
                return !this.f1586s;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f1585r = true;
                nu0.m14792a(this.f1583p, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1585r || !this.f1587t) {
                this.f1583p.endViewTransition(this.f1584q);
                this.f1586s = true;
                return;
            }
            this.f1587t = false;
            this.f1583p.post(this);
        }
    }

    /* renamed from: a */
    public static void m29223a(Fragment fragment, C0302d c0302d, C0316k.InterfaceC0323g interfaceC0323g) {
        View view = fragment.f1376W;
        ViewGroup viewGroup = fragment.f1375V;
        viewGroup.startViewTransition(view);
        C3423wd c3423wd = new C3423wd();
        c3423wd.m6171c(new C0298a(fragment));
        interfaceC0323g.mo29109a(fragment, c3423wd);
        if (c0302d.f1581a != null) {
            RunnableC0303e runnableC0303e = new RunnableC0303e(c0302d.f1581a, viewGroup, view);
            fragment.m29407t1(fragment.f1376W);
            runnableC0303e.setAnimationListener(new animationAnimation$AnimationListenerC0299b(viewGroup, fragment, interfaceC0323g, c3423wd));
            fragment.f1376W.startAnimation(runnableC0303e);
            return;
        }
        Animator animator = c0302d.f1582b;
        fragment.m29402v1(animator);
        animator.addListener(new C0301c(viewGroup, view, fragment, interfaceC0323g, c3423wd));
        animator.setTarget(fragment.f1376W);
        animator.start();
    }

    /* renamed from: b */
    public static int m29222b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.m29477J() : fragment.m29476K() : z ? fragment.m29403v() : fragment.m29397y();
    }

    /* renamed from: c */
    public static C0302d m29221c(Context context, Fragment fragment, boolean z, boolean z2) {
        int m29486F = fragment.m29486F();
        int m29222b = m29222b(fragment, z, z2);
        boolean z3 = false;
        fragment.m29404u1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.f1375V;
        if (viewGroup != null) {
            int i = r11.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.f1375V.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.f1375V;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation m29418p0 = fragment.m29418p0(m29486F, z, m29222b);
            if (m29418p0 != null) {
                return new C0302d(m29418p0);
            }
            Animator m29415q0 = fragment.m29415q0(m29486F, z, m29222b);
            if (m29415q0 != null) {
                return new C0302d(m29415q0);
            }
            if (m29222b == 0 && m29486F != 0) {
                m29222b = m29220d(m29486F, z);
            }
            if (m29222b != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(m29222b));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, m29222b);
                        if (loadAnimation != null) {
                            return new C0302d(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, m29222b);
                        if (loadAnimator != null) {
                            return new C0302d(loadAnimator);
                        }
                    } catch (RuntimeException e2) {
                        if (equals) {
                            throw e2;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, m29222b);
                        if (loadAnimation2 != null) {
                            return new C0302d(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    public static int m29220d(int i, boolean z) {
        if (i == 4097) {
            return z ? s01.fragment_open_enter : s01.fragment_open_exit;
        } else if (i == 4099) {
            return z ? s01.fragment_fade_enter : s01.fragment_fade_exit;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? s01.fragment_close_enter : s01.fragment_close_exit;
        }
    }
}
