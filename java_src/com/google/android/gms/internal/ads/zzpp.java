package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzpp extends zzqg implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    static final String[] zzbjs = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private zzoz zzbij;
    private View zzbjx;
    private final WeakReference<View> zzbke;
    private final Object mLock = new Object();
    private final Map<String, WeakReference<View>> zzbkf = new HashMap();
    private final Map<String, WeakReference<View>> zzbkg = new HashMap();
    private final Map<String, WeakReference<View>> zzbkh = new HashMap();
    private Point zzbjz = new Point();
    private Point zzbka = new Point();
    private WeakReference<zzfp> zzbkb = new WeakReference<>(null);

    public zzpp(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.zzbke = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzbkf.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzbkh.putAll(this.zzbkf);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzbkg.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
            }
        }
        this.zzbkh.putAll(this.zzbkg);
        zznk.initialize(view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzpd zzpdVar) {
        View view;
        synchronized (this.mLock) {
            String[] strArr = zzbjs;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    view = null;
                    break;
                }
                WeakReference<View> weakReference = this.zzbkh.get(strArr[i]);
                if (weakReference != null) {
                    view = weakReference.get();
                    break;
                }
                i++;
            }
            if (!(view instanceof FrameLayout)) {
                zzpdVar.zzkq();
                return;
            }
            zzpr zzprVar = new zzpr(this, view);
            if (zzpdVar instanceof zzoy) {
                zzpdVar.zzb(view, zzprVar);
            } else {
                zzpdVar.zza(view, zzprVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zza(String[] strArr) {
        for (String str : strArr) {
            if (this.zzbkf.get(str) != null) {
                return true;
            }
        }
        for (String str2 : strArr) {
            if (this.zzbkg.get(str2) != null) {
                return false;
            }
        }
        return false;
    }

    private final void zzl(View view) {
        synchronized (this.mLock) {
            if (this.zzbij != null) {
                zzoz zzkn = this.zzbij instanceof zzoy ? ((zzoy) this.zzbij).zzkn() : this.zzbij;
                if (zzkn != null) {
                    zzkn.zzl(view);
                }
            }
        }
    }

    private final int zzv(int i) {
        int zzb;
        synchronized (this.mLock) {
            zzkb.zzif();
            zzb = zzamu.zzb(this.zzbij.getContext(), i);
        }
        return zzb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzoz zzozVar;
        String str;
        Map<String, WeakReference<View>> map;
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return;
            }
            View view2 = this.zzbke.get();
            if (view2 == null) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("x", zzv(this.zzbjz.x));
            bundle.putFloat("y", zzv(this.zzbjz.y));
            bundle.putFloat("start_x", zzv(this.zzbka.x));
            bundle.putFloat("start_y", zzv(this.zzbka.y));
            if (this.zzbjx == null || !this.zzbjx.equals(view)) {
                this.zzbij.zza(view, this.zzbkh, bundle, view2);
            } else {
                if (!(this.zzbij instanceof zzoy)) {
                    zzozVar = this.zzbij;
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbkh;
                } else if (((zzoy) this.zzbij).zzkn() != null) {
                    zzozVar = ((zzoy) this.zzbij).zzkn();
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbkh;
                }
                zzozVar.zza(view, str, bundle, map, view2);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view;
        synchronized (this.mLock) {
            if (this.zzbij != null && (view = this.zzbke.get()) != null) {
                this.zzbij.zzc(view, this.zzbkh);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        View view;
        synchronized (this.mLock) {
            if (this.zzbij != null && (view = this.zzbke.get()) != null) {
                this.zzbij.zzc(view, this.zzbkh);
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return false;
            }
            View view2 = this.zzbke.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - iArr[0]), (int) (motionEvent.getRawY() - iArr[1]));
            this.zzbjz = point;
            if (motionEvent.getAction() == 0) {
                this.zzbka = point;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(point.x, point.y);
            this.zzbij.zzd(obtain);
            obtain.recycle();
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void unregisterNativeAd() {
        synchronized (this.mLock) {
            this.zzbjx = null;
            this.zzbij = null;
            this.zzbjz = null;
            this.zzbka = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zza(IObjectWrapper iObjectWrapper) {
        int i;
        KeyEvent.Callback callback;
        synchronized (this.mLock) {
            zzl(null);
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof zzpd)) {
                zzakb.zzdk("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            zzpd zzpdVar = (zzpd) unwrap;
            if (!zzpdVar.zzkk()) {
                zzakb.e("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            View view = this.zzbke.get();
            if (this.zzbij != null && view != null && ((Boolean) zzkb.zzik().zzd(zznk.zzbbu)).booleanValue()) {
                this.zzbij.zzb(view, this.zzbkh);
            }
            synchronized (this.mLock) {
                i = 0;
                if (this.zzbij instanceof zzpd) {
                    zzpd zzpdVar2 = (zzpd) this.zzbij;
                    View view2 = this.zzbke.get();
                    if (zzpdVar2 != null && zzpdVar2.getContext() != null && view2 != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(view2.getContext())) {
                        zzaix zzks = zzpdVar2.zzks();
                        if (zzks != null) {
                            zzks.zzx(false);
                        }
                        zzfp zzfpVar = this.zzbkb.get();
                        if (zzfpVar != null && zzks != null) {
                            zzfpVar.zzb(zzks);
                        }
                    }
                }
            }
            if ((this.zzbij instanceof zzoy) && ((zzoy) this.zzbij).zzkm()) {
                ((zzoy) this.zzbij).zzc(zzpdVar);
            } else {
                this.zzbij = zzpdVar;
                if (zzpdVar instanceof zzoy) {
                    ((zzoy) zzpdVar).zzc(null);
                }
            }
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
            while (true) {
                if (i >= 2) {
                    callback = null;
                    break;
                }
                WeakReference<View> weakReference = this.zzbkh.get(strArr[i]);
                if (weakReference != null) {
                    callback = (View) weakReference.get();
                    break;
                }
                i++;
            }
            if (callback == null) {
                zzakb.zzdk("Ad choices asset view is not provided.");
            } else {
                ViewGroup viewGroup = callback instanceof ViewGroup ? (ViewGroup) callback : null;
                if (viewGroup != null) {
                    View zza = zzpdVar.zza((View.OnClickListener) this, true);
                    this.zzbjx = zza;
                    if (zza != null) {
                        this.zzbkh.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbjx));
                        this.zzbkf.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbjx));
                        viewGroup.removeAllViews();
                        viewGroup.addView(this.zzbjx);
                    }
                }
            }
            zzpdVar.zza(view, this.zzbkf, this.zzbkg, this, this);
            zzakk.zzcrm.post(new zzpq(this, zzpdVar));
            zzl(view);
            this.zzbij.zzj(view);
            synchronized (this.mLock) {
                if (this.zzbij instanceof zzpd) {
                    zzpd zzpdVar3 = (zzpd) this.zzbij;
                    View view3 = this.zzbke.get();
                    if (zzpdVar3 != null && zzpdVar3.getContext() != null && view3 != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(view3.getContext())) {
                        zzfp zzfpVar2 = this.zzbkb.get();
                        if (zzfpVar2 == null) {
                            zzfpVar2 = new zzfp(view3.getContext(), view3);
                            this.zzbkb = new WeakReference<>(zzfpVar2);
                        }
                        zzfpVar2.zza(zzpdVar3.zzks());
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqf
    public final void zzc(IObjectWrapper iObjectWrapper) {
        synchronized (this.mLock) {
            this.zzbij.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }
}
