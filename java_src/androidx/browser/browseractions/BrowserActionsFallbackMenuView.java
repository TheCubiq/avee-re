package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.daaw.c11;
@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: p */
    public final int f861p;

    /* renamed from: q */
    public final int f862q;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f861p = getResources().getDimensionPixelOffset(c11.browser_actions_context_menu_min_padding);
        this.f862q = getResources().getDimensionPixelOffset(c11.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f861p * 2), this.f862q), 1073741824), i2);
    }
}
