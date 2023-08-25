package com.daaw;

import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2.dex */
public class on0 {
    /* renamed from: a */
    public static C2193ml m14145a(int i) {
        return i != 0 ? i != 1 ? m14144b() : new C2743qo() : new j61();
    }

    /* renamed from: b */
    public static C2193ml m14144b() {
        return new j61();
    }

    /* renamed from: c */
    public static C2889rv m14143c() {
        return new C2889rv();
    }

    /* renamed from: d */
    public static void m14142d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof nn0) {
            ((nn0) background).m14998V(f);
        }
    }

    /* renamed from: e */
    public static void m14141e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof nn0) {
            m14140f(view, (nn0) background);
        }
    }

    /* renamed from: f */
    public static void m14140f(View view, nn0 nn0Var) {
        if (nn0Var.m15005O()) {
            nn0Var.m14994Z(fu1.m22260c(view));
        }
    }
}
