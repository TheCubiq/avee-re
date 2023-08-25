package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.daaw.C1160e4;
import com.daaw.C1360g4;
import com.daaw.C2688q4;
import com.daaw.C2816r3;
import com.daaw.C2983sv;
import com.daaw.C3081tk;
import com.daaw.C3160u4;
import com.daaw.C3282v4;
import com.daaw.ag0;
import com.daaw.iu0;
import com.daaw.rl1;
import com.daaw.sk1;
import com.daaw.tk1;
import com.daaw.vl1;
import com.daaw.x01;
import com.daaw.xs1;
import com.daaw.yk1;
import com.daaw.yl1;
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements vl1, iu0, yl1 {

    /* renamed from: p */
    public final C2816r3 f578p;

    /* renamed from: q */
    public final C3282v4 f579q;

    /* renamed from: r */
    public final C3160u4 f580r;

    /* renamed from: s */
    public final tk1 f581s;

    /* renamed from: t */
    public final C1160e4 f582t;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.f31703C);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(rl1.m11199b(context), attributeSet, i);
        yk1.m3617a(this, getContext());
        C2816r3 c2816r3 = new C2816r3(this);
        this.f578p = c2816r3;
        c2816r3.m11818e(attributeSet, i);
        C3282v4 c3282v4 = new C3282v4(this);
        this.f579q = c3282v4;
        c3282v4.m7491m(attributeSet, i);
        c3282v4.m7502b();
        this.f580r = new C3160u4(this);
        this.f581s = new tk1();
        C1160e4 c1160e4 = new C1160e4(this);
        this.f582t = c1160e4;
        c1160e4.m23731c(attributeSet, i);
        m30090b(c1160e4);
    }

    @Override // com.daaw.iu0
    /* renamed from: a */
    public C3081tk mo5829a(C3081tk c3081tk) {
        return this.f581s.mo9049a(this, c3081tk);
    }

    /* renamed from: b */
    public void m30090b(C1160e4 c1160e4) {
        KeyListener keyListener = getKeyListener();
        if (c1160e4.m23732b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m23733a = c1160e4.m23733a(keyListener);
            if (m23733a == keyListener) {
                return;
            }
            super.setKeyListener(m23733a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            c2816r3.m11821b();
        }
        C3282v4 c3282v4 = this.f579q;
        if (c3282v4 != null) {
            c3282v4.m7502b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.m10258p(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            return c2816r3.m11820c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            return c2816r3.m11819d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f579q.m7494j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f579q.m7493k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3160u4 c3160u4;
        return (Build.VERSION.SDK_INT >= 28 || (c3160u4 = this.f580r) == null) ? super.getTextClassifier() : c3160u4.m8592a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m4762H;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f579q.m7486r(this, onCreateInputConnection, editorInfo);
        InputConnection m21977a = C1360g4.m21977a(onCreateInputConnection, editorInfo, this);
        if (m21977a != null && Build.VERSION.SDK_INT <= 30 && (m4762H = xs1.m4762H(this)) != null) {
            C2983sv.m9842d(editorInfo, m4762H);
            m21977a = ag0.m27488c(this, m21977a, editorInfo);
        }
        return this.f582t.m23730d(m21977a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C2688q4.m12788a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (C2688q4.m12787b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            c2816r3.m11817f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            c2816r3.m11816g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f579q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3282v4 c3282v4 = this.f579q;
        if (c3282v4 != null) {
            c3282v4.m7488p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.m10257q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.f582t.m23729e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f582t.m23733a(keyListener));
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            c2816r3.m11814i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2816r3 c2816r3 = this.f578p;
        if (c2816r3 != null) {
            c2816r3.m11813j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f579q.m7481w(colorStateList);
        this.f579q.m7502b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f579q.m7480x(mode);
        this.f579q.m7502b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3282v4 c3282v4 = this.f579q;
        if (c3282v4 != null) {
            c3282v4.m7487q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3160u4 c3160u4;
        if (Build.VERSION.SDK_INT >= 28 || (c3160u4 = this.f580r) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3160u4.m8591b(textClassifier);
        }
    }
}
