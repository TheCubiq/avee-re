package com.daaw;

import android.view.accessibility.AccessibilityEvent;
/* loaded from: classes.dex */
public final class x {

    /* loaded from: classes.dex */
    public static class a {
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        public static void b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        a.b(accessibilityEvent, i);
    }
}
