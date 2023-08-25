package com.daaw;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.AbstractC0344c;
import androidx.lifecycle.C0361j;
/* loaded from: classes.dex */
public class uj0 extends Service implements sj0 {

    /* renamed from: p */
    public final C0361j f29102p = new C0361j(this);

    @Override // com.daaw.sj0
    /* renamed from: a */
    public AbstractC0344c mo2327a() {
        return this.f29102p.m29005a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f29102p.m29004b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f29102p.m29003c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f29102p.m29002d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i) {
        this.f29102p.m29001e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
