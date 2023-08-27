package com.daaw.avee.comp.Playlists;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ScanPlaylistFilesTask extends AsyncTask<String, Object, Void> {
    private Context context;
    private WeakReference<IResultReceiver> resultReceiver;
    private File rootFile;
    private FilterComparable<File> searchFilter;
    private List<String> resultItems = new ArrayList();
    IResultReceiverInternal resultReceiverInternal = new IResultReceiverInternal() { // from class: com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.1
        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiverInternal
        public void onItemDirFound(File file) {
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiverInternal
        public void onItemFileFound(File file) {
            try {
                ScanPlaylistFilesTask.this.resultItems.add(file.getCanonicalPath());
            } catch (IOException unused) {
            }
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiverInternal
        public void onDir(File file) {
            String str;
            try {
                str = file.getCanonicalPath();
            } catch (IOException unused) {
                str = null;
            }
            if (str != null) {
                ScanPlaylistFilesTask.this.publishProgress(str);
            }
        }

        @Override // com.daaw.avee.comp.Playlists.ScanPlaylistFilesTask.IResultReceiverInternal
        public boolean isCancelled() {
            return ScanPlaylistFilesTask.this.isCancelled();
        }
    };
    private String searchQuery = "";

    /* loaded from: classes.dex */
    public interface FilterComparable<T1> {
        boolean compare(String str, T1 t1);

        void preProcessItem(T1 t1);

        String preProcessQuery(String str);
    }

    /* loaded from: classes.dex */
    public interface IResultReceiver {
        void onFinished(AsyncTask asyncTask, boolean z, List<String> list);

        void onItem(AsyncTask asyncTask, String str);

        void onStarted(AsyncTask asyncTask);

        void onStatusUpdate(AsyncTask asyncTask, String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IResultReceiverInternal {
        boolean isCancelled();

        void onDir(File file);

        void onItemDirFound(File file);

        void onItemFileFound(File file);
    }

    public ScanPlaylistFilesTask(Context context, File file, FilterComparable<File> filterComparable, WeakReference<IResultReceiver> weakReference) {
        this.context = context;
        this.rootFile = file;
        this.searchFilter = filterComparable;
        this.resultReceiver = weakReference;
    }

    public static ScanPlaylistFilesTask createScanPlaylistFilesTask(Context context, File file, FilterComparable<File> filterComparable, WeakReference<IResultReceiver> weakReference) {
        return new ScanPlaylistFilesTask(context, file, filterComparable, weakReference);
    }

    static boolean getItemsSearch(Context context, IResultReceiverInternal iResultReceiverInternal, File file, boolean z, String str, FilterComparable<File> filterComparable) {
        return getItemsRecursive(context, iResultReceiverInternal, file, z, filterComparable.preProcessQuery(str), filterComparable);
    }

    static boolean getItemsRecursive(Context context, IResultReceiverInternal iResultReceiverInternal, File file, boolean z, String str, FilterComparable<File> filterComparable) {
        File[] listFiles;
        try {
            for (File file2 : file.listFiles()) {
                if (iResultReceiverInternal.isCancelled()) {
                    return false;
                }
                if (file2.isDirectory()) {
                    iResultReceiverInternal.onDir(file2);
                    if (!z && !getItemsRecursive(context, iResultReceiverInternal, file2, false, str, filterComparable)) {
                        return false;
                    }
                } else if (filterComparable != null ? filterComparable.compare(str, file2) : true) {
                    iResultReceiverInternal.onItemFileFound(file2);
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public void start() {
        execute(this.searchQuery);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IResultReceiver iResultReceiver = this.resultReceiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onStarted(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r3) {
        IResultReceiver iResultReceiver = this.resultReceiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onFinished(this, true, this.resultItems);
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Object... objArr) {
        IResultReceiver iResultReceiver = this.resultReceiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onStatusUpdate(this, (String) objArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onCancelled(Void r3) {
        IResultReceiver iResultReceiver = this.resultReceiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onFinished(this, false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Void doInBackground(String... strArr) {
        getItemsSearch(this.context, this.resultReceiverInternal, this.rootFile, false, strArr[0], this.searchFilter);
        return null;
    }
}
