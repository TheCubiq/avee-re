package com.daaw;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class ux5 {

    /* renamed from: a */
    public final String f29604a;

    /* renamed from: b */
    public final Bundle f29605b;

    /* renamed from: c */
    public Bundle f29606c;

    /* renamed from: d */
    public final /* synthetic */ l36 f29607d;

    public ux5(l36 l36Var, String str, Bundle bundle) {
        this.f29607d = l36Var;
        ry0.m10834f("default_event_parameters");
        this.f29604a = "default_event_parameters";
        this.f29605b = new Bundle();
    }

    /* renamed from: a */
    public final Bundle m7652a() {
        char c;
        if (this.f29606c == null) {
            String string = this.f29607d.m17176n().getString(this.f29604a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c = 1;
                                }
                                c = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c = 0;
                                }
                                c = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c = 2;
                                }
                                c = 65535;
                            }
                            if (c == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c != 2) {
                                this.f29607d.f25143a.mo3895i().m14160q().m20652b("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.f29607d.f25143a.mo3895i().m14160q().m20653a("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f29606c = bundle;
                } catch (JSONException unused2) {
                    this.f29607d.f25143a.mo3895i().m14160q().m20653a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f29606c == null) {
                this.f29606c = this.f29605b;
            }
        }
        return this.f29606c;
    }

    /* renamed from: b */
    public final void m7651b(Bundle bundle) {
        String str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.f29607d.m17176n().edit();
        if (bundle.size() == 0) {
            edit.remove(this.f29604a);
        } else {
            String str2 = this.f29604a;
            JSONArray jSONArray = new JSONArray();
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str3);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            str = "s";
                        } else if (obj instanceof Long) {
                            str = "l";
                        } else if (obj instanceof Double) {
                            str = "d";
                        } else {
                            this.f29607d.f25143a.mo3895i().m14160q().m20652b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONObject.put("t", str);
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        this.f29607d.f25143a.mo3895i().m14160q().m20652b("Cannot serialize bundle value to SharedPreferences", e);
                    }
                }
            }
            edit.putString(str2, jSONArray.toString());
        }
        edit.apply();
        this.f29606c = bundle;
    }
}
