package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;

import android.content.Context;
import android.view.View;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public interface IContainerData {

    /* loaded from: classes.dex */
    public interface IContainerStatusListener {
        void onItemCountChanged(int i, int i2, boolean z, boolean z2);

        void onUpdateStatusInfo(String str);
    }

    /* loaded from: classes.dex */
    public interface ILibraryContainerDataListener {
        String makeChildAddress(String str, String str2);

        void onNavigateForward(String str, String str2);

        int onRequestRootContainerItemsVisible();

        int onRequestShuffleMode();

        void subscribeWeakFollowCurrentValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list);

        void subscribeWeakShowAlbumArtValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list);

        void subscribeWeakShuffleModeChanged(WeakEvent1.Handler<Integer> handler, List<Object> list);
    }

    /* loaded from: classes.dex */
    public interface IOnDraggingListener {
        void onStartDragging(View view);
    }

    boolean RefreshContent();

    boolean RefreshContent(boolean z);

    boolean containsContainerIdentifier(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier);

    ViewAdapter createChildAdapter(Context context, String str);

    ViewAdapter createOrGetAdapter(Context context);

    ViewAdapter createOrGetAdapter(Context context, int i);

    void executeItemActionHeader(ContextData contextData, int i);

    Tuple2<Integer, Boolean> getContainerItemHeight();

    int getDisplayIconResId();

    IVAsyncTask<String> getDisplayName();

    int getItemCount();

    String getLibraryAddress();

    ILibraryContainerDataListener getLibraryContainerDataListener();

    IOnDraggingListener getOnDraggingListener();

    void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr);

    boolean getSectionOpened();

    boolean getShowAlbumArtValue();

    String makeChildAddress(String str);

    boolean onListViewClick(int i, Context context);

    void setContainerStatusListener(WeakReference<IContainerStatusListener> weakReference);

    void setLibraryContainerDataListener(WeakReference<ILibraryContainerDataListener> weakReference);

    void setOnDraggingListener(IOnDraggingListener iOnDraggingListener);

    void setSectionOpenedState(boolean z);

    void updateSearchQuery(Context context, String str);
}
