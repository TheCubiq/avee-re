package com.daaw.avee.comp.AlbumArt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Defines;
import com.daaw.avee.PlayerCore;
/* loaded from: classes.dex */
public class InternalBitmapLoader {
    public static final String InternalResPrefix = "internalres:";
    private static final String InternalResPrefixPure = "internalres";

    public static int getResIdFromPath(String str) {
        if (str == null) {
            return 0;
        }
        String[] strArr = new String[2];
        Utils.stringSplitInTwo(str, 58, strArr);
        if (InternalResPrefixPure.equals(strArr[0])) {
            return Defines.getInstance().getDrawableResid(strArr[1], 0);
        }
        return 0;
    }

    public static void loadResIdBitmap(String str, String str2, String str3, int i, ImageLoadedListener imageLoadedListener) {
        Context appContext = PlayerCore.s().getAppContext();
        Resources resources = appContext != null ? appContext.getResources() : null;
        if (resources == null) {
            imageLoadedListener.onBitmapLoaded(null, str, str2, str3);
        } else {
            imageLoadedListener.onBitmapLoaded(new ImageResult(BitmapFactory.decodeResource(resources, i)), str, str2, str3);
        }
    }
}
