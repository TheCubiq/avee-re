package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.daaw.cn0;
import com.daaw.em1;
import com.daaw.fg;
import com.daaw.g80;
import com.daaw.gi1;
import com.daaw.gp0;
import com.daaw.h4;
import com.daaw.hu1;
import com.daaw.i0;
import com.daaw.iq;
import com.daaw.j4;
import com.daaw.k61;
import com.daaw.r4;
import com.daaw.ul1;
import com.daaw.w4;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public k61 I;
    public int J;
    public int K;
    public int L;
    public CharSequence M;
    public CharSequence N;
    public ColorStateList O;
    public ColorStateList P;
    public boolean Q;
    public boolean R;
    public final ArrayList<View> S;
    public final ArrayList<View> T;
    public final int[] U;
    public final gp0 V;
    public ArrayList<MenuItem> W;
    public f a0;
    public final ActionMenuView.e b0;
    public androidx.appcompat.widget.d c0;
    public ActionMenuPresenter d0;
    public d e0;
    public i.a f0;
    public e.a g0;
    public boolean h0;
    public final Runnable i0;
    public ActionMenuView p;
    public TextView q;
    public TextView r;
    public ImageButton s;
    public ImageView t;
    public Drawable u;
    public CharSequence v;
    public ImageButton w;
    public View x;
    public Context y;
    public int z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int r;
        public boolean s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.r = parcel.readInt();
            this.s = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.V.c(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.a0;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class d implements i {
        public androidx.appcompat.view.menu.e p;
        public g q;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.i
        public void c(boolean z) {
            if (this.q != null) {
                androidx.appcompat.view.menu.e eVar = this.p;
                boolean z2 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.p.getItem(i) == this.q) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                e(this.p, this.q);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e(androidx.appcompat.view.menu.e eVar, g gVar) {
            View view = Toolbar.this.x;
            if (view instanceof fg) {
                ((fg) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.x);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.w);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.x = null;
            toolbar3.a();
            this.q = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean f(androidx.appcompat.view.menu.e eVar, g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.w.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.w);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.w);
            }
            Toolbar.this.x = gVar.getActionView();
            this.q = gVar;
            ViewParent parent2 = Toolbar.this.x.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.x);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.C & 112);
                generateDefaultLayoutParams.b = 2;
                toolbar4.x.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.x);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.x;
            if (view instanceof fg) {
                ((fg) view).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.p;
            if (eVar2 != null && (gVar = this.q) != null) {
                eVar2.f(gVar);
            }
            this.p = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean l(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable m() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends i0.a {
        public int b;

        public e(int i, int i2) {
            super(i, i2);
            this.b = 0;
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            a(marginLayoutParams);
        }

        public e(e eVar) {
            super((i0.a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        public e(i0.a aVar) {
            super(aVar);
            this.b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.Q);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = 8388627;
        this.S = new ArrayList<>();
        this.T = new ArrayList<>();
        this.U = new int[2];
        this.V = new gp0(new Runnable() { // from class: com.daaw.cm1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.W = new ArrayList<>();
        this.b0 = new a();
        this.i0 = new b();
        Context context2 = getContext();
        int[] iArr = x21.f3;
        ul1 v = ul1.v(context2, attributeSet, iArr, i, 0);
        xs1.p0(this, context, iArr, attributeSet, v.r(), i, 0);
        this.A = v.n(x21.H3, 0);
        this.B = v.n(x21.y3, 0);
        this.L = v.l(x21.g3, this.L);
        this.C = v.l(x21.h3, 48);
        int e2 = v.e(x21.B3, 0);
        int i2 = x21.G3;
        e2 = v.s(i2) ? v.e(i2, e2) : e2;
        this.H = e2;
        this.G = e2;
        this.F = e2;
        this.E = e2;
        int e3 = v.e(x21.E3, -1);
        if (e3 >= 0) {
            this.E = e3;
        }
        int e4 = v.e(x21.D3, -1);
        if (e4 >= 0) {
            this.F = e4;
        }
        int e5 = v.e(x21.F3, -1);
        if (e5 >= 0) {
            this.G = e5;
        }
        int e6 = v.e(x21.C3, -1);
        if (e6 >= 0) {
            this.H = e6;
        }
        this.D = v.f(x21.s3, -1);
        int e7 = v.e(x21.o3, Integer.MIN_VALUE);
        int e8 = v.e(x21.k3, Integer.MIN_VALUE);
        int f2 = v.f(x21.m3, 0);
        int f3 = v.f(x21.n3, 0);
        h();
        this.I.e(f2, f3);
        if (e7 != Integer.MIN_VALUE || e8 != Integer.MIN_VALUE) {
            this.I.g(e7, e8);
        }
        this.J = v.e(x21.p3, Integer.MIN_VALUE);
        this.K = v.e(x21.l3, Integer.MIN_VALUE);
        this.u = v.g(x21.j3);
        this.v = v.p(x21.i3);
        CharSequence p = v.p(x21.A3);
        if (!TextUtils.isEmpty(p)) {
            setTitle(p);
        }
        CharSequence p2 = v.p(x21.x3);
        if (!TextUtils.isEmpty(p2)) {
            setSubtitle(p2);
        }
        this.y = getContext();
        setPopupTheme(v.n(x21.w3, 0));
        Drawable g = v.g(x21.v3);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence p3 = v.p(x21.u3);
        if (!TextUtils.isEmpty(p3)) {
            setNavigationContentDescription(p3);
        }
        Drawable g2 = v.g(x21.q3);
        if (g2 != null) {
            setLogo(g2);
        }
        CharSequence p4 = v.p(x21.r3);
        if (!TextUtils.isEmpty(p4)) {
            setLogoDescription(p4);
        }
        int i3 = x21.I3;
        if (v.s(i3)) {
            setTitleTextColor(v.c(i3));
        }
        int i4 = x21.z3;
        if (v.s(i4)) {
            setSubtitleTextColor(v.c(i4));
        }
        int i5 = x21.t3;
        if (v.s(i5)) {
            x(v.n(i5, 0));
        }
        v.w();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new gi1(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.p;
        return actionMenuView != null && actionMenuView.I();
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.p;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int C(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q, max + measuredWidth, view.getMeasuredHeight() + q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int D(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int q = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q, max, view.getMeasuredHeight() + q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.V.a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.W = currentMenuItems2;
        this.V.d(menu);
    }

    public final void H() {
        removeCallbacks(this.i0);
        post(this.i0);
    }

    public void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).b != 2 && childAt != this.p) {
                removeViewAt(childCount);
                this.T.add(childAt);
            }
        }
    }

    public void J(int i, int i2) {
        h();
        this.I.g(i, i2);
    }

    public void K(androidx.appcompat.view.menu.e eVar, ActionMenuPresenter actionMenuPresenter) {
        if (eVar == null && this.p == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.e N = this.p.N();
        if (N == eVar) {
            return;
        }
        if (N != null) {
            N.Q(this.d0);
            N.Q(this.e0);
        }
        if (this.e0 == null) {
            this.e0 = new d();
        }
        actionMenuPresenter.I(true);
        if (eVar != null) {
            eVar.c(actionMenuPresenter, this.y);
            eVar.c(this.e0, this.y);
        } else {
            actionMenuPresenter.i(this.y, null);
            this.e0.i(this.y, null);
            actionMenuPresenter.c(true);
            this.e0.c(true);
        }
        this.p.setPopupTheme(this.z);
        this.p.setPresenter(actionMenuPresenter);
        this.d0 = actionMenuPresenter;
    }

    public void L(i.a aVar, e.a aVar2) {
        this.f0 = aVar;
        this.g0 = aVar2;
        ActionMenuView actionMenuView = this.p;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i) {
        this.B = i;
        TextView textView = this.r;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void N(Context context, int i) {
        this.A = i;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public final boolean O() {
        if (this.h0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.p;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.T.size() - 1; size >= 0; size--) {
            addView(this.T.get(size));
        }
        this.T.clear();
    }

    public final void b(List<View> list, int i) {
        boolean z = xs1.E(this) == 1;
        int childCount = getChildCount();
        int b2 = g80.b(i, xs1.E(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && P(childAt) && p(eVar.a) == b2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && P(childAt2) && p(eVar2.a) == b2) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.b = 1;
        if (!z || this.x == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.T.add(view);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.p) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.e0;
        g gVar = dVar == null ? null : dVar.q;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.p;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.w == null) {
            h4 h4Var = new h4(getContext(), null, x01.toolbarNavigationButtonStyle);
            this.w = h4Var;
            h4Var.setImageDrawable(this.u);
            this.w.setContentDescription(this.v);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.C & 112);
            generateDefaultLayoutParams.b = 2;
            this.w.setLayoutParams(generateDefaultLayoutParams);
            this.w.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.w;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.w;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        k61 k61Var = this.I;
        if (k61Var != null) {
            return k61Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.K;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        k61 k61Var = this.I;
        if (k61Var != null) {
            return k61Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        k61 k61Var = this.I;
        if (k61Var != null) {
            return k61Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        k61 k61Var = this.I;
        if (k61Var != null) {
            return k61Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.J;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N;
        ActionMenuView actionMenuView = this.p;
        return actionMenuView != null && (N = actionMenuView.N()) != null && N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.K, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return xs1.E(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return xs1.E(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.J, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.t;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.t;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.p.getMenu();
    }

    public View getNavButtonView() {
        return this.s;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.s;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.s;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.d0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.p.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.y;
    }

    public int getPopupTheme() {
        return this.z;
    }

    public CharSequence getSubtitle() {
        return this.N;
    }

    public final TextView getSubtitleTextView() {
        return this.r;
    }

    public CharSequence getTitle() {
        return this.M;
    }

    public int getTitleMarginBottom() {
        return this.H;
    }

    public int getTitleMarginEnd() {
        return this.F;
    }

    public int getTitleMarginStart() {
        return this.E;
    }

    public int getTitleMarginTop() {
        return this.G;
    }

    public final TextView getTitleTextView() {
        return this.q;
    }

    public iq getWrapper() {
        if (this.c0 == null) {
            this.c0 = new androidx.appcompat.widget.d(this, true);
        }
        return this.c0;
    }

    public final void h() {
        if (this.I == null) {
            this.I = new k61();
        }
    }

    public final void i() {
        if (this.t == null) {
            this.t = new j4(getContext());
        }
    }

    public final void j() {
        k();
        if (this.p.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.p.getMenu();
            if (this.e0 == null) {
                this.e0 = new d();
            }
            this.p.setExpandedActionViewsExclusive(true);
            eVar.c(this.e0, this.y);
        }
    }

    public final void k() {
        if (this.p == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.p = actionMenuView;
            actionMenuView.setPopupTheme(this.z);
            this.p.setOnMenuItemClickListener(this.b0);
            this.p.O(this.f0, this.g0);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.C & 112);
            this.p.setLayoutParams(generateDefaultLayoutParams);
            c(this.p, false);
        }
    }

    public final void l() {
        if (this.s == null) {
            this.s = new h4(getContext(), null, x01.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.C & 112);
            this.s.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof i0.a ? new e((i0.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.i0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.R = false;
        }
        if (!this.R) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.R = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.R = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.U;
        boolean b2 = hu1.b(this);
        int i10 = !b2 ? 1 : 0;
        if (P(this.s)) {
            F(this.s, i, 0, i2, 0, this.D);
            i3 = this.s.getMeasuredWidth() + s(this.s);
            i4 = Math.max(0, this.s.getMeasuredHeight() + t(this.s));
            i5 = View.combineMeasuredStates(0, this.s.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (P(this.w)) {
            F(this.w, i, 0, i2, 0, this.D);
            i3 = this.w.getMeasuredWidth() + s(this.w);
            i4 = Math.max(i4, this.w.getMeasuredHeight() + t(this.w));
            i5 = View.combineMeasuredStates(i5, this.w.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[b2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (P(this.p)) {
            F(this.p, i, max, i2, 0, this.D);
            i6 = this.p.getMeasuredWidth() + s(this.p);
            i4 = Math.max(i4, this.p.getMeasuredHeight() + t(this.p));
            i5 = View.combineMeasuredStates(i5, this.p.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (P(this.x)) {
            max2 += E(this.x, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.x.getMeasuredHeight() + t(this.x));
            i5 = View.combineMeasuredStates(i5, this.x.getMeasuredState());
        }
        if (P(this.t)) {
            max2 += E(this.t, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.t.getMeasuredHeight() + t(this.t));
            i5 = View.combineMeasuredStates(i5, this.t.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((e) childAt.getLayoutParams()).b == 0 && P(childAt)) {
                max2 += E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.G + this.H;
        int i13 = this.E + this.F;
        if (P(this.q)) {
            E(this.q, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.q.getMeasuredWidth() + s(this.q);
            i9 = this.q.getMeasuredHeight() + t(this.q);
            i7 = View.combineMeasuredStates(i5, this.q.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (P(this.r)) {
            i8 = Math.max(i8, E(this.r, i, max2 + i13, i2, i9 + i12, iArr));
            i9 += this.r.getMeasuredHeight() + t(this.r);
            i7 = View.combineMeasuredStates(i7, this.r.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), O() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.p;
        androidx.appcompat.view.menu.e N = actionMenuView != null ? actionMenuView.N() : null;
        int i = savedState.r;
        if (i != 0 && this.e0 != null && N != null && (findItem = N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.s) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        h();
        this.I.f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.e0;
        if (dVar != null && (gVar = dVar.q) != null) {
            savedState.r = gVar.getItemId();
        }
        savedState.s = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = false;
        }
        if (!this.Q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.Q = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.Q = false;
        }
        return true;
    }

    public final int p(int i) {
        int E = xs1.E(this);
        int b2 = g80.b(i, E) & 7;
        return (b2 == 1 || b2 == 3 || b2 == 5) ? b2 : E == 1 ? 5 : 3;
    }

    public final int q(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int r = r(eVar.a);
        if (r != 48) {
            if (r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final int r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.L & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return cn0.b(marginLayoutParams) + cn0.a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.w;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(r4.b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.w.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.w;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.u);
        }
    }

    public void setCollapsible(boolean z) {
        this.h0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.K) {
            this.K = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.J) {
            this.J = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(r4.b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.t)) {
                c(this.t, true);
            }
        } else {
            ImageView imageView = this.t;
            if (imageView != null && z(imageView)) {
                removeView(this.t);
                this.T.remove(this.t);
            }
        }
        ImageView imageView2 = this.t;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.s;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            em1.a(this.s, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(r4.b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.s)) {
                c(this.s, true);
            }
        } else {
            ImageButton imageButton = this.s;
            if (imageButton != null && z(imageButton)) {
                removeView(this.s);
                this.T.remove(this.s);
            }
        }
        ImageButton imageButton2 = this.s;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.s.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.a0 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.p.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.z != i) {
            this.z = i;
            if (i == 0) {
                this.y = getContext();
            } else {
                this.y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.r;
            if (textView != null && z(textView)) {
                removeView(this.r);
                this.T.remove(this.r);
            }
        } else {
            if (this.r == null) {
                Context context = getContext();
                w4 w4Var = new w4(context);
                this.r = w4Var;
                w4Var.setSingleLine();
                this.r.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.B;
                if (i != 0) {
                    this.r.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.P;
                if (colorStateList != null) {
                    this.r.setTextColor(colorStateList);
                }
            }
            if (!z(this.r)) {
                c(this.r, true);
            }
        }
        TextView textView2 = this.r;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.N = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        TextView textView = this.r;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.q;
            if (textView != null && z(textView)) {
                removeView(this.q);
                this.T.remove(this.q);
            }
        } else {
            if (this.q == null) {
                Context context = getContext();
                w4 w4Var = new w4(context);
                this.q = w4Var;
                w4Var.setSingleLine();
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A;
                if (i != 0) {
                    this.q.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.O;
                if (colorStateList != null) {
                    this.q.setTextColor(colorStateList);
                }
            }
            if (!z(this.q)) {
                c(this.q, true);
            }
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.M = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.H = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.F = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.E = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.G = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.O = colorStateList;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    public boolean v() {
        d dVar = this.e0;
        return (dVar == null || dVar.q == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.p;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.W.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    public final boolean z(View view) {
        return view.getParent() == this || this.T.contains(view);
    }
}
