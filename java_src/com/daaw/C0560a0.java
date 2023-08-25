package com.daaw;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
/* renamed from: com.daaw.a0 */
/* loaded from: classes.dex */
public class C0560a0 {

    /* renamed from: com.daaw.a0$a */
    /* loaded from: classes.dex */
    public static class C0561a {
        /* renamed from: a */
        public static int m27781a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        public static int m27780b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        public static void m27779c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        public static void m27778d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: com.daaw.a0$b */
    /* loaded from: classes.dex */
    public static class C0562b {
        /* renamed from: a */
        public static void m27777a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m27784a(AccessibilityRecord accessibilityRecord, int i) {
        C0561a.m27779c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m27783b(AccessibilityRecord accessibilityRecord, int i) {
        C0561a.m27778d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m27782c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C0562b.m27777a(accessibilityRecord, view, i);
    }
}
