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
import androidx.fragment.app.k;
import com.daaw.nu0;
import com.daaw.r11;
import com.daaw.s01;
import com.daaw.wd;
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public class a implements wd.b {
        public final /* synthetic */ Fragment a;

        public a(Fragment fragment) {
            this.a = fragment;
        }

        @Override // com.daaw.wd.b
        public void a() {
            if (this.a.q() != null) {
                View q = this.a.q();
                this.a.t1(null);
                q.clearAnimation();
            }
            this.a.v1(null);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ k.g c;
        public final /* synthetic */ wd d;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.b.q() != null) {
                    b.this.b.t1(null);
                    b bVar = b.this;
                    bVar.c.b(bVar.b, bVar.d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, k.g gVar, wd wdVar) {
            this.a = viewGroup;
            this.b = fragment;
            this.c = gVar;
            this.d = wdVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0018c extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ k.g d;
        public final /* synthetic */ wd e;

        public C0018c(ViewGroup viewGroup, View view, Fragment fragment, k.g gVar, wd wdVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
            this.d = gVar;
            this.e = wdVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator r = this.c.r();
            this.c.v1(null);
            if (r == null || this.a.indexOfChild(this.b) >= 0) {
                return;
            }
            this.d.b(this.c, this.e);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public final Animation a;
        public final Animator b;

        public d(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        public d(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {
        public final ViewGroup p;
        public final View q;
        public boolean r;
        public boolean s;
        public boolean t;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.t = true;
            this.p = viewGroup;
            this.q = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.t = true;
            if (this.r) {
                return !this.s;
            }
            if (!super.getTransformation(j, transformation)) {
                this.r = true;
                nu0.a(this.p, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.t = true;
            if (this.r) {
                return !this.s;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.r = true;
                nu0.a(this.p, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.r || !this.t) {
                this.p.endViewTransition(this.q);
                this.s = true;
                return;
            }
            this.t = false;
            this.p.post(this);
        }
    }

    public static void a(Fragment fragment, d dVar, k.g gVar) {
        View view = fragment.W;
        ViewGroup viewGroup = fragment.V;
        viewGroup.startViewTransition(view);
        wd wdVar = new wd();
        wdVar.c(new a(fragment));
        gVar.a(fragment, wdVar);
        if (dVar.a != null) {
            e eVar = new e(dVar.a, viewGroup, view);
            fragment.t1(fragment.W);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, wdVar));
            fragment.W.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.b;
        fragment.v1(animator);
        animator.addListener(new C0018c(viewGroup, view, fragment, gVar, wdVar));
        animator.setTarget(fragment.W);
        animator.start();
    }

    public static int b(Fragment fragment, boolean z, boolean z2) {
        return z2 ? z ? fragment.J() : fragment.K() : z ? fragment.v() : fragment.y();
    }

    public static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int F = fragment.F();
        int b2 = b(fragment, z, z2);
        boolean z3 = false;
        fragment.u1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.V;
        if (viewGroup != null) {
            int i = r11.visible_removing_fragment_view_tag;
            if (viewGroup.getTag(i) != null) {
                fragment.V.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.V;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation p0 = fragment.p0(F, z, b2);
            if (p0 != null) {
                return new d(p0);
            }
            Animator q0 = fragment.q0(F, z, b2);
            if (q0 != null) {
                return new d(q0);
            }
            if (b2 == 0 && F != 0) {
                b2 = d(F, z);
            }
            if (b2 != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(b2));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation != null) {
                            return new d(loadAnimation);
                        }
                        z3 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z3) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, b2);
                        if (loadAnimator != null) {
                            return new d(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b2);
                        if (loadAnimation2 != null) {
                            return new d(loadAnimation2);
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static int d(int i, boolean z) {
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
