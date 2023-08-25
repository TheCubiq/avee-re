package com.daaw;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;
/* loaded from: classes.dex */
public final class qn5 implements sy4 {
    public Message a;
    public wo5 b;

    public qn5() {
    }

    public /* synthetic */ qn5(pm5 pm5Var) {
    }

    public final qn5 a(Message message, wo5 wo5Var) {
        this.a = message;
        this.b = wo5Var;
        return this;
    }

    public final boolean b(Handler handler) {
        Message message = this.a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        c();
        return sendMessageAtFrontOfQueue;
    }

    public final void c() {
        this.a = null;
        this.b = null;
        wo5.h(this);
    }

    @Override // com.daaw.sy4
    public final void zza() {
        Message message = this.a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        c();
    }
}
