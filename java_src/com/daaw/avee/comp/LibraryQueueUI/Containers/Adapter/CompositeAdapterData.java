package com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.IContainerData;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.BaseViewHolder;
import com.daaw.avee.comp.LibraryQueueUI.ViewHolders.ViewHolderFactory;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class CompositeAdapterData implements ViewAdapter.IAdapterDataProvider {
    private WeakReference<IAdapter> adapter = new WeakReference<>(null);
    private ViewAdapter.IAdapterDataProvider[] adapterData;
    private IAdapter[] adapterWrap;
    private IContainerData[] containerData;
    private SectionDesc[] sectionDesc;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int dataPositionToPosition(int i) {
        return 0;
    }

    public CompositeAdapterData(SectionDesc[] sectionDescArr, ViewAdapter.IAdapterDataProvider[] iAdapterDataProviderArr, IContainerData[] iContainerDataArr) {
        this.containerData = iContainerDataArr;
        this.sectionDesc = sectionDescArr;
        this.adapterData = iAdapterDataProviderArr;
        this.adapterWrap = new IAdapter[iAdapterDataProviderArr.length];
        for (int i = 0; i < iAdapterDataProviderArr.length; i++) {
            this.adapterWrap[i] = new AdapterWrap(i);
            iAdapterDataProviderArr[i].onAdapterInitialized(this.adapterWrap[i]);
        }
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
        for (ViewAdapter.IAdapterDataProvider iAdapterDataProvider : this.adapterData) {
            iAdapterDataProvider.onAdapterDispose();
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemViewType(int i) {
        Tuple2<Integer, Integer> positionToDataPosition = positionToDataPosition(i);
        if (positionToDataPosition.obj1.intValue() < 0) {
            return this.sectionDesc[positionToDataPosition.obj2.intValue()].getViewType();
        }
        return this.adapterData[positionToDataPosition.obj2.intValue()].getItemViewType(positionToDataPosition.obj1.intValue());
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public int getItemCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.adapterData.length; i2++) {
            i = this.containerData[i2].getSectionOpened() ? i + this.adapterData[i2].getItemCount() + 1 : i + 1;
        }
        return i;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public long getItemId(int i) {
        Tuple2<Integer, Integer> positionToDataPosition = positionToDataPosition(i);
        if (positionToDataPosition.obj1.intValue() < 0) {
            return -1L;
        }
        return this.adapterData[positionToDataPosition.obj2.intValue()].getItemId(positionToDataPosition.obj1.intValue());
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return ViewHolderFactory.newInstance(viewGroup.getContext(), viewGroup, i, this.containerData[0]);
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Tuple2<Integer, Integer> positionToDataPosition = positionToDataPosition(i);
        if (positionToDataPosition.obj1.intValue() < 0) {
            ((BaseViewHolder) viewHolder).onBind(this.containerData[positionToDataPosition.obj2.intValue()], positionToDataPosition.obj2.intValue());
        } else {
            this.adapterData[positionToDataPosition.obj2.intValue()].onBindViewHolder(viewHolder, positionToDataPosition.obj1.intValue());
        }
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.ViewAdapter.IAdapterDataProvider
    public void onItemsMoved(int i, int i2, List<Integer> list) {
        Tuple2<Integer, Integer> positionToDataPosition = positionToDataPosition(i);
        Tuple2<Integer, Integer> positionToDataPosition2 = positionToDataPosition(i2);
        if (!positionToDataPosition.obj2.equals(positionToDataPosition.obj1)) {
            tlog.w("Assert posFrom.obj2 != posFrom.obj1");
            this.adapterData[positionToDataPosition2.obj2.intValue()].onItemsMoved(positionToDataPosition.obj1.intValue(), -1, list);
            return;
        }
        this.adapterData[positionToDataPosition2.obj2.intValue()].onItemsMoved(positionToDataPosition.obj1.intValue(), positionToDataPosition2.obj1.intValue(), list);
    }

    public int dataPositionToPosition(int i, int i2) {
        int min = Math.min(i2, this.adapterData.length);
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            i3 = this.containerData[i4].getSectionOpened() ? i3 + this.adapterData[i4].getItemCount() + 1 : i3 + 1;
        }
        return i + i3 + 1;
    }

    public Tuple2<Integer, Integer> positionToDataPosition(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < this.adapterData.length) {
            i3 = this.containerData[i2].getSectionOpened() ? i3 + this.adapterData[i2].getItemCount() + 1 : i3 + 1;
            if (i < i3) {
                return new Tuple2<>(Integer.valueOf((i - i4) - 1), Integer.valueOf(i2));
            }
            i2++;
            i4 = i3;
        }
        return new Tuple2<>(-1, -1);
    }

    /* loaded from: classes.dex */
    public static class SectionDesc {
        private final int viewType;

        public SectionDesc(int i) {
            this.viewType = i;
        }

        public int getViewType() {
            return this.viewType;
        }
    }

    /* loaded from: classes.dex */
    class AdapterWrap implements IAdapter {
        int sectionIndex;

        public AdapterWrap(int i) {
            this.sectionIndex = i;
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyDataSetChanged() {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyDataSetChanged();
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemChanged(int i) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemChanged(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex));
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemRangeChanged(int i, int i2) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemRangeChanged(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex), i2);
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemInserted(int i) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemInserted(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex));
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemMoved(int i, int i2) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemMoved(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex), CompositeAdapterData.this.dataPositionToPosition(i2, this.sectionIndex));
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemRangeInserted(int i, int i2) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemRangeInserted(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex), i2);
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemRemoved(int i) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemRemoved(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex));
            }
        }

        @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Adapter.IAdapter
        public void myNotifyItemRangeRemoved(int i, int i2) {
            IAdapter adapter = CompositeAdapterData.this.getAdapter();
            if (adapter != null) {
                adapter.myNotifyItemRangeRemoved(CompositeAdapterData.this.dataPositionToPosition(i, this.sectionIndex), i2);
            }
        }
    }
}
