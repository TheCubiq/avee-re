package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0068a;
import androidx.appcompat.view.menu.InterfaceC0091i;
import com.daaw.c21;
/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
public class DialogInterface$OnKeyListenerC0085f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0091i.InterfaceC0092a {

    /* renamed from: p */
    public C0082e f391p;

    /* renamed from: q */
    public DialogC0068a f392q;

    /* renamed from: r */
    public C0079c f393r;

    /* renamed from: s */
    public InterfaceC0091i.InterfaceC0092a f394s;

    public DialogInterface$OnKeyListenerC0085f(C0082e c0082e) {
        this.f391p = c0082e;
    }

    /* renamed from: a */
    public void m30217a() {
        DialogC0068a dialogC0068a = this.f392q;
        if (dialogC0068a != null) {
            dialogC0068a.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
    /* renamed from: b */
    public void mo24218b(C0082e c0082e, boolean z) {
        if (z || c0082e == this.f391p) {
            m30217a();
        }
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f394s;
        if (interfaceC0092a != null) {
            interfaceC0092a.mo24218b(c0082e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0091i.InterfaceC0092a
    /* renamed from: c */
    public boolean mo24217c(C0082e c0082e) {
        InterfaceC0091i.InterfaceC0092a interfaceC0092a = this.f394s;
        if (interfaceC0092a != null) {
            return interfaceC0092a.mo24217c(c0082e);
        }
        return false;
    }

    /* renamed from: d */
    public void m30216d(IBinder iBinder) {
        C0082e c0082e = this.f391p;
        DialogC0068a.C0069a c0069a = new DialogC0068a.C0069a(c0082e.m30221w());
        C0079c c0079c = new C0079c(c0069a.m30305b(), c21.abc_list_menu_item_layout);
        this.f393r = c0079c;
        c0079c.mo30174g(this);
        this.f391p.m30245b(this.f393r);
        c0069a.m30304c(this.f393r.m30277a(), this);
        View m30267A = c0082e.m30267A();
        if (m30267A != null) {
            c0069a.m30303d(m30267A);
        } else {
            c0069a.m30302e(c0082e.m30219y()).m30299h(c0082e.m30218z());
        }
        c0069a.m30301f(this);
        DialogC0068a m30306a = c0069a.m30306a();
        this.f392q = m30306a;
        m30306a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f392q.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f392q.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f391p.m30259N((C0086g) this.f393r.m30277a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f393r.mo25025b(this.f391p, true);
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
                Window window2 = this.f392q.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f392q.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f391p.m30239e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f391p.performShortcut(i, keyEvent, 0);
    }
}
