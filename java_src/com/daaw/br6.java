package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class br6 {

    /* renamed from: a */
    public static WindowManager f5078a;

    /* renamed from: b */
    public static final String[] f5079b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f5080c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m25882a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f5080c);
            jSONObject.put("y", i2 / f5080c);
            jSONObject.put("width", i3 / f5080c);
            jSONObject.put("height", i4 / f5080c);
        } catch (JSONException e) {
            cr6.m25051a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m25881b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            cr6.m25051a("Error with setting ad session id", e);
        }
    }

    /* renamed from: c */
    public static void m25880c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m25879d(JSONObject jSONObject, hr6 hr6Var) {
        nq6 m20460a = hr6Var.m20460a();
        JSONArray jSONArray = new JSONArray();
        ArrayList m20459b = hr6Var.m20459b();
        int size = m20459b.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put((String) m20459b.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m20460a.m14872d());
            jSONObject.put("friendlyObstructionPurpose", m20460a.m14875a());
            jSONObject.put("friendlyObstructionReason", m20460a.m14873c());
        } catch (JSONException e) {
            cr6.m25051a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: e */
    public static void m25878e(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            cr6.m25051a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: f */
    public static void m25877f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            cr6.m25051a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: g */
    public static void m25876g(Context context) {
        if (context != null) {
            f5080c = context.getResources().getDisplayMetrics().density;
            f5078a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: h */
    public static void m25875h(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            cr6.m25051a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: i */
    public static void m25874i(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (f5078a != null) {
            Point point = new Point(0, 0);
            f5078a.getDefaultDisplay().getRealSize(point);
            float f3 = f5080c;
            f2 = point.x / f3;
            f = point.y / f3;
        } else {
            f = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m25873j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f5079b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m25872k(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (m25872k(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (m25873j(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m25872k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
