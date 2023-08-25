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
    public volatile Looper p;
    public volatile a q;
    public String r;
    public boolean s;

    /* loaded from: classes.dex */
    public final class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            mr0.this.a((Intent) message.obj);
        }
    }

    public mr0(String str) {
        this.r = str;
    }

    public abstract void a(Intent intent);

    public void b(boolean z) {
        this.s = z;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.r + "]");
        handlerThread.start();
        this.p = handlerThread.getLooper();
        this.q = new a(this.p);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.p.quit();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        Message obtainMessage = this.q.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.q.sendMessage(obtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.s ? 3 : 2;
    }
}
