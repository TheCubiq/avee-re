package com.daaw;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
/* renamed from: com.daaw.k0 */
/* loaded from: classes.dex */
public class C1893k0 {

    /* renamed from: a */
    public Context f15569a;

    public C1893k0(Context context) {
        this.f15569a = context;
    }

    /* renamed from: b */
    public static C1893k0 m18112b(Context context) {
        return new C1893k0(context);
    }

    /* renamed from: a */
    public boolean m18113a() {
        return this.f15569a.getApplicationInfo().targetSdkVersion < 14;
    }

    /* renamed from: c */
    public int m18111c() {
        return this.f15569a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: d */
    public int m18110d() {
        Configuration configuration = this.f15569a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i <= 960 || i2 <= 720) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500) {
                    if (i <= 640 || i2 <= 480) {
                        if (i <= 480 || i2 <= 640) {
                            return i >= 360 ? 3 : 2;
                        }
                        return 4;
                    }
                    return 4;
                }
                return 4;
            }
            return 5;
        }
        return 5;
    }

    /* renamed from: e */
    public int m18109e() {
        return this.f15569a.getResources().getDimensionPixelSize(g11.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: f */
    public int m18108f() {
        TypedArray obtainStyledAttributes = this.f15569a.obtainStyledAttributes(null, x21.f31882a, x01.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(x21.f31927j, 0);
        Resources resources = this.f15569a.getResources();
        if (!m18107g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(g11.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: g */
    public boolean m18107g() {
        return this.f15569a.getResources().getBoolean(z01.abc_action_bar_embed_tabs);
    }

    /* renamed from: h */
    public boolean m18106h() {
        return true;
    }
}
