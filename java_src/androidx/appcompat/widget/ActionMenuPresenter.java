package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC0072a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0082e;
import androidx.appcompat.view.menu.C0086g;
import androidx.appcompat.view.menu.C0088h;
import androidx.appcompat.view.menu.InterfaceC0091i;
import androidx.appcompat.view.menu.InterfaceC0093j;
import androidx.appcompat.view.menu.SubMenuC0098l;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.AbstractC2388o0;
import com.daaw.C1782j4;
import com.daaw.C1893k0;
import com.daaw.C2366nu;
import com.daaw.c21;
import com.daaw.em1;
import com.daaw.l30;
import com.daaw.vc1;
import com.daaw.x01;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC0072a implements AbstractC2388o0.InterfaceC2389a {

    /* renamed from: A */
    public Drawable f524A;

    /* renamed from: B */
    public boolean f525B;

    /* renamed from: C */
    public boolean f526C;

    /* renamed from: D */
    public boolean f527D;

    /* renamed from: E */
    public int f528E;

    /* renamed from: F */
    public int f529F;

    /* renamed from: G */
    public int f530G;

    /* renamed from: H */
    public boolean f531H;

    /* renamed from: I */
    public boolean f532I;

    /* renamed from: J */
    public boolean f533J;

    /* renamed from: K */
    public boolean f534K;

    /* renamed from: L */
    public int f535L;

    /* renamed from: M */
    public final SparseBooleanArray f536M;

    /* renamed from: N */
    public C0112e f537N;

    /* renamed from: O */
    public C0107a f538O;

    /* renamed from: P */
    public RunnableC0109c f539P;

    /* renamed from: Q */
    public C0108b f540Q;

    /* renamed from: R */
    public final C0113f f541R;

    /* renamed from: S */
    public int f542S;

    /* renamed from: z */
    public C0110d f543z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0106a();

        /* renamed from: p */
        public int f544p;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        /* loaded from: classes.dex */
        public class C0106a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f544p = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f544p);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C0107a extends C0088h {
        public C0107a(Context context, SubMenuC0098l subMenuC0098l, View view) {
            super(context, subMenuC0098l, view, false, x01.actionOverflowMenuStyle);
            if (!((C0086g) subMenuC0098l.getItem()).m30204l()) {
                View view2 = ActionMenuPresenter.this.f543z;
                m30185f(view2 == null ? (View) ActionMenuPresenter.this.f307x : view2);
            }
            m30181j(ActionMenuPresenter.this.f541R);
        }

        @Override // androidx.appcompat.view.menu.C0088h
        /* renamed from: e */
        public void mo30113e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f538O = null;
            actionMenuPresenter.f542S = 0;
            super.mo30113e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    /* loaded from: classes.dex */
    public class C0108b extends ActionMenuItemView.AbstractC0071b {
        public C0108b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0071b
        /* renamed from: a */
        public vc1 mo30114a() {
            C0107a c0107a = ActionMenuPresenter.this.f538O;
            if (c0107a != null) {
                return c0107a.m30187c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    /* loaded from: classes.dex */
    public class RunnableC0109c implements Runnable {

        /* renamed from: p */
        public C0112e f547p;

        public RunnableC0109c(C0112e c0112e) {
            this.f547p = c0112e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f301r != null) {
                ActionMenuPresenter.this.f301r.m30241d();
            }
            View view = (View) ActionMenuPresenter.this.f307x;
            if (view != null && view.getWindowToken() != null && this.f547p.m30178m()) {
                ActionMenuPresenter.this.f537N = this.f547p;
            }
            ActionMenuPresenter.this.f539P = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    /* loaded from: classes.dex */
    public class C0110d extends C1782j4 implements ActionMenuView.InterfaceC0114a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        /* loaded from: classes.dex */
        public class C0111a extends l30 {

            /* renamed from: y */
            public final /* synthetic */ ActionMenuPresenter f550y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0111a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f550y = actionMenuPresenter;
            }

            @Override // com.daaw.l30
            /* renamed from: b */
            public vc1 mo17188b() {
                C0112e c0112e = ActionMenuPresenter.this.f537N;
                if (c0112e == null) {
                    return null;
                }
                return c0112e.m30187c();
            }

            @Override // com.daaw.l30
            /* renamed from: c */
            public boolean mo17187c() {
                ActionMenuPresenter.this.m30129M();
                return true;
            }

            @Override // com.daaw.l30
            /* renamed from: d */
            public boolean mo17186d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f539P != null) {
                    return false;
                }
                actionMenuPresenter.m30138D();
                return true;
            }
        }

        public C0110d(Context context) {
            super(context, null, x01.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            em1.m23375a(this, getContentDescription());
            setOnTouchListener(new C0111a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0114a
        /* renamed from: a */
        public boolean mo30096a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0114a
        /* renamed from: b */
        public boolean mo30095b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m30129M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C2366nu.m14815l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    /* loaded from: classes.dex */
    public class C0112e extends C0088h {
        public C0112e(Context context, C0082e c0082e, View view, boolean z) {
            super(context, c0082e, view, z, x01.actionOverflowMenuStyle);
            m30183h(8388613);
            m30181j(ActionMenuPresenter.this.f541R);
        }

        @Override // androidx.appcompat.view.menu.C0088h
        /* renamed from: e */
        public void mo30113e() {
            if (ActionMenuPresenter.this.f301r != null) {
                ActionMenuPresenter.this.f301r.close();
            }
            ActionMenuPresenter.this.f537N = null;
            super.mo30113e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    /* loaded from: classes.dex */
    public class C0113f implements InterfaceC0091i.InterfaceC0092a {
        public C0113f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: b */
        public void mo24218b(C0082e c0082e, boolean z) {
            if (c0082e instanceof SubMenuC0098l) {
                c0082e.mo30173F().m30239e(false);
            }
            InterfaceC0091i.InterfaceC0092a m30287o = ActionMenuPresenter.this.m30287o();
            if (m30287o != null) {
                m30287o.mo24218b(c0082e, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
        /* renamed from: c */
        public boolean mo24217c(C0082e c0082e) {
            if (c0082e == ActionMenuPresenter.this.f301r) {
                return false;
            }
            ActionMenuPresenter.this.f542S = ((SubMenuC0098l) c0082e).getItem().getItemId();
            InterfaceC0091i.InterfaceC0092a m30287o = ActionMenuPresenter.this.m30287o();
            if (m30287o != null) {
                return m30287o.mo24217c(c0082e);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, c21.abc_action_menu_layout, c21.abc_action_menu_item_layout);
        this.f536M = new SparseBooleanArray();
        this.f541R = new C0113f();
    }

    /* renamed from: A */
    public boolean m30141A() {
        return m30138D() | m30137E();
    }

    /* renamed from: B */
    public final View m30140B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f307x;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0093j.InterfaceC0094a) && ((InterfaceC0093j.InterfaceC0094a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: C */
    public Drawable m30139C() {
        C0110d c0110d = this.f543z;
        if (c0110d != null) {
            return c0110d.getDrawable();
        }
        if (this.f525B) {
            return this.f524A;
        }
        return null;
    }

    /* renamed from: D */
    public boolean m30138D() {
        InterfaceC0093j interfaceC0093j;
        RunnableC0109c runnableC0109c = this.f539P;
        if (runnableC0109c != null && (interfaceC0093j = this.f307x) != null) {
            ((View) interfaceC0093j).removeCallbacks(runnableC0109c);
            this.f539P = null;
            return true;
        }
        C0112e c0112e = this.f537N;
        if (c0112e != null) {
            c0112e.m30188b();
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m30137E() {
        C0107a c0107a = this.f538O;
        if (c0107a != null) {
            c0107a.m30188b();
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m30136F() {
        return this.f539P != null || m30135G();
    }

    /* renamed from: G */
    public boolean m30135G() {
        C0112e c0112e = this.f537N;
        return c0112e != null && c0112e.m30186d();
    }

    /* renamed from: H */
    public void m30134H(Configuration configuration) {
        if (!this.f531H) {
            this.f530G = C1893k0.m18112b(this.f300q).m18110d();
        }
        C0082e c0082e = this.f301r;
        if (c0082e != null) {
            c0082e.mo24014M(true);
        }
    }

    /* renamed from: I */
    public void m30133I(boolean z) {
        this.f534K = z;
    }

    /* renamed from: J */
    public void m30132J(ActionMenuView actionMenuView) {
        this.f307x = actionMenuView;
        actionMenuView.mo347b(this.f301r);
    }

    /* renamed from: K */
    public void m30131K(Drawable drawable) {
        C0110d c0110d = this.f543z;
        if (c0110d != null) {
            c0110d.setImageDrawable(drawable);
            return;
        }
        this.f525B = true;
        this.f524A = drawable;
    }

    /* renamed from: L */
    public void m30130L(boolean z) {
        this.f526C = z;
        this.f527D = true;
    }

    /* renamed from: M */
    public boolean m30129M() {
        C0082e c0082e;
        if (!this.f526C || m30135G() || (c0082e = this.f301r) == null || this.f307x == null || this.f539P != null || c0082e.m30266B().isEmpty()) {
            return false;
        }
        RunnableC0109c runnableC0109c = new RunnableC0109c(new C0112e(this.f300q, this.f301r, this.f543z, true));
        this.f539P = runnableC0109c;
        ((View) this.f307x).post(runnableC0109c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a, androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: b */
    public void mo25025b(C0082e c0082e, boolean z) {
        m30141A();
        super.mo25025b(c0082e, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a, androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: c */
    public void mo25024c(boolean z) {
        super.mo25024c(z);
        ((View) this.f307x).requestLayout();
        C0082e c0082e = this.f301r;
        boolean z2 = false;
        if (c0082e != null) {
            ArrayList<C0086g> m30222u = c0082e.m30222u();
            int size = m30222u.size();
            for (int i = 0; i < size; i++) {
                AbstractC2388o0 mo16345a = m30222u.get(i).mo16345a();
                if (mo16345a != null) {
                    mo16345a.m14663i(this);
                }
            }
        }
        C0082e c0082e2 = this.f301r;
        ArrayList<C0086g> m30266B = c0082e2 != null ? c0082e2.m30266B() : null;
        if (this.f526C && m30266B != null) {
            int size2 = m30266B.size();
            if (size2 == 1) {
                z2 = !m30266B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        C0110d c0110d = this.f543z;
        if (z2) {
            if (c0110d == null) {
                this.f543z = new C0110d(this.f299p);
            }
            ViewGroup viewGroup = (ViewGroup) this.f543z.getParent();
            if (viewGroup != this.f307x) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f543z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f307x;
                actionMenuView.addView(this.f543z, actionMenuView.m30108F());
            }
        } else if (c0110d != null) {
            ViewParent parent = c0110d.getParent();
            InterfaceC0093j interfaceC0093j = this.f307x;
            if (parent == interfaceC0093j) {
                ((ViewGroup) interfaceC0093j).removeView(this.f543z);
            }
        }
        ((ActionMenuView) this.f307x).setOverflowReserved(this.f526C);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: d */
    public boolean mo25023d() {
        ArrayList<C0086g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0082e c0082e = actionMenuPresenter.f301r;
        View view = null;
        int i5 = 0;
        if (c0082e != null) {
            arrayList = c0082e.m30262G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f530G;
        int i7 = actionMenuPresenter.f529F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f307x;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            C0086g c0086g = arrayList.get(i10);
            if (c0086g.m30201o()) {
                i8++;
            } else if (c0086g.m30202n()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f534K && c0086g.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.f526C && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f536M;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f532I) {
            int i12 = actionMenuPresenter.f535L;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            C0086g c0086g2 = arrayList.get(i13);
            if (c0086g2.m30201o()) {
                View mo30126p = actionMenuPresenter.mo30126p(c0086g2, view, viewGroup);
                if (actionMenuPresenter.f532I) {
                    i3 -= ActionMenuView.m30102L(mo30126p, i2, i3, makeMeasureSpec, i5);
                } else {
                    mo30126p.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo30126p.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = c0086g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0086g2.m30195u(true);
                i4 = i;
            } else if (c0086g2.m30202n()) {
                int groupId2 = c0086g2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.f532I || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View mo30126p2 = actionMenuPresenter.mo30126p(c0086g2, null, viewGroup);
                    if (actionMenuPresenter.f532I) {
                        int m30102L = ActionMenuView.m30102L(mo30126p2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m30102L;
                        if (m30102L == 0) {
                            z4 = false;
                        }
                    } else {
                        mo30126p2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = mo30126p2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.f532I ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        C0086g c0086g3 = arrayList.get(i15);
                        if (c0086g3.getGroupId() == groupId2) {
                            if (c0086g3.m30204l()) {
                                i11++;
                            }
                            c0086g3.m30195u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                c0086g2.m30195u(z3);
            } else {
                i4 = i;
                c0086g2.m30195u(false);
                i13++;
                view = null;
                actionMenuPresenter = this;
                i = i4;
                i5 = 0;
            }
            i13++;
            view = null;
            actionMenuPresenter = this;
            i = i4;
            i5 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a
    /* renamed from: h */
    public void mo30128h(C0086g c0086g, InterfaceC0093j.InterfaceC0094a interfaceC0094a) {
        interfaceC0094a.mo348e(c0086g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0094a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f307x);
        if (this.f540Q == null) {
            this.f540Q = new C0108b();
        }
        actionMenuItemView.setPopupCallback(this.f540Q);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a, androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: i */
    public void mo17562i(Context context, C0082e c0082e) {
        super.mo17562i(context, c0082e);
        Resources resources = context.getResources();
        C1893k0 m18112b = C1893k0.m18112b(context);
        if (!this.f527D) {
            this.f526C = m18112b.m18106h();
        }
        if (!this.f533J) {
            this.f528E = m18112b.m18111c();
        }
        if (!this.f531H) {
            this.f530G = m18112b.m18110d();
        }
        int i = this.f528E;
        if (this.f526C) {
            if (this.f543z == null) {
                C0110d c0110d = new C0110d(this.f299p);
                this.f543z = c0110d;
                if (this.f525B) {
                    c0110d.setImageDrawable(this.f524A);
                    this.f524A = null;
                    this.f525B = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f543z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f543z.getMeasuredWidth();
        } else {
            this.f543z = null;
        }
        this.f529F = i;
        this.f535L = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: j */
    public void mo25021j(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f544p) > 0 && (findItem = this.f301r.findItem(i)) != null) {
            mo25019l((SubMenuC0098l) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a, androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: l */
    public boolean mo25019l(SubMenuC0098l subMenuC0098l) {
        boolean z = false;
        if (subMenuC0098l.hasVisibleItems()) {
            SubMenuC0098l subMenuC0098l2 = subMenuC0098l;
            while (subMenuC0098l2.m30166i0() != this.f301r) {
                subMenuC0098l2 = (SubMenuC0098l) subMenuC0098l2.m30166i0();
            }
            View m30140B = m30140B(subMenuC0098l2.getItem());
            if (m30140B == null) {
                return false;
            }
            this.f542S = subMenuC0098l.getItem().getItemId();
            int size = subMenuC0098l.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = subMenuC0098l.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            C0107a c0107a = new C0107a(this.f300q, subMenuC0098l, m30140B);
            this.f538O = c0107a;
            c0107a.m30184g(z);
            this.f538O.m30180k();
            super.mo25019l(subMenuC0098l);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i
    /* renamed from: m */
    public Parcelable mo25018m() {
        SavedState savedState = new SavedState();
        savedState.f544p = this.f542S;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a
    /* renamed from: n */
    public boolean mo30127n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f543z) {
            return false;
        }
        return super.mo30127n(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a
    /* renamed from: p */
    public View mo30126p(C0086g c0086g, View view, ViewGroup viewGroup) {
        View actionView = c0086g.getActionView();
        if (actionView == null || c0086g.m30206j()) {
            actionView = super.mo30126p(c0086g, view, viewGroup);
        }
        actionView.setVisibility(c0086g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo29930o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a
    /* renamed from: q */
    public InterfaceC0093j mo30125q(ViewGroup viewGroup) {
        InterfaceC0093j interfaceC0093j = this.f307x;
        InterfaceC0093j mo30125q = super.mo30125q(viewGroup);
        if (interfaceC0093j != mo30125q) {
            ((ActionMenuView) mo30125q).setPresenter(this);
        }
        return mo30125q;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0072a
    /* renamed from: s */
    public boolean mo30124s(int i, C0086g c0086g) {
        return c0086g.m30204l();
    }
}
