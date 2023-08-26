package com.google.android.gms.ads.internal.gmsg;

import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzaf implements zzv<Object> {
    private final Object mLock = new Object();
    private final Map<String, zzag> zzbnf = new HashMap();

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        String concat;
        String str = map.get(TtmlNode.ATTR_ID);
        String str2 = map.get("fail");
        String str3 = map.get("fail_reason");
        String str4 = map.get("fail_stack");
        String str5 = map.get("result");
        if (TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String valueOf = String.valueOf(str4);
            concat = valueOf.length() != 0 ? "\n".concat(valueOf) : new String("\n");
        }
        synchronized (this.mLock) {
            zzag remove = this.zzbnf.remove(str);
            if (remove == null) {
                String valueOf2 = String.valueOf(str);
                zzakb.zzdk(valueOf2.length() != 0 ? "Received result for unexpected method invocation: ".concat(valueOf2) : new String("Received result for unexpected method invocation: "));
            } else if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(str3);
                String valueOf4 = String.valueOf(concat);
                remove.zzau(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str5 == null) {
                remove.zzd(null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    if (zzakb.zzqp()) {
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        zzakb.v(valueOf5.length() != 0 ? "Result GMSG: ".concat(valueOf5) : new String("Result GMSG: "));
                    }
                    remove.zzd(jSONObject);
                } catch (JSONException e) {
                    remove.zzau(e.getMessage());
                }
            }
        }
    }

    public final void zza(String str, zzag zzagVar) {
        synchronized (this.mLock) {
            this.zzbnf.put(str, zzagVar);
        }
    }
}
