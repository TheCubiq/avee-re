package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import com.daaw.c4;
import com.daaw.x01;
/* loaded from: classes.dex */
public class a extends c4 {
    public final AlertController t;

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0007a {
        public final AlertController.f a;
        public final int b;

        public C0007a(Context context) {
            this(context, a.o(context, 0));
        }

        public C0007a(Context context, int i) {
            this.a = new AlertController.f(new ContextThemeWrapper(context, a.o(context, i)));
            this.b = i;
        }

        public a a() {
            a aVar = new a(this.a.a, this.b);
            this.a.a(aVar.t);
            aVar.setCancelable(this.a.r);
            if (this.a.r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.a.s);
            aVar.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener onKeyListener = this.a.u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.a.a;
        }

        public C0007a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            return this;
        }

        public C0007a d(View view) {
            this.a.g = view;
            return this;
        }

        public C0007a e(Drawable drawable) {
            this.a.d = drawable;
            return this;
        }

        public C0007a f(DialogInterface.OnKeyListener onKeyListener) {
            this.a.u = onKeyListener;
            return this;
        }

        public C0007a g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.a;
            fVar.w = listAdapter;
            fVar.x = onClickListener;
            fVar.I = i;
            fVar.H = true;
            return this;
        }

        public C0007a h(CharSequence charSequence) {
            this.a.f = charSequence;
            return this;
        }
    }

    public a(Context context, int i) {
        super(context, o(context, i));
        this.t = new AlertController(getContext(), this, getWindow());
    }

    public static int o(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(x01.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView n() {
        return this.t.d();
    }

    @Override // com.daaw.c4, com.daaw.di, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.t.g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.t.h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.daaw.c4, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.t.q(charSequence);
    }
}
