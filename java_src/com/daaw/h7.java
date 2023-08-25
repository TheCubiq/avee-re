package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public final class h7 {
    public final Context a;
    public final c b;
    public final BroadcastReceiver c;
    public g7 d;

    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            g7 b = g7.b(intent);
            if (b.equals(h7.this.d)) {
                return;
            }
            h7 h7Var = h7.this;
            h7Var.d = b;
            h7Var.b.a(b);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(g7 g7Var);
    }

    public h7(Context context, c cVar) {
        this.a = (Context) s6.e(context);
        this.b = (c) s6.e(cVar);
        this.c = sq1.a >= 21 ? new b() : null;
    }
}
