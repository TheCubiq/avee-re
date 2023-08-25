package com.daaw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class v02 extends q22 {

    /* renamed from: a */
    public final Context f29705a;

    /* renamed from: b */
    public final /* synthetic */ w70 f29706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v02(w70 w70Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f29706b = w70Var;
        this.f29705a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            return;
        }
        int mo5491g = this.f29706b.mo5491g(this.f29705a);
        if (this.f29706b.mo5488j(mo5491g)) {
            this.f29706b.m6475o(this.f29705a, mo5491g);
        }
    }
}
