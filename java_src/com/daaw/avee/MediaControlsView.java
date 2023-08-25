package com.daaw.avee;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.daaw.C2575pq;
import com.daaw.sw1;
import com.daaw.ug0;
/* loaded from: classes.dex */
public final class MediaControlsView extends FrameLayout {

    /* renamed from: p */
    public static final C0686a f3764p = new C0686a(null);

    /* renamed from: q */
    public static final sw1<View, View, View> f3765q = new sw1<>();

    /* renamed from: com.daaw.avee.MediaControlsView$a */
    /* loaded from: classes.dex */
    public static final class C0686a {
        public C0686a() {
        }

        public /* synthetic */ C0686a(C2575pq c2575pq) {
            this();
        }

        /* renamed from: a */
        public final sw1<View, View, View> m26885a() {
            return MediaControlsView.f3765q;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        ug0.m8268f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaControlsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ug0.m8268f(context, "context");
        m26887b();
    }

    public /* synthetic */ MediaControlsView(Context context, AttributeSet attributeSet, int i, int i2, C2575pq c2575pq) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: b */
    public final void m26887b() {
        FrameLayout.inflate(getContext(), R.layout.media_controls_view, this);
        f3765q.m9795a(findViewById(R.id.layoutMediaControls), findViewById(R.id.layoutMediaControlsNarrow), findViewById(R.id.layoutMediaControlsContainer));
    }

    /* renamed from: c */
    public final void m26886c() {
        removeAllViews();
        m26887b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m26886c();
    }
}
