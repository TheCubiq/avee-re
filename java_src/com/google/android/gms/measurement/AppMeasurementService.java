package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.daaw.cw1;
import com.daaw.p88;
import com.daaw.s88;
/* loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements p88 {

    /* renamed from: p */
    public s88 f37053p;

    /* renamed from: a */
    public final s88 m1084a() {
        if (this.f37053p == null) {
            this.f37053p = new s88(this);
        }
        return this.f37053p;
    }

    @Override // com.daaw.p88
    /* renamed from: b */
    public final boolean mo1083b(int i) {
        return stopSelfResult(i);
    }

    @Override // com.daaw.p88
    /* renamed from: c */
    public final void mo1082c(Intent intent) {
        cw1.m24948b(intent);
    }

    @Override // com.daaw.p88
    /* renamed from: d */
    public final void mo1081d(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return m1084a().m10525b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        m1084a().m10522e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        m1084a().m10521f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        m1084a().m10520g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        m1084a().m10526a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        m1084a().m10517j(intent);
        return true;
    }
}
