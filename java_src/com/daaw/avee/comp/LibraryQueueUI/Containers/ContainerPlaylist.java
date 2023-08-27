package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
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
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerPlaylist extends CursorContainerBase {
    private static final int defaultActionIndex = 0;
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
            return MultiList.fromList1FillWith2(ContainerPlaylist.getChildItems(PlayerCore.s().getAppContext(), containerBase, this.strId, null), null);
        }
    }

    public ContainerPlaylist(Context context, String str, int i) {
        super(context, str, context.getResources().getString(R.string.section_playlist_system), R.drawable.ic_playlist4, i);
        this.itemListenerActions = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylist containerPlaylist = ContainerPlaylist.this;
                ContainerPlaylist.getChildItems(context2, containerPlaylist, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylist containerPlaylist = ContainerPlaylist.this;
                ContainerPlaylist.getChildItems(context2, containerPlaylist, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylist containerPlaylist = ContainerPlaylist.this;
                ContainerPlaylist.getChildItems(context2, containerPlaylist, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylist containerPlaylist = ContainerPlaylist.this;
                ContainerPlaylist.getChildItems(context2, containerPlaylist, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerPlaylist containerPlaylist = ContainerPlaylist.this;
                ContainerPlaylist.getChildItems(context2, containerPlaylist, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsPlaylist.RenamePlaylistAction.RenamePlaylistActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsPlaylist.RenamePlaylistAction.RenamePlaylistActionListener
            protected void onRenamePlaylist(Context context2, Object obj, MultiList<Long, String> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                multiList.add((MultiList<Long, String>) Long.valueOf(thisItemIdentifier.id), (Long) thisItemIdentifier.name);
            }
        }, new ItemActionsPlaylist.DeletePlaylistAction.DeletePlaylistActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerPlaylist.7
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsPlaylist.DeletePlaylistAction.DeletePlaylistActionListener
            protected void onDeletePlaylist(Context context2, Object obj, MultiList<Long, String> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                multiList.add((MultiList<Long, String>) Long.valueOf(thisItemIdentifier.id), (Long) thisItemIdentifier.name);
            }
        }};
        init(context);
    }

    static Tuple2<Cursor, String> makeCursor(Context context, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier, int i) {
        String str;
        String[] strArr;
        ContentResolver contentResolver = context.getContentResolver();
        String invoke = onRequestSearchQuery.invoke(Integer.valueOf(i), iGeneralItemContainerIdentifier, "");
        if (invoke == null || invoke.isEmpty()) {
            str = null;
            strArr = null;
            invoke = "";
        } else {
            strArr = new String[]{"%" + invoke + "%"};
            str = "name LIKE ?";
        }
        Uri uri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
        String[] strArr2 = {"_id", AppMeasurementSdk.ConditionalUserProperty.NAME, "_data"};
        return new Tuple2<>(MediaStoreUtils.querySafeEmpty(contentResolver, uri, strArr2, str, strArr, strArr2[1]), invoke);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 6, 1), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<PlaylistSong> getChildItems(Context context, ContainerBase containerBase, String str, List<PlaylistSong> list) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Playlists.Members.getContentUri("external", Utils.strToLongSafe(str)), new String[]{"_id", "audio_id", "_data"}, "playlist_id=?", new String[]{str}, MediaStoreUtils.getOrderBy(onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 10));
        if (querySafe != null) {
            List<PlaylistSong> songListFromCursor = UtilsMusic.songListFromCursor(querySafe, list);
            querySafe.close();
            return songListFromCursor;
        }
        return new ArrayList();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public String getItemPositionToItemAddress(int i) {
        return getItem(i).getString(0);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public ViewAdapter createChildAdapter(Context context, String str) {
        String str2;
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{AppMeasurementSdk.ConditionalUserProperty.NAME}, "_id=?", new String[]{str}, null);
        if (querySafe != null) {
            querySafe.moveToFirst();
            str2 = MediaStoreUtils.CursorGetStringSafe(querySafe, 0);
            querySafe.close();
        } else {
            str2 = "";
        }
        ContainerSongs containerSongs = new ContainerSongs(context, new ChildContentAccessor(str), makeChildAddress(str), str2, 0, this.pageIndex, false);
        containerSongs.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
        return containerSongs.createOrGetAdapter(context, 0);
    }

    public void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(cursor.getLong(0), cursor.getString(1)), getSelectionContainerIdentifier());
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(this.itemListenerActions, -1, this);
        contentItemViewHolder.imgArt.setVisibility(0);
        contentItemViewHolder.setImgColorFilter(this.colorImgArt);
        contentItemViewHolder.setImgResource(R.drawable.ic_playlist4);
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(cursor.getString(1));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(8);
        contentItemViewHolder.setTxtItemLine2Text("");
        contentItemViewHolder.txtItemDuration.setText("");
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Playlists_search);
        iGeneralItemContainerIdentifierArr[0] = getSelectionContainerIdentifier();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase
    public Tuple2<Cursor, String> createOrGetCursor(Context context, String str) {
        return makeCursor(context, getSelectionContainerIdentifier(), this.pageIndex);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase
    public Tuple2<Cursor, String> createOrGetCursor(Context context) {
        return makeCursor(context, getSelectionContainerIdentifier(), this.pageIndex);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Cursor item = getItem(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView(item, i, contentItemViewHolder);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean getSectionOpened() {
        return onRequestSectionOpenedState.invoke(ContainerPlaylist.class, false).booleanValue();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void setSectionOpenedState(boolean z) {
        onSetSectionOpened.invoke(Boolean.valueOf(z), ContainerPlaylist.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        final long id;
        final String name;

        public ThisItemIdentifier(long j, String str) {
            this.id = j;
            this.name = str;
        }

        public int hashCode() {
            return (int) this.id;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.id == ((ThisItemIdentifier) obj).id;
        }
    }
}
