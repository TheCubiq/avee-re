package xyz.danoz.recyclerviewfastscroller;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import xyz.danoz.recyclerviewfastscroller.calculation.progress.TouchableScrollProgressCalculator;
import xyz.danoz.recyclerviewfastscroller.sectionindicator.SectionIndicator;
/* loaded from: classes2.dex */
public abstract class AbsRecyclerViewFastScroller extends FrameLayout implements RecyclerViewScroller {
    private static final int[] STYLEABLE = R.styleable.AbsRecyclerViewFastScroller;
    protected final View mBar;
    protected final View mHandle;
    protected RecyclerView.OnScrollListener mOnScrollListener;
    private RecyclerView mRecyclerView;
    private SectionIndicator mSectionIndicator;

    protected abstract int getLayoutResourceId();

    protected abstract TouchableScrollProgressCalculator getScrollProgressCalculator();

    public abstract void moveHandleToPosition(float f);

    protected abstract void onCreateScrollProgressCalculator();

    public AbsRecyclerViewFastScroller(Context context) {
        this(context, null, 0);
    }

    public AbsRecyclerViewFastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsRecyclerViewFastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, STYLEABLE, 0, 0);
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(obtainStyledAttributes.getResourceId(R.styleable.AbsRecyclerViewFastScroller_rfs_fast_scroller_layout, getLayoutResourceId()), (ViewGroup) this, true);
            this.mBar = findViewById(R.id.scroll_bar);
            this.mHandle = findViewById(R.id.scroll_handle);
            applyCustomAttributesToView(this.mBar, obtainStyledAttributes.getDrawable(R.styleable.AbsRecyclerViewFastScroller_rfs_barBackground), obtainStyledAttributes.getColor(R.styleable.AbsRecyclerViewFastScroller_rfs_barColor, -7829368));
            applyCustomAttributesToView(this.mHandle, obtainStyledAttributes.getDrawable(R.styleable.AbsRecyclerViewFastScroller_rfs_handleBackground), obtainStyledAttributes.getColor(R.styleable.AbsRecyclerViewFastScroller_rfs_handleColor, -7829368));
            obtainStyledAttributes.recycle();
            setOnTouchListener(new FastScrollerTouchListener(this));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void applyCustomAttributesToView(View view, Drawable drawable, int i) {
        if (drawable != null) {
            setViewBackground(view, drawable);
        } else {
            view.setBackgroundColor(i);
        }
    }

    public void setHandleColor(int i) {
        this.mHandle.setBackgroundColor(i);
    }

    public void setHandleBackground(Drawable drawable) {
        setViewBackground(this.mHandle, drawable);
    }

    public void setBarColor(int i) {
        this.mBar.setBackgroundColor(i);
    }

    public void setBarBackground(Drawable drawable) {
        setViewBackground(this.mBar, drawable);
    }

    private void setViewBackground(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    @Override // xyz.danoz.recyclerviewfastscroller.RecyclerViewScroller
    public void setRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    public void setSectionIndicator(SectionIndicator sectionIndicator) {
        this.mSectionIndicator = sectionIndicator;
    }

    public SectionIndicator getSectionIndicator() {
        return this.mSectionIndicator;
    }

    @Override // xyz.danoz.recyclerviewfastscroller.RecyclerViewScroller
    public void scrollTo(float f, boolean z) {
        int positionFromScrollProgress = getPositionFromScrollProgress(f);
        this.mRecyclerView.scrollToPosition(positionFromScrollProgress);
        updateSectionIndicator(positionFromScrollProgress, f);
    }

    private void updateSectionIndicator(int i, float f) {
        SectionIndicator sectionIndicator = this.mSectionIndicator;
        if (sectionIndicator != null) {
            sectionIndicator.setProgress(f);
            if (this.mRecyclerView.getAdapter() instanceof SectionIndexer) {
                SectionIndexer sectionIndexer = (SectionIndexer) this.mRecyclerView.getAdapter();
                int sectionForPosition = sectionIndexer.getSectionForPosition(i);
                this.mSectionIndicator.setSection(sectionIndexer.getSections()[sectionForPosition]);
            }
        }
    }

    private int getPositionFromScrollProgress(float f) {
        return (int) (Math.max(this.mRecyclerView.getAdapter().getItemCount() - 1, 0) * f);
    }

    @Override // xyz.danoz.recyclerviewfastscroller.RecyclerViewScroller
    public RecyclerView.OnScrollListener getOnScrollListener() {
        if (this.mOnScrollListener == null) {
            this.mOnScrollListener = new RecyclerView.OnScrollListener() { // from class: xyz.danoz.recyclerviewfastscroller.AbsRecyclerViewFastScroller.1
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    TouchableScrollProgressCalculator scrollProgressCalculator = AbsRecyclerViewFastScroller.this.getScrollProgressCalculator();
                    AbsRecyclerViewFastScroller.this.moveHandleToPosition(scrollProgressCalculator != null ? scrollProgressCalculator.calculateScrollProgress(recyclerView) : 0.0f);
                }
            };
        }
        return this.mOnScrollListener;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getScrollProgressCalculator() == null) {
            onCreateScrollProgressCalculator();
        }
        moveHandleToPosition(getScrollProgressCalculator().calculateScrollProgress(this.mRecyclerView));
    }

    public float getScrollProgress(MotionEvent motionEvent) {
        if (getScrollProgressCalculator() != null) {
            return getScrollProgressCalculator().calculateScrollProgress(motionEvent);
        }
        return 0.0f;
    }
}
