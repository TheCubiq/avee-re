package com.daaw.avee;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
/* loaded from: classes.dex */
public class CustomViewPager extends ViewPager {

    /* renamed from: A0 */
    public float f3696A0;

    /* renamed from: B0 */
    public InterfaceC0678a f3697B0;

    /* renamed from: C0 */
    public boolean f3698C0;

    /* renamed from: D0 */
    public float f3699D0;

    /* renamed from: E0 */
    public float f3700E0;

    /* renamed from: F0 */
    public float f3701F0;

    /* renamed from: com.daaw.avee.CustomViewPager$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0678a {
        /* renamed from: a */
        void mo26894a(float f);

        /* renamed from: b */
        void mo26893b();

        /* renamed from: c */
        void mo26892c();
    }

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3698C0 = false;
        this.f3699D0 = 0.0f;
        this.f3700E0 = 0.0f;
        this.f3701F0 = 0.0f;
        this.f3699D0 = context.getResources().getDimension(R.dimen.out_of_bound_swipe_dist);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        if ((action & 255) == 0) {
            this.f3696A0 = x;
            this.f3698C0 = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r5.f3698C0 != false) goto L28;
     */
    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && !this.f3698C0) {
                    if (getCurrentItem() == 0) {
                        f2 = x - this.f3696A0;
                    } else if (getCurrentItem() == getAdapter().mo17418c() - 1) {
                        f2 = this.f3696A0 - x;
                    } else {
                        f = 0.0f;
                        float max = Math.max(this.f3701F0, f);
                        this.f3701F0 = max;
                        this.f3697B0.mo26894a(max);
                        if (x - this.f3696A0 <= this.f3699D0 && getCurrentItem() == 0) {
                            this.f3701F0 = 0.0f;
                            this.f3697B0.mo26894a(0.0f);
                            this.f3697B0.mo26893b();
                        } else if (this.f3696A0 - x > this.f3699D0 && getCurrentItem() == getAdapter().mo17418c() - 1) {
                            this.f3701F0 = 0.0f;
                            this.f3697B0.mo26894a(0.0f);
                            this.f3697B0.mo26892c();
                        }
                        this.f3698C0 = true;
                    }
                    f = f2 / this.f3699D0;
                    float max2 = Math.max(this.f3701F0, f);
                    this.f3701F0 = max2;
                    this.f3697B0.mo26894a(max2);
                    if (x - this.f3696A0 <= this.f3699D0) {
                    }
                    if (this.f3696A0 - x > this.f3699D0) {
                        this.f3701F0 = 0.0f;
                        this.f3697B0.mo26894a(0.0f);
                        this.f3697B0.mo26892c();
                        this.f3698C0 = true;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        this.f3696A0 = x;
        this.f3698C0 = false;
        this.f3700E0 = 0.0f;
        this.f3701F0 = 0.0f;
        this.f3697B0.mo26894a(0.0f);
        return super.onTouchEvent(motionEvent);
    }

    public void setOnSwipeOutListener(InterfaceC0678a interfaceC0678a) {
        this.f3697B0 = interfaceC0678a;
    }
}
