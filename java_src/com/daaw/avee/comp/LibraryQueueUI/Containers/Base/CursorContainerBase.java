package com.daaw.avee.comp.LibraryQueueUI.Containers.Base;

import android.content.Context;
import android.database.Cursor;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.MediaStoreUtils;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VTaskResult;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ViewHolderFactory;
import java.lang.ref.WeakReference;
import java.util.List;
import junit.framework.Assert;
/* loaded from: classes.dex */
public abstract class CursorContainerBase extends ContainerBase implements ViewAdapter.IAdapterDataProvider {
    private WeakReference<IAdapter> associatedAdapter;
    private Cursor cursor;

    public abstract Tuple2<Cursor, String> createOrGetCursor(Context context);

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int dataPositionToPosition(int i) {
        return i;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public long getItemId(int i) {
        return -1L;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public abstract int getItemViewType(int i);

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterDispose() {
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onItemsMoved(int i, int i2, List<Integer> list) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CursorContainerBase(Context context, String str, String str2, int i, int i2, WeakReference<IContainerData.ILibraryContainerDataListener> weakReference) {
        super(context, str, new VTaskResult(str2), i, i2, weakReference);
        this.associatedAdapter = new WeakReference<>(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CursorContainerBase(Context context, String str, String str2, int i, int i2) {
        super(context, str, new VTaskResult(str2), i, i2);
        this.associatedAdapter = new WeakReference<>(null);
    }

    public void dispose() {
        Assert.fail();
        MediaStoreUtils.closeCursor(this.cursor);
        this.cursor = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(Context context) {
        Tuple2<Cursor, String> createOrGetCursor = createOrGetCursor(context);
        setDataAndNotifyDataSetChanged(createOrGetCursor.obj1, createOrGetCursor.obj2);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public void updateSearchQuery(Context context, String str) {
        Tuple2<Cursor, String> createOrGetCursor = createOrGetCursor(context, str);
        if (createOrGetCursor != null) {
            setDataAndNotifyDataSetChanged(createOrGetCursor.obj1, createOrGetCursor.obj2);
        }
    }

    public Tuple2<Cursor, String> createOrGetCursor(Context context, String str) {
        return createOrGetCursor(context);
    }

    protected IAdapter getAssociatedAdapter() {
        return this.associatedAdapter.get();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterInitialized(IAdapter iAdapter) {
        this.associatedAdapter = new WeakReference<>(iAdapter);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public int getItemCount() {
        return this.cursor.getCount();
    }

    public Cursor getItem(int i) {
        this.cursor.moveToPosition(i);
        return this.cursor;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ViewHolderFactory.newInstance(viewGroup.getContext(), viewGroup, i, this);
    }

    public int findRowAndMove(String str, String str2) {
        return findRowAndMove(this.cursor.getColumnIndex(str), str2);
    }

    public int findRowAndMove(int i, String str) {
        this.cursor.moveToFirst();
        while (!this.cursor.isAfterLast()) {
            if (!this.cursor.getString(i).equals(str)) {
                this.cursor.moveToNext();
            } else {
                return this.cursor.getPosition();
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDataAndNotifyDataSetChanged(Cursor cursor, String str) {
        if (checkItemIdent(str, true)) {
            return;
        }
        MediaStoreUtils.closeCursor(this.cursor);
        Assert.assertNotNull(cursor);
        this.cursor = cursor;
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase, com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData
    public boolean RefreshContent() {
        IAdapter associatedAdapter = getAssociatedAdapter();
        if (associatedAdapter != null) {
            associatedAdapter.myNotifyDataSetChanged();
            return false;
        }
        return false;
    }
}
