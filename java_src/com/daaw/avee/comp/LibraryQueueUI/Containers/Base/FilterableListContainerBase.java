package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;

import android.content.Context;
import android.os.AsyncTask;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.GlobalSearch.SearchListTask;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class FilterableListContainerBase<T, V extends List<T>> extends ListContainerBase<T, V> implements ViewAdapter.IAdapterDataProvider {
    protected V originalContent;
    SearchListTask.IResultReceiver<T> resultReceiver;
    protected V visibleList;
    String visibleListQuery;

    /* JADX INFO: Access modifiers changed from: protected */
    public FilterableListContainerBase(Context context, Func1<ContainerBase, V> func1, Func<V> func, String str, IVAsyncTask<String> iVAsyncTask, int i, FilterComparable<T> filterComparable, int i2) {
        super(context, func1, func, str, iVAsyncTask, i, i2);
        this.visibleListQuery = null;
        this.resultReceiver = new SearchListTask.IResultReceiver<T>() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterableListContainerBase.1
            boolean compareTask(AsyncTask asyncTask) {
                return ContainerBase.onCompareSearchTask.invoke(asyncTask, Integer.valueOf(FilterableListContainerBase.this.pageIndex), false).booleanValue();
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchListTask.IResultReceiver
            public void onSearchStarted(AsyncTask asyncTask) {
                if (compareTask(asyncTask) && FilterableListContainerBase.this.visibleList != null) {
                    FilterableListContainerBase.this.setSearchActive(true, false);
                    FilterableListContainerBase.this.visibleList.clear();
                    FilterableListContainerBase.this.RefreshContent();
                }
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchListTask.IResultReceiver
            public void onSearchFinished(AsyncTask asyncTask, boolean z) {
                if (compareTask(asyncTask) && FilterableListContainerBase.this.visibleList != null) {
                    FilterableListContainerBase.this.setSearchActive(false, true);
                    FilterableListContainerBase.this.RefreshContent();
                }
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchListTask.IResultReceiver
            public void onItemFileFound(AsyncTask asyncTask, T t) {
                if (FilterableListContainerBase.this.visibleList != null && compareTask(asyncTask)) {
                    FilterableListContainerBase.this.justAddData(t);
                }
            }
        };
        updateSearchQuery(context, onRequestSearchQuery.invoke(Integer.valueOf(i2), getSelectionContainerIdentifier(), ""), filterComparable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ListContainerBase
    public Tuple2<V, String> getContent(boolean z) {
        V v = this.visibleList;
        if (v == null) {
            return super.getContent(z);
        }
        if (z) {
            v = null;
        }
        return new Tuple2<>(v, this.visibleListQuery + this.visibleList.size());
    }

    public void updateSearchQuery(Context context, String str, FilterComparable<T> filterComparable) {
        if (str == null || str.isEmpty() || filterComparable == null) {
            this.visibleList = null;
            this.visibleListQuery = null;
            this.originalContent = null;
            setSearchActive(false, true);
            RefreshContent();
            return;
        }
        this.visibleList = this.listFactory.onInvoke();
        this.visibleListQuery = str;
        setSearchActive(true, false);
        if (this.originalContent == null) {
            this.originalContent = (V) super.getList();
        }
        RefreshContent();
        startSearch(str, filterComparable, this.originalContent);
    }

    private void startSearch(String str, FilterComparable<T> filterComparable, V v) {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        SearchListTask searchListTask = new SearchListTask(appContext, v, filterComparable, new WeakReference(this.resultReceiver));
        onStartSearchTask.invoke(searchListTask, Integer.valueOf(this.pageIndex), str);
        searchListTask.execute(str);
    }

    protected void clearDataAndNotify() {
        clearItemIdent();
        this.visibleList.clear();
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
        }
    }

    protected void addDataAndNotify(T t) {
        clearItemIdent();
        this.visibleList.add(t);
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
        }
    }

    protected void justAddData(T t) {
        this.visibleList.add(t);
    }

    protected void dataChangedNotify() {
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
        }
    }
}
