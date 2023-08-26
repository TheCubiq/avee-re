package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzamu;
import com.google.android.gms.internal.ads.zzkb;
import javax.annotation.Nullable;
@zzadh
/* loaded from: classes.dex */
public final class zzo extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzbyy;
    private final zzw zzbyz;

    public zzo(Context context, zzp zzpVar, @Nullable zzw zzwVar) {
        super(context);
        this.zzbyz = zzwVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzbyy = imageButton;
        imageButton.setImageResource(17301527);
        this.zzbyy.setBackgroundColor(0);
        this.zzbyy.setOnClickListener(this);
        ImageButton imageButton2 = this.zzbyy;
        zzkb.zzif();
        int zza = zzamu.zza(context, zzpVar.paddingLeft);
        zzkb.zzif();
        int zza2 = zzamu.zza(context, 0);
        zzkb.zzif();
        int zza3 = zzamu.zza(context, zzpVar.paddingRight);
        zzkb.zzif();
        imageButton2.setPadding(zza, zza2, zza3, zzamu.zza(context, zzpVar.paddingBottom));
        this.zzbyy.setContentDescription("Interstitial close button");
        zzkb.zzif();
        zzamu.zza(context, zzpVar.size);
        ImageButton imageButton3 = this.zzbyy;
        zzkb.zzif();
        int zza4 = zzamu.zza(context, zzpVar.size + zzpVar.paddingLeft + zzpVar.paddingRight);
        zzkb.zzif();
        addView(imageButton3, new FrameLayout.LayoutParams(zza4, zzamu.zza(context, zzpVar.size + zzpVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzw zzwVar = this.zzbyz;
        if (zzwVar != null) {
            zzwVar.zzni();
        }
    }

    public final void zzu(boolean z) {
        ImageButton imageButton;
        int i;
        if (z) {
            imageButton = this.zzbyy;
            i = 8;
        } else {
            imageButton = this.zzbyy;
            i = 0;
        }
        imageButton.setVisibility(i);
    }
}
