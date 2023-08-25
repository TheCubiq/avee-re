package androidx.appcompat.widget;

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
import androidx.appcompat.widget.b;
import com.daaw.em1;
import com.daaw.i0;
import com.daaw.j4;
import com.daaw.k0;
import com.daaw.w4;
import com.daaw.x01;
/* loaded from: classes.dex */
public class c extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public static final Interpolator y = new DecelerateInterpolator();
    public Runnable p;
    public View$OnClickListenerC0010c q;
    public androidx.appcompat.widget.b r;
    public Spinner s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ View p;

        public a(View view) {
            this.p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.smoothScrollTo(this.p.getLeft() - ((c.this.getWidth() - this.p.getWidth()) / 2), 0);
            c.this.p = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return c.this.r.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) c.this.r.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return c.this.c((i0.c) getItem(i), true);
            }
            ((d) view).a((i0.c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0010c implements View.OnClickListener {
        public View$OnClickListenerC0010c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = c.this.r.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = c.this.r.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {
        public final int[] p;
        public i0.c q;
        public TextView r;
        public ImageView s;
        public View t;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, com.daaw.i0.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.c.this = r5
                int r5 = com.daaw.x01.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.p = r1
                r4.q = r7
                com.daaw.ul1 r5 = com.daaw.ul1.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.d.<init>(androidx.appcompat.widget.c, android.content.Context, com.daaw.i0$c, boolean):void");
        }

        public void a(i0.c cVar) {
            this.q = cVar;
            c();
        }

        public i0.c b() {
            return this.q;
        }

        public void c() {
            i0.c cVar = this.q;
            View b = cVar.b();
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.t = b;
                TextView textView = this.r;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.s;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.s.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.t;
            if (view != null) {
                removeView(view);
                this.t = null;
            }
            Drawable c = cVar.c();
            CharSequence d = cVar.d();
            if (c != null) {
                if (this.s == null) {
                    j4 j4Var = new j4(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    j4Var.setLayoutParams(layoutParams);
                    addView(j4Var, 0);
                    this.s = j4Var;
                }
                this.s.setImageDrawable(c);
                this.s.setVisibility(0);
            } else {
                ImageView imageView2 = this.s;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.s.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.r == null) {
                    w4 w4Var = new w4(getContext(), null, x01.actionBarTabTextStyle);
                    w4Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    w4Var.setLayoutParams(layoutParams2);
                    addView(w4Var);
                    this.r = w4Var;
                }
                this.r.setText(d);
                this.r.setVisibility(0);
            } else {
                TextView textView2 = this.r;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.r.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.s;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            em1.a(this, z ? null : cVar.a());
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
            if (c.this.u > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = c.this.u;
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

    public void a(int i) {
        View childAt = this.r.getChildAt(i);
        Runnable runnable = this.p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.p = aVar;
        post(aVar);
    }

    public final Spinner b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, x01.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new b.a(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public d c(i0.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.w));
        } else {
            dVar.setFocusable(true);
            if (this.q == null) {
                this.q = new View$OnClickListenerC0010c();
            }
            dVar.setOnClickListener(this.q);
        }
        return dVar;
    }

    public final boolean d() {
        Spinner spinner = this.s;
        return spinner != null && spinner.getParent() == this;
    }

    public final void e() {
        if (d()) {
            return;
        }
        if (this.s == null) {
            this.s = b();
        }
        removeView(this.r);
        addView(this.s, new ViewGroup.LayoutParams(-2, -1));
        if (this.s.getAdapter() == null) {
            this.s.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.p = null;
        }
        this.s.setSelection(this.x);
    }

    public final boolean f() {
        if (d()) {
            removeView(this.s);
            addView(this.r, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.s.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.p;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k0 b2 = k0.b(getContext());
        setContentHeight(b2.f());
        this.v = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.p;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.r.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.u = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.u = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.u, this.v);
        }
        this.u = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.w, 1073741824);
        if ((z2 || !this.t) ? false : false) {
            this.r.measure(0, makeMeasureSpec);
            if (this.r.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.x);
                return;
            }
        }
        f();
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
        this.t = z;
    }

    public void setContentHeight(int i) {
        this.w = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.x = i;
        int childCount = this.r.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.r.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.s;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
