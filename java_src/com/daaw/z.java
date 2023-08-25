package com.daaw;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class z {
    public final Object a;

    /* loaded from: classes.dex */
    public static class a extends AccessibilityNodeProvider {
        public final z a;

        public a(z zVar) {
            this.a = zVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            y b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.C0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<y> c = this.a.c(str, i);
            if (c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(c.get(i2).C0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.f(i, i2, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        public b(z zVar) {
            super(zVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            y d = this.a.d(i);
            if (d == null) {
                return null;
            }
            return d.C0();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b {
        public c(z zVar) {
            super(zVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.a(i, y.D0(accessibilityNodeInfo), str, bundle);
        }
    }

    public z() {
        this.a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public z(Object obj) {
        this.a = obj;
    }

    public void a(int i, y yVar, String str, Bundle bundle) {
    }

    public y b(int i) {
        return null;
    }

    public List<y> c(String str, int i) {
        return null;
    }

    public y d(int i) {
        return null;
    }

    public Object e() {
        return this.a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }
}
