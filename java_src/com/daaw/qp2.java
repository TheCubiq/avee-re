package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class qp2 extends Handler {

    /* renamed from: a */
    public final /* synthetic */ rp2 f24231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp2(rp2 rp2Var, Looper looper) {
        super(looper);
        this.f24231a = rp2Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f24231a.m11096b(message);
    }
}
