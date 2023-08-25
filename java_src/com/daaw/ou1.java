package com.daaw;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
/* loaded from: classes2.dex */
public class ou1 {

    /* renamed from: a */
    public static final int[] f22019a = {16843848};

    /* renamed from: a */
    public static void m13929a(View view, float f) {
        int integer = view.getResources().getInteger(y11.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842766, w01.state_liftable, -w01.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
