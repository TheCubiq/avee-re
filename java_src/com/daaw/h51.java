package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class h51 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new b());

    /* loaded from: classes.dex */
    public static class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((z41) message.obj).c();
                return true;
            }
            return false;
        }
    }

    public void a(z41<?> z41Var) {
        tq1.b();
        if (this.a) {
            this.b.obtainMessage(1, z41Var).sendToTarget();
            return;
        }
        this.a = true;
        z41Var.c();
        this.a = false;
    }
}
