package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class qk4 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final Context p;
    public View q;

    public qk4(Context context) {
        super(context);
        this.p = context;
    }

    public static qk4 a(Context context, View view, th6 th6Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        qk4 qk4Var = new qk4(context);
        if (!th6Var.v.isEmpty() && (resources = qk4Var.p.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            uh6 uh6Var = (uh6) th6Var.v.get(0);
            float f = displayMetrics.density;
            qk4Var.setLayoutParams(new FrameLayout.LayoutParams((int) (uh6Var.a * f), (int) (uh6Var.b * f)));
        }
        qk4Var.q = view;
        qk4Var.addView(view);
        zzt.zzx();
        m14.b(qk4Var, qk4Var);
        zzt.zzx();
        m14.a(qk4Var, qk4Var);
        JSONObject jSONObject = th6Var.j0;
        RelativeLayout relativeLayout = new RelativeLayout(qk4Var.p);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            qk4Var.c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            qk4Var.c(optJSONObject2, relativeLayout, 12);
        }
        qk4Var.addView(relativeLayout);
        return qk4Var;
    }

    public final int b(double d) {
        zzay.zzb();
        return d04.D(this.p, (int) d);
    }

    public final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.p);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.q.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.q.setY(-iArr[1]);
    }
}
