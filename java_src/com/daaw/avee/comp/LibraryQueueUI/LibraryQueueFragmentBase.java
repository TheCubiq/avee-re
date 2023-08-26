package com.daaw.avee.comp.LibraryQueueUI;

import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import com.daaw.avee.Common.Events.WeakDelegate3;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.Common.AdViewHolder;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import com.daaw.avee.comp.GlobalSearch.SearchEntryOptions;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsFolders;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsPlaylist;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsQueue;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsStations2;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseAdsCore;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseHeaderViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.util.Collection;
import java.util.List;
/* loaded from: classes.dex */
public class LibraryQueueFragmentBase extends Fragment implements IContainerData.ILibraryContainerDataListener {
    public static final int ACTION_AddByLink = 110;
    public static final int ACTION_AddFolder = 120;
    public static final int ACTION_ClearQueue = 111;
    public static final int ACTION_ClearQueue_Long = 1110;
    public static final int ACTION_FollowCurrent = 114;
    public static final int ACTION_SaveAs = 112;
    public static final int ACTION_ShowAlbumArt = 115;
    public static final int ACTION_Shuffle = 113;
    public static final int ACTION_SwitchView = 125;
    public static WeakEventR<Integer> onRequestShuffleMode = new WeakEventR<>();
    public static WeakEvent2<String, String> onNavigateLibraryAddress = new WeakEvent2<>();
    public static WeakEvent4<Integer, Boolean, String, IGeneralItemContainerIdentifier> onUpdateSearchOptions = new WeakEvent4<>();
    public static WeakEventR<Integer> onRequestRootContainerItemsVisible = new WeakEventR<>();
    public static WeakEvent2<Integer, View> onCreateView = new WeakEvent2<>();
    public static WeakEventR<IPlaylistSongContainerIdentifier> onRequestSongContainerIdentifier = ItemActionsSongs.onRequestSongContainerIdentifier;
    public static WeakEventR<MultiList<PlaylistSong, IItemIdentifier>> onRequestQueueList = ItemActionsSongs.onRequestQueueList;
    public static WeakEvent1<Integer> onQueuePositionChanged = ItemActionsSongs.onQueuePositionChanged;
    public static WeakEvent4<Context, List<PlaylistSong>, Boolean, ContextData> onLibraryQueueUI_ActionSongSendToPlaylist = ItemActionsSongs.onLibraryQueueUI_ActionSongSendToPlaylist;
    public static WeakEvent2<Collection<PlaylistSong>, Integer> onEnqueue = ItemActionsSongs.onEnqueue;
    public static WeakEvent3<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier> onOpen2 = ItemActionsSongs.onOpen2;
    public static WeakEvent2<ContextData, List<ItemActionsSongs.ItemsDetails>> onActionViewDetails = ItemActionsSongs.onActionViewDetails;
    public static WeakEvent2<ContextData, Collection<PlaylistSong>> onSetAsRingtone = ItemActionsSongs.onSetAsRingtone;
    public static WeakEvent1<IItemIdentifier> onSetCurrentQueueItem = ItemActionsQueue.onSetCurrentQueueItem;
    public static WeakEvent1<List<IItemIdentifier>> onRemoveQueueItems = ItemActionsQueue.onRemoveQueueItems;
    public static WeakEventR1<Integer, Boolean> onRequestShowTipState = ItemActionsQueue.onRequestShowTipState;
    public static WeakEvent1<ContextData> onActionShowReorderTip = ItemActionsQueue.onActionShowReorderTip;
    public static WeakEvent3<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier> onOpenOnly = ItemActionsStations.onOpenOnly;
    public static WeakEvent3<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier> onOpenOnly2 = ItemActionsStations2.onOpenOnly;
    public static WeakEvent4<Context, String, String, ContextData> onLibraryQueue2UI_ActionRemoveStandalonePlaylist = ItemActionsPlaylist.onLibraryQueue2UI_ActionRemoveStandalonePlaylist;
    public static WeakEvent4<Context, Long, String, ContextData> onLibraryQueueUI_ActionRenamePlaylist = ItemActionsPlaylist.onLibraryQueueUI_ActionRenamePlaylist;
    public static WeakEvent4<Context, Long, String, ContextData> onLibraryQueueUI_ActionDeletePlaylist = ItemActionsPlaylist.onLibraryQueueUI_ActionDeletePlaylist;
    public static WeakEvent3<Context, String, String> onActionRemoveFolder = ItemActionsFolders.onActionRemoveFolder;
    public static WeakEvent2<Context, List<String>> onActionAddToFolders = ItemActionsFolders.onActionAddToFolders;
    public static WeakEvent3<ActionListenerBase[], Boolean, ItemSelection.One<Object>> onItemSelected = ContentItemViewHolder.onItemSelected;
    public static WeakEventR<Boolean> onRequestIsSelectingEnabled = ContentItemViewHolder.onRequestIsSelectingEnabled;
    public static WeakEvent1<Object> onItemInteracted = ContentItemViewHolder.onItemInteracted;
    public static WeakEvent3<ContextData, Integer, View> onAction = BaseHeaderViewHolder.onAction;
    public static WeakEvent1<ContextData> onLibraryQueue2UI_ActionScanStandalonePlaylist = BaseHeaderViewHolder.onLibraryQueue2UI_ActionScanStandalonePlaylist;
    public static WeakEvent3<long[], List<String>, ContextData> onActionCreatePlaylist = BaseHeaderViewHolder.onActionCreatePlaylist;
    public static WeakEventR<Boolean> onUIRequestFollowCurrentValue = BaseHeaderViewHolder.onUIRequestFollowCurrentValue;
    public static WeakEvent2<ContextData, View> onActionChooseSortStations = BaseHeaderViewHolder.onActionChooseSortStations;
    public static WeakEvent2<ContextData, View> onActionChooseSortFiles = BaseHeaderViewHolder.onActionChooseSortFiles;
    public static WeakEvent2<ContextData, View> onActionChooseSort = BaseHeaderViewHolder.onActionChooseSort;
    public static WeakEventR3<AdViewHolder, Integer, Integer, Boolean> onShowAdView = BaseAdsCore.onShowAdView;
    public static WeakEventR2<Integer, IGeneralItemContainerIdentifier, String> onRequestSearchQuery = ContainerBase.onRequestSearchQuery;
    public static WeakEventR2<Integer, IGeneralItemContainerIdentifier, SortDesign.SortDesc> onRequestCurrentSortDesc = ContainerBase.onRequestCurrentSortDesc;
    public static WeakEventR3<Integer, IGeneralItemContainerIdentifier, File, Boolean> onRequestFilterFileResult = ContainerBase.onRequestFilterFileResult;
    public static WeakEventR1<Class<?>, Boolean> onRequestSectionOpenedState = ContainerBase.onRequestSectionOpenedState;
    public static WeakEvent2<Boolean, Class<?>> onSetSectionOpened = ContainerBase.onSetSectionOpened;
    public static WeakEvent3<Integer, Integer, List<Integer>> onMoveQueueItems = ContainerBase.onMoveQueueItems;
    public static WeakEvent4<AlbumArtRequest, ImageView, Boolean, Boolean> onRequestAlbumArt = ContainerBase.onRequestAlbumArt;
    public static WeakEventR<Boolean> onRequestShowAlbumArtValue = ContainerBase.onRequestShowAlbumArtValue;
    public static WeakEventR1<ItemSelection.One, Boolean> onRequestContainsItemSelection = ContainerBase.onRequestContainsItemSelection;
    public static WeakEventR2<AsyncTask, Integer, Boolean> onCompareSearchTask = ContainerBase.onCompareSearchTask;
    public static WeakEvent3<AsyncTask, Integer, Object> onStartingSearchTask = ContainerBase.onStartSearchTask;
    public static WeakEvent1<Integer> onContainerDataSetChanged = ContainerBase.onContainerDataSetChanged;
    public static WeakEventR1<IContainerData, Tuple2<Integer, Boolean>> onRequestContainerItemHeight = ContainerBase.onRequestContainerItemHeight;
    public static WeakDelegate3<ContentItemViewHolder, PlaylistSong.Data, Boolean> onPlaylistSongDataAvailableToViewHolder = ContainerSongs.onPlaylistSongDataAvailableToViewHolder;
    private static WeakEvent1<Integer> internalOnShuffleModeChanged = new WeakEvent1<>();
    private static WeakEvent1<Boolean> internalOnFollowCurrentValueChanged = new WeakEvent1<>();
    private static WeakEvent1<Boolean> internalOnShowAlbumArtValueChanged = new WeakEvent1<>();

    public static void onShuffleModeChanged(int i) {
        internalOnShuffleModeChanged.invoke(Integer.valueOf(i));
    }

    public static void onFollowCurrentValueChanged(boolean z) {
        internalOnFollowCurrentValueChanged.invoke(Boolean.valueOf(z));
    }

    public static void onShowAlbumArtValueChanged(boolean z) {
        internalOnShowAlbumArtValueChanged.invoke(Boolean.valueOf(z));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public void subscribeWeakShuffleModeChanged(WeakEvent1.Handler<Integer> handler, List<Object> list) {
        internalOnShuffleModeChanged.subscribeWeak(handler, list);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public void subscribeWeakFollowCurrentValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list) {
        internalOnFollowCurrentValueChanged.subscribeWeak(handler, list);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public void subscribeWeakShowAlbumArtValueChanged(WeakEvent1.Handler<Boolean> handler, List<Object> list) {
        internalOnShowAlbumArtValueChanged.subscribeWeak(handler, list);
    }

    public static SearchEntryOptions getSearchEntryOptions(Context context, ViewAdapter viewAdapter) {
        if (viewAdapter == null) {
            return SearchEntryOptions.refuse;
        }
        String[] strArr = new String[1];
        IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr = new IGeneralItemContainerIdentifier[1];
        viewAdapter.getContainerData().getSearchOptions(context, strArr, iGeneralItemContainerIdentifierArr);
        if (strArr[0] == null || strArr[0].isEmpty()) {
            SearchEntryOptions searchEntryOptions = new SearchEntryOptions();
            searchEntryOptions.enabled = false;
            searchEntryOptions.hint = "";
            searchEntryOptions.containerIdentifier = null;
            return searchEntryOptions;
        }
        IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier = iGeneralItemContainerIdentifierArr[0];
        String str = strArr[0];
        SearchEntryOptions searchEntryOptions2 = new SearchEntryOptions();
        searchEntryOptions2.enabled = true;
        searchEntryOptions2.hint = str;
        searchEntryOptions2.containerIdentifier = iGeneralItemContainerIdentifier;
        return searchEntryOptions2;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public void onNavigateForward(String str, String str2) {
        onNavigateLibraryAddress.invoke(str, str2);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public String makeChildAddress(String str, String str2) {
        String str3;
        if (str2.length() <= 0) {
            return str;
        }
        if (str.length() <= 0) {
            return str + str2;
        }
        if (str.charAt(str.length() - 1) == '/') {
            if (str2.charAt(0) != '/') {
                str3 = str + str2;
            } else {
                str3 = str + str2.substring(1);
            }
        } else if (str2.charAt(0) != '/') {
            str3 = str + "/" + str2;
        } else {
            str3 = str + str2;
        }
        int length = str3.length();
        if (length <= 0 || str3.charAt(length - 1) != '/') {
            return str3 + "/";
        }
        return str3;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public int onRequestShuffleMode() {
        return onRequestShuffleMode.invoke(0).intValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData.ILibraryContainerDataListener
    public int onRequestRootContainerItemsVisible() {
        return onRequestRootContainerItemsVisible.invoke(0).intValue();
    }
}
