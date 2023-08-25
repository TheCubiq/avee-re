package com.daaw;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class z30 extends a40 {

    /* renamed from: com.daaw.z30$a */
    /* loaded from: classes.dex */
    public class C3803a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f34393a;

        public C3803a(Rect rect) {
            this.f34393a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f34393a;
        }
    }

    /* renamed from: com.daaw.z30$b */
    /* loaded from: classes.dex */
    public class C3804b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f34395a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f34396b;

        public C3804b(View view, ArrayList arrayList) {
            this.f34395a = view;
            this.f34396b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f34395a.setVisibility(8);
            int size = this.f34396b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f34396b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: com.daaw.z30$c */
    /* loaded from: classes.dex */
    public class C3805c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f34398a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f34399b;

        /* renamed from: c */
        public final /* synthetic */ Object f34400c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f34401d;

        /* renamed from: e */
        public final /* synthetic */ Object f34402e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f34403f;

        public C3805c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f34398a = obj;
            this.f34399b = arrayList;
            this.f34400c = obj2;
            this.f34401d = arrayList2;
            this.f34402e = obj3;
            this.f34403f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f34398a;
            if (obj != null) {
                z30.this.mo2897q(obj, this.f34399b, null);
            }
            Object obj2 = this.f34400c;
            if (obj2 != null) {
                z30.this.mo2897q(obj2, this.f34401d, null);
            }
            Object obj3 = this.f34402e;
            if (obj3 != null) {
                z30.this.mo2897q(obj3, this.f34403f, null);
            }
        }
    }

    /* renamed from: com.daaw.z30$d */
    /* loaded from: classes.dex */
    public class C3806d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f34405a;

        public C3806d(Runnable runnable) {
            this.f34405a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f34405a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.daaw.z30$e */
    /* loaded from: classes.dex */
    public class C3807e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f34407a;

        public C3807e(Rect rect) {
            this.f34407a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f34407a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f34407a;
        }
    }

    /* renamed from: C */
    public static boolean m2906C(Transition transition) {
        return (a40.m27616l(transition.getTargetIds()) && a40.m27616l(transition.getTargetNames()) && a40.m27616l(transition.getTargetTypes())) ? false : true;
    }

    @Override // com.daaw.a40
    /* renamed from: A */
    public void mo2908A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2897q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: B */
    public Object mo2907B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // com.daaw.a40
    /* renamed from: a */
    public void mo2905a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: b */
    public void mo2904b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2904b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m2906C(transition) || !a40.m27616l(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.daaw.a40
    /* renamed from: c */
    public void mo2903c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // com.daaw.a40
    /* renamed from: e */
    public boolean mo2902e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // com.daaw.a40
    /* renamed from: g */
    public Object mo2901g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // com.daaw.a40
    /* renamed from: m */
    public Object mo2900m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // com.daaw.a40
    /* renamed from: n */
    public Object mo2899n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // com.daaw.a40
    /* renamed from: p */
    public void mo2898p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // com.daaw.a40
    /* renamed from: q */
    public void mo2897q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2897q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2906C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // com.daaw.a40
    /* renamed from: r */
    public void mo2896r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C3804b(view, arrayList));
    }

    @Override // com.daaw.a40
    /* renamed from: t */
    public void mo2895t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C3805c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // com.daaw.a40
    /* renamed from: u */
    public void mo2894u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C3807e(rect));
        }
    }

    @Override // com.daaw.a40
    /* renamed from: v */
    public void mo2893v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m27617k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C3803a(rect));
        }
    }

    @Override // com.daaw.a40
    /* renamed from: w */
    public void mo2892w(Fragment fragment, Object obj, C3423wd c3423wd, Runnable runnable) {
        ((Transition) obj).addListener(new C3806d(runnable));
    }

    @Override // com.daaw.a40
    /* renamed from: z */
    public void mo2891z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a40.m27622d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2904b(transitionSet, arrayList);
    }
}
