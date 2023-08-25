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
    public static final int[] g0 = {16842806, 16842901, 16842904, 16842965, 16842966, 16842968};
    public Paint A;
    public Paint B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public ColorStateList L;
    public ColorStateList M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public Typeface T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public Locale c0;
    public int d0;
    public View.OnClickListener e0;
    public ViewTreeObserver.OnGlobalLayoutListener f0;
    public final i p;
    public LinearLayout.LayoutParams q;
    public LinearLayout.LayoutParams r;
    public final h s;
    public g t;
    public ViewPager.j u;
    public LinearLayout v;
    public ViewPager w;
    public int x;
    public int y;
    public float z;

    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int p;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
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
            this.p = parcel.readInt();
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ir1.b<String> {
        public final /* synthetic */ TextView a;

        public b(TextView textView) {
            this.a = textView;
        }

        @Override // com.daaw.ir1.b
        /* renamed from: b */
        public void a(String str, boolean z) {
            if (z || str == null) {
                return;
            }
            this.a.setText(str);
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.e0.onClick(view);
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerSlidingTabStrip.this.e0.onClick(view);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ViewTreeObserver.OnGlobalLayoutListener {
        public e() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View childAt = PagerSlidingTabStrip.this.v.getChildAt(0);
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (PagerSlidingTabStrip.this.S) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.O = pagerSlidingTabStrip.P = (pagerSlidingTabStrip.getWidth() / 2) - (childAt.getWidth() / 2);
            }
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.setPadding(pagerSlidingTabStrip2.O, PagerSlidingTabStrip.this.getPaddingTop(), PagerSlidingTabStrip.this.P, PagerSlidingTabStrip.this.getPaddingBottom());
            if (PagerSlidingTabStrip.this.W == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip3.W = (pagerSlidingTabStrip3.getWidth() / 2) - PagerSlidingTabStrip.this.O;
            }
            PagerSlidingTabStrip pagerSlidingTabStrip4 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip4.y = pagerSlidingTabStrip4.d0;
            PagerSlidingTabStrip.this.z = 0.0f;
            PagerSlidingTabStrip pagerSlidingTabStrip5 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip5.y(pagerSlidingTabStrip5.y, 0);
            PagerSlidingTabStrip pagerSlidingTabStrip6 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip6.B(pagerSlidingTabStrip6.y);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        View a(ViewGroup viewGroup, int i);
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h implements ViewPager.j {
        public h() {
        }

        public /* synthetic */ h(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
            PagerSlidingTabStrip.this.y = i;
            PagerSlidingTabStrip.this.z = f;
            PagerSlidingTabStrip.this.y(i, PagerSlidingTabStrip.this.x > 0 ? (int) (PagerSlidingTabStrip.this.v.getChildAt(i).getWidth() * f) : 0);
            PagerSlidingTabStrip.this.invalidate();
            ViewPager.j jVar = PagerSlidingTabStrip.this.u;
            if (jVar != null) {
                jVar.a(i, f, i2);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
            if (i == 0) {
                PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
                pagerSlidingTabStrip.y(pagerSlidingTabStrip.w.getCurrentItem(), 0);
            }
            PagerSlidingTabStrip.this.z(PagerSlidingTabStrip.this.v.getChildAt(PagerSlidingTabStrip.this.w.getCurrentItem()));
            if (PagerSlidingTabStrip.this.w.getCurrentItem() - 1 >= 0) {
                PagerSlidingTabStrip.this.w(PagerSlidingTabStrip.this.v.getChildAt(PagerSlidingTabStrip.this.w.getCurrentItem() - 1));
            }
            if (PagerSlidingTabStrip.this.w.getCurrentItem() + 1 <= PagerSlidingTabStrip.this.w.getAdapter().c() - 1) {
                PagerSlidingTabStrip.this.w(PagerSlidingTabStrip.this.v.getChildAt(PagerSlidingTabStrip.this.w.getCurrentItem() + 1));
            }
            ViewPager.j jVar = PagerSlidingTabStrip.this.u;
            if (jVar != null) {
                jVar.b(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            PagerSlidingTabStrip.this.B(i);
            ViewPager.j jVar = PagerSlidingTabStrip.this.u;
            if (jVar != null) {
                jVar.c(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i extends DataSetObserver {
        public boolean a;

        public i() {
            this.a = false;
        }

        public /* synthetic */ i(PagerSlidingTabStrip pagerSlidingTabStrip, a aVar) {
            this();
        }

        public boolean a() {
            return this.a;
        }

        public void b(boolean z) {
            this.a = z;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerSlidingTabStrip.this.x();
        }
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.p = new i(this, null);
        this.s = new h(this, null);
        this.t = null;
        this.y = 0;
        this.z = 0.0f;
        this.D = 2;
        this.E = 0;
        this.G = 0;
        this.H = 0;
        this.J = 12;
        this.K = 14;
        this.L = null;
        this.M = null;
        this.N = 150;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = Typeface.DEFAULT;
        this.U = 0;
        this.V = 0;
        this.a0 = 0;
        this.b0 = R.drawable.psts_background_tab;
        this.d0 = 0;
        this.f0 = new e();
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(0);
        this.v.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.v);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.W = (int) TypedValue.applyDimension(1, this.W, displayMetrics);
        this.D = (int) TypedValue.applyDimension(1, this.D, displayMetrics);
        this.E = (int) TypedValue.applyDimension(1, this.E, displayMetrics);
        this.H = (int) TypedValue.applyDimension(1, this.H, displayMetrics);
        this.J = (int) TypedValue.applyDimension(1, this.J, displayMetrics);
        this.G = (int) TypedValue.applyDimension(1, this.G, displayMetrics);
        this.K = (int) TypedValue.applyDimension(2, this.K, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0);
        this.K = obtainStyledAttributes.getDimensionPixelSize(1, this.K);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        int color = obtainStyledAttributes.getColor(0, -1);
        this.F = color;
        this.I = color;
        this.C = color;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.O = dimensionPixelSize > 0 ? dimensionPixelSize : obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.P = dimensionPixelSize <= 0 ? obtainStyledAttributes.getDimensionPixelSize(5, 0) : dimensionPixelSize;
        obtainStyledAttributes.recycle();
        this.L = colorStateList == null ? t(Color.argb(this.N, Color.red(color), Color.green(color), Color.blue(color))) : colorStateList;
        ColorStateList colorStateList2 = this.M;
        this.M = colorStateList2 == null ? t(color) : colorStateList2;
        A();
        Paint paint = new Paint();
        this.A = paint;
        paint.setAntiAlias(true);
        this.A.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.B = paint2;
        paint2.setAntiAlias(true);
        this.B.setStrokeWidth(this.G);
        this.q = new LinearLayout.LayoutParams(-2, -1);
        this.r = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.c0 == null) {
            this.c0 = getResources().getConfiguration().locale;
        }
    }

    private ov0<Float, Float> getIndicatorCoordinates() {
        int i2;
        View childAt = this.v.getChildAt(this.y);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.z > 0.0f && (i2 = this.y) < this.x - 1) {
            View childAt2 = this.v.getChildAt(i2 + 1);
            float f2 = this.z;
            left = (childAt2.getLeft() * f2) + ((1.0f - f2) * left);
            right = (childAt2.getRight() * f2) + ((1.0f - f2) * right);
        }
        return new ov0<>(Float.valueOf(left), Float.valueOf(right));
    }

    public final void A() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
        int i2 = this.D;
        int i3 = this.E;
        if (i2 < i3) {
            i2 = i3;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i2);
        this.v.setLayoutParams(marginLayoutParams);
    }

    public final void B(int i2) {
        int i3 = 0;
        while (i3 < this.x) {
            View childAt = this.v.getChildAt(i3);
            boolean z = i3 == i2;
            childAt.setSelected(z);
            if (z) {
                z(childAt);
            } else {
                w(childAt);
            }
            i3++;
        }
    }

    public final void C() {
        for (int i2 = 0; i2 < this.x; i2++) {
            View childAt = this.v.getChildAt(i2);
            childAt.setBackgroundResource(this.b0);
            childAt.setPadding(this.J, childAt.getPaddingTop(), this.J, childAt.getPaddingBottom());
            TextView textView = (TextView) childAt.findViewById(R.id.psts_tab_title);
            if (textView != null && this.R) {
                textView.setAllCaps(true);
            }
        }
    }

    public int getDividerColor() {
        return this.I;
    }

    public int getDividerPadding() {
        return this.H;
    }

    public int getDividerWidth() {
        return this.G;
    }

    public int getIndicatorColor() {
        return this.C;
    }

    public int getIndicatorHeight() {
        return this.D;
    }

    public int getScrollOffset() {
        return this.W;
    }

    public boolean getShouldExpand() {
        return this.Q;
    }

    public int getTabBackground() {
        return this.b0;
    }

    public int getTabPaddingLeftRight() {
        return this.J;
    }

    public ColorStateList getTextColor() {
        return this.L;
    }

    public int getTextSize() {
        return this.K;
    }

    public int getUnderlineColor() {
        return this.F;
    }

    public int getUnderlineHeight() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w == null || this.p.a()) {
            return;
        }
        this.w.getAdapter().i(this.p);
        this.p.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.w == null || !this.p.a()) {
            return;
        }
        this.w.getAdapter().o(this.p);
        this.p.b(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isInEditMode() || this.x == 0) {
            return;
        }
        int height = getHeight();
        this.A.setColor(this.C);
        ov0<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
        float f2 = height;
        canvas.drawRect(indicatorCoordinates.a.floatValue() + this.O, height - this.D, indicatorCoordinates.b.floatValue() + this.O, f2, this.A);
        this.A.setColor(this.F);
        canvas.drawRect(this.O, height - this.E, this.v.getWidth() + this.P, f2, this.A);
        int i2 = this.G;
        if (i2 != 0) {
            this.B.setStrokeWidth(i2);
            this.B.setColor(this.I);
            for (int i3 = 0; i3 < this.x - 1; i3++) {
                View childAt = this.v.getChildAt(i3);
                canvas.drawLine(childAt.getRight(), this.H, childAt.getRight(), height - this.H, this.B);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.S || this.O > 0 || this.P > 0) {
            this.v.setMinimumWidth(getWidth());
            setClipToPadding(false);
        }
        if (this.v.getChildCount() > 0) {
            this.v.getChildAt(0).getViewTreeObserver().addOnGlobalLayoutListener(this.f0);
        }
        super.onLayout(z, i2, i3, i4, i5);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i2 = savedState.p;
        this.y = i2;
        if (i2 != 0 && this.v.getChildCount() > 0) {
            w(this.v.getChildAt(0));
            z(this.v.getChildAt(this.y));
        }
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.p = this.y;
        return savedState;
    }

    public final void r(int i2, me0<String> me0Var, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && me0Var != null) {
            me0Var.a(new b(textView));
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new c());
        this.v.addView(view, i2, this.Q ? this.r : this.q);
    }

    public final void s(int i2, CharSequence charSequence, View view, Object obj) {
        TextView textView = (TextView) view.findViewById(R.id.psts_tab_title);
        if (textView != null && charSequence != null) {
            textView.setText(charSequence);
        }
        view.setTag(obj);
        view.setFocusable(true);
        view.setOnClickListener(new d());
        this.v.addView(view, i2, this.Q ? this.r : this.q);
    }

    public void setAllCaps(boolean z) {
        this.R = z;
    }

    public void setDividerColor(int i2) {
        this.I = i2;
        invalidate();
    }

    public void setDividerColorResource(int i2) {
        this.I = getResources().getColor(i2);
        invalidate();
    }

    public void setDividerPadding(int i2) {
        this.H = i2;
        invalidate();
    }

    public void setDividerWidth(int i2) {
        this.G = i2;
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        this.C = i2;
        invalidate();
    }

    public void setIndicatorColorResource(int i2) {
        this.C = getResources().getColor(i2);
        invalidate();
    }

    public void setIndicatorHeight(int i2) {
        this.D = i2;
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.e0 = onClickListener;
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.u = jVar;
    }

    public void setOnTabReselectedListener(g gVar) {
        this.t = gVar;
    }

    public void setScrollOffset(int i2) {
        this.W = i2;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.Q = z;
        if (this.w != null) {
            requestLayout();
        }
    }

    public void setTabBackground(int i2) {
        this.b0 = i2;
    }

    public void setTabPaddingLeftRight(int i2) {
        this.J = i2;
        C();
    }

    public void setTextColor(int i2) {
        setTextColor(t(i2));
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        C();
    }

    public void setTextColorResource(int i2) {
        setTextColor(getResources().getColor(i2));
    }

    public void setTextColorSelected(int i2) {
        setTextColorSelected(t(i2));
    }

    public void setTextColorSelected(ColorStateList colorStateList) {
        this.M = colorStateList;
        C();
    }

    public void setTextColorStateListResource(int i2) {
        setTextColor(getResources().getColorStateList(i2));
    }

    public void setTextSize(int i2) {
        this.K = i2;
        C();
    }

    public void setUnderlineColor(int i2) {
        this.F = i2;
        invalidate();
    }

    public void setUnderlineColorResource(int i2) {
        this.F = getResources().getColor(i2);
        invalidate();
    }

    public void setUnderlineHeight(int i2) {
        this.E = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.w = viewPager;
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        viewPager.setOnPageChangeListener(this.s);
        viewPager.getAdapter().i(this.p);
        this.p.b(true);
        x();
    }

    public final ColorStateList t(int i2) {
        return new ColorStateList(new int[][]{new int[0]}, new int[]{i2});
    }

    public void u(me0<String> me0Var, int i2, Object obj) {
        r(this.x, me0Var, LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), obj);
        int i3 = this.x;
        this.d0 = i3;
        this.x = i3 + 1;
        C();
    }

    public void v() {
        this.v.removeAllViews();
        this.x = 0;
        this.d0 = -1;
    }

    public final void w(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.L);
    }

    public void x() {
        this.v.removeAllViews();
        this.x = this.w.getAdapter().c();
        for (int i2 = 0; i2 < this.x; i2++) {
            s(i2, this.w.getAdapter().e(i2), this.w.getAdapter() instanceof f ? ((f) this.w.getAdapter()).a(this, i2) : LayoutInflater.from(getContext()).inflate(R.layout.psts_tab, (ViewGroup) this, false), null);
        }
        C();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void y(int i2, int i3) {
        if (this.x == 0) {
            return;
        }
        int left = this.v.getChildAt(i2).getLeft() + i3;
        if (i2 > 0 || i3 > 0) {
            int i4 = left - this.W;
            ov0<Float, Float> indicatorCoordinates = getIndicatorCoordinates();
            left = (int) (i4 + ((indicatorCoordinates.b.floatValue() - indicatorCoordinates.a.floatValue()) / 2.0f));
        }
        if (left != this.a0) {
            this.a0 = left;
            scrollTo(left, 0);
        }
    }

    public final void z(View view) {
        TextView textView;
        if (view == null || (textView = (TextView) view.findViewById(R.id.psts_tab_title)) == null) {
            return;
        }
        textView.setTextColor(this.M);
    }
}
