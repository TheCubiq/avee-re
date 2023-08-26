package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void lambda$onReceive$0() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Runnable runnable;
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.initialize(context);
        TransportContext.Builder priority = TransportContext.builder().setBackendName(queryParameter).setPriority(PriorityMapping.valueOf(intValue));
        if (queryParameter2 != null) {
            priority.setExtras(Base64.decode(queryParameter2, 0));
        }
        Uploader uploader = TransportRuntime.getInstance().getUploader();
        TransportContext build = priority.build();
        runnable = AlarmManagerSchedulerBroadcastReceiver$$Lambda$1.instance;
        uploader.upload(build, i, runnable);
    }
}
