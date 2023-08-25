package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0164b;
import com.daaw.g80;
import com.daaw.o11;
import com.daaw.xs1;
/* loaded from: classes.dex */
public class AlertDialogLayout extends C0164b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A */
    private void m30094A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: B */
    public static int m30093B(View view) {
        int m4766F = xs1.m4766F(view);
        if (m4766F > 0) {
            return m4766F;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m30093B(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m30091l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0164b.C0165a c0165a = (C0164b.C0165a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c0165a).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c0165a).height;
                    ((LinearLayout.LayoutParams) c0165a).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c0165a).height = i4;
                }
            }
        }
    }

    /* renamed from: C */
    public final boolean m30092C(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == o11.topPanel) {
                    view = childAt;
                } else if (id == o11.buttonPanel) {
                    view2 = childAt;
                } else if ((id != o11.contentPanel && id != o11.customPanel) || view3 != null) {
                    return false;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = m30093B(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingTop += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i6 = view3.getMeasuredHeight();
            paddingTop += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingTop;
        if (view2 != null) {
            int i9 = paddingTop - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingTop = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingTop = (paddingTop - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10 + getPaddingLeft() + getPaddingRight(), i, i3), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            m30091l(childCount, i2);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    @Override // androidx.appcompat.widget.C0164b, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0164b.C0165a c0165a = (C0164b.C0165a) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) c0165a).gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int m21894b = g80.m21894b(i11, xs1.m4768E(this)) & 7;
                if (m21894b == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0165a).leftMargin;
                } else if (m21894b != 5) {
                    i6 = ((LinearLayout.LayoutParams) c0165a).leftMargin + paddingLeft;
                    if (m29925t(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) c0165a).topMargin;
                    m30094A(childAt, i6, i12, measuredWidth, measuredHeight2);
                    paddingTop = i12 + measuredHeight2 + ((LinearLayout.LayoutParams) c0165a).bottomMargin;
                } else {
                    i5 = paddingRight - measuredWidth;
                }
                i6 = i5 - ((LinearLayout.LayoutParams) c0165a).rightMargin;
                if (m29925t(i10)) {
                }
                int i122 = paddingTop + ((LinearLayout.LayoutParams) c0165a).topMargin;
                m30094A(childAt, i6, i122, measuredWidth, measuredHeight2);
                paddingTop = i122 + measuredHeight2 + ((LinearLayout.LayoutParams) c0165a).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0164b, android.view.View
    public void onMeasure(int i, int i2) {
        if (m30092C(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }
}
