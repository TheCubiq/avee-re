package com.daaw.avee.Common;

import android.content.Context;
import android.os.Build;
import android.preference.ListPreference;
import android.text.TextUtils;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class ListPreferenceCompat extends ListPreference {
    public ListPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListPreferenceCompat(Context context) {
        super(context);
    }

    @Override // android.preference.ListPreference
    public void setValue(String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            super.setValue(str);
            return;
        }
        String value = getValue();
        super.setValue(str);
        if (TextUtils.equals(str, value)) {
            return;
        }
        notifyChanged();
    }
}
