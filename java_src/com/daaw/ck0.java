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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class ck0 implements vc1 {
    public static Method V;
    public static Method W;
    public static Method X;
    public int A;
    public boolean B;
    public boolean C;
    public int D;
    public View E;
    public int F;
    public DataSetObserver G;
    public View H;
    public Drawable I;
    public AdapterView.OnItemClickListener J;
    public AdapterView.OnItemSelectedListener K;
    public final i L;
    public final h M;
    public final g N;
    public final e O;
    public Runnable P;
    public final Handler Q;
    public final Rect R;
    public Rect S;
    public boolean T;
    public PopupWindow U;
    public Context p;
    public ListAdapter q;
    public zu r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View t = ck0.this.t();
            if (t == null || t.getWindowToken() == null) {
                return;
            }
            ck0.this.h();
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            zu zuVar;
            if (i == -1 || (zuVar = ck0.this.r) == null) {
                return;
            }
            zuVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ck0.this.r();
        }
    }

    /* loaded from: classes.dex */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (ck0.this.a()) {
                ck0.this.h();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ck0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ck0.this.A() || ck0.this.U.getContentView() == null) {
                return;
            }
            ck0 ck0Var = ck0.this;
            ck0Var.Q.removeCallbacks(ck0Var.L);
            ck0.this.L.run();
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ck0.this.U) != null && popupWindow.isShowing() && x >= 0 && x < ck0.this.U.getWidth() && y >= 0 && y < ck0.this.U.getHeight()) {
                ck0 ck0Var = ck0.this;
                ck0Var.Q.postDelayed(ck0Var.L, 250L);
                return false;
            } else if (action == 1) {
                ck0 ck0Var2 = ck0.this;
                ck0Var2.Q.removeCallbacks(ck0Var2.L);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zu zuVar = ck0.this.r;
            if (zuVar == null || !xs1.U(zuVar) || ck0.this.r.getCount() <= ck0.this.r.getChildCount()) {
                return;
            }
            int childCount = ck0.this.r.getChildCount();
            ck0 ck0Var = ck0.this;
            if (childCount <= ck0Var.D) {
                ck0Var.U.setInputMethodMode(2);
                ck0.this.h();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                V = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                X = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                W = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ck0(Context context) {
        this(context, null, x01.listPopupWindowStyle);
    }

    public ck0(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ck0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.s = -2;
        this.t = -2;
        this.w = 1002;
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = Integer.MAX_VALUE;
        this.F = 0;
        this.L = new i();
        this.M = new h();
        this.N = new g();
        this.O = new e();
        this.R = new Rect();
        this.p = context;
        this.Q = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.l1, i2, i3);
        this.u = obtainStyledAttributes.getDimensionPixelOffset(x21.m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(x21.n1, 0);
        this.v = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.x = true;
        }
        obtainStyledAttributes.recycle();
        l4 l4Var = new l4(context, attributeSet, i2, i3);
        this.U = l4Var;
        l4Var.setInputMethodMode(1);
    }

    public boolean A() {
        return this.U.getInputMethodMode() == 2;
    }

    public boolean B() {
        return this.T;
    }

    public final void C() {
        View view = this.E;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.E);
            }
        }
    }

    public void D(View view) {
        this.H = view;
    }

    public void E(int i2) {
        this.U.setAnimationStyle(i2);
    }

    public void F(int i2) {
        Drawable background = this.U.getBackground();
        if (background == null) {
            Q(i2);
            return;
        }
        background.getPadding(this.R);
        Rect rect = this.R;
        this.t = rect.left + rect.right + i2;
    }

    public void G(int i2) {
        this.A = i2;
    }

    public void H(Rect rect) {
        this.S = rect != null ? new Rect(rect) : null;
    }

    public void I(int i2) {
        this.U.setInputMethodMode(i2);
    }

    public void J(boolean z) {
        this.T = z;
        this.U.setFocusable(z);
    }

    public void K(PopupWindow.OnDismissListener onDismissListener) {
        this.U.setOnDismissListener(onDismissListener);
    }

    public void L(AdapterView.OnItemClickListener onItemClickListener) {
        this.J = onItemClickListener;
    }

    public void M(boolean z) {
        this.z = true;
        this.y = z;
    }

    public final void N(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.U, z);
            return;
        }
        Method method = V;
        if (method != null) {
            try {
                method.invoke(this.U, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void O(int i2) {
        this.F = i2;
    }

    public void P(int i2) {
        zu zuVar = this.r;
        if (!a() || zuVar == null) {
            return;
        }
        zuVar.setListSelectionHidden(false);
        zuVar.setSelection(i2);
        if (zuVar.getChoiceMode() != 0) {
            zuVar.setItemChecked(i2, true);
        }
    }

    public void Q(int i2) {
        this.t = i2;
    }

    @Override // com.daaw.vc1
    public boolean a() {
        return this.U.isShowing();
    }

    public void b(Drawable drawable) {
        this.U.setBackgroundDrawable(drawable);
    }

    public int c() {
        return this.u;
    }

    @Override // com.daaw.vc1
    public void dismiss() {
        this.U.dismiss();
        C();
        this.U.setContentView(null);
        this.r = null;
        this.Q.removeCallbacks(this.L);
    }

    public void e(int i2) {
        this.u = i2;
    }

    @Override // com.daaw.vc1
    public void h() {
        int q = q();
        boolean A = A();
        hy0.b(this.U, this.w);
        boolean z = true;
        if (this.U.isShowing()) {
            if (xs1.U(t())) {
                int i2 = this.t;
                if (i2 == -1) {
                    i2 = -1;
                } else if (i2 == -2) {
                    i2 = t().getWidth();
                }
                int i3 = this.s;
                if (i3 == -1) {
                    if (!A) {
                        q = -1;
                    }
                    if (A) {
                        this.U.setWidth(this.t == -1 ? -1 : 0);
                        this.U.setHeight(0);
                    } else {
                        this.U.setWidth(this.t == -1 ? -1 : 0);
                        this.U.setHeight(-1);
                    }
                } else if (i3 != -2) {
                    q = i3;
                }
                this.U.setOutsideTouchable((this.C || this.B) ? false : false);
                this.U.update(t(), this.u, this.v, i2 < 0 ? -1 : i2, q < 0 ? -1 : q);
                return;
            }
            return;
        }
        int i4 = this.t;
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = t().getWidth();
        }
        int i5 = this.s;
        if (i5 == -1) {
            q = -1;
        } else if (i5 != -2) {
            q = i5;
        }
        this.U.setWidth(i4);
        this.U.setHeight(q);
        N(true);
        this.U.setOutsideTouchable((this.C || this.B) ? false : true);
        this.U.setTouchInterceptor(this.M);
        if (this.z) {
            hy0.a(this.U, this.y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = X;
            if (method != null) {
                try {
                    method.invoke(this.U, this.S);
                } catch (Exception unused) {
                }
            }
        } else {
            d.a(this.U, this.S);
        }
        hy0.c(this.U, t(), this.u, this.v, this.A);
        this.r.setSelection(-1);
        if (!this.T || this.r.isInTouchMode()) {
            r();
        }
        if (this.T) {
            return;
        }
        this.Q.post(this.O);
    }

    public Drawable i() {
        return this.U.getBackground();
    }

    @Override // com.daaw.vc1
    public ListView k() {
        return this.r;
    }

    public void l(int i2) {
        this.v = i2;
        this.x = true;
    }

    public int o() {
        if (this.x) {
            return this.v;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.G;
        if (dataSetObserver == null) {
            this.G = new f();
        } else {
            ListAdapter listAdapter2 = this.q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.G);
        }
        zu zuVar = this.r;
        if (zuVar != null) {
            zuVar.setAdapter(this.q);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q() {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ck0.q():int");
    }

    public void r() {
        zu zuVar = this.r;
        if (zuVar != null) {
            zuVar.setListSelectionHidden(true);
            zuVar.requestLayout();
        }
    }

    public zu s(Context context, boolean z) {
        return new zu(context, z);
    }

    public View t() {
        return this.H;
    }

    public final int u(View view, int i2, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = W;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.U, view, Integer.valueOf(i2), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            return this.U.getMaxAvailableHeight(view, i2);
        }
        return c.a(this.U, view, i2, z);
    }

    public Object v() {
        if (a()) {
            return this.r.getSelectedItem();
        }
        return null;
    }

    public long w() {
        if (a()) {
            return this.r.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int x() {
        if (a()) {
            return this.r.getSelectedItemPosition();
        }
        return -1;
    }

    public View y() {
        if (a()) {
            return this.r.getSelectedView();
        }
        return null;
    }

    public int z() {
        return this.t;
    }
}
