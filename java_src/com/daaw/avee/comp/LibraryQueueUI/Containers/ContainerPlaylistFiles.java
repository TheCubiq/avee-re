package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsPlaylist;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.Playlists.Files.PlaylistFilesUtils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerPlaylistFiles extends CursorContainerBase {
    private static final int dispIconResId = 2131230969;
    private static final int primaryActionIndex = -1;
    ActionListenerBase[] itemListenerActions;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    /* loaded from: classes.dex */
    private static class ChildContentAccessor implements Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> {
        private String strId;

        ChildContentAccessor(String str) {
            this.strId = str;
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
            return MultiList.fromList1FillWith2(ContainerPlaylistFiles.getChildItems(PlayerCore.s().getAppContext(), containerBase, this.strId, null), null);
        }
    }

    public ContainerPlaylistFiles(Context context, String str, int i) {
        super(context, str, context.getResources().getString(R.string.section_playlist_standalone), R.drawable.ic_playlist4, i);
        this.itemListenerActions = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylistFiles.getChildItems(context2, ContainerPlaylistFiles.this, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylistFiles.getChildItems(context2, ContainerPlaylistFiles.this, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylistFiles.getChildItems(context2, ContainerPlaylistFiles.this, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylistFiles.getChildItems(context2, ContainerPlaylistFiles.this, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylistFiles.getChildItems(context2, ContainerPlaylistFiles.this, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsPlaylist.RemoveStandalonePlaylistAction.RemoveStandalonePlaylistActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylistFiles.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsPlaylist.RemoveStandalonePlaylistAction.RemoveStandalonePlaylistActionListener
            protected void onRemoveStandalonePlaylist(Context context2, Object obj, MultiList<String, String> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                multiList.add((MultiList<String, String>) thisItemIdentifier.id, thisItemIdentifier.path);
            }
        }};
        init(context);
    }

    static Tuple2<Cursor, String> makeCursor(Context context, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        MultiList<String, String> prefGetStandalonePlaylists = AppPreferences.createOrGetInstance().prefGetStandalonePlaylists(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", ""});
        Iterator<Tuple2<String, String>> it = prefGetStandalonePlaylists.iterator();
        while (it.hasNext()) {
            Tuple2<String, String> next = it.next();
            matrixCursor.addRow(new String[]{next.obj1, next.obj2});
        }
        return new Tuple2<>(matrixCursor, "");
    }

    public static String getPlaylistNameDesign(String str) {
        return UtilsFileSys.extractFilenameWithoutExt(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<PlaylistSong> getChildItems(Context context, ContainerBase containerBase, String str, List<PlaylistSong> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        List<PlaylistSong> songsFromPlaylistFile = PlaylistFilesUtils.s().getSongsFromPlaylistFile(str);
        if (songsFromPlaylistFile != null) {
            sortContent(containerBase, songsFromPlaylistFile);
            list.addAll(songsFromPlaylistFile);
        }
        return list;
    }

    private static void sortContent(ContainerBase containerBase, List<PlaylistSong> list) {
        if (onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null).sortDescending) {
            Collections.reverse(list);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 6, 1), this);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return getItem(i).getString(0);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        int findRowAndMove = findRowAndMove("_id", str);
        String string = findRowAndMove >= 0 ? getItem(findRowAndMove).getString(1) : "";
        if (string.length() > 0) {
            ContainerSongs containerSongs = new ContainerSongs(context, new ChildContentAccessor(string), makeChildAddress(str), getPlaylistNameDesign(string), 0, this.pageIndex, false);
            containerSongs.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
            return containerSongs.createOrGetAdapter(context, 0);
        }
        return null;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Cursor item = getItem(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView(item, i, contentItemViewHolder);
    }

    public void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(getItem(i).getString(0), getItem(i).getString(1)), getSelectionContainerIdentifier());
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(this.itemListenerActions, -1, this);
        contentItemViewHolder.imgArt.setVisibility(0);
        contentItemViewHolder.setImgColorFilter(this.colorImgArt);
        contentItemViewHolder.setImgResource(R.drawable.ic_playlist4_file);
        contentItemViewHolder.txtNum.setVisibility(8);
        String string = cursor.getString(1);
        contentItemViewHolder.txtItemLine1.setText(getPlaylistNameDesign(string));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(0);
        contentItemViewHolder.setTxtItemLine2Text(string);
        contentItemViewHolder.txtItemDuration.setText("");
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase
    public Tuple2<Cursor, String> createOrGetCursor(Context context, String str) {
        return makeCursor(context, getSelectionContainerIdentifier());
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase
    public Tuple2<Cursor, String> createOrGetCursor(Context context) {
        return makeCursor(context, getSelectionContainerIdentifier());
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getSectionOpened() {
        return onRequestSectionOpenedState.invoke(ContainerPlaylistFiles.class, false).booleanValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setSectionOpenedState(boolean z) {
        onSetSectionOpened.invoke(Boolean.valueOf(z), ContainerPlaylistFiles.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        public String id;
        public String path;

        public ThisItemIdentifier(String str, String str2) {
            this.id = str;
            this.path = str2;
        }

        public int hashCode() {
            return this.id.hashCode();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.id.equals(((ThisItemIdentifier) obj).id);
        }
    }
}
