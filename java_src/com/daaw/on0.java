package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2.dex */
public class on0 {
    public static ml a(int i) {
        return i != 0 ? i != 1 ? b() : new qo() : new j61();
    }

    public static ml b() {
        return new j61();
    }

    public static rv c() {
        return new rv();
    }

    public static void d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof nn0) {
            ((nn0) background).V(f);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof nn0) {
            f(view, (nn0) background);
        }
    }

    public static void f(View view, nn0 nn0Var) {
        if (nn0Var.O()) {
            nn0Var.Z(fu1.c(view));
        }
    }
}
