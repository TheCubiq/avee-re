package com.daaw.avee.Design;

import android.app.FragmentManager;
import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import com.daaw.avee.Common.Events.WeakDelegate3;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.MainActivity;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtFactory;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.IAlbumArtCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.AppTips.TipReorderDialog;
import com.daaw.avee.comp.Common.DirectoryPickerDialog;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ContextualActionBar;
import com.daaw.avee.comp.ContextualActionBar.ItemSelection;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerRootLocal;
import com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerSongs;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.Dialog.AddLinkDialog;
import com.daaw.avee.comp.LibraryQueueUI.Dialog.SongDetailsDialog;
import com.daaw.avee.comp.LibraryQueueUI.Dialog.ViewSettingsDialog;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.Fragment1;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.PlaybackQueue.QueueCore;
import com.daaw.avee.comp.Playlists.Dialog.PlaylistPickerDialog;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class LibraryQueueUIDesign {
    private Tuple2<Integer, Boolean> containerItemViewHeightDefaultPixels;
    private Tuple2<Integer, Boolean> containerItemViewHeightPixels;
    private List<Object> listenerRefHolder = new LinkedList();
    private boolean containerItemViewShowSecondInfo = true;
    private int showRootContainerStreams = 0;

    Tuple2<Integer, Boolean> getContainerItemViewHeightDefaultPixels() {
        if (this.containerItemViewHeightDefaultPixels == null) {
            this.containerItemViewHeightDefaultPixels = updateContainerItemViewHeight(-1);
        }
        if (this.containerItemViewHeightDefaultPixels == null) {
            this.containerItemViewHeightDefaultPixels = new Tuple2<>(56, true);
        }
        return this.containerItemViewHeightDefaultPixels;
    }

    Tuple2<Integer, Boolean> getContainerItemViewHeightPixels() {
        if (this.containerItemViewHeightPixels == null) {
            this.containerItemViewHeightPixels = updateContainerItemViewHeight(-1);
        }
        if (this.containerItemViewHeightPixels == null) {
            this.containerItemViewHeightPixels = new Tuple2<>(56, true);
        }
        return this.containerItemViewHeightPixels;
    }

    public LibraryQueueUIDesign() {
        this.containerItemViewHeightDefaultPixels = null;
        this.containerItemViewHeightPixels = null;
        this.containerItemViewHeightPixels = getContainerItemViewHeightPixels();
        this.containerItemViewHeightDefaultPixels = getContainerItemViewHeightDefaultPixels();
        LibraryQueueFragmentBase.onPlaylistSongDataAvailableToViewHolder.subscribeWeak(new WeakDelegate3.Handler<ContentItemViewHolder, PlaylistSong.Data, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.1
            @Override // com.daaw.avee.Common.Events.WeakDelegate3.Handler
            public void invoke(ContentItemViewHolder contentItemViewHolder, PlaylistSong.Data data, Boolean bool) {
                LibraryQueueUIDesign.this.updateHolderFromData(contentItemViewHolder, data, bool.booleanValue());
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestSectionOpenedState.subscribeWeak(new WeakEventR1.Handler<Class<?>, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(Class<?> cls) {
                if (cls.equals(ContainerPlaylist.class)) {
                    return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_uiSectionOpened0));
                }
                if (cls.equals(ContainerPlaylistFiles.class)) {
                    return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_uiSectionOpened1));
                }
                return true;
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onSetSectionOpened.subscribeWeak(new WeakEvent2.Handler<Boolean, Class<?>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Boolean bool, Class<?> cls) {
                if (cls.equals(ContainerPlaylist.class)) {
                    AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_uiSectionOpened0, bool.booleanValue());
                } else if (cls.equals(ContainerPlaylistFiles.class)) {
                    AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_uiSectionOpened1, bool.booleanValue());
                }
                LibraryQueueUIDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestQueueList.subscribeWeak(new WeakEventR.Handler<MultiList<PlaylistSong, IItemIdentifier>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public MultiList<PlaylistSong, IItemIdentifier> invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    return createOrGetInstance.getQueue();
                }
                return new MultiList<>();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestSongContainerIdentifier.subscribeWeak(new WeakEventR.Handler<IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public IPlaylistSongContainerIdentifier invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    return createOrGetInstance.getSongContainerIdentifier();
                }
                return null;
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestShuffleMode.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    return Integer.valueOf(createOrGetInstance.getShuffleMode());
                }
                return 0;
            }
        }, this.listenerRefHolder);
        AddLinkDialog.onSubmitAddByLink.subscribeWeak(new WeakEvent2.Handler<ContextData, String>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, String str) {
                PlaylistSong playlistSong = new PlaylistSong(str);
                ArrayList arrayList = new ArrayList();
                arrayList.add(playlistSong);
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.open(arrayList, 0, 0, null);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onNavigateLibraryAddress.subscribeWeak(new WeakEvent2.Handler<String, String>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(String str, String str2) {
                if (str.equals("/") && ContainerRootLocal.AddressMore.equals(str2)) {
                    LibraryQueueUIDesign.this.showRootContainerStreams = 1;
                    LibraryQueueUIDesign.this.updateLibraryItems();
                    return;
                }
                Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                if (fragment0Instance != null) {
                    fragment0Instance.navigateForwardLibraryAddress(null, str2);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onAction.subscribeWeak(new WeakEvent3.Handler<ContextData, Integer, View>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(ContextData contextData, Integer num, View view) {
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext == null) {
                    return;
                }
                FragmentManager fragmentManager = contextData.getFragmentManager();
                int intValue = num.intValue();
                if (intValue == 120) {
                    DirectoryPickerDialog.createAndShowDialog(contextData, "libraryAddFolder", R.string.dialog_add_folder_title, "");
                } else if (intValue == 125) {
                    if (view != null) {
                        ViewSettingsDialog.createAndShowDialog(contextData, view, "");
                    }
                } else if (intValue != 1110) {
                    switch (intValue) {
                        case 110:
                            if (fragmentManager != null) {
                                AddLinkDialog.createAndShowDialog(contextData);
                                return;
                            }
                            return;
                        case 111:
                            EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getString(R.string.hold_to_clear_queue));
                            return;
                        case 112:
                            QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                            if (createOrGetInstance != null) {
                                PlaylistPickerDialog.createAndShowPlaylistPickerDialog(contextData, createOrGetInstance.getQueue().unmodifiableList1(), true);
                                return;
                            }
                            return;
                        case 113:
                            LibraryQueueUIDesign.this.toggleShuffle();
                            return;
                        case 114:
                            AppPreferences.createOrGetInstance().toggleBool(AppPreferences.PREF_Bool_followCurrentState);
                            return;
                        case 115:
                            AppPreferences.createOrGetInstance().toggleBool(AppPreferences.PREF_Bool_showAlbumArtInstead);
                            return;
                        default:
                            return;
                    }
                } else {
                    QueueCore createOrGetInstance2 = QueueCore.createOrGetInstance();
                    if (createOrGetInstance2 != null) {
                        createOrGetInstance2.open(new ArrayList(), -1, -1, null);
                    }
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionRemoveFolder.subscribeWeak(new WeakEvent3.Handler<Context, String, String>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Context context, String str, String str2) {
                AppPreferences.createOrGetInstance().prefRemoveLibraryFolder(str, str2, context);
                LibraryQueueUIDesign.this.updateLibraryItems();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionAddToFolders.subscribeWeak(new WeakEvent2.Handler<Context, List<String>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.11
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Context context, List<String> list) {
                LibraryQueueUIDesign.this.AddPathToFolders(context, list);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onUIRequestFollowCurrentValue.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_followCurrentState));
            }
        }, this.listenerRefHolder);
        SongDetailsDialog.onRequestAlbumArt.subscribeWeak(new WeakEvent4.Handler<AlbumArtRequest, ImageView, Boolean, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.13
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(AlbumArtRequest albumArtRequest, ImageView imageView, Boolean bool, Boolean bool2) {
                IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
                if (albumArtFactory != null) {
                    albumArtFactory.loadAlbumArt(albumArtRequest.videoThumbDataSource, albumArtRequest.path0, albumArtRequest.path1, albumArtRequest.genStr, imageView, bool.booleanValue(), bool2.booleanValue(), true);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestAlbumArt.subscribeWeak(new WeakEvent4.Handler<AlbumArtRequest, ImageView, Boolean, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.14
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(AlbumArtRequest albumArtRequest, ImageView imageView, Boolean bool, Boolean bool2) {
                LibraryQueueUIDesign.this.getAlbumArt(albumArtRequest, imageView, bool, bool2);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestShowAlbumArtValue.subscribeWeak(new WeakEventR.Handler<Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Boolean invoke() {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_showAlbumArtInstead));
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionViewDetails.subscribeWeak(new WeakEvent2.Handler<ContextData, List<ItemActionsSongs.ItemsDetails>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.16
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ContextData contextData, List<ItemActionsSongs.ItemsDetails> list) {
                PlaylistSong song;
                if (list.size() >= 1 && (song = list.get(list.size() - 1).getSong()) != null) {
                    SongDetailsDialog.createAndShowDialog(contextData, contextData.getContext(), song);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestContainerItemHeight.subscribeWeak(new WeakEventR1.Handler<IContainerData, Tuple2<Integer, Boolean>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.17
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Tuple2<Integer, Boolean> invoke(IContainerData iContainerData) {
                if ("/".equals(iContainerData.getLibraryAddress())) {
                    return LibraryQueueUIDesign.this.getContainerItemViewHeightDefaultPixels();
                }
                return LibraryQueueUIDesign.this.getContainerItemViewHeightPixels();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestRootContainerItemsVisible.subscribeWeak(new WeakEventR.Handler<Integer>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public Integer invoke() {
                return Integer.valueOf(LibraryQueueUIDesign.this.showRootContainerStreams);
            }
        }, this.listenerRefHolder);
        AppPreferences.onBoolPreferenceChanged.subscribeWeak(new WeakEvent2.Handler<Integer, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.19
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Bool_followCurrentState) {
                    LibraryQueueFragmentBase.onFollowCurrentValueChanged(bool.booleanValue());
                } else if (num.intValue() == AppPreferences.PREF_Bool_showAlbumArtInstead) {
                    LibraryQueueFragmentBase.onShowAlbumArtValueChanged(bool.booleanValue());
                    LibraryQueueUIDesign.this.updateLibraryItems();
                    LibraryQueueUIDesign.this.updateQueueItems();
                } else if (num.intValue() == AppPreferences.PREF_Bool_disableHeaderAds) {
                    LibraryQueueUIDesign.this.updateLibraryItems();
                    LibraryQueueUIDesign.this.updateQueueItems();
                }
            }
        }, this.listenerRefHolder);
        AppPreferences.onIntPreferenceChanged.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.20
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, Boolean bool) {
                if (num.intValue() == AppPreferences.PREF_Int_containerItemViewMode) {
                    Tuple2 updateContainerItemViewHeight = LibraryQueueUIDesign.this.updateContainerItemViewHeight(num2);
                    if (updateContainerItemViewHeight != null) {
                        LibraryQueueUIDesign.this.containerItemViewHeightPixels = updateContainerItemViewHeight;
                    }
                    LibraryQueueUIDesign.this.updateLibraryItems();
                    LibraryQueueUIDesign.this.updateQueueItems();
                }
            }
        }, this.listenerRefHolder);
        DirectoryPickerDialog.onSubmitValue.subscribeWeak(new WeakEvent3.Handler<ContextData, String, String>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.21
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(ContextData contextData, String str, String str2) {
                if (str2.equals("libraryAddFolder")) {
                    LibraryQueueUIDesign.this.AddPathToFolders(contextData.getContext(), new String[]{str});
                }
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onItemSelectionChanged.subscribeWeak(new WeakEvent2.Handler<ItemSelection.One<Object>, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.22
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(ItemSelection.One<Object> one, Boolean bool) {
                LibraryQueueUIDesign.this.updateContainerItems(one.getContainerIdentifier());
            }
        }, this.listenerRefHolder);
        ContextualActionBar.onContainerItemsDeselected.subscribeWeak(new WeakEvent1.Handler<IGeneralItemContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.23
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
                LibraryQueueUIDesign.this.updateContainerItems(iGeneralItemContainerIdentifier);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onEnqueue.subscribeWeak(new WeakEvent2.Handler<Collection<PlaylistSong>, Integer>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.24
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Collection<PlaylistSong> collection, Integer num) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.enqueue(collection, num.intValue(), 0);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onMoveQueueItems.subscribeWeak(new WeakEvent3.Handler<Integer, Integer, List<Integer>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.25
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Integer num, Integer num2, List<Integer> list) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.moveQueueItems(num.intValue(), num2.intValue(), list, 0);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onOpen2.subscribeWeak(new WeakEvent3.Handler<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.26
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(List<PlaylistSong> list, Integer num, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.open(list, num.intValue(), -1, iPlaylistSongContainerIdentifier);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onOpenOnly.subscribeWeak(new WeakEvent3.Handler<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.27
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(List<PlaylistSong> list, Integer num, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
                LibraryQueueUIDesign.this.openAsTransient(list, num, iPlaylistSongContainerIdentifier);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onOpenOnly2.subscribeWeak(new WeakEvent3.Handler<List<PlaylistSong>, Integer, IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.28
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(List<PlaylistSong> list, Integer num, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
                LibraryQueueUIDesign.this.openAsTransient(list, num, iPlaylistSongContainerIdentifier);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onItemInteracted.subscribeWeak(new WeakEvent1.Handler<Object>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.29
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Object obj) {
                if (obj instanceof ContainerSongs.ThisItemIdentifier) {
                    ContainerSongs.ThisItemIdentifier thisItemIdentifier = (ContainerSongs.ThisItemIdentifier) obj;
                    QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                    if (createOrGetInstance != null) {
                        createOrGetInstance.setQueueItemSlot(thisItemIdentifier.itemIdent, 0);
                    }
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRemoveQueueItems.subscribeWeak(new WeakEvent1.Handler<List<IItemIdentifier>>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.30
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(List<IItemIdentifier> list) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.removeQueueItems(list);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onQueuePositionChanged.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.31
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.setQueuePosition(num.intValue());
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onSetCurrentQueueItem.subscribeWeak(new WeakEvent1.Handler<IItemIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.32
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(IItemIdentifier iItemIdentifier) {
                QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
                if (createOrGetInstance != null) {
                    createOrGetInstance.setQueueItem(iItemIdentifier);
                }
            }
        }, this.listenerRefHolder);
        QueueCore.onQueueStateChanged.subscribeWeak(new WeakEvent2.Handler<MultiList<PlaylistSong, IItemIdentifier>, IPlaylistSongContainerIdentifier>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.33
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(MultiList<PlaylistSong, IItemIdentifier> multiList, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
                Fragment1 fragment1Instance = MainActivity.getFragment1Instance();
                if (fragment1Instance != null) {
                    fragment1Instance.updateTrackList(multiList);
                }
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestShowTipState.subscribeWeak(new WeakEventR1.Handler<Integer, Boolean>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.34
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(Integer num) {
                return Boolean.valueOf(AppPreferences.createOrGetInstance().getBool(num.intValue()));
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onActionShowReorderTip.subscribeWeak(new WeakEvent1.Handler<ContextData>() { // from class: com.daaw.avee.Design.LibraryQueueUIDesign.35
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(ContextData contextData) {
                TipReorderDialog.createAndShowTipReorderDialog(contextData);
            }
        }, this.listenerRefHolder);
        ViewSettingsDialog.onRequestOptionsState.subscribeWeak(new WeakEventR3.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$LibraryQueueUIDesign$yFRVOX9MtTjXxC9MCTURVmdfO68
            @Override // com.daaw.avee.Common.Events.WeakEventR3.Handler
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return LibraryQueueUIDesign.lambda$new$0((Integer) obj, (IGeneralItemContainerIdentifier) obj2, (String) obj3);
            }
        }, this.listenerRefHolder);
        ViewSettingsDialog.onSubmitOptions.subscribeWeak(new WeakEvent3.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$LibraryQueueUIDesign$xAiqWA-ZpXquJ8rKWje9OPdDC28
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public final void invoke(Object obj, Object obj2, Object obj3) {
                LibraryQueueUIDesign.lambda$new$1((Integer) obj, (IGeneralItemContainerIdentifier) obj2, (ViewSettingsDialog.ViewOptions) obj3);
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ViewSettingsDialog.ViewOptions lambda$new$0(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, String str) {
        ViewSettingsDialog.ViewOptions viewOptions = new ViewSettingsDialog.ViewOptions();
        viewOptions.viewMode = AppPreferences.createOrGetInstance().getInt(AppPreferences.PREF_Int_containerItemViewMode);
        viewOptions.showAlbumArt = AppPreferences.createOrGetInstance().getBool(AppPreferences.PREF_Bool_showAlbumArtInstead);
        return viewOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$new$1(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, ViewSettingsDialog.ViewOptions viewOptions) {
        AppPreferences.createOrGetInstance().setInt(AppPreferences.PREF_Int_containerItemViewMode, viewOptions.viewMode);
        AppPreferences.createOrGetInstance().setBool(AppPreferences.PREF_Bool_showAlbumArtInstead, viewOptions.showAlbumArt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openAsTransient(List<PlaylistSong> list, Integer num, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
        if (list == null) {
            Context appContext = PlayerCore.s().getAppContext();
            if (appContext != null) {
                EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getResources().getString(R.string.failed_to_open_network_error));
                return;
            }
            return;
        }
        QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
        if (createOrGetInstance != null) {
            createOrGetInstance.removeQueueItems(-1);
            createOrGetInstance.open(list, num.intValue(), 0, null, null, -1, false);
        }
    }

    void updateHolderFromData(ContentItemViewHolder contentItemViewHolder, PlaylistSong.Data data, boolean z) {
        if (z) {
            contentItemViewHolder.imgArt.setVisibility(0);
            contentItemViewHolder.setImgColorFilter(-1);
            getAlbumArt(new AlbumArtRequest(data.dataSource, data.getAlbumArtPath0Str(), data.getAlbumArtPath1Str(), data.getAlbumArtGenerateStr()), contentItemViewHolder.imgArt, true, false);
        } else {
            contentItemViewHolder.imgArt.setVisibility(8);
            contentItemViewHolder.setImageDrawable(null);
        }
        if (data.isArtistKnownOrSecondName()) {
            contentItemViewHolder.txtItemLine1.setText(data.trackName);
            contentItemViewHolder.setTxtItemLine2Visibility(0);
            if (data.isAlbumKnown()) {
                contentItemViewHolder.setTxtItemLine2Text(data.artistName + "   |   " + data.albumName);
            } else {
                contentItemViewHolder.setTxtItemLine2Text(data.artistName);
            }
        } else {
            contentItemViewHolder.txtItemLine1.setText(data.trackName);
            contentItemViewHolder.setTxtItemLine2Visibility(8);
        }
        if (!data.isStream) {
            contentItemViewHolder.txtItemDuration.setText(Utils.getDurationStringHMSS(data.duration / 1000));
        } else {
            contentItemViewHolder.txtItemDuration.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAlbumArt(AlbumArtRequest albumArtRequest, ImageView imageView, Boolean bool, Boolean bool2) {
        IAlbumArtCore albumArtFactory = AlbumArtFactory.getInstance();
        if (albumArtFactory != null) {
            albumArtFactory.loadAlbumArt(albumArtRequest.videoThumbDataSource, albumArtRequest.path0, albumArtRequest.path1, albumArtRequest.genStr, imageView, bool.booleanValue(), bool2.booleanValue(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AddPathToFolders(Context context, Collection<String> collection) {
        for (String str : collection) {
            AppPreferences.createOrGetInstance().prefAddLibraryFolderGenerateHash(str, context);
        }
        updateLibraryItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AddPathToFolders(Context context, String[] strArr) {
        for (String str : strArr) {
            AppPreferences.createOrGetInstance().prefAddLibraryFolderGenerateHash(str, context);
        }
        updateLibraryItems();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleShuffle() {
        QueueCore createOrGetInstance = QueueCore.createOrGetInstance();
        int i = 0;
        int shuffleMode = createOrGetInstance != null ? createOrGetInstance.getShuffleMode() : 0;
        if (shuffleMode == 0) {
            i = 1;
        } else if (shuffleMode != 1) {
            i = shuffleMode;
        }
        if (createOrGetInstance != null) {
            createOrGetInstance.setShuffleMode(i, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContainerItems(IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
        if (fragment0Instance != null) {
            fragment0Instance.refreshAdapter(iGeneralItemContainerIdentifier);
        }
        Fragment1 fragment1Instance = MainActivity.getFragment1Instance();
        if (fragment1Instance != null) {
            fragment1Instance.refreshTrackList(iGeneralItemContainerIdentifier);
        }
    }

    public void updateLibraryItems() {
        Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
        if (fragment0Instance != null) {
            fragment0Instance.updateLibraryItems();
        }
    }

    public void updateQueueItems() {
        Fragment1 fragment1Instance = MainActivity.getFragment1Instance();
        if (fragment1Instance != null) {
            fragment1Instance.updateQueueItems();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Tuple2<Integer, Boolean> updateContainerItemViewHeight(Integer num) {
        int intValue = num.intValue();
        int i = intValue != 0 ? (intValue == 1 || intValue != 2) ? 56 : 112 : 28;
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return null;
        }
        return new Tuple2<>(Integer.valueOf((int) TypedValue.applyDimension(1, i, appContext.getResources().getDisplayMetrics())), Boolean.valueOf(i >= 56));
    }
}
