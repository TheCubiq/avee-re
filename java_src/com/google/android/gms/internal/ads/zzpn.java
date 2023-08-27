package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.AdChoicesView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
@zzadh
/* loaded from: classes.dex */
public final class zzpn extends zzqb implements View.OnClickListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final String[] zzbjs = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private zzoz zzbij;
    private final FrameLayout zzbjt;
    private View zzbju;
    private final boolean zzbjv;
    private View zzbjx;
    private FrameLayout zzvh;
    private final Object mLock = new Object();
    private Map<String, WeakReference<View>> zzbjw = Collections.synchronizedMap(new HashMap());
    private boolean zzbjy = false;
    private Point zzbjz = new Point();
    private Point zzbka = new Point();
    private WeakReference<zzfp> zzbkb = new WeakReference<>(null);

    public zzpn(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.zzbjt = frameLayout;
        this.zzvh = frameLayout2;
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza((View) this.zzbjt, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzbv.zzfg();
        zzaor.zza((View) this.zzbjt, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzbjt.setOnTouchListener(this);
        this.zzbjt.setOnClickListener(this);
        if (frameLayout2 != null && PlatformVersion.isAtLeastLollipop()) {
            frameLayout2.setElevation(Float.MAX_VALUE);
        }
        zznk.initialize(this.zzbjt.getContext());
        this.zzbjv = ((Boolean) zzkb.zzik().zzd(zznk.zzbcd)).booleanValue();
    }

    private final void zzkt() {
        synchronized (this.mLock) {
            if (!this.zzbjv && this.zzbjy) {
                int measuredWidth = this.zzbjt.getMeasuredWidth();
                int measuredHeight = this.zzbjt.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0 && this.zzvh != null) {
                    this.zzvh.setLayoutParams(new FrameLayout.LayoutParams(measuredWidth, measuredHeight));
                    this.zzbjy = false;
                }
            }
        }
    }

    private final void zzl(View view) {
        zzoz zzozVar = this.zzbij;
        if (zzozVar != null) {
            if (zzozVar instanceof zzoy) {
                zzozVar = ((zzoy) zzozVar).zzkn();
            }
            if (zzozVar != null) {
                zzozVar.zzl(view);
            }
        }
    }

    private final int zzv(int i) {
        zzkb.zzif();
        return zzamu.zzb(this.zzbij.getContext(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void destroy() {
        synchronized (this.mLock) {
            if (this.zzvh != null) {
                this.zzvh.removeAllViews();
            }
            this.zzvh = null;
            this.zzbjw = null;
            this.zzbjx = null;
            this.zzbij = null;
            this.zzbjz = null;
            this.zzbka = null;
            this.zzbkb = null;
            this.zzbju = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzoz zzozVar;
        String str;
        Map<String, WeakReference<View>> map;
        FrameLayout frameLayout;
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return;
            }
            this.zzbij.cancelUnconfirmedClick();
            Bundle bundle = new Bundle();
            bundle.putFloat("x", zzv(this.zzbjz.x));
            bundle.putFloat("y", zzv(this.zzbjz.y));
            bundle.putFloat("start_x", zzv(this.zzbka.x));
            bundle.putFloat("start_y", zzv(this.zzbka.y));
            if (this.zzbjx == null || !this.zzbjx.equals(view)) {
                this.zzbij.zza(view, this.zzbjw, bundle, this.zzbjt);
            } else {
                if (!(this.zzbij instanceof zzoy)) {
                    zzozVar = this.zzbij;
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbjw;
                    frameLayout = this.zzbjt;
                } else if (((zzoy) this.zzbij).zzkn() != null) {
                    zzozVar = ((zzoy) this.zzbij).zzkn();
                    str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
                    map = this.zzbjw;
                    frameLayout = this.zzbjt;
                }
                zzozVar.zza(view, str, bundle, map, frameLayout);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized (this.mLock) {
            zzkt();
            if (this.zzbij != null) {
                this.zzbij.zzc(this.zzbjt, this.zzbjw);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized (this.mLock) {
            if (this.zzbij != null) {
                this.zzbij.zzc(this.zzbjt, this.zzbjw);
            }
            zzkt();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.mLock) {
            if (this.zzbij == null) {
                return false;
            }
            int[] iArr = new int[2];
            this.zzbjt.getLocationOnScreen(iArr);
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

    /* JADX WARN: Can't wrap try/catch for region: R(16:45|(1:47)|48|(5:50|(3:52|(2:54|(2:57|58)(1:56))|132)|133|59|(16:61|(1:131)(1:64)|65|(3:67|(1:69)|(1:71)(2:72|(1:74)))|75|(4:77|(1:79)|80|(1:82))|83|84|(1:88)|89|1b9|105|106|(3:114|(1:116)|117)|118|119))|134|(0)|131|65|(0)|75|(0)|83|84|(2:86|88)|89|1b9) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0193, code lost:
        com.google.android.gms.ads.internal.zzbv.zzem();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019a, code lost:
        if (com.google.android.gms.internal.ads.zzakq.zzrp() != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019c, code lost:
        com.google.android.gms.internal.ads.zzakb.zzdk("Privileged processes cannot create HTML overlays.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
        com.google.android.gms.internal.ads.zzakb.zzb("Error obtaining overlay.", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ba A[Catch: all -> 0x0252, TRY_ENTER, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x002e, B:17:0x0037, B:19:0x0049, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:28:0x0074, B:30:0x007a, B:31:0x007d, B:34:0x0089, B:35:0x008c, B:37:0x0092, B:39:0x009c, B:43:0x00b0, B:45:0x00b4, B:47:0x00b6, B:49:0x00c8, B:50:0x00cd, B:52:0x00d8, B:54:0x00dc, B:56:0x00ea, B:58:0x00f6, B:61:0x0101, B:63:0x0105, B:69:0x010f, B:71:0x0118, B:73:0x011c, B:75:0x012c, B:76:0x0135, B:78:0x014f, B:79:0x0154, B:81:0x0163, B:83:0x0167, B:84:0x017c, B:86:0x0186, B:87:0x018d, B:90:0x0193, B:92:0x019c, B:93:0x01a2, B:96:0x01aa, B:98:0x01ae, B:99:0x01b7, B:100:0x01b9, B:119:0x01f8, B:121:0x020f, B:123:0x0215, B:125:0x021b, B:127:0x022b, B:129:0x0235, B:130:0x0249, B:131:0x0250, B:59:0x00fd, B:40:0x00a4, B:42:0x00aa, B:101:0x01ba, B:103:0x01c3, B:105:0x01c8, B:107:0x01d4, B:108:0x01db, B:109:0x01de, B:111:0x01e2, B:112:0x01e5, B:114:0x01e7, B:116:0x01f0, B:117:0x01f4), top: B:141:0x0004, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x0255, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x002e, B:17:0x0037, B:19:0x0049, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:28:0x0074, B:30:0x007a, B:31:0x007d, B:34:0x0089, B:35:0x008c, B:37:0x0092, B:39:0x009c, B:43:0x00b0, B:45:0x00b4, B:47:0x00b6, B:49:0x00c8, B:50:0x00cd, B:52:0x00d8, B:54:0x00dc, B:56:0x00ea, B:58:0x00f6, B:61:0x0101, B:63:0x0105, B:69:0x010f, B:71:0x0118, B:73:0x011c, B:75:0x012c, B:76:0x0135, B:78:0x014f, B:79:0x0154, B:81:0x0163, B:83:0x0167, B:84:0x017c, B:86:0x0186, B:87:0x018d, B:90:0x0193, B:92:0x019c, B:93:0x01a2, B:96:0x01aa, B:98:0x01ae, B:99:0x01b7, B:100:0x01b9, B:119:0x01f8, B:121:0x020f, B:123:0x0215, B:125:0x021b, B:127:0x022b, B:129:0x0235, B:130:0x0249, B:131:0x0250, B:59:0x00fd, B:40:0x00a4, B:42:0x00aa, B:101:0x01ba, B:103:0x01c3, B:105:0x01c8, B:107:0x01d4, B:108:0x01db, B:109:0x01de, B:111:0x01e2, B:112:0x01e5, B:114:0x01e7, B:116:0x01f0, B:117:0x01f4), top: B:141:0x0004, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163 A[Catch: all -> 0x0255, TryCatch #1 {, blocks: (B:5:0x0004, B:7:0x000f, B:8:0x0014, B:10:0x0016, B:12:0x001b, B:14:0x001f, B:15:0x002e, B:17:0x0037, B:19:0x0049, B:20:0x0052, B:22:0x0058, B:24:0x005e, B:26:0x0064, B:28:0x0074, B:30:0x007a, B:31:0x007d, B:34:0x0089, B:35:0x008c, B:37:0x0092, B:39:0x009c, B:43:0x00b0, B:45:0x00b4, B:47:0x00b6, B:49:0x00c8, B:50:0x00cd, B:52:0x00d8, B:54:0x00dc, B:56:0x00ea, B:58:0x00f6, B:61:0x0101, B:63:0x0105, B:69:0x010f, B:71:0x0118, B:73:0x011c, B:75:0x012c, B:76:0x0135, B:78:0x014f, B:79:0x0154, B:81:0x0163, B:83:0x0167, B:84:0x017c, B:86:0x0186, B:87:0x018d, B:90:0x0193, B:92:0x019c, B:93:0x01a2, B:96:0x01aa, B:98:0x01ae, B:99:0x01b7, B:100:0x01b9, B:119:0x01f8, B:121:0x020f, B:123:0x0215, B:125:0x021b, B:127:0x022b, B:129:0x0235, B:130:0x0249, B:131:0x0250, B:59:0x00fd, B:40:0x00a4, B:42:0x00aa, B:101:0x01ba, B:103:0x01c3, B:105:0x01c8, B:107:0x01d4, B:108:0x01db, B:109:0x01de, B:111:0x01e2, B:112:0x01e5, B:114:0x01e7, B:116:0x01f0, B:117:0x01f4), top: B:141:0x0004, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(IObjectWrapper iObjectWrapper) {
        ViewGroup viewGroup;
        View zza;
        zzaqw zzaqwVar;
        zzpd zzpdVar;
        View view;
        zzpd zzpdVar2;
        synchronized (this.mLock) {
            View view2 = null;
            zzl(null);
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof zzpd)) {
                zzakb.zzdk("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            int i = 0;
            if (!this.zzbjv && this.zzvh != null) {
                this.zzvh.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                this.zzbjt.requestLayout();
            }
            boolean z = true;
            this.zzbjy = true;
            zzpd zzpdVar3 = (zzpd) unwrap;
            if (this.zzbij != null && ((Boolean) zzkb.zzik().zzd(zznk.zzbbu)).booleanValue()) {
                this.zzbij.zzb(this.zzbjt, this.zzbjw);
            }
            if ((this.zzbij instanceof zzpd) && (zzpdVar2 = (zzpd) this.zzbij) != null && zzpdVar2.getContext() != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext())) {
                zzaix zzks = zzpdVar2.zzks();
                if (zzks != null) {
                    zzks.zzx(false);
                }
                zzfp zzfpVar = this.zzbkb.get();
                if (zzfpVar != null && zzks != null) {
                    zzfpVar.zzb(zzks);
                }
            }
            if ((this.zzbij instanceof zzoy) && ((zzoy) this.zzbij).zzkm()) {
                ((zzoy) this.zzbij).zzc(zzpdVar3);
            } else {
                this.zzbij = zzpdVar3;
                if (zzpdVar3 instanceof zzoy) {
                    ((zzoy) zzpdVar3).zzc(null);
                }
            }
            if (this.zzvh == null) {
                return;
            }
            if (((Boolean) zzkb.zzik().zzd(zznk.zzbbu)).booleanValue()) {
                this.zzvh.setClickable(false);
            }
            this.zzvh.removeAllViews();
            boolean zzkj = zzpdVar3.zzkj();
            if (zzkj) {
                if (this.zzbjw != null) {
                    String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
                    for (int i2 = 0; i2 < 2; i2++) {
                        WeakReference<View> weakReference = this.zzbjw.get(strArr[i2]);
                        if (weakReference != null) {
                            view = weakReference.get();
                            break;
                        }
                    }
                }
                view = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                    if (zzkj || viewGroup == null) {
                        z = false;
                    }
                    zza = zzpdVar3.zza(this, z);
                    this.zzbjx = zza;
                    if (zza != null) {
                        if (this.zzbjw != null) {
                            this.zzbjw.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference<>(this.zzbjx));
                        }
                        if (z) {
                            viewGroup.removeAllViews();
                            viewGroup.addView(this.zzbjx);
                        } else {
                            AdChoicesView adChoicesView = new AdChoicesView(zzpdVar3.getContext());
                            adChoicesView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            adChoicesView.addView(this.zzbjx);
                            if (this.zzvh != null) {
                                this.zzvh.addView(adChoicesView);
                            }
                        }
                    }
                    zzpdVar3.zza(this.zzbjt, this.zzbjw, (Map<String, WeakReference<View>>) null, this, this);
                    if (this.zzbjv) {
                        if (this.zzbju == null) {
                            View view3 = new View(this.zzbjt.getContext());
                            this.zzbju = view3;
                            view3.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
                        }
                        if (this.zzbjt != this.zzbju.getParent()) {
                            this.zzbjt.addView(this.zzbju);
                        }
                    }
                    zzaqwVar = zzpdVar3.zzko();
                    if (zzaqwVar != null && this.zzvh != null) {
                        this.zzvh.addView(zzaqwVar.getView());
                    }
                    synchronized (this.mLock) {
                        zzpdVar3.zzf(this.zzbjw);
                        if (this.zzbjw != null) {
                            String[] strArr2 = zzbjs;
                            int length = strArr2.length;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                WeakReference<View> weakReference2 = this.zzbjw.get(strArr2[i]);
                                if (weakReference2 != null) {
                                    view2 = weakReference2.get();
                                    break;
                                }
                                i++;
                            }
                        }
                        if (view2 instanceof FrameLayout) {
                            zzpo zzpoVar = new zzpo(this, view2);
                            if (zzpdVar3 instanceof zzoy) {
                                zzpdVar3.zzb(view2, zzpoVar);
                            } else {
                                zzpdVar3.zza(view2, zzpoVar);
                            }
                        } else {
                            zzpdVar3.zzkq();
                        }
                    }
                    zzpdVar3.zzi(this.zzbjt);
                    zzl(this.zzbjt);
                    this.zzbij.zzj(this.zzbjt);
                    if ((this.zzbij instanceof zzpd) && (zzpdVar = (zzpd) this.zzbij) != null && zzpdVar.getContext() != null && com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext())) {
                        zzfp zzfpVar2 = this.zzbkb.get();
                        if (zzfpVar2 == null) {
                            zzfpVar2 = new zzfp(this.zzbjt.getContext(), this.zzbjt);
                            this.zzbkb = new WeakReference<>(zzfpVar2);
                        }
                        zzfpVar2.zza(zzpdVar.zzks());
                    }
                    return;
                }
            }
            viewGroup = null;
            if (zzkj) {
            }
            z = false;
            zza = zzpdVar3.zza(this, z);
            this.zzbjx = zza;
            if (zza != null) {
            }
            zzpdVar3.zza(this.zzbjt, this.zzbjw, (Map<String, WeakReference<View>>) null, this, this);
            if (this.zzbjv) {
            }
            zzaqwVar = zzpdVar3.zzko();
            if (zzaqwVar != null) {
                this.zzvh.addView(zzaqwVar.getView());
            }
            synchronized (this.mLock) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final IObjectWrapper zzak(String str) {
        synchronized (this.mLock) {
            View view = null;
            if (this.zzbjw == null) {
                return null;
            }
            WeakReference<View> weakReference = this.zzbjw.get(str);
            if (weakReference != null) {
                view = weakReference.get();
            }
            return ObjectWrapper.wrap(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb(IObjectWrapper iObjectWrapper, int i) {
        WeakReference<zzfp> weakReference;
        zzfp zzfpVar;
        if (com.google.android.gms.ads.internal.zzbv.zzfh().zzu(this.zzbjt.getContext()) && (weakReference = this.zzbkb) != null && (zzfpVar = weakReference.get()) != null) {
            zzfpVar.zzgm();
        }
        zzkt();
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb(String str, IObjectWrapper iObjectWrapper) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        synchronized (this.mLock) {
            if (this.zzbjw == null) {
                return;
            }
            if (view != null) {
                this.zzbjw.put(str, new WeakReference<>(view));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
                    view.setOnTouchListener(this);
                    view.setClickable(true);
                    view.setOnClickListener(this);
                }
                return;
            }
            this.zzbjw.remove(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc(IObjectWrapper iObjectWrapper) {
        this.zzbij.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
