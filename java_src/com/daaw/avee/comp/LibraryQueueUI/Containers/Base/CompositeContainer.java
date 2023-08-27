package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;

import android.content.Context;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class CompositeContainer implements IContainerData {
    private AdapterFactory adapterFactory;
    private IContainerData[] containerData;
    private ContainerStatusListenerWrap[] containerStatusListenerWraps;
    private int dispIconResId;
    private IVAsyncTask<String> dispString;
    private LibraryContainerDataListenerWrap[] libraryContainerDataListenerWrap;
    private IContainerData.IOnDraggingListener onDraggingListener;
    private IContainerData.IContainerStatusListener containerStatusListener = null;
    private IContainerData.ILibraryContainerDataListener libraryContainerDataListener = null;

    /* loaded from: classes.dex */
    public interface AdapterFactory {
        ViewAdapter createOrGetAdapter(Context context, int i, IContainerData iContainerData);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getSectionOpened() {
        return true;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setSectionOpenedState(boolean z) {
    }

    public CompositeContainer(IContainerData[] iContainerDataArr, IVAsyncTask<String> iVAsyncTask, int i, AdapterFactory adapterFactory) {
        this.containerData = iContainerDataArr;
        this.dispString = iVAsyncTask;
        this.dispIconResId = i;
        this.adapterFactory = adapterFactory;
        this.containerStatusListenerWraps = new ContainerStatusListenerWrap[iContainerDataArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ContainerStatusListenerWrap[] containerStatusListenerWrapArr = this.containerStatusListenerWraps;
            if (i3 >= containerStatusListenerWrapArr.length) {
                break;
            }
            containerStatusListenerWrapArr[i3] = new ContainerStatusListenerWrap();
            i3++;
        }
        this.libraryContainerDataListenerWrap = new LibraryContainerDataListenerWrap[iContainerDataArr.length];
        while (true) {
            LibraryContainerDataListenerWrap[] libraryContainerDataListenerWrapArr = this.libraryContainerDataListenerWrap;
            if (i2 >= libraryContainerDataListenerWrapArr.length) {
                return;
            }
            libraryContainerDataListenerWrapArr[i2] = new LibraryContainerDataListenerWrap(i2);
            i2++;
        }
    }

    static String makePrefix(int i) {
        return String.format(Locale.US, "%05d", Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContainerStatusListener() {
        ContainerStatusListenerWrap[] containerStatusListenerWrapArr;
        if (this.containerStatusListener == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        for (ContainerStatusListenerWrap containerStatusListenerWrap : this.containerStatusListenerWraps) {
            i += containerStatusListenerWrap.itemCount;
            i2 += containerStatusListenerWrap.totalTime;
            if (containerStatusListenerWrap.searchingActive) {
                z = true;
            }
            if (containerStatusListenerWrap.loadingActive) {
                z2 = true;
            }
        }
        this.containerStatusListener.onItemCountChanged(i, i2, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContainerStatusListenerInfo() {
        ContainerStatusListenerWrap[] containerStatusListenerWrapArr;
        if (this.containerStatusListener == null) {
            return;
        }
        String str = "";
        for (ContainerStatusListenerWrap containerStatusListenerWrap : this.containerStatusListenerWraps) {
            str = str + containerStatusListenerWrap.info;
        }
        this.containerStatusListener.onUpdateStatusInfo(str);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createOrGetAdapter(Context context) {
        return createOrGetAdapter(context, -1);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createOrGetAdapter(Context context, int i) {
        return this.adapterFactory.createOrGetAdapter(context, i, this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IVAsyncTask<String> getDisplayName() {
        return this.dispString;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public int getDisplayIconResId() {
        return this.dispIconResId;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public String getLibraryAddress() {
        return this.containerData[0].getLibraryAddress();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public String makeChildAddress(String str) {
        return this.containerData[0].makeChildAddress(str);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        if (str.length() > 5) {
            String substring = str.substring(0, 5);
            String substring2 = str.substring(5);
            int strToIntSafe = Utils.strToIntSafe(substring, -1);
            if (strToIntSafe >= 0) {
                IContainerData[] iContainerDataArr = this.containerData;
                if (strToIntSafe < iContainerDataArr.length) {
                    return iContainerDataArr[strToIntSafe].createChildAdapter(context, substring2);
                }
            }
            tlog.w("invalid prefix value " + strToIntSafe);
            return null;
        }
        tlog.w("invalid relativeAddressItem <" + str + ">");
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean onListViewClick(int i, Context context) {
        Assert.fail();
        return false;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean containsContainerIdentifier(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        for (IContainerData iContainerData : this.containerData) {
            if (iContainerData.containsContainerIdentifier(iGeneralItemContainerIdentifier)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IContainerData.ILibraryContainerDataListener getLibraryContainerDataListener() {
        IContainerData[] iContainerDataArr = this.containerData;
        if (iContainerDataArr.length > 0) {
            return iContainerDataArr[0].getLibraryContainerDataListener();
        }
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        this.containerData[0].getSearchOptions(context, strArr, iGeneralItemContainerIdentifierArr);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        for (IContainerData iContainerData : this.containerData) {
            iContainerData.updateSearchQuery(context, str);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
        for (IContainerData iContainerData : this.containerData) {
            iContainerData.executeItemActionHeader(contextData, i);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setOnDraggingListener(IContainerData.IOnDraggingListener iOnDraggingListener) {
        this.onDraggingListener = iOnDraggingListener;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setContainerStatusListener(WeakReference<IContainerData.IContainerStatusListener> weakReference) {
        this.containerStatusListener = weakReference.get();
        int i = 0;
        while (true) {
            IContainerData[] iContainerDataArr = this.containerData;
            if (i >= iContainerDataArr.length) {
                return;
            }
            iContainerDataArr[i].setContainerStatusListener(new WeakReference<>(this.containerStatusListenerWraps[i]));
            i++;
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public IContainerData.IOnDraggingListener getOnDraggingListener() {
        return this.onDraggingListener;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setLibraryContainerDataListener(WeakReference<IContainerData.ILibraryContainerDataListener> weakReference) {
        this.libraryContainerDataListener = weakReference.get();
        int i = 0;
        while (true) {
            IContainerData[] iContainerDataArr = this.containerData;
            if (i >= iContainerDataArr.length) {
                return;
            }
            iContainerDataArr[i].setLibraryContainerDataListener(new WeakReference<>(this.libraryContainerDataListenerWrap[i]));
            i++;
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public int getItemCount() {
        int i = 0;
        for (IContainerData iContainerData : this.containerData) {
            i += iContainerData.getItemCount();
        }
        return i;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getShowAlbumArtValue() {
        return this.containerData[0].getShowAlbumArtValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public Tuple2<Integer, Boolean> getContainerItemHeight() {
        return this.containerData[0].getContainerItemHeight();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent() {
        boolean z = true;
        int i = 0;
        while (true) {
            IContainerData[] iContainerDataArr = this.containerData;
            if (i >= iContainerDataArr.length) {
                return z;
            }
            if (!iContainerDataArr[i].RefreshContent()) {
                z = false;
            }
            i++;
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent(boolean z) {
        boolean z2 = true;
        int i = 0;
        while (true) {
            IContainerData[] iContainerDataArr = this.containerData;
            if (i >= iContainerDataArr.length) {
                return z2;
            }
            if (!iContainerDataArr[i].RefreshContent(z)) {
                z2 = false;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class ContainerStatusListenerWrap implements IContainerData.IContainerStatusListener {
        int itemCount = 0;
        int totalTime = 0;
        boolean searchingActive = false;
        boolean loadingActive = false;
        String info = "";

        ContainerStatusListenerWrap() {
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
        public void onItemCountChanged(int i, int i2, boolean z, boolean z2) {
            this.itemCount = i;
            this.totalTime = i2;
            this.searchingActive = z;
            this.loadingActive = z2;
            CompositeContainer.this.updateContainerStatusListener();
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IContainerStatusListener
        public void onUpdateStatusInfo(String str) {
            this.info = str;
            CompositeContainer.this.updateContainerStatusListenerInfo();
        }
    }

    /* loaded from: classes.dex */
    class LibraryContainerDataListenerWrap implements IContainerData.ILibraryContainerDataListener {
        int index;

        public LibraryContainerDataListenerWrap(int i) {
            this.index = i;
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public void onNavigateForward(String str, String str2) {
            IContainerData.ILibraryContainerDataListener iLibraryContainerDataListener = CompositeContainer.this.libraryContainerDataListener;
            iLibraryContainerDataListener.onNavigateForward(str, CompositeContainer.makePrefix(this.index) + str2);
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public String makeChildAddress(String str, String str2) {
            IContainerData.ILibraryContainerDataListener iLibraryContainerDataListener = CompositeContainer.this.libraryContainerDataListener;
            return iLibraryContainerDataListener.makeChildAddress(str, CompositeContainer.makePrefix(this.index) + str2);
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public int onRequestShuffleMode() {
            return CompositeContainer.this.libraryContainerDataListener.onRequestShuffleMode();
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public void subscribeWeakShuffleModeChanged(WeakEvent1.Handler<Integer> handler, List<Object> list) {
            CompositeContainer.this.libraryContainerDataListener.subscribeWeakShuffleModeChanged(handler, list);
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public void subscribeWeakFollowCurrentValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list) {
            CompositeContainer.this.libraryContainerDataListener.subscribeWeakFollowCurrentValueChanged(handler, list);
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public void subscribeWeakShowAlbumArtValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list) {
            CompositeContainer.this.libraryContainerDataListener.subscribeWeakShowAlbumArtValueChanged(handler, list);
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
        public int onRequestRootContainerItemsVisible() {
            return CompositeContainer.this.libraryContainerDataListener.onRequestRootContainerItemsVisible();
        }
    }
}
