package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ContainerBase implements IContainerData {
    protected int color;
    protected int colorContainerDark;
    protected int colorImgArt;
    protected int colorLight;
    protected WeakReference<IContainerData.IContainerStatusListener> containerStatusListener;
    protected int displayIconResId;
    protected IVAsyncTask<String> displayName;
    private boolean isLoadingActive;
    private boolean isSearchActive;
    private String itemsIdent;
    protected String libraryAddress;
    protected WeakReference<IContainerData.ILibraryContainerDataListener> libraryContainerDataListenerWeak;
    protected IContainerData.IOnDraggingListener onDraggingListener;
    protected int pageIndex;
    protected IGeneralItemContainerIdentifier selectionContainerIdentifier;
    public static WeakEvent4<AlbumArtRequest, ImageView, Boolean, Boolean> onRequestAlbumArt = new WeakEvent4<>();
    public static WeakEventR<Boolean> onRequestShowAlbumArtValue = new WeakEventR<>();
    public static WeakEventR2<Integer, IGeneralItemContainerIdentifier, String> onRequestSearchQuery = new WeakEventR2<>();
    public static WeakEventR2<Integer, IGeneralItemContainerIdentifier, SortDesign.SortDesc> onRequestCurrentSortDesc = new WeakEventR2<>();
    public static WeakEventR3<Integer, IGeneralItemContainerIdentifier, File, Boolean> onRequestFilterFileResult = new WeakEventR3<>();
    public static WeakEventR1<Class<?>, Boolean> onRequestSectionOpenedState = new WeakEventR1<>();
    public static WeakEvent2<Boolean, Class<?>> onSetSectionOpened = new WeakEvent2<>();
    public static WeakEvent3<Integer, Integer, List<Integer>> onMoveQueueItems = new WeakEvent3<>();
    public static WeakEventR1<ItemSelection.One, Boolean> onRequestContainsItemSelection = new WeakEventR1<>();
    public static WeakEventR2<AsyncTask, Integer, Boolean> onCompareSearchTask = new WeakEventR2<>();
    public static WeakEvent3<AsyncTask, Integer, Object> onStartSearchTask = new WeakEvent3<>();
    public static WeakEvent1<Integer> onContainerDataSetChanged = new WeakEvent1<>();
    public static WeakEventR1<IContainerData, Tuple2<Integer, Boolean>> onRequestContainerItemHeight = new WeakEventR1<>();

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public abstract boolean RefreshContent();

    protected abstract ViewAdapter createAdapter(Context context, int i);

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public abstract ViewAdapter createChildAdapter(Context context, String str);

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
    }

    protected boolean getIsSearchActive() {
        return false;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public abstract int getItemCount();

    protected abstract String getItemPositionToItemAddress(int i);

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getSectionOpened() {
        return true;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setSectionOpenedState(boolean z) {
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public abstract void updateSearchQuery(Context context, String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerBase(Context context, String str, IVAsyncTask<String> iVAsyncTask, int i, int i2) {
        this(context, str, iVAsyncTask, i, i2, new WeakReference(null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ContainerBase(Context context, String str, IVAsyncTask<String> iVAsyncTask, int i, int i2, WeakReference<IContainerData.ILibraryContainerDataListener> weakReference) {
        this.containerStatusListener = new WeakReference<>(null);
        this.pageIndex = -1;
        this.itemsIdent = null;
        this.isSearchActive = false;
        this.isLoadingActive = false;
        this.pageIndex = i2;
        this.displayName = iVAsyncTask;
        this.displayIconResId = i;
        this.libraryAddress = str;
        setLibraryContainerDataListener(weakReference);
        this.color = UtilsUI.getAttrColor(context.getTheme(), (int) R.attr.containerFG);
        this.colorLight = UtilsUI.getAttrColor(context.getTheme(), (int) R.attr.containerFGw);
        this.colorImgArt = UtilsUI.getAttrColor(context.getTheme(), (int) R.attr.containerFG);
        this.colorContainerDark = UtilsUI.getAttrColor(context.getTheme(), (int) R.attr.containerBackgroundDark);
        this.selectionContainerIdentifier = makeContainerIdentifier(str);
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    protected static IGeneralItemContainerIdentifier makeContainerIdentifier(String str) {
        return new SelectionContainerAddressIdentifier(str);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createOrGetAdapter(Context context) {
        return createOrGetAdapter(context, -1);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createOrGetAdapter(Context context, int i) {
        return createAdapter(context, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean checkItemIdent(String str, boolean z) {
        if (this.itemsIdent == null || !checkItemIdentEquals(str)) {
            if (z) {
                this.itemsIdent = str;
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean checkItemIdentEquals(String str) {
        String str2 = this.itemsIdent;
        return (str2 == null || str == null || !Utils.compareNullStrings(str2, str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void clearItemIdent() {
        this.itemsIdent = null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IVAsyncTask<String> getDisplayName() {
        return this.displayName;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public int getDisplayIconResId() {
        return this.displayIconResId;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public String getLibraryAddress() {
        return this.libraryAddress;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public String makeChildAddress(String str) {
        IContainerData.ILibraryContainerDataListener iLibraryContainerDataListener = this.libraryContainerDataListenerWeak.get();
        if (iLibraryContainerDataListener != null) {
            return iLibraryContainerDataListener.makeChildAddress(getLibraryAddress(), str);
        }
        return getLibraryAddress();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean onListViewClick(int i, Context context) {
        IContainerData.ILibraryContainerDataListener iLibraryContainerDataListener = this.libraryContainerDataListenerWeak.get();
        if (iLibraryContainerDataListener != null) {
            iLibraryContainerDataListener.onNavigateForward(getLibraryAddress(), getItemPositionToItemAddress(i));
            return false;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean containsContainerIdentifier(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        return this.selectionContainerIdentifier.equals(iGeneralItemContainerIdentifier);
    }

    public IGeneralItemContainerIdentifier getSelectionContainerIdentifier() {
        return this.selectionContainerIdentifier;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = null;
        iGeneralItemContainerIdentifierArr[0] = null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setOnDraggingListener(IContainerData.IOnDraggingListener iOnDraggingListener) {
        this.onDraggingListener = iOnDraggingListener;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setContainerStatusListener(WeakReference<IContainerData.IContainerStatusListener> weakReference) {
        this.containerStatusListener = weakReference;
        IContainerData.IContainerStatusListener iContainerStatusListener = weakReference.get();
        if (iContainerStatusListener != null) {
            iContainerStatusListener.onItemCountChanged(getItemCount(), 0, this.isSearchActive, this.isLoadingActive);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setLibraryContainerDataListener(WeakReference<IContainerData.ILibraryContainerDataListener> weakReference) {
        this.libraryContainerDataListenerWeak = weakReference;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IContainerData.ILibraryContainerDataListener getLibraryContainerDataListener() {
        return this.libraryContainerDataListenerWeak.get();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IContainerData.IOnDraggingListener getOnDraggingListener() {
        return this.onDraggingListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSearchActive(boolean z, boolean z2) {
        this.isSearchActive = z;
        IContainerData.IContainerStatusListener iContainerStatusListener = this.containerStatusListener.get();
        if (iContainerStatusListener != null) {
            iContainerStatusListener.onItemCountChanged(z2 ? getItemCount() : -1, 0, this.isSearchActive, this.isLoadingActive);
        }
    }

    public void setLoadingActive(boolean z) {
        this.isLoadingActive = z;
        IContainerData.IContainerStatusListener iContainerStatusListener = this.containerStatusListener.get();
        if (iContainerStatusListener != null) {
            iContainerStatusListener.onItemCountChanged(getItemCount(), 0, this.isSearchActive, z);
        }
    }

    public void updateStatusInfo(String str) {
        IContainerData.IContainerStatusListener iContainerStatusListener = this.containerStatusListener.get();
        if (iContainerStatusListener != null) {
            iContainerStatusListener.onUpdateStatusInfo(str);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getShowAlbumArtValue() {
        return onRequestShowAlbumArtValue.invoke(true).booleanValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public Tuple2<Integer, Boolean> getContainerItemHeight() {
        return onRequestContainerItemHeight.invoke(this, new Tuple2<>(56, true));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent(boolean z) {
        if (z) {
            clearItemIdent();
        }
        return RefreshContent();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SelectionContainerAddressIdentifier implements IPlaylistSongContainerIdentifier, IGeneralItemContainerIdentifier {
        private String strid;

        public SelectionContainerAddressIdentifier(String str) {
            this.strid = str;
        }

        @Override // com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier, com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier
        public boolean equals(Object obj) {
            return (obj instanceof SelectionContainerAddressIdentifier) && this.strid.compareTo(((SelectionContainerAddressIdentifier) obj).strid) == 0;
        }

        @Override // com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier, com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier
        public int hashCode() {
            return this.strid.hashCode();
        }
    }
}
