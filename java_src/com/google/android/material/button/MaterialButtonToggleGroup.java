package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.daaw.C1152e;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.InterfaceC2055ll;
import com.daaw.cn0;
import com.daaw.fu1;
import com.daaw.gc1;
import com.daaw.k21;
import com.daaw.m21;
import com.daaw.qn0;
import com.daaw.w01;
import com.daaw.xk1;
import com.daaw.xs1;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: p */
    public final List<C4041d> f37301p;

    /* renamed from: q */
    public final C4040c f37302q;

    /* renamed from: r */
    public final C4043f f37303r;

    /* renamed from: s */
    public final LinkedHashSet<InterfaceC4042e> f37304s;

    /* renamed from: t */
    public final Comparator<MaterialButton> f37305t;

    /* renamed from: u */
    public Integer[] f37306u;

    /* renamed from: v */
    public boolean f37307v;

    /* renamed from: w */
    public boolean f37308w;

    /* renamed from: x */
    public boolean f37309x;

    /* renamed from: y */
    public int f37310y;

    /* renamed from: z */
    public static final String f37300z = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: A */
    public static final int f37299A = k21.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: classes2.dex */
    public class C4038a implements Comparator<MaterialButton> {
        public C4038a() {
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

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: classes2.dex */
    public class C4039b extends C3388w {
        public C4039b() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4329e0(C3654y.C3657c.m4280a(0, 1, MaterialButtonToggleGroup.this.m831n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: classes2.dex */
    public class C4040c implements MaterialButton.InterfaceC4036a {
        public C4040c() {
        }

        public /* synthetic */ C4040c(MaterialButtonToggleGroup materialButtonToggleGroup, C4038a c4038a) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4036a
        /* renamed from: a */
        public void mo820a(MaterialButton materialButton, boolean z) {
            if (MaterialButtonToggleGroup.this.f37307v) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f37308w) {
                MaterialButtonToggleGroup.this.f37310y = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m824u(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.m833l(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: classes2.dex */
    public static class C4041d {

        /* renamed from: e */
        public static final InterfaceC2055ll f37314e = new C1152e(0.0f);

        /* renamed from: a */
        public InterfaceC2055ll f37315a;

        /* renamed from: b */
        public InterfaceC2055ll f37316b;

        /* renamed from: c */
        public InterfaceC2055ll f37317c;

        /* renamed from: d */
        public InterfaceC2055ll f37318d;

        public C4041d(InterfaceC2055ll interfaceC2055ll, InterfaceC2055ll interfaceC2055ll2, InterfaceC2055ll interfaceC2055ll3, InterfaceC2055ll interfaceC2055ll4) {
            this.f37315a = interfaceC2055ll;
            this.f37316b = interfaceC2055ll3;
            this.f37317c = interfaceC2055ll4;
            this.f37318d = interfaceC2055ll2;
        }

        /* renamed from: a */
        public static C4041d m819a(C4041d c4041d) {
            InterfaceC2055ll interfaceC2055ll = f37314e;
            return new C4041d(interfaceC2055ll, c4041d.f37318d, interfaceC2055ll, c4041d.f37317c);
        }

        /* renamed from: b */
        public static C4041d m818b(C4041d c4041d, View view) {
            return fu1.m22259d(view) ? m817c(c4041d) : m816d(c4041d);
        }

        /* renamed from: c */
        public static C4041d m817c(C4041d c4041d) {
            InterfaceC2055ll interfaceC2055ll = c4041d.f37315a;
            InterfaceC2055ll interfaceC2055ll2 = c4041d.f37318d;
            InterfaceC2055ll interfaceC2055ll3 = f37314e;
            return new C4041d(interfaceC2055ll, interfaceC2055ll2, interfaceC2055ll3, interfaceC2055ll3);
        }

        /* renamed from: d */
        public static C4041d m816d(C4041d c4041d) {
            InterfaceC2055ll interfaceC2055ll = f37314e;
            return new C4041d(interfaceC2055ll, interfaceC2055ll, c4041d.f37316b, c4041d.f37317c);
        }

        /* renamed from: e */
        public static C4041d m815e(C4041d c4041d, View view) {
            return fu1.m22259d(view) ? m816d(c4041d) : m817c(c4041d);
        }

        /* renamed from: f */
        public static C4041d m814f(C4041d c4041d) {
            InterfaceC2055ll interfaceC2055ll = c4041d.f37315a;
            InterfaceC2055ll interfaceC2055ll2 = f37314e;
            return new C4041d(interfaceC2055ll, interfaceC2055ll2, c4041d.f37316b, interfaceC2055ll2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC4042e {
        /* renamed from: a */
        void mo134a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$f */
    /* loaded from: classes2.dex */
    public class C4043f implements MaterialButton.InterfaceC4037b {
        public C4043f() {
        }

        public /* synthetic */ C4043f(MaterialButtonToggleGroup materialButtonToggleGroup, C4038a c4038a) {
            this();
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4037b
        /* renamed from: a */
        public void mo813a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, w01.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(qn0.m12324c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = f37299A;
        this.f37301p = new ArrayList();
        this.f37302q = new C4040c(this, null);
        this.f37303r = new C4043f(this, null);
        this.f37304s = new LinkedHashSet<>();
        this.f37305t = new C4038a();
        this.f37307v = false;
        TypedArray m5026h = xk1.m5026h(getContext(), attributeSet, m21.f18248h2, i, i2, new int[0]);
        setSingleSelection(m5026h.getBoolean(m21.f18272k2, false));
        this.f37310y = m5026h.getResourceId(m21.f18256i2, -1);
        this.f37309x = m5026h.getBoolean(m21.f18264j2, false);
        setChildrenDrawingOrderEnabled(true);
        m5026h.recycle();
        xs1.m4773B0(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m829p(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m829p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m829p(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f37310y = i;
        m833l(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(xs1.m4713m());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.m859a(this.f37302q);
        materialButton.setOnPressedChangeListenerInternal(this.f37303r);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: t */
    public static void m825t(gc1.C1393b c1393b, C4041d c4041d) {
        if (c4041d == null) {
            c1393b.m21767o(0.0f);
        } else {
            c1393b.m21786B(c4041d.f37315a).m21762t(c4041d.f37318d).m21782F(c4041d.f37316b).m21758x(c4041d.f37317c);
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
                m824u(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            gc1 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f37301p.add(new C4041d(shapeAppearanceModel.m21795r(), shapeAppearanceModel.m21803j(), shapeAppearanceModel.m21793t(), shapeAppearanceModel.m21801l()));
            xs1.m4702r0(materialButton, new C4039b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m823v();
        super.dispatchDraw(canvas);
    }

    /* renamed from: g */
    public void m838g(InterfaceC4042e interfaceC4042e) {
        this.f37304s.add(interfaceC4042e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f37308w) {
            return this.f37310y;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m832m = m832m(i);
            if (m832m.isChecked()) {
                arrayList.add(Integer.valueOf(m832m.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f37306u;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    /* renamed from: h */
    public final void m837h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m832m = m832m(i);
            int min = Math.min(m832m.getStrokeWidth(), m832m(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m836i = m836i(m832m);
            if (getOrientation() == 0) {
                cn0.m25225c(m836i, 0);
                cn0.m25224d(m836i, -min);
                m836i.topMargin = 0;
            } else {
                m836i.bottomMargin = 0;
                m836i.topMargin = -min;
                cn0.m25224d(m836i, 0);
            }
            m832m.setLayoutParams(m836i);
        }
        m827r(firstVisibleChildIndex);
    }

    /* renamed from: i */
    public final LinearLayout.LayoutParams m836i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: j */
    public final void m835j(int i) {
        m826s(i, true);
        m824u(i, true);
        setCheckedId(i);
    }

    /* renamed from: k */
    public void m834k() {
        this.f37307v = true;
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m832m = m832m(i);
            m832m.setChecked(false);
            m833l(m832m.getId(), false);
        }
        this.f37307v = false;
        setCheckedId(-1);
    }

    /* renamed from: l */
    public final void m833l(int i, boolean z) {
        Iterator<InterfaceC4042e> it = this.f37304s.iterator();
        while (it.hasNext()) {
            it.next().mo134a(this, i, z);
        }
    }

    /* renamed from: m */
    public final MaterialButton m832m(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: n */
    public final int m831n(View view) {
        if (view instanceof MaterialButton) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) == view) {
                    return i;
                }
                if ((getChildAt(i2) instanceof MaterialButton) && m829p(i2)) {
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: o */
    public final C4041d m830o(int i, int i2, int i3) {
        C4041d c4041d = this.f37301p.get(i);
        if (i2 == i3) {
            return c4041d;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            return z ? C4041d.m815e(c4041d, this) : C4041d.m814f(c4041d);
        } else if (i == i3) {
            return z ? C4041d.m818b(c4041d, this) : C4041d.m819a(c4041d);
        } else {
            return null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f37310y;
        if (i != -1) {
            m835j(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3654y.m4361D0(accessibilityNodeInfo).m4331d0(C3654y.C3656b.m4281b(1, getVisibleButtonCount(), false, m828q() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m822w();
        m837h();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.m852h(this.f37302q);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f37301p.remove(indexOfChild);
        }
        m822w();
        m837h();
    }

    /* renamed from: p */
    public final boolean m829p(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: q */
    public boolean m828q() {
        return this.f37308w;
    }

    /* renamed from: r */
    public final void m827r(int i) {
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m832m(i).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
            return;
        }
        cn0.m25225c(layoutParams, 0);
        cn0.m25224d(layoutParams, 0);
        layoutParams.leftMargin = 0;
        layoutParams.rightMargin = 0;
    }

    /* renamed from: s */
    public final void m826s(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f37307v = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f37307v = false;
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f37309x = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f37308w != z) {
            this.f37308w = z;
            m834k();
        }
    }

    /* renamed from: u */
    public final boolean m824u(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f37309x && checkedButtonIds.isEmpty()) {
            m826s(i, true);
            this.f37310y = i;
            return false;
        }
        if (z && this.f37308w) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                m826s(intValue, false);
                m833l(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: v */
    public final void m823v() {
        TreeMap treeMap = new TreeMap(this.f37305t);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m832m(i), Integer.valueOf(i));
        }
        this.f37306u = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    /* renamed from: w */
    public void m822w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m832m = m832m(i);
            if (m832m.getVisibility() != 8) {
                gc1.C1393b m21791v = m832m.getShapeAppearanceModel().m21791v();
                m825t(m21791v, m830o(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m832m.setShapeAppearanceModel(m21791v.m21769m());
            }
        }
    }
}
