package com.google.android.gms.ads.nativead;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.yd0;
import com.daaw.zc3;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {
    @NotOnlyInitialized
    public final FrameLayout p;
    @NotOnlyInitialized
    public final zc3 q;

    public NativeAdView(Context context) {
        super(context);
        this.p = d(context);
        this.q = e();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = d(context);
        this.q = e();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = d(context);
        this.q = e();
    }

    @TargetApi(21)
    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.p = d(context);
        this.q = e();
    }

    public final View a(String str) {
        zc3 zc3Var = this.q;
        if (zc3Var != null) {
            try {
                yd0 zzb = zc3Var.zzb(str);
                if (zzb != null) {
                    return (View) nt0.M(zzb);
                }
            } catch (RemoteException e) {
                k04.zzh("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.p);
    }

    public final /* synthetic */ void b(MediaContent mediaContent) {
        zc3 zc3Var = this.q;
        if (zc3Var == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                zc3Var.zzbA(((zzep) mediaContent).zzb());
            } else if (mediaContent == null) {
                zc3Var.zzbA(null);
            } else {
                k04.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            k04.zzh("Unable to call setMediaContent on delegate", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.p;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        zc3 zc3Var = this.q;
        if (zc3Var == null || scaleType == null) {
            return;
        }
        try {
            zc3Var.zzbB(nt0.g3(scaleType));
        } catch (RemoteException e) {
            k04.zzh("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public void destroy() {
        zc3 zc3Var = this.q;
        if (zc3Var != null) {
            try {
                zc3Var.zzc();
            } catch (RemoteException e) {
                k04.zzh("Unable to destroy native ad view", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.q != null) {
            if (((Boolean) zzba.zzc().b(g93.w9)).booleanValue()) {
                try {
                    this.q.zzd(nt0.g3(motionEvent));
                } catch (RemoteException e) {
                    k04.zzh("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @RequiresNonNull({"overlayFrame"})
    public final zc3 e() {
        if (isInEditMode()) {
            return null;
        }
        return zzay.zza().zzh(this.p.getContext(), this, this.p);
    }

    public final void f(String str, View view) {
        zc3 zc3Var = this.q;
        if (zc3Var != null) {
            try {
                zc3Var.zzby(str, nt0.g3(view));
            } catch (RemoteException e) {
                k04.zzh("Unable to call setAssetView on delegate", e);
            }
        }
    }

    public AdChoicesView getAdChoicesView() {
        View a = a("3011");
        if (a instanceof AdChoicesView) {
            return (AdChoicesView) a;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a = a("3010");
        if (a instanceof MediaView) {
            return (MediaView) a;
        }
        if (a != null) {
            k04.zze("View is not an instance of MediaView");
            return null;
        }
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zc3 zc3Var = this.q;
        if (zc3Var != null) {
            try {
                zc3Var.zze(nt0.g3(view), i);
            } catch (RemoteException e) {
                k04.zzh("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.p);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.p == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        f("3011", adChoicesView);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        zc3 zc3Var = this.q;
        if (zc3Var != null) {
            try {
                zc3Var.zzbz(nt0.g3(view));
            } catch (RemoteException e) {
                k04.zzh("Unable to call setClickConfirmingView on delegate", e);
            }
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        f("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new zzb(this));
        mediaView.b(new zzc(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.daaw.yd0] */
    public void setNativeAd(NativeAd nativeAd) {
        zc3 zc3Var = this.q;
        if (zc3Var != 0) {
            try {
                zc3Var.zzbC(nativeAd.a());
            } catch (RemoteException e) {
                k04.zzh("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }
}
