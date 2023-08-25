package com.daaw;

import android.os.Handler;
import com.daaw.ComponentCallbacks2C1265fa;
/* loaded from: classes.dex */
public final class d02 implements ComponentCallbacks2C1265fa.InterfaceC1266a {

    /* renamed from: a */
    public final /* synthetic */ z70 f6337a;

    public d02(z70 z70Var) {
        this.f6337a = z70Var;
    }

    @Override // com.daaw.ComponentCallbacks2C1265fa.InterfaceC1266a
    /* renamed from: a */
    public final void mo10770a(boolean z) {
        Handler handler;
        Handler handler2;
        z70 z70Var = this.f6337a;
        handler = z70Var.f34538E;
        handler2 = z70Var.f34538E;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z)));
    }
}
