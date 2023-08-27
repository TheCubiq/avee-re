package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.AlbumArtCore;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerAlbums extends CursorContainerBase {
    static final int defaultActionIndex = 0;
    static final int primaryActionIndex = -1;
    ActionListenerBase[] itemListenerActions;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    /* loaded from: classes.dex */
    private static class ChildContentAccessor implements Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> {
        private String albumId;

        ChildContentAccessor(String str) {
            this.albumId = str;
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
            return MultiList.fromList1FillWith2(ContainerAlbums.getChildItems(PlayerCore.s().getAppContext(), containerBase, this.albumId, null), null);
        }
    }

    public ContainerAlbums(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.itemListenerActions = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerAlbums.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerAlbums containerAlbums = ContainerAlbums.this;
                ContainerAlbums.getChildItems(context2, containerAlbums, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerAlbums.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerAlbums containerAlbums = ContainerAlbums.this;
                ContainerAlbums.getChildItems(context2, containerAlbums, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerAlbums.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerAlbums containerAlbums = ContainerAlbums.this;
                ContainerAlbums.getChildItems(context2, containerAlbums, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerAlbums.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerAlbums containerAlbums = ContainerAlbums.this;
                ContainerAlbums.getChildItems(context2, containerAlbums, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerAlbums.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerAlbums containerAlbums = ContainerAlbums.this;
                ContainerAlbums.getChildItems(context2, containerAlbums, "" + ((ThisItemIdentifier) obj).id, list);
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
            invoke = "";
            str = null;
            strArr = null;
        } else {
            strArr = new String[]{"%" + invoke + "%"};
            str = "album LIKE ?";
        }
        return new Tuple2<>(MediaStoreUtils.querySafeEmpty(contentResolver, MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album", "numsongs", "album_art", "artist"}, str, strArr, null), invoke);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 7, 1), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<PlaylistSong> getChildItems(Context context, ContainerBase containerBase, String str, List<PlaylistSong> list) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "album_id=?", new String[]{str}, MediaStoreUtils.getOrderBy(onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 0));
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
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"_id", "album"}, "_id=?", new String[]{str}, null);
        if (querySafe != null) {
            querySafe.moveToFirst();
            str2 = MediaStoreUtils.CursorGetStringSafe(querySafe, 1);
            querySafe.close();
        } else {
            str2 = "";
        }
        ContainerSongs containerSongs = new ContainerSongs(context, new ChildContentAccessor(str), makeChildAddress(str), str2, 0, this.pageIndex, false);
        containerSongs.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
        return containerSongs.createOrGetAdapter(context, 0);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Cursor item = getItem(i);
        ContentItemViewHolder contentItemViewHolder = (ContentItemViewHolder) viewHolder;
        contentItemViewHolder.itemPosition = i;
        getView(item, i, contentItemViewHolder);
    }

    void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        long j = cursor.getLong(0);
        contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(j), getSelectionContainerIdentifier());
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(this.itemListenerActions, -1, this);
        contentItemViewHolder.imgArt.setVisibility(0);
        contentItemViewHolder.setImgColorFilter(-1);
        Uri albumArtContent = albumArtContent(j, contentItemViewHolder.itemView.getContext());
        String string = cursor.getString(3);
        if (AlbumArtCore.THUMB_FROM_RESOLVER || string != null) {
            onRequestAlbumArt.invoke(new AlbumArtRequest(albumArtContent, string, null, null), contentItemViewHolder.imgArt, true, false);
        } else {
            contentItemViewHolder.setImgResource(R.drawable.placeholderart4);
        }
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(cursor.getString(1));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Visibility(0);
        contentItemViewHolder.setTxtItemLine2Text(cursor.getString(3));
        contentItemViewHolder.txtItemDuration.setText(cursor.getString(2));
    }

    private Uri albumArtContent(long j, Context context) {
        if (AlbumArtCore.THUMB_FROM_RESOLVER) {
            Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id"}, "album_id=?", new String[]{j + ""}, null);
            if (querySafe != null && querySafe.moveToFirst()) {
                return ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, querySafe.getLong(0));
            }
            return Uri.EMPTY;
        }
        return Uri.EMPTY;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Albums_search);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        public final long id;

        public ThisItemIdentifier(long j) {
            this.id = j;
        }

        public int hashCode() {
            return (int) this.id;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ThisItemIdentifier) && this.id == ((ThisItemIdentifier) obj).id;
        }
    }
}
