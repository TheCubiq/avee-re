package com.daaw.avee.Common;

import android.os.AsyncTask;
import com.daaw.avee.Common.VAsyncTask;
/* loaded from: classes.dex */
public interface IVAsyncTask<Result> {
    void Run(VAsyncTask.ResultListener<Result> resultListener);

    boolean cancel(boolean z);

    AsyncTask.Status getStatus();
}
