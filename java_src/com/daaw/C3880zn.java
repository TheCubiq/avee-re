package com.daaw;

import android.os.Bundle;
/* renamed from: com.daaw.zn */
/* loaded from: classes.dex */
public final class C3880zn {

    /* renamed from: a */
    public final Integer f35242a;

    /* renamed from: b */
    public final Integer f35243b;

    /* renamed from: c */
    public final Integer f35244c;

    /* renamed from: d */
    public final Integer f35245d;

    /* renamed from: com.daaw.zn$a */
    /* loaded from: classes.dex */
    public static final class C3881a {

        /* renamed from: a */
        public Integer f35246a;

        /* renamed from: b */
        public Integer f35247b;

        /* renamed from: c */
        public Integer f35248c;

        /* renamed from: d */
        public Integer f35249d;

        /* renamed from: a */
        public C3880zn m2105a() {
            return new C3880zn(this.f35246a, this.f35247b, this.f35248c, this.f35249d);
        }
    }

    public C3880zn(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f35242a = num;
        this.f35243b = num2;
        this.f35244c = num3;
        this.f35245d = num4;
    }

    /* renamed from: a */
    public Bundle m2106a() {
        Bundle bundle = new Bundle();
        Integer num = this.f35242a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f35243b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f35244c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f35245d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
