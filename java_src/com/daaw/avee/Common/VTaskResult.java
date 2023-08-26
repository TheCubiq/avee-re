package com.daaw.avee.Common;

import android.os.AsyncTask;
import com.daaw.avee.Common.VAsyncTask;
/* loaded from: classes.dex */
public class VTaskResult<Result> implements IVAsyncTask<Result> {
    private Result result;

    @Override // com.daaw.avee.Common.IVAsyncTask
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public AsyncTask.Status getStatus() {
        return null;
    }

    public VTaskResult(Result result) {
        this.result = result;
    }

    @Override // com.daaw.avee.Common.IVAsyncTask
    public void Run(VAsyncTask.ResultListener<Result> resultListener) {
        resultListener.onResult(this.result, false);
    }
}
