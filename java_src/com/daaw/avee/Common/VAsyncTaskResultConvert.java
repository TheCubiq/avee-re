package com.daaw.avee.Common;

import android.os.AsyncTask;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.VAsyncTask;
/* loaded from: classes.dex */
public class VAsyncTaskResultConvert<FromResult, Result> implements IVAsyncTask<Result> {
    private Func1<FromResult, Result> converter;
    private VAsyncTask<FromResult> task;

    public VAsyncTaskResultConvert(VAsyncTask<FromResult> vAsyncTask, Func1<FromResult, Result> func1) {
        this.task = vAsyncTask;
        this.converter = func1;
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public void Run(final VAsyncTask.ResultListener<Result> resultListener) {
        this.task.Run(new VAsyncTask.ResultListener<FromResult>() { // from class: com.daaw.avee.Common.VAsyncTaskResultConvert.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
            public void onResult(FromResult fromresult, boolean z) {
                resultListener.onResult(VAsyncTaskResultConvert.this.converter.onInvoke(fromresult), z);
            }
        });
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public boolean cancel(boolean z) {
        return this.task.cancel(z);
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public AsyncTask.Status getStatus() {
        return this.task.getStatus();
    }
}
