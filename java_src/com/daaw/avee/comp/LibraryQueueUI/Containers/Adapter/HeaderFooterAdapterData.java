package com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ViewHolderFactory;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class HeaderFooterAdapterData implements ViewAdapter.IAdapterDataProvider {
    private WeakReference<IAdapter> adapter = new WeakReference<>(null);
    private ViewAdapter.IAdapterDataProvider adapterData;
    private IAdapter adapterWrap;
    private IContainerData containerData;
    private int footerViewType;
    private int headerViewType;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int dataPositionToPosition(int i) {
        return i + 1;
    }

    public HeaderFooterAdapterData(ViewAdapter.IAdapterDataProvider iAdapterDataProvider, IContainerData iContainerData, int i, int i2) {
        this.containerData = iContainerData;
        this.adapterData = iAdapterDataProvider;
        this.headerViewType = i;
        this.footerViewType = i2;
        IAdapter iAdapter = new IAdapter() { // from class: com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.HeaderFooterAdapterData.1
            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyDataSetChanged() {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyDataSetChanged();
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemChanged(int i3) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemChanged(i3 + 1);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemRangeChanged(int i3, int i4) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemRangeChanged(i3 + 1, i4);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemInserted(int i3) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemInserted(i3 + 1);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemMoved(int i3, int i4) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemMoved(i3 + 1, i4 + 1);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemRangeInserted(int i3, int i4) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemRangeInserted(i3 + 1, i4);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemRemoved(int i3) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemRemoved(i3 + 1);
                }
            }

            @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
            public void myNotifyItemRangeRemoved(int i3, int i4) {
                IAdapter adapter = HeaderFooterAdapterData.this.getAdapter();
                if (adapter != null) {
                    adapter.myNotifyItemRangeRemoved(i3 + 1, i4);
                }
            }
        };
        this.adapterWrap = iAdapter;
        iAdapterDataProvider.onAdapterInitialized(iAdapter);
    }

    protected IAdapter getAdapter() {
        return this.adapter.get();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterInitialized(IAdapter iAdapter) {
        this.adapter = new WeakReference<>(iAdapter);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onAdapterDispose() {
        this.adapterData.onAdapterDispose();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        if (i == 0) {
            return this.headerViewType;
        }
        if (i == this.adapterData.getItemCount() + 1) {
            return this.footerViewType;
        }
        return this.adapterData.getItemViewType(i - 1);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemCount() {
        return this.adapterData.getItemCount() + 2;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public long getItemId(int i) {
        if (i <= 0 || i >= this.adapterData.getItemCount() + 1) {
            return -1L;
        }
        return this.adapterData.getItemId(i - 1);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == this.headerViewType) {
            return ViewHolderFactory.newInstance(viewGroup.getContext(), viewGroup, i, this.containerData);
        }
        if (i == this.footerViewType) {
            return ViewHolderFactory.newInstance(viewGroup.getContext(), viewGroup, i, this.containerData);
        }
        return this.adapterData.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i > 0 && i < this.adapterData.getItemCount() + 1) {
            this.adapterData.onBindViewHolder(viewHolder, i - 1);
        } else {
            ((BaseViewHolder) viewHolder).onBind(this.containerData, i);
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onItemsMoved(int i, int i2, List<Integer> list) {
        this.adapterData.onItemsMoved(i - 1, i2 - 1, list);
    }
}
