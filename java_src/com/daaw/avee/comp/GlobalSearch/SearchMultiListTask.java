package com.daaw.avee.comp.GlobalSearch;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public class SearchMultiListTask<T1, T2> extends AsyncTask<String, Object, Void> {
    private MultiList<T1, T2> originalList;
    private WeakReference<IResultReceiver<T1, T2>> receiver;
    private FilterComparable<T1> searchFilter;
    private int fileCounter = 0;
    IResultReceiverInternal<T1, T2> resultReceiver0 = new IResultReceiverInternal<T1, T2>() { // from class: com.daaw.avee.comp.GlobalSearch.SearchMultiListTask.1
        @Override // com.daaw.avee.comp.GlobalSearch.SearchMultiListTask.IResultReceiverInternal
        public void onItemDirFound(Tuple2<T1, T2> tuple2) {
        }

        @Override // com.daaw.avee.comp.GlobalSearch.SearchMultiListTask.IResultReceiverInternal
        public void onItemFileFound(Tuple2<T1, T2> tuple2) {
            SearchMultiListTask.access$008(SearchMultiListTask.this);
            SearchMultiListTask.this.publishProgress(tuple2);
        }

        @Override // com.daaw.avee.comp.GlobalSearch.SearchMultiListTask.IResultReceiverInternal
        public boolean isCancelled() {
            return SearchMultiListTask.this.isCancelled();
        }
    };

    /* loaded from: classes.dex */
    public interface IResultReceiver<T1, T2> {
        void onItemDirFound(AsyncTask asyncTask, Tuple2<T1, T2> tuple2);

        void onItemFileFound(AsyncTask asyncTask, Tuple2<T1, T2> tuple2);

        void onSearchFinished(AsyncTask asyncTask, boolean z);

        void onSearchStarted(AsyncTask asyncTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IResultReceiverInternal<T1, T2> {
        boolean isCancelled();

        void onItemDirFound(Tuple2<T1, T2> tuple2);

        void onItemFileFound(Tuple2<T1, T2> tuple2);
    }

    static /* synthetic */ int access$008(SearchMultiListTask searchMultiListTask) {
        int i = searchMultiListTask.fileCounter;
        searchMultiListTask.fileCounter = i + 1;
        return i;
    }

    public SearchMultiListTask(Context context, MultiList<T1, T2> multiList, FilterComparable<T1> filterComparable, WeakReference<IResultReceiver<T1, T2>> weakReference) {
        this.originalList = multiList;
        this.searchFilter = filterComparable;
        this.receiver = weakReference;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IResultReceiver<T1, T2> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchStarted(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r2) {
        IResultReceiver<T1, T2> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, true);
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Object... objArr) {
        IResultReceiver<T1, T2> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onItemFileFound(this, (Tuple2) objArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onCancelled(Void r2) {
        IResultReceiver<T1, T2> iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0034, B:17:0x003c, B:18:0x0042, B:20:0x0048, B:23:0x0057, B:25:0x0061), top: B:30:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:6:0x000b, B:8:0x0011, B:10:0x0019, B:11:0x001f, B:13:0x0025, B:16:0x0034, B:17:0x003c, B:18:0x0042, B:20:0x0048, B:23:0x0057, B:25:0x0061), top: B:30:0x000b }] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Void doInBackground(String... strArr) {
        String preProcessQuery;
        Iterator<Tuple2<T1, T2>> it;
        Iterator<Tuple2<T1, T2>> it2;
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
                it = this.originalList.iterator();
                while (it.hasNext()) {
                    Tuple2<T1, T2> next = it.next();
                    if (this.resultReceiver0.isCancelled()) {
                        break;
                    }
                    this.searchFilter.preProcessItem(next.obj1);
                }
                it2 = this.originalList.iterator();
                while (it2.hasNext()) {
                    Tuple2<T1, T2> next2 = it2.next();
                    if (this.resultReceiver0.isCancelled()) {
                        break;
                    } else if (this.searchFilter.compare(preProcessQuery, next2.obj1)) {
                        this.resultReceiver0.onItemFileFound(next2);
                    }
                }
                return null;
            }
        }
        preProcessQuery = null;
        it = this.originalList.iterator();
        while (it.hasNext()) {
        }
        it2 = this.originalList.iterator();
        while (it2.hasNext()) {
        }
        return null;
    }
}
