package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.customview.view.AbsSavedState;
import com.daaw.C1499h4;
import com.daaw.C3388w;
import com.daaw.C3654y;
import com.daaw.x01;
import com.daaw.xs1;
/* loaded from: classes2.dex */
public class CheckableImageButton extends C1499h4 implements Checkable {

    /* renamed from: v */
    public static final int[] f37625v = {16842912};

    /* renamed from: s */
    public boolean f37626s;

    /* renamed from: t */
    public boolean f37627t;

    /* renamed from: u */
    public boolean f37628u;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C4108a();

        /* renamed from: r */
        public boolean f37629r;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$a */
        /* loaded from: classes2.dex */
        public static class C4108a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m358b(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        public final void m358b(Parcel parcel) {
            this.f37629r = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f37629r ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    /* loaded from: classes2.dex */
    public class C4109a extends C3388w {
        public C4109a() {
        }

        @Override // com.daaw.C3388w
        /* renamed from: f */
        public void mo354f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo354f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // com.daaw.C3388w
        /* renamed from: g */
        public void mo161g(View view, C3654y c3654y) {
            super.mo161g(view, c3654y);
            c3654y.m4339Z(CheckableImageButton.this.m359a());
            c3654y.m4337a0(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37627t = true;
        this.f37628u = true;
        xs1.m4702r0(this, new C4109a());
    }

    /* renamed from: a */
    public boolean m359a() {
        return this.f37627t;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37626s;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (this.f37626s) {
            int[] iArr = f37625v;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.m29657a());
        setChecked(savedState.f37629r);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f37629r = this.f37626s;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f37627t != z) {
            this.f37627t = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f37627t || this.f37626s == z) {
            return;
        }
        this.f37626s = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f37628u = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f37628u) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f37626s);
    }
}
