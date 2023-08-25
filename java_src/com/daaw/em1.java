package com.daaw;

import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class em1 {

    /* loaded from: classes.dex */
    public static class a {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(view, charSequence);
        } else {
            hm1.h(view, charSequence);
        }
    }
}
