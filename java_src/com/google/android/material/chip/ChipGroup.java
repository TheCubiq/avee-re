package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.daaw.C3654y;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.qn0;
import com.daaw.r20;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class ChipGroup extends r20 {

    /* renamed from: C */
    public static final int f37343C = k21.Widget_MaterialComponents_ChipGroup;

    /* renamed from: A */
    public int f37344A;

    /* renamed from: B */
    public boolean f37345B;

    /* renamed from: t */
    public int f37346t;

    /* renamed from: u */
    public int f37347u;

    /* renamed from: v */
    public boolean f37348v;

    /* renamed from: w */
    public boolean f37349w;

    /* renamed from: x */
    public InterfaceC4050d f37350x;

    /* renamed from: y */
    public final C4048b f37351y;

    /* renamed from: z */
    public ViewGroup$OnHierarchyChangeListenerC4051e f37352z;

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: classes2.dex */
    public class C4048b implements CompoundButton.OnCheckedChangeListener {
        public C4048b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (ChipGroup.this.f37345B) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.f37349w) {
                ChipGroup.this.m762r(compoundButton.getId(), true);
                ChipGroup.this.m763q(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z) {
                if (ChipGroup.this.f37344A == id) {
                    ChipGroup.this.setCheckedId(-1);
                    return;
                }
                return;
            }
            if (ChipGroup.this.f37344A != -1 && ChipGroup.this.f37344A != id && ChipGroup.this.f37348v) {
                ChipGroup chipGroup = ChipGroup.this;
                chipGroup.m762r(chipGroup.f37344A, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: classes2.dex */
    public static class C4049c extends ViewGroup.MarginLayoutParams {
        public C4049c(int i, int i2) {
            super(i, i2);
        }

        public C4049c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4049c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC4050d {
        /* renamed from: a */
        void m761a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: classes2.dex */
    public class ViewGroup$OnHierarchyChangeListenerC4051e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: p */
        public ViewGroup.OnHierarchyChangeListener f37354p;

        public ViewGroup$OnHierarchyChangeListenerC4051e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(xs1.m4713m());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m767m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f37351y);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f37354p;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f37354p;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f37343C;
        this.f37351y = new C4048b();
        this.f37352z = new ViewGroup$OnHierarchyChangeListenerC4051e();
        this.f37344A = -1;
        this.f37345B = false;
        TypedArray m5026h = xk1.m5026h(getContext(), attributeSet, m21.f18029D0, i, i2, new int[0]);
        int dimensionPixelOffset = m5026h.getDimensionPixelOffset(m21.f18043F0, 0);
        setChipSpacingHorizontal(m5026h.getDimensionPixelOffset(m21.f18050G0, dimensionPixelOffset));
        setChipSpacingVertical(m5026h.getDimensionPixelOffset(m21.f18057H0, dimensionPixelOffset));
        setSingleLine(m5026h.getBoolean(m21.f18071J0, false));
        setSingleSelection(m5026h.getBoolean(m21.f18078K0, false));
        setSelectionRequired(m5026h.getBoolean(m21.f18064I0, false));
        int resourceId = m5026h.getResourceId(m21.f18036E0, -1);
        if (resourceId != -1) {
            this.f37344A = resourceId;
        }
        m5026h.recycle();
        super.setOnHierarchyChangeListener(this.f37352z);
        xs1.m4773B0(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        m763q(i, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f37344A;
                if (i2 != -1 && this.f37348v) {
                    m762r(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.daaw.r20
    /* renamed from: c */
    public boolean mo776c() {
        return super.mo776c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C4049c);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4049c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4049c(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4049c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f37348v) {
            return this.f37344A;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f37348v) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f37346t;
    }

    public int getChipSpacingVertical() {
        return this.f37347u;
    }

    /* renamed from: m */
    public void m767m(int i) {
        int i2 = this.f37344A;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.f37348v) {
            m762r(i2, false);
        }
        if (i != -1) {
            m762r(i, true);
        }
        setCheckedId(i);
    }

    /* renamed from: n */
    public void m766n() {
        this.f37345B = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f37345B = false;
        setCheckedId(-1);
    }

    /* renamed from: o */
    public int m765o(View view) {
        if (view instanceof Chip) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    if (((Chip) getChildAt(i2)) == view) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f37344A;
        if (i != -1) {
            m762r(i, true);
            setCheckedId(this.f37344A);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3654y.m4361D0(accessibilityNodeInfo).m4331d0(C3654y.C3656b.m4281b(getRowCount(), mo776c() ? getChipCount() : -1, false, m764p() ? 1 : 2));
    }

    /* renamed from: p */
    public boolean m764p() {
        return this.f37348v;
    }

    /* renamed from: q */
    public final void m763q(int i, boolean z) {
        this.f37344A = i;
        InterfaceC4050d interfaceC4050d = this.f37350x;
        if (interfaceC4050d != null && this.f37348v && z) {
            interfaceC4050d.m761a(this, i);
        }
    }

    /* renamed from: r */
    public final void m762r(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f37345B = true;
            ((Chip) findViewById).setChecked(z);
            this.f37345B = false;
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f37346t != i) {
            this.f37346t = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f37347u != i) {
            this.f37347u = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC4050d interfaceC4050d) {
        this.f37350x = interfaceC4050d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f37352z.f37354p = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f37349w = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // com.daaw.r20
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f37348v != z) {
            this.f37348v = z;
            m766n();
        }
    }
}
