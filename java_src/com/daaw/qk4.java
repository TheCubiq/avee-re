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

    /* renamed from: p */
    public final Context f24120p;

    /* renamed from: q */
    public View f24121q;

    public qk4(Context context) {
        super(context);
        this.f24120p = context;
    }

    /* renamed from: a */
    public static qk4 m12363a(Context context, View view, th6 th6Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        qk4 qk4Var = new qk4(context);
        if (!th6Var.f27717v.isEmpty() && (resources = qk4Var.f24120p.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            uh6 uh6Var = (uh6) th6Var.f27717v.get(0);
            float f = displayMetrics.density;
            qk4Var.setLayoutParams(new FrameLayout.LayoutParams((int) (uh6Var.f29083a * f), (int) (uh6Var.f29084b * f)));
        }
        qk4Var.f24121q = view;
        qk4Var.addView(view);
        zzt.zzx();
        m14.m16298b(qk4Var, qk4Var);
        zzt.zzx();
        m14.m16299a(qk4Var, qk4Var);
        JSONObject jSONObject = th6Var.f27699j0;
        RelativeLayout relativeLayout = new RelativeLayout(qk4Var.f24120p);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            qk4Var.m12361c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            qk4Var.m12361c(optJSONObject2, relativeLayout, 12);
        }
        qk4Var.addView(relativeLayout);
        return qk4Var;
    }

    /* renamed from: b */
    public final int m12362b(double d) {
        zzay.zzb();
        return d04.m24833D(this.f24120p, (int) d);
    }

    /* renamed from: c */
    public final void m12361c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f24120p);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int m12362b = m12362b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, m12362b, 0, m12362b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, m12362b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f24121q.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f24121q.setY(-iArr[1]);
    }
}
