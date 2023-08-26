package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.AOSPutils.Context_storage;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.ContextualActionBar.ActionListenerBase;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsFolders;
import com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ContentItemViewHolder;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.io.File;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ContainerFolders extends CursorContainerBase {
    private static final int defaultActionIndex = 0;
    private static final int primaryActionIndex = -1;
    ActionListenerBase[] itemListenerActions;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.CursorContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        return 0;
    }

    public ContainerFolders(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        this.itemListenerActions = new ActionListenerBase[]{new ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlaySingleItemAction.PlaySingleActionListener2
            protected void onPlaySingle(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFolders.this.getChildItems(context2, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.2
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.PlayMultiItemAction.PlayMultiActionListener2
            protected void onPlayMulti(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFolders.this.getChildItems(context2, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.3
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueue.EnqueueActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFolders.this.getChildItems(context2, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.4
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.ItemActionEnqueueNext.EnqueueNextActionListener2
            protected void onEnqueue(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFolders.this.getChildItems(context2, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsSongs.SendToItemAction.SendToActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.5
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsSongs.SendToItemAction.SendToActionListener
            protected void onSendTo(Context context2, Object obj, List<PlaylistSong> list) {
                ContainerFolders.this.getChildItems(context2, ((ThisItemIdentifier) obj).path, list);
            }
        }, new ItemActionsFolders.RemoveFolderAction.RemoveFolderActionListener() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.ContainerFolders.6
            @Override // com.daaw.avee.comp.LibraryQueueUI.ContextualActions.ItemActionsFolders.RemoveFolderAction.RemoveFolderActionListener
            protected void onRemoveFolder(Context context2, Object obj, MultiList<String, String> multiList) {
                ThisItemIdentifier thisItemIdentifier = (ThisItemIdentifier) obj;
                multiList.add((MultiList<String, String>) thisItemIdentifier.id, thisItemIdentifier.path);
            }
        }};
        init(context);
    }

    static Tuple2<Cursor, String> makeCursor(Context context, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        MultiList<String, String> prefGetLibraryFolders = AppPreferences.createOrGetInstance().prefGetLibraryFolders(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "", ""});
        Iterator<Tuple2<String, String>> it = prefGetLibraryFolders.iterator();
        while (it.hasNext()) {
            Tuple2<String, String> next = it.next();
            matrixCursor.addRow(new String[]{next.obj1, next.obj2, "2131230932"});
        }
        return new Tuple2<>(matrixCursor, "");
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase
    public ViewAdapter createAdapter(Context context, int i) {
        return new ViewAdapter(new HeaderFooterAdapterData(this, this, 5, 1), this);
    }

    List<PlaylistSong> getChildItems(Context context, String str, List<PlaylistSong> list) {
        return ContainerFile.getTrackList(context, this.pageIndex, getSelectionContainerIdentifier(), str, list);
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
            ContainerFile containerFile = new ContainerFile(context, new File(string), makeChildAddress(str), this.pageIndex);
            containerFile.setLibraryContainerDataListener(this.libraryContainerDataListenerWeak);
            return containerFile.createOrGetAdapter(context);
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
        contentItemViewHolder.setImgResource(cursor.getInt(2));
        contentItemViewHolder.txtNum.setVisibility(8);
        String string = cursor.getString(1);
        contentItemViewHolder.txtItemLine1.setText(Context_storage.getPathFolderName(string, PlayerCore.s().getAppContext()));
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ThisItemIdentifier {
        final String id;
        final String path;

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
