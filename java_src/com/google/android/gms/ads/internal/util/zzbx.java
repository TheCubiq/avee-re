package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.daaw.by6;
import com.daaw.fz6;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.th6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbx {
    public static JSONObject a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    public static int b(int i) {
        if (i != -2) {
            return i != -1 ? 2 : 3;
        }
        return 4;
    }

    public static Point zza(MotionEvent motionEvent, View view) {
        int[] zzj = zzj(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - zzj[0], ((int) motionEvent.getRawY()) - zzj[1]);
    }

    public static WindowManager.LayoutParams zzb() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.k7)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    public static JSONObject zzc(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                k04.zzh("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            k04.zzh("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static JSONObject zzd(Context context, Map map, Map map2, View view, ImageView.ScaleType scaleType) {
        String str;
        String str2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str3 = "ad_view";
        String str4 = "relative_to";
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzj = zzj(view);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] zzj2 = zzj(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, zzj2[0] - zzj[0]));
                        jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, zzj2[1] - zzj[1]));
                        jSONObject5.put(str4, str3);
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = a(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, zzj2[0] - zzj[0]));
                            jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().g(context, zzj2[1] - zzj[1]));
                            jSONObject2.put(str4, str3);
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.e7)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.f7)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", b(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", b(layoutParams.height) - 1);
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.g7)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.h7)).booleanValue() && scaleType != null) {
                                jSONObject4.put("mediaview_scale_type", scaleType.ordinal());
                            }
                        }
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            str = str3;
                            str2 = str4;
                            try {
                                jSONObject4.put("font_size", textView.getTextSize());
                                jSONObject4.put("text", textView.getText());
                            } catch (JSONException unused) {
                                jSONObject = jSONObject6;
                                k04.zzj("Unable to get asset views information");
                                it = it2;
                                jSONObject3 = jSONObject;
                                str3 = str;
                                str4 = str2;
                            }
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                    } catch (JSONException unused2) {
                        str = str3;
                        str2 = str4;
                    }
                } catch (JSONException unused3) {
                    str = str3;
                    str2 = str4;
                    jSONObject = jSONObject3;
                }
                try {
                    jSONObject.put((String) entry.getKey(), jSONObject4);
                } catch (JSONException unused4) {
                    k04.zzj("Unable to get asset views information");
                    it = it2;
                    jSONObject3 = jSONObject;
                    str3 = str;
                    str4 = str2;
                }
                it = it2;
                jSONObject3 = jSONObject;
                str3 = str;
                str4 = str2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zze(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("can_show_on_lock_screen", zzs.zzl(view));
            com.google.android.gms.ads.internal.zzt.zzp();
            jSONObject.put("is_keyguard_locked", zzs.zzz(context));
        } catch (JSONException unused) {
            k04.zzj("Unable to get lock screen information");
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if ((r1 == null ? -1 : ((android.widget.AdapterView) r1).getPositionForView(r6)) != (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzf(android.view.View r6) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            com.daaw.y83 r1 = com.daaw.g93.d7     // Catch: java.lang.Exception -> L58
            com.daaw.e93 r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Exception -> L58
            java.lang.Object r1 = r2.b(r1)     // Catch: java.lang.Exception -> L58
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L58
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L58
            r2 = 0
            r3 = 1
            java.lang.String r4 = "contained_in_scroll_view"
            if (r1 == 0) goto L38
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L25:
            if (r6 == 0) goto L30
            boolean r1 = r6 instanceof android.widget.ScrollView     // Catch: java.lang.Exception -> L58
            if (r1 != 0) goto L30
            android.view.ViewParent r6 = r6.getParent()     // Catch: java.lang.Exception -> L58
            goto L25
        L30:
            if (r6 != 0) goto L33
            goto L34
        L33:
            r2 = 1
        L34:
            r0.put(r4, r2)     // Catch: java.lang.Exception -> L58
            goto L58
        L38:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Exception -> L58
            android.view.ViewParent r1 = r6.getParent()     // Catch: java.lang.Exception -> L58
        L3f:
            if (r1 == 0) goto L4a
            boolean r5 = r1 instanceof android.widget.AdapterView     // Catch: java.lang.Exception -> L58
            if (r5 != 0) goto L4a
            android.view.ViewParent r1 = r1.getParent()     // Catch: java.lang.Exception -> L58
            goto L3f
        L4a:
            r5 = -1
            if (r1 != 0) goto L4f
            r6 = -1
            goto L55
        L4f:
            android.widget.AdapterView r1 = (android.widget.AdapterView) r1     // Catch: java.lang.Exception -> L58
            int r6 = r1.getPositionForView(r6)     // Catch: java.lang.Exception -> L58
        L55:
            if (r6 == r5) goto L34
            goto L33
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbx.zzf(android.view.View):org.json.JSONObject");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:18|(10:44|45|21|22|23|(3:25|(1:29)|38)(3:39|(1:41)|38)|30|(1:(2:33|34)(1:36))|37|34)|20|21|22|23|(0)(0)|30|(0)|37|34) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0170, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
        com.daaw.k04.zzh("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0171 -> B:63:0x0176). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzg(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzbx.zzg(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static boolean zzh(Context context, th6 th6Var) {
        if (th6Var.O) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.i7)).booleanValue()) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.l7)).booleanValue();
            }
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.j7);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : fz6.c(by6.b(';')).d(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static boolean zzi(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.X2)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().b(g93.Y2)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    public static int[] zzj(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }
}
