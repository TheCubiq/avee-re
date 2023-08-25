package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.ry0;
import com.daaw.ya3;
import com.daaw.zz3;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    public final zzea p;

    public BaseAdView(Context context, int i) {
        super(context);
        this.p = new zzea(this, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.p = new zzea(this, attributeSet, false, i);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.p = new zzea(this, attributeSet, false, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.p = new zzea(this, attributeSet, z, i2);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.p = new zzea(this, attributeSet, z);
    }

    public void destroy() {
        g93.c(getContext());
        if (((Boolean) ya3.e.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.k9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.p.zzk();
                        } catch (IllegalStateException e) {
                            et3.c(baseAdView.getContext()).a(e, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.p.zzk();
    }

    public AdListener getAdListener() {
        return this.p.zza();
    }

    public AdSize getAdSize() {
        return this.p.zzb();
    }

    public String getAdUnitId() {
        return this.p.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.p.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.p.zzd();
    }

    public boolean isLoading() {
        return this.p.zzA();
    }

    public void loadAd(final AdRequest adRequest) {
        ry0.e("#008 Must be called on the main UI thread.");
        g93.c(getContext());
        if (((Boolean) ya3.f.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.n9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.p.zzm(adRequest.zza());
                        } catch (IllegalStateException e) {
                            et3.c(baseAdView.getContext()).a(e, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.p.zzm(adRequest.zza());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AdSize adSize;
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                k04.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        g93.c(getContext());
        if (((Boolean) ya3.g.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.l9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.p.zzn();
                        } catch (IllegalStateException e) {
                            et3.c(baseAdView.getContext()).a(e, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.p.zzn();
    }

    public void resume() {
        g93.c(getContext());
        if (((Boolean) ya3.h.e()).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.j9)).booleanValue()) {
                zz3.b.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = BaseAdView.this;
                        try {
                            baseAdView.p.zzp();
                        } catch (IllegalStateException e) {
                            et3.c(baseAdView.getContext()).a(e, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.p.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.p.zzr(adListener);
        if (adListener == null) {
            this.p.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            this.p.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.p.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.p.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.p.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.p.zzx(onPaidEventListener);
    }
}
