package com.daaw;

import android.content.Context;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class sp4 {
    public Context a;
    public ri6 b;
    public Bundle c;
    public gi6 d;

    public final sp4 c(Context context) {
        this.a = context;
        return this;
    }

    public final sp4 d(Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public final sp4 e(gi6 gi6Var) {
        this.d = gi6Var;
        return this;
    }

    public final sp4 f(ri6 ri6Var) {
        this.b = ri6Var;
        return this;
    }

    public final up4 g() {
        return new up4(this, null);
    }
}
