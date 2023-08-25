package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0164b;
import com.daaw.AbstractC1643i0;
import com.daaw.C1782j4;
import com.daaw.C1893k0;
import com.daaw.C3397w4;
import com.daaw.em1;
import com.daaw.ul1;
import com.daaw.x01;
/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0166c extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: y */
    public static final Interpolator f819y = new DecelerateInterpolator();

    /* renamed from: p */
    public Runnable f820p;

    /* renamed from: q */
    public View$OnClickListenerC0169c f821q;

    /* renamed from: r */
    public C0164b f822r;

    /* renamed from: s */
    public Spinner f823s;

    /* renamed from: t */
    public boolean f824t;

    /* renamed from: u */
    public int f825u;

    /* renamed from: v */
    public int f826v;

    /* renamed from: w */
    public int f827w;

    /* renamed from: x */
    public int f828x;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public class RunnableC0167a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ View f829p;

        public RunnableC0167a(View view) {
            this.f829p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0166c.this.smoothScrollTo(this.f829p.getLeft() - ((C0166c.this.getWidth() - this.f829p.getWidth()) / 2), 0);
            C0166c.this.f820p = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: classes.dex */
    public class C0168b extends BaseAdapter {
        public C0168b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0166c.this.f822r.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0170d) C0166c.this.f822r.getChildAt(i)).m29911b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0166c.this.m29916c((AbstractC1643i0.AbstractC1646c) getItem(i), true);
            }
            ((C0170d) view).m29912a((AbstractC1643i0.AbstractC1646c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0169c implements View.OnClickListener {
        public View$OnClickListenerC0169c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((C0170d) view).m29911b().m20274e();
            int childCount = C0166c.this.f822r.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0166c.this.f822r.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: classes.dex */
    public class C0170d extends LinearLayout {

        /* renamed from: p */
        public final int[] f833p;

        /* renamed from: q */
        public AbstractC1643i0.AbstractC1646c f834q;

        /* renamed from: r */
        public TextView f835r;

        /* renamed from: s */
        public ImageView f836s;

        /* renamed from: t */
        public View f837t;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0170d(Context context, AbstractC1643i0.AbstractC1646c abstractC1646c, boolean z) {
            super(context, null, r5);
            int i = x01.actionBarTabStyle;
            int[] iArr = {16842964};
            this.f833p = iArr;
            this.f834q = abstractC1646c;
            ul1 m8037v = ul1.m8037v(context, null, iArr, i, 0);
            if (m8037v.m8040s(0)) {
                setBackgroundDrawable(m8037v.m8052g(0));
            }
            m8037v.m8036w();
            if (z) {
                setGravity(8388627);
            }
            m29910c();
        }

        /* renamed from: a */
        public void m29912a(AbstractC1643i0.AbstractC1646c abstractC1646c) {
            this.f834q = abstractC1646c;
            m29910c();
        }

        /* renamed from: b */
        public AbstractC1643i0.AbstractC1646c m29911b() {
            return this.f834q;
        }

        /* renamed from: c */
        public void m29910c() {
            AbstractC1643i0.AbstractC1646c abstractC1646c = this.f834q;
            View m20277b = abstractC1646c.m20277b();
            if (m20277b != null) {
                ViewParent parent = m20277b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m20277b);
                    }
                    addView(m20277b);
                }
                this.f837t = m20277b;
                TextView textView = this.f835r;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f836s;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f836s.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f837t;
            if (view != null) {
                removeView(view);
                this.f837t = null;
            }
            Drawable m20276c = abstractC1646c.m20276c();
            CharSequence m20275d = abstractC1646c.m20275d();
            if (m20276c != null) {
                if (this.f836s == null) {
                    C1782j4 c1782j4 = new C1782j4(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c1782j4.setLayoutParams(layoutParams);
                    addView(c1782j4, 0);
                    this.f836s = c1782j4;
                }
                this.f836s.setImageDrawable(m20276c);
                this.f836s.setVisibility(0);
            } else {
                ImageView imageView2 = this.f836s;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f836s.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m20275d);
            if (z) {
                if (this.f835r == null) {
                    C3397w4 c3397w4 = new C3397w4(getContext(), null, x01.actionBarTabTextStyle);
                    c3397w4.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c3397w4.setLayoutParams(layoutParams2);
                    addView(c3397w4);
                    this.f835r = c3397w4;
                }
                this.f835r.setText(m20275d);
                this.f835r.setVisibility(0);
            } else {
                TextView textView2 = this.f835r;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f835r.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f836s;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC1646c.m20278a());
            }
            em1.m23375a(this, z ? null : abstractC1646c.m20278a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0166c.this.f825u > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0166c.this.f825u;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    public void m29918a(int i) {
        View childAt = this.f822r.getChildAt(i);
        Runnable runnable = this.f820p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0167a runnableC0167a = new RunnableC0167a(childAt);
        this.f820p = runnableC0167a;
        post(runnableC0167a);
    }

    /* renamed from: b */
    public final Spinner m29917b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, x01.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new C0164b.C0165a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    public C0170d m29916c(AbstractC1643i0.AbstractC1646c abstractC1646c, boolean z) {
        C0170d c0170d = new C0170d(getContext(), abstractC1646c, z);
        if (z) {
            c0170d.setBackgroundDrawable(null);
            c0170d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f827w));
        } else {
            c0170d.setFocusable(true);
            if (this.f821q == null) {
                this.f821q = new View$OnClickListenerC0169c();
            }
            c0170d.setOnClickListener(this.f821q);
        }
        return c0170d;
    }

    /* renamed from: d */
    public final boolean m29915d() {
        Spinner spinner = this.f823s;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    public final void m29914e() {
        if (m29915d()) {
            return;
        }
        if (this.f823s == null) {
            this.f823s = m29917b();
        }
        removeView(this.f822r);
        addView(this.f823s, new ViewGroup.LayoutParams(-2, -1));
        if (this.f823s.getAdapter() == null) {
            this.f823s.setAdapter((SpinnerAdapter) new C0168b());
        }
        Runnable runnable = this.f820p;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f820p = null;
        }
        this.f823s.setSelection(this.f828x);
    }

    /* renamed from: f */
    public final boolean m29913f() {
        if (m29915d()) {
            removeView(this.f823s);
            addView(this.f822r, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f823s.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f820p;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1893k0 m18112b = C1893k0.m18112b(getContext());
        setContentHeight(m18112b.m18108f());
        this.f826v = m18112b.m18109e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f820p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0170d) view).m29911b().m20274e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f822r.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f825u = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f825u = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f825u, this.f826v);
        }
        this.f825u = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f827w, 1073741824);
        if ((z2 || !this.f824t) ? false : false) {
            this.f822r.measure(0, makeMeasureSpec);
            if (this.f822r.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m29914e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f828x);
                return;
            }
        }
        m29913f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f824t = z;
    }

    public void setContentHeight(int i) {
        this.f827w = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f828x = i;
        int childCount = this.f822r.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f822r.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                m29918a(i);
            }
            i2++;
        }
        Spinner spinner = this.f823s;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
