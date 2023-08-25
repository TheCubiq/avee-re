package com.daaw;

import android.database.ContentObserver;
import android.os.Handler;
/* loaded from: classes2.dex */
public final class ez7 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ h08 f8973a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez7(h08 h08Var, Handler handler) {
        super(null);
        this.f8973a = h08Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f8973a.m21112e();
    }
}
