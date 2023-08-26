package xyz.danoz.recyclerviewfastscroller;

import android.view.MotionEvent;
import android.view.View;
import xyz.danoz.recyclerviewfastscroller.sectionindicator.SectionIndicator;
/* loaded from: classes2.dex */
class FastScrollerTouchListener implements View.OnTouchListener {
    private final AbsRecyclerViewFastScroller mFastScroller;

    public FastScrollerTouchListener(AbsRecyclerViewFastScroller absRecyclerViewFastScroller) {
        this.mFastScroller = absRecyclerViewFastScroller;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        showOrHideIndicator(this.mFastScroller.getSectionIndicator(), motionEvent);
        float scrollProgress = this.mFastScroller.getScrollProgress(motionEvent);
        this.mFastScroller.scrollTo(scrollProgress, true);
        this.mFastScroller.moveHandleToPosition(scrollProgress);
        return true;
    }

    private void showOrHideIndicator(SectionIndicator sectionIndicator, MotionEvent motionEvent) {
        if (sectionIndicator == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            sectionIndicator.animateAlpha(1.0f);
        } else if (actionMasked != 1) {
        } else {
            sectionIndicator.animateAlpha(0.0f);
        }
    }
}
