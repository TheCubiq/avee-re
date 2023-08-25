package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class io8 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ so8 f13889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io8(so8 so8Var, Looper looper) {
        super(looper);
        this.f13889a = so8Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        so8.m10106a(this.f13889a, message);
    }
}
