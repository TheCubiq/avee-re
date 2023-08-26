package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzasc;
import com.google.android.gms.internal.ads.zzasd;
import com.google.android.gms.internal.ads.zzoo;
import com.google.android.gms.internal.ads.zzoq;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.ads.zzpx;
import com.google.android.gms.internal.ads.zzxe;
import com.google.android.gms.internal.ads.zzxz;
import com.google.android.gms.internal.ads.zzyc;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> zza(zzxz zzxzVar, zzyc zzycVar, zzac zzacVar) {
        return new zzax(zzxzVar, zzacVar, zzycVar);
    }

    private static String zza(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzakb.zzdk("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String zza(zzpw zzpwVar) {
        if (zzpwVar == null) {
            zzakb.zzdk("Image is null. Returning empty string");
            return "";
        }
        try {
            Uri uri = zzpwVar.getUri();
            if (uri != null) {
                return uri.toString();
            }
        } catch (RemoteException unused) {
            zzakb.zzdk("Unable to get image uri. Trying data uri next");
        }
        return zzb(zzpwVar);
    }

    private static JSONObject zza(Bundle bundle, String str) throws JSONException {
        String valueOf;
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (bundle != null && !TextUtils.isEmpty(str)) {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (bundle.containsKey(next)) {
                    if ("image".equals(jSONObject2.getString(next))) {
                        Object obj = bundle.get(next);
                        if (obj instanceof Bitmap) {
                            valueOf = zza((Bitmap) obj);
                            jSONObject.put(next, valueOf);
                        } else {
                            str2 = "Invalid type. An image type extra should return a bitmap";
                            zzakb.zzdk(str2);
                        }
                    } else if (bundle.get(next) instanceof Bitmap) {
                        str2 = "Invalid asset type. Bitmap should be returned only for image type";
                        zzakb.zzdk(str2);
                    } else {
                        valueOf = String.valueOf(bundle.get(next));
                        jSONObject.put(next, valueOf);
                    }
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzoo zzooVar, String str, zzaqw zzaqwVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", zzooVar.getHeadline());
            jSONObject.put(TtmlNode.TAG_BODY, zzooVar.getBody());
            jSONObject.put("call_to_action", zzooVar.getCallToAction());
            jSONObject.put(FirebaseAnalytics.Param.PRICE, zzooVar.getPrice());
            jSONObject.put("star_rating", String.valueOf(zzooVar.getStarRating()));
            jSONObject.put("store", zzooVar.getStore());
            jSONObject.put("icon", zza(zzooVar.zzjz()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = zzooVar.getImages();
            if (images != null) {
                for (Object obj : images) {
                    jSONArray.put(zza(zzd(obj)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(zzooVar.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "2");
            zzaqwVar.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzakb.zzc("Exception occurred when loading assets", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(zzoq zzoqVar, String str, zzaqw zzaqwVar, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("headline", zzoqVar.getHeadline());
            jSONObject.put(TtmlNode.TAG_BODY, zzoqVar.getBody());
            jSONObject.put("call_to_action", zzoqVar.getCallToAction());
            jSONObject.put("advertiser", zzoqVar.getAdvertiser());
            jSONObject.put("logo", zza(zzoqVar.zzkg()));
            JSONArray jSONArray = new JSONArray();
            List<Object> images = zzoqVar.getImages();
            if (images != null) {
                for (Object obj : images) {
                    jSONArray.put(zza(zzd(obj)));
                }
            }
            jSONObject.put("images", jSONArray);
            jSONObject.put("extras", zza(zzoqVar.getExtras(), str));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("assets", jSONObject);
            jSONObject2.put("template_id", "1");
            zzaqwVar.zzb("google.afma.nativeExpressAds.loadAssets", jSONObject2);
        } catch (JSONException e) {
            zzakb.zzc("Exception occurred when loading assets", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean zza(final zzaqw zzaqwVar, zzxe zzxeVar, CountDownLatch countDownLatch) {
        View view;
        String str;
        zzasc zzuf;
        zzasd zzasdVar;
        boolean z = false;
        try {
            view = zzaqwVar.getView();
        } catch (RemoteException e) {
            zzakb.zzc("Unable to invoke load assets", e);
        } catch (RuntimeException e2) {
            countDownLatch.countDown();
            throw e2;
        }
        if (view == null) {
            str = "AdWebView is null";
        } else {
            view.setVisibility(4);
            List<String> list = zzxeVar.zzbtw.zzbsi;
            if (list != null && !list.isEmpty()) {
                zzaqwVar.zza("/nativeExpressAssetsLoaded", new zzav(countDownLatch));
                zzaqwVar.zza("/nativeExpressAssetsLoadingFailed", new zzaw(countDownLatch));
                zzxz zzmo = zzxeVar.zzbtx.zzmo();
                zzyc zzmp = zzxeVar.zzbtx.zzmp();
                if (list.contains("2") && zzmo != null) {
                    final zzoo zzooVar = new zzoo(zzmo.getHeadline(), zzmo.getImages(), zzmo.getBody(), zzmo.zzjz(), zzmo.getCallToAction(), zzmo.getStarRating(), zzmo.getStore(), zzmo.getPrice(), null, zzmo.getExtras(), null, zzmo.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmo.zzmw()) : null, zzmo.zzke(), null);
                    final String str2 = zzxeVar.zzbtw.zzbsh;
                    zzuf = zzaqwVar.zzuf();
                    zzasdVar = new zzasd(zzooVar, str2, zzaqwVar) { // from class: com.google.android.gms.ads.internal.zzat
                        private final zzoo zzzn;
                        private final String zzzo;
                        private final zzaqw zzzp;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzzn = zzooVar;
                            this.zzzo = str2;
                            this.zzzp = zzaqwVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzasd
                        public final void zze(boolean z2) {
                            zzas.zza(this.zzzn, this.zzzo, this.zzzp, z2);
                        }
                    };
                } else if (!list.contains("1") || zzmp == null) {
                    str = "No matching template id and mapper";
                } else {
                    final zzoq zzoqVar = new zzoq(zzmp.getHeadline(), zzmp.getImages(), zzmp.getBody(), zzmp.zzkg(), zzmp.getCallToAction(), zzmp.getAdvertiser(), null, zzmp.getExtras(), null, zzmp.zzmw() != null ? (View) ObjectWrapper.unwrap(zzmp.zzmw()) : null, zzmp.zzke(), null);
                    final String str3 = zzxeVar.zzbtw.zzbsh;
                    zzuf = zzaqwVar.zzuf();
                    zzasdVar = new zzasd(zzoqVar, str3, zzaqwVar) { // from class: com.google.android.gms.ads.internal.zzau
                        private final String zzzo;
                        private final zzaqw zzzp;
                        private final zzoq zzzq;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzzq = zzoqVar;
                            this.zzzo = str3;
                            this.zzzp = zzaqwVar;
                        }

                        @Override // com.google.android.gms.internal.ads.zzasd
                        public final void zze(boolean z2) {
                            zzas.zza(this.zzzq, this.zzzo, this.zzzp, z2);
                        }
                    };
                }
                zzuf.zza(zzasdVar);
                String str4 = zzxeVar.zzbtw.zzbsf;
                String str5 = zzxeVar.zzbtw.zzbsg;
                if (str5 != null) {
                    zzaqwVar.loadDataWithBaseURL(str5, str4, "text/html", "UTF-8", null);
                } else {
                    zzaqwVar.loadData(str4, "text/html", "UTF-8");
                }
                z = true;
                if (!z) {
                    countDownLatch.countDown();
                }
                return z;
            }
            str = "No template ids present in mediation response";
        }
        zzakb.zzdk(str);
        if (!z) {
        }
        return z;
    }

    private static String zzb(zzpw zzpwVar) {
        String str;
        IObjectWrapper zzjy;
        try {
            zzjy = zzpwVar.zzjy();
        } catch (RemoteException unused) {
            str = "Unable to get drawable. Returning empty string";
        }
        if (zzjy == null) {
            zzakb.zzdk("Drawable is null. Returning empty string");
            return "";
        }
        Drawable drawable = (Drawable) ObjectWrapper.unwrap(zzjy);
        if (drawable instanceof BitmapDrawable) {
            return zza(((BitmapDrawable) drawable).getBitmap());
        }
        str = "Drawable is not an instance of BitmapDrawable. Returning empty string";
        zzakb.zzdk(str);
        return "";
    }

    private static zzpw zzd(Object obj) {
        if (obj instanceof IBinder) {
            return zzpx.zzh((IBinder) obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(zzaqw zzaqwVar) {
        View.OnClickListener onClickListener = zzaqwVar.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(zzaqwVar.getView());
        }
    }

    public static View zze(zzajh zzajhVar) {
        if (zzajhVar == null) {
            zzakb.e("AdState is null");
            return null;
        } else if (!zzf(zzajhVar) || zzajhVar.zzbyo == null) {
            try {
                IObjectWrapper view = zzajhVar.zzbtx != null ? zzajhVar.zzbtx.getView() : null;
                if (view == null) {
                    zzakb.zzdk("View in mediation adapter is null.");
                    return null;
                }
                return (View) ObjectWrapper.unwrap(view);
            } catch (RemoteException e) {
                zzakb.zzc("Could not get View from mediation adapter.", e);
                return null;
            }
        } else {
            return zzajhVar.zzbyo.getView();
        }
    }

    public static boolean zzf(zzajh zzajhVar) {
        return (zzajhVar == null || !zzajhVar.zzceq || zzajhVar.zzbtw == null || zzajhVar.zzbtw.zzbsf == null) ? false : true;
    }
}
