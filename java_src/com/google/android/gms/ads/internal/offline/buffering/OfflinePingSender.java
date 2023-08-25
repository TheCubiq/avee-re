package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.daaw.ar3;
import com.daaw.xm3;
import com.google.android.gms.ads.internal.client.zzay;
/* loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* renamed from: v */
    public final ar3 f36207v;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f36207v = zzay.zza().zzm(context, new xm3());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.AbstractC0501a doWork() {
        try {
            this.f36207v.zzf();
            return ListenableWorker.AbstractC0501a.m28004c();
        } catch (RemoteException unused) {
            return ListenableWorker.AbstractC0501a.m28006a();
        }
    }
}
