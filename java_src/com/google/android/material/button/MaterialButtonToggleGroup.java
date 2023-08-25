package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.daaw.cn0;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.k21;
import com.daaw.ll;
import com.daaw.w;
import com.daaw.w01;
import com.daaw.xs1;
import com.daaw.y;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public final List<d> p;
    public final c q;
    public final f r;
    public final LinkedHashSet<e> s;
    public final Comparator<MaterialButton> t;
    public Integer[] u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public static final String z = MaterialButtonToggleGroup.class.getSimpleName();
    public static final int A = k21.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* loaded from: classes2.dex */
    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* loaded from: classes2.dex */
    public class b extends w {
        public b() {
        }

        @Override // com.daaw.w
        public void g(View view, y yVar) {
            super.g(view, yVar);
            yVar.e0(y.c.a(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements MaterialButton.a {
        public c() {
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.v) {
                return;
            }
            if (MaterialButtonToggleGroup.this.w) {
                MaterialButtonToggleGroup.this.y = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* loaded from: classes2.dex */
    public static class d {
        public static final ll e = new com.daaw.e(0.0f);
        public ll a;
        public ll b;
        public ll c;
        public ll d;

        public d(ll llVar, ll llVar2, ll llVar3, ll llVar4) {
            this.a = llVar;
            this.b = llVar3;
            this.c = llVar4;
            this.d = llVar2;
        }

        public static d a(d dVar) {
            ll llVar = e;
            return new d(llVar, dVar.d, llVar, dVar.c);
        }

        public static d b(d dVar, View view) {
            return fu1.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            ll llVar = dVar.a;
            ll llVar2 = dVar.d;
            ll llVar3 = e;
            return new d(llVar, llVar2, llVar3, llVar3);
        }

        public static d d(d dVar) {
            ll llVar = e;
            return new d(llVar, llVar, dVar.b, dVar.c);
        }

        public static d e(d dVar, View view) {
            return fu1.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            ll llVar = dVar.a;
            ll llVar2 = e;
            return new d(llVar, llVar2, dVar.b, llVar2);
        }
    }

    /* loaded from: classes2.dex */
    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* loaded from: classes2.dex */
    public class f implements MaterialButton.b {
        public f() {
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.A
            android.content.Context r7 = com.daaw.qn0.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.p = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.q = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.r = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.s = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.t = r7
            r7 = 0
            r6.v = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.daaw.m21.h2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.daaw.xk1.h(r0, r1, r2, r3, r4, r5)
            int r9 = com.daaw.m21.k2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = com.daaw.m21.i2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.y = r9
            int r9 = com.daaw.m21.j2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.x = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            com.daaw.xs1.B0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.y = i;
        l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(xs1.m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.q);
        materialButton.setOnPressedChangeListenerInternal(this.r);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void t(gc1.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(dVar.a).t(dVar.d).F(dVar.b).x(dVar.c);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                u(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            gc1 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.p.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
            xs1.r0(materialButton, new b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.s.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.w) {
            return this.y;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m(i);
            if (m.isChecked()) {
                arrayList.add(Integer.valueOf(m.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.u;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m = m(i);
            int min = Math.min(m.getStrokeWidth(), m(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams i2 = i(m);
            if (getOrientation() == 0) {
                cn0.c(i2, 0);
                cn0.d(i2, -min);
                i2.topMargin = 0;
            } else {
                i2.bottomMargin = 0;
                i2.topMargin = -min;
                cn0.d(i2, 0);
            }
            m.setLayoutParams(i2);
        }
        r(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void j(int i) {
        s(i, true);
        u(i, true);
        setCheckedId(i);
    }

    public void k() {
        this.v = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m = m(i);
            m.setChecked(false);
            l(m.getId(), false);
        }
        this.v = false;
        setCheckedId(-1);
    }

    public final void l(int i, boolean z2) {
        Iterator<e> it = this.s.iterator();
        while (it.hasNext()) {
            it.next().a(this, i, z2);
        }
    }

    public final MaterialButton m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public final int n(View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && p(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    public final d o(int i, int i2, int i3) {
        d dVar = this.p.get(i);
        if (i2 == i3) {
            return dVar;
        }
        boolean z2 = getOrientation() == 0;
        if (i == i2) {
            return z2 ? d.e(dVar, this) : d.f(dVar);
        } else if (i == i3) {
            return z2 ? d.b(dVar, this) : d.a(dVar);
        } else {
            return null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.y;
        if (i != -1) {
            j(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        y.D0(accessibilityNodeInfo).d0(y.b.b(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        w();
        h();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.q);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.p.remove(indexOfChild);
        }
        w();
        h();
    }

    public final boolean p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public boolean q() {
        return this.w;
    }

    public final void r(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        cn0.c(layoutParams, 0);
        cn0.d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    public final void s(int i, boolean z2) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.v = true;
            ((MaterialButton) findViewById).setChecked(z2);
            this.v = false;
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.x = z2;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
            k();
        }
    }

    public final boolean u(int i, boolean z2) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.x && checkedButtonIds.isEmpty()) {
            s(i, true);
            this.y = i;
            return false;
        }
        if (z2 && this.w) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                s(intValue, false);
                l(intValue, false);
            }
        }
        return true;
    }

    public final void v() {
        TreeMap treeMap = new TreeMap(this.t);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m(i), Integer.valueOf(i));
        }
        this.u = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m = m(i);
            if (m.getVisibility() != 8) {
                gc1.b v = m.getShapeAppearanceModel().v();
                t(v, o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m.setShapeAppearanceModel(v.m());
            }
        }
    }
}
