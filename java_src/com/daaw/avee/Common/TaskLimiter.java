package com.daaw.avee.Common;

import android.os.AsyncTask;
import com.daaw.avee.Common.VAsyncTask;
/* loaded from: classes.dex */
public class TaskLimiter<Result> {
    private String jobId = null;
    private IVAsyncTask<Result> currentObject = null;

    public void RunNew(String str, IVAsyncTask<Result> iVAsyncTask, final VAsyncTask.ResultListener<Result> resultListener) {
        CancelOld();
        this.currentObject = iVAsyncTask;
        this.jobId = str;
        iVAsyncTask.Run(new VAsyncTask.ResultListener<Result>() { // from class: com.daaw.avee.Common.TaskLimiter.1
            @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
            public void onResult(Result result, boolean z) {
                TaskLimiter.this.currentObject = null;
                TaskLimiter.this.jobId = null;
                resultListener.onResult(result, z);
            }
        });
    }

    public void CancelOld() {
        IVAsyncTask<Result> iVAsyncTask = this.currentObject;
        if (iVAsyncTask != null) {
            iVAsyncTask.cancel(true);
        }
        this.currentObject = null;
        this.jobId = null;
    }

    public boolean isTaskRunning(String str) {
        IVAsyncTask<Result> iVAsyncTask;
        return Utils.compareNullStrings(this.jobId, str) && (iVAsyncTask = this.currentObject) != null && iVAsyncTask.getStatus() == AsyncTask.Status.RUNNING;
    }
}
