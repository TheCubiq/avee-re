package com.daaw.avee.comp.GlobalSearch;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class SearchFilesTask extends AsyncTask<String, Object, Void> {
    private Context context;
    private WeakReference<IResultReceiver> receiver;
    private File rootFile;
    private FilterComparable searchFilter;
    private int fileCounter = 0;
    IResultReceiverInternal resultReceiver0 = new IResultReceiverInternal() { // from class: com.daaw.avee.comp.GlobalSearch.SearchFilesTask.1
        @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiverInternal
        public void onItemDirFound(ContainerFile.Item item) {
        }

        @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiverInternal
        public void onItemFileFound(ContainerFile.Item item) {
            item.setIndex(SearchFilesTask.this.fileCounter);
            SearchFilesTask.access$008(SearchFilesTask.this);
            SearchFilesTask.this.publishProgress(item);
        }

        @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiverInternal
        public boolean isCancelled() {
            return SearchFilesTask.this.isCancelled();
        }
    };

    /* loaded from: classes.dex */
    public interface IResultReceiver {
        void onItemDirFound(AsyncTask asyncTask, ContainerFile.Item item);

        void onItemFileFound(AsyncTask asyncTask, ContainerFile.Item item);

        void onSearchFinished(AsyncTask asyncTask, boolean z);

        void onSearchStarted(AsyncTask asyncTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface IResultReceiverInternal {
        boolean isCancelled();

        void onItemDirFound(ContainerFile.Item item);

        void onItemFileFound(ContainerFile.Item item);
    }

    static /* synthetic */ int access$008(SearchFilesTask searchFilesTask) {
        int i = searchFilesTask.fileCounter;
        searchFilesTask.fileCounter = i + 1;
        return i;
    }

    public SearchFilesTask(Context context, File file, FilterComparable<PlaylistSong> filterComparable, WeakReference<IResultReceiver> weakReference) {
        this.context = context;
        this.rootFile = file;
        this.searchFilter = filterComparable;
        this.receiver = weakReference;
    }

    static boolean getItemsSearch(Context context, IResultReceiverInternal iResultReceiverInternal, File file, boolean z, String str, FilterComparable filterComparable) {
        String str2;
        FilterComparable filterComparable2;
        if (str == null || str.isEmpty() || filterComparable == null) {
            str2 = null;
            filterComparable2 = null;
        } else {
            filterComparable2 = filterComparable;
            str2 = filterComparable.preProcessQuery(str);
        }
        return getItemsRecursive(context, iResultReceiverInternal, file, z, str2, filterComparable2);
    }

    static boolean getItemsRecursive(Context context, IResultReceiverInternal iResultReceiverInternal, File file, boolean z, String str, FilterComparable filterComparable) {
        File[] listFiles;
        File[] listFiles2;
        try {
            for (File file2 : file.listFiles()) {
                if (iResultReceiverInternal.isCancelled()) {
                    return false;
                }
                if (!file2.isDirectory()) {
                    if (filterComparable != null ? file2.getName().toLowerCase().contains(str) : true) {
                        iResultReceiverInternal.onItemFileFound(new ContainerFile.Item(false, file2.getName(), file2.length(), file2.getCanonicalPath(), file2.lastModified(), new PlaylistSong(file2)));
                    }
                } else if (!z) {
                    if (filterComparable == null) {
                        iResultReceiverInternal.onItemDirFound(new ContainerFile.Item(true, file2.getName(), file2.listFiles() != null ? listFiles2.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                    } else if (!getItemsRecursive(context, iResultReceiverInternal, file2, false, str, filterComparable)) {
                        return false;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return true;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IResultReceiver iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchStarted(this);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Void r2) {
        IResultReceiver iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, true);
        }
    }

    @Override // android.os.AsyncTask
    protected void onProgressUpdate(Object... objArr) {
        IResultReceiver iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onItemFileFound(this, (ContainerFile.Item) objArr[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onCancelled(Void r2) {
        IResultReceiver iResultReceiver = this.receiver.get();
        if (iResultReceiver != null) {
            iResultReceiver.onSearchFinished(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Void doInBackground(String... strArr) {
        getItemsSearch(this.context, this.resultReceiver0, this.rootFile, false, strArr[0], this.searchFilter);
        return null;
    }
}
