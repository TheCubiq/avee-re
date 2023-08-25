package com.daaw;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class m14 {
    public static final void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new n14(view, onGlobalLayoutListener).d();
    }

    public static final void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new o14(view, onScrollChangedListener).d();
    }
}
