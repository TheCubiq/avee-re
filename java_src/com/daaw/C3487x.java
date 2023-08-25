package com.daaw;

import android.view.accessibility.AccessibilityEvent;
/* renamed from: com.daaw.x */
/* loaded from: classes.dex */
public final class C3487x {

    /* renamed from: com.daaw.x$a */
    /* loaded from: classes.dex */
    public static class C3488a {
        /* renamed from: a */
        public static int m5674a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        public static void m5673b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m5676a(AccessibilityEvent accessibilityEvent) {
        return C3488a.m5674a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m5675b(AccessibilityEvent accessibilityEvent, int i) {
        C3488a.m5673b(accessibilityEvent, i);
    }
}
