package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.i;
import com.daaw.c21;
/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {
    public e p;
    public androidx.appcompat.app.a q;
    public c r;
    public i.a s;

    public f(e eVar) {
        this.p = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.q;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z) {
        if (z || eVar == this.p) {
            a();
        }
        i.a aVar = this.s;
        if (aVar != null) {
            aVar.b(eVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        i.a aVar = this.s;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(IBinder iBinder) {
        e eVar = this.p;
        a.C0007a c0007a = new a.C0007a(eVar.w());
        c cVar = new c(c0007a.b(), c21.abc_list_menu_item_layout);
        this.r = cVar;
        cVar.g(this);
        this.p.b(this.r);
        c0007a.c(this.r.a(), this);
        View A = eVar.A();
        if (A != null) {
            c0007a.d(A);
        } else {
            c0007a.e(eVar.y()).h(eVar.z());
        }
        c0007a.f(this);
        androidx.appcompat.app.a a = c0007a.a();
        this.q = a;
        a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.q.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.q.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.p.N((g) this.r.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.r.b(this.p, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.q.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.q.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.p.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.p.performShortcut(i, keyEvent, 0);
    }
}
