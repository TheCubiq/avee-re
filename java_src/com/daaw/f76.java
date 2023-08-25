package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class f76 implements i76 {

    /* renamed from: a */
    public final g77 f9217a;

    /* renamed from: b */
    public final Context f9218b;

    public f76(g77 g77Var, Context context) {
        this.f9217a = g77Var;
        this.f9218b = context;
    }

    /* renamed from: a */
    public static Bundle m22875a(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final /* synthetic */ h76 m22874b() {
        String str = (String) zzba.zzc().m23658b(g93.f10365A5);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            final Bundle m22875a = m22875a(this.f9218b, new JSONArray(str));
            return new h76() { // from class: com.daaw.e76
                @Override // com.daaw.h76
                /* renamed from: b */
                public final void mo2851b(Object obj) {
                    ((Bundle) obj).putBundle("shared_pref", m22875a);
                }
            };
        } catch (JSONException e) {
            k04.zzf("JSON parsing error", e);
            return null;
        }
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 37;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.f9217a.mo20112M(new Callable() { // from class: com.daaw.d76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f76.this.m22874b();
            }
        });
    }
}
