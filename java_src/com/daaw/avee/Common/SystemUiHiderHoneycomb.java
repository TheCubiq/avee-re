package com.daaw.avee.Common;

import android.view.View;
/* loaded from: classes.dex */
public class SystemUiHiderHoneycomb extends SystemUiHider {
    private int mHideFlags;
    private int mShowFlags;
    private View.OnSystemUiVisibilityChangeListener mSystemUiVisibilityChangeListener;
    private int mTestFlags;
    private boolean mVisible;

    public SystemUiHiderHoneycomb(View view, int i) {
        super(view, i);
        this.mVisible = true;
        this.mSystemUiVisibilityChangeListener = new View.OnSystemUiVisibilityChangeListener() { // from class: com.daaw.avee.Common.SystemUiHiderHoneycomb.1
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i2) {
                if ((i2 & SystemUiHiderHoneycomb.this.mTestFlags) == 0) {
                    SystemUiHiderHoneycomb.this.mAnchorView.setSystemUiVisibility(SystemUiHiderHoneycomb.this.mShowFlags);
                    SystemUiHiderHoneycomb.this.mOnVisibilityChangeListener.onVisibilityChange(true);
                    SystemUiHiderHoneycomb.this.mVisible = true;
                    return;
                }
                SystemUiHiderHoneycomb.this.mOnVisibilityChangeListener.onVisibilityChange(false);
                SystemUiHiderHoneycomb.this.mVisible = false;
            }
        };
        this.mShowFlags = 0;
        this.mHideFlags = 1;
        this.mTestFlags = 1;
        if ((this.mFlags & 2) != 0) {
            this.mShowFlags = 1024;
            this.mHideFlags = 1028;
            this.mTestFlags = 4;
        }
        if ((this.mFlags & 6) != 0) {
            this.mShowFlags |= 512;
            this.mHideFlags |= 514;
            this.mTestFlags |= 2;
        }
    }

    @Override // com.daaw.avee.Common.SystemUiHider
    public void setup() {
        this.mAnchorView.setOnSystemUiVisibilityChangeListener(this.mSystemUiVisibilityChangeListener);
    }

    @Override // com.daaw.avee.Common.SystemUiHider
    public void hide() {
        this.mAnchorView.setSystemUiVisibility(this.mHideFlags);
    }

    @Override // com.daaw.avee.Common.SystemUiHider
    public void show() {
        this.mAnchorView.setSystemUiVisibility(this.mShowFlags);
    }

    @Override // com.daaw.avee.Common.SystemUiHider
    public boolean isVisible() {
        return this.mVisible;
    }
}
