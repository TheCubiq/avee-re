package com.daaw.avee.comp.GlobalSearch;

import android.os.AsyncTask;
import com.daaw.avee.Common.Events.WeakEvent2;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class SearchTaskManager {
    public static WeakEvent2<Integer, String> onUISearchQueryTextChangeWithIndex = new WeakEvent2<>();
    private int taskIndex = -1;
    private AsyncTask asyncTask = null;

    public void setTask(AsyncTask asyncTask, int i) {
        clearTask(this.taskIndex == i);
        this.taskIndex = i;
        this.asyncTask = asyncTask;
    }

    public boolean compareTask(AsyncTask asyncTask, int i) {
        return this.taskIndex == i && this.asyncTask != null && !asyncTask.isCancelled() && asyncTask == this.asyncTask;
    }

    public void clearTaskIfMatch(int i) {
        if (this.taskIndex == i) {
            clearTask(true);
        }
    }

    protected void clearTask(boolean z) {
        AsyncTask asyncTask = this.asyncTask;
        if (asyncTask == null) {
            return;
        }
        int i = this.taskIndex;
        Assert.assertNotNull(asyncTask);
        this.asyncTask.cancel(false);
        this.asyncTask = null;
        this.taskIndex = -1;
        if (z) {
            return;
        }
        onUISearchQueryTextChangeWithIndex.invoke(Integer.valueOf(i), "");
    }
}
