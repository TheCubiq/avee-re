package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Tuple3;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.Common.VTaskResult;
import com.daaw.avee.ContextData;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.GlobalSearch.SearchFilesTask;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsFolders;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.FileSortingUtils;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ViewHolderFactory;
import com.daaw.avee.comp.PlaybackQueue.IPlaylistSongContainerIdentifier;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerFile extends ContainerBase implements ViewAdapter.IAdapterDataProvider {
    private static final int defaultActionDirectoryIndex = 0;
    private static final int defaultActionSongIndex = 1;
    private static final int primaryActionDirectoryIndex = -1;
    private static final int primaryActionSongIndex = 0;
    private WeakReference<IAdapter> associatedAdapter;
    private String currentAbsolutePath;
    private boolean currentIsDirectory;
    private String currentName;
    private String currentRelativePath;
    ActionListenerBase[] directoryItemListenerActions;
    ActionListenerBase[] itemListenerActionsHeader;
    ActionListenerBase[] itemListenerActionsSongs;
    private List<Item> items;
    private int pageIndex;
    SearchFilesTask.IResultReceiver resultReceiver;
    private File rootFile;
    String visibleListQuery;

    /* loaded from: classes.dex */
    public interface FilterInclude {
        boolean shouldInclude(File file);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int dataPositionToPosition(int i) {
        return i;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public long getItemId(int i) {
        return i;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterDispose() {
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onItemsMoved(int i, int i2, List<Integer> list) {
    }

    public ContainerFile(Context context, File file, String str, int i) {
        super(context, str, new VTaskResult(file.getName()), 0, i);
        this.directoryItemListenerActions = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                int i2 = ContainerFile.this.pageIndex;
                IGeneralItemContainerIdentifier selectionContainerIdentifier = ContainerFile.this.getSelectionContainerIdentifier();
                ContainerFile.getTrackList(context2, i2, selectionContainerIdentifier, "" + ((ThisItemIdentifier) obj).getId(), list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                int i2 = ContainerFile.this.pageIndex;
                IGeneralItemContainerIdentifier selectionContainerIdentifier = ContainerFile.this.getSelectionContainerIdentifier();
                ContainerFile.getTrackList(context2, i2, selectionContainerIdentifier, "" + ((ThisItemIdentifier) obj).getId(), list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                int i2 = ContainerFile.this.pageIndex;
                IGeneralItemContainerIdentifier selectionContainerIdentifier = ContainerFile.this.getSelectionContainerIdentifier();
                ContainerFile.getTrackList(context2, i2, selectionContainerIdentifier, "" + ((ThisItemIdentifier) obj).getId(), list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                int i2 = ContainerFile.this.pageIndex;
                IGeneralItemContainerIdentifier selectionContainerIdentifier = ContainerFile.this.getSelectionContainerIdentifier();
                ContainerFile.getTrackList(context2, i2, selectionContainerIdentifier, "" + ((ThisItemIdentifier) obj).getId(), list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                int i2 = ContainerFile.this.pageIndex;
                IGeneralItemContainerIdentifier selectionContainerIdentifier = ContainerFile.this.getSelectionContainerIdentifier();
                ContainerFile.getTrackList(context2, i2, selectionContainerIdentifier, "" + ((ThisItemIdentifier) obj).getId(), list);
            }
        }, new ItemActionsFolders.FileAddToFoldersAction.Listener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsFolders.FileAddToFoldersAction.Listener
            protected void onAddToFolders(Context context2, Object obj, List<String> list) {
                list.add(((ThisItemIdentifier) obj).getId());
            }
        }};
        this.visibleListQuery = null;
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.7
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier2 = (IPlaylistSongContainerIdentifier) ContainerFile.this.getSelectionContainerIdentifier();
                if (iPlaylistSongContainerIdentifier != null && iPlaylistSongContainerIdentifier.equals(ContainerFile.this.getSelectionContainerIdentifier())) {
                    PlaylistSong song = thisItemIdentifier.item.getSong();
                    int findSongInItemsNotCountingNulls = ContainerFile.findSongInItemsNotCountingNulls(ContainerFile.this.items, song, 0);
                    PlaylistSong playlistSong = null;
                    if (findSongInItemsNotCountingNulls >= 0 && findSongInItemsNotCountingNulls < multiList.size()) {
                        playlistSong = multiList.get1(findSongInItemsNotCountingNulls);
                    }
                    if (song != null && song.equals(playlistSong)) {
                        return new Tuple3<>(Integer.valueOf(findSongInItemsNotCountingNulls), iPlaylistSongContainerIdentifier2, true);
                    }
                }
                int size = list.size();
                ContainerFile.getSongsFromFileItems2(context2, ContainerFile.this.items, list);
                PlaylistSong song2 = thisItemIdentifier.item.getSong();
                return new Tuple3<>(Integer.valueOf((song2 == null || (r6 = UtilsMusic.findSongInList(list, song2, size)) < 0) ? 0 : 0), iPlaylistSongContainerIdentifier2, false);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.8
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return;
                }
                list.add(song);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.9
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return;
                }
                list.add(song);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.10
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return;
                }
                list.add(song);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.11
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return;
                }
                list.add(song);
            }
        }, new ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.12
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ViewDetailsItemAction.ViewDetailsActionListener2
            protected ItemActionsSongs.ItemsDetails onDetails(Context context2, Object obj) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return new ItemActionsSongs.ItemsDetails(null);
                }
                return new ItemActionsSongs.ItemsDetails(song);
            }
        }, new ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.13
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SetAsRingtoneItemAction.SetAsRingtoneActionListener
            protected void onSetAsRingtone(Context context2, Object obj, List<PlaylistSong> list) {
                PlaylistSong song = ((ThisItemIdentifier) obj).item.getSong();
                if (song == null) {
                    return;
                }
                list.add(song);
            }
        }};
        this.itemListenerActionsHeader = new ActionListenerBase[]{new ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.14
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayAllContainerItemAction.PlayAllContainerActionListener2
            protected Tuple3<Integer, IPlaylistSongContainerIdentifier, Boolean> onPlayAllContainer(Context context2, Object obj, List<PlaylistSong> list, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, MultiList<PlaylistSong, IItemIdentifier> multiList) {
                ContainerFile.getSongsFromFileItems2(context2, ContainerFile.this.items, list);
                return new Tuple3<>(0, (IPlaylistSongContainerIdentifier) ContainerFile.this.getSelectionContainerIdentifier(), false);
            }
        }, new ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.15
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.EnqueueAllContainerItemAction.EnqueueAllContainerActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFile.getSongsFromFileItems2(context2, ContainerFile.this.items, list);
            }
        }};
        this.associatedAdapter = new WeakReference<>(null);
        this.resultReceiver = new SearchFilesTask.IResultReceiver() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.16
            public boolean compareTask(AsyncTask asyncTask) {
                return ContainerBase.onCompareSearchTask.invoke(asyncTask, Integer.valueOf(ContainerFile.this.pageIndex), false).booleanValue();
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiver
            public void onSearchStarted(AsyncTask asyncTask) {
                if (compareTask(asyncTask) && !ContainerFile.this.checkItemIdentEquals("")) {
                    ContainerFile.this.setSearchActive(true, false);
                    ContainerFile.this.items.clear();
                    ContainerFile.this.RefreshContent();
                }
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiver
            public void onSearchFinished(AsyncTask asyncTask, boolean z) {
                if (compareTask(asyncTask) && !ContainerFile.this.checkItemIdentEquals("")) {
                    ContainerFile.this.setSearchActive(false, true);
                    ContainerFile.this.RefreshContent();
                }
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiver
            public void onItemDirFound(AsyncTask asyncTask, Item item) {
                if (compareTask(asyncTask) && ContainerFile.this.checkItemIdentEquals("")) {
                }
            }

            @Override // com.daaw.avee.comp.GlobalSearch.SearchFilesTask.IResultReceiver
            public void onItemFileFound(AsyncTask asyncTask, Item item) {
                if (compareTask(asyncTask) && !ContainerFile.this.checkItemIdentEquals("")) {
                    ContainerFile.this.justAddData(item);
                }
            }
        };
        this.pageIndex = i;
        this.rootFile = file;
        this.items = new ArrayList();
        this.currentName = this.rootFile.getName();
        this.currentAbsolutePath = this.rootFile.getAbsolutePath();
        this.currentRelativePath = this.rootFile.getPath();
        this.currentIsDirectory = this.rootFile.isDirectory();
        if (this.rootFile.isDirectory() && this.currentAbsolutePath.length() > 0) {
            String str2 = this.currentAbsolutePath;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.currentAbsolutePath += "/";
            }
        }
        updateSearchQuery(context, onRequestSearchQuery.invoke(Integer.valueOf(i), getSelectionContainerIdentifier(), ""));
    }

    public static int findSongInItemsNotCountingNulls(List<Item> list, PlaylistSong playlistSong, int i) {
        int i2 = 0;
        while (i < list.size()) {
            PlaylistSong song = list.get(i).getSong();
            if (song != null) {
                if (song.compare(playlistSong)) {
                    return i2;
                }
                i2++;
            }
            i++;
        }
        return -1;
    }

    static List<Item> makeItems(Context context, final int i, final IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, File file, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        makeItemsRecursive(arrayList, arrayList2, file, z, null, null, new FilterInclude() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.17
            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFile.FilterInclude
            public boolean shouldInclude(File file2) {
                return ContainerBase.onRequestFilterFileResult.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, file2, true).booleanValue();
            }
        });
        Collections.sort(arrayList);
        Comparator<Item> sortComparator = FileSortingUtils.getSortComparator(onRequestCurrentSortDesc.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, null), 0);
        if (sortComparator != null) {
            Collections.sort(arrayList2, sortComparator);
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ((Item) arrayList2.get(i2)).index = i2;
        }
        if (arrayList.size() > 0) {
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        return arrayList2;
    }

    private static void getMediaInPath(String str, List<Item> list, String str2, FilterComparable filterComparable, FilterInclude filterInclude) {
        Cursor query = PlayerCore.s().getActivityContext().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_display_name"}, "_data LIKE ? AND NOT _data GLOB ?", new String[]{str.toUpperCase() + "%", str.toUpperCase() + "/*[/]*"}, null);
        if (query == null) {
            return;
        }
        while (query.moveToNext()) {
            String string = query.getString(1);
            if (str2 == null || string.contains(str2)) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, query.getLong(0));
                list.add(new Item(false, string, 0L, withAppendedId.toString(), 0L, new PlaylistSong(withAppendedId)));
            }
        }
    }

    static void makeItemsRecursive(List<Item> list, List<Item> list2, File file, boolean z, String str, FilterComparable filterComparable, FilterInclude filterInclude) {
        File[] listFiles;
        File[] listFiles2 = file.listFiles();
        if (!Utils.PRE_Q) {
            getMediaInPath(file.getPath(), list2, str, filterComparable, filterInclude);
        }
        try {
            for (File file2 : listFiles2) {
                if (file2.isDirectory()) {
                    if (!z) {
                        if (filterInclude != null ? filterInclude.shouldInclude(file2) : true) {
                            if (filterComparable == null) {
                                list.add(new Item(true, file2.getName(), file2.listFiles() != null ? listFiles.length : 0, file2.getCanonicalPath(), file2.lastModified()));
                            } else {
                                makeItemsRecursive(list, list2, file2, z, str, filterComparable, filterInclude);
                            }
                        }
                    }
                } else if (Utils.PRE_Q) {
                    boolean shouldInclude = filterInclude != null ? filterInclude.shouldInclude(file2) : true;
                    if (shouldInclude && filterComparable != null) {
                        shouldInclude = file2.getName().toLowerCase().contains(str);
                    }
                    if (shouldInclude) {
                        list2.add(new Item(false, file2.getName(), file2.length(), file2.getCanonicalPath(), file2.lastModified(), new PlaylistSong(file2)));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static List<PlaylistSong> getTrackList(Context context, int i, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, String str, List<PlaylistSong> list) {
        return getTrackList(context, i, iGeneralItemContainerIdentifier, str, false, list);
    }

    public static List<PlaylistSong> getTrackList(Context context, int i, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, String str, boolean z, List<PlaylistSong> list) {
        return getSongsFromFileItems2(context, makeItems(context, i, iGeneralItemContainerIdentifier, new File(str), true), list);
    }

    static List<PlaylistSong> getSongsFromFileItems2(Context context, List<Item> list, List<PlaylistSong> list2) {
        if (list2 == null) {
            list2 = new ArrayList<>(list.size());
        }
        for (Item item : list) {
            if (item.getSong() != null) {
                list2.add(item.getSong());
            }
        }
        return list2;
    }

    protected IAdapter getAssociatedAdapter() {
        return this.associatedAdapter.get();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterInitialized(IAdapter iAdapter) {
        this.associatedAdapter = new WeakReference<>(iAdapter);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 11, 1), this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public int getItemCount() {
        return this.items.size();
    }

    public Item getItem(int i) {
        return this.items.get(i);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ViewHolderFactory.newInstance(viewGroup.getContext(), viewGroup, i, this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        Item item = getItem(i);
        return item.isDirectory() ? item.getName() : "";
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        if (str.length() > 0) {
            ContainerFile containerFile = new ContainerFile(context, new File(this.currentAbsolutePath + str), makeChildAddress(str), this.pageIndex);
            containerFile.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
            return containerFile.createOrGetAdapter(context);
        }
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Item item = getItem(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView(item, i, contentItemViewHolder);
    }

    public void getView(Item item, int i, ContentItemViewHolder contentItemViewHolder) {
        PlaylistSong song = item.getSong();
        if (song == null) {
            contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(item, i), getSelectionContainerIdentifier());
            contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
            contentItemViewHolder.setItemActions2(this.directoryItemListenerActions, -1, this);
            contentItemViewHolder.imgArt.setVisibility(0);
            contentItemViewHolder.setImgColorFilter(this.colorImgArt);
            contentItemViewHolder.setImgResource(R.drawable.ic_folder4);
            contentItemViewHolder.txtNum.setVisibility(8);
            contentItemViewHolder.txtItemLine1.setText(item.getName());
            contentItemViewHolder.txtItemLine1.setTextColor(this.color);
            contentItemViewHolder.setTxtItemLine2Visibility(8);
            TextView textView = contentItemViewHolder.txtItemDuration;
            textView.setText("" + item.getCountOrSize());
            return;
        }
        ContainerSongs.getViewStatic(this, new ThisItemIdentifier(item, i), song, null, item.index, i, contentItemViewHolder, this.itemListenerActionsSongs, 0);
    }

    protected void justAddData(Item item) {
        this.items.add(item);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Folders_search);
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        if (str == null || str.isEmpty()) {
            this.visibleListQuery = null;
            setSearchActive(false, true);
            RefreshContent();
            return;
        }
        this.visibleListQuery = str;
        setSearchActive(true, false);
        RefreshContent();
        startSearch(context, str);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void executeItemActionHeader(ContextData contextData, int i) {
        ActionListenerBase[] actionListenerBaseArr = this.itemListenerActionsHeader;
        if (i < actionListenerBaseArr.length) {
            actionListenerBaseArr[i].execute(contextData, null);
        }
    }

    void startSearch(Context context, String str) {
        SearchFilesTask searchFilesTask = new SearchFilesTask(context, this.rootFile, new SearchFilterPlaylistSong(context), new WeakReference(this.resultReceiver));
        onStartSearchTask.invoke(searchFilesTask, Integer.valueOf(this.pageIndex), str);
        searchFilesTask.execute(str);
    }

    protected void setDataAndNotifyDataSetChanged(List<Item> list, String str) {
        if (checkItemIdent(str, true)) {
            return;
        }
        this.items = list;
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent() {
        if (checkItemIdent(getContent(true).obj2, false)) {
            return true;
        }
        Tuple2<List<Item>, String> content = getContent(false);
        List<Item> list = content.obj1;
        if (list == null) {
            setDataAndNotifyDataSetChanged(new ArrayList(), null);
        } else {
            setDataAndNotifyDataSetChanged(list, content.obj2);
        }
        return true;
    }

    protected Tuple2<List<Item>, String> getContent(boolean z) {
        if (this.visibleListQuery == null) {
            if (z) {
                return new Tuple2<>(null, "");
            }
            return new Tuple2<>(makeItems(null, this.pageIndex, getSelectionContainerIdentifier(), this.rootFile, false), "");
        }
        List<Item> list = z ? null : this.items;
        return new Tuple2<>(list, this.visibleListQuery + this.items.size());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        public Item item;
        public int itemPosition;

        public ThisItemIdentifier(Item item, int i) {
            this.itemPosition = i;
            this.item = item;
        }

        public String getId() {
            return this.item.getPath();
        }

        public int hashCode() {
            return this.itemPosition;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.itemPosition == ((ThisItemIdentifier) obj).itemPosition;
        }
    }

    /* loaded from: classes.dex */
    public static class Item implements Comparable<Item> {
        private final long countOrSize;
        private int index;
        private final boolean isDir;
        private final long lastModified;
        private final String name;
        private final String path;
        private final PlaylistSong song;

        public Item(boolean z, String str, long j, String str2, long j2) {
            this(z, str, j, str2, j2, null);
        }

        public Item(boolean z, String str, long j, String str2, long j2, PlaylistSong playlistSong) {
            this.index = 0;
            this.isDir = z;
            this.name = str;
            this.countOrSize = j;
            this.path = str2;
            this.lastModified = j2;
            this.song = playlistSong;
        }

        public void setIndex(int i) {
            this.index = i;
        }

        public int getIndex() {
            return this.index;
        }

        public boolean isDirectory() {
            return this.isDir;
        }

        public String getName() {
            return this.name;
        }

        public long getCountOrSize() {
            return this.countOrSize;
        }

        public String getPath() {
            return this.path;
        }

        public long getLastModified() {
            return this.lastModified;
        }

        public PlaylistSong getSong() {
            return this.song;
        }

        @Override // java.lang.Comparable
        public int compareTo(Item item) {
            String str = this.name;
            if (str != null) {
                return str.toLowerCase().compareTo(item.getName().toLowerCase());
            }
            throw new IllegalArgumentException();
        }
    }
}
