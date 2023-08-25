package com.daaw;

import android.os.Handler;
import com.daaw.pa;
/* loaded from: classes.dex */
public final class h02 implements pa.e {
    public final /* synthetic */ i02 a;

    public h02(i02 i02Var) {
        this.a = i02Var;
    }

    @Override // com.daaw.pa.e
    public final void a() {
        Handler handler;
        handler = this.a.B.E;
        handler.post(new g02(this));
    }
}
