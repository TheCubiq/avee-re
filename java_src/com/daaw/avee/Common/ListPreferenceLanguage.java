package com.daaw.avee.Common;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.AbstractC3800z3;
import com.daaw.rk0;
/* loaded from: classes.dex */
public class ListPreferenceLanguage extends ListPreferenceCompat {
    public ListPreferenceLanguage(Context context) {
        super(context);
    }

    public ListPreferenceLanguage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public static void m26953a(String str) {
        if (str.equals("en") && AbstractC3800z3.m2923o().m11222f()) {
            return;
        }
        AbstractC3800z3.m2944O(rk0.m11225c(str));
    }

    @Override // com.daaw.avee.Common.ListPreferenceCompat, android.preference.ListPreference
    public void setValue(String str) {
        super.setValue(str);
        m26953a(str);
    }
}
