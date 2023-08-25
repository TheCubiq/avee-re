package com.daaw;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* loaded from: classes.dex */
public class uj0 extends Service implements sj0 {
    public final androidx.lifecycle.j p = new androidx.lifecycle.j(this);

    @Override // com.daaw.sj0
    public androidx.lifecycle.c a() {
        return this.p.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.p.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.p.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.p.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.p.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
