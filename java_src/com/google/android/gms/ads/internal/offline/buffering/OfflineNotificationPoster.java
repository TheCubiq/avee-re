package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.daaw.ar3;
import com.daaw.nt0;
import com.daaw.xm3;
import com.google.android.gms.ads.internal.client.zzay;
/* loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {
    public final ar3 v;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.v = zzay.zza().zzm(context, new xm3());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.v.l1(nt0.g3(getApplicationContext()), getInputData().i("uri"), getInputData().i("gws_query_id"));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
