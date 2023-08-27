package com.daaw.avee.Common;

import android.view.View;
/* loaded from: classes.dex */
public abstract class SystemUiHider {
    public static final int FLAG_FULLSCREEN = 2;
    public static final int FLAG_HIDE_NAVIGATION = 6;
    public static final int FLAG_LAYOUT_IN_SCREEN_OLDER_DEVICES = 1;
    private static OnVisibilityChangeListener sDummyListener = new OnVisibilityChangeListener() { // from class: com.daaw.avee.Common.SystemUiHider.1
        @Override // com.daaw.avee.Common.SystemUiHider.OnVisibilityChangeListener
        public void onVisibilityChange(boolean z) {
        }
    };
    protected View mAnchorView;
    protected int mFlags;
    protected OnVisibilityChangeListener mOnVisibilityChangeListener = sDummyListener;

    /* loaded from: classes.dex */
    public interface OnVisibilityChangeListener {
        void onVisibilityChange(boolean z);
    }

    public abstract void hide();

    public abstract boolean isVisible();

    public abstract void setup();

    public abstract void show();

    /* JADX INFO: Access modifiers changed from: protected */
    public SystemUiHider(View view, int i) {
        this.mAnchorView = view;
        this.mFlags = i;
    }

    public void toggle() {
        if (isVisible()) {
            hide();
        } else {
            show();
        }
    }

    public void setOnVisibilityChangeListener(OnVisibilityChangeListener onVisibilityChangeListener) {
        if (onVisibilityChangeListener == null) {
            onVisibilityChangeListener = sDummyListener;
        }
        this.mOnVisibilityChangeListener = onVisibilityChangeListener;
    }
}
