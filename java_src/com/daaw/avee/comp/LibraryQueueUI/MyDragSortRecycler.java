package com.daaw.avee.comp.LibraryQueueUI;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.emtronics.dragsortrecycler.DragSortRecycler;
/* loaded from: classes.dex */
public class MyDragSortRecycler extends DragSortRecycler {
    @Override // com.emtronics.dragsortrecycler.DragSortRecycler, androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        ((GridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
    }
}
