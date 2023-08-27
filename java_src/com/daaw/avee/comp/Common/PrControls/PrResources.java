package com.daaw.avee.comp.Common.PrControls;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class PrResources {
    public static final WeakEventR<Boolean> onRequest = new WeakEventR<>();
    public static final WeakEventR<Boolean> onRequestGreen = new WeakEventR<>();
    private static Drawable drawableBg = null;
    private static Drawable drawableGreenBg = null;

    public static Drawable getDrawableBg() {
        Context appContext;
        if (onRequest.invoke(false).booleanValue()) {
            return null;
        }
        if (drawableBg == null && (appContext = PlayerCore.s().getAppContext()) != null) {
            drawableBg = ContextCompat.getDrawable(appContext, R.drawable.coinb3_s);
        }
        return drawableBg;
    }

    public static Drawable getDrawableRedBg() {
        Context appContext;
        boolean booleanValue = onRequestGreen.invoke(false).booleanValue();
        if (drawableGreenBg == null && !booleanValue && (appContext = PlayerCore.s().getAppContext()) != null) {
            drawableGreenBg = ContextCompat.getDrawable(appContext, R.drawable.pr_hex_s);
        }
        if (booleanValue) {
            return null;
        }
        return drawableGreenBg;
    }
}
