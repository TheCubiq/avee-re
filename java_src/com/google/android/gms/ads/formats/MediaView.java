package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
@Deprecated
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* renamed from: p */
    public MediaContent f36053p;

    /* renamed from: q */
    public ImageView.ScaleType f36054q;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f36054q = scaleType;
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.f36053p = mediaContent;
    }
}
