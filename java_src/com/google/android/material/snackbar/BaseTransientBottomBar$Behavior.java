package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.C0613ab;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k */
    public final C0613ab f37656k = new C0613ab(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: E */
    public boolean mo327E(View view) {
        return this.f37656k.m27543a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0194c
    /* renamed from: k */
    public boolean mo326k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f37656k.m27542b(coordinatorLayout, view, motionEvent);
        return super.mo326k(coordinatorLayout, view, motionEvent);
    }
}
