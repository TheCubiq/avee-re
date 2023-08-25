package com.daaw;

import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class em1 {

    /* renamed from: com.daaw.em1$a */
    /* loaded from: classes.dex */
    public static class C1201a {
        /* renamed from: a */
        public static void m23374a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m23375a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C1201a.m23374a(view, charSequence);
        } else {
            hm1.m20627h(view, charSequence);
        }
    }
}
