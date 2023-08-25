package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.z */
/* loaded from: classes.dex */
public class C3786z {

    /* renamed from: a */
    public final Object f34300a;

    /* renamed from: com.daaw.z$a */
    /* loaded from: classes.dex */
    public static class C3787a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C3786z f34301a;

        public C3787a(C3786z c3786z) {
            this.f34301a = c3786z;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C3654y mo3016b = this.f34301a.mo3016b(i);
            if (mo3016b == null) {
                return null;
            }
            return mo3016b.m4363C0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C3654y> m3015c = this.f34301a.m3015c(str, i);
            if (m3015c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m3015c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m3015c.get(i2).m4363C0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f34301a.mo3012f(i, i2, bundle);
        }
    }

    /* renamed from: com.daaw.z$b */
    /* loaded from: classes.dex */
    public static class C3788b extends C3787a {
        public C3788b(C3786z c3786z) {
            super(c3786z);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C3654y mo3014d = this.f34301a.mo3014d(i);
            if (mo3014d == null) {
                return null;
            }
            return mo3014d.m4363C0();
        }
    }

    /* renamed from: com.daaw.z$c */
    /* loaded from: classes.dex */
    public static class C3789c extends C3788b {
        public C3789c(C3786z c3786z) {
            super(c3786z);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f34301a.m3017a(i, C3654y.m4361D0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C3786z() {
        this.f34300a = Build.VERSION.SDK_INT >= 26 ? new C3789c(this) : new C3788b(this);
    }

    public C3786z(Object obj) {
        this.f34300a = obj;
    }

    /* renamed from: a */
    public void m3017a(int i, C3654y c3654y, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C3654y mo3016b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C3654y> m3015c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C3654y mo3014d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m3013e() {
        return this.f34300a;
    }

    /* renamed from: f */
    public boolean mo3012f(int i, int i2, Bundle bundle) {
        return false;
    }
}
