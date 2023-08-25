package com.daaw;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* renamed from: com.daaw.n4 */
/* loaded from: classes.dex */
public class C2241n4 {

    /* renamed from: c */
    public static final int[] f19454c = {16843067, 16843068};

    /* renamed from: a */
    public final ProgressBar f19455a;

    /* renamed from: b */
    public Bitmap f19456b;

    /* renamed from: com.daaw.n4$a */
    /* loaded from: classes.dex */
    public static class C2242a {
        /* renamed from: a */
        public static void m15536a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
            layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
            layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
            layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
            layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
            layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
            layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
            layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
            layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
            layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
        }
    }

    public C2241n4(ProgressBar progressBar) {
        this.f19455a = progressBar;
    }

    /* renamed from: a */
    public final Shape m15540a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: b */
    public Bitmap m15539b() {
        return this.f19456b;
    }

    /* renamed from: c */
    public void mo9546c(AttributeSet attributeSet, int i) {
        ul1 m8037v = ul1.m8037v(this.f19455a.getContext(), attributeSet, f19454c, i, 0);
        Drawable m8051h = m8037v.m8051h(0);
        if (m8051h != null) {
            this.f19455a.setIndeterminateDrawable(m15537e(m8051h));
        }
        Drawable m8051h2 = m8037v.m8051h(1);
        if (m8051h2 != null) {
            this.f19455a.setProgressDrawable(m15538d(m8051h2, false));
        }
        m8037v.m8036w();
    }

    /* renamed from: d */
    public Drawable m15538d(Drawable drawable, boolean z) {
        if (drawable instanceof az1) {
            az1 az1Var = (az1) drawable;
            Drawable mo25723b = az1Var.mo25723b();
            if (mo25723b != null) {
                az1Var.mo25724a(m15538d(mo25723b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m15538d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    C2242a.m15536a(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f19456b == null) {
                this.f19456b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m15540a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable m15537e(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            AnimationDrawable animationDrawable2 = new AnimationDrawable();
            animationDrawable2.setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; i++) {
                Drawable m15538d = m15538d(animationDrawable.getFrame(i), true);
                m15538d.setLevel(10000);
                animationDrawable2.addFrame(m15538d, animationDrawable.getDuration(i));
            }
            animationDrawable2.setLevel(10000);
            return animationDrawable2;
        }
        return drawable;
    }
}
