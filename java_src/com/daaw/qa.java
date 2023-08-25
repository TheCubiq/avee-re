package com.daaw;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.List;
/* loaded from: classes.dex */
public abstract class qa extends ma {
    public static vw1<Boolean> u = new vw1<>();
    public static rw1<al, View> v = new rw1<>();
    public static rw1<al, View> w = new rw1<>();
    public static rw1<al, View> x = new rw1<>();
    public static sw1<al, Integer, View> y = new sw1<>();
    public static qw1<al> z = new qw1<>();
    public static sw1<long[], List<String>, al> A = new sw1<>();

    public qa(View view) {
        super(view, 0, true);
    }

    public qa(View view, boolean z2) {
        super(view, 0, z2);
    }

    public static void P(TextView[] textViewArr, Context context) {
        boolean L = j5.L(j5.e().p(context), "pref_toolButtonsShowTexts", true);
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setVisibility(L ? 0 : 8);
            }
        }
    }
}
