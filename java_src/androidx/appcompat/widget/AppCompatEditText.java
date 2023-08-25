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
import com.daaw.ag0;
import com.daaw.e4;
import com.daaw.g4;
import com.daaw.iu0;
import com.daaw.q4;
import com.daaw.r3;
import com.daaw.rl1;
import com.daaw.sk1;
import com.daaw.sv;
import com.daaw.tk;
import com.daaw.tk1;
import com.daaw.u4;
import com.daaw.v4;
import com.daaw.vl1;
import com.daaw.x01;
import com.daaw.xs1;
import com.daaw.yk1;
import com.daaw.yl1;
/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements vl1, iu0, yl1 {
    public final r3 p;
    public final v4 q;
    public final u4 r;
    public final tk1 s;
    public final e4 t;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, x01.C);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(rl1.b(context), attributeSet, i);
        yk1.a(this, getContext());
        r3 r3Var = new r3(this);
        this.p = r3Var;
        r3Var.e(attributeSet, i);
        v4 v4Var = new v4(this);
        this.q = v4Var;
        v4Var.m(attributeSet, i);
        v4Var.b();
        this.r = new u4(this);
        this.s = new tk1();
        e4 e4Var = new e4(this);
        this.t = e4Var;
        e4Var.c(attributeSet, i);
        b(e4Var);
    }

    @Override // com.daaw.iu0
    public tk a(tk tkVar) {
        return this.s.a(this, tkVar);
    }

    public void b(e4 e4Var) {
        KeyListener keyListener = getKeyListener();
        if (e4Var.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a = e4Var.a(keyListener);
            if (a == keyListener) {
                return;
            }
            super.setKeyListener(a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.b();
        }
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sk1.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // com.daaw.vl1
    public ColorStateList getSupportBackgroundTintList() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.c();
        }
        return null;
    }

    @Override // com.daaw.vl1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r3 r3Var = this.p;
        if (r3Var != null) {
            return r3Var.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.q.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.q.k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        u4 u4Var;
        return (Build.VERSION.SDK_INT >= 28 || (u4Var = this.r) == null) ? super.getTextClassifier() : u4Var.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] H;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.q.r(this, onCreateInputConnection, editorInfo);
        InputConnection a = g4.a(onCreateInputConnection, editorInfo, this);
        if (a != null && Build.VERSION.SDK_INT <= 30 && (H = xs1.H(this)) != null) {
            sv.d(editorInfo, H);
            a = ag0.c(this, a, editorInfo);
        }
        return this.t.d(a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (q4.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (q4.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sk1.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.t.e(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.t.a(keyListener));
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.i(colorStateList);
        }
    }

    @Override // com.daaw.vl1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r3 r3Var = this.p;
        if (r3Var != null) {
            r3Var.j(mode);
        }
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.q.w(colorStateList);
        this.q.b();
    }

    @Override // com.daaw.yl1
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.q.x(mode);
        this.q.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v4 v4Var = this.q;
        if (v4Var != null) {
            v4Var.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        u4 u4Var;
        if (Build.VERSION.SDK_INT >= 28 || (u4Var = this.r) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            u4Var.b(textClassifier);
        }
    }
}
