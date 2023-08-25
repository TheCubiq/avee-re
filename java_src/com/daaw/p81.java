package com.daaw;

import android.view.ViewGroup;
/* loaded from: classes.dex */
public class p81 {

    /* renamed from: a */
    public ViewGroup f22692a;

    /* renamed from: b */
    public Runnable f22693b;

    /* renamed from: b */
    public static p81 m13594b(ViewGroup viewGroup) {
        return (p81) viewGroup.getTag(v11.transition_current_scene);
    }

    /* renamed from: c */
    public static void m13593c(ViewGroup viewGroup, p81 p81Var) {
        viewGroup.setTag(v11.transition_current_scene, p81Var);
    }

    /* renamed from: a */
    public void m13595a() {
        Runnable runnable;
        if (m13594b(this.f22692a) != this || (runnable = this.f22693b) == null) {
            return;
        }
        runnable.run();
    }
}
