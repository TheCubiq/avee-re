package com.daaw;

import android.app.Application;
import android.content.Context;
/* loaded from: classes.dex */
public final class sp6 {

    /* renamed from: a */
    public boolean f26509a;

    /* renamed from: a */
    public final void m10059a(Context context) {
        fr6.m22358b(context, "Application Context cannot be null");
        if (this.f26509a) {
            return;
        }
        this.f26509a = true;
        rq6.m11060b().m11059c(context);
        mq6 m15843a = mq6.m15843a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(m15843a);
        }
        br6.m25876g(context);
        oq6.m14068b().m14067c(context);
    }

    /* renamed from: b */
    public final boolean m10058b() {
        return this.f26509a;
    }
}
