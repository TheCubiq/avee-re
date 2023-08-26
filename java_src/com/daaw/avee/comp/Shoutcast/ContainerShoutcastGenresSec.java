package com.daaw.avee.comp.Shoutcast;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.ArrayListFactory;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.StatusMsg;
import com.daaw.avee.Common.TaskLimiter;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.IceCast.GenreDesc;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterableListContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.SearchFilterGenreDesc;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerShoutcastGenresSec extends FilterableListContainerBase<GenreDesc, List<GenreDesc>> {
    private static final int primaryActionIndex = 0;
    ActionListenerBase[] itemListenerActionsSongs;
    private ActionListenerBase[] itemListenerActionsSongsHeader;
    private String parentGenreId;

    private static VAsyncTask<MultiList<PlaylistSong, ShoutcastStationEntry>> getChildItemsGenresPri(Context context, ContainerBase containerBase, String str, List<GenreDesc> list) {
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ListContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class ChildContentAccessorGenresSecondary implements Func1<ContainerBase, List<ShoutcastStationEntry>> {
        private String genreId;
        private MultiList<PlaylistSong, ShoutcastStationEntry> content = null;
        TaskLimiter<Tuple2<MultiList<PlaylistSong, ShoutcastStationEntry>, StatusMsg>> taskLimiter = new TaskLimiter<>();

        ChildContentAccessorGenresSecondary(String str) {
            this.genreId = str;
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public List<ShoutcastStationEntry> onInvoke(final ContainerBase containerBase) {
            if (this.content == null && !this.taskLimiter.isTaskRunning(null)) {
                containerBase.setLoadingActive(true);
                this.taskLimiter.CancelOld();
                this.taskLimiter.RunNew(null, ShoutcastUtils.getShoutcastDirectory().getStations(this.genreId), new VAsyncTask.ResultListener<Tuple2<MultiList<PlaylistSong, ShoutcastStationEntry>, StatusMsg>>() { // from class: com.daaw.avee.comp.Shoutcast.ContainerShoutcastGenresSec.ChildContentAccessorGenresSecondary.1
                    @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                    public void onResult(Tuple2<MultiList<PlaylistSong, ShoutcastStationEntry>, StatusMsg> tuple2, boolean z) {
                        if (z) {
                            return;
                        }
                        MultiList<PlaylistSong, ShoutcastStationEntry> multiList = null;
                        if (tuple2 != null) {
                            MultiList<PlaylistSong, ShoutcastStationEntry> multiList2 = tuple2.obj1;
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
                        ChildContentAccessorGenresSecondary.this.content = multiList;
                        containerBase.RefreshContent();
                    }
                });
                return null;
            } else if (this.content == null) {
                return null;
            } else {
                containerBase.setLoadingActive(false);
                ContainerShoutcast.sortContent(containerBase, this.content);
                return this.content.unmodifiableList2();
            }
        }
    }

    public ContainerShoutcastGenresSec(Context context, String str, Func1<ContainerBase, List<GenreDesc>> func1, String str2, IVAsyncTask<String> iVAsyncTask, int i, int i2) {
        super(context, func1, new ArrayListFactory(), str2, iVAsyncTask, i, new SearchFilterGenreDesc(context), i2);
        this.itemListenerActionsSongs = new ActionListenerBase[0];
        this.itemListenerActionsSongsHeader = new ActionListenerBase[0];
        this.parentGenreId = str;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 9, 15), this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return ((GenreDesc) getItem(i)).id;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        ContainerShoutcast containerShoutcast = new ContainerShoutcast(context, new ChildContentAccessorGenresSecondary(str), makeChildAddress(str), ShoutcastUtils.getGenreName2(this.parentGenreId, str), 0, this.pageIndex);
        containerShoutcast.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
        return containerShoutcast.createOrGetAdapter(context, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView((GenreDesc) getList().get(i), i, contentItemViewHolder);
    }

    public void getView(GenreDesc genreDesc, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(genreDesc), getSelectionContainerIdentifier());
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(this.itemListenerActionsSongs, 0, this);
        contentItemViewHolder.imgArt.setVisibility(8);
        contentItemViewHolder.setImageDrawable(null);
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(reviewUIString(contentItemViewHolder.txtItemLine1.getContext(), genreDesc.name));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(8);
        contentItemViewHolder.txtItemDuration.setText("");
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Stations_search);
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        updateSearchQuery(context, str, new SearchFilterGenreDesc(context));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
        ActionListenerBase[] actionListenerBaseArr = this.itemListenerActionsSongsHeader;
        if (i < actionListenerBaseArr.length) {
            actionListenerBaseArr[i].execute(contextData, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        public GenreDesc item;

        public ThisItemIdentifier(GenreDesc genreDesc) {
            this.item = genreDesc;
        }

        public int hashCode() {
            return this.item.id.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.item.id.equals(((ThisItemIdentifier) obj).item.id);
        }
    }

    public static String reviewUIString(Context context, String str) {
        return str.isEmpty() ? context.getString(R.string.unnamed_title) : str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    private GenreDesc getGenreById(String str) {
        if (str == null) {
            return null;
        }
        int size = getList().size();
        for (int i = 0; i < size; i++) {
            GenreDesc genreDesc = (GenreDesc) getList().get(i);
            if (str.equals(((GenreDesc) getList().get(i)).id)) {
                return genreDesc;
            }
        }
        return null;
    }
}
