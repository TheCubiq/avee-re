package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class wg4 implements ql3 {

    /* renamed from: a */
    public final Context f31229a;

    /* renamed from: b */
    public final m03 f31230b;

    /* renamed from: c */
    public final PowerManager f31231c;

    public wg4(Context context, m03 m03Var) {
        this.f31229a = context;
        this.f31230b = m03Var;
        this.f31231c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.daaw.ql3
    /* renamed from: b */
    public final JSONObject mo6074a(zg4 zg4Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        p03 p03Var = zg4Var.f35036f;
        if (p03Var == null) {
            jSONObject = new JSONObject();
        } else if (this.f31230b.m16302d() == null) {
            throw new JSONException("Active view Info cannot be null.");
        } else {
            boolean z = p03Var.f22176a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f31230b.m16304b()).put("activeViewJSON", this.f31230b.m16302d()).put("timestamp", zg4Var.f35034d).put("adFormat", this.f31230b.m16305a()).put("hashCode", this.f31230b.m16303c()).put("isMraid", false).put("isStopped", false).put("isPaused", zg4Var.f35032b).put("isNative", this.f31230b.m16301e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.f31231c.isInteractive() : this.f31231c.isScreenOn()).put("appMuted", zzt.zzr().zze()).put("appVolume", zzt.zzr().zza()).put("deviceVolume", zzab.zzb(this.f31229a.getApplicationContext()));
            if (((Boolean) zzba.zzc().m23658b(g93.f10682f5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f31229a.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f31229a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", p03Var.f22177b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", p03Var.f22178c.top).put("bottom", p03Var.f22178c.bottom).put("left", p03Var.f22178c.left).put("right", p03Var.f22178c.right)).put("adBox", new JSONObject().put("top", p03Var.f22179d.top).put("bottom", p03Var.f22179d.bottom).put("left", p03Var.f22179d.left).put("right", p03Var.f22179d.right)).put("globalVisibleBox", new JSONObject().put("top", p03Var.f22180e.top).put("bottom", p03Var.f22180e.bottom).put("left", p03Var.f22180e.left).put("right", p03Var.f22180e.right)).put("globalVisibleBoxVisible", p03Var.f22181f).put("localVisibleBox", new JSONObject().put("top", p03Var.f22182g.top).put("bottom", p03Var.f22182g.bottom).put("left", p03Var.f22182g.left).put("right", p03Var.f22182g.right)).put("localVisibleBoxVisible", p03Var.f22183h).put("hitBox", new JSONObject().put("top", p03Var.f22184i.top).put("bottom", p03Var.f22184i.bottom).put("left", p03Var.f22184i.left).put("right", p03Var.f22184i.right)).put("screenDensity", this.f31229a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zg4Var.f35031a);
            if (((Boolean) zzba.zzc().m23658b(g93.f10711i1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = p03Var.f22186k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zg4Var.f35035e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
