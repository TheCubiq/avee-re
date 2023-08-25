package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.ae1;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* loaded from: classes2.dex */
public class ab {
    public ae1.b a;

    public ab(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.K(0.1f);
        swipeDismissBehavior.J(0.6f);
        swipeDismissBehavior.L(0);
    }

    public boolean a(View view) {
        return view instanceof db;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                ae1.b().e(this.a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            ae1.b().f(this.a);
        }
    }
}
