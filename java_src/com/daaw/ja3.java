package com.daaw;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ja3 {
    public MotionEvent a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    public MotionEvent b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    public final Context c;
    public final ScheduledExecutorService d;
    public final to6 e;
    public final la3 f;

    public ja3(Context context, ScheduledExecutorService scheduledExecutorService, la3 la3Var, to6 to6Var, byte[] bArr) {
        this.c = context;
        this.d = scheduledExecutorService;
        this.f = la3Var;
        this.e = to6Var;
    }

    public final f77 a() {
        return (j67) s67.o(j67.D(s67.i(null)), ((Long) za3.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.a.getEventTime()) {
            this.a = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.b.getEventTime()) {
        } else {
            this.b = MotionEvent.obtain(motionEvent);
        }
    }
}
