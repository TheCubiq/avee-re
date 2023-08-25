package com.daaw;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.ae1;
import com.google.android.material.behavior.SwipeDismissBehavior;
/* renamed from: com.daaw.ab */
/* loaded from: classes2.dex */
public class C0613ab {

    /* renamed from: a */
    public ae1.InterfaceC0618b f3030a;

    public C0613ab(SwipeDismissBehavior<?> swipeDismissBehavior) {
        swipeDismissBehavior.m984K(0.1f);
        swipeDismissBehavior.m985J(0.6f);
        swipeDismissBehavior.m983L(0);
    }

    /* renamed from: a */
    public boolean m27543a(View view) {
        return view instanceof C1070db;
    }

    /* renamed from: b */
    public void m27542b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.m29823B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                ae1.m27514b().m27511e(this.f3030a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            ae1.m27514b().m27510f(this.f3030a);
        }
    }
}
