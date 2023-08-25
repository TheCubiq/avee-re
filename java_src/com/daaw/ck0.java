package com.daaw;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ck0 implements vc1 {

    /* renamed from: V */
    public static Method f5887V;

    /* renamed from: W */
    public static Method f5888W;

    /* renamed from: X */
    public static Method f5889X;

    /* renamed from: A */
    public int f5890A;

    /* renamed from: B */
    public boolean f5891B;

    /* renamed from: C */
    public boolean f5892C;

    /* renamed from: D */
    public int f5893D;

    /* renamed from: E */
    public View f5894E;

    /* renamed from: F */
    public int f5895F;

    /* renamed from: G */
    public DataSetObserver f5896G;

    /* renamed from: H */
    public View f5897H;

    /* renamed from: I */
    public Drawable f5898I;

    /* renamed from: J */
    public AdapterView.OnItemClickListener f5899J;

    /* renamed from: K */
    public AdapterView.OnItemSelectedListener f5900K;

    /* renamed from: L */
    public final RunnableC0966i f5901L;

    /* renamed from: M */
    public final View$OnTouchListenerC0965h f5902M;

    /* renamed from: N */
    public final C0964g f5903N;

    /* renamed from: O */
    public final RunnableC0962e f5904O;

    /* renamed from: P */
    public Runnable f5905P;

    /* renamed from: Q */
    public final Handler f5906Q;

    /* renamed from: R */
    public final Rect f5907R;

    /* renamed from: S */
    public Rect f5908S;

    /* renamed from: T */
    public boolean f5909T;

    /* renamed from: U */
    public PopupWindow f5910U;

    /* renamed from: p */
    public Context f5911p;

    /* renamed from: q */
    public ListAdapter f5912q;

    /* renamed from: r */
    public C3899zu f5913r;

    /* renamed from: s */
    public int f5914s;

    /* renamed from: t */
    public int f5915t;

    /* renamed from: u */
    public int f5916u;

    /* renamed from: v */
    public int f5917v;

    /* renamed from: w */
    public int f5918w;

    /* renamed from: x */
    public boolean f5919x;

    /* renamed from: y */
    public boolean f5920y;

    /* renamed from: z */
    public boolean f5921z;

    /* renamed from: com.daaw.ck0$a */
    /* loaded from: classes.dex */
    public class RunnableC0958a implements Runnable {
        public RunnableC0958a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m25268t = ck0.this.m25268t();
            if (m25268t == null || m25268t.getWindowToken() == null) {
                return;
            }
            ck0.this.mo7285h();
        }
    }

    /* renamed from: com.daaw.ck0$b */
    /* loaded from: classes.dex */
    public class C0959b implements AdapterView.OnItemSelectedListener {
        public C0959b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C3899zu c3899zu;
            if (i == -1 || (c3899zu = ck0.this.f5913r) == null) {
                return;
            }
            c3899zu.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.daaw.ck0$c */
    /* loaded from: classes.dex */
    public static class C0960c {
        /* renamed from: a */
        public static int m25261a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: com.daaw.ck0$d */
    /* loaded from: classes.dex */
    public static class C0961d {
        /* renamed from: a */
        public static void m25260a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m25259b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: com.daaw.ck0$e */
    /* loaded from: classes.dex */
    public class RunnableC0962e implements Runnable {
        public RunnableC0962e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ck0.this.m25269r();
        }
    }

    /* renamed from: com.daaw.ck0$f */
    /* loaded from: classes.dex */
    public class C0963f extends DataSetObserver {
        public C0963f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ck0.this.mo7286a()) {
                ck0.this.mo7285h();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ck0.this.dismiss();
        }
    }

    /* renamed from: com.daaw.ck0$g */
    /* loaded from: classes.dex */
    public class C0964g implements AbsListView.OnScrollListener {
        public C0964g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ck0.this.m25294A() || ck0.this.f5910U.getContentView() == null) {
                return;
            }
            ck0 ck0Var = ck0.this;
            ck0Var.f5906Q.removeCallbacks(ck0Var.f5901L);
            ck0.this.f5901L.run();
        }
    }

    /* renamed from: com.daaw.ck0$h */
    /* loaded from: classes.dex */
    public class View$OnTouchListenerC0965h implements View.OnTouchListener {
        public View$OnTouchListenerC0965h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ck0.this.f5910U) != null && popupWindow.isShowing() && x >= 0 && x < ck0.this.f5910U.getWidth() && y >= 0 && y < ck0.this.f5910U.getHeight()) {
                ck0 ck0Var = ck0.this;
                ck0Var.f5906Q.postDelayed(ck0Var.f5901L, 250L);
                return false;
            } else if (action == 1) {
                ck0 ck0Var2 = ck0.this;
                ck0Var2.f5906Q.removeCallbacks(ck0Var2.f5901L);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.daaw.ck0$i */
    /* loaded from: classes.dex */
    public class RunnableC0966i implements Runnable {
        public RunnableC0966i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3899zu c3899zu = ck0.this.f5913r;
            if (c3899zu == null || !xs1.m4743U(c3899zu) || ck0.this.f5913r.getCount() <= ck0.this.f5913r.getChildCount()) {
                return;
            }
            int childCount = ck0.this.f5913r.getChildCount();
            ck0 ck0Var = ck0.this;
            if (childCount <= ck0Var.f5893D) {
                ck0Var.f5910U.setInputMethodMode(2);
                ck0.this.mo7285h();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f5887V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f5889X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f5888W = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ck0(Context context) {
        this(context, null, x01.listPopupWindowStyle);
    }

    public ck0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ck0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5914s = -2;
        this.f5915t = -2;
        this.f5918w = 1002;
        this.f5890A = 0;
        this.f5891B = false;
        this.f5892C = false;
        this.f5893D = Integer.MAX_VALUE;
        this.f5895F = 0;
        this.f5901L = new RunnableC0966i();
        this.f5902M = new View$OnTouchListenerC0965h();
        this.f5903N = new C0964g();
        this.f5904O = new RunnableC0962e();
        this.f5907R = new Rect();
        this.f5911p = context;
        this.f5906Q = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31939l1, i, i2);
        this.f5916u = obtainStyledAttributes.getDimensionPixelOffset(x21.f31944m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(x21.f31949n1, 0);
        this.f5917v = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f5919x = true;
        }
        obtainStyledAttributes.recycle();
        C2012l4 c2012l4 = new C2012l4(context, attributeSet, i, i2);
        this.f5910U = c2012l4;
        c2012l4.setInputMethodMode(1);
    }

    /* renamed from: A */
    public boolean m25294A() {
        return this.f5910U.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean m25293B() {
        return this.f5909T;
    }

    /* renamed from: C */
    public final void m25292C() {
        View view = this.f5894E;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5894E);
            }
        }
    }

    /* renamed from: D */
    public void m25291D(View view) {
        this.f5897H = view;
    }

    /* renamed from: E */
    public void m25290E(int i) {
        this.f5910U.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void m25289F(int i) {
        Drawable background = this.f5910U.getBackground();
        if (background == null) {
            m25278Q(i);
            return;
        }
        background.getPadding(this.f5907R);
        Rect rect = this.f5907R;
        this.f5915t = rect.left + rect.right + i;
    }

    /* renamed from: G */
    public void m25288G(int i) {
        this.f5890A = i;
    }

    /* renamed from: H */
    public void m25287H(Rect rect) {
        this.f5908S = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void m25286I(int i) {
        this.f5910U.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void m25285J(boolean z) {
        this.f5909T = z;
        this.f5910U.setFocusable(z);
    }

    /* renamed from: K */
    public void m25284K(PopupWindow.OnDismissListener onDismissListener) {
        this.f5910U.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void m25283L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f5899J = onItemClickListener;
    }

    /* renamed from: M */
    public void m25282M(boolean z) {
        this.f5921z = true;
        this.f5920y = z;
    }

    /* renamed from: N */
    public final void m25281N(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            C0961d.m25259b(this.f5910U, z);
            return;
        }
        Method method = f5887V;
        if (method != null) {
            try {
                method.invoke(this.f5910U, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: O */
    public void m25280O(int i) {
        this.f5895F = i;
    }

    /* renamed from: P */
    public void m25279P(int i) {
        C3899zu c3899zu = this.f5913r;
        if (!mo7286a() || c3899zu == null) {
            return;
        }
        c3899zu.setListSelectionHidden(false);
        c3899zu.setSelection(i);
        if (c3899zu.getChoiceMode() != 0) {
            c3899zu.setItemChecked(i, true);
        }
    }

    /* renamed from: Q */
    public void m25278Q(int i) {
        this.f5915t = i;
    }

    @Override // com.daaw.vc1
    /* renamed from: a */
    public boolean mo7286a() {
        return this.f5910U.isShowing();
    }

    /* renamed from: b */
    public void m25277b(Drawable drawable) {
        this.f5910U.setBackgroundDrawable(drawable);
    }

    /* renamed from: c */
    public int m25276c() {
        return this.f5916u;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        this.f5910U.dismiss();
        m25292C();
        this.f5910U.setContentView(null);
        this.f5913r = null;
        this.f5906Q.removeCallbacks(this.f5901L);
    }

    /* renamed from: e */
    public void m25275e(int i) {
        this.f5916u = i;
    }

    @Override // com.daaw.vc1
    /* renamed from: h */
    public void mo7285h() {
        int m25270q = m25270q();
        boolean m25294A = m25294A();
        hy0.m20330b(this.f5910U, this.f5918w);
        boolean z = true;
        if (this.f5910U.isShowing()) {
            if (xs1.m4743U(m25268t())) {
                int i = this.f5915t;
                if (i == -1) {
                    i = -1;
                } else if (i == -2) {
                    i = m25268t().getWidth();
                }
                int i2 = this.f5914s;
                if (i2 == -1) {
                    if (!m25294A) {
                        m25270q = -1;
                    }
                    if (m25294A) {
                        this.f5910U.setWidth(this.f5915t == -1 ? -1 : 0);
                        this.f5910U.setHeight(0);
                    } else {
                        this.f5910U.setWidth(this.f5915t == -1 ? -1 : 0);
                        this.f5910U.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    m25270q = i2;
                }
                this.f5910U.setOutsideTouchable((this.f5892C || this.f5891B) ? false : false);
                this.f5910U.update(m25268t(), this.f5916u, this.f5917v, i < 0 ? -1 : i, m25270q < 0 ? -1 : m25270q);
                return;
            }
            return;
        }
        int i3 = this.f5915t;
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = m25268t().getWidth();
        }
        int i4 = this.f5914s;
        if (i4 == -1) {
            m25270q = -1;
        } else if (i4 != -2) {
            m25270q = i4;
        }
        this.f5910U.setWidth(i3);
        this.f5910U.setHeight(m25270q);
        m25281N(true);
        this.f5910U.setOutsideTouchable((this.f5892C || this.f5891B) ? false : true);
        this.f5910U.setTouchInterceptor(this.f5902M);
        if (this.f5921z) {
            hy0.m20331a(this.f5910U, this.f5920y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f5889X;
            if (method != null) {
                try {
                    method.invoke(this.f5910U, this.f5908S);
                } catch (Exception unused) {
                }
            }
        } else {
            C0961d.m25260a(this.f5910U, this.f5908S);
        }
        hy0.m20329c(this.f5910U, m25268t(), this.f5916u, this.f5917v, this.f5890A);
        this.f5913r.setSelection(-1);
        if (!this.f5909T || this.f5913r.isInTouchMode()) {
            m25269r();
        }
        if (this.f5909T) {
            return;
        }
        this.f5906Q.post(this.f5904O);
    }

    /* renamed from: i */
    public Drawable m25274i() {
        return this.f5910U.getBackground();
    }

    @Override // com.daaw.vc1
    /* renamed from: k */
    public ListView mo7284k() {
        return this.f5913r;
    }

    /* renamed from: l */
    public void m25273l(int i) {
        this.f5917v = i;
        this.f5919x = true;
    }

    /* renamed from: o */
    public int m25272o() {
        if (this.f5919x) {
            return this.f5917v;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo25271p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f5896G;
        if (dataSetObserver == null) {
            this.f5896G = new C0963f();
        } else {
            ListAdapter listAdapter2 = this.f5912q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f5912q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f5896G);
        }
        C3899zu c3899zu = this.f5913r;
        if (c3899zu != null) {
            c3899zu.setAdapter(this.f5912q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m25270q() {
        int i;
        int i2;
        int makeMeasureSpec;
        int mo1891d;
        int i3;
        int i4 = Integer.MIN_VALUE;
        if (this.f5913r == null) {
            Context context = this.f5911p;
            this.f5905P = new RunnableC0958a();
            C3899zu mo16690s = mo16690s(context, !this.f5909T);
            this.f5913r = mo16690s;
            Drawable drawable = this.f5898I;
            if (drawable != null) {
                mo16690s.setSelector(drawable);
            }
            this.f5913r.setAdapter(this.f5912q);
            this.f5913r.setOnItemClickListener(this.f5899J);
            this.f5913r.setFocusable(true);
            this.f5913r.setFocusableInTouchMode(true);
            this.f5913r.setOnItemSelectedListener(new C0959b());
            this.f5913r.setOnScrollListener(this.f5903N);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f5900K;
            if (onItemSelectedListener != null) {
                this.f5913r.setOnItemSelectedListener(onItemSelectedListener);
            }
            C3899zu c3899zu = this.f5913r;
            View view = this.f5894E;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.f5895F;
                if (i5 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(c3899zu, layoutParams);
                } else if (i5 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f5895F);
                } else {
                    linearLayout.addView(c3899zu, layoutParams);
                    linearLayout.addView(view);
                }
                int i6 = this.f5915t;
                if (i6 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c3899zu = linearLayout;
            } else {
                i = 0;
            }
            this.f5910U.setContentView(c3899zu);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f5910U.getContentView();
            View view2 = this.f5894E;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f5910U.getBackground();
        if (background != null) {
            background.getPadding(this.f5907R);
            Rect rect = this.f5907R;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f5919x) {
                this.f5917v = -i7;
            }
        } else {
            this.f5907R.setEmpty();
            i2 = 0;
        }
        int m25267u = m25267u(m25268t(), this.f5917v, this.f5910U.getInputMethodMode() == 2);
        if (this.f5891B || this.f5914s == -1) {
            return m25267u + i2;
        }
        int i8 = this.f5915t;
        if (i8 != -2) {
            i4 = 1073741824;
            if (i8 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                mo1891d = this.f5913r.mo1891d(makeMeasureSpec, 0, -1, m25267u - i, -1);
                if (mo1891d > 0) {
                    i += i2 + this.f5913r.getPaddingTop() + this.f5913r.getPaddingBottom();
                }
                return mo1891d + i;
            }
        }
        int i9 = this.f5911p.getResources().getDisplayMetrics().widthPixels;
        Rect rect2 = this.f5907R;
        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), i4);
        mo1891d = this.f5913r.mo1891d(makeMeasureSpec, 0, -1, m25267u - i, -1);
        if (mo1891d > 0) {
        }
        return mo1891d + i;
    }

    /* renamed from: r */
    public void m25269r() {
        C3899zu c3899zu = this.f5913r;
        if (c3899zu != null) {
            c3899zu.setListSelectionHidden(true);
            c3899zu.requestLayout();
        }
    }

    /* renamed from: s */
    public C3899zu mo16690s(Context context, boolean z) {
        return new C3899zu(context, z);
    }

    /* renamed from: t */
    public View m25268t() {
        return this.f5897H;
    }

    /* renamed from: u */
    public final int m25267u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f5888W;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f5910U, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            return this.f5910U.getMaxAvailableHeight(view, i);
        }
        return C0960c.m25261a(this.f5910U, view, i, z);
    }

    /* renamed from: v */
    public Object m25266v() {
        if (mo7286a()) {
            return this.f5913r.getSelectedItem();
        }
        return null;
    }

    /* renamed from: w */
    public long m25265w() {
        if (mo7286a()) {
            return this.f5913r.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: x */
    public int m25264x() {
        if (mo7286a()) {
            return this.f5913r.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: y */
    public View m25263y() {
        if (mo7286a()) {
            return this.f5913r.getSelectedView();
        }
        return null;
    }

    /* renamed from: z */
    public int m25262z() {
        return this.f5915t;
    }
}
