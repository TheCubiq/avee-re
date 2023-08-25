package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.daaw.j01;
import com.daaw.xb;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
/* loaded from: classes2.dex */
public final class yx2 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent == null) {
            l("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return n(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int b(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                k(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                concat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
            }
        }
        l(str, concat);
        return 6;
    }

    public static Bundle c(c0 c0Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle d(tb tbVar, boolean z, boolean z2, boolean z3, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (tbVar.b() != 0) {
            bundle.putInt("prorationMode", tbVar.b());
        }
        if (!TextUtils.isEmpty(tbVar.c())) {
            bundle.putString("accountId", tbVar.c());
        }
        if (!TextUtils.isEmpty(tbVar.d())) {
            bundle.putString("obfuscatedProfileId", tbVar.d());
        }
        if (tbVar.o()) {
            bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
        }
        if (!TextUtils.isEmpty(tbVar.e())) {
            bundle.putString("oldSkuPurchaseToken", tbVar.e());
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

    public static Bundle e(String str, ArrayList arrayList, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            j01.b bVar = (j01.b) arrayList.get(i);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }

    public static Bundle f(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static xb g(Intent intent, String str) {
        if (intent != null) {
            xb.a c = xb.c();
            c.c(b(intent.getExtras(), str));
            c.b(h(intent.getExtras(), str));
            return c.a();
        }
        l("BillingHelper", "Got null intent!");
        xb.a c2 = xb.c();
        c2.c(6);
        c2.b("An internal error occurred.");
        return c2.a();
    }

    public static String h(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            k(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            l(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static String i(int i) {
        return b32.a(i).toString();
    }

    public static List j(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase o = o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (o == null) {
                k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(o);
        } else {
            int size = stringArrayList.size();
            k("BillingHelper", "Found purchase list of " + size + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase o2 = o(stringArrayList.get(i), stringArrayList2.get(i));
                if (o2 != null) {
                    arrayList.add(o2);
                }
            }
        }
        return arrayList;
    }

    public static void k(String str, String str2) {
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

    public static void l(String str, String str2) {
    }

    public static void m(String str, String str2, Throwable th) {
    }

    public static int n(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    public static Purchase o(String str, String str2) {
        if (str == null || str2 == null) {
            k("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            l("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}
