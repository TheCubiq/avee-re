package com.astuetz;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Pair;
import androidx.viewpager.widget.ViewPager;
import com.daaw.avee.Common.IVAsyncTask;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.R;
import java.util.Locale;
/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {
    private static final int[] ATTRS = {16842806, 16842901, 16842904, 16842965, 16842966, 16842968};
    private static final int PADDING_INDEX = 3;
    private static final int PADDING_LEFT_INDEX = 4;
    private static final int PADDING_RIGHT_INDEX = 5;
    private static final int TEXT_COLOR_INDEX = 2;
    private static final int TEXT_COLOR_PRIMARY = 0;
    private static final int TEXT_SIZE_INDEX = 1;
    private final PagerAdapterObserver adapterObserver;
    private int currentPosition;
    private float currentPositionOffset;
    private LinearLayout.LayoutParams defaultTabLayoutParams;
    public ViewPager.OnPageChangeListener delegatePageListener;
    private int dividerColor;
    private int dividerPadding;
    private Paint dividerPaint;
    private int dividerWidth;
    private LinearLayout.LayoutParams expandedTabLayoutParams;
    private ViewTreeObserver.OnGlobalLayoutListener firstTabGlobalLayoutListener;
    private int indicatorColor;
    private int indicatorHeight;
    private boolean isPaddingMiddle;
    private int lastScrollX;
    private Locale locale;
    View.OnClickListener mOnItemClickListener;
    int myCurrentItem;
    private int paddingLeft;
    private int paddingRight;
    private final PageListener pageListener;
    private ViewPager pager;
    private Paint rectPaint;
    private int scrollOffset;
    private boolean shouldExpand;
    private int tabBackgroundResId;
    private int tabCount;
    private int tabPadding;
    private OnTabReselectedListener tabReselectedListener;
    private ColorStateList tabTextColor;
    private ColorStateList tabTextColorSelected;
    private int tabTextSize;
    private Typeface tabTypeface;
    private int tabTypefaceSelectedStyle;
    private int tabTypefaceStyle;
    private LinearLayout tabsContainer;
    private boolean textAllCaps;
    private int textAlpha;
    private int underlineColor;
    private int underlineHeight;

    /* loaded from: classes.dex */
    public interface CustomTabProvider {
        View getCustomTabView(ViewGroup viewGroup, int i);
    }

    /* loaded from: classes.dex */
    public interface OnItemClickListener {
        void onItemClick(Object obj);
    }

    /* loaded from: classes.dex */
    public interface OnTabReselectedListener {
        void onTabReselected(int i);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.adapterObserver = new PagerAdapterObserver();
        this.pageListener = new PageListener();
        this.tabReselectedListener = null;
        this.currentPosition = 0;
        this.currentPositionOffset = 0.0f;
        this.indicatorHeight = 2;
        this.underlineHeight = 0;
        this.dividerWidth = 0;
        this.dividerPadding = 0;
        this.tabPadding = 12;
        this.tabTextSize = 14;
        this.tabTextColor = null;
        this.tabTextColorSelected = null;
        this.textAlpha = 150;
        this.paddingLeft = 0;
        this.paddingRight = 0;
        this.shouldExpand = false;
        this.textAllCaps = false;
        this.isPaddingMiddle = false;
        this.tabTypeface = Typeface.DEFAULT;
        this.tabTypefaceStyle = 0;
        this.tabTypefaceSelectedStyle = 0;
        this.lastScrollX = 0;
        this.tabBackgroundResId = R.drawable.psts_background_tab;
        this.myCurrentItem = 0;
        this.firstTabGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.astuetz.PagerSlidingTabStrip.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                View childAt = PagerSlidingTabStrip.this.tabsContainer.getChildAt(0);
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                if (PagerSlidingTabStrip.this.isPaddingMiddle) {
                    PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                    pagerSlidingTabStrip.paddingLeft = pagerSlidingTabStrip.paddingRight = (pagerSlidingTabStrip.getWidth() / 2) - (childAt.getWidth() / 2);
                }
                PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.paddingLeft, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.paddingRight, PagerSlidingTabStrip.this.getPaddingBottom());
                if (PagerSlidingTabStrip.this.scrollOffset == 0) {
                    PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                    pagerSlidingTabStrip3.scrollOffset = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.paddingLeft;
                }
                PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip4.currentPosition = pagerSlidingTabStrip4.myCurrentItem;
                PagerSlidingTabStrip.this.currentPositionOffset = 0.0f;
                PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip5.scrollToChild(pagerSlidingTabStrip5.currentPosition, 0);
                PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip6.updateSelection(pagerSlidingTabStrip6.currentPosition);
            }
        };
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.tabsContainer = linearLayout;
        linearLayout.setOrientation(0);
        this.tabsContainer.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.tabsContainer);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.scrollOffset = (int) TypedValue.applyDimension(1, this.scrollOffset, displayMetrics);
        this.indicatorHeight = (int) TypedValue.applyDimension(1, this.indicatorHeight, displayMetrics);
        this.underlineHeight = (int) TypedValue.applyDimension(1, this.underlineHeight, displayMetrics);
        this.dividerPadding = (int) TypedValue.applyDimension(1, this.dividerPadding, displayMetrics);
        this.tabPadding = (int) TypedValue.applyDimension(1, this.tabPadding, displayMetrics);
        this.dividerWidth = (int) TypedValue.applyDimension(1, this.dividerWidth, displayMetrics);
        this.tabTextSize = (int) TypedValue.applyDimension(2, this.tabTextSize, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        this.tabTextSize = obtainStyledAttributes.getDimensionPixelSize(1, this.tabTextSize);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        int color = obtainStyledAttributes.getColor(0, -1);
        this.underlineColor = color;
        this.dividerColor = color;
        this.indicatorColor = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.paddingLeft = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.paddingRight = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(5, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        this.tabTextColor = colorStateList == null ? getColorStateList(Color.argb(this.textAlpha, Color.red(color), Color.green(color), Color.blue(color))) : colorStateList;
        ColorStateList colorStateList2 = this.tabTextColorSelected;
        this.tabTextColorSelected = colorStateList2 == null ? getColorStateList(color) : colorStateList2;
        setMarginBottomTabContainer();
        Paint paint = new Paint();
        this.rectPaint = paint;
        paint.setAntiAlias(true);
        this.rectPaint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.dividerPaint = paint2;
        paint2.setAntiAlias(true);
        this.dividerPaint.setStrokeWidth(this.dividerWidth);
        this.defaultTabLayoutParams = new LinearLayout.LayoutParams(-2, -1);
        this.expandedTabLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.locale == null) {
            this.locale = getResources().getConfiguration().locale;
        }
    }

    private void setMarginBottomTabContainer() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.tabsContainer.getLayoutParams();
        int i = this.indicatorHeight;
        int i2 = this.underlineHeight;
        if (i < i2) {
            i = i2;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.tabsContainer.setLayoutParams(marginLayoutParams);
    }

    public void setViewPager(ViewPager viewPager) {
        this.pager = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.pageListener);
        viewPager.getAdapter().registerDataSetObserver(this.adapterObserver);
        this.adapterObserver.setAttached(true);
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        View inflate;
        this.tabsContainer.removeAllViews();
        this.tabCount = this.pager.getAdapter().getCount();
        for (int i = 0; i < this.tabCount; i++) {
            if (this.pager.getAdapter() instanceof CustomTabProvider) {
                inflate = ((CustomTabProvider) this.pager.getAdapter()).getCustomTabView(this, i);
            } else {
                inflate = LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false);
            }
            addTab(i, this.pager.getAdapter().getPageTitle(i), inflate, (Object) null);
        }
        updateTabStyles();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.astuetz.PagerSlidingTabStrip.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.mOnItemClickListener = onClickListener;
    }

    public void myClearTabs() {
        this.tabsContainer.removeAllViews();
        this.tabCount = 0;
        this.myCurrentItem = -1;
    }

    public void myAddTab(IVAsyncTask<String> iVAsyncTask, int i, Object obj) {
        addTab(this.tabCount, iVAsyncTask, LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), obj);
        int i2 = this.tabCount;
        this.myCurrentItem = i2;
        this.tabCount = i2 + 1;
        updateTabStyles();
    }

    public void myAddTab(String str, int i, Object obj) {
        addTab(this.tabCount, str, LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), obj);
        int i2 = this.tabCount;
        this.myCurrentItem = i2;
        this.tabCount = i2 + 1;
        updateTabStyles();
    }

    private void addTab(int i, IVAsyncTask<String> iVAsyncTask, View view, Object obj) {
        final TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && iVAsyncTask != null) {
            iVAsyncTask.Run(new VAsyncTask.ResultListener<String>() { // from class: com.astuetz.PagerSlidingTabStrip.2
                @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
                public void onResult(String str, boolean z) {
                    if (z || str == null) {
                        return;
                    }
                    textView.setText(str);
                }
            });
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.astuetz.PagerSlidingTabStrip.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PagerSlidingTabStrip.this.mOnItemClickListener.onClick(view2);
            }
        });
        this.tabsContainer.addView(view, i, this.shouldExpand ? this.expandedTabLayoutParams : this.defaultTabLayoutParams);
    }

    private void addTab(int i, CharSequence charSequence, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.astuetz.PagerSlidingTabStrip.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                PagerSlidingTabStrip.this.mOnItemClickListener.onClick(view2);
            }
        });
        this.tabsContainer.addView(view, i, this.shouldExpand ? this.expandedTabLayoutParams : this.defaultTabLayoutParams);
    }

    private void updateTabStyles() {
        for (int i = 0; i < this.tabCount; i++) {
            View childAt = this.tabsContainer.getChildAt(i);
            childAt.setBackgroundResource(this.tabBackgroundResId);
            childAt.setPadding(this.tabPadding, childAt.getPaddingTop(), this.tabPadding, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(R.id.psts_tab_title);
            if (textView != null && this.textAllCaps) {
                textView.setAllCaps(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scrollToChild(int i, int i2) {
        if (this.tabCount == 0) {
            return;
        }
        int left = this.tabsContainer.getChildAt(i).getLeft() + i2;
        if (i > 0 || i2 > 0) {
            int i3 = left - this.scrollOffset;
            Pair<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i3 + ((indicatorCoordinates.second.floatValue() - indicatorCoordinates.first.floatValue()) / 2.0f));
        }
        if (left != this.lastScrollX) {
            this.lastScrollX = left;
            scrollTo(left, 0);
        }
    }

    private Pair<Float, Float> getIndicatorCoordinates() {
        int i;
        View childAt = this.tabsContainer.getChildAt(this.currentPosition);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.currentPositionOffset > 0.0f && (i = this.currentPosition) < this.tabCount - 1) {
            View childAt2 = this.tabsContainer.getChildAt(i + 1);
            float f = this.currentPositionOffset;
            left = (childAt2.getLeft() * f) + ((1.0f - f) * left);
            right = (childAt2.getRight() * f) + ((1.0f - f) * right);
        }
        return new Pair<>(Float.valueOf(left), Float.valueOf(right));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.isPaddingMiddle || this.paddingLeft > 0 || this.paddingRight > 0) {
            this.tabsContainer.setMinimumWidth(getWidth());
            setClipToPadding(false);
        }
        if (this.tabsContainer.getChildCount() > 0) {
            this.tabsContainer.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.firstTabGlobalLayoutListener);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.tabCount == 0) {
            return;
        }
        int height = getHeight();
        this.rectPaint.setColor(this.indicatorColor);
        Pair<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
        float f = height;
        canvas.drawRect(indicatorCoordinates.first.floatValue() + this.paddingLeft, height - this.indicatorHeight, indicatorCoordinates.second.floatValue() + this.paddingLeft, f, this.rectPaint);
        this.rectPaint.setColor(this.underlineColor);
        canvas.drawRect(this.paddingLeft, height - this.underlineHeight, this.tabsContainer.getWidth() + this.paddingRight, f, this.rectPaint);
        int i = this.dividerWidth;
        if (i != 0) {
            this.dividerPaint.setStrokeWidth(i);
            this.dividerPaint.setColor(this.dividerColor);
            for (int i2 = 0; i2 < this.tabCount - 1; i2++) {
                View childAt = this.tabsContainer.getChildAt(i2);
                canvas.drawLine(childAt.getRight(), this.dividerPadding, childAt.getRight(), height - this.dividerPadding, this.dividerPaint);
            }
        }
    }

    public void setOnTabReselectedListener(OnTabReselectedListener onTabReselectedListener) {
        this.tabReselectedListener = onTabReselectedListener;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.delegatePageListener = onPageChangeListener;
    }

    /* loaded from: classes.dex */
    private class PageListener implements ViewPager.OnPageChangeListener {
        private PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            PagerSlidingTabStrip.this.currentPosition = i;
            PagerSlidingTabStrip.this.currentPositionOffset = f;
            PagerSlidingTabStrip.this.scrollToChild(i, PagerSlidingTabStrip.this.tabCount > 0 ? (int) (PagerSlidingTabStrip.this.tabsContainer.getChildAt(i).getWidth() * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrolled(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.scrollToChild(pagerSlidingTabStrip.pager.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.selected(PagerSlidingTabStrip.this.tabsContainer.getChildAt(PagerSlidingTabStrip.this.pager.getCurrentItem()));
            if (PagerSlidingTabStrip.this.pager.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.notSelected(PagerSlidingTabStrip.this.tabsContainer.getChildAt(PagerSlidingTabStrip.this.pager.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.pager.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.pager.getAdapter().getCount() - 1) {
                PagerSlidingTabStrip.this.notSelected(PagerSlidingTabStrip.this.tabsContainer.getChildAt(PagerSlidingTabStrip.this.pager.getCurrentItem() + 1));
            }
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageScrollStateChanged(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            PagerSlidingTabStrip.this.updateSelection(i);
            if (PagerSlidingTabStrip.this.delegatePageListener != null) {
                PagerSlidingTabStrip.this.delegatePageListener.onPageSelected(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSelection(int i) {
        int i2 = 0;
        while (i2 < this.tabCount) {
            View childAt = this.tabsContainer.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                selected(childAt);
            } else {
                notSelected(childAt);
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notSelected(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.tabTextColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selected(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.tabTextColorSelected);
    }

    /* loaded from: classes.dex */
    private class PagerAdapterObserver extends DataSetObserver {
        private boolean attached;

        private PagerAdapterObserver() {
            this.attached = false;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.notifyDataSetChanged();
        }

        public void setAttached(boolean z) {
            this.attached = z;
        }

        public boolean isAttached() {
            return this.attached;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.pager == null || this.adapterObserver.isAttached()) {
            return;
        }
        this.pager.getAdapter().registerDataSetObserver(this.adapterObserver);
        this.adapterObserver.setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.pager == null || !this.adapterObserver.isAttached()) {
            return;
        }
        this.pager.getAdapter().unregisterDataSetObserver(this.adapterObserver);
        this.adapterObserver.setAttached(false);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.currentPosition;
        this.currentPosition = i;
        if (i != 0 && this.tabsContainer.getChildCount() > 0) {
            notSelected(this.tabsContainer.getChildAt(0));
            selected(this.tabsContainer.getChildAt(this.currentPosition));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.currentPosition = this.currentPosition;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.astuetz.PagerSlidingTabStrip.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int currentPosition;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.currentPosition = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.currentPosition);
        }
    }

    public int getIndicatorColor() {
        return this.indicatorColor;
    }

    public int getIndicatorHeight() {
        return this.indicatorHeight;
    }

    public int getUnderlineColor() {
        return this.underlineColor;
    }

    public int getDividerColor() {
        return this.dividerColor;
    }

    public int getDividerWidth() {
        return this.dividerWidth;
    }

    public int getUnderlineHeight() {
        return this.underlineHeight;
    }

    public int getDividerPadding() {
        return this.dividerPadding;
    }

    public int getScrollOffset() {
        return this.scrollOffset;
    }

    public boolean getShouldExpand() {
        return this.shouldExpand;
    }

    public int getTextSize() {
        return this.tabTextSize;
    }

    public boolean isTextAllCaps() {
        return this.textAllCaps;
    }

    public ColorStateList getTextColor() {
        return this.tabTextColor;
    }

    public int getTabBackground() {
        return this.tabBackgroundResId;
    }

    public int getTabPaddingLeftRight() {
        return this.tabPadding;
    }

    public void setIndicatorColor(int i) {
        this.indicatorColor = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.indicatorColor = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.indicatorHeight = i;
        invalidate();
    }

    public void setUnderlineColor(int i) {
        this.underlineColor = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.underlineColor = getResources().getColor(i);
        invalidate();
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.dividerColor = getResources().getColor(i);
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.dividerWidth = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.underlineHeight = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.dividerPadding = i;
        invalidate();
    }

    public void setScrollOffset(int i) {
        this.scrollOffset = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.shouldExpand = z;
        if (this.pager != null) {
            requestLayout();
        }
    }

    public void setAllCaps(boolean z) {
        this.textAllCaps = z;
    }

    public void setTextSize(int i) {
        this.tabTextSize = i;
        updateTabStyles();
    }

    public void setTextColor(int i) {
        setTextColor(getColorStateList(i));
    }

    private ColorStateList getColorStateList(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.tabTextColor = colorStateList;
        updateTabStyles();
    }

    public void setTextColorSelected(int i) {
        setTextColorSelected(getColorStateList(i));
    }

    public void setTextColorSelected(ColorStateList colorStateList) {
        this.tabTextColorSelected = colorStateList;
        updateTabStyles();
    }

    public void setTextColorResource(int i) {
        setTextColor(getResources().getColor(i));
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(getResources().getColorStateList(i));
    }

    public void setTypeface(Typeface typeface, int i) {
        this.tabTypeface = typeface;
        this.tabTypefaceSelectedStyle = i;
        updateTabStyles();
    }

    public void setTabBackground(int i) {
        this.tabBackgroundResId = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.tabPadding = i;
        updateTabStyles();
    }
}
