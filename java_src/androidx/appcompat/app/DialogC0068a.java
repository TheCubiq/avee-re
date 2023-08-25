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
import com.daaw.DialogC0913c4;
import com.daaw.x01;
/* renamed from: androidx.appcompat.app.a */
/* loaded from: classes.dex */
public class DialogC0068a extends DialogC0913c4 {

    /* renamed from: t */
    public final AlertController f264t;

    /* renamed from: androidx.appcompat.app.a$a */
    /* loaded from: classes.dex */
    public static class C0069a {

        /* renamed from: a */
        public final AlertController.C0060f f265a;

        /* renamed from: b */
        public final int f266b;

        public C0069a(Context context) {
            this(context, DialogC0068a.m30307o(context, 0));
        }

        public C0069a(Context context, int i) {
            this.f265a = new AlertController.C0060f(new ContextThemeWrapper(context, DialogC0068a.m30307o(context, i)));
            this.f266b = i;
        }

        /* renamed from: a */
        public DialogC0068a m30306a() {
            DialogC0068a dialogC0068a = new DialogC0068a(this.f265a.f225a, this.f266b);
            this.f265a.m30311a(dialogC0068a.f264t);
            dialogC0068a.setCancelable(this.f265a.f242r);
            if (this.f265a.f242r) {
                dialogC0068a.setCanceledOnTouchOutside(true);
            }
            dialogC0068a.setOnCancelListener(this.f265a.f243s);
            dialogC0068a.setOnDismissListener(this.f265a.f244t);
            DialogInterface.OnKeyListener onKeyListener = this.f265a.f245u;
            if (onKeyListener != null) {
                dialogC0068a.setOnKeyListener(onKeyListener);
            }
            return dialogC0068a;
        }

        /* renamed from: b */
        public Context m30305b() {
            return this.f265a.f225a;
        }

        /* renamed from: c */
        public C0069a m30304c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0060f c0060f = this.f265a;
            c0060f.f247w = listAdapter;
            c0060f.f248x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0069a m30303d(View view) {
            this.f265a.f231g = view;
            return this;
        }

        /* renamed from: e */
        public C0069a m30302e(Drawable drawable) {
            this.f265a.f228d = drawable;
            return this;
        }

        /* renamed from: f */
        public C0069a m30301f(DialogInterface.OnKeyListener onKeyListener) {
            this.f265a.f245u = onKeyListener;
            return this;
        }

        /* renamed from: g */
        public C0069a m30300g(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0060f c0060f = this.f265a;
            c0060f.f247w = listAdapter;
            c0060f.f248x = onClickListener;
            c0060f.f217I = i;
            c0060f.f216H = true;
            return this;
        }

        /* renamed from: h */
        public C0069a m30299h(CharSequence charSequence) {
            this.f265a.f230f = charSequence;
            return this;
        }
    }

    public DialogC0068a(Context context, int i) {
        super(context, m30307o(context, i));
        this.f264t = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: o */
    public static int m30307o(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(x01.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: n */
    public ListView m30308n() {
        return this.f264t.m30335d();
    }

    @Override // com.daaw.DialogC0913c4, com.daaw.DialogC1088di, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f264t.m30334e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f264t.m30332g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f264t.m30331h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.daaw.DialogC0913c4, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f264t.m30322q(charSequence);
    }
}
