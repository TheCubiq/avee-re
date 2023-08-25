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
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.SubMenuC0098l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.customview.view.AbsSavedState;
import com.daaw.AbstractC1643i0;
import com.daaw.C1499h4;
import com.daaw.C1782j4;
import com.daaw.C2818r4;
import com.daaw.C3397w4;
import com.daaw.InterfaceC1278fg;
import com.daaw.InterfaceC1745iq;
import com.daaw.cn0;
import com.daaw.em1;
import com.daaw.g80;
import com.daaw.gi1;
import com.daaw.gp0;
import com.daaw.hu1;
import com.daaw.k61;
import com.daaw.ul1;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f747A;

    /* renamed from: B */
    public int f748B;

    /* renamed from: C */
    public int f749C;

    /* renamed from: D */
    public int f750D;

    /* renamed from: E */
    public int f751E;

    /* renamed from: F */
    public int f752F;

    /* renamed from: G */
    public int f753G;

    /* renamed from: H */
    public int f754H;

    /* renamed from: I */
    public k61 f755I;

    /* renamed from: J */
    public int f756J;

    /* renamed from: K */
    public int f757K;

    /* renamed from: L */
    public int f758L;

    /* renamed from: M */
    public CharSequence f759M;

    /* renamed from: N */
    public CharSequence f760N;

    /* renamed from: O */
    public ColorStateList f761O;

    /* renamed from: P */
    public ColorStateList f762P;

    /* renamed from: Q */
    public boolean f763Q;

    /* renamed from: R */
    public boolean f764R;

    /* renamed from: S */
    public final ArrayList<View> f765S;

    /* renamed from: T */
    public final ArrayList<View> f766T;

    /* renamed from: U */
    public final int[] f767U;

    /* renamed from: V */
    public final gp0 f768V;

    /* renamed from: W */
    public ArrayList<MenuItem> f769W;

    /* renamed from: a0 */
    public InterfaceC0160f f770a0;

    /* renamed from: b0 */
    public final ActionMenuView.InterfaceC0118e f771b0;

    /* renamed from: c0 */
    public C0171d f772c0;

    /* renamed from: d0 */
    public ActionMenuPresenter f773d0;

    /* renamed from: e0 */
    public C0158d f774e0;

    /* renamed from: f0 */
    public InterfaceC0091i.InterfaceC0092a f775f0;

    /* renamed from: g0 */
    public C0082e.InterfaceC0083a f776g0;

    /* renamed from: h0 */
    public boolean f777h0;

    /* renamed from: i0 */
    public final Runnable f778i0;

    /* renamed from: p */
    public ActionMenuView f779p;

    /* renamed from: q */
    public TextView f780q;

    /* renamed from: r */
    public TextView f781r;

    /* renamed from: s */
    public ImageButton f782s;

    /* renamed from: t */
    public ImageView f783t;

    /* renamed from: u */
    public Drawable f784u;

    /* renamed from: v */
    public CharSequence f785v;

    /* renamed from: w */
    public ImageButton f786w;

    /* renamed from: x */
    public View f787x;

    /* renamed from: y */
    public Context f788y;

    /* renamed from: z */
    public int f789z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0154a();

        /* renamed from: r */
        public int f790r;

        /* renamed from: s */
        public boolean f791s;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        /* loaded from: classes.dex */
        public class C0154a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f790r = parcel.readInt();
            this.f791s = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f790r);
            parcel.writeInt(this.f791s ? 1 : 0);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: classes.dex */
    public class C0155a implements ActionMenuView.InterfaceC0118e {
        public C0155a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0118e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f768V.m21365c(menuItem)) {
                return true;
            }
            InterfaceC0160f interfaceC0160f = Toolbar.this.f770a0;
            if (interfaceC0160f != null) {
                return interfaceC0160f.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: classes.dex */
    public class RunnableC0156b implements Runnable {
        public RunnableC0156b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m29972Q();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0157c implements View.OnClickListener {
        public View$OnClickListenerC0157c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m29967e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: classes.dex */
    public class C0158d implements InterfaceC0091i {

        /* renamed from: p */
        public C0082e f795p;

        /* renamed from: q */
        public C0086g f796q;

        public C0158d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: b */
        public void mo25025b(C0082e c0082e, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: c */
        public void mo25024c(boolean z) {
            if (this.f796q != null) {
                C0082e c0082e = this.f795p;
                boolean z2 = false;
                if (c0082e != null) {
                    int size = c0082e.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f795p.getItem(i) == this.f796q) {
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
                mo17564e(this.f795p, this.f796q);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: d */
        public boolean mo25023d() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: e */
        public boolean mo17564e(C0082e c0082e, C0086g c0086g) {
            View view = Toolbar.this.f787x;
            if (view instanceof InterfaceC1278fg) {
                ((InterfaceC1278fg) view).mo18346f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f787x);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f786w);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f787x = null;
            toolbar3.m29971a();
            this.f796q = null;
            Toolbar.this.requestLayout();
            c0086g.m30198r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: f */
        public boolean mo17563f(C0082e c0082e, C0086g c0086g) {
            Toolbar.this.m29965g();
            ViewParent parent = Toolbar.this.f786w.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f786w);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f786w);
            }
            Toolbar.this.f787x = c0086g.getActionView();
            this.f796q = c0086g;
            ViewParent parent2 = Toolbar.this.f787x.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f787x);
                }
                C0159e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f13119a = 8388611 | (toolbar4.f749C & 112);
                generateDefaultLayoutParams.f798b = 2;
                toolbar4.f787x.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f787x);
            }
            Toolbar.this.m29980I();
            Toolbar.this.requestLayout();
            c0086g.m30198r(true);
            View view = Toolbar.this.f787x;
            if (view instanceof InterfaceC1278fg) {
                ((InterfaceC1278fg) view).mo18347c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        public int getId() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: i */
        public void mo17562i(Context context, C0082e c0082e) {
            C0086g c0086g;
            C0082e c0082e2 = this.f795p;
            if (c0082e2 != null && (c0086g = this.f796q) != null) {
                c0082e2.mo30168f(c0086g);
            }
            this.f795p = c0082e;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: j */
        public void mo25021j(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: l */
        public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i
        /* renamed from: m */
        public Parcelable mo25018m() {
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: classes.dex */
    public static class C0159e extends AbstractC1643i0.C1644a {

        /* renamed from: b */
        public int f798b;

        public C0159e(int i, int i2) {
            super(i, i2);
            this.f798b = 0;
            this.f13119a = 8388627;
        }

        public C0159e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f798b = 0;
        }

        public C0159e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f798b = 0;
        }

        public C0159e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f798b = 0;
            m29942a(marginLayoutParams);
        }

        public C0159e(C0159e c0159e) {
            super((AbstractC1643i0.C1644a) c0159e);
            this.f798b = 0;
            this.f798b = c0159e.f798b;
        }

        public C0159e(AbstractC1643i0.C1644a c1644a) {
            super(c1644a);
            this.f798b = 0;
        }

        /* renamed from: a */
        public void m29942a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0160f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.f31705Q);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f758L = 8388627;
        this.f765S = new ArrayList<>();
        this.f766T = new ArrayList<>();
        this.f767U = new int[2];
        this.f768V = new gp0(new Runnable() { // from class: com.daaw.cm1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m29947y();
            }
        });
        this.f769W = new ArrayList<>();
        this.f771b0 = new C0155a();
        this.f778i0 = new RunnableC0156b();
        Context context2 = getContext();
        int[] iArr = x21.f31911f3;
        ul1 m8037v = ul1.m8037v(context2, attributeSet, iArr, i, 0);
        xs1.m4706p0(this, context, iArr, attributeSet, m8037v.m8041r(), i, 0);
        this.f747A = m8037v.m8045n(x21.f31797H3, 0);
        this.f748B = m8037v.m8045n(x21.f32006y3, 0);
        this.f758L = m8037v.m8047l(x21.f31916g3, this.f758L);
        this.f749C = m8037v.m8047l(x21.f31921h3, 48);
        int m8054e = m8037v.m8054e(x21.f31767B3, 0);
        int i2 = x21.f31792G3;
        m8054e = m8037v.m8040s(i2) ? m8037v.m8054e(i2, m8054e) : m8054e;
        this.f754H = m8054e;
        this.f753G = m8054e;
        this.f752F = m8054e;
        this.f751E = m8054e;
        int m8054e2 = m8037v.m8054e(x21.f31782E3, -1);
        if (m8054e2 >= 0) {
            this.f751E = m8054e2;
        }
        int m8054e3 = m8037v.m8054e(x21.f31777D3, -1);
        if (m8054e3 >= 0) {
            this.f752F = m8054e3;
        }
        int m8054e4 = m8037v.m8054e(x21.f31787F3, -1);
        if (m8054e4 >= 0) {
            this.f753G = m8054e4;
        }
        int m8054e5 = m8037v.m8054e(x21.f31772C3, -1);
        if (m8054e5 >= 0) {
            this.f754H = m8054e5;
        }
        this.f750D = m8037v.m8053f(x21.f31976s3, -1);
        int m8054e6 = m8037v.m8054e(x21.f31956o3, Integer.MIN_VALUE);
        int m8054e7 = m8037v.m8054e(x21.f31936k3, Integer.MIN_VALUE);
        int m8053f = m8037v.m8053f(x21.f31946m3, 0);
        int m8053f2 = m8037v.m8053f(x21.f31951n3, 0);
        m29964h();
        this.f755I.m18028e(m8053f, m8053f2);
        if (m8054e6 != Integer.MIN_VALUE || m8054e7 != Integer.MIN_VALUE) {
            this.f755I.m18026g(m8054e6, m8054e7);
        }
        this.f756J = m8037v.m8054e(x21.f31961p3, Integer.MIN_VALUE);
        this.f757K = m8037v.m8054e(x21.f31941l3, Integer.MIN_VALUE);
        this.f784u = m8037v.m8052g(x21.f31931j3);
        this.f785v = m8037v.m8043p(x21.f31926i3);
        CharSequence m8043p = m8037v.m8043p(x21.f31762A3);
        if (!TextUtils.isEmpty(m8043p)) {
            setTitle(m8043p);
        }
        CharSequence m8043p2 = m8037v.m8043p(x21.f32001x3);
        if (!TextUtils.isEmpty(m8043p2)) {
            setSubtitle(m8043p2);
        }
        this.f788y = getContext();
        setPopupTheme(m8037v.m8045n(x21.f31996w3, 0));
        Drawable m8052g = m8037v.m8052g(x21.f31991v3);
        if (m8052g != null) {
            setNavigationIcon(m8052g);
        }
        CharSequence m8043p3 = m8037v.m8043p(x21.f31986u3);
        if (!TextUtils.isEmpty(m8043p3)) {
            setNavigationContentDescription(m8043p3);
        }
        Drawable m8052g2 = m8037v.m8052g(x21.f31966q3);
        if (m8052g2 != null) {
            setLogo(m8052g2);
        }
        CharSequence m8043p4 = m8037v.m8043p(x21.f31971r3);
        if (!TextUtils.isEmpty(m8043p4)) {
            setLogoDescription(m8043p4);
        }
        int i3 = x21.f31802I3;
        if (m8037v.m8040s(i3)) {
            setTitleTextColor(m8037v.m8056c(i3));
        }
        int i4 = x21.f32011z3;
        if (m8037v.m8040s(i4)) {
            setSubtitleTextColor(m8037v.m8056c(i4));
        }
        int i5 = x21.f31981t3;
        if (m8037v.m8040s(i5)) {
            m29948x(m8037v.m8045n(i5, 0));
        }
        m8037v.m8036w();
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

    /* renamed from: A */
    public boolean m29988A() {
        ActionMenuView actionMenuView = this.f779p;
        return actionMenuView != null && actionMenuView.m30105I();
    }

    /* renamed from: B */
    public boolean m29987B() {
        ActionMenuView actionMenuView = this.f779p;
        return actionMenuView != null && actionMenuView.m30104J();
    }

    /* renamed from: C */
    public final int m29986C(View view, int i, int[] iArr, int i2) {
        C0159e c0159e = (C0159e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0159e).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m29955q = m29955q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m29955q, max + measuredWidth, view.getMeasuredHeight() + m29955q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0159e).rightMargin;
    }

    /* renamed from: D */
    public final int m29985D(View view, int i, int[] iArr, int i2) {
        C0159e c0159e = (C0159e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0159e).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m29955q = m29955q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m29955q, max, view.getMeasuredHeight() + m29955q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0159e).leftMargin);
    }

    /* renamed from: E */
    public final int m29984E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    public final void m29983F(View view, int i, int i2, int i3, int i4, int i5) {
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

    /* renamed from: G */
    public final void m29982G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f768V.m21367a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f769W = currentMenuItems2;
        this.f768V.m21364d(menu);
    }

    /* renamed from: H */
    public final void m29981H() {
        removeCallbacks(this.f778i0);
        post(this.f778i0);
    }

    /* renamed from: I */
    public void m29980I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0159e) childAt.getLayoutParams()).f798b != 2 && childAt != this.f779p) {
                removeViewAt(childCount);
                this.f766T.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m29979J(int i, int i2) {
        m29964h();
        this.f755I.m18026g(i, i2);
    }

    /* renamed from: K */
    public void m29978K(C0082e c0082e, ActionMenuPresenter actionMenuPresenter) {
        if (c0082e == null && this.f779p == null) {
            return;
        }
        m29961k();
        C0082e m30100N = this.f779p.m30100N();
        if (m30100N == c0082e) {
            return;
        }
        if (m30100N != null) {
            m30100N.m30256Q(this.f773d0);
            m30100N.m30256Q(this.f774e0);
        }
        if (this.f774e0 == null) {
            this.f774e0 = new C0158d();
        }
        actionMenuPresenter.m30133I(true);
        if (c0082e != null) {
            c0082e.m30243c(actionMenuPresenter, this.f788y);
            c0082e.m30243c(this.f774e0, this.f788y);
        } else {
            actionMenuPresenter.mo17562i(this.f788y, null);
            this.f774e0.mo17562i(this.f788y, null);
            actionMenuPresenter.mo25024c(true);
            this.f774e0.mo25024c(true);
        }
        this.f779p.setPopupTheme(this.f789z);
        this.f779p.setPresenter(actionMenuPresenter);
        this.f773d0 = actionMenuPresenter;
    }

    /* renamed from: L */
    public void m29977L(InterfaceC0091i.InterfaceC0092a interfaceC0092a, C0082e.InterfaceC0083a interfaceC0083a) {
        this.f775f0 = interfaceC0092a;
        this.f776g0 = interfaceC0083a;
        ActionMenuView actionMenuView = this.f779p;
        if (actionMenuView != null) {
            actionMenuView.m30099O(interfaceC0092a, interfaceC0083a);
        }
    }

    /* renamed from: M */
    public void m29976M(Context context, int i) {
        this.f748B = i;
        TextView textView = this.f781r;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public void m29975N(Context context, int i) {
        this.f747A = i;
        TextView textView = this.f780q;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: O */
    public final boolean m29974O() {
        if (this.f777h0) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (m29973P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final boolean m29973P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: Q */
    public boolean m29972Q() {
        ActionMenuView actionMenuView = this.f779p;
        return actionMenuView != null && actionMenuView.m30098P();
    }

    /* renamed from: a */
    public void m29971a() {
        for (int size = this.f766T.size() - 1; size >= 0; size--) {
            addView(this.f766T.get(size));
        }
        this.f766T.clear();
    }

    /* renamed from: b */
    public final void m29970b(List<View> list, int i) {
        boolean z = xs1.m4768E(this) == 1;
        int childCount = getChildCount();
        int m21894b = g80.m21894b(i, xs1.m4768E(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0159e c0159e = (C0159e) childAt.getLayoutParams();
                if (c0159e.f798b == 0 && m29973P(childAt) && m29956p(c0159e.f13119a) == m21894b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0159e c0159e2 = (C0159e) childAt2.getLayoutParams();
            if (c0159e2.f798b == 0 && m29973P(childAt2) && m29956p(c0159e2.f13119a) == m21894b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    public final void m29969c(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0159e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0159e) layoutParams;
        generateDefaultLayoutParams.f798b = 1;
        if (!z || this.f787x == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f766T.add(view);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0159e);
    }

    /* renamed from: d */
    public boolean m29968d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f779p) != null && actionMenuView.m30103K();
    }

    /* renamed from: e */
    public void m29967e() {
        C0158d c0158d = this.f774e0;
        C0086g c0086g = c0158d == null ? null : c0158d.f796q;
        if (c0086g != null) {
            c0086g.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m29966f() {
        ActionMenuView actionMenuView = this.f779p;
        if (actionMenuView != null) {
            actionMenuView.m30112B();
        }
    }

    /* renamed from: g */
    public void m29965g() {
        if (this.f786w == null) {
            C1499h4 c1499h4 = new C1499h4(getContext(), null, x01.toolbarNavigationButtonStyle);
            this.f786w = c1499h4;
            c1499h4.setImageDrawable(this.f784u);
            this.f786w.setContentDescription(this.f785v);
            C0159e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13119a = 8388611 | (this.f749C & 112);
            generateDefaultLayoutParams.f798b = 2;
            this.f786w.setLayoutParams(generateDefaultLayoutParams);
            this.f786w.setOnClickListener(new View$OnClickListenerC0157c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f786w;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f786w;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        k61 k61Var = this.f755I;
        if (k61Var != null) {
            return k61Var.m18032a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f757K;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        k61 k61Var = this.f755I;
        if (k61Var != null) {
            return k61Var.m18031b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        k61 k61Var = this.f755I;
        if (k61Var != null) {
            return k61Var.m18030c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        k61 k61Var = this.f755I;
        if (k61Var != null) {
            return k61Var.m18029d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f756J;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0082e m30100N;
        ActionMenuView actionMenuView = this.f779p;
        return actionMenuView != null && (m30100N = actionMenuView.m30100N()) != null && m30100N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f757K, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return xs1.m4768E(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return xs1.m4768E(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f756J, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f783t;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f783t;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m29962j();
        return this.f779p.getMenu();
    }

    public View getNavButtonView() {
        return this.f782s;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f782s;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f782s;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f773d0;
    }

    public Drawable getOverflowIcon() {
        m29962j();
        return this.f779p.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f788y;
    }

    public int getPopupTheme() {
        return this.f789z;
    }

    public CharSequence getSubtitle() {
        return this.f760N;
    }

    public final TextView getSubtitleTextView() {
        return this.f781r;
    }

    public CharSequence getTitle() {
        return this.f759M;
    }

    public int getTitleMarginBottom() {
        return this.f754H;
    }

    public int getTitleMarginEnd() {
        return this.f752F;
    }

    public int getTitleMarginStart() {
        return this.f751E;
    }

    public int getTitleMarginTop() {
        return this.f753G;
    }

    public final TextView getTitleTextView() {
        return this.f780q;
    }

    public InterfaceC1745iq getWrapper() {
        if (this.f772c0 == null) {
            this.f772c0 = new C0171d(this, true);
        }
        return this.f772c0;
    }

    /* renamed from: h */
    public final void m29964h() {
        if (this.f755I == null) {
            this.f755I = new k61();
        }
    }

    /* renamed from: i */
    public final void m29963i() {
        if (this.f783t == null) {
            this.f783t = new C1782j4(getContext());
        }
    }

    /* renamed from: j */
    public final void m29962j() {
        m29961k();
        if (this.f779p.m30100N() == null) {
            C0082e c0082e = (C0082e) this.f779p.getMenu();
            if (this.f774e0 == null) {
                this.f774e0 = new C0158d();
            }
            this.f779p.setExpandedActionViewsExclusive(true);
            c0082e.m30243c(this.f774e0, this.f788y);
        }
    }

    /* renamed from: k */
    public final void m29961k() {
        if (this.f779p == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f779p = actionMenuView;
            actionMenuView.setPopupTheme(this.f789z);
            this.f779p.setOnMenuItemClickListener(this.f771b0);
            this.f779p.m30099O(this.f775f0, this.f776g0);
            C0159e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13119a = 8388613 | (this.f749C & 112);
            this.f779p.setLayoutParams(generateDefaultLayoutParams);
            m29969c(this.f779p, false);
        }
    }

    /* renamed from: l */
    public final void m29960l() {
        if (this.f782s == null) {
            this.f782s = new C1499h4(getContext(), null, x01.toolbarNavigationButtonStyle);
            C0159e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f13119a = 8388611 | (this.f749C & 112);
            this.f782s.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0159e generateDefaultLayoutParams() {
        return new C0159e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0159e generateLayoutParams(AttributeSet attributeSet) {
        return new C0159e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0159e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0159e ? new C0159e((C0159e) layoutParams) : layoutParams instanceof AbstractC1643i0.C1644a ? new C0159e((AbstractC1643i0.C1644a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0159e((ViewGroup.MarginLayoutParams) layoutParams) : new C0159e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f778i0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f764R = false;
        }
        if (!this.f764R) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f764R = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f764R = false;
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
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean m29973P;
        boolean m29973P2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int size2;
        int i21;
        int i22;
        int size3;
        boolean z2 = xs1.m4768E(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i23 = width - paddingRight;
        int[] iArr = this.f767U;
        iArr[1] = 0;
        iArr[0] = 0;
        int m4766F = xs1.m4766F(this);
        int min = m4766F >= 0 ? Math.min(m4766F, i4 - i2) : 0;
        if (m29973P(this.f782s)) {
            ImageButton imageButton = this.f782s;
            if (z2) {
                i6 = m29985D(imageButton, i23, iArr, min);
                i5 = paddingLeft;
                if (m29973P(this.f786w)) {
                    ImageButton imageButton2 = this.f786w;
                    if (z2) {
                        i6 = m29985D(imageButton2, i6, iArr, min);
                    } else {
                        i5 = m29986C(imageButton2, i5, iArr, min);
                    }
                }
                if (m29973P(this.f779p)) {
                    ActionMenuView actionMenuView = this.f779p;
                    if (z2) {
                        i5 = m29986C(actionMenuView, i5, iArr, min);
                    } else {
                        i6 = m29985D(actionMenuView, i6, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i23 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i23 - currentContentInsetRight);
                if (m29973P(this.f787x)) {
                    View view = this.f787x;
                    if (z2) {
                        min2 = m29985D(view, min2, iArr, min);
                    } else {
                        max = m29986C(view, max, iArr, min);
                    }
                }
                if (m29973P(this.f783t)) {
                    ImageView imageView = this.f783t;
                    if (z2) {
                        min2 = m29985D(imageView, min2, iArr, min);
                    } else {
                        max = m29986C(imageView, max, iArr, min);
                    }
                }
                m29973P = m29973P(this.f780q);
                m29973P2 = m29973P(this.f781r);
                if (m29973P) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    C0159e c0159e = (C0159e) this.f780q.getLayoutParams();
                    i7 = paddingRight;
                    i8 = ((ViewGroup.MarginLayoutParams) c0159e).topMargin + this.f780q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0159e).bottomMargin + 0;
                }
                if (m29973P2) {
                    i9 = width;
                } else {
                    C0159e c0159e2 = (C0159e) this.f781r.getLayoutParams();
                    i9 = width;
                    i8 += ((ViewGroup.MarginLayoutParams) c0159e2).topMargin + this.f781r.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0159e2).bottomMargin;
                }
                if (!m29973P || m29973P2) {
                    TextView textView = !m29973P ? this.f780q : this.f781r;
                    TextView textView2 = !m29973P2 ? this.f781r : this.f780q;
                    C0159e c0159e3 = (C0159e) textView.getLayoutParams();
                    C0159e c0159e4 = (C0159e) textView2.getLayoutParams();
                    boolean z3 = (!m29973P && this.f780q.getMeasuredWidth() > 0) || (m29973P2 && this.f781r.getMeasuredWidth() > 0);
                    i10 = this.f758L & 112;
                    i11 = paddingLeft;
                    if (i10 != 48) {
                        i12 = max;
                        i13 = min;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0159e3).topMargin + this.f753G;
                    } else if (i10 != 80) {
                        int i24 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        int i25 = ((ViewGroup.MarginLayoutParams) c0159e3).topMargin;
                        i13 = min;
                        int i26 = this.f753G;
                        i12 = max;
                        if (i24 < i25 + i26) {
                            i24 = i25 + i26;
                        } else {
                            int i27 = (((height - paddingBottom) - i8) - i24) - paddingTop2;
                            int i28 = ((ViewGroup.MarginLayoutParams) c0159e3).bottomMargin;
                            int i29 = this.f754H;
                            if (i27 < i28 + i29) {
                                i24 = Math.max(0, i24 - ((((ViewGroup.MarginLayoutParams) c0159e4).bottomMargin + i29) - i27));
                            }
                        }
                        paddingTop = paddingTop2 + i24;
                    } else {
                        i12 = max;
                        i13 = min;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0159e4).bottomMargin) - this.f754H) - i8;
                    }
                    if (z2) {
                        if (z3) {
                            i15 = this.f751E;
                            i14 = 0;
                        } else {
                            i14 = 0;
                            i15 = 0;
                        }
                        int i30 = i15 - iArr[i14];
                        max = i12 + Math.max(i14, i30);
                        iArr[i14] = Math.max(i14, -i30);
                        if (m29973P) {
                            int measuredWidth = this.f780q.getMeasuredWidth() + max;
                            int measuredHeight = this.f780q.getMeasuredHeight() + paddingTop;
                            this.f780q.layout(max, paddingTop, measuredWidth, measuredHeight);
                            i16 = measuredWidth + this.f752F;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((C0159e) this.f780q.getLayoutParams())).bottomMargin;
                        } else {
                            i16 = max;
                        }
                        if (m29973P2) {
                            int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0159e) this.f781r.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f781r.getMeasuredWidth() + max;
                            this.f781r.layout(max, i31, measuredWidth2, this.f781r.getMeasuredHeight() + i31);
                            i17 = measuredWidth2 + this.f752F;
                        } else {
                            i17 = max;
                        }
                        if (z3) {
                            max = Math.max(i16, i17);
                        }
                        m29970b(this.f765S, 3);
                        size = this.f765S.size();
                        for (i20 = 0; i20 < size; i20++) {
                            max = m29986C(this.f765S.get(i20), max, iArr, i13);
                        }
                        int i32 = i13;
                        m29970b(this.f765S, 5);
                        size2 = this.f765S.size();
                        for (i21 = 0; i21 < size2; i21++) {
                            min2 = m29985D(this.f765S.get(i21), min2, iArr, i32);
                        }
                        m29970b(this.f765S, 1);
                        int m29951u = m29951u(this.f765S, iArr);
                        i22 = (i11 + (((i9 - i11) - i7) / 2)) - (m29951u / 2);
                        int i33 = m29951u + i22;
                        if (i22 >= max) {
                            max = i33 > min2 ? i22 - (i33 - min2) : i22;
                        }
                        size3 = this.f765S.size();
                        while (i14 < size3) {
                            max = m29986C(this.f765S.get(i14), max, iArr, i32);
                            i14++;
                        }
                        this.f765S.clear();
                        return;
                    }
                    int i34 = (z3 ? this.f751E : 0) - iArr[1];
                    min2 -= Math.max(0, i34);
                    iArr[1] = Math.max(0, -i34);
                    if (m29973P) {
                        int measuredWidth3 = min2 - this.f780q.getMeasuredWidth();
                        int measuredHeight2 = this.f780q.getMeasuredHeight() + paddingTop;
                        this.f780q.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                        i18 = measuredWidth3 - this.f752F;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((C0159e) this.f780q.getLayoutParams())).bottomMargin;
                    } else {
                        i18 = min2;
                    }
                    if (m29973P2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0159e) this.f781r.getLayoutParams())).topMargin;
                        this.f781r.layout(min2 - this.f781r.getMeasuredWidth(), i35, min2, this.f781r.getMeasuredHeight() + i35);
                        i19 = min2 - this.f752F;
                    } else {
                        i19 = min2;
                    }
                    if (z3) {
                        min2 = Math.min(i18, i19);
                    }
                    max = i12;
                } else {
                    i11 = paddingLeft;
                    i13 = min;
                }
                i14 = 0;
                m29970b(this.f765S, 3);
                size = this.f765S.size();
                while (i20 < size) {
                }
                int i322 = i13;
                m29970b(this.f765S, 5);
                size2 = this.f765S.size();
                while (i21 < size2) {
                }
                m29970b(this.f765S, 1);
                int m29951u2 = m29951u(this.f765S, iArr);
                i22 = (i11 + (((i9 - i11) - i7) / 2)) - (m29951u2 / 2);
                int i332 = m29951u2 + i22;
                if (i22 >= max) {
                }
                size3 = this.f765S.size();
                while (i14 < size3) {
                }
                this.f765S.clear();
                return;
            }
            i5 = m29986C(imageButton, paddingLeft, iArr, min);
        } else {
            i5 = paddingLeft;
        }
        i6 = i23;
        if (m29973P(this.f786w)) {
        }
        if (m29973P(this.f779p)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i23 - i6));
        int max2 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i23 - currentContentInsetRight2);
        if (m29973P(this.f787x)) {
        }
        if (m29973P(this.f783t)) {
        }
        m29973P = m29973P(this.f780q);
        m29973P2 = m29973P(this.f781r);
        if (m29973P) {
        }
        if (m29973P2) {
        }
        if (m29973P) {
        }
        if (!m29973P) {
        }
        if (!m29973P2) {
        }
        C0159e c0159e32 = (C0159e) textView.getLayoutParams();
        C0159e c0159e42 = (C0159e) textView2.getLayoutParams();
        if (m29973P) {
        }
        i10 = this.f758L & 112;
        i11 = paddingLeft;
        if (i10 != 48) {
        }
        if (z2) {
        }
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
        int[] iArr = this.f767U;
        boolean m20417b = hu1.m20417b(this);
        int i10 = !m20417b ? 1 : 0;
        if (m29973P(this.f782s)) {
            m29983F(this.f782s, i, 0, i2, 0, this.f750D);
            i3 = this.f782s.getMeasuredWidth() + m29953s(this.f782s);
            i4 = Math.max(0, this.f782s.getMeasuredHeight() + m29952t(this.f782s));
            i5 = View.combineMeasuredStates(0, this.f782s.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m29973P(this.f786w)) {
            m29983F(this.f786w, i, 0, i2, 0, this.f750D);
            i3 = this.f786w.getMeasuredWidth() + m29953s(this.f786w);
            i4 = Math.max(i4, this.f786w.getMeasuredHeight() + m29952t(this.f786w));
            i5 = View.combineMeasuredStates(i5, this.f786w.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[m20417b ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (m29973P(this.f779p)) {
            m29983F(this.f779p, i, max, i2, 0, this.f750D);
            i6 = this.f779p.getMeasuredWidth() + m29953s(this.f779p);
            i4 = Math.max(i4, this.f779p.getMeasuredHeight() + m29952t(this.f779p));
            i5 = View.combineMeasuredStates(i5, this.f779p.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (m29973P(this.f787x)) {
            max2 += m29984E(this.f787x, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f787x.getMeasuredHeight() + m29952t(this.f787x));
            i5 = View.combineMeasuredStates(i5, this.f787x.getMeasuredState());
        }
        if (m29973P(this.f783t)) {
            max2 += m29984E(this.f783t, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f783t.getMeasuredHeight() + m29952t(this.f783t));
            i5 = View.combineMeasuredStates(i5, this.f783t.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((C0159e) childAt.getLayoutParams()).f798b == 0 && m29973P(childAt)) {
                max2 += m29984E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m29952t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i12 = this.f753G + this.f754H;
        int i13 = this.f751E + this.f752F;
        if (m29973P(this.f780q)) {
            m29984E(this.f780q, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f780q.getMeasuredWidth() + m29953s(this.f780q);
            i9 = this.f780q.getMeasuredHeight() + m29952t(this.f780q);
            i7 = View.combineMeasuredStates(i5, this.f780q.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m29973P(this.f781r)) {
            i8 = Math.max(i8, m29984E(this.f781r, i, max2 + i13, i2, i9 + i12, iArr));
            i9 += this.f781r.getMeasuredHeight() + m29952t(this.f781r);
            i7 = View.combineMeasuredStates(i7, this.f781r.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max2 + i8 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), m29974O() ? 0 : View.resolveSizeAndState(Math.max(max3 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        ActionMenuView actionMenuView = this.f779p;
        C0082e m30100N = actionMenuView != null ? actionMenuView.m30100N() : null;
        int i = savedState.f790r;
        if (i != 0 && this.f774e0 != null && m30100N != null && (findItem = m30100N.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f791s) {
            m29981H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m29964h();
        this.f755I.m18027f(i == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0086g c0086g;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0158d c0158d = this.f774e0;
        if (c0158d != null && (c0086g = c0158d.f796q) != null) {
            savedState.f790r = c0086g.getItemId();
        }
        savedState.f791s = m29987B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f763Q = false;
        }
        if (!this.f763Q) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f763Q = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f763Q = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m29956p(int i) {
        int m4768E = xs1.m4768E(this);
        int m21894b = g80.m21894b(i, m4768E) & 7;
        return (m21894b == 1 || m21894b == 3 || m21894b == 5) ? m21894b : m4768E == 1 ? 5 : 3;
    }

    /* renamed from: q */
    public final int m29955q(View view, int i) {
        C0159e c0159e = (C0159e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int m29954r = m29954r(c0159e.f13119a);
        if (m29954r != 48) {
            if (m29954r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c0159e).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c0159e).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0159e).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: r */
    public final int m29954r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f758L & 112;
    }

    /* renamed from: s */
    public final int m29953s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return cn0.m25226b(marginLayoutParams) + cn0.m25227a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m29965g();
        }
        ImageButton imageButton = this.f786w;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C2818r4.m11783b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m29965g();
            this.f786w.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f786w;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f784u);
        }
    }

    public void setCollapsible(boolean z) {
        this.f777h0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f757K) {
            this.f757K = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f756J) {
            this.f756J = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C2818r4.m11783b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m29963i();
            if (!m29946z(this.f783t)) {
                m29969c(this.f783t, true);
            }
        } else {
            ImageView imageView = this.f783t;
            if (imageView != null && m29946z(imageView)) {
                removeView(this.f783t);
                this.f766T.remove(this.f783t);
            }
        }
        ImageView imageView2 = this.f783t;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m29963i();
        }
        ImageView imageView = this.f783t;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m29960l();
        }
        ImageButton imageButton = this.f782s;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            em1.m23375a(this.f782s, charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C2818r4.m11783b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m29960l();
            if (!m29946z(this.f782s)) {
                m29969c(this.f782s, true);
            }
        } else {
            ImageButton imageButton = this.f782s;
            if (imageButton != null && m29946z(imageButton)) {
                removeView(this.f782s);
                this.f766T.remove(this.f782s);
            }
        }
        ImageButton imageButton2 = this.f782s;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m29960l();
        this.f782s.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0160f interfaceC0160f) {
        this.f770a0 = interfaceC0160f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m29962j();
        this.f779p.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f789z != i) {
            this.f789z = i;
            if (i == 0) {
                this.f788y = getContext();
            } else {
                this.f788y = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f781r;
            if (textView != null && m29946z(textView)) {
                removeView(this.f781r);
                this.f766T.remove(this.f781r);
            }
        } else {
            if (this.f781r == null) {
                Context context = getContext();
                C3397w4 c3397w4 = new C3397w4(context);
                this.f781r = c3397w4;
                c3397w4.setSingleLine();
                this.f781r.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f748B;
                if (i != 0) {
                    this.f781r.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f762P;
                if (colorStateList != null) {
                    this.f781r.setTextColor(colorStateList);
                }
            }
            if (!m29946z(this.f781r)) {
                m29969c(this.f781r, true);
            }
        }
        TextView textView2 = this.f781r;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f760N = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f762P = colorStateList;
        TextView textView = this.f781r;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f780q;
            if (textView != null && m29946z(textView)) {
                removeView(this.f780q);
                this.f766T.remove(this.f780q);
            }
        } else {
            if (this.f780q == null) {
                Context context = getContext();
                C3397w4 c3397w4 = new C3397w4(context);
                this.f780q = c3397w4;
                c3397w4.setSingleLine();
                this.f780q.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f747A;
                if (i != 0) {
                    this.f780q.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f761O;
                if (colorStateList != null) {
                    this.f780q.setTextColor(colorStateList);
                }
            }
            if (!m29946z(this.f780q)) {
                m29969c(this.f780q, true);
            }
        }
        TextView textView2 = this.f780q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f759M = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f754H = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f752F = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f751E = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f753G = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f761O = colorStateList;
        TextView textView = this.f780q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final int m29952t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    public final int m29951u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0159e c0159e = (C0159e) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0159e).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0159e).rightMargin - i2;
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

    /* renamed from: v */
    public boolean m29950v() {
        C0158d c0158d = this.f774e0;
        return (c0158d == null || c0158d.f796q == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m29949w() {
        ActionMenuView actionMenuView = this.f779p;
        return actionMenuView != null && actionMenuView.m30106H();
    }

    /* renamed from: x */
    public void m29948x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void m29947y() {
        Iterator<MenuItem> it = this.f769W.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m29982G();
    }

    /* renamed from: z */
    public final boolean m29946z(View view) {
        return view.getParent() == this || this.f766T.contains(view);
    }
}
