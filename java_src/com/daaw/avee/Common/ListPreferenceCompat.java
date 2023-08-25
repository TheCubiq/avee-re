package com.daaw.avee.Common;

import android.content.Context;
import android.preference.ListPreference;
import android.util.AttributeSet;
/* loaded from: classes.dex */
public class ListPreferenceCompat extends ListPreference {
    public ListPreferenceCompat(Context context) {
        super(context);
    }

    public ListPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.preference.ListPreference
    public void setValue(String str) {
        super.setValue(str);
    }
}
