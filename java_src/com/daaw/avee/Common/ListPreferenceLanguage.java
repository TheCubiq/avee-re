package com.daaw.avee.Common;

import android.content.Context;
import android.util.AttributeSet;
import com.daaw.rk0;
import com.daaw.z3;
/* loaded from: classes.dex */
public class ListPreferenceLanguage extends ListPreferenceCompat {
    public ListPreferenceLanguage(Context context) {
        super(context);
    }

    public ListPreferenceLanguage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void a(String str) {
        if (str.equals("en") && z3.o().f()) {
            return;
        }
        z3.O(rk0.c(str));
    }

    @Override // com.daaw.avee.Common.ListPreferenceCompat, android.preference.ListPreference
    public void setValue(String str) {
        super.setValue(str);
        a(str);
    }
}
