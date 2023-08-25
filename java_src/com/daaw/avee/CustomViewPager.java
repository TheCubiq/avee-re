package com.daaw.avee;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes.dex */
public class CustomViewPager extends ViewPager {
    public float A0;
    public a B0;
    public boolean C0;
    public float D0;
    public float E0;
    public float F0;

    /* loaded from: classes.dex */
    public interface a {
        void a(float f);

        void b();

        void c();
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = false;
        this.D0 = 0.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.D0 = context.getResources().getDimension(R.dimen.out_of_bound_swipe_dist);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        if ((action & 255) == 0) {
            this.A0 = x;
            this.C0 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r5.C0 != false) goto L28;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            float r1 = r6.getX()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = 0
            if (r0 == 0) goto L93
            r3 = 1
            if (r0 == r3) goto L8e
            r4 = 2
            if (r0 == r4) goto L15
            goto La1
        L15:
            boolean r0 = r5.C0
            if (r0 == 0) goto L1b
            goto La1
        L1b:
            int r0 = r5.getCurrentItem()
            if (r0 != 0) goto L29
            float r0 = r5.A0
            float r0 = r1 - r0
        L25:
            float r4 = r5.D0
            float r0 = r0 / r4
            goto L3d
        L29:
            int r0 = r5.getCurrentItem()
            com.daaw.kv0 r4 = r5.getAdapter()
            int r4 = r4.c()
            int r4 = r4 - r3
            if (r0 != r4) goto L3c
            float r0 = r5.A0
            float r0 = r0 - r1
            goto L25
        L3c:
            r0 = 0
        L3d:
            float r4 = r5.F0
            float r0 = java.lang.Math.max(r4, r0)
            r5.F0 = r0
            com.daaw.avee.CustomViewPager$a r4 = r5.B0
            r4.a(r0)
            float r0 = r5.A0
            float r0 = r1 - r0
            float r4 = r5.D0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L69
            int r0 = r5.getCurrentItem()
            if (r0 != 0) goto L69
            r5.F0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.B0
            r0.a(r2)
            com.daaw.avee.CustomViewPager$a r0 = r5.B0
            r0.b()
        L66:
            r5.C0 = r3
            goto La1
        L69:
            float r0 = r5.A0
            float r0 = r0 - r1
            float r1 = r5.D0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La1
            int r0 = r5.getCurrentItem()
            com.daaw.kv0 r1 = r5.getAdapter()
            int r1 = r1.c()
            int r1 = r1 - r3
            if (r0 != r1) goto La1
            r5.F0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.B0
            r0.a(r2)
            com.daaw.avee.CustomViewPager$a r0 = r5.B0
            r0.c()
            goto L66
        L8e:
            boolean r0 = r5.C0
            if (r0 == 0) goto L9a
            goto La1
        L93:
            r5.A0 = r1
            r0 = 0
            r5.C0 = r0
            r5.E0 = r2
        L9a:
            r5.F0 = r2
            com.daaw.avee.CustomViewPager$a r0 = r5.B0
            r0.a(r2)
        La1:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.CustomViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnSwipeOutListener(a aVar) {
        this.B0 = aVar;
    }
}
