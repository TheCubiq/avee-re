package com.daaw.avee.comp.VisualizerCutomization;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class CustomSimpleAdapter extends RecyclerView.Adapter<CustomSimpleViewHolder> {
    private final Context mContext;
    private List<Tuple2<String, String>> mData;
    private IOnDraggingListener onDraggingListener;
    private IOnItemClickListener onItemClickListener;
    private IOnItemClickListener onItemLongClickListener;
    private ViewGroup scrollView;
    private int selectedItemPosition = -1;
    private boolean collapsed = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface IOnDraggingListener {
        void onStartDragging(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface IOnItemClickListener {
        boolean onItemClick(int i, View view);
    }

    public void add(Tuple2<String, String> tuple2, int i) {
        if (i == -1) {
            i = getItemCount();
        }
        this.mData.add(i, tuple2);
        notifyItemInserted(i);
    }

    public void remove(int i) {
        if (i < getItemCount()) {
            this.mData.remove(i);
            notifyItemRemoved(i);
        }
    }

    public void setDataAt(int i, Tuple2<String, String> tuple2) {
        if (i < 0 || i >= this.mData.size()) {
            return;
        }
        this.mData.set(i, tuple2);
    }

    public void setAllData(Tuple2<String, String>[] tuple2Arr) {
        this.mData = new ArrayList(Arrays.asList(tuple2Arr));
        notifyDataSetChanged();
    }

    public void setAllData(List<Tuple2<String, String>> list) {
        this.mData = list;
        notifyDataSetChanged();
    }

    public boolean getCollapsed() {
        return this.collapsed;
    }

    public void setCollapsed(boolean z) {
        if (this.collapsed == z) {
            return;
        }
        this.collapsed = z;
        notifyDataSetChanged();
    }

    public void setSelectedItem(int i) {
        setSelectedItem(i, null);
    }

    public void setSelectedItem(int i, View view) {
        if (view != null) {
            view.setSelected(true);
        } else {
            int i2 = this.selectedItemPosition;
            if (i2 >= 0) {
                notifyItemChanged(i2);
            }
        }
        this.selectedItemPosition = i;
        if (i >= 0) {
            notifyItemChanged(i);
        }
    }

    public CustomSimpleAdapter(Context context, List<Tuple2<String, String>> list, ViewGroup viewGroup) {
        this.mContext = context;
        if (list != null) {
            this.mData = list;
        } else {
            this.mData = new ArrayList();
        }
        this.scrollView = viewGroup;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public CustomSimpleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new CustomSimpleViewHolder(LayoutInflater.from(this.mContext).inflate(R.layout.custom_simple_item, viewGroup, false), this.onDraggingListener, this.scrollView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(final CustomSimpleViewHolder customSimpleViewHolder, int i) {
        customSimpleViewHolder.initItem();
        Tuple2<String, String> tuple2 = this.mData.get(i);
        customSimpleViewHolder.title.setText(tuple2.obj1);
        customSimpleViewHolder.setTextSubtitle(tuple2.obj2);
        customSimpleViewHolder.collapsible.setVisibility(this.collapsed ? 8 : 0);
        customSimpleViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomSimpleAdapter.this.onItemClickListener.onItemClick(customSimpleViewHolder.getAdapterPosition(), customSimpleViewHolder.itemView);
            }
        });
        customSimpleViewHolder.btnItemMore.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomSimpleAdapter.this.onItemClickListener.onItemClick(customSimpleViewHolder.getAdapterPosition(), customSimpleViewHolder.itemView);
            }
        });
        customSimpleViewHolder.itemView.setSelected(customSimpleViewHolder.itemPosition == this.selectedItemPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mData.size();
    }

    public void setOnDraggingListener(IOnDraggingListener iOnDraggingListener) {
        this.onDraggingListener = iOnDraggingListener;
    }

    public void setOnItemClickListener(IOnItemClickListener iOnItemClickListener) {
        this.onItemClickListener = iOnItemClickListener;
    }

    public void setOnItemLongClickListener(IOnItemClickListener iOnItemClickListener) {
        this.onItemLongClickListener = iOnItemClickListener;
    }
}
