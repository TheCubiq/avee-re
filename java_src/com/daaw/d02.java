package com.daaw;

import android.os.Handler;
import com.daaw.fa;
/* loaded from: classes.dex */
public final class d02 implements fa.a {
    public final /* synthetic */ z70 a;

    public d02(z70 z70Var) {
        this.a = z70Var;
    }

    @Override // com.daaw.fa.a
    public final void a(boolean z) {
        Handler handler;
        Handler handler2;
        z70 z70Var = this.a;
        handler = z70Var.E;
        handler2 = z70Var.E;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
