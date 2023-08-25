package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.daaw.d04;
import com.daaw.g93;
import com.daaw.jm8;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    public final ImageButton p;
    public final zzad q;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        this.q = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.p = imageButton;
        b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int D = d04.D(context, zzqVar.zza);
        zzay.zzb();
        int D2 = d04.D(context, 0);
        zzay.zzb();
        int D3 = d04.D(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(D, D2, D3, d04.D(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int D4 = d04.D(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(D4, d04.D(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().b(g93.W0)).longValue();
        if (longValue <= 0) {
            return;
        }
        jm8 jm8Var = ((Boolean) zzba.zzc().b(g93.X0)).booleanValue() ? new jm8(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(jm8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r5 = this;
            com.daaw.y83 r0 = com.daaw.g93.V0
            com.daaw.e93 r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = com.daaw.vw0.f()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.daaw.qz3 r1 = com.google.android.gms.ads.internal.zzt.zzo()
            android.content.res.Resources r1 = r1.d()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.daaw.k04.zze(r0)
        L4e:
            android.widget.ImageButton r0 = r5.p
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.p
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.p
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.p
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzr.b():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.q;
        if (zzadVar != null) {
            zzadVar.zzbL();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.p.setVisibility(0);
            return;
        }
        this.p.setVisibility(8);
        if (((Long) zzba.zzc().b(g93.W0)).longValue() > 0) {
            this.p.animate().cancel();
            this.p.clearAnimation();
        }
    }
}
