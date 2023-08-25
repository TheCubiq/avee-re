package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.daaw.d04;
import com.daaw.g93;
import com.daaw.jm8;
import com.daaw.k04;
import com.daaw.vw0;
import com.google.android.gms.ads.impl.C3985R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {

    /* renamed from: p */
    public final ImageButton f36229p;

    /* renamed from: q */
    public final zzad f36230q;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        this.f36230q = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f36229p = imageButton;
        m1382b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int m24833D = d04.m24833D(context, zzqVar.zza);
        zzay.zzb();
        int m24833D2 = d04.m24833D(context, 0);
        zzay.zzb();
        int m24833D3 = d04.m24833D(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(m24833D, m24833D2, m24833D3, d04.m24833D(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int m24833D4 = d04.m24833D(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(m24833D4, d04.m24833D(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().m23658b(g93.f10582W0)).longValue();
        if (longValue <= 0) {
            return;
        }
        jm8 jm8Var = ((Boolean) zzba.zzc().m23658b(g93.f10592X0)).booleanValue() ? new jm8(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(jm8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1382b() {
        int i;
        String str = (String) zzba.zzc().m23658b(g93.f10572V0);
        if (!vw0.m6699f() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.f36229p.setImageResource(17301527);
            return;
        }
        Resources m11919d = com.google.android.gms.ads.internal.zzt.zzo().m11919d();
        if (m11919d == null) {
            this.f36229p.setImageResource(17301527);
            return;
        }
        Drawable drawable = null;
        try {
        } catch (Resources.NotFoundException unused) {
            k04.zze("Close button resource not found, falling back to default.");
        }
        if (!"white".equals(str)) {
            if ("black".equals(str)) {
                i = C3985R.C3986drawable.admob_close_button_black_circle_white_cross;
            }
            ImageButton imageButton = this.f36229p;
            if (drawable != null) {
                imageButton.setImageResource(17301527);
                return;
            }
            imageButton.setImageDrawable(drawable);
            this.f36229p.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        i = C3985R.C3986drawable.admob_close_button_white_circle_black_cross;
        drawable = m11919d.getDrawable(i);
        ImageButton imageButton2 = this.f36229p;
        if (drawable != null) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.f36230q;
        if (zzadVar != null) {
            zzadVar.zzbL();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.f36229p.setVisibility(0);
            return;
        }
        this.f36229p.setVisibility(8);
        if (((Long) zzba.zzc().m23658b(g93.f10582W0)).longValue() > 0) {
            this.f36229p.animate().cancel();
            this.f36229p.clearAnimation();
        }
    }
}
