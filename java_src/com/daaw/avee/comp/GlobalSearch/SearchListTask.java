package com.daaw.avee.comp.GlobalSearch;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class SearchListTask<T1> extends AsyncTask<String, Object, Void> {
    private List<T1> originalList;
    private WeakReference<IResultReceiver<T1>> receiver;
    private FilterComparable<T1> searchFilter;
    private int fileCounter = 0;
    IResultReceiverInternal<T1> resultReceiver0 = new IResultReceiverInternal<T1>() { // from class: com.daaw.avee.comp.GlobalSearch.SearchListTask.1
        @Override // com.daaw.avee.comp.GlobalSearch.SearchListTask.IResultReceiverInternal
        public void onItemFileFound(T1 t1) {
            SearchListTask.access$008(SearchListTask.this);
            SearchListTask.this.publishProgress(t1);
        }

        @Override // com.daaw.avee.comp.GlobalSearch.SearchListTask.IResultReceiverInternal
        public boolean isCancelled() {
            return SearchListTask.this.isCancelled();
        }
    };

    /* loaded from: classes.dex */
    public interface IResultReceiver<T1> {
        void onItemFileFound(AsyncTask asyncTask, T1 t1);

        void onSearchFinished(AsyncTask asyncTask, boolean z);

        void onSearchStarted(AsyncTask asyncTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IResultReceiverInternal<T1> {
        boolean isCancelled();

        void onItemFileFound(T1 t1);
    }

    static /* synthetic */ int access$008(SearchListTask searchListTask) {
        int i = searchListTask.fileCounter;
        searchListTask.fileCounter = i + 1;
        return i;
    }

    public SearchListTask(Context context, List<T1> list, FilterComparable<T1> filterComparable, WeakReference<IResultReceiver<T1>> weakReference) {
        this.originalList = list;
        this.searchFilter = filterComparable;
        this.receiver = weakReference;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IResultReceiver<T1> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchStarted(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r2) {
        IResultReceiver<T1> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, true);
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Object... objArr) {
        IResultReceiver<T1> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onItemFileFound(this, objArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onCancelled(Void r2) {
        IResultReceiver<T1> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0032, B:17:0x0038, B:18:0x003e, B:20:0x0044, B:23:0x0051, B:25:0x0059), top: B:30:0x000b }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Void doInBackground(String... strArr) {
        String preProcessQuery;
        String str = strArr[0];
        if (this.searchFilter == null) {
            return null;
        }
        if (str != null) {
            try {
            } catch (Exception e) {
                tlog.w("doInBackground Exception: " + e.getMessage());
            }
            if (!str.isEmpty()) {
                preProcessQuery = this.searchFilter.preProcessQuery(str);
                for (T1 t1 : this.originalList) {
                    if (this.resultReceiver0.isCancelled()) {
                        break;
                    }
                    this.searchFilter.preProcessItem(t1);
                }
                for (T1 t12 : this.originalList) {
                    if (this.resultReceiver0.isCancelled()) {
                        break;
                    } else if (this.searchFilter.compare(preProcessQuery, t12)) {
                        this.resultReceiver0.onItemFileFound(t12);
                    }
                }
                return null;
            }
        }
        preProcessQuery = null;
        while (r0.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        return null;
    }
}
