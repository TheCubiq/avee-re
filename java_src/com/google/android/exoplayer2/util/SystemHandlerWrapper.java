package com.google.android.exoplayer2.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private final Handler handler;

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i) {
        return this.handler.obtainMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i, Object obj) {
        return this.handler.obtainMessage(i, obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i, int i2, int i3) {
        return this.handler.obtainMessage(i, i2, i3);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public Message obtainMessage(int i, int i2, int i3, Object obj) {
        return this.handler.obtainMessage(i, i2, i3, obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessage(int i) {
        return this.handler.sendEmptyMessage(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i, long j) {
        return this.handler.sendEmptyMessageAtTime(i, j);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeMessages(int i) {
        this.handler.removeMessages(i);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // com.google.android.exoplayer2.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j) {
        return this.handler.postDelayed(runnable, j);
    }
}
