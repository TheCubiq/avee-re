package com.daaw.avee.comp.Shoutcast;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.ArrayListFactory;
import com.daaw.avee.Common.Events.WeakDelegate3;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.IceCast.StationEntry;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterableListContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2;
import com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerShoutcast extends FilterableListContainerBase<ShoutcastStationEntry, List<ShoutcastStationEntry>> {
    public static WeakDelegate3<ContentItemViewHolder, ShoutcastStationEntry, Boolean> onStationDataAvailableToViewHolder = new WeakDelegate3<>();
    private static final int primaryActionSongIndex = 0;
    ActionListenerBase[] itemListenerActionsSongs;
    private ActionListenerBase[] itemListenerActionsSongsHeader;

    private PlaylistSong getPlaylistSongFromStation(ShoutcastStationEntry shoutcastStationEntry) {
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return "";
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ListContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    public static void sortContent(ContainerBase containerBase, MultiList<PlaylistSong, ShoutcastStationEntry> multiList) {
        final Comparator<Tuple2<PlaylistSong, StationEntry>> sortComparator = StationSortingUtils.getSortComparator(onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 10);
        Comparator<Tuple2<PlaylistSong, ShoutcastStationEntry>> comparator = new Comparator<Tuple2<PlaylistSong, ShoutcastStationEntry>>() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.5
            @Override // java.util.Comparator
            public int compare(Tuple2<PlaylistSong, ShoutcastStationEntry> tuple2, Tuple2<PlaylistSong, ShoutcastStationEntry> tuple22) {
                return sortComparator.compare(new Tuple2(tuple2.obj1, tuple2.obj2), new Tuple2(tuple22.obj1, tuple22.obj2));
            }
        };
        if (sortComparator != null) {
            try {
                Collections.sort(multiList, comparator);
            } catch (Exception e) {
                tlog.w("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                e.printStackTrace();
            }
        }
    }

    public ContainerShoutcast(Context context, Func1<ContainerBase, List<ShoutcastStationEntry>> func1, String str, IVAsyncTask<String> iVAsyncTask, int i, int i2) {
        super(context, func1, new ArrayListFactory(), str, iVAsyncTask, i, new SearchFilterStation(context), i2);
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsStations2.PlaySingleItemAction.Listener() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.PlaySingleItemAction.Listener
            protected VAsyncTask<List<PlaylistSong>> onExecute(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                return ShoutcastUtils.getShoutcastDirectory().tuneInStation(thisItemIdentifier.item.getShoutcastBase(), thisItemIdentifier.item.getShoutcastId());
            }
        }, new ItemActionsStations2.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.ItemActionEnqueue.EnqueueActionListener2
            protected VAsyncTask<List<PlaylistSong>> onEnqueue(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                return ShoutcastUtils.getShoutcastDirectory().tuneInStation(thisItemIdentifier.item.getShoutcastBase(), thisItemIdentifier.item.getShoutcastId());
            }
        }, new ItemActionsStations2.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected VAsyncTask<List<PlaylistSong>> onEnqueue(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                return ShoutcastUtils.getShoutcastDirectory().tuneInStation(thisItemIdentifier.item.getShoutcastBase(), thisItemIdentifier.item.getShoutcastId());
            }
        }, new ItemActionsStations2.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2.SendToItemAction.SendToActionListener
            protected VAsyncTask<List<PlaylistSong>> onSendTo(Context context2, Object obj) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                return ShoutcastUtils.getShoutcastDirectory().tuneInStation(thisItemIdentifier.item.getShoutcastBase(), thisItemIdentifier.item.getShoutcastId());
            }
        }};
        this.itemListenerActionsSongsHeader = new ActionListenerBase[0];
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 14, 15), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ShoutcastStationEntry shoutcastStationEntry = (ShoutcastStationEntry) getList().get(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getViewStatic(this, new ThisItemIdentifier(shoutcastStationEntry, i), shoutcastStationEntry, null, i, i, contentItemViewHolder, this.itemListenerActionsSongs, 0, false, false);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        updateSearchQuery(context, str, new SearchFilterStation(context));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
        ActionListenerBase[] actionListenerBaseArr = this.itemListenerActionsSongsHeader;
        if (i < actionListenerBaseArr.length) {
            actionListenerBaseArr[i].execute(contextData, null);
        }
    }

    /* loaded from: classes.dex */
    static class ThisItemIdentifier {
        public ShoutcastStationEntry item;
        public int itemPosition;

        public ThisItemIdentifier(ShoutcastStationEntry shoutcastStationEntry, int i) {
            this.itemPosition = i;
            this.item = shoutcastStationEntry;
        }

        public int hashCode() {
            return this.itemPosition;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.itemPosition == ((ThisItemIdentifier) obj).itemPosition;
        }
    }

    public static void getViewStatic(ContainerBase containerBase, Object obj, ShoutcastStationEntry shoutcastStationEntry, IItemIdentifier iItemIdentifier, int i, int i2, ContentItemViewHolder contentItemViewHolder, ActionListenerBase[] actionListenerBaseArr, int i3, boolean z, boolean z2) {
        boolean booleanValue = ContainerBase.onRequestShowAlbumArtValue.invoke(false).booleanValue();
        contentItemViewHolder.setToDefault(containerBase, obj, containerBase.getSelectionContainerIdentifier());
        contentItemViewHolder.dataId = shoutcastStationEntry.url;
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(actionListenerBaseArr, i3, containerBase, z, z2, new Action1<ContentItemViewHolder>() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcast.6
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(ContentItemViewHolder contentItemViewHolder2) {
            }
        });
        if (z2) {
            contentItemViewHolder.setBtnItemMoreImage(R.drawable.ic_feather);
        }
        if (booleanValue) {
            contentItemViewHolder.txtNum.setVisibility(8);
        } else {
            contentItemViewHolder.txtNum.setVisibility(0);
            TextView textView = contentItemViewHolder.txtNum;
            textView.setText((i + 1) + ".");
        }
        contentItemViewHolder.refreshSelection();
        onStationDataAvailableToViewHolder.invoke(contentItemViewHolder, shoutcastStationEntry, Boolean.valueOf(booleanValue));
    }
}
