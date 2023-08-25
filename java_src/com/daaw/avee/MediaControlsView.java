package com.daaw.avee;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.pq;
import com.daaw.sw1;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class MediaControlsView extends FrameLayout {
    public static final a p = new a(null);
    public static final sw1<View, View, View> q = new sw1<>();

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final sw1<View, View, View> a() {
            return MediaControlsView.q;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ug0.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ug0.f(context, "context");
        b();
    }

    public /* synthetic */ MediaControlsView(Context context, AttributeSet attributeSet, int i, int i2, pq pqVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void b() {
        FrameLayout.inflate(getContext(), R.layout.media_controls_view, this);
        q.a(findViewById(R.id.layoutMediaControls), findViewById(R.id.layoutMediaControlsNarrow), findViewById(R.id.layoutMediaControlsContainer));
    }

    public final void c() {
        removeAllViews();
        b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c();
    }
}
