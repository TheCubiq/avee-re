package com.daaw;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
/* loaded from: classes.dex */
public final class qn5 implements sy4 {

    /* renamed from: a */
    public Message f24204a;

    /* renamed from: b */
    public wo5 f24205b;

    public qn5() {
    }

    public /* synthetic */ qn5(pm5 pm5Var) {
    }

    /* renamed from: a */
    public final qn5 m12323a(Message message, wo5 wo5Var) {
        this.f24204a = message;
        this.f24205b = wo5Var;
        return this;
    }

    /* renamed from: b */
    public final boolean m12322b(Handler handler) {
        Message message = this.f24204a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        m12321c();
        return sendMessageAtFrontOfQueue;
    }

    /* renamed from: c */
    public final void m12321c() {
        this.f24204a = null;
        this.f24205b = null;
        wo5.m5887h(this);
    }

    @Override // com.daaw.sy4
    public final void zza() {
        Message message = this.f24204a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        m12321c();
    }
}
