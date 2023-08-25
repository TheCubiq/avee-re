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
import com.daaw.px1;
import com.daaw.w;
import com.daaw.xs1;
import com.daaw.y;
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
    public static WeakHashMap<View, String> b;
    public static Field d;
    public static ThreadLocal<Rect> f;
    public static final AtomicInteger a = new AtomicInteger(1);
    public static WeakHashMap<View, ut1> c = null;
    public static boolean e = false;
    public static final int[] g = {q11.accessibility_custom_action_0, q11.accessibility_custom_action_1, q11.accessibility_custom_action_2, q11.accessibility_custom_action_3, q11.accessibility_custom_action_4, q11.accessibility_custom_action_5, q11.accessibility_custom_action_6, q11.accessibility_custom_action_7, q11.accessibility_custom_action_8, q11.accessibility_custom_action_9, q11.accessibility_custom_action_10, q11.accessibility_custom_action_11, q11.accessibility_custom_action_12, q11.accessibility_custom_action_13, q11.accessibility_custom_action_14, q11.accessibility_custom_action_15, q11.accessibility_custom_action_16, q11.accessibility_custom_action_17, q11.accessibility_custom_action_18, q11.accessibility_custom_action_19, q11.accessibility_custom_action_20, q11.accessibility_custom_action_21, q11.accessibility_custom_action_22, q11.accessibility_custom_action_23, q11.accessibility_custom_action_24, q11.accessibility_custom_action_25, q11.accessibility_custom_action_26, q11.accessibility_custom_action_27, q11.accessibility_custom_action_28, q11.accessibility_custom_action_29, q11.accessibility_custom_action_30, q11.accessibility_custom_action_31};
    public static final iu0 h = new iu0() { // from class: com.daaw.ws1
        @Override // com.daaw.iu0
        public final tk a(tk tkVar) {
            tk Z;
            Z = xs1.Z(tkVar);
            return Z;
        }
    };
    public static final e i = new e();

    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.d(view));
        }

        @Override // com.daaw.xs1.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.i(view, bool.booleanValue());
        }

        @Override // com.daaw.xs1.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return p.b(view);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            p.h(view, charSequence);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: i */
        public CharSequence d(View view) {
            return r.a(view);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: j */
        public void e(View view, CharSequence charSequence) {
            r.b(view, charSequence);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: k */
        public boolean h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // com.daaw.xs1.f
        /* renamed from: i */
        public Boolean d(View view) {
            return Boolean.valueOf(p.c(view));
        }

        @Override // com.daaw.xs1.f
        /* renamed from: j */
        public void e(View view, Boolean bool) {
            p.g(view, bool.booleanValue());
        }

        @Override // com.daaw.xs1.f
        /* renamed from: k */
        public boolean h(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        public final WeakHashMap<View, Boolean> p = new WeakHashMap<>();

        public void a(View view) {
            this.p.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.b(view)) {
                c(view);
            }
        }

        public final void b(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                xs1.a0(view, z2 ? 16 : 32);
                this.p.put(view, Boolean.valueOf(z2));
            }
        }

        public final void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void d(View view) {
            this.p.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        public final void e(View view) {
            h.o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.p.entrySet()) {
                    b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f<T> {
        public final int a;
        public final Class<T> b;
        public final int c;
        public final int d;

        public f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return true;
        }

        public final boolean c() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        public abstract T d(View view);

        public abstract void e(View view, T t);

        public T f(View view) {
            if (c()) {
                return d(view);
            }
            if (b()) {
                T t = (T) view.getTag(this.a);
                if (this.b.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        public void g(View view, T t) {
            if (c()) {
                e(view, t);
            } else if (b() && h(f(view), t)) {
                xs1.l(view);
                view.setTag(this.a, t);
                xs1.a0(view, this.d);
            }
        }

        public abstract boolean h(T t, T t2);
    }

    /* loaded from: classes.dex */
    public static class g {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static class h {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        public static void s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    /* loaded from: classes.dex */
    public static class i {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i) {
            view.setLabelFor(i);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i) {
            view.setLayoutDirection(i);
        }

        public static void k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* loaded from: classes.dex */
    public static class j {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        public static void f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* loaded from: classes.dex */
    public static class l {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class m {

        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {
            public px1 a = null;
            public final /* synthetic */ View b;
            public final /* synthetic */ vt0 c;

            public a(View view, vt0 vt0Var) {
                this.b = view;
                this.c = vt0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                px1 x = px1.x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    m.a(windowInsets, this.b);
                    if (x.equals(this.a)) {
                        return this.c.a(view, x).v();
                    }
                }
                this.a = x;
                px1 a = this.c.a(view, x);
                if (i >= 30) {
                    return a.v();
                }
                xs1.o0(view);
                return a.v();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(q11.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static px1 b(View view, px1 px1Var, Rect rect) {
            WindowInsets v = px1Var.v();
            if (v != null) {
                return px1.x(view.computeSystemWindowInsets(v, rect), view);
            }
            rect.setEmpty();
            return px1Var;
        }

        public static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        public static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        public static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        public static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static px1 j(View view) {
            return px1.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f) {
            view.setElevation(f);
        }

        public static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        public static void u(View view, vt0 vt0Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(q11.tag_on_apply_window_listener, vt0Var);
            }
            if (vt0Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(q11.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, vt0Var));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        public static void x(View view, float f) {
            view.setZ(f);
        }

        public static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* loaded from: classes.dex */
    public static class n {
        public static px1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            px1 w = px1.w(rootWindowInsets);
            w.t(w);
            w.d(view.getRootView());
            return w;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        public static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class o {
        public static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        public static void l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        public static void m(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        public static void n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static class p {
        public static void a(View view, final u uVar) {
            int i = q11.tag_unhandled_key_listeners;
            cd1 cd1Var = (cd1) view.getTag(i);
            if (cd1Var == null) {
                cd1Var = new cd1();
                view.setTag(i, cd1Var);
            }
            Objects.requireNonNull(uVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: com.daaw.ys1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return xs1.u.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            cd1Var.put(uVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, u uVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            cd1 cd1Var = (cd1) view.getTag(q11.tag_unhandled_key_listeners);
            if (cd1Var == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) cd1Var.get(uVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        public static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* loaded from: classes.dex */
    public static class q {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* loaded from: classes.dex */
    public static class r {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* loaded from: classes.dex */
    public static final class s {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static tk b(View view, tk tkVar) {
            ContentInfo f = tkVar.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f ? tkVar : tk.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, hu0 hu0Var) {
            if (hu0Var == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new t(hu0Var));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class t implements OnReceiveContentListener {
        public final hu0 a;

        public t(hu0 hu0Var) {
            this.a = hu0Var;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            tk g = tk.g(contentInfo);
            tk a = this.a.a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.f();
        }
    }

    /* loaded from: classes.dex */
    public interface u {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class v {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;
        public SparseArray<WeakReference<View>> b = null;
        public WeakReference<KeyEvent> c = null;

        public static v a(View view) {
            int i = q11.tag_unhandled_key_event_manager;
            v vVar = (v) view.getTag(i);
            if (vVar == null) {
                v vVar2 = new v();
                view.setTag(i, vVar2);
                return vVar2;
            }
            return vVar;
        }

        public boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        public final View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        public final boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(q11.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((u) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> d2 = d();
                if (keyEvent.getAction() == 1 && (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = d2.valueAt(indexOfKey);
                    d2.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = d2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && xs1.U(view)) {
                        e(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    public static iu0 A(View view) {
        return view instanceof iu0 ? (iu0) view : h;
    }

    public static void A0(View view, boolean z) {
        h.r(view, z);
    }

    public static boolean B(View view) {
        return h.b(view);
    }

    public static void B0(View view, int i2) {
        h.s(view, i2);
    }

    public static int C(View view) {
        return h.c(view);
    }

    public static void C0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            o.l(view, i2);
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int D(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return o.b(view);
        }
        return 0;
    }

    public static void D0(View view, vt0 vt0Var) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.u(view, vt0Var);
        }
    }

    public static int E(View view) {
        return i.d(view);
    }

    public static void E0(View view, int i2, int i3, int i4, int i5) {
        i.k(view, i2, i3, i4, i5);
    }

    public static int F(View view) {
        return h.d(view);
    }

    public static void F0(View view, boolean z) {
        q0().g(view, Boolean.valueOf(z));
    }

    public static int G(View view) {
        return h.e(view);
    }

    public static void G0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.d(view, i2, i3);
        }
    }

    public static String[] H(View view) {
        return Build.VERSION.SDK_INT >= 31 ? s.a(view) : (String[]) view.getTag(q11.tag_on_receive_content_mime_types);
    }

    public static void H0(View view, CharSequence charSequence) {
        K0().g(view, charSequence);
    }

    public static int I(View view) {
        return i.e(view);
    }

    public static void I0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.v(view, str);
            return;
        }
        if (b == null) {
            b = new WeakHashMap<>();
        }
        b.put(view, str);
    }

    public static int J(View view) {
        return i.f(view);
    }

    public static void J0(View view) {
        if (C(view) == 0) {
            B0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (C((View) parent) == 4) {
                B0(view, 2);
                return;
            }
        }
    }

    public static ViewParent K(View view) {
        return h.f(view);
    }

    public static f<CharSequence> K0() {
        return new c(q11.tag_state_description, CharSequence.class, 64, 30);
    }

    public static px1 L(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return n.a(view);
        }
        if (i2 >= 21) {
            return m.j(view);
        }
        return null;
    }

    public static void L0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.z(view);
        } else if (view instanceof es0) {
            ((es0) view).stopNestedScroll();
        }
    }

    public static CharSequence M(View view) {
        return K0().f(view);
    }

    public static void M0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static String N(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.k(view);
        }
        WeakHashMap<View, String> weakHashMap = b;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    public static int O(View view) {
        return h.g(view);
    }

    public static float P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m(view);
        }
        return 0.0f;
    }

    public static boolean Q(View view) {
        return g.a(view);
    }

    public static boolean R(View view) {
        return h.h(view);
    }

    public static boolean S(View view) {
        return h.i(view);
    }

    public static boolean T(View view) {
        Boolean f2 = b().f(view);
        return f2 != null && f2.booleanValue();
    }

    public static boolean U(View view) {
        return k.b(view);
    }

    public static boolean V(View view) {
        return k.c(view);
    }

    public static boolean W(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.p(view);
        }
        if (view instanceof es0) {
            return ((es0) view).isNestedScrollingEnabled();
        }
        return false;
    }

    public static boolean X(View view) {
        return i.g(view);
    }

    public static boolean Y(View view) {
        Boolean f2 = q0().f(view);
        return f2 != null && f2.booleanValue();
    }

    public static /* synthetic */ tk Z(tk tkVar) {
        return tkVar;
    }

    public static void a0(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = r(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (q(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                k.g(obtain, i2);
                if (z) {
                    obtain.getText().add(r(view));
                    J0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        k.e(view.getParent(), view, view, i2);
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
                k.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(r(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    public static f<Boolean> b() {
        return new d(q11.tag_accessibility_heading, Boolean.class, 28);
    }

    public static void b0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 < 21) {
            f(view, i2);
        } else {
            Rect z = z();
            boolean z2 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z2 = !z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            f(view, i2);
            if (z2 && z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(z);
            }
        }
    }

    public static int c(View view, CharSequence charSequence, b0 b0Var) {
        int t2 = t(view, charSequence);
        if (t2 != -1) {
            d(view, new y.a(t2, charSequence, b0Var));
        }
        return t2;
    }

    public static void c0(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 < 21) {
            g(view, i2);
        } else {
            Rect z = z();
            boolean z2 = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                z.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z2 = !z.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            g(view, i2);
            if (z2 && z.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(z);
            }
        }
    }

    public static void d(View view, y.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            l(view);
            m0(aVar.b(), view);
            s(view).add(aVar);
            a0(view, 0);
        }
    }

    public static px1 d0(View view, px1 px1Var) {
        WindowInsets v2;
        if (Build.VERSION.SDK_INT >= 21 && (v2 = px1Var.v()) != null) {
            WindowInsets b2 = l.b(view, v2);
            if (!b2.equals(v2)) {
                return px1.x(b2, view);
            }
        }
        return px1Var;
    }

    public static ut1 e(View view) {
        if (c == null) {
            c = new WeakHashMap<>();
        }
        ut1 ut1Var = c.get(view);
        if (ut1Var == null) {
            ut1 ut1Var2 = new ut1(view);
            c.put(view, ut1Var2);
            return ut1Var2;
        }
        return ut1Var;
    }

    public static void e0(View view, y yVar) {
        view.onInitializeAccessibilityNodeInfo(yVar.C0());
    }

    public static void f(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static f<CharSequence> f0() {
        return new b(q11.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void g(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            M0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                M0((View) parent);
            }
        }
    }

    public static boolean g0(View view, int i2, Bundle bundle) {
        return h.j(view, i2, bundle);
    }

    public static px1 h(View view, px1 px1Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.b(view, px1Var, rect) : px1Var;
    }

    public static tk h0(View view, tk tkVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(tkVar);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return s.b(view, tkVar);
        }
        hu0 hu0Var = (hu0) view.getTag(q11.tag_on_receive_content_listener);
        if (hu0Var != null) {
            tk a2 = hu0Var.a(view, tkVar);
            if (a2 == null) {
                return null;
            }
            return A(view).a(a2);
        }
        return A(view).a(tkVar);
    }

    public static px1 i(View view, px1 px1Var) {
        WindowInsets v2;
        if (Build.VERSION.SDK_INT >= 21 && (v2 = px1Var.v()) != null) {
            WindowInsets a2 = l.a(view, v2);
            if (!a2.equals(v2)) {
                return px1.x(a2, view);
            }
        }
        return px1Var;
    }

    public static void i0(View view) {
        h.k(view);
    }

    public static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).b(view, keyEvent);
    }

    public static void j0(View view, Runnable runnable) {
        h.m(view, runnable);
    }

    public static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return v.a(view).f(keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    public static void k0(View view, Runnable runnable, long j2) {
        h.n(view, runnable, j2);
    }

    public static void l(View view) {
        w n2 = n(view);
        if (n2 == null) {
            n2 = new w();
        }
        r0(view, n2);
    }

    public static void l0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m0(i2, view);
            a0(view, 0);
        }
    }

    public static int m() {
        return i.a();
    }

    public static void m0(int i2, View view) {
        List<y.a> s2 = s(view);
        for (int i3 = 0; i3 < s2.size(); i3++) {
            if (s2.get(i3).b() == i2) {
                s2.remove(i3);
                return;
            }
        }
    }

    public static w n(View view) {
        View.AccessibilityDelegate o2 = o(view);
        if (o2 == null) {
            return null;
        }
        return o2 instanceof w.a ? ((w.a) o2).a : new w(o2);
    }

    public static void n0(View view, y.a aVar, CharSequence charSequence, b0 b0Var) {
        if (b0Var == null && charSequence == null) {
            l0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, b0Var));
        }
    }

    public static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? q.a(view) : p(view);
    }

    public static void o0(View view) {
        if (Build.VERSION.SDK_INT >= 20) {
            l.c(view);
        } else {
            h.p(view);
        }
    }

    public static View.AccessibilityDelegate p(View view) {
        if (e) {
            return null;
        }
        if (d == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                e = true;
                return null;
            }
        }
        try {
            Object obj = d.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            e = true;
            return null;
        }
    }

    public static void p0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static int q(View view) {
        return k.a(view);
    }

    public static f<Boolean> q0() {
        return new a(q11.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static CharSequence r(View view) {
        return f0().f(view);
    }

    public static void r0(View view, w wVar) {
        if (wVar == null && (o(view) instanceof w.a)) {
            wVar = new w();
        }
        view.setAccessibilityDelegate(wVar == null ? null : wVar.d());
    }

    public static List<y.a> s(View view) {
        int i2 = q11.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void s0(View view, boolean z) {
        b().g(view, Boolean.valueOf(z));
    }

    public static int t(View view, CharSequence charSequence) {
        List<y.a> s2 = s(view);
        for (int i2 = 0; i2 < s2.size(); i2++) {
            if (TextUtils.equals(charSequence, s2.get(i2).c())) {
                return s2.get(i2).b();
            }
        }
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = g;
            if (i3 >= iArr.length || i4 != -1) {
                break;
            }
            int i5 = iArr[i3];
            boolean z = true;
            for (int i6 = 0; i6 < s2.size(); i6++) {
                z &= s2.get(i6).b() != i5;
            }
            if (z) {
                i4 = i5;
            }
            i3++;
        }
        return i4;
    }

    public static void t0(View view, int i2) {
        k.f(view, i2);
    }

    public static ColorStateList u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.g(view);
        }
        if (view instanceof vl1) {
            return ((vl1) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static void u0(View view, CharSequence charSequence) {
        f0().g(view, charSequence);
        if (charSequence != null) {
            i.a(view);
        } else {
            i.d(view);
        }
    }

    public static PorterDuff.Mode v(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.h(view);
        }
        if (view instanceof vl1) {
            return ((vl1) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static void v0(View view, Drawable drawable) {
        h.q(view, drawable);
    }

    public static Rect w(View view) {
        return j.a(view);
    }

    public static void w0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof vl1) {
                ((vl1) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        m.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static Display x(View view) {
        return i.b(view);
    }

    public static void x0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (view instanceof vl1) {
                ((vl1) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        m.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (m.g(view) == null && m.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.q(view, background);
        }
    }

    public static float y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.i(view);
        }
        return 0.0f;
    }

    public static void y0(View view, Rect rect) {
        j.c(view, rect);
    }

    public static Rect z() {
        if (f == null) {
            f = new ThreadLocal<>();
        }
        Rect rect = f.get();
        if (rect == null) {
            rect = new Rect();
            f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void z0(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.s(view, f2);
        }
    }
}
