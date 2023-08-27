package com.daaw.avee.comp.VisualizerCutomization;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.comp.VisualizerCutomization.CustomSimpleAdapter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class CustomSimpleSectionedAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int SECTION_TYPE = 0;
    private final Func<Boolean> isCollapsed;
    private CustomSimpleAdapter mBaseAdapter;
    private final Context mContext;
    private int mSectionResourceId;
    private CustomSimpleAdapter.IOnItemClickListener onItemClickListener;
    private boolean mValid = true;
    private SparseArray<Section> mSections = new SparseArray<>();
    private int selectedItemPosition = -1;

    public CustomSimpleSectionedAdapter(Context context, int i, int i2, CustomSimpleAdapter customSimpleAdapter, Func<Boolean> func) {
        this.mSectionResourceId = i;
        this.mBaseAdapter = customSimpleAdapter;
        this.mContext = context;
        this.isCollapsed = func;
        customSimpleAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleSectionedAdapter.1
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                CustomSimpleSectionedAdapter customSimpleSectionedAdapter = CustomSimpleSectionedAdapter.this;
                customSimpleSectionedAdapter.mValid = customSimpleSectionedAdapter.mBaseAdapter.getItemCount() > 0;
                CustomSimpleSectionedAdapter.this.notifyDataSetChanged();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i3, int i4) {
                CustomSimpleSectionedAdapter customSimpleSectionedAdapter = CustomSimpleSectionedAdapter.this;
                customSimpleSectionedAdapter.mValid = customSimpleSectionedAdapter.mBaseAdapter.getItemCount() > 0;
                CustomSimpleSectionedAdapter.this.notifyItemRangeChanged(i3, i4);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i3, int i4) {
                CustomSimpleSectionedAdapter customSimpleSectionedAdapter = CustomSimpleSectionedAdapter.this;
                customSimpleSectionedAdapter.mValid = customSimpleSectionedAdapter.mBaseAdapter.getItemCount() > 0;
                CustomSimpleSectionedAdapter.this.notifyItemRangeInserted(i3, i4);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i3, int i4) {
                CustomSimpleSectionedAdapter customSimpleSectionedAdapter = CustomSimpleSectionedAdapter.this;
                customSimpleSectionedAdapter.mValid = customSimpleSectionedAdapter.mBaseAdapter.getItemCount() > 0;
                CustomSimpleSectionedAdapter.this.notifyItemRangeRemoved(i3, i4);
            }
        });
    }

    public void baseAdapterSetDataAt(int i, Tuple2<String, String> tuple2) {
        this.mBaseAdapter.setDataAt(sectionedPositionToPosition(i), tuple2);
        notifyItemChanged(i);
    }

    public void setSelectedItem(int i) {
        setSelectedItem(i, null);
    }

    public void setSelectedItem(int i, View view) {
        if (isSectionHeaderPosition(i)) {
            this.mBaseAdapter.setSelectedItem(-1, null);
            _setSelectedItem(i, view);
            return;
        }
        _setSelectedItem(-1, null);
        this.mBaseAdapter.setSelectedItem(i, view);
    }

    private void _setSelectedItem(int i, View view) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new CustomSimpleViewHolder(LayoutInflater.from(this.mContext).inflate(this.mSectionResourceId, viewGroup, false));
        }
        return this.mBaseAdapter.onCreateViewHolder(viewGroup, i - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (isSectionHeaderPosition(i)) {
            final CustomSimpleViewHolder customSimpleViewHolder = (CustomSimpleViewHolder) viewHolder;
            customSimpleViewHolder.initItem();
            customSimpleViewHolder.title.setText(this.mSections.get(i).title);
            customSimpleViewHolder.setTextSubtitle("");
            customSimpleViewHolder.collapsible.setVisibility(this.isCollapsed.onInvoke().booleanValue() ? 8 : 0);
            customSimpleViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleSectionedAdapter.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CustomSimpleSectionedAdapter.this.onItemClickListener.onItemClick(customSimpleViewHolder.getAdapterPosition(), customSimpleViewHolder.itemView);
                }
            });
            customSimpleViewHolder.btnItemMore.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleSectionedAdapter.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CustomSimpleSectionedAdapter.this.onItemClickListener.onItemClick(customSimpleViewHolder.getAdapterPosition(), customSimpleViewHolder.itemView);
                }
            });
            customSimpleViewHolder.itemView.setSelected(customSimpleViewHolder.itemPosition == this.selectedItemPosition);
            return;
        }
        this.mBaseAdapter.onBindViewHolder((CustomSimpleViewHolder) viewHolder, sectionedPositionToPosition(i));
    }

    public void setOnItemClickListener(CustomSimpleAdapter.IOnItemClickListener iOnItemClickListener) {
        this.onItemClickListener = iOnItemClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (isSectionHeaderPosition(i)) {
            return 0;
        }
        return this.mBaseAdapter.getItemViewType(sectionedPositionToPosition(i)) + 1;
    }

    /* loaded from: classes.dex */
    public static class Section {
        int firstPosition;
        int sectionedPosition;
        CharSequence title;

        public Section(int i, CharSequence charSequence) {
            this.firstPosition = i;
            this.title = charSequence;
        }

        public CharSequence getTitle() {
            return this.title;
        }

        public void setFirstPosition(int i) {
            this.firstPosition = i;
        }
    }

    public void setSections(Section[] sectionArr) {
        this.mSections.clear();
        Arrays.sort(sectionArr, new Comparator<Section>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomSimpleSectionedAdapter.4
            @Override // java.util.Comparator
            public int compare(Section section, Section section2) {
                if (section.firstPosition == section2.firstPosition) {
                    return 0;
                }
                return section.firstPosition < section2.firstPosition ? -1 : 1;
            }
        });
        int i = 0;
        for (Section section : sectionArr) {
            section.sectionedPosition = section.firstPosition + i;
            this.mSections.append(section.sectionedPosition, section);
            i++;
        }
        notifyDataSetChanged();
    }

    public void setSections(List<Section> list) {
        this.mSections.clear();
        int i = 0;
        for (Section section : list) {
            section.sectionedPosition = section.firstPosition + i;
            this.mSections.append(section.sectionedPosition, section);
            i++;
        }
        notifyDataSetChanged();
    }

    public int positionToSectionedPosition(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.mSections.size() && this.mSections.valueAt(i3).firstPosition <= i; i3++) {
            i2++;
        }
        return i + i2;
    }

    public int sectionedPositionToPosition(int i) {
        if (isSectionHeaderPosition(i)) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.mSections.size() && this.mSections.valueAt(i3).sectionedPosition <= i; i3++) {
            i2--;
        }
        return i + i2;
    }

    public boolean isSectionHeaderPosition(int i) {
        return this.mSections.get(i) != null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (isSectionHeaderPosition(i)) {
            return Integer.MAX_VALUE - this.mSections.indexOfKey(i);
        }
        return this.mBaseAdapter.getItemId(sectionedPositionToPosition(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mBaseAdapter.getItemCount() + this.mSections.size();
    }
}
