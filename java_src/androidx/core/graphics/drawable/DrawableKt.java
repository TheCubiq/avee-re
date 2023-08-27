package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Drawable.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a2\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\b\b\u0003\u0010\f\u001a\u00020\u00042\b\b\u0003\u0010\r\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "updateBounds", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class DrawableKt {
    public static /* synthetic */ Bitmap toBitmap$default(Drawable drawable, int i, int i2, Bitmap.Config config, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        if ((i3 & 4) != 0) {
            config = null;
        }
        return toBitmap(drawable, i, i2, config);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.getConfig() == r9) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap toBitmap(Drawable toBitmap, int i, int i2, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(toBitmap, "$this$toBitmap");
        if (toBitmap instanceof BitmapDrawable) {
            if (config != null) {
                Bitmap bitmap = ((BitmapDrawable) toBitmap).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) toBitmap;
            if (i == bitmapDrawable.getIntrinsicWidth() && i2 == bitmapDrawable.getIntrinsicHeight()) {
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                return bitmap2;
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "Bitmap.createScaledBitma…map, width, height, true)");
            return createScaledBitmap;
        }
        Rect bounds = toBitmap.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmap3 = Bitmap.createBitmap(i, i2, config);
        toBitmap.setBounds(0, 0, i, i2);
        toBitmap.draw(new Canvas(bitmap3));
        toBitmap.setBounds(i3, i4, i5, i6);
        Intrinsics.checkNotNullExpressionValue(bitmap3, "bitmap");
        return bitmap3;
    }

    public static /* synthetic */ void updateBounds$default(Drawable drawable, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = drawable.getBounds().left;
        }
        if ((i5 & 2) != 0) {
            i2 = drawable.getBounds().top;
        }
        if ((i5 & 4) != 0) {
            i3 = drawable.getBounds().right;
        }
        if ((i5 & 8) != 0) {
            i4 = drawable.getBounds().bottom;
        }
        updateBounds(drawable, i, i2, i3, i4);
    }

    public static final void updateBounds(Drawable updateBounds, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(updateBounds, "$this$updateBounds");
        updateBounds.setBounds(i, i2, i3, i4);
    }
}
