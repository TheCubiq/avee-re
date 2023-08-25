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
    public final Context a;
    public final m03 b;
    public final PowerManager c;

    public wg4(Context context, m03 m03Var) {
        this.a = context;
        this.b = m03Var;
        this.c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.daaw.ql3
    /* renamed from: b */
    public final JSONObject a(zg4 zg4Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        p03 p03Var = zg4Var.f;
        if (p03Var == null) {
            jSONObject = new JSONObject();
        } else if (this.b.d() == null) {
            throw new JSONException("Active view Info cannot be null.");
        } else {
            boolean z = p03Var.a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.b.b()).put("activeViewJSON", this.b.d()).put("timestamp", zg4Var.d).put("adFormat", this.b.a()).put("hashCode", this.b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", zg4Var.b).put("isNative", this.b.e()).put("isScreenOn", Build.VERSION.SDK_INT >= 20 ? this.c.isInteractive() : this.c.isScreenOn()).put("appMuted", zzt.zzr().zze()).put("appVolume", zzt.zzr().zza()).put("deviceVolume", zzab.zzb(this.a.getApplicationContext()));
            if (((Boolean) zzba.zzc().b(g93.f5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.a.getApplicationContext().getSystemService("audio");
                Integer valueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", p03Var.b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", p03Var.c.top).put("bottom", p03Var.c.bottom).put("left", p03Var.c.left).put("right", p03Var.c.right)).put("adBox", new JSONObject().put("top", p03Var.d.top).put("bottom", p03Var.d.bottom).put("left", p03Var.d.left).put("right", p03Var.d.right)).put("globalVisibleBox", new JSONObject().put("top", p03Var.e.top).put("bottom", p03Var.e.bottom).put("left", p03Var.e.left).put("right", p03Var.e.right)).put("globalVisibleBoxVisible", p03Var.f).put("localVisibleBox", new JSONObject().put("top", p03Var.g.top).put("bottom", p03Var.g.bottom).put("left", p03Var.g.left).put("right", p03Var.g.right)).put("localVisibleBoxVisible", p03Var.h).put("hitBox", new JSONObject().put("top", p03Var.i.top).put("bottom", p03Var.i.bottom).put("left", p03Var.i.left).put("right", p03Var.i.right)).put("screenDensity", this.a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zg4Var.a);
            if (((Boolean) zzba.zzc().b(g93.i1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = p03Var.k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zg4Var.e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
