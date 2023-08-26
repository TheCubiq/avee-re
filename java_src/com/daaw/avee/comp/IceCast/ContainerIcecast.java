package com.daaw.avee.comp.IceCast;

import android.content.Context;
import android.database.Cursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.ArrayListFactory;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.TaskLimiter;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.VTaskResult;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterableListContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs;
import com.daaw.avee.comp.LibraryQueueUI.Containers.SearchFilterPlaylistSong;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations;
import com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerIcecast extends FilterableListContainerBase<PlaylistSong, List<PlaylistSong>> {
    private static final int primaryActionSongIndex = 0;
    ActionListenerBase[] itemListenerActionsSongs;
    private ActionListenerBase[] itemListenerActionsSongsHeader;

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

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ContentAccessor2 implements Func1<ContainerBase, List<PlaylistSong>> {
        private MultiList<PlaylistSong, StationEntry> content = null;
        TaskLimiter<Tuple2<MultiList<PlaylistSong, StationEntry>, StatusMsg>> taskLimiter = new TaskLimiter<>();

        @Override // com.daaw.avee.Common.Func.Func1
        public List<PlaylistSong> onInvoke(final ContainerBase containerBase) {
            if (this.content == null && !this.taskLimiter.isTaskRunning(null)) {
                containerBase.setLoadingActive(true);
                this.taskLimiter.CancelOld();
                this.taskLimiter.RunNew(null, IcecastUtils.getIcecastDirectory().getStations(), new VAsyncTask.ResultListener<Tuple2<MultiList<PlaylistSong, StationEntry>, StatusMsg>>() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.ContentAccessor2.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(Tuple2<MultiList<PlaylistSong, StationEntry>, StatusMsg> tuple2, boolean z) {
                        if (z) {
                            return;
                        }
                        MultiList<PlaylistSong, StationEntry> multiList = null;
                        if (tuple2 != null) {
                            MultiList<PlaylistSong, StationEntry> multiList2 = tuple2.obj1;
                            if (tuple2.obj2.hasCriticalError()) {
                                containerBase.updateStatusInfo(tuple2.obj2.getFullMessage());
                            } else {
                                containerBase.updateStatusInfo(null);
                            }
                            multiList = multiList2;
                        } else {
                            containerBase.updateStatusInfo(null);
                        }
                        if (multiList == null) {
                            multiList = new MultiList<>();
                        }
                        ContentAccessor2.this.content = multiList;
                        containerBase.RefreshContent();
                    }
                });
                return null;
            } else if (this.content == null) {
                return null;
            } else {
                containerBase.setLoadingActive(false);
                sortContent(containerBase, this.content);
                return this.content.unmodifiableList1();
            }
        }

        private void sortContent(ContainerBase containerBase, MultiList<PlaylistSong, StationEntry> multiList) {
            Comparator<Tuple2<PlaylistSong, StationEntry>> sortComparator = StationSortingUtils.getSortComparator(ContainerBase.onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 10);
            if (sortComparator != null) {
                try {
                    Collections.sort(multiList, sortComparator);
                } catch (Exception e) {
                    tlog.w("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                    e.printStackTrace();
                }
            }
        }
    }

    public ContainerIcecast(Context context, String str, String str2, int i, int i2) {
        super(context, new ContentAccessor2(), new ArrayListFactory(), str, new VTaskResult(str2), i, new SearchFilterPlaylistSong(context), i2);
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsStations.PlaySingleItemAction.Listener() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations.PlaySingleItemAction.Listener
            protected void onExecute(Context context2, Object obj, List<PlaylistSong> list) {
                list.add(((ThisItemIdentifier) obj).item);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong playlistSong = ((ThisItemIdentifier) obj).item;
                if (playlistSong == null) {
                    return;
                }
                list.add(playlistSong);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong playlistSong = ((ThisItemIdentifier) obj).item;
                if (playlistSong == null) {
                    return;
                }
                list.add(playlistSong);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong playlistSong = ((ThisItemIdentifier) obj).item;
                if (playlistSong == null) {
                    return;
                }
                list.add(playlistSong);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong playlistSong = ((ThisItemIdentifier) obj).item;
                if (playlistSong == null) {
                    return;
                }
                list.add(playlistSong);
            }
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.IceCast.ContainerIcecast.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                PlaylistSong playlistSong = ((ThisItemIdentifier) obj).item;
                if (playlistSong == null) {
                    return new ItemActionsSongs.ItemsDetails(null);
                }
                return new ItemActionsSongs.ItemsDetails(playlistSong);
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
        PlaylistSong playlistSong = (PlaylistSong) getList().get(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        ContainerSongs.getViewStatic(this, new ThisItemIdentifier(playlistSong, i), playlistSong, null, i, i, contentItemViewHolder, this.itemListenerActionsSongs, 0, false, false);
    }

    public void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, getSelectionContainerIdentifier());
        contentItemViewHolder.setImgColorFilter(this.colorImgArt);
        contentItemViewHolder.setImgResource(cursor.getInt(3));
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(cursor.getString(1));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(0);
        contentItemViewHolder.setTxtItemLine2Text(cursor.getString(2));
        contentItemViewHolder.txtItemDuration.setText("");
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        updateSearchQuery(context, str, new SearchFilterPlaylistSong(context));
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
        public PlaylistSong item;
        public int itemPosition;

        public ThisItemIdentifier(PlaylistSong playlistSong, int i) {
            this.itemPosition = i;
            this.item = playlistSong;
        }

        public int hashCode() {
            return this.itemPosition;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.itemPosition == ((ThisItemIdentifier) obj).itemPosition;
        }
    }
}
