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
    public final Context a;
    public final ApplicationInfo b;
    public String e = "";
    public final int c = ((Integer) zzba.zzc().b(g93.k8)).intValue();
    public final int d = ((Integer) zzba.zzc().b(g93.l8)).intValue();

    public kg5(Context context) {
        this.a = context;
        this.b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        Drawable drawable;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", ez1.a(this.a).d(this.b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.b.packageName);
        zzt.zzp();
        jSONObject.put("adMobAppId", zzs.zzo(this.a));
        if (this.e.isEmpty()) {
            try {
                drawable = ez1.a(this.a).e(this.b.packageName).b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.c, this.d);
                Bitmap createBitmap = Bitmap.createBitmap(this.c, this.d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.e = encodeToString;
        }
        if (!this.e.isEmpty()) {
            jSONObject.put("icon", this.e);
            jSONObject.put("iconWidthPx", this.c);
            jSONObject.put("iconHeightPx", this.d);
        }
        return jSONObject;
    }
}
