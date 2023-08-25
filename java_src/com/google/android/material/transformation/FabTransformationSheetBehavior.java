package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.daaw.jy0;
import com.daaw.r01;
import com.daaw.rq0;
import com.daaw.xs1;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public Map<View, Integer> f37904i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo98H(View view, View view2, boolean z, boolean z2) {
        m96g0(view2, z);
        return super.mo98H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    public FabTransformationBehavior.C4177e mo97e0(Context context, boolean z) {
        int i = z ? r01.mtrl_fab_transformation_sheet_expand_spec : r01.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C4177e c4177e = new FabTransformationBehavior.C4177e();
        c4177e.f37897a = rq0.m11069c(context, i);
        c4177e.f37898b = new jy0(17, 0.0f, 0.0f);
        return c4177e;
    }

    /* renamed from: g0 */
    public final void m96g0(View view, boolean z) {
        int intValue;
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f37904i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0197f) && (((CoordinatorLayout.C0197f) childAt.getLayoutParams()).m29760f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    Map<View, Integer> map = this.f37904i;
                    if (z) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    } else {
                        intValue = (map != null && map.containsKey(childAt)) ? this.f37904i.get(childAt).intValue() : 4;
                    }
                    xs1.m4773B0(childAt, intValue);
                }
            }
            if (z) {
                return;
            }
            this.f37904i = null;
        }
    }
}
