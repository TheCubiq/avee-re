package com.daaw;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public final class ht7 extends ContentObserver {
    public ht7(Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = tu7.e;
        atomicBoolean.set(true);
    }
}
