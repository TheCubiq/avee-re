package com.daaw.avee.comp.LibraryQueueUI;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.Design.PlaybackControlsDesign;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.GlobalSearch.SearchEntryOptions;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.emtronics.dragsortrecycler.DragSortRecycler;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class Fragment1 extends LibraryQueueFragmentBase {
    private ContainerSongs dataAdapter;
    private ArrayDeque<IItemIdentifier> lastQueuePositions = new ArrayDeque<>();
    private RecyclerView recyclerViewItems;

    public void onServiceDisconnected(boolean z) {
    }

    public static Fragment1 newInstance() {
        Fragment1 fragment1 = new Fragment1();
        fragment1.setArguments(new Bundle());
        return fragment1;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        onServiceDisconnected(false);
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_1, viewGroup, false);
        UtilsUI.setStatusBarDimensions(inflate.findViewById(R.id.viewStatusBarBg));
        onCreateView.invoke(1, inflate.findViewById(R.id.viewActionBarBgSkin));
        this.recyclerViewItems = (RecyclerView) inflate.findViewById(R.id.recyclerViewItems);
        this.recyclerViewItems.setLayoutManager(new LinearLayoutManager(getActivity()));
        ContainerSongs containerSongs = new ContainerSongs(getActivity(), new Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>>() { // from class: com.daaw.avee.comp.LibraryQueueUI.Fragment1.1
            @Override // com.daaw.avee.Common.Func.Func1
            public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
                return LibraryQueueFragmentBase.onRequestQueueList.invoke(new MultiList<>());
            }
        }, "nowplaying", "Playlist", true, 1);
        this.dataAdapter = containerSongs;
        containerSongs.setLibraryContainerDataListener(new WeakReference<>(this));
        this.recyclerViewItems.setAdapter(this.dataAdapter.createOrGetAdapter(getActivity(), 1));
        RecyclerView recyclerView = this.recyclerViewItems;
        recyclerView.addItemDecoration(new SpacesItemDecoration(1, UtilsUI.getAttrColor(recyclerView, (int) R.attr.containerBackgroundDark)));
        final DragSortRecycler dragSortRecycler = new DragSortRecycler();
        dragSortRecycler.setViewHandleId(R.id.btnItemMore);
        dragSortRecycler.setFloatingAlpha(0.4f);
        dragSortRecycler.setFloatingBgColor(getActivity().getResources().getColor(R.color.black_alpha_2));
        dragSortRecycler.setAutoScrollSpeed(0.3f);
        dragSortRecycler.setAutoScrollWindow(0.1f);
        dragSortRecycler.setOnItemMovedListener(new DragSortRecycler.OnItemMovedListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Fragment1.2
            @Override // com.emtronics.dragsortrecycler.DragSortRecycler.OnItemMovedListener
            public void onItemMoved(int i, int i2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(0);
                ((ViewAdapter) Fragment1.this.recyclerViewItems.getAdapter()).onItemsMoved(i, i2, arrayList);
            }
        });
        this.recyclerViewItems.addItemDecoration(dragSortRecycler);
        this.recyclerViewItems.addOnItemTouchListener(dragSortRecycler);
        this.recyclerViewItems.addOnScrollListener(dragSortRecycler.getScrollListener());
        this.dataAdapter.setOnDraggingListener(new IContainerData.IOnDraggingListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Fragment1.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.IOnDraggingListener
            public void onStartDragging(View view) {
                dragSortRecycler.StartDragging(view);
            }
        });
        updateTrackList(onRequestQueueList.invoke(new MultiList<>()));
        updateTrackInfo(PlaybackControlsDesign.fieldQueuePosition, PlaybackControlsDesign.currentTrack, PlaybackControlsDesign.fieldsongData, PlaybackControlsDesign.currentItemIdent);
        updateSearchInfo();
        return inflate;
    }

    boolean isViewCreated() {
        return this.recyclerViewItems != null;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void updateQueueItems() {
        ViewAdapter viewAdapter;
        if (isViewCreated() && (viewAdapter = (ViewAdapter) this.recyclerViewItems.getAdapter()) != null) {
            viewAdapter.notifyDataSetChanged();
        }
    }

    public void updateTrackInfo(int i, PlaylistSong playlistSong, PlaylistSong.Data data, IItemIdentifier iItemIdentifier) {
        RecyclerView recyclerView;
        ViewAdapter viewAdapter;
        if (getActivity() == null || (recyclerView = this.recyclerViewItems) == null || (viewAdapter = (ViewAdapter) recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.dataAdapter != null) {
            if (this.lastQueuePositions.size() > 1) {
                this.lastQueuePositions.removeFirst();
            }
            if (iItemIdentifier != null && (this.lastQueuePositions.peekLast() == null || !this.lastQueuePositions.peekLast().equals(iItemIdentifier))) {
                this.lastQueuePositions.add(iItemIdentifier);
            }
            Iterator<IItemIdentifier> it = this.lastQueuePositions.iterator();
            while (it.hasNext()) {
                int positionByIItemIdentifier = this.dataAdapter.getPositionByIItemIdentifier(it.next());
                if (positionByIItemIdentifier >= 0) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.recyclerViewItems.findViewHolderForAdapterPosition(viewAdapter.dataPositionToPosition(positionByIItemIdentifier));
                    if (findViewHolderForAdapterPosition instanceof ContentItemViewHolder) {
                        ((ContentItemViewHolder) findViewHolderForAdapterPosition).refreshSelection();
                    }
                }
            }
        } else {
            viewAdapter.notifyDataSetChanged();
        }
        if (onUIRequestFollowCurrentValue.invoke(false).booleanValue()) {
            int integer = getResources().getInteger(R.integer.player_controls_height_in_items);
            if (i >= Math.max(((LinearLayoutManager) this.recyclerViewItems.getLayoutManager()).findLastVisibleItemPosition() - (integer + 1), 0)) {
                this.recyclerViewItems.scrollToPosition(viewAdapter.dataPositionToPosition(i + integer));
            } else {
                this.recyclerViewItems.scrollToPosition(viewAdapter.dataPositionToPosition(i));
            }
        }
    }

    public void updateTrackList(MultiList<PlaylistSong, IItemIdentifier> multiList) {
        ContainerSongs containerSongs = this.dataAdapter;
        if (containerSongs != null) {
            containerSongs.RefreshContent(true);
        }
    }

    public void refreshTrackList(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        ViewAdapter viewAdapter = (ViewAdapter) this.recyclerViewItems.getAdapter();
        if (viewAdapter == null || !viewAdapter.getContainerData().containsContainerIdentifier(iGeneralItemContainerIdentifier)) {
            return;
        }
        viewAdapter.notifyDataSetChanged();
    }

    public void updateSearchQuery(Context context, String str) {
        if (this.recyclerViewItems != null) {
            this.dataAdapter.updateSearchQuery(context, str);
        }
    }

    public void updateSearchInfo() {
        Assert.assertNotNull(getActivity());
        SearchEntryOptions searchEntryOptions = getSearchEntryOptions();
        onUpdateSearchOptions.invoke(1, Boolean.valueOf(searchEntryOptions.enabled), searchEntryOptions.hint, searchEntryOptions.containerIdentifier);
    }

    public SearchEntryOptions getSearchEntryOptions() {
        Activity activity = getActivity();
        if (activity == null) {
            return SearchEntryOptions.refuse;
        }
        RecyclerView recyclerView = this.recyclerViewItems;
        if (recyclerView == null) {
            return SearchEntryOptions.refuse;
        }
        ViewAdapter viewAdapter = (ViewAdapter) recyclerView.getAdapter();
        if (viewAdapter == null) {
            return SearchEntryOptions.refuse;
        }
        return getSearchEntryOptions(activity, viewAdapter);
    }
}
