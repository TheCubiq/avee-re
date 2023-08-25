package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
/* loaded from: classes.dex */
public class im1 {

    /* renamed from: a */
    public final Context f13783a;

    /* renamed from: b */
    public final View f13784b;

    /* renamed from: c */
    public final TextView f13785c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f13786d;

    /* renamed from: e */
    public final Rect f13787e;

    /* renamed from: f */
    public final int[] f13788f;

    /* renamed from: g */
    public final int[] f13789g;

    public im1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f13786d = layoutParams;
        this.f13787e = new Rect();
        this.f13788f = new int[2];
        this.f13789g = new int[2];
        this.f13783a = context;
        View inflate = LayoutInflater.from(context).inflate(c21.abc_tooltip, (ViewGroup) null);
        this.f13784b = inflate;
        this.f13785c = (TextView) inflate.findViewById(o11.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = l21.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m19646b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m19647a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f13783a.getResources().getDimensionPixelOffset(g11.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f13783a.getResources().getDimensionPixelOffset(g11.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f13783a.getResources().getDimensionPixelOffset(z ? g11.tooltip_y_offset_touch : g11.tooltip_y_offset_non_touch);
        View m19646b = m19646b(view);
        if (m19646b == null) {
            return;
        }
        m19646b.getWindowVisibleDisplayFrame(this.f13787e);
        Rect rect = this.f13787e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f13783a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f13787e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m19646b.getLocationOnScreen(this.f13789g);
        view.getLocationOnScreen(this.f13788f);
        int[] iArr = this.f13788f;
        int i4 = iArr[0];
        int[] iArr2 = this.f13789g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (m19646b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f13784b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f13784b.getMeasuredHeight();
        int[] iArr3 = this.f13788f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f13787e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: c */
    public void m19645c() {
        if (m19644d()) {
            ((WindowManager) this.f13783a.getSystemService("window")).removeView(this.f13784b);
        }
    }

    /* renamed from: d */
    public boolean m19644d() {
        return this.f13784b.getParent() != null;
    }

    /* renamed from: e */
    public void m19643e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (m19644d()) {
            m19645c();
        }
        this.f13785c.setText(charSequence);
        m19647a(view, i, i2, z, this.f13786d);
        ((WindowManager) this.f13783a.getSystemService("window")).addView(this.f13784b, this.f13786d);
    }
}
