package com.daaw;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bc3 extends RelativeLayout {

    /* renamed from: q */
    public static final float[] f4694q = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: p */
    public AnimationDrawable f4695p;

    public bc3(Context context, ac3 ac3Var, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        ry0.m10830j(ac3Var);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f4694q, null, null));
        shapeDrawable.getPaint().setColor(ac3Var.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(ac3Var.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(ac3Var.zzg());
            textView.setTextColor(ac3Var.zze());
            textView.setTextSize(ac3Var.m27535h3());
            zzay.zzb();
            int m24833D = d04.m24833D(context, 4);
            zzay.zzb();
            textView.setPadding(m24833D, 0, d04.m24833D(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<dc3> m27534i3 = ac3Var.m27534i3();
        if (m27534i3 != null && m27534i3.size() > 1) {
            this.f4695p = new AnimationDrawable();
            for (dc3 dc3Var : m27534i3) {
                try {
                    this.f4695p.addFrame((Drawable) nt0.m14831M(dc3Var.zzf()), ac3Var.zzb());
                } catch (Exception e) {
                    k04.zzh("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.f4695p);
        } else if (m27534i3.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) nt0.m14831M(((dc3) m27534i3.get(0)).zzf()));
            } catch (Exception e2) {
                k04.zzh("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f4695p;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
