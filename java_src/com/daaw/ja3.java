package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ja3 {

    /* renamed from: a */
    public MotionEvent f14607a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b */
    public MotionEvent f14608b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c */
    public final Context f14609c;

    /* renamed from: d */
    public final ScheduledExecutorService f14610d;

    /* renamed from: e */
    public final to6 f14611e;

    /* renamed from: f */
    public final la3 f14612f;

    public ja3(Context context, ScheduledExecutorService scheduledExecutorService, la3 la3Var, to6 to6Var, byte[] bArr) {
        this.f14609c = context;
        this.f14610d = scheduledExecutorService;
        this.f14612f = la3Var;
        this.f14611e = to6Var;
    }

    /* renamed from: a */
    public final f77 m18677a() {
        return (j67) s67.m10628o(j67.m18784D(s67.m10634i(null)), ((Long) za3.f34683c.m16137e()).longValue(), TimeUnit.MILLISECONDS, this.f14610d);
    }

    /* renamed from: b */
    public final void m18676b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f14607a.getEventTime()) {
            this.f14607a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f14608b.getEventTime()) {
        } else {
            this.f14608b = MotionEvent.obtain(motionEvent);
        }
    }
}
