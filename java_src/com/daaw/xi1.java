package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class xi1 implements u80 {
    public final Handler a;

    public xi1(Handler handler) {
        this.a = handler;
    }

    @Override // com.daaw.u80
    public Message a(int i, int i2, int i3) {
        return this.a.obtainMessage(i, i2, i3);
    }

    @Override // com.daaw.u80
    public boolean b(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // com.daaw.u80
    public Message c(int i, int i2, int i3, Object obj) {
        return this.a.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.daaw.u80
    public boolean d(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.daaw.u80
    public void e(int i) {
        this.a.removeMessages(i);
    }

    @Override // com.daaw.u80
    public Message f(int i, Object obj) {
        return this.a.obtainMessage(i, obj);
    }

    @Override // com.daaw.u80
    public Looper g() {
        return this.a.getLooper();
    }
}
