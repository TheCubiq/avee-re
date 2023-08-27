package com.daaw.avee.comp.Common.View;

import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class SimpleViewProgressBar {
    public SimpleViewProgressBar(View view) {
    }

    public static void SetProgress(View view, View view2, float f, float f2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.width = (int) ((f2 / f) * layoutParams.width);
        view2.setLayoutParams(layoutParams2);
    }
}
