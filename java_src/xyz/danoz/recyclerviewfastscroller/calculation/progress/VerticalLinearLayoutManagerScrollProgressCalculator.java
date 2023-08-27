package xyz.danoz.recyclerviewfastscroller.calculation.progress;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider;
/* loaded from: classes2.dex */
public class VerticalLinearLayoutManagerScrollProgressCalculator extends VerticalScrollProgressCalculator {
    public VerticalLinearLayoutManagerScrollProgressCalculator(VerticalScrollBoundsProvider verticalScrollBoundsProvider) {
        super(verticalScrollBoundsProvider);
    }

    @Override // xyz.danoz.recyclerviewfastscroller.calculation.progress.ScrollProgressCalculator
    public float calculateScrollProgress(RecyclerView recyclerView) {
        int findLastCompletelyVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition();
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            return 0.0f;
        }
        int height = recyclerView.getChildViewHolder(childAt).itemView.getHeight();
        int itemCount = recyclerView.getAdapter().getItemCount();
        int height2 = itemCount - (recyclerView.getHeight() / height);
        return (findLastCompletelyVisibleItemPosition - ((itemCount - height2) - 1)) / height2;
    }
}
