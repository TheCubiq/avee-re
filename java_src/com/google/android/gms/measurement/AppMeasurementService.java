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
    public s88 p;

    public final s88 a() {
        if (this.p == null) {
            this.p = new s88(this);
        }
        return this.p;
    }

    @Override // com.daaw.p88
    public final boolean b(int i) {
        return stopSelfResult(i);
    }

    @Override // com.daaw.p88
    public final void c(Intent intent) {
        cw1.b(intent);
    }

    @Override // com.daaw.p88
    public final void d(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return a().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        a().a(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
