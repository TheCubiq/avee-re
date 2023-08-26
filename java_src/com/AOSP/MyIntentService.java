package com.AOSP;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public abstract class MyIntentService extends Service {
    private String mName;
    private boolean mRedelivery;
    protected volatile ServiceHandler mServiceHandler;
    private volatile Looper mServiceLooper;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    protected abstract void onHandleIntent(Intent intent);

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public final class ServiceHandler extends Handler {
        public ServiceHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MyIntentService.this.onHandleIntent((Intent) message.obj);
        }
    }

    public MyIntentService(String str) {
        this.mName = str;
    }

    public void setIntentRedelivery(boolean z) {
        this.mRedelivery = z;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.mName + "]");
        handlerThread.start();
        this.mServiceLooper = handlerThread.getLooper();
        this.mServiceHandler = new ServiceHandler(this.mServiceLooper);
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        Message obtainMessage = this.mServiceHandler.obtainMessage();
        obtainMessage.arg1 = i;
        obtainMessage.obj = intent;
        this.mServiceHandler.sendMessage(obtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        onStart(intent, i2);
        return this.mRedelivery ? 3 : 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.mServiceLooper.quit();
    }
}
