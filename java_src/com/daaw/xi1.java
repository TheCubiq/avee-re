package com.daaw;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public final class xi1 implements u80 {

    /* renamed from: a */
    public final Handler f32745a;

    public xi1(Handler handler) {
        this.f32745a = handler;
    }

    @Override // com.daaw.u80
    /* renamed from: a */
    public Message mo5069a(int i, int i2, int i3) {
        return this.f32745a.obtainMessage(i, i2, i3);
    }

    @Override // com.daaw.u80
    /* renamed from: b */
    public boolean mo5068b(int i) {
        return this.f32745a.sendEmptyMessage(i);
    }

    @Override // com.daaw.u80
    /* renamed from: c */
    public Message mo5067c(int i, int i2, int i3, Object obj) {
        return this.f32745a.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.daaw.u80
    /* renamed from: d */
    public boolean mo5066d(int i, long j) {
        return this.f32745a.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.daaw.u80
    /* renamed from: e */
    public void mo5065e(int i) {
        this.f32745a.removeMessages(i);
    }

    @Override // com.daaw.u80
    /* renamed from: f */
    public Message mo5064f(int i, Object obj) {
        return this.f32745a.obtainMessage(i, obj);
    }

    @Override // com.daaw.u80
    /* renamed from: g */
    public Looper mo5063g() {
        return this.f32745a.getLooper();
    }
}
