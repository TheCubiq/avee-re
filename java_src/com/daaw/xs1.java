package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.px1;
import com.daaw.xs1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class xs1 {

    /* renamed from: b */
    public static WeakHashMap<View, String> f32904b;

    /* renamed from: d */
    public static Field f32906d;

    /* renamed from: f */
    public static ThreadLocal<Rect> f32908f;

    /* renamed from: a */
    public static final AtomicInteger f32903a = new AtomicInteger(1);

    /* renamed from: c */
    public static WeakHashMap<View, ut1> f32905c = null;

    /* renamed from: e */
    public static boolean f32907e = false;

    /* renamed from: g */
    public static final int[] f32909g = {q11.accessibility_custom_action_0, q11.accessibility_custom_action_1, q11.accessibility_custom_action_2, q11.accessibility_custom_action_3, q11.accessibility_custom_action_4, q11.accessibility_custom_action_5, q11.accessibility_custom_action_6, q11.accessibility_custom_action_7, q11.accessibility_custom_action_8, q11.accessibility_custom_action_9, q11.accessibility_custom_action_10, q11.accessibility_custom_action_11, q11.accessibility_custom_action_12, q11.accessibility_custom_action_13, q11.accessibility_custom_action_14, q11.accessibility_custom_action_15, q11.accessibility_custom_action_16, q11.accessibility_custom_action_17, q11.accessibility_custom_action_18, q11.accessibility_custom_action_19, q11.accessibility_custom_action_20, q11.accessibility_custom_action_21, q11.accessibility_custom_action_22, q11.accessibility_custom_action_23, q11.accessibility_custom_action_24, q11.accessibility_custom_action_25, q11.accessibility_custom_action_26, q11.accessibility_custom_action_27, q11.accessibility_custom_action_28, q11.accessibility_custom_action_29, q11.accessibility_custom_action_30, q11.accessibility_custom_action_31};

    /* renamed from: h */
    public static final iu0 f32910h = new iu0() { // from class: com.daaw.ws1
        @Override // com.daaw.iu0
        /* renamed from: a */
        public final C3081tk mo5829a(C3081tk c3081tk) {
            C3081tk m4738Z;
            m4738Z = xs1.m4738Z(c3081tk);
            return m4738Z;
        }
    };

    /* renamed from: i */
    public static final ViewTreeObserver$OnGlobalLayoutListenerC3571e f32911i = new ViewTreeObserver$OnGlobalLayoutListenerC3571e();

    /* renamed from: com.daaw.xs1$a */
    /* loaded from: classes.dex */
    public class C3567a extends AbstractC3572f<Boolean> {
        public C3567a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: i */
        public Boolean mo4665d(View view) {
            return Boolean.valueOf(C3583p.m4568d(view));
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: j */
        public void mo4664e(View view, Boolean bool) {
            C3583p.m4563i(view, bool.booleanValue());
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: k */
        public boolean mo4661h(Boolean bool, Boolean bool2) {
            return !m4668a(bool, bool2);
        }
    }

    /* renamed from: com.daaw.xs1$b */
    /* loaded from: classes.dex */
    public class C3568b extends AbstractC3572f<CharSequence> {
        public C3568b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: i */
        public CharSequence mo4665d(View view) {
            return C3583p.m4570b(view);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: j */
        public void mo4664e(View view, CharSequence charSequence) {
            C3583p.m4564h(view, charSequence);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: k */
        public boolean mo4661h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: com.daaw.xs1$c */
    /* loaded from: classes.dex */
    public class C3569c extends AbstractC3572f<CharSequence> {
        public C3569c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: i */
        public CharSequence mo4665d(View view) {
            return C3585r.m4558a(view);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: j */
        public void mo4664e(View view, CharSequence charSequence) {
            C3585r.m4557b(view, charSequence);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: k */
        public boolean mo4661h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: com.daaw.xs1$d */
    /* loaded from: classes.dex */
    public class C3570d extends AbstractC3572f<Boolean> {
        public C3570d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: i */
        public Boolean mo4665d(View view) {
            return Boolean.valueOf(C3583p.m4569c(view));
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: j */
        public void mo4664e(View view, Boolean bool) {
            C3583p.m4565g(view, bool.booleanValue());
        }

        @Override // com.daaw.xs1.AbstractC3572f
        /* renamed from: k */
        public boolean mo4661h(Boolean bool, Boolean bool2) {
            return !m4668a(bool, bool2);
        }
    }

    /* renamed from: com.daaw.xs1$e */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC3571e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: p */
        public final WeakHashMap<View, Boolean> f32912p = new WeakHashMap<>();

        /* renamed from: a */
        public void m4673a(View view) {
            this.f32912p.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (C3577k.m4625b(view)) {
                m4671c(view);
            }
        }

        /* renamed from: b */
        public final void m4672b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                xs1.m4736a0(view, z2 ? 16 : 32);
                this.f32912p.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: c */
        public final void m4671c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void m4670d(View view) {
            this.f32912p.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m4669e(view);
        }

        /* renamed from: e */
        public final void m4669e(View view) {
            C3574h.m4645o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f32912p.entrySet()) {
                    m4672b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m4671c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.daaw.xs1$f */
    /* loaded from: classes.dex */
    public static abstract class AbstractC3572f<T> {

        /* renamed from: a */
        public final int f32913a;

        /* renamed from: b */
        public final Class<T> f32914b;

        /* renamed from: c */
        public final int f32915c;

        /* renamed from: d */
        public final int f32916d;

        public AbstractC3572f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public AbstractC3572f(int i, Class<T> cls, int i2, int i3) {
            this.f32913a = i;
            this.f32914b = cls;
            this.f32916d = i2;
            this.f32915c = i3;
        }

        /* renamed from: a */
        public boolean m4668a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public final boolean m4667b() {
            return true;
        }

        /* renamed from: c */
        public final boolean m4666c() {
            return Build.VERSION.SDK_INT >= this.f32915c;
        }

        /* renamed from: d */
        public abstract T mo4665d(View view);

        /* renamed from: e */
        public abstract void mo4664e(View view, T t);

        /* renamed from: f */
        public T m4663f(View view) {
            if (m4666c()) {
                return mo4665d(view);
            }
            if (m4667b()) {
                T t = (T) view.getTag(this.f32913a);
                if (this.f32914b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        /* renamed from: g */
        public void m4662g(View view, T t) {
            if (m4666c()) {
                mo4664e(view, t);
            } else if (m4667b() && mo4661h(m4663f(view), t)) {
                xs1.m4715l(view);
                view.setTag(this.f32913a, t);
                xs1.m4736a0(view, this.f32916d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo4661h(T t, T t2);
    }

    /* renamed from: com.daaw.xs1$g */
    /* loaded from: classes.dex */
    public static class C3573g {
        /* renamed from: a */
        public static boolean m4660a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: com.daaw.xs1$h */
    /* loaded from: classes.dex */
    public static class C3574h {
        /* renamed from: a */
        public static AccessibilityNodeProvider m4659a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m4658b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m4657c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m4656d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m4655e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m4654f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m4653g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m4652h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m4651i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m4650j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        /* renamed from: k */
        public static void m4649k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m4648l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        /* renamed from: m */
        public static void m4647m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m4646n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        /* renamed from: o */
        public static void m4645o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m4644p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m4643q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m4642r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        /* renamed from: s */
        public static void m4641s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: com.daaw.xs1$i */
    /* loaded from: classes.dex */
    public static class C3575i {
        /* renamed from: a */
        public static int m4640a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m4639b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m4638c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m4637d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m4636e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m4635f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m4634g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m4633h(View view, int i) {
            view.setLabelFor(i);
        }

        /* renamed from: i */
        public static void m4632i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m4631j(View view, int i) {
            view.setLayoutDirection(i);
        }

        /* renamed from: k */
        public static void m4630k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* renamed from: com.daaw.xs1$j */
    /* loaded from: classes.dex */
    public static class C3576j {
        /* renamed from: a */
        public static Rect m4629a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m4628b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m4627c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: com.daaw.xs1$k */
    /* loaded from: classes.dex */
    public static class C3577k {
        /* renamed from: a */
        public static int m4626a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m4625b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m4624c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m4623d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m4622e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        /* renamed from: f */
        public static void m4621f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        /* renamed from: g */
        public static void m4620g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: com.daaw.xs1$l */
    /* loaded from: classes.dex */
    public static class C3578l {
        /* renamed from: a */
        public static WindowInsets m4619a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m4618b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m4617c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: com.daaw.xs1$m */
    /* loaded from: classes.dex */
    public static class C3579m {

        /* renamed from: com.daaw.xs1$m$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC3580a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public px1 f32917a = null;

            /* renamed from: b */
            public final /* synthetic */ View f32918b;

            /* renamed from: c */
            public final /* synthetic */ vt0 f32919c;

            public View$OnApplyWindowInsetsListenerC3580a(View view, vt0 vt0Var) {
                this.f32918b = view;
                this.f32919c = vt0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                px1 m12937x = px1.m12937x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C3579m.m4616a(windowInsets, this.f32918b);
                    if (m12937x.equals(this.f32917a)) {
                        return this.f32919c.mo6806a(view, m12937x).m12939v();
                    }
                }
                this.f32917a = m12937x;
                px1 mo6806a = this.f32919c.mo6806a(view, m12937x);
                if (i >= 30) {
                    return mo6806a.m12939v();
                }
                xs1.m4708o0(view);
                return mo6806a.m12939v();
            }
        }

        /* renamed from: a */
        public static void m4616a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(q11.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static px1 m4615b(View view, px1 px1Var, Rect rect) {
            WindowInsets m12939v = px1Var.m12939v();
            if (m12939v != null) {
                return px1.m12937x(view.computeSystemWindowInsets(m12939v, rect), view);
            }
            rect.setEmpty();
            return px1Var;
        }

        /* renamed from: c */
        public static boolean m4614c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        /* renamed from: d */
        public static boolean m4613d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        /* renamed from: e */
        public static boolean m4612e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m4611f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m4610g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m4609h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m4608i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static px1 m4607j(View view) {
            return px1.C2651a.m12936a(view);
        }

        /* renamed from: k */
        public static String m4606k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m4605l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m4604m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m4603n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m4602o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m4601p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m4600q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m4599r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m4598s(View view, float f) {
            view.setElevation(f);
        }

        /* renamed from: t */
        public static void m4597t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        /* renamed from: u */
        public static void m4596u(View view, vt0 vt0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(q11.tag_on_apply_window_listener, vt0Var);
            }
            if (vt0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(q11.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC3580a(view, vt0Var));
            }
        }

        /* renamed from: v */
        public static void m4595v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m4594w(View view, float f) {
            view.setTranslationZ(f);
        }

        /* renamed from: x */
        public static void m4593x(View view, float f) {
            view.setZ(f);
        }

        /* renamed from: y */
        public static boolean m4592y(View view, int i) {
            return view.startNestedScroll(i);
        }

        /* renamed from: z */
        public static void m4591z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: com.daaw.xs1$n */
    /* loaded from: classes.dex */
    public static class C3581n {
        /* renamed from: a */
        public static px1 m4590a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            px1 m12938w = px1.m12938w(rootWindowInsets);
            m12938w.m12941t(m12938w);
            m12938w.m12957d(view.getRootView());
            return m12938w;
        }

        /* renamed from: b */
        public static int m4589b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m4588c(View view, int i) {
            view.setScrollIndicators(i);
        }

        /* renamed from: d */
        public static void m4587d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: com.daaw.xs1$o */
    /* loaded from: classes.dex */
    public static class C3582o {
        /* renamed from: a */
        public static void m4586a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        /* renamed from: b */
        public static int m4585b(View view) {
            return view.getImportantForAutofill();
        }

        /* renamed from: c */
        public static int m4584c(View view) {
            return view.getNextClusterForwardId();
        }

        /* renamed from: d */
        public static boolean m4583d(View view) {
            return view.hasExplicitFocusable();
        }

        /* renamed from: e */
        public static boolean m4582e(View view) {
            return view.isFocusedByDefault();
        }

        /* renamed from: f */
        public static boolean m4581f(View view) {
            return view.isImportantForAutofill();
        }

        /* renamed from: g */
        public static boolean m4580g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        /* renamed from: h */
        public static View m4579h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        /* renamed from: i */
        public static boolean m4578i(View view) {
            return view.restoreDefaultFocus();
        }

        /* renamed from: j */
        public static void m4577j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        /* renamed from: k */
        public static void m4576k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        /* renamed from: l */
        public static void m4575l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        /* renamed from: m */
        public static void m4574m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        /* renamed from: n */
        public static void m4573n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        /* renamed from: o */
        public static void m4572o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: com.daaw.xs1$p */
    /* loaded from: classes.dex */
    public static class C3583p {
        /* renamed from: a */
        public static void m4571a(View view, final InterfaceC3588u interfaceC3588u) {
            int i = q11.tag_unhandled_key_listeners;
            cd1 cd1Var = (cd1) view.getTag(i);
            if (cd1Var == null) {
                cd1Var = new cd1();
                view.setTag(i, cd1Var);
            }
            Objects.requireNonNull(interfaceC3588u);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: com.daaw.ys1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return xs1.InterfaceC3588u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            cd1Var.put(interfaceC3588u, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: b */
        public static CharSequence m4570b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m4569c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m4568d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m4567e(View view, InterfaceC3588u interfaceC3588u) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            cd1 cd1Var = (cd1) view.getTag(q11.tag_unhandled_key_listeners);
            if (cd1Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) cd1Var.get(interfaceC3588u)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        public static <T> T m4566f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        /* renamed from: g */
        public static void m4565g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        /* renamed from: h */
        public static void m4564h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m4563i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: com.daaw.xs1$q */
    /* loaded from: classes.dex */
    public static class C3584q {
        /* renamed from: a */
        public static View.AccessibilityDelegate m4562a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m4561b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m4560c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        /* renamed from: d */
        public static void m4559d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: com.daaw.xs1$r */
    /* loaded from: classes.dex */
    public static class C3585r {
        /* renamed from: a */
        public static CharSequence m4558a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static void m4557b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: com.daaw.xs1$s */
    /* loaded from: classes.dex */
    public static final class C3586s {
        /* renamed from: a */
        public static String[] m4556a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C3081tk m4555b(View view, C3081tk c3081tk) {
            ContentInfo m9062f = c3081tk.m9062f();
            ContentInfo performReceiveContent = view.performReceiveContent(m9062f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m9062f ? c3081tk : C3081tk.m9061g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m4554c(View view, String[] strArr, hu0 hu0Var) {
            if (hu0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC3587t(hu0Var));
            }
        }
    }

    /* renamed from: com.daaw.xs1$t */
    /* loaded from: classes.dex */
    public static final class OnReceiveContentListenerC3587t implements OnReceiveContentListener {

        /* renamed from: a */
        public final hu0 f32920a;

        public OnReceiveContentListenerC3587t(hu0 hu0Var) {
            this.f32920a = hu0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C3081tk m9061g = C3081tk.m9061g(contentInfo);
            C3081tk mo9049a = this.f32920a.mo9049a(view, m9061g);
            if (mo9049a == null) {
                return null;
            }
            return mo9049a == m9061g ? contentInfo : mo9049a.m9062f();
        }
    }

    /* renamed from: com.daaw.xs1$u */
    /* loaded from: classes.dex */
    public interface InterfaceC3588u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: com.daaw.xs1$v */
    /* loaded from: classes.dex */
    public static class C3589v {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f32921d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f32922a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f32923b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f32924c = null;

        /* renamed from: a */
        public static C3589v m4553a(View view) {
            int i = q11.tag_unhandled_key_event_manager;
            C3589v c3589v = (C3589v) view.getTag(i);
            if (c3589v == null) {
                C3589v c3589v2 = new C3589v();
                view.setTag(i, c3589v2);
                return c3589v2;
            }
            return c3589v;
        }

        /* renamed from: b */
        public boolean m4552b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4547g();
            }
            View m4551c = m4551c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m4551c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4550d().put(keyCode, new WeakReference<>(m4551c));
                }
            }
            return m4551c != null;
        }

        /* renamed from: c */
        public final View m4551c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f32922a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m4551c = m4551c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m4551c != null) {
                            return m4551c;
                        }
                    }
                }
                if (m4549e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> m4550d() {
            if (this.f32923b == null) {
                this.f32923b = new SparseArray<>();
            }
            return this.f32923b;
        }

        /* renamed from: e */
        public final boolean m4549e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(q11.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC3588u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m4548f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f32924c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f32924c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> m4550d = m4550d();
                if (keyEvent.getAction() == 1 && (indexOfKey = m4550d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = m4550d.valueAt(indexOfKey);
                    m4550d.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = m4550d.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && xs1.m4743U(view)) {
                        m4549e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        /* renamed from: g */
        public final void m4547g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f32922a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f32921d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f32922a == null) {
                    this.f32922a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f32921d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f32922a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f32922a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public static iu0 m4776A(View view) {
        return view instanceof iu0 ? (iu0) view : f32910h;
    }

    /* renamed from: A0 */
    public static void m4775A0(View view, boolean z) {
        C3574h.m4642r(view, z);
    }

    /* renamed from: B */
    public static boolean m4774B(View view) {
        return C3574h.m4658b(view);
    }

    /* renamed from: B0 */
    public static void m4773B0(View view, int i) {
        C3574h.m4641s(view, i);
    }

    /* renamed from: C */
    public static int m4772C(View view) {
        return C3574h.m4657c(view);
    }

    /* renamed from: C0 */
    public static void m4771C0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C3582o.m4575l(view, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: D */
    public static int m4770D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C3582o.m4585b(view);
        }
        return 0;
    }

    /* renamed from: D0 */
    public static void m4769D0(View view, vt0 vt0Var) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3579m.m4596u(view, vt0Var);
        }
    }

    /* renamed from: E */
    public static int m4768E(View view) {
        return C3575i.m4637d(view);
    }

    /* renamed from: E0 */
    public static void m4767E0(View view, int i, int i2, int i3, int i4) {
        C3575i.m4630k(view, i, i2, i3, i4);
    }

    /* renamed from: F */
    public static int m4766F(View view) {
        return C3574h.m4656d(view);
    }

    /* renamed from: F0 */
    public static void m4765F0(View view, boolean z) {
        m4704q0().m4662g(view, Boolean.valueOf(z));
    }

    /* renamed from: G */
    public static int m4764G(View view) {
        return C3574h.m4655e(view);
    }

    /* renamed from: G0 */
    public static void m4763G0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C3581n.m4587d(view, i, i2);
        }
    }

    /* renamed from: H */
    public static String[] m4762H(View view) {
        return Build.VERSION.SDK_INT >= 31 ? C3586s.m4556a(view) : (String[]) view.getTag(q11.tag_on_receive_content_mime_types);
    }

    /* renamed from: H0 */
    public static void m4761H0(View view, CharSequence charSequence) {
        m4755K0().m4662g(view, charSequence);
    }

    /* renamed from: I */
    public static int m4760I(View view) {
        return C3575i.m4636e(view);
    }

    /* renamed from: I0 */
    public static void m4759I0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3579m.m4595v(view, str);
            return;
        }
        if (f32904b == null) {
            f32904b = new WeakHashMap<>();
        }
        f32904b.put(view, str);
    }

    /* renamed from: J */
    public static int m4758J(View view) {
        return C3575i.m4635f(view);
    }

    /* renamed from: J0 */
    public static void m4757J0(View view) {
        if (m4772C(view) == 0) {
            m4773B0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m4772C((View) parent) == 4) {
                m4773B0(view, 2);
                return;
            }
        }
    }

    /* renamed from: K */
    public static ViewParent m4756K(View view) {
        return C3574h.m4654f(view);
    }

    /* renamed from: K0 */
    public static AbstractC3572f<CharSequence> m4755K0() {
        return new C3569c(q11.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: L */
    public static px1 m4754L(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C3581n.m4590a(view);
        }
        if (i >= 21) {
            return C3579m.m4607j(view);
        }
        return null;
    }

    /* renamed from: L0 */
    public static void m4753L0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3579m.m4591z(view);
        } else if (view instanceof es0) {
            ((es0) view).stopNestedScroll();
        }
    }

    /* renamed from: M */
    public static CharSequence m4752M(View view) {
        return m4755K0().m4663f(view);
    }

    /* renamed from: M0 */
    public static void m4751M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: N */
    public static String m4750N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4606k(view);
        }
        WeakHashMap<View, String> weakHashMap = f32904b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: O */
    public static int m4749O(View view) {
        return C3574h.m4653g(view);
    }

    /* renamed from: P */
    public static float m4748P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4604m(view);
        }
        return 0.0f;
    }

    /* renamed from: Q */
    public static boolean m4747Q(View view) {
        return C3573g.m4660a(view);
    }

    /* renamed from: R */
    public static boolean m4746R(View view) {
        return C3574h.m4652h(view);
    }

    /* renamed from: S */
    public static boolean m4745S(View view) {
        return C3574h.m4651i(view);
    }

    /* renamed from: T */
    public static boolean m4744T(View view) {
        Boolean m4663f = m4735b().m4663f(view);
        return m4663f != null && m4663f.booleanValue();
    }

    /* renamed from: U */
    public static boolean m4743U(View view) {
        return C3577k.m4625b(view);
    }

    /* renamed from: V */
    public static boolean m4742V(View view) {
        return C3577k.m4624c(view);
    }

    /* renamed from: W */
    public static boolean m4741W(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4601p(view);
        }
        if (view instanceof es0) {
            return ((es0) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: X */
    public static boolean m4740X(View view) {
        return C3575i.m4634g(view);
    }

    /* renamed from: Y */
    public static boolean m4739Y(View view) {
        Boolean m4663f = m4704q0().m4663f(view);
        return m4663f != null && m4663f.booleanValue();
    }

    /* renamed from: Z */
    public static /* synthetic */ C3081tk m4738Z(C3081tk c3081tk) {
        return c3081tk;
    }

    /* renamed from: a0 */
    public static void m4736a0(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m4703r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m4705q(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                C3577k.m4620g(obtain, i);
                if (z) {
                    obtain.getText().add(m4703r(view));
                    m4757J0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        C3577k.m4622e(view.getParent(), view, view, i);
                    } catch (AbstractMethodError unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(view.getParent().getClass().getSimpleName());
                        sb.append(" does not fully implement ViewParent");
                    }
                }
            } else {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                C3577k.m4620g(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m4703r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    /* renamed from: b */
    public static AbstractC3572f<Boolean> m4735b() {
        return new C3570d(q11.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: b0 */
    public static void m4734b0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 < 21) {
            m4727f(view, i);
        } else {
            Rect m4687z = m4687z();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m4687z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m4687z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4727f(view, i);
            if (z && m4687z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m4687z);
            }
        }
    }

    /* renamed from: c */
    public static int m4733c(View view, CharSequence charSequence, InterfaceC0785b0 interfaceC0785b0) {
        int m4699t = m4699t(view, charSequence);
        if (m4699t != -1) {
            m4731d(view, new C3654y.C3655a(m4699t, charSequence, interfaceC0785b0));
        }
        return m4699t;
    }

    /* renamed from: c0 */
    public static void m4732c0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 < 21) {
            m4725g(view, i);
        } else {
            Rect m4687z = m4687z();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m4687z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m4687z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4725g(view, i);
            if (z && m4687z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m4687z);
            }
        }
    }

    /* renamed from: d */
    public static void m4731d(View view, C3654y.C3655a c3655a) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4715l(view);
            m4712m0(c3655a.m4285b(), view);
            m4701s(view).add(c3655a);
            m4736a0(view, 0);
        }
    }

    /* renamed from: d0 */
    public static px1 m4730d0(View view, px1 px1Var) {
        WindowInsets m12939v;
        if (Build.VERSION.SDK_INT >= 21 && (m12939v = px1Var.m12939v()) != null) {
            WindowInsets m4618b = C3578l.m4618b(view, m12939v);
            if (!m4618b.equals(m12939v)) {
                return px1.m12937x(m4618b, view);
            }
        }
        return px1Var;
    }

    /* renamed from: e */
    public static ut1 m4729e(View view) {
        if (f32905c == null) {
            f32905c = new WeakHashMap<>();
        }
        ut1 ut1Var = f32905c.get(view);
        if (ut1Var == null) {
            ut1 ut1Var2 = new ut1(view);
            f32905c.put(view, ut1Var2);
            return ut1Var2;
        }
        return ut1Var;
    }

    /* renamed from: e0 */
    public static void m4728e0(View view, C3654y c3654y) {
        view.onInitializeAccessibilityNodeInfo(c3654y.m4363C0());
    }

    /* renamed from: f */
    public static void m4727f(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m4751M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4751M0((View) parent);
            }
        }
    }

    /* renamed from: f0 */
    public static AbstractC3572f<CharSequence> m4726f0() {
        return new C3568b(q11.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: g */
    public static void m4725g(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m4751M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4751M0((View) parent);
            }
        }
    }

    /* renamed from: g0 */
    public static boolean m4724g0(View view, int i, Bundle bundle) {
        return C3574h.m4650j(view, i, bundle);
    }

    /* renamed from: h */
    public static px1 m4723h(View view, px1 px1Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C3579m.m4615b(view, px1Var, rect) : px1Var;
    }

    /* renamed from: h0 */
    public static C3081tk m4722h0(View view, C3081tk c3081tk) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(c3081tk);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C3586s.m4555b(view, c3081tk);
        }
        hu0 hu0Var = (hu0) view.getTag(q11.tag_on_receive_content_listener);
        if (hu0Var != null) {
            C3081tk mo9049a = hu0Var.mo9049a(view, c3081tk);
            if (mo9049a == null) {
                return null;
            }
            return m4776A(view).mo5829a(mo9049a);
        }
        return m4776A(view).mo5829a(c3081tk);
    }

    /* renamed from: i */
    public static px1 m4721i(View view, px1 px1Var) {
        WindowInsets m12939v;
        if (Build.VERSION.SDK_INT >= 21 && (m12939v = px1Var.m12939v()) != null) {
            WindowInsets m4619a = C3578l.m4619a(view, m12939v);
            if (!m4619a.equals(m12939v)) {
                return px1.m12937x(m4619a, view);
            }
        }
        return px1Var;
    }

    /* renamed from: i0 */
    public static void m4720i0(View view) {
        C3574h.m4649k(view);
    }

    /* renamed from: j */
    public static boolean m4719j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3589v.m4553a(view).m4552b(view, keyEvent);
    }

    /* renamed from: j0 */
    public static void m4718j0(View view, Runnable runnable) {
        C3574h.m4647m(view, runnable);
    }

    /* renamed from: k */
    public static boolean m4717k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C3589v.m4553a(view).m4548f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: k0 */
    public static void m4716k0(View view, Runnable runnable, long j) {
        C3574h.m4646n(view, runnable, j);
    }

    /* renamed from: l */
    public static void m4715l(View view) {
        C3388w m4711n = m4711n(view);
        if (m4711n == null) {
            m4711n = new C3388w();
        }
        m4702r0(view, m4711n);
    }

    /* renamed from: l0 */
    public static void m4714l0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m4712m0(i, view);
            m4736a0(view, 0);
        }
    }

    /* renamed from: m */
    public static int m4713m() {
        return C3575i.m4640a();
    }

    /* renamed from: m0 */
    public static void m4712m0(int i, View view) {
        List<C3654y.C3655a> m4701s = m4701s(view);
        for (int i2 = 0; i2 < m4701s.size(); i2++) {
            if (m4701s.get(i2).m4285b() == i) {
                m4701s.remove(i2);
                return;
            }
        }
    }

    /* renamed from: n */
    public static C3388w m4711n(View view) {
        View.AccessibilityDelegate m4709o = m4709o(view);
        if (m4709o == null) {
            return null;
        }
        return m4709o instanceof C3388w.C3389a ? ((C3388w.C3389a) m4709o).f30740a : new C3388w(m4709o);
    }

    /* renamed from: n0 */
    public static void m4710n0(View view, C3654y.C3655a c3655a, CharSequence charSequence, InterfaceC0785b0 interfaceC0785b0) {
        if (interfaceC0785b0 == null && charSequence == null) {
            m4714l0(view, c3655a.m4285b());
        } else {
            m4731d(view, c3655a.m4286a(charSequence, interfaceC0785b0));
        }
    }

    /* renamed from: o */
    public static View.AccessibilityDelegate m4709o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? C3584q.m4562a(view) : m4707p(view);
    }

    /* renamed from: o0 */
    public static void m4708o0(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            C3578l.m4617c(view);
        } else {
            C3574h.m4644p(view);
        }
    }

    /* renamed from: p */
    public static View.AccessibilityDelegate m4707p(View view) {
        if (f32907e) {
            return null;
        }
        if (f32906d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f32906d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f32907e = true;
                return null;
            }
        }
        try {
            Object obj = f32906d.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f32907e = true;
            return null;
        }
    }

    /* renamed from: p0 */
    public static void m4706p0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C3584q.m4560c(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: q */
    public static int m4705q(View view) {
        return C3577k.m4626a(view);
    }

    /* renamed from: q0 */
    public static AbstractC3572f<Boolean> m4704q0() {
        return new C3567a(q11.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: r */
    public static CharSequence m4703r(View view) {
        return m4726f0().m4663f(view);
    }

    /* renamed from: r0 */
    public static void m4702r0(View view, C3388w c3388w) {
        if (c3388w == null && (m4709o(view) instanceof C3388w.C3389a)) {
            c3388w = new C3388w();
        }
        view.setAccessibilityDelegate(c3388w == null ? null : c3388w.m6632d());
    }

    /* renamed from: s */
    public static List<C3654y.C3655a> m4701s(View view) {
        int i = q11.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: s0 */
    public static void m4700s0(View view, boolean z) {
        m4735b().m4662g(view, Boolean.valueOf(z));
    }

    /* renamed from: t */
    public static int m4699t(View view, CharSequence charSequence) {
        List<C3654y.C3655a> m4701s = m4701s(view);
        for (int i = 0; i < m4701s.size(); i++) {
            if (TextUtils.equals(charSequence, m4701s.get(i).m4284c())) {
                return m4701s.get(i).m4285b();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = f32909g;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < m4701s.size(); i5++) {
                z &= m4701s.get(i5).m4285b() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: t0 */
    public static void m4698t0(View view, int i) {
        C3577k.m4621f(view, i);
    }

    /* renamed from: u */
    public static ColorStateList m4697u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4610g(view);
        }
        if (view instanceof vl1) {
            return ((vl1) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: u0 */
    public static void m4696u0(View view, CharSequence charSequence) {
        m4726f0().m4662g(view, charSequence);
        if (charSequence != null) {
            f32911i.m4673a(view);
        } else {
            f32911i.m4670d(view);
        }
    }

    /* renamed from: v */
    public static PorterDuff.Mode m4695v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4609h(view);
        }
        if (view instanceof vl1) {
            return ((vl1) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: v0 */
    public static void m4694v0(View view, Drawable drawable) {
        C3574h.m4643q(view, drawable);
    }

    /* renamed from: w */
    public static Rect m4693w(View view) {
        return C3576j.m4629a(view);
    }

    /* renamed from: w0 */
    public static void m4692w0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (view instanceof vl1) {
                ((vl1) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        C3579m.m4600q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C3579m.m4610g(view) == null && C3579m.m4609h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            C3574h.m4643q(view, background);
        }
    }

    /* renamed from: x */
    public static Display m4691x(View view) {
        return C3575i.m4639b(view);
    }

    /* renamed from: x0 */
    public static void m4690x0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            if (view instanceof vl1) {
                ((vl1) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        C3579m.m4599r(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C3579m.m4610g(view) == null && C3579m.m4609h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            C3574h.m4643q(view, background);
        }
    }

    /* renamed from: y */
    public static float m4689y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C3579m.m4608i(view);
        }
        return 0.0f;
    }

    /* renamed from: y0 */
    public static void m4688y0(View view, Rect rect) {
        C3576j.m4627c(view, rect);
    }

    /* renamed from: z */
    public static Rect m4687z() {
        if (f32908f == null) {
            f32908f = new ThreadLocal<>();
        }
        Rect rect = f32908f.get();
        if (rect == null) {
            rect = new Rect();
            f32908f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: z0 */
    public static void m4686z0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C3579m.m4598s(view, f);
        }
    }
}
