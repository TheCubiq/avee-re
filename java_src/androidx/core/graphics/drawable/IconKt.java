package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Icon.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0005H\u0087\b¨\u0006\u0006"}, d2 = {"toAdaptiveIcon", "Landroid/graphics/drawable/Icon;", "Landroid/graphics/Bitmap;", "toIcon", "Landroid/net/Uri;", "", "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class IconKt {
    public static final Icon toAdaptiveIcon(Bitmap toAdaptiveIcon) {
        Intrinsics.checkNotNullParameter(toAdaptiveIcon, "$this$toAdaptiveIcon");
        Icon createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(toAdaptiveIcon);
        Intrinsics.checkNotNullExpressionValue(createWithAdaptiveBitmap, "Icon.createWithAdaptiveBitmap(this)");
        return createWithAdaptiveBitmap;
    }

    public static final Icon toIcon(Bitmap toIcon) {
        Intrinsics.checkNotNullParameter(toIcon, "$this$toIcon");
        Icon createWithBitmap = Icon.createWithBitmap(toIcon);
        Intrinsics.checkNotNullExpressionValue(createWithBitmap, "Icon.createWithBitmap(this)");
        return createWithBitmap;
    }

    public static final Icon toIcon(Uri toIcon) {
        Intrinsics.checkNotNullParameter(toIcon, "$this$toIcon");
        Icon createWithContentUri = Icon.createWithContentUri(toIcon);
        Intrinsics.checkNotNullExpressionValue(createWithContentUri, "Icon.createWithContentUri(this)");
        return createWithContentUri;
    }

    public static final Icon toIcon(byte[] toIcon) {
        Intrinsics.checkNotNullParameter(toIcon, "$this$toIcon");
        Icon createWithData = Icon.createWithData(toIcon, 0, toIcon.length);
        Intrinsics.checkNotNullExpressionValue(createWithData, "Icon.createWithData(this, 0, size)");
        return createWithData;
    }
}
