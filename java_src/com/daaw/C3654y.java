package com.daaw;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.daaw.InterfaceC0785b0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.NativeConstants;
/* renamed from: com.daaw.y */
/* loaded from: classes.dex */
public class C3654y {

    /* renamed from: d */
    public static int f33145d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f33146a;

    /* renamed from: b */
    public int f33147b = -1;

    /* renamed from: c */
    public int f33148c = -1;

    /* renamed from: com.daaw.y$a */
    /* loaded from: classes.dex */
    public static class C3655a {

        /* renamed from: A */
        public static final C3655a f33149A;

        /* renamed from: B */
        public static final C3655a f33150B;

        /* renamed from: C */
        public static final C3655a f33151C;

        /* renamed from: D */
        public static final C3655a f33152D;

        /* renamed from: E */
        public static final C3655a f33153E;

        /* renamed from: F */
        public static final C3655a f33154F;

        /* renamed from: G */
        public static final C3655a f33155G;

        /* renamed from: H */
        public static final C3655a f33156H;

        /* renamed from: I */
        public static final C3655a f33157I;

        /* renamed from: J */
        public static final C3655a f33158J;

        /* renamed from: K */
        public static final C3655a f33159K;

        /* renamed from: L */
        public static final C3655a f33160L;

        /* renamed from: M */
        public static final C3655a f33161M;

        /* renamed from: N */
        public static final C3655a f33162N;

        /* renamed from: O */
        public static final C3655a f33163O;

        /* renamed from: P */
        public static final C3655a f33164P;

        /* renamed from: Q */
        public static final C3655a f33165Q;

        /* renamed from: R */
        public static final C3655a f33166R;

        /* renamed from: S */
        public static final C3655a f33167S;

        /* renamed from: T */
        public static final C3655a f33168T;

        /* renamed from: e */
        public static final C3655a f33169e = new C3655a(1, null);

        /* renamed from: f */
        public static final C3655a f33170f = new C3655a(2, null);

        /* renamed from: g */
        public static final C3655a f33171g = new C3655a(4, null);

        /* renamed from: h */
        public static final C3655a f33172h = new C3655a(8, null);

        /* renamed from: i */
        public static final C3655a f33173i = new C3655a(16, null);

        /* renamed from: j */
        public static final C3655a f33174j = new C3655a(32, null);

        /* renamed from: k */
        public static final C3655a f33175k = new C3655a(64, null);

        /* renamed from: l */
        public static final C3655a f33176l = new C3655a(128, null);

        /* renamed from: m */
        public static final C3655a f33177m = new C3655a(256, (CharSequence) null, InterfaceC0785b0.C0787b.class);

        /* renamed from: n */
        public static final C3655a f33178n = new C3655a(512, (CharSequence) null, InterfaceC0785b0.C0787b.class);

        /* renamed from: o */
        public static final C3655a f33179o = new C3655a((int) NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, (CharSequence) null, InterfaceC0785b0.C0788c.class);

        /* renamed from: p */
        public static final C3655a f33180p = new C3655a(2048, (CharSequence) null, InterfaceC0785b0.C0788c.class);

        /* renamed from: q */
        public static final C3655a f33181q = new C3655a(4096, null);

        /* renamed from: r */
        public static final C3655a f33182r = new C3655a(8192, null);

        /* renamed from: s */
        public static final C3655a f33183s = new C3655a(16384, null);

        /* renamed from: t */
        public static final C3655a f33184t = new C3655a(32768, null);

        /* renamed from: u */
        public static final C3655a f33185u = new C3655a(65536, null);

        /* renamed from: v */
        public static final C3655a f33186v = new C3655a(131072, (CharSequence) null, InterfaceC0785b0.C0792g.class);

        /* renamed from: w */
        public static final C3655a f33187w = new C3655a(262144, null);

        /* renamed from: x */
        public static final C3655a f33188x = new C3655a(524288, null);

        /* renamed from: y */
        public static final C3655a f33189y = new C3655a(1048576, null);

        /* renamed from: z */
        public static final C3655a f33190z = new C3655a(2097152, (CharSequence) null, InterfaceC0785b0.C0793h.class);

        /* renamed from: a */
        public final Object f33191a;

        /* renamed from: b */
        public final int f33192b;

        /* renamed from: c */
        public final Class<? extends InterfaceC0785b0.AbstractC0786a> f33193c;

        /* renamed from: d */
        public final InterfaceC0785b0 f33194d;

        static {
            int i = Build.VERSION.SDK_INT;
            f33149A = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            f33150B = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, InterfaceC0785b0.C0790e.class);
            f33151C = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f33152D = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f33153E = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f33154F = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f33155G = new C3655a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f33156H = new C3655a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f33157I = new C3655a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f33158J = new C3655a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f33159K = new C3655a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f33160L = new C3655a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, InterfaceC0785b0.C0791f.class);
            f33161M = new C3655a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, InterfaceC0785b0.C0789d.class);
            f33162N = new C3655a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            f33163O = new C3655a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            f33164P = new C3655a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            f33165Q = new C3655a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
            f33166R = new C3655a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, 16908373, null, null, null);
            f33167S = new C3655a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, 16908374, null, null, null);
            f33168T = new C3655a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, 16908375, null, null, null);
        }

        public C3655a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public C3655a(int i, CharSequence charSequence, InterfaceC0785b0 interfaceC0785b0) {
            this(null, i, charSequence, interfaceC0785b0, null);
        }

        public C3655a(int i, CharSequence charSequence, Class<? extends InterfaceC0785b0.AbstractC0786a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public C3655a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public C3655a(Object obj, int i, CharSequence charSequence, InterfaceC0785b0 interfaceC0785b0, Class<? extends InterfaceC0785b0.AbstractC0786a> cls) {
            this.f33192b = i;
            this.f33194d = interfaceC0785b0;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f33191a = obj;
            this.f33193c = cls;
        }

        /* renamed from: a */
        public C3655a m4286a(CharSequence charSequence, InterfaceC0785b0 interfaceC0785b0) {
            return new C3655a(null, this.f33192b, charSequence, interfaceC0785b0, this.f33193c);
        }

        /* renamed from: b */
        public int m4285b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f33191a).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m4284c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f33191a).getLabel();
            }
            return null;
        }

        /* renamed from: d */
        public boolean m4283d(View view, Bundle bundle) {
            InterfaceC0785b0.AbstractC0786a newInstance;
            if (this.f33194d != null) {
                InterfaceC0785b0.AbstractC0786a abstractC0786a = null;
                Class<? extends InterfaceC0785b0.AbstractC0786a> cls = this.f33193c;
                if (cls != null) {
                    try {
                        newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception unused) {
                    }
                    try {
                        newInstance.m26564a(bundle);
                        abstractC0786a = newInstance;
                    } catch (Exception unused2) {
                        abstractC0786a = newInstance;
                        Class<? extends InterfaceC0785b0.AbstractC0786a> cls2 = this.f33193c;
                        String name = cls2 == null ? "null" : cls2.getName();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                        sb.append(name);
                        return this.f33194d.mo864a(view, abstractC0786a);
                    }
                }
                return this.f33194d.mo864a(view, abstractC0786a);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C3655a)) {
                Object obj2 = this.f33191a;
                Object obj3 = ((C3655a) obj).f33191a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f33191a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: com.daaw.y$b */
    /* loaded from: classes.dex */
    public static class C3656b {

        /* renamed from: a */
        public final Object f33195a;

        public C3656b(Object obj) {
            this.f33195a = obj;
        }

        /* renamed from: a */
        public static C3656b m4282a(int i, int i2, boolean z) {
            return new C3656b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* renamed from: b */
        public static C3656b m4281b(int i, int i2, boolean z, int i3) {
            return Build.VERSION.SDK_INT >= 21 ? new C3656b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : new C3656b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }
    }

    /* renamed from: com.daaw.y$c */
    /* loaded from: classes.dex */
    public static class C3657c {

        /* renamed from: a */
        public final Object f33196a;

        public C3657c(Object obj) {
            this.f33196a = obj;
        }

        /* renamed from: a */
        public static C3657c m4280a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return Build.VERSION.SDK_INT >= 21 ? new C3657c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : new C3657c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }
    }

    public C3654y(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f33146a = accessibilityNodeInfo;
    }

    /* renamed from: D0 */
    public static C3654y m4361D0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C3654y(accessibilityNodeInfo);
    }

    /* renamed from: O */
    public static C3654y m4350O() {
        return m4361D0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: P */
    public static C3654y m4349P(View view) {
        return m4361D0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: Q */
    public static C3654y m4348Q(C3654y c3654y) {
        return m4361D0(AccessibilityNodeInfo.obtain(c3654y.f33146a));
    }

    /* renamed from: j */
    public static String m4320j(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV /* 1024 */:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i) {
                                            case 16908372:
                                                return "ACTION_IME_ENTER";
                                            case 16908373:
                                                return "ACTION_DRAG_START";
                                            case 16908374:
                                                return "ACTION_DRAG_DROP";
                                            case 16908375:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: q */
    public static ClickableSpan[] m4306q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: A */
    public final int m4368A(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f33145d;
        f33145d = i2 + 1;
        return i2;
    }

    /* renamed from: A0 */
    public void m4367A0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f33146a.setTraversalAfter(view);
        }
    }

    /* renamed from: B */
    public boolean m4366B() {
        return this.f33146a.isAccessibilityFocused();
    }

    /* renamed from: B0 */
    public void m4365B0(boolean z) {
        this.f33146a.setVisibleToUser(z);
    }

    /* renamed from: C */
    public boolean m4364C() {
        return this.f33146a.isCheckable();
    }

    /* renamed from: C0 */
    public AccessibilityNodeInfo m4363C0() {
        return this.f33146a;
    }

    /* renamed from: D */
    public boolean m4362D() {
        return this.f33146a.isChecked();
    }

    /* renamed from: E */
    public boolean m4360E() {
        return this.f33146a.isClickable();
    }

    /* renamed from: F */
    public boolean m4359F() {
        return this.f33146a.isEnabled();
    }

    /* renamed from: G */
    public boolean m4358G() {
        return this.f33146a.isFocusable();
    }

    /* renamed from: H */
    public boolean m4357H() {
        return this.f33146a.isFocused();
    }

    /* renamed from: I */
    public boolean m4356I() {
        return this.f33146a.isLongClickable();
    }

    /* renamed from: J */
    public boolean m4355J() {
        return this.f33146a.isPassword();
    }

    /* renamed from: K */
    public boolean m4354K() {
        return this.f33146a.isScrollable();
    }

    /* renamed from: L */
    public boolean m4353L() {
        return this.f33146a.isSelected();
    }

    /* renamed from: M */
    public boolean m4352M() {
        return Build.VERSION.SDK_INT >= 26 ? this.f33146a.isShowingHintText() : m4316l(4);
    }

    /* renamed from: N */
    public boolean m4351N() {
        return this.f33146a.isVisibleToUser();
    }

    /* renamed from: R */
    public boolean m4347R(int i, Bundle bundle) {
        return this.f33146a.performAction(i, bundle);
    }

    /* renamed from: S */
    public void m4346S() {
        this.f33146a.recycle();
    }

    /* renamed from: T */
    public boolean m4345T(C3655a c3655a) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f33146a.removeAction((AccessibilityNodeInfo.AccessibilityAction) c3655a.f33191a);
        }
        return false;
    }

    /* renamed from: U */
    public final void m4344U(View view) {
        SparseArray<WeakReference<ClickableSpan>> m4296v = m4296v(view);
        if (m4296v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < m4296v.size(); i++) {
                if (m4296v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                m4296v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    public void m4343V(boolean z) {
        this.f33146a.setAccessibilityFocused(z);
    }

    /* renamed from: W */
    public final void m4342W(int i, boolean z) {
        Bundle m4302s = m4302s();
        if (m4302s != null) {
            int i2 = m4302s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            m4302s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    /* renamed from: X */
    public void m4341X(Rect rect) {
        this.f33146a.setBoundsInParent(rect);
    }

    /* renamed from: Y */
    public void m4340Y(Rect rect) {
        this.f33146a.setBoundsInScreen(rect);
    }

    /* renamed from: Z */
    public void m4339Z(boolean z) {
        this.f33146a.setCheckable(z);
    }

    /* renamed from: a */
    public void m4338a(int i) {
        this.f33146a.addAction(i);
    }

    /* renamed from: a0 */
    public void m4337a0(boolean z) {
        this.f33146a.setChecked(z);
    }

    /* renamed from: b */
    public void m4336b(C3655a c3655a) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f33146a.addAction((AccessibilityNodeInfo.AccessibilityAction) c3655a.f33191a);
        }
    }

    /* renamed from: b0 */
    public void m4335b0(CharSequence charSequence) {
        this.f33146a.setClassName(charSequence);
    }

    /* renamed from: c */
    public void m4334c(View view) {
        this.f33146a.addChild(view);
    }

    /* renamed from: c0 */
    public void m4333c0(boolean z) {
        this.f33146a.setClickable(z);
    }

    /* renamed from: d */
    public void m4332d(View view, int i) {
        this.f33146a.addChild(view, i);
    }

    /* renamed from: d0 */
    public void m4331d0(Object obj) {
        this.f33146a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C3656b) obj).f33195a);
    }

    /* renamed from: e */
    public final void m4330e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: e0 */
    public void m4329e0(Object obj) {
        this.f33146a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C3657c) obj).f33196a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3654y)) {
            C3654y c3654y = (C3654y) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f33146a;
            if (accessibilityNodeInfo == null) {
                if (c3654y.f33146a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c3654y.f33146a)) {
                return false;
            }
            return this.f33148c == c3654y.f33148c && this.f33147b == c3654y.f33147b;
        }
        return false;
    }

    /* renamed from: f */
    public void m4328f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m4326g();
            m4344U(view);
            ClickableSpan[] m4306q = m4306q(charSequence);
            if (m4306q == null || m4306q.length <= 0) {
                return;
            }
            m4302s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", q11.accessibility_action_clickable_span);
            SparseArray<WeakReference<ClickableSpan>> m4300t = m4300t(view);
            for (int i = 0; i < m4306q.length; i++) {
                int m4368A = m4368A(m4306q[i], m4300t);
                m4300t.put(m4368A, new WeakReference<>(m4306q[i]));
                m4330e(m4306q[i], (Spanned) charSequence, m4368A);
            }
        }
    }

    /* renamed from: f0 */
    public void m4327f0(CharSequence charSequence) {
        this.f33146a.setContentDescription(charSequence);
    }

    /* renamed from: g */
    public final void m4326g() {
        this.f33146a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f33146a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f33146a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f33146a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g0 */
    public void m4325g0(boolean z) {
        this.f33146a.setEnabled(z);
    }

    /* renamed from: h */
    public final List<Integer> m4324h(String str) {
        ArrayList<Integer> integerArrayList = this.f33146a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f33146a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: h0 */
    public void m4323h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f33146a.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33146a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C3655a> m4322i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f33146a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new C3655a(actionList.get(i)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: i0 */
    public void m4321i0(boolean z) {
        this.f33146a.setFocusable(z);
    }

    /* renamed from: j0 */
    public void m4319j0(boolean z) {
        this.f33146a.setFocused(z);
    }

    /* renamed from: k */
    public int m4318k() {
        return this.f33146a.getActions();
    }

    /* renamed from: k0 */
    public void m4317k0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33146a.setHeading(z);
        } else {
            m4342W(2, z);
        }
    }

    /* renamed from: l */
    public final boolean m4316l(int i) {
        Bundle m4302s = m4302s();
        return m4302s != null && (m4302s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: l0 */
    public void m4315l0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33146a.setHintText(charSequence);
        } else {
            this.f33146a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void m4314m(Rect rect) {
        this.f33146a.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void m4313m0(boolean z) {
        this.f33146a.setLongClickable(z);
    }

    /* renamed from: n */
    public void m4312n(Rect rect) {
        this.f33146a.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void m4311n0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f33146a.setMaxTextLength(i);
        }
    }

    /* renamed from: o */
    public int m4310o() {
        return this.f33146a.getChildCount();
    }

    /* renamed from: o0 */
    public void m4309o0(CharSequence charSequence) {
        this.f33146a.setPackageName(charSequence);
    }

    /* renamed from: p */
    public CharSequence m4308p() {
        return this.f33146a.getClassName();
    }

    /* renamed from: p0 */
    public void m4307p0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33146a.setPaneTitle(charSequence);
        } else {
            this.f33146a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: q0 */
    public void m4305q0(View view) {
        this.f33147b = -1;
        this.f33146a.setParent(view);
    }

    /* renamed from: r */
    public CharSequence m4304r() {
        return this.f33146a.getContentDescription();
    }

    /* renamed from: r0 */
    public void m4303r0(View view, int i) {
        this.f33147b = i;
        this.f33146a.setParent(view, i);
    }

    /* renamed from: s */
    public Bundle m4302s() {
        return this.f33146a.getExtras();
    }

    /* renamed from: s0 */
    public void m4301s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f33146a.setScreenReaderFocusable(z);
        } else {
            m4342W(1, z);
        }
    }

    /* renamed from: t */
    public final SparseArray<WeakReference<ClickableSpan>> m4300t(View view) {
        SparseArray<WeakReference<ClickableSpan>> m4296v = m4296v(view);
        if (m4296v == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(q11.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m4296v;
    }

    /* renamed from: t0 */
    public void m4299t0(boolean z) {
        this.f33146a.setScrollable(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m4314m(rect);
        sb.append("; boundsInParent: " + rect);
        m4312n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m4298u());
        sb.append("; className: ");
        sb.append(m4308p());
        sb.append("; text: ");
        sb.append(m4294w());
        sb.append("; contentDescription: ");
        sb.append(m4304r());
        sb.append("; viewId: ");
        sb.append(m4290y());
        sb.append("; uniqueId: ");
        sb.append(m4292x());
        sb.append("; checkable: ");
        sb.append(m4364C());
        sb.append("; checked: ");
        sb.append(m4362D());
        sb.append("; focusable: ");
        sb.append(m4358G());
        sb.append("; focused: ");
        sb.append(m4357H());
        sb.append("; selected: ");
        sb.append(m4353L());
        sb.append("; clickable: ");
        sb.append(m4360E());
        sb.append("; longClickable: ");
        sb.append(m4356I());
        sb.append("; enabled: ");
        sb.append(m4359F());
        sb.append("; password: ");
        sb.append(m4355J());
        sb.append("; scrollable: " + m4354K());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C3655a> m4322i = m4322i();
            for (int i = 0; i < m4322i.size(); i++) {
                C3655a c3655a = m4322i.get(i);
                String m4320j = m4320j(c3655a.m4285b());
                if (m4320j.equals("ACTION_UNKNOWN") && c3655a.m4284c() != null) {
                    m4320j = c3655a.m4284c().toString();
                }
                sb.append(m4320j);
                if (i != m4322i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int m4318k = m4318k();
            while (m4318k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m4318k);
                m4318k &= numberOfTrailingZeros ^ (-1);
                sb.append(m4320j(numberOfTrailingZeros));
                if (m4318k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence m4298u() {
        return this.f33146a.getPackageName();
    }

    /* renamed from: u0 */
    public void m4297u0(boolean z) {
        this.f33146a.setSelected(z);
    }

    /* renamed from: v */
    public final SparseArray<WeakReference<ClickableSpan>> m4296v(View view) {
        return (SparseArray) view.getTag(q11.tag_accessibility_clickable_spans);
    }

    /* renamed from: v0 */
    public void m4295v0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33146a.setShowingHintText(z);
        } else {
            m4342W(4, z);
        }
    }

    /* renamed from: w */
    public CharSequence m4294w() {
        if (m4288z()) {
            List<Integer> m4324h = m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> m4324h2 = m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> m4324h3 = m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> m4324h4 = m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f33146a.getText(), 0, this.f33146a.getText().length()));
            for (int i = 0; i < m4324h.size(); i++) {
                spannableString.setSpan(new C3273v(m4324h4.get(i).intValue(), this, m4302s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), m4324h.get(i).intValue(), m4324h2.get(i).intValue(), m4324h3.get(i).intValue());
            }
            return spannableString;
        }
        return this.f33146a.getText();
    }

    /* renamed from: w0 */
    public void m4293w0(View view) {
        this.f33148c = -1;
        this.f33146a.setSource(view);
    }

    /* renamed from: x */
    public String m4292x() {
        return Build.VERSION.SDK_INT >= 33 ? this.f33146a.getUniqueId() : this.f33146a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* renamed from: x0 */
    public void m4291x0(View view, int i) {
        this.f33148c = i;
        this.f33146a.setSource(view, i);
    }

    /* renamed from: y */
    public String m4290y() {
        return this.f33146a.getViewIdResourceName();
    }

    /* renamed from: y0 */
    public void m4289y0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f33146a.setStateDescription(charSequence);
        } else {
            this.f33146a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: z */
    public final boolean m4288z() {
        return !m4324h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z0 */
    public void m4287z0(CharSequence charSequence) {
        this.f33146a.setText(charSequence);
    }
}
