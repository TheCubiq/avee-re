package com.daaw;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.List;
/* renamed from: com.daaw.qa */
/* loaded from: classes.dex */
public abstract class AbstractC2700qa extends AbstractC2161ma {

    /* renamed from: u */
    public static vw1<Boolean> f23792u = new vw1<>();

    /* renamed from: v */
    public static rw1<C0645al, View> f23793v = new rw1<>();

    /* renamed from: w */
    public static rw1<C0645al, View> f23794w = new rw1<>();

    /* renamed from: x */
    public static rw1<C0645al, View> f23795x = new rw1<>();

    /* renamed from: y */
    public static sw1<C0645al, Integer, View> f23796y = new sw1<>();

    /* renamed from: z */
    public static qw1<C0645al> f23797z = new qw1<>();

    /* renamed from: A */
    public static sw1<long[], List<String>, C0645al> f23791A = new sw1<>();

    public AbstractC2700qa(View view) {
        super(view, 0, true);
    }

    public AbstractC2700qa(View view, boolean z) {
        super(view, 0, z);
    }

    /* renamed from: P */
    public static void m12690P(TextView[] textViewArr, Context context) {
        boolean m18951L = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18951L(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18910p(context), "pref_toolButtonsShowTexts", true);
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setVisibility(m18951L ? 0 : 8);
            }
        }
    }
}
