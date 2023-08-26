package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
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
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerArtists extends CursorContainerBase {
    private static final int defaultActionIndex = 0;
    private static final int primaryActionIndex = -1;
    ActionListenerBase[] itemListenerActionsSongs;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    /* loaded from: classes.dex */
    private static class ChildContentAccessor implements Func1<ContainerBase, MultiList<PlaylistSong, IItemIdentifier>> {
        private String genreId;

        ChildContentAccessor(String str) {
            this.genreId = str;
        }

        @Override // com.daaw.avee.Common.Func.Func1
        public MultiList<PlaylistSong, IItemIdentifier> onInvoke(ContainerBase containerBase) {
            return MultiList.fromList1FillWith2(ContainerArtists.getChildItems(PlayerCore.s().getAppContext(), containerBase, this.genreId, null), null);
        }
    }

    public ContainerArtists(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.itemListenerActionsSongs = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerArtists.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerArtists containerArtists = ContainerArtists.this;
                ContainerArtists.getChildItems(context2, containerArtists, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerArtists.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerArtists containerArtists = ContainerArtists.this;
                ContainerArtists.getChildItems(context2, containerArtists, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerArtists.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerArtists containerArtists = ContainerArtists.this;
                ContainerArtists.getChildItems(context2, containerArtists, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerArtists.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerArtists containerArtists = ContainerArtists.this;
                ContainerArtists.getChildItems(context2, containerArtists, "" + ((ThisItemIdentifier) obj).id, list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerArtists.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerArtists containerArtists = ContainerArtists.this;
                ContainerArtists.getChildItems(context2, containerArtists, "" + ((ThisItemIdentifier) obj).id, list);
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
            str = "artist LIKE ?";
        }
        return new Tuple2<>(MediaStoreUtils.querySafeEmpty(contentResolver, MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist", "number_of_tracks", "number_of_albums"}, str, strArr, null), invoke);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 8, 1), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<PlaylistSong> getChildItems(Context context, ContainerBase containerBase, String str, List<PlaylistSong> list) {
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data"}, "artist_id=?", new String[]{str}, MediaStoreUtils.getOrderBy(onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 0));
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
        Cursor querySafe = MediaStoreUtils.querySafe(context.getContentResolver(), MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist"}, "_id=?", new String[]{str}, null);
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

    public void getView(Cursor cursor, int i, ContentItemViewHolder contentItemViewHolder) {
        contentItemViewHolder.setToDefault(this, new ThisItemIdentifier(cursor.getLong(0)), getSelectionContainerIdentifier());
        contentItemViewHolder.viewItemBg.setSelected(onRequestContainsItemSelection.invoke(contentItemViewHolder.itemSelection, false).booleanValue());
        contentItemViewHolder.setItemActions2(this.itemListenerActionsSongs, -1, this);
        contentItemViewHolder.imgArt.setVisibility(8);
        contentItemViewHolder.setImageDrawable(null);
        contentItemViewHolder.txtNum.setVisibility(8);
        contentItemViewHolder.txtItemLine1.setText(cursor.getString(1));
        contentItemViewHolder.txtItemLine1.setTextColor(this.color);
        contentItemViewHolder.setTxtItemLine2Text(contentItemViewHolder.txtItemLine1.getResources().getQuantityString(R.plurals.albums_count, cursor.getInt(3), Integer.valueOf(cursor.getInt(3))));
        contentItemViewHolder.setTxtItemLine2Visibility(0);
        contentItemViewHolder.txtItemDuration.setText(cursor.getString(2));
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void getSearchOptions(Context context, String[] strArr, IGeneralItemContainerIdentifier[] iGeneralItemContainerIdentifierArr) {
        strArr[0] = context.getResources().getString(R.string.libContainer_Artists_search);
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
