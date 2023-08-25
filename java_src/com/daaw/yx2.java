package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.daaw.C3518xb;
import com.daaw.j01;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class yx2 {

    /* renamed from: a */
    public static final int f34243a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static int m3105a(Intent intent, String str) {
        if (intent == null) {
            m3094l("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return m3092n(intent.getExtras(), "ProxyBillingActivity");
    }

    /* renamed from: b */
    public static int m3104b(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                m3095k(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                concat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
            }
        }
        m3094l(str, concat);
        return 6;
    }

    /* renamed from: c */
    public static Bundle m3103c(C0902c0 c0902c0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    /* renamed from: d */
    public static Bundle m3102d(C3030tb c3030tb, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (c3030tb.m9414b() != 0) {
            bundle.putInt("prorationMode", c3030tb.m9414b());
        }
        if (!TextUtils.isEmpty(c3030tb.m9413c())) {
            bundle.putString("accountId", c3030tb.m9413c());
        }
        if (!TextUtils.isEmpty(c3030tb.m9412d())) {
            bundle.putString("obfuscatedProfileId", c3030tb.m9412d());
        }
        if (c3030tb.m9401o()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(c3030tb.m9411e())) {
            bundle.putString("oldSkuPurchaseToken", c3030tb.m9411e());
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("oldSkuPurchaseId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("originalExternalTransactionId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("paymentsPurchaseParams", null);
        }
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (z3) {
            bundle.putBoolean("enableAlternativeBilling", true);
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle m3101e(String str, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            j01.C1777b c1777b = (j01.C1777b) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }

    /* renamed from: f */
    public static Bundle m3100f(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    /* renamed from: g */
    public static C3518xb m3099g(Intent intent, String str) {
        if (intent != null) {
            C3518xb.C3519a m5323c = C3518xb.m5323c();
            m5323c.m5318c(m3104b(intent.getExtras(), str));
            m5323c.m5319b(m3098h(intent.getExtras(), str));
            return m5323c.m5320a();
        }
        m3094l("BillingHelper", "Got null intent!");
        C3518xb.C3519a m5323c2 = C3518xb.m5323c();
        m5323c2.m5318c(6);
        m5323c2.m5319b("An internal error occurred.");
        return m5323c2.m5320a();
    }

    /* renamed from: h */
    public static String m3098h(Bundle bundle, String str) {
        if (bundle == null) {
            m3094l(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            m3095k(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            m3094l(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    /* renamed from: i */
    public static String m3097i(int i) {
        return b32.m26498a(i).toString();
    }

    /* renamed from: j */
    public static List m3096j(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase m3091o = m3091o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (m3091o == null) {
                m3095k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(m3091o);
        } else {
            int size = stringArrayList.size();
            m3095k("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase m3091o2 = m3091o(stringArrayList.get(i), stringArrayList2.get(i));
                if (m3091o2 != null) {
                    arrayList.add(m3091o2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static void m3095k(String str, String str2) {
        if (!Log.isLoggable(str, 2) || str2.isEmpty()) {
            return;
        }
        int i = 40000;
        while (!str2.isEmpty() && i > 0) {
            int min = Math.min(str2.length(), Math.min(4000, i));
            str2.substring(0, min);
            str2 = str2.substring(min);
            i -= min;
        }
    }

    /* renamed from: l */
    public static void m3094l(String str, String str2) {
    }

    /* renamed from: m */
    public static void m3093m(String str, String str2, Throwable th) {
    }

    /* renamed from: n */
    public static int m3092n(Bundle bundle, String str) {
        if (bundle == null) {
            m3094l(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    /* renamed from: o */
    public static Purchase m3091o(String str, String str2) {
        if (str == null || str2 == null) {
            m3095k("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            m3094l("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
