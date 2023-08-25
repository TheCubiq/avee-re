package com.daaw;

import android.content.Context;
import com.daaw.mp;
/* loaded from: classes.dex */
public final class sq implements mp.a {
    public final Context a;
    public final bn1<? super mp> b;
    public final mp.a c;

    public sq(Context context, bn1<? super mp> bn1Var, mp.a aVar) {
        this.a = context.getApplicationContext();
        this.b = bn1Var;
        this.c = aVar;
    }

    @Override // com.daaw.mp.a
    /* renamed from: b */
    public rq a() {
        return new rq(this.a, this.b, this.c.a());
    }
}
