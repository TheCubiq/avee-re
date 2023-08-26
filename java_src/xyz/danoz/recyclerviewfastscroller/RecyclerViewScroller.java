package xyz.danoz.recyclerviewfastscroller;

import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes2.dex */
public interface RecyclerViewScroller {
    RecyclerView.OnScrollListener getOnScrollListener();

    void scrollTo(float f, boolean z);

    void setRecyclerView(RecyclerView recyclerView);
}
