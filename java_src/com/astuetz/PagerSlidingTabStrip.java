package com.astuetz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
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
import androidx.viewpager.widget.ViewPager;
import com.daaw.avee.R;
import com.daaw.ir1;
import com.daaw.me0;
import com.daaw.ov0;
import java.util.Locale;
/* loaded from: classes.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: g0 */
    public static final int[] f2590g0 = {16842806, 16842901, 16842904, 16842965, 16842966, 16842968};

    /* renamed from: A */
    public Paint f2591A;

    /* renamed from: B */
    public Paint f2592B;

    /* renamed from: C */
    public int f2593C;

    /* renamed from: D */
    public int f2594D;

    /* renamed from: E */
    public int f2595E;

    /* renamed from: F */
    public int f2596F;

    /* renamed from: G */
    public int f2597G;

    /* renamed from: H */
    public int f2598H;

    /* renamed from: I */
    public int f2599I;

    /* renamed from: J */
    public int f2600J;

    /* renamed from: K */
    public int f2601K;

    /* renamed from: L */
    public ColorStateList f2602L;

    /* renamed from: M */
    public ColorStateList f2603M;

    /* renamed from: N */
    public int f2604N;

    /* renamed from: O */
    public int f2605O;

    /* renamed from: P */
    public int f2606P;

    /* renamed from: Q */
    public boolean f2607Q;

    /* renamed from: R */
    public boolean f2608R;

    /* renamed from: S */
    public boolean f2609S;

    /* renamed from: T */
    public Typeface f2610T;

    /* renamed from: U */
    public int f2611U;

    /* renamed from: V */
    public int f2612V;

    /* renamed from: W */
    public int f2613W;

    /* renamed from: a0 */
    public int f2614a0;

    /* renamed from: b0 */
    public int f2615b0;

    /* renamed from: c0 */
    public Locale f2616c0;

    /* renamed from: d0 */
    public int f2617d0;

    /* renamed from: e0 */
    public View.OnClickListener f2618e0;

    /* renamed from: f0 */
    public ViewTreeObserver.OnGlobalLayoutListener f2619f0;

    /* renamed from: p */
    public final C0552i f2620p;

    /* renamed from: q */
    public LinearLayout.LayoutParams f2621q;

    /* renamed from: r */
    public LinearLayout.LayoutParams f2622r;

    /* renamed from: s */
    public final C0551h f2623s;

    /* renamed from: t */
    public InterfaceC0550g f2624t;

    /* renamed from: u */
    public ViewPager.InterfaceC0497j f2625u;

    /* renamed from: v */
    public LinearLayout f2626v;

    /* renamed from: w */
    public ViewPager f2627w;

    /* renamed from: x */
    public int f2628x;

    /* renamed from: y */
    public int f2629y;

    /* renamed from: z */
    public float f2630z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0543a();

        /* renamed from: p */
        public int f2631p;

        /* renamed from: com.astuetz.PagerSlidingTabStrip$SavedState$a */
        /* loaded from: classes.dex */
        public class C0543a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f2631p = parcel.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, ViewTreeObserver$OnGlobalLayoutListenerC0544a viewTreeObserver$OnGlobalLayoutListenerC0544a) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2631p);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$a */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0544a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0544a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$b */
    /* loaded from: classes.dex */
    public class C0545b implements ir1.InterfaceC1750b<String> {

        /* renamed from: a */
        public final /* synthetic */ TextView f2633a;

        public C0545b(TextView textView) {
            this.f2633a = textView;
        }

        @Override // com.daaw.ir1.InterfaceC1750b
        /* renamed from: b */
        public void mo15140a(String str, boolean z) {
            if (z || str == null) {
                return;
            }
            this.f2633a.setText(str);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0546c implements View.OnClickListener {
        public View$OnClickListenerC0546c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.f2618e0.onClick(view);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0547d implements View.OnClickListener {
        public View$OnClickListenerC0547d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.f2618e0.onClick(view);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$e */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0548e implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC0548e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.f2626v.getChildAt(0);
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (PagerSlidingTabStrip.this.f2609S) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.f2605O = pagerSlidingTabStrip.f2606P = (pagerSlidingTabStrip.getWidth() / 2) - (childAt.getWidth() / 2);
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.f2605O, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.f2606P, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.f2613W == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip3.f2613W = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.f2605O;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip4.f2629y = pagerSlidingTabStrip4.f2617d0;
            PagerSlidingTabStrip.this.f2630z = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.m27823y(pagerSlidingTabStrip5.f2629y, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.m27849B(pagerSlidingTabStrip6.f2629y);
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0549f {
        /* renamed from: a */
        View m27818a(ViewGroup viewGroup, int i);
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$g */
    /* loaded from: classes.dex */
    public interface InterfaceC0550g {
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$h */
    /* loaded from: classes.dex */
    public class C0551h implements ViewPager.InterfaceC0497j {
        public C0551h() {
        }

        public /* synthetic */ C0551h(PagerSlidingTabStrip pagerSlidingTabStrip, ViewTreeObserver$OnGlobalLayoutListenerC0544a viewTreeObserver$OnGlobalLayoutListenerC0544a) {
            this();
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: a */
        public void mo26891a(int i, float f, int i2) {
            PagerSlidingTabStrip.this.f2629y = i;
            PagerSlidingTabStrip.this.f2630z = f;
            PagerSlidingTabStrip.this.m27823y(i, PagerSlidingTabStrip.this.f2628x > 0 ? (int) (PagerSlidingTabStrip.this.f2626v.getChildAt(i).getWidth() * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.InterfaceC0497j interfaceC0497j = PagerSlidingTabStrip.this.f2625u;
            if (interfaceC0497j != null) {
                interfaceC0497j.mo26891a(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: b */
        public void mo26890b(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.m27823y(pagerSlidingTabStrip.f2627w.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.m27822z(PagerSlidingTabStrip.this.f2626v.getChildAt(PagerSlidingTabStrip.this.f2627w.getCurrentItem()));
            if (PagerSlidingTabStrip.this.f2627w.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.m27825w(PagerSlidingTabStrip.this.f2626v.getChildAt(PagerSlidingTabStrip.this.f2627w.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.f2627w.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.f2627w.getAdapter().mo17418c() - 1) {
                PagerSlidingTabStrip.this.m27825w(PagerSlidingTabStrip.this.f2626v.getChildAt(PagerSlidingTabStrip.this.f2627w.getCurrentItem() + 1));
            }
            ViewPager.InterfaceC0497j interfaceC0497j = PagerSlidingTabStrip.this.f2625u;
            if (interfaceC0497j != null) {
                interfaceC0497j.mo26890b(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0497j
        /* renamed from: c */
        public void mo26889c(int i) {
            PagerSlidingTabStrip.this.m27849B(i);
            ViewPager.InterfaceC0497j interfaceC0497j = PagerSlidingTabStrip.this.f2625u;
            if (interfaceC0497j != null) {
                interfaceC0497j.mo26889c(i);
            }
        }
    }

    /* renamed from: com.astuetz.PagerSlidingTabStrip$i */
    /* loaded from: classes.dex */
    public class C0552i extends DataSetObserver {

        /* renamed from: a */
        public boolean f2639a;

        public C0552i() {
            this.f2639a = false;
        }

        public /* synthetic */ C0552i(PagerSlidingTabStrip pagerSlidingTabStrip, ViewTreeObserver$OnGlobalLayoutListenerC0544a viewTreeObserver$OnGlobalLayoutListenerC0544a) {
            this();
        }

        /* renamed from: a */
        public boolean m27817a() {
            return this.f2639a;
        }

        /* renamed from: b */
        public void m27816b(boolean z) {
            this.f2639a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.m27824x();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2620p = new C0552i(this, null);
        this.f2623s = new C0551h(this, null);
        this.f2624t = null;
        this.f2629y = 0;
        this.f2630z = 0.0f;
        this.f2594D = 2;
        this.f2595E = 0;
        this.f2597G = 0;
        this.f2598H = 0;
        this.f2600J = 12;
        this.f2601K = 14;
        this.f2602L = null;
        this.f2603M = null;
        this.f2604N = 150;
        this.f2605O = 0;
        this.f2606P = 0;
        this.f2607Q = false;
        this.f2608R = false;
        this.f2609S = false;
        this.f2610T = Typeface.DEFAULT;
        this.f2611U = 0;
        this.f2612V = 0;
        this.f2614a0 = 0;
        this.f2615b0 = R.drawable.psts_background_tab;
        this.f2617d0 = 0;
        this.f2619f0 = new ViewTreeObserver$OnGlobalLayoutListenerC0548e();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f2626v = linearLayout;
        linearLayout.setOrientation(0);
        this.f2626v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f2626v);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f2613W = (int) TypedValue.applyDimension(1, this.f2613W, displayMetrics);
        this.f2594D = (int) TypedValue.applyDimension(1, this.f2594D, displayMetrics);
        this.f2595E = (int) TypedValue.applyDimension(1, this.f2595E, displayMetrics);
        this.f2598H = (int) TypedValue.applyDimension(1, this.f2598H, displayMetrics);
        this.f2600J = (int) TypedValue.applyDimension(1, this.f2600J, displayMetrics);
        this.f2597G = (int) TypedValue.applyDimension(1, this.f2597G, displayMetrics);
        this.f2601K = (int) TypedValue.applyDimension(2, this.f2601K, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2590g0);
        this.f2601K = obtainStyledAttributes.getDimensionPixelSize(1, this.f2601K);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        int color = obtainStyledAttributes.getColor(0, -1);
        this.f2596F = color;
        this.f2599I = color;
        this.f2593C = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f2605O = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f2606P = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(5, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        this.f2602L = colorStateList == null ? m27828t(Color.argb(this.f2604N, Color.red(color), Color.green(color), Color.blue(color))) : colorStateList;
        ColorStateList colorStateList2 = this.f2603M;
        this.f2603M = colorStateList2 == null ? m27828t(color) : colorStateList2;
        m27850A();
        Paint paint = new Paint();
        this.f2591A = paint;
        paint.setAntiAlias(true);
        this.f2591A.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f2592B = paint2;
        paint2.setAntiAlias(true);
        this.f2592B.setStrokeWidth(this.f2597G);
        this.f2621q = new LinearLayout.LayoutParams(-2, -1);
        this.f2622r = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.f2616c0 == null) {
            this.f2616c0 = getResources().getConfiguration().locale;
        }
    }

    private ov0<Float, Float> getIndicatorCoordinates() {
        int i;
        View childAt = this.f2626v.getChildAt(this.f2629y);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f2630z > 0.0f && (i = this.f2629y) < this.f2628x - 1) {
            View childAt2 = this.f2626v.getChildAt(i + 1);
            float f = this.f2630z;
            left = (childAt2.getLeft() * f) + ((1.0f - f) * left);
            right = (childAt2.getRight() * f) + ((1.0f - f) * right);
        }
        return new ov0<>(Float.valueOf(left), Float.valueOf(right));
    }

    /* renamed from: A */
    public final void m27850A() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2626v.getLayoutParams();
        int i = this.f2594D;
        int i2 = this.f2595E;
        if (i < i2) {
            i = i2;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        this.f2626v.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: B */
    public final void m27849B(int i) {
        int i2 = 0;
        while (i2 < this.f2628x) {
            View childAt = this.f2626v.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m27822z(childAt);
            } else {
                m27825w(childAt);
            }
            i2++;
        }
    }

    /* renamed from: C */
    public final void m27848C() {
        for (int i = 0; i < this.f2628x; i++) {
            View childAt = this.f2626v.getChildAt(i);
            childAt.setBackgroundResource(this.f2615b0);
            childAt.setPadding(this.f2600J, childAt.getPaddingTop(), this.f2600J, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(R.id.psts_tab_title);
            if (textView != null && this.f2608R) {
                textView.setAllCaps(true);
            }
        }
    }

    public int getDividerColor() {
        return this.f2599I;
    }

    public int getDividerPadding() {
        return this.f2598H;
    }

    public int getDividerWidth() {
        return this.f2597G;
    }

    public int getIndicatorColor() {
        return this.f2593C;
    }

    public int getIndicatorHeight() {
        return this.f2594D;
    }

    public int getScrollOffset() {
        return this.f2613W;
    }

    public boolean getShouldExpand() {
        return this.f2607Q;
    }

    public int getTabBackground() {
        return this.f2615b0;
    }

    public int getTabPaddingLeftRight() {
        return this.f2600J;
    }

    public ColorStateList getTextColor() {
        return this.f2602L;
    }

    public int getTextSize() {
        return this.f2601K;
    }

    public int getUnderlineColor() {
        return this.f2596F;
    }

    public int getUnderlineHeight() {
        return this.f2595E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2627w == null || this.f2620p.m27817a()) {
            return;
        }
        this.f2627w.getAdapter().m17414i(this.f2620p);
        this.f2620p.m27816b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f2627w == null || !this.f2620p.m27817a()) {
            return;
        }
        this.f2627w.getAdapter().m17412o(this.f2620p);
        this.f2620p.m27816b(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.f2628x == 0) {
            return;
        }
        int height = getHeight();
        this.f2591A.setColor(this.f2593C);
        ov0<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
        float f = height;
        canvas.drawRect(indicatorCoordinates.f22030a.floatValue() + this.f2605O, height - this.f2594D, indicatorCoordinates.f22031b.floatValue() + this.f2605O, f, this.f2591A);
        this.f2591A.setColor(this.f2596F);
        canvas.drawRect(this.f2605O, height - this.f2595E, this.f2626v.getWidth() + this.f2606P, f, this.f2591A);
        int i = this.f2597G;
        if (i != 0) {
            this.f2592B.setStrokeWidth(i);
            this.f2592B.setColor(this.f2599I);
            for (int i2 = 0; i2 < this.f2628x - 1; i2++) {
                View childAt = this.f2626v.getChildAt(i2);
                canvas.drawLine(childAt.getRight(), this.f2598H, childAt.getRight(), height - this.f2598H, this.f2592B);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f2609S || this.f2605O > 0 || this.f2606P > 0) {
            this.f2626v.setMinimumWidth(getWidth());
            setClipToPadding(false);
        }
        if (this.f2626v.getChildCount() > 0) {
            this.f2626v.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f2619f0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.f2631p;
        this.f2629y = i;
        if (i != 0 && this.f2626v.getChildCount() > 0) {
            m27825w(this.f2626v.getChildAt(0));
            m27822z(this.f2626v.getChildAt(this.f2629y));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2631p = this.f2629y;
        return savedState;
    }

    /* renamed from: r */
    public final void m27830r(int i, me0<String> me0Var, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && me0Var != null) {
            me0Var.mo8856a(new C0545b(textView));
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new View$OnClickListenerC0546c());
        this.f2626v.addView(view, i, this.f2607Q ? this.f2622r : this.f2621q);
    }

    /* renamed from: s */
    public final void m27829s(int i, CharSequence charSequence, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new View$OnClickListenerC0547d());
        this.f2626v.addView(view, i, this.f2607Q ? this.f2622r : this.f2621q);
    }

    public void setAllCaps(boolean z) {
        this.f2608R = z;
    }

    public void setDividerColor(int i) {
        this.f2599I = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f2599I = getResources().getColor(i);
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f2598H = i;
        invalidate();
    }

    public void setDividerWidth(int i) {
        this.f2597G = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f2593C = i;
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f2593C = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f2594D = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2618e0 = onClickListener;
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0497j interfaceC0497j) {
        this.f2625u = interfaceC0497j;
    }

    public void setOnTabReselectedListener(InterfaceC0550g interfaceC0550g) {
        this.f2624t = interfaceC0550g;
    }

    public void setScrollOffset(int i) {
        this.f2613W = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f2607Q = z;
        if (this.f2627w != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i) {
        this.f2615b0 = i;
    }

    public void setTabPaddingLeftRight(int i) {
        this.f2600J = i;
        m27848C();
    }

    public void setTextColor(int i) {
        setTextColor(m27828t(i));
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2602L = colorStateList;
        m27848C();
    }

    public void setTextColorResource(int i) {
        setTextColor(getResources().getColor(i));
    }

    public void setTextColorSelected(int i) {
        setTextColorSelected(m27828t(i));
    }

    public void setTextColorSelected(ColorStateList colorStateList) {
        this.f2603M = colorStateList;
        m27848C();
    }

    public void setTextColorStateListResource(int i) {
        setTextColor(getResources().getColorStateList(i));
    }

    public void setTextSize(int i) {
        this.f2601K = i;
        m27848C();
    }

    public void setUnderlineColor(int i) {
        this.f2596F = i;
        invalidate();
    }

    public void setUnderlineColorResource(int i) {
        this.f2596F = getResources().getColor(i);
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f2595E = i;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f2627w = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.f2623s);
        viewPager.getAdapter().m17414i(this.f2620p);
        this.f2620p.m27816b(true);
        m27824x();
    }

    /* renamed from: t */
    public final ColorStateList m27828t(int i) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }

    /* renamed from: u */
    public void m27827u(me0<String> me0Var, int i, Object obj) {
        m27830r(this.f2628x, me0Var, LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), obj);
        int i2 = this.f2628x;
        this.f2617d0 = i2;
        this.f2628x = i2 + 1;
        m27848C();
    }

    /* renamed from: v */
    public void m27826v() {
        this.f2626v.removeAllViews();
        this.f2628x = 0;
        this.f2617d0 = -1;
    }

    /* renamed from: w */
    public final void m27825w(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.f2602L);
    }

    /* renamed from: x */
    public void m27824x() {
        this.f2626v.removeAllViews();
        this.f2628x = this.f2627w.getAdapter().mo17418c();
        for (int i = 0; i < this.f2628x; i++) {
            m27829s(i, this.f2627w.getAdapter().mo17416e(i), this.f2627w.getAdapter() instanceof InterfaceC0549f ? ((InterfaceC0549f) this.f2627w.getAdapter()).m27818a(this, i) : LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), null);
        }
        m27848C();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0544a());
    }

    /* renamed from: y */
    public final void m27823y(int i, int i2) {
        if (this.f2628x == 0) {
            return;
        }
        int left = this.f2626v.getChildAt(i).getLeft() + i2;
        if (i > 0 || i2 > 0) {
            int i3 = left - this.f2613W;
            ov0<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i3 + ((indicatorCoordinates.f22031b.floatValue() - indicatorCoordinates.f22030a.floatValue()) / 2.0f));
        }
        if (left != this.f2614a0) {
            this.f2614a0 = left;
            scrollTo(left, 0);
        }
    }

    /* renamed from: z */
    public final void m27822z(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.f2603M);
    }
}
