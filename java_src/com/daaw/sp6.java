package com.daaw;

import android.app.Application;
import android.content.Context;
/* loaded from: classes.dex */
public final class sp6 {
    public boolean a;

    public final void a(Context context) {
        fr6.b(context, "Application Context cannot be null");
        if (this.a) {
            return;
        }
        this.a = true;
        rq6.b().c(context);
        mq6 a = mq6.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(a);
        }
        br6.g(context);
        oq6.b().c(context);
    }

    public final boolean b() {
        return this.a;
    }
}
