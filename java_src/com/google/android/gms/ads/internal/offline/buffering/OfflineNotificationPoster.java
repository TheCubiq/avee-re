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

    /* renamed from: v */
    public final ar3 f36206v;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f36206v = zzay.zza().zzm(context, new xm3());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.AbstractC0501a doWork() {
        try {
            this.f36206v.mo3431l1(nt0.m14830g3(getApplicationContext()), getInputData().m27964i("uri"), getInputData().m27964i("gws_query_id"));
            return ListenableWorker.AbstractC0501a.m28004c();
        } catch (RemoteException unused) {
            return ListenableWorker.AbstractC0501a.m28006a();
        }
    }
}
