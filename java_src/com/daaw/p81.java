package com.daaw;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class p81 {
    public ViewGroup a;
    public Runnable b;

    public static p81 b(ViewGroup viewGroup) {
        return (p81) viewGroup.getTag(v11.transition_current_scene);
    }

    public static void c(ViewGroup viewGroup, p81 p81Var) {
        viewGroup.setTag(v11.transition_current_scene, p81Var);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) != this || (runnable = this.b) == null) {
            return;
        }
        runnable.run();
    }
}
