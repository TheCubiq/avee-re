package com.daaw;

import android.os.Build;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public final class bt1 {

    /* renamed from: com.daaw.bt1$a */
    /* loaded from: classes.dex */
    public static class C0886a {
        /* renamed from: a */
        public static int m25837a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        /* renamed from: b */
        public static boolean m25836b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        /* renamed from: c */
        public static void m25835c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* renamed from: a */
    public static boolean m25838a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return C0886a.m25836b(viewGroup);
        }
        Boolean bool = (Boolean) viewGroup.getTag(q11.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && xs1.m4750N(viewGroup) == null) ? false : true;
    }
}
