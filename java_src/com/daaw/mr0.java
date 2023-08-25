package com.daaw;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public abstract class mr0 extends Service {

    /* renamed from: p */
    public volatile Looper f19090p;

    /* renamed from: q */
    public volatile HandlerC2206a f19091q;

    /* renamed from: r */
    public String f19092r;

    /* renamed from: s */
    public boolean f19093s;

    /* renamed from: com.daaw.mr0$a */
    /* loaded from: classes.dex */
    public final class HandlerC2206a extends Handler {
        public HandlerC2206a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            mr0.this.mo15823a((Intent) message.obj);
        }
    }

    public mr0(String str) {
        this.f19092r = str;
    }

    /* renamed from: a */
    public abstract void mo15823a(Intent intent);

    /* renamed from: b */
    public void m15822b(boolean z) {
        this.f19093s = z;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.f19092r + "]");
        handlerThread.start();
        this.f19090p = handlerThread.getLooper();
        this.f19091q = new HandlerC2206a(this.f19090p);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f19090p.quit();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        Message obtainMessage = this.f19091q.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.f19091q.sendMessage(obtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.f19093s ? 3 : 2;
    }
}
