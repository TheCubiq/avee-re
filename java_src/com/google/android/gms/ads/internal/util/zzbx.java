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
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.daaw.by6;
import com.daaw.fz6;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.th6;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class zzbx {
    /* renamed from: a */
    public static JSONObject m1343a(Context context, Rect rect) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, rect.right - rect.left));
        jSONObject.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, rect.bottom - rect.top));
        jSONObject.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, rect.left));
        jSONObject.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: b */
    public static int m1342b(int i) {
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
        layoutParams.flags = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10739k7)).intValue();
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
                jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, point2.x));
                jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, point2.y));
                jSONObject3.put("start_x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, point.x));
                jSONObject3.put("start_y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, point.y));
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
                        jSONObject5.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj2[0] - zzj[0]));
                        jSONObject5.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj2[1] - zzj[1]));
                        jSONObject5.put(str4, str3);
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = m1343a(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj2[0] - zzj[0]));
                            jSONObject2.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj2[1] - zzj[1]));
                            jSONObject2.put(str4, str3);
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (((String) entry.getKey()).equals("3010")) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10673e7)).booleanValue()) {
                                jSONObject4.put("mediaview_graphics_matrix", view2.getMatrix().toShortString());
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10684f7)).booleanValue()) {
                                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                jSONObject4.put("view_width_layout_type", m1342b(layoutParams.width) - 1);
                                jSONObject4.put("view_height_layout_type", m1342b(layoutParams.height) - 1);
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10695g7)).booleanValue()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(Integer.valueOf(view2.getId()));
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    arrayList.add(Integer.valueOf(((View) parent).getId()));
                                }
                                jSONObject4.put("view_path", TextUtils.join("/", arrayList));
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10706h7)).booleanValue() && scaleType != null) {
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
    */
    public static JSONObject zzf(View view) {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            z = false;
        } catch (Exception unused) {
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10662d7)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof ScrollView)) {
                parent = parent.getParent();
            }
            if (parent == null) {
                jSONObject.put("contained_in_scroll_view", z);
                return jSONObject;
            }
            z = true;
            jSONObject.put("contained_in_scroll_view", z);
            return jSONObject;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        ViewParent parent2 = view.getParent();
        while (parent2 != null && !(parent2 instanceof AdapterView)) {
            parent2 = parent2.getParent();
        }
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
    */
    public static JSONObject zzg(Context context, View view) {
        String str;
        int hashCode;
        char c;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        if (view == null) {
            return jSONObject2;
        }
        try {
            int[] zzj = zzj(view);
            int[] iArr = {view.getMeasuredWidth(), view.getMeasuredHeight()};
            for (ViewParent parent = view.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                iArr[0] = Math.min(viewGroup.getMeasuredWidth(), iArr[0]);
                iArr[1] = Math.min(viewGroup.getMeasuredHeight(), iArr[1]);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, view.getMeasuredWidth()));
            jSONObject3.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, view.getMeasuredHeight()));
            jSONObject3.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj[0]));
            jSONObject3.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj[1]));
            jSONObject3.put("maximum_visible_width", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, iArr[0]));
            jSONObject3.put("maximum_visible_height", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, iArr[1]));
            jSONObject3.put("relative_to", "window");
            jSONObject2.put("frame", jSONObject3);
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                jSONObject = m1343a(context, rect);
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("width", 0);
                jSONObject4.put("height", 0);
                jSONObject4.put("x", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj[0]));
                jSONObject4.put("y", com.google.android.gms.ads.internal.client.zzay.zzb().m24825g(context, zzj[1]));
                jSONObject4.put("relative_to", "window");
                jSONObject = jSONObject4;
            }
            jSONObject2.put("visible_bounds", jSONObject);
        } catch (Exception unused) {
            k04.zzj("Unable to get native ad view bounding box");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10427G5)).booleanValue()) {
            ViewParent parent2 = view.getParent();
            if (parent2 != null) {
                try {
                    str = (String) parent2.getClass().getMethod("getTemplateTypeName", new Class[0]).invoke(parent2, new Object[0]);
                } catch (IllegalAccessException e) {
                    e = e;
                    k04.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i = 1;
                    if (c != 0) {
                    }
                    jSONObject2.put("native_template_type", i);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10684f7)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (NoSuchMethodException unused2) {
                } catch (SecurityException e2) {
                    e = e2;
                    k04.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i2 = 1;
                    if (c != 0) {
                    }
                    jSONObject2.put("native_template_type", i2);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10684f7)).booleanValue()) {
                    }
                    return jSONObject2;
                } catch (InvocationTargetException e3) {
                    e = e3;
                    k04.zzh("Cannot access method getTemplateTypeName: ", e);
                    str = "";
                    hashCode = str.hashCode();
                    if (hashCode != -2066603854) {
                    }
                    int i22 = 1;
                    if (c != 0) {
                    }
                    jSONObject2.put("native_template_type", i22);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10684f7)).booleanValue()) {
                    }
                    return jSONObject2;
                }
                hashCode = str.hashCode();
                if (hashCode != -2066603854) {
                    if (hashCode == 2019754500 && str.equals("medium_template")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals("small_template")) {
                        c = 0;
                    }
                    c = 65535;
                }
                int i222 = 1;
                if (c != 0) {
                    if (c != 1) {
                        jSONObject2.put("native_template_type", 0);
                    } else {
                        i222 = 2;
                    }
                }
                jSONObject2.put("native_template_type", i222);
            }
            str = "";
            hashCode = str.hashCode();
            if (hashCode != -2066603854) {
            }
            int i2222 = 1;
            if (c != 0) {
            }
            jSONObject2.put("native_template_type", i2222);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10684f7)).booleanValue()) {
            try {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                jSONObject2.put("view_width_layout_type", m1342b(layoutParams.width) - 1);
                jSONObject2.put("view_height_layout_type", m1342b(layoutParams.height) - 1);
            } catch (Exception unused3) {
                zze.zza("Unable to get native ad view layout types");
            }
        }
        return jSONObject2;
    }

    public static boolean zzh(Context context, th6 th6Var) {
        if (th6Var.f27668O) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10717i7)).booleanValue()) {
                return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10750l7)).booleanValue();
            }
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10728j7);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : fz6.m22122c(by6.m25734b(';')).m22121d(str)) {
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10594X2)).booleanValue()) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().m23658b(g93.f10604Y2)).booleanValue() || i <= 15299999;
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
