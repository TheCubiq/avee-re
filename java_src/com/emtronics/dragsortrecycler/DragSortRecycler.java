package com.emtronics.dragsortrecycler;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class DragSortRecycler extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {
    OnDragStateChangedListener dragStateChangedListener;
    private int fingerAnchorY;
    private int fingerOffsetInViewY;
    private int fingerY;
    private BitmapDrawable floatingItem;
    private Rect floatingItemBounds;
    private Rect floatingItemStatingBounds;
    private boolean isDragging;
    OnItemMovedListener moveInterface;
    final String TAG = "DragSortRecycler";
    final boolean DEBUG = false;
    private int dragHandleWidth = 0;
    private int selectedDragItemPos = -1;
    private float autoScrollWindow = 0.1f;
    private float autoScrollSpeed = 0.5f;
    private float floatingItemAlpha = 0.5f;
    private int floatingItemBgColor = 0;
    private int viewHandleId = -1;
    View draggingItemView = null;
    Paint bgColor = new Paint();
    RecyclerView.OnScrollListener scrollListener = new RecyclerView.OnScrollListener() { // from class: com.emtronics.dragsortrecycler.DragSortRecycler.1
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            DragSortRecycler dragSortRecycler = DragSortRecycler.this;
            dragSortRecycler.debugLog("Scrolled: " + i + " " + i2);
            DragSortRecycler dragSortRecycler2 = DragSortRecycler.this;
            dragSortRecycler2.fingerAnchorY = dragSortRecycler2.fingerAnchorY - i2;
        }
    };

    /* loaded from: classes.dex */
    public interface OnDragStateChangedListener {
        void onDragStart();

        void onDragStop();
    }

    /* loaded from: classes.dex */
    public interface OnItemMovedListener {
        void onItemMoved(int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void debugLog(String str) {
    }

    protected boolean canDragOver(int i) {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public RecyclerView.OnScrollListener getScrollListener() {
        return this.scrollListener;
    }

    public void setOnItemMovedListener(OnItemMovedListener onItemMovedListener) {
        this.moveInterface = onItemMovedListener;
    }

    public void setViewHandleId(int i) {
        this.viewHandleId = i;
    }

    public void setLeftDragArea(int i) {
        this.dragHandleWidth = i;
    }

    public void setFloatingAlpha(float f) {
        this.floatingItemAlpha = f;
    }

    public void setFloatingBgColor(int i) {
        this.floatingItemBgColor = i;
    }

    public void setAutoScrollWindow(float f) {
        this.autoScrollWindow = f;
    }

    public void setAutoScrollSpeed(float f) {
        this.autoScrollSpeed = f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        debugLog("getItemOffsets");
        debugLog("View top = " + view.getTop());
        if (this.selectedDragItemPos != -1) {
            int childPosition = recyclerView.getChildPosition(view);
            debugLog("itemPos =" + childPosition);
            if (canDragOver(childPosition)) {
                if (childPosition == this.selectedDragItemPos) {
                    view.setVisibility(4);
                    return;
                }
                view.setVisibility(0);
                float height = this.floatingItemBounds.top + (this.floatingItemBounds.height() / 2);
                if (childPosition > this.selectedDragItemPos && view.getTop() < height) {
                    float top = (height - view.getTop()) / view.getHeight();
                    if (top > 1.0f) {
                        top = 1.0f;
                    }
                    rect.top = -((int) (this.floatingItemBounds.height() * top));
                    rect.bottom = (int) (this.floatingItemBounds.height() * top);
                }
                if (childPosition >= this.selectedDragItemPos || view.getBottom() <= height) {
                    return;
                }
                float bottom = (view.getBottom() - height) / view.getHeight();
                float f = bottom <= 1.0f ? bottom : 1.0f;
                rect.top = (int) (this.floatingItemBounds.height() * f);
                rect.bottom = -((int) (this.floatingItemBounds.height() * f));
                return;
            }
            return;
        }
        rect.top = 0;
        rect.bottom = 0;
        view.setVisibility(0);
    }

    private int getNewPostion(RecyclerView recyclerView) {
        int childPosition;
        int childCount = recyclerView.getLayoutManager().getChildCount();
        float height = this.floatingItemBounds.top + (this.floatingItemBounds.height() / 2);
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getLayoutManager().getChildAt(i3);
            if (childAt.getVisibility() == 0 && (childPosition = recyclerView.getChildPosition(childAt)) != this.selectedDragItemPos) {
                float top = childAt.getTop() + (childAt.getHeight() / 2);
                if (height > top) {
                    if (childPosition > i) {
                        i = childPosition;
                    }
                } else if (height <= top && childPosition < i2) {
                    i2 = childPosition;
                }
            }
        }
        debugLog("above = " + i + " below = " + i2);
        if (i2 == Integer.MAX_VALUE) {
            return i < this.selectedDragItemPos ? i + 1 : i;
        }
        if (i2 < this.selectedDragItemPos) {
            i2++;
        }
        return i2 - 1;
    }

    public void StartDragging(View view) {
        this.draggingItemView = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        debugLog("onInterceptTouchEvent");
        View view = this.draggingItemView;
        if (view == null) {
            return false;
        }
        debugLog("Started Drag");
        setIsDragging(true);
        this.floatingItem = createFloatingBitmap(view);
        int y = (int) motionEvent.getY();
        this.fingerAnchorY = y;
        this.fingerOffsetInViewY = y - view.getTop();
        this.fingerY = this.fingerAnchorY;
        this.selectedDragItemPos = recyclerView.getChildPosition(view);
        debugLog("selectedDragItemPos = " + this.selectedDragItemPos);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        float f;
        float height;
        debugLog("onTouchEvent");
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.selectedDragItemPos != -1) {
                int newPostion = getNewPostion(recyclerView);
                OnItemMovedListener onItemMovedListener = this.moveInterface;
                if (onItemMovedListener != null) {
                    onItemMovedListener.onItemMoved(this.selectedDragItemPos, newPostion);
                }
            }
            this.draggingItemView = null;
            setIsDragging(false);
            this.selectedDragItemPos = -1;
            this.floatingItem = null;
            recyclerView.invalidateItemDecorations();
            return;
        }
        int y = (int) motionEvent.getY();
        this.fingerY = y;
        if (this.floatingItem != null) {
            this.floatingItemBounds.top = y - this.fingerOffsetInViewY;
            if (this.floatingItemBounds.top < (-this.floatingItemStatingBounds.height()) / 2) {
                this.floatingItemBounds.top = (-this.floatingItemStatingBounds.height()) / 2;
            }
            Rect rect = this.floatingItemBounds;
            rect.bottom = rect.top + this.floatingItemStatingBounds.height();
            this.floatingItem.setBounds(this.floatingItemBounds);
        }
        float f2 = 0.0f;
        if (this.fingerY > recyclerView.getHeight() * (1.0f - this.autoScrollWindow)) {
            f = this.fingerY;
            height = recyclerView.getHeight() * (1.0f - this.autoScrollWindow);
        } else {
            if (this.fingerY < recyclerView.getHeight() * this.autoScrollWindow) {
                f = this.fingerY;
                height = recyclerView.getHeight() * this.autoScrollWindow;
            }
            debugLog("Scroll: " + f2);
            recyclerView.scrollBy(0, (int) (f2 * this.autoScrollSpeed));
            recyclerView.invalidateItemDecorations();
        }
        f2 = f - height;
        debugLog("Scroll: " + f2);
        recyclerView.scrollBy(0, (int) (f2 * this.autoScrollSpeed));
        recyclerView.invalidateItemDecorations();
    }

    private void setIsDragging(boolean z) {
        if (z != this.isDragging) {
            this.isDragging = z;
            OnDragStateChangedListener onDragStateChangedListener = this.dragStateChangedListener;
            if (onDragStateChangedListener != null) {
                if (z) {
                    onDragStateChangedListener.onDragStart();
                } else {
                    onDragStateChangedListener.onDragStop();
                }
            }
        }
    }

    public void setOnDragStateChangedListener(OnDragStateChangedListener onDragStateChangedListener) {
        this.dragStateChangedListener = onDragStateChangedListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        BitmapDrawable bitmapDrawable = this.floatingItem;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (this.floatingItemAlpha * 255.0f));
            this.bgColor.setColor(this.floatingItemBgColor);
            canvas.drawRect(this.floatingItemBounds, this.bgColor);
            this.floatingItem.draw(canvas);
        }
    }

    private BitmapDrawable createFloatingBitmap(View view) {
        this.floatingItemStatingBounds = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        this.floatingItemBounds = new Rect(this.floatingItemStatingBounds);
        Bitmap createBitmap = Bitmap.createBitmap(this.floatingItemStatingBounds.width(), this.floatingItemStatingBounds.height(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(view.getResources(), createBitmap);
        bitmapDrawable.setBounds(this.floatingItemBounds);
        return bitmapDrawable;
    }
}
