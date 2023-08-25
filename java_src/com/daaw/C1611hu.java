package com.daaw;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;
/* renamed from: com.daaw.hu */
/* loaded from: classes.dex */
public final class C1611hu {

    /* renamed from: a */
    public final DisplayCutout f12928a;

    /* renamed from: com.daaw.hu$a */
    /* loaded from: classes.dex */
    public static class C1612a {
        /* renamed from: a */
        public static DisplayCutout m20424a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        public static List<Rect> m20423b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        public static int m20422c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        public static int m20421d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        public static int m20420e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        public static int m20419f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C1611hu(DisplayCutout displayCutout) {
        this.f12928a = displayCutout;
    }

    /* renamed from: e */
    public static C1611hu m20425e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1611hu(displayCutout);
    }

    /* renamed from: a */
    public int m20429a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1612a.m20422c(this.f12928a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m20428b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1612a.m20421d(this.f12928a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m20427c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1612a.m20420e(this.f12928a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m20426d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1612a.m20419f(this.f12928a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1611hu.class != obj.getClass()) {
            return false;
        }
        return pt0.m13160a(this.f12928a, ((C1611hu) obj).f12928a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f12928a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f12928a + "}";
    }
}
