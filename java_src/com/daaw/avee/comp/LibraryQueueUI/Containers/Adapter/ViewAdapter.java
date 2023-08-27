package com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import java.util.List;
/* loaded from: classes.dex */
public class ViewAdapter extends RecyclerView.Adapter implements IAdapter {
    private IContainerData data;
    private IAdapterDataProvider dataProvider;

    /* loaded from: classes.dex */
    public interface IAdapterDataProvider {
        int dataPositionToPosition(int i);

        int getItemCount();

        long getItemId(int i);

        int getItemViewType(int i);

        void onAdapterDispose();

        void onAdapterInitialized(IAdapter iAdapter);

        void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i);

        RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i);

        void onItemsMoved(int i, int i2, List<Integer> list);
    }

    public ViewAdapter(IAdapterDataProvider iAdapterDataProvider, IContainerData iContainerData) {
        this.data = iContainerData;
        setHasStableIds(false);
        this.dataProvider = iAdapterDataProvider;
        iAdapterDataProvider.onAdapterInitialized(this);
    }

    public void dispose() {
        this.dataProvider.onAdapterDispose();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.dataProvider.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataProvider.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.dataProvider.onCreateViewHolder(viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.dataProvider.onBindViewHolder(viewHolder, i);
    }

    public void onItemsMoved(int i, int i2, List<Integer> list) {
        this.dataProvider.onItemsMoved(i, i2, list);
    }

    public int dataPositionToPosition(int i) {
        return this.dataProvider.dataPositionToPosition(i);
    }

    public IContainerData getContainerData() {
        return this.data;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyDataSetChanged() {
        notifyDataSetChanged();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemChanged(int i) {
        notifyItemChanged(i);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemRangeChanged(int i, int i2) {
        notifyItemRangeChanged(i, i2);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemInserted(int i) {
        notifyItemInserted(i);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemMoved(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemRangeInserted(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemRemoved(int i) {
        notifyItemRemoved(i);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
    public void myNotifyItemRangeRemoved(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }
}
