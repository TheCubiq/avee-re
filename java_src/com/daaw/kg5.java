package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class kg5 {

    /* renamed from: a */
    public final Context f16365a;

    /* renamed from: b */
    public final ApplicationInfo f16366b;

    /* renamed from: e */
    public String f16369e = "";

    /* renamed from: c */
    public final int f16367c = ((Integer) zzba.zzc().m23658b(g93.f10740k8)).intValue();

    /* renamed from: d */
    public final int f16368d = ((Integer) zzba.zzc().m23658b(g93.f10751l8)).intValue();

    public kg5(Context context) {
        this.f16365a = context;
        this.f16366b = context.getApplicationInfo();
    }

    /* renamed from: a */
    public final JSONObject m17754a() {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", ez1.m22979a(this.f16365a).m19343d(this.f16366b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f16366b.packageName);
        zzt.zzp();
        jSONObject.put("adMobAppId", zzs.zzo(this.f16365a));
        if (this.f16369e.isEmpty()) {
            try {
                drawable = ez1.m22979a(this.f16365a).m19342e(this.f16366b.packageName).f22031b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f16367c, this.f16368d);
                Bitmap createBitmap = Bitmap.createBitmap(this.f16367c, this.f16368d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f16369e = encodeToString;
        }
        if (!this.f16369e.isEmpty()) {
            jSONObject.put("icon", this.f16369e);
            jSONObject.put("iconWidthPx", this.f16367c);
            jSONObject.put("iconHeightPx", this.f16368d);
        }
        return jSONObject;
    }
}
