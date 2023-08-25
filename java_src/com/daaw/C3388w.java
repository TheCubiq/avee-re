package com.daaw;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.daaw.C3654y;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.w */
/* loaded from: classes.dex */
public class C3388w {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f30737c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f30738a;

    /* renamed from: b */
    public final View.AccessibilityDelegate f30739b;

    /* renamed from: com.daaw.w$a */
    /* loaded from: classes.dex */
    public static final class C3389a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C3388w f30740a;

        public C3389a(C3388w c3388w) {
            this.f30740a = c3388w;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f30740a.mo6634a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C3786z mo3048b = this.f30740a.mo3048b(view);
            if (mo3048b != null) {
                return (AccessibilityNodeProvider) mo3048b.m3013e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f30740a.mo354f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C3654y m4361D0 = C3654y.m4361D0(accessibilityNodeInfo);
            m4361D0.m4301s0(xs1.m4739Y(view));
            m4361D0.m4317k0(xs1.m4744T(view));
            m4361D0.m4307p0(xs1.m4703r(view));
            m4361D0.m4289y0(xs1.m4752M(view));
            this.f30740a.mo161g(view, m4361D0);
            m4361D0.m4328f(accessibilityNodeInfo.getText(), view);
            List<C3654y.C3655a> m6633c = C3388w.m6633c(view);
            for (int i = 0; i < m6633c.size(); i++) {
                m4361D0.m4336b(m6633c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f30740a.mo191h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f30740a.mo6630i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f30740a.mo6629j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f30740a.mo6627l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f30740a.mo6626m(view, accessibilityEvent);
        }
    }

    /* renamed from: com.daaw.w$b */
    /* loaded from: classes.dex */
    public static class C3390b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m6625a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m6624b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C3388w() {
        this(f30737c);
    }

    public C3388w(View.AccessibilityDelegate accessibilityDelegate) {
        this.f30738a = accessibilityDelegate;
        this.f30739b = new C3389a(this);
    }

    /* renamed from: c */
    public static List<C3654y.C3655a> m6633c(View view) {
        List<C3654y.C3655a> list = (List) view.getTag(q11.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public boolean mo6634a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f30738a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C3786z mo3048b(View view) {
        AccessibilityNodeProvider m6625a = C3390b.m6625a(this.f30738a, view);
        if (m6625a != null) {
            return new C3786z(m6625a);
        }
        return null;
    }

    /* renamed from: d */
    public View.AccessibilityDelegate m6632d() {
        return this.f30739b;
    }

    /* renamed from: e */
    public final boolean m6631e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m4306q = C3654y.m4306q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m4306q != null && i < m4306q.length; i++) {
                if (clickableSpan.equals(m4306q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
        this.f30738a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo161g(View view, C3654y c3654y) {
        this.f30738a.onInitializeAccessibilityNodeInfo(view, c3654y.m4363C0());
    }

    /* renamed from: h */
    public void mo191h(View view, AccessibilityEvent accessibilityEvent) {
        this.f30738a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo6630i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f30738a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo6629j(View view, int i, Bundle bundle) {
        List<C3654y.C3655a> m6633c = m6633c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m6633c.size()) {
                break;
            }
            C3654y.C3655a c3655a = m6633c.get(i2);
            if (c3655a.m4285b() == i) {
                z = c3655a.m4283d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C3390b.m6624b(this.f30738a, view, i, bundle);
        }
        return (z || i != q11.accessibility_action_clickable_span || bundle == null) ? z : m6628k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: k */
    public final boolean m6628k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(q11.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (m6631e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void mo6627l(View view, int i) {
        this.f30738a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo6626m(View view, AccessibilityEvent accessibilityEvent) {
        this.f30738a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
