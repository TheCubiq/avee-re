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
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.daaw.c21;
import com.daaw.em1;
import com.daaw.j4;
import com.daaw.k0;
import com.daaw.l30;
import com.daaw.nu;
import com.daaw.o0;
import com.daaw.vc1;
import com.daaw.x01;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements o0.a {
    public Drawable A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public final SparseBooleanArray M;
    public e N;
    public a O;
    public c P;
    public b Q;
    public final f R;
    public int S;
    public d z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int p;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<SavedState> {
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
            this.p = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.p);
        }
    }

    /* loaded from: classes.dex */
    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, x01.actionOverflowMenuStyle);
            if (!((g) lVar.getItem()).l()) {
                View view2 = ActionMenuPresenter.this.z;
                f(view2 == null ? (View) ActionMenuPresenter.this.x : view2);
            }
            j(ActionMenuPresenter.this.R);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.O = null;
            actionMenuPresenter.S = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public vc1 a() {
            a aVar = ActionMenuPresenter.this.O;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public e p;

        public c(e eVar) {
            this.p = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.r != null) {
                ActionMenuPresenter.this.r.d();
            }
            View view = (View) ActionMenuPresenter.this.x;
            if (view != null && view.getWindowToken() != null && this.p.m()) {
                ActionMenuPresenter.this.N = this.p;
            }
            ActionMenuPresenter.this.P = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends j4 implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends l30 {
            public final /* synthetic */ ActionMenuPresenter y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.y = actionMenuPresenter;
            }

            @Override // com.daaw.l30
            public vc1 b() {
                e eVar = ActionMenuPresenter.this.N;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // com.daaw.l30
            public boolean c() {
                ActionMenuPresenter.this.M();
                return true;
            }

            @Override // com.daaw.l30
            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.P != null) {
                    return false;
                }
                actionMenuPresenter.D();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, x01.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            em1.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.M();
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
                nu.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z) {
            super(context, eVar, view, z, x01.actionOverflowMenuStyle);
            h(8388613);
            j(ActionMenuPresenter.this.R);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (ActionMenuPresenter.this.r != null) {
                ActionMenuPresenter.this.r.close();
            }
            ActionMenuPresenter.this.N = null;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
            if (eVar instanceof l) {
                eVar.F().e(false);
            }
            i.a o = ActionMenuPresenter.this.o();
            if (o != null) {
                o.b(eVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.r) {
                return false;
            }
            ActionMenuPresenter.this.S = ((l) eVar).getItem().getItemId();
            i.a o = ActionMenuPresenter.this.o();
            if (o != null) {
                return o.c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, c21.abc_action_menu_layout, c21.abc_action_menu_item_layout);
        this.M = new SparseBooleanArray();
        this.R = new f();
    }

    public boolean A() {
        return D() | E();
    }

    public final View B(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.x;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable C() {
        d dVar = this.z;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.B) {
            return this.A;
        }
        return null;
    }

    public boolean D() {
        j jVar;
        c cVar = this.P;
        if (cVar != null && (jVar = this.x) != null) {
            ((View) jVar).removeCallbacks(cVar);
            this.P = null;
            return true;
        }
        e eVar = this.N;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean E() {
        a aVar = this.O;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean F() {
        return this.P != null || G();
    }

    public boolean G() {
        e eVar = this.N;
        return eVar != null && eVar.d();
    }

    public void H(Configuration configuration) {
        if (!this.H) {
            this.G = k0.b(this.q).d();
        }
        androidx.appcompat.view.menu.e eVar = this.r;
        if (eVar != null) {
            eVar.M(true);
        }
    }

    public void I(boolean z) {
        this.K = z;
    }

    public void J(ActionMenuView actionMenuView) {
        this.x = actionMenuView;
        actionMenuView.b(this.r);
    }

    public void K(Drawable drawable) {
        d dVar = this.z;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.B = true;
        this.A = drawable;
    }

    public void L(boolean z) {
        this.C = z;
        this.D = true;
    }

    public boolean M() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.C || G() || (eVar = this.r) == null || this.x == null || this.P != null || eVar.B().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.q, this.r, this.z, true));
        this.P = cVar;
        ((View) this.x).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z) {
        A();
        super.b(eVar, z);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void c(boolean z) {
        super.c(z);
        ((View) this.x).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.r;
        boolean z2 = false;
        if (eVar != null) {
            ArrayList<g> u = eVar.u();
            int size = u.size();
            for (int i = 0; i < size; i++) {
                o0 a2 = u.get(i).a();
                if (a2 != null) {
                    a2.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.r;
        ArrayList<g> B = eVar2 != null ? eVar2.B() : null;
        if (this.C && B != null) {
            int size2 = B.size();
            if (size2 == 1) {
                z2 = !B.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        d dVar = this.z;
        if (z2) {
            if (dVar == null) {
                this.z = new d(this.p);
            }
            ViewGroup viewGroup = (ViewGroup) this.z.getParent();
            if (viewGroup != this.x) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.z);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.x;
                actionMenuView.addView(this.z, actionMenuView.F());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            j jVar = this.x;
            if (parent == jVar) {
                ((ViewGroup) jVar).removeView(this.z);
            }
        }
        ((ActionMenuView) this.x).setOverflowReserved(this.C);
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean d() {
        ArrayList<g> arrayList;
        int i;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.r;
        View view = null;
        int i5 = 0;
        if (eVar != null) {
            arrayList = eVar.G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.G;
        int i7 = actionMenuPresenter.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.x;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            g gVar = arrayList.get(i10);
            if (gVar.o()) {
                i8++;
            } else if (gVar.n()) {
                i9++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.K && gVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (actionMenuPresenter.C && (z || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.M;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.I) {
            int i12 = actionMenuPresenter.L;
            i3 = i7 / i12;
            i2 = i12 + ((i7 % i12) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < i) {
            g gVar2 = arrayList.get(i13);
            if (gVar2.o()) {
                View p = actionMenuPresenter.p(gVar2, view, viewGroup);
                if (actionMenuPresenter.I) {
                    i3 -= ActionMenuView.L(p, i2, i3, makeMeasureSpec, i5);
                } else {
                    p.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = p.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                i4 = i;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i11 > 0 || z2) && i7 > 0 && (!actionMenuPresenter.I || i3 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View p2 = actionMenuPresenter.p(gVar2, null, viewGroup);
                    if (actionMenuPresenter.I) {
                        int L = ActionMenuView.L(p2, i2, i3, makeMeasureSpec, 0);
                        i3 -= L;
                        if (L == 0) {
                            z4 = false;
                        }
                    } else {
                        p2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z5 = z4;
                    int measuredWidth2 = p2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z3 = z5 & (!actionMenuPresenter.I ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        g gVar3 = arrayList.get(i15);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i11++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z3) {
                    i11--;
                }
                gVar2.u(z3);
            } else {
                i4 = i;
                gVar2.u(false);
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

    @Override // androidx.appcompat.view.menu.a
    public void h(g gVar, j.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.x);
        if (this.Q == null) {
            this.Q = new b();
        }
        actionMenuItemView.setPopupCallback(this.Q);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        k0 b2 = k0.b(context);
        if (!this.D) {
            this.C = b2.h();
        }
        if (!this.J) {
            this.E = b2.c();
        }
        if (!this.H) {
            this.G = b2.d();
        }
        int i = this.E;
        if (this.C) {
            if (this.z == null) {
                d dVar = new d(this.p);
                this.z = dVar;
                if (this.B) {
                    dVar.setImageDrawable(this.A);
                    this.A = null;
                    this.B = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.z.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.z.getMeasuredWidth();
        } else {
            this.z = null;
        }
        this.F = i;
        this.L = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).p) > 0 && (findItem = this.r.findItem(i)) != null) {
            l((l) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean l(l lVar) {
        boolean z = false;
        if (lVar.hasVisibleItems()) {
            l lVar2 = lVar;
            while (lVar2.i0() != this.r) {
                lVar2 = (l) lVar2.i0();
            }
            View B = B(lVar2.getItem());
            if (B == null) {
                return false;
            }
            this.S = lVar.getItem().getItemId();
            int size = lVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = lVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            a aVar = new a(this.q, lVar, B);
            this.O = aVar;
            aVar.g(z);
            this.O.k();
            super.l(lVar);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable m() {
        SavedState savedState = new SavedState();
        savedState.p = this.S;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean n(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.z) {
            return false;
        }
        return super.n(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.a
    public View p(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.p(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j q(ViewGroup viewGroup) {
        j jVar = this.x;
        j q = super.q(viewGroup);
        if (jVar != q) {
            ((ActionMenuView) q).setPresenter(this);
        }
        return q;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean s(int i, g gVar) {
        return gVar.l();
    }
}
