package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import com.daaw.AbstractC2388o0;
import com.daaw.C3866zk;
import com.daaw.fi1;
import com.daaw.zs1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public class C0082e implements fi1 {

    /* renamed from: A */
    public static final int[] f364A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f365a;

    /* renamed from: b */
    public final Resources f366b;

    /* renamed from: c */
    public boolean f367c;

    /* renamed from: d */
    public boolean f368d;

    /* renamed from: e */
    public InterfaceC0083a f369e;

    /* renamed from: m */
    public ContextMenu.ContextMenuInfo f377m;

    /* renamed from: n */
    public CharSequence f378n;

    /* renamed from: o */
    public Drawable f379o;

    /* renamed from: p */
    public View f380p;

    /* renamed from: x */
    public C0086g f388x;

    /* renamed from: z */
    public boolean f390z;

    /* renamed from: l */
    public int f376l = 0;

    /* renamed from: q */
    public boolean f381q = false;

    /* renamed from: r */
    public boolean f382r = false;

    /* renamed from: s */
    public boolean f383s = false;

    /* renamed from: t */
    public boolean f384t = false;

    /* renamed from: u */
    public boolean f385u = false;

    /* renamed from: v */
    public ArrayList<C0086g> f386v = new ArrayList<>();

    /* renamed from: w */
    public CopyOnWriteArrayList<WeakReference<InterfaceC0091i>> f387w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    public boolean f389y = false;

    /* renamed from: f */
    public ArrayList<C0086g> f370f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<C0086g> f371g = new ArrayList<>();

    /* renamed from: h */
    public boolean f372h = true;

    /* renamed from: i */
    public ArrayList<C0086g> f373i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C0086g> f374j = new ArrayList<>();

    /* renamed from: k */
    public boolean f375k = true;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0083a {
        /* renamed from: a */
        boolean mo330a(C0082e c0082e, MenuItem menuItem);

        /* renamed from: b */
        void mo329b(C0082e c0082e);
    }

    /* renamed from: androidx.appcompat.view.menu.e$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0084b {
        /* renamed from: a */
        boolean mo30097a(C0086g c0086g);
    }

    public C0082e(Context context) {
        this.f365a = context;
        this.f366b = context.getResources();
        m30237f0(true);
    }

    /* renamed from: D */
    public static int m30264D(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f364A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: p */
    public static int m30227p(ArrayList<C0086g> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m30210f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View m30267A() {
        return this.f380p;
    }

    /* renamed from: B */
    public ArrayList<C0086g> m30266B() {
        m30223t();
        return this.f374j;
    }

    /* renamed from: C */
    public boolean m30265C() {
        return this.f384t;
    }

    /* renamed from: E */
    public Resources m30263E() {
        return this.f366b;
    }

    /* renamed from: F */
    public C0082e mo30173F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0086g> m30262G() {
        if (this.f372h) {
            this.f371g.clear();
            int size = this.f370f.size();
            for (int i = 0; i < size; i++) {
                C0086g c0086g = this.f370f.get(i);
                if (c0086g.isVisible()) {
                    this.f371g.add(c0086g);
                }
            }
            this.f372h = false;
            this.f375k = true;
            return this.f371g;
        }
        return this.f371g;
    }

    /* renamed from: H */
    public boolean mo30172H() {
        return this.f389y;
    }

    /* renamed from: I */
    public boolean mo30171I() {
        return this.f367c;
    }

    /* renamed from: J */
    public boolean mo30170J() {
        return this.f368d;
    }

    /* renamed from: K */
    public void m30261K(C0086g c0086g) {
        this.f375k = true;
        mo24014M(true);
    }

    /* renamed from: L */
    public void m30260L(C0086g c0086g) {
        this.f372h = true;
        mo24014M(true);
    }

    /* renamed from: M */
    public void mo24014M(boolean z) {
        if (this.f381q) {
            this.f382r = true;
            if (z) {
                this.f383s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f372h = true;
            this.f375k = true;
        }
        m30233i(z);
    }

    /* renamed from: N */
    public boolean m30259N(MenuItem menuItem, int i) {
        return m30258O(menuItem, null, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r1 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        m30239e(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if ((r9 & 1) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0068, code lost:
        if (r1 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return r1;
     */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m30258O(MenuItem menuItem, InterfaceC0091i interfaceC0091i, int i) {
        C0086g c0086g = (C0086g) menuItem;
        if (c0086g == null || !c0086g.isEnabled()) {
            return false;
        }
        boolean m30205k = c0086g.m30205k();
        AbstractC2388o0 mo16345a = c0086g.mo16345a();
        boolean z = mo16345a != null && mo16345a.mo14671a();
        if (c0086g.m30206j()) {
            m30205k |= c0086g.expandActionView();
        } else if (c0086g.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m30239e(false);
            }
            if (!c0086g.hasSubMenu()) {
                c0086g.m30192x(new SubMenuC0098l(m30221w(), this, c0086g));
            }
            SubMenuC0098l subMenuC0098l = (SubMenuC0098l) c0086g.getSubMenu();
            if (z) {
                mo16345a.mo14666f(subMenuC0098l);
            }
            m30205k |= m30230l(subMenuC0098l, interfaceC0091i);
        }
    }

    /* renamed from: P */
    public final void m30257P(int i, boolean z) {
        if (i < 0 || i >= this.f370f.size()) {
            return;
        }
        this.f370f.remove(i);
        if (z) {
            mo24014M(true);
        }
    }

    /* renamed from: Q */
    public void m30256Q(InterfaceC0091i interfaceC0091i) {
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i2 = next.get();
            if (interfaceC0091i2 == null || interfaceC0091i2 == interfaceC0091i) {
                this.f387w.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void m30255R(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo30164v());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0098l) item.getSubMenu()).m30255R(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    /* renamed from: S */
    public void m30254S(Bundle bundle) {
        m30232j(bundle);
    }

    /* renamed from: T */
    public void m30253T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0098l) item.getSubMenu()).m30253T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo30164v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void m30252U(Bundle bundle) {
        m30231k(bundle);
    }

    /* renamed from: V */
    public void mo30169V(InterfaceC0083a interfaceC0083a) {
        this.f369e = interfaceC0083a;
    }

    /* renamed from: W */
    public C0082e m30251W(int i) {
        this.f376l = i;
        return this;
    }

    /* renamed from: X */
    public void m30250X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f370f.size();
        m30234h0();
        for (int i = 0; i < size; i++) {
            C0086g c0086g = this.f370f.get(i);
            if (c0086g.getGroupId() == groupId && c0086g.m30203m() && c0086g.isCheckable()) {
                c0086g.m30197s(c0086g == menuItem);
            }
        }
        m30235g0();
    }

    /* renamed from: Y */
    public C0082e m30249Y(int i) {
        m30246a0(0, null, i, null, null);
        return this;
    }

    /* renamed from: Z */
    public C0082e m30248Z(Drawable drawable) {
        m30246a0(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: a */
    public MenuItem m30247a(int i, int i2, int i3, CharSequence charSequence) {
        int m30264D = m30264D(i3);
        C0086g m30236g = m30236g(i, i2, i3, m30264D, charSequence, this.f376l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f377m;
        if (contextMenuInfo != null) {
            m30236g.m30194v(contextMenuInfo);
        }
        ArrayList<C0086g> arrayList = this.f370f;
        arrayList.add(m30227p(arrayList, m30264D), m30236g);
        mo24014M(true);
        return m30236g;
    }

    /* renamed from: a0 */
    public final void m30246a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m30263E = m30263E();
        if (view != null) {
            this.f380p = view;
            this.f378n = null;
            this.f379o = null;
        } else {
            if (i > 0) {
                this.f378n = m30263E.getText(i);
            } else if (charSequence != null) {
                this.f378n = charSequence;
            }
            if (i2 > 0) {
                this.f379o = C3866zk.m2178e(m30221w(), i2);
            } else if (drawable != null) {
                this.f379o = drawable;
            }
            this.f380p = null;
        }
        mo24014M(false);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m30247a(0, 0, 0, this.f366b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m30247a(i, i2, i3, this.f366b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m30247a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m30247a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f365a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f366b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f366b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0086g c0086g = (C0086g) m30247a(i, i2, i3, charSequence);
        SubMenuC0098l subMenuC0098l = new SubMenuC0098l(this.f365a, this, c0086g);
        c0086g.m30192x(subMenuC0098l);
        return subMenuC0098l;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m30245b(InterfaceC0091i interfaceC0091i) {
        m30243c(interfaceC0091i, this.f365a);
    }

    /* renamed from: b0 */
    public C0082e m30244b0(int i) {
        m30246a0(i, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void m30243c(InterfaceC0091i interfaceC0091i, Context context) {
        this.f387w.add(new WeakReference<>(interfaceC0091i));
        interfaceC0091i.mo17562i(context, this);
        this.f375k = true;
    }

    /* renamed from: c0 */
    public C0082e m30242c0(CharSequence charSequence) {
        m30246a0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        C0086g c0086g = this.f388x;
        if (c0086g != null) {
            mo30168f(c0086g);
        }
        this.f370f.clear();
        mo24014M(true);
    }

    public void clearHeader() {
        this.f379o = null;
        this.f378n = null;
        this.f380p = null;
        mo24014M(false);
    }

    @Override // android.view.Menu
    public void close() {
        m30239e(true);
    }

    /* renamed from: d */
    public void m30241d() {
        InterfaceC0083a interfaceC0083a = this.f369e;
        if (interfaceC0083a != null) {
            interfaceC0083a.mo329b(this);
        }
    }

    /* renamed from: d0 */
    public C0082e m30240d0(View view) {
        m30246a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void m30239e(boolean z) {
        if (this.f385u) {
            return;
        }
        this.f385u = true;
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i = next.get();
            if (interfaceC0091i == null) {
                this.f387w.remove(next);
            } else {
                interfaceC0091i.mo25025b(this, z);
            }
        }
        this.f385u = false;
    }

    /* renamed from: e0 */
    public void m30238e0(boolean z) {
        this.f390z = z;
    }

    /* renamed from: f */
    public boolean mo30168f(C0086g c0086g) {
        boolean z = false;
        if (!this.f387w.isEmpty() && this.f388x == c0086g) {
            m30234h0();
            Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0091i> next = it.next();
                InterfaceC0091i interfaceC0091i = next.get();
                if (interfaceC0091i == null) {
                    this.f387w.remove(next);
                } else {
                    z = interfaceC0091i.mo17564e(this, c0086g);
                    if (z) {
                        break;
                    }
                }
            }
            m30235g0();
            if (z) {
                this.f388x = null;
            }
        }
        return z;
    }

    /* renamed from: f0 */
    public final void m30237f0(boolean z) {
        boolean z2 = true;
        this.f368d = (z && this.f366b.getConfiguration().keyboard != 1 && zs1.m1949e(ViewConfiguration.get(this.f365a), this.f365a)) ? false : false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086g c0086g = this.f370f.get(i2);
            if (c0086g.getItemId() == i) {
                return c0086g;
            }
            if (c0086g.hasSubMenu() && (findItem = c0086g.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final C0086g m30236g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0086g(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: g0 */
    public void m30235g0() {
        this.f381q = false;
        if (this.f382r) {
            this.f382r = false;
            mo24014M(this.f383s);
        }
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f370f.get(i);
    }

    /* renamed from: h */
    public boolean mo30167h(C0082e c0082e, MenuItem menuItem) {
        InterfaceC0083a interfaceC0083a = this.f369e;
        return interfaceC0083a != null && interfaceC0083a.mo330a(c0082e, menuItem);
    }

    /* renamed from: h0 */
    public void m30234h0() {
        if (this.f381q) {
            return;
        }
        this.f381q = true;
        this.f382r = false;
        this.f383s = false;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f390z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f370f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void m30233i(boolean z) {
        if (this.f387w.isEmpty()) {
            return;
        }
        m30234h0();
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i = next.get();
            if (interfaceC0091i == null) {
                this.f387w.remove(next);
            } else {
                interfaceC0091i.mo25024c(z);
            }
        }
        m30235g0();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m30225r(i, keyEvent) != null;
    }

    /* renamed from: j */
    public final void m30232j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.f387w.isEmpty()) {
            return;
        }
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i = next.get();
            if (interfaceC0091i == null) {
                this.f387w.remove(next);
            } else {
                int id = interfaceC0091i.getId();
                if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                    interfaceC0091i.mo25021j(parcelable);
                }
            }
        }
    }

    /* renamed from: k */
    public final void m30231k(Bundle bundle) {
        Parcelable mo25018m;
        if (this.f387w.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i = next.get();
            if (interfaceC0091i == null) {
                this.f387w.remove(next);
            } else {
                int id = interfaceC0091i.getId();
                if (id > 0 && (mo25018m = interfaceC0091i.mo25018m()) != null) {
                    sparseArray.put(id, mo25018m);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    /* renamed from: l */
    public final boolean m30230l(SubMenuC0098l subMenuC0098l, InterfaceC0091i interfaceC0091i) {
        if (this.f387w.isEmpty()) {
            return false;
        }
        boolean mo25019l = interfaceC0091i != null ? interfaceC0091i.mo25019l(subMenuC0098l) : false;
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i2 = next.get();
            if (interfaceC0091i2 == null) {
                this.f387w.remove(next);
            } else if (!mo25019l) {
                mo25019l = interfaceC0091i2.mo25019l(subMenuC0098l);
            }
        }
        return mo25019l;
    }

    /* renamed from: m */
    public boolean mo30165m(C0086g c0086g) {
        boolean z = false;
        if (this.f387w.isEmpty()) {
            return false;
        }
        m30234h0();
        Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0091i> next = it.next();
            InterfaceC0091i interfaceC0091i = next.get();
            if (interfaceC0091i == null) {
                this.f387w.remove(next);
            } else {
                z = interfaceC0091i.mo17563f(this, c0086g);
                if (z) {
                    break;
                }
            }
        }
        m30235g0();
        if (z) {
            this.f388x = c0086g;
        }
        return z;
    }

    /* renamed from: n */
    public int m30229n(int i) {
        return m30228o(i, 0);
    }

    /* renamed from: o */
    public int m30228o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f370f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m30259N(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0086g m30225r = m30225r(i, keyEvent);
        boolean m30259N = m30225r != null ? m30259N(m30225r, i2) : false;
        if ((i2 & 2) != 0) {
            m30239e(true);
        }
        return m30259N;
    }

    /* renamed from: q */
    public int m30226q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f370f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public C0086g m30225r(int i, KeyEvent keyEvent) {
        ArrayList<C0086g> arrayList = this.f386v;
        arrayList.clear();
        m30224s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo30171I = mo30171I();
        for (int i2 = 0; i2 < size; i2++) {
            C0086g c0086g = arrayList.get(i2);
            char alphabeticShortcut = mo30171I ? c0086g.getAlphabeticShortcut() : c0086g.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (mo30171I && alphabeticShortcut == '\b' && i == 67))) {
                return c0086g;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m30229n = m30229n(i);
        if (m30229n >= 0) {
            int size = this.f370f.size() - m30229n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f370f.get(m30229n).getGroupId() != i) {
                    break;
                }
                m30257P(m30229n, false);
                i2 = i3;
            }
            mo24014M(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m30257P(m30226q(i), true);
    }

    /* renamed from: s */
    public void m30224s(List<C0086g> list, int i, KeyEvent keyEvent) {
        boolean mo30171I = mo30171I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f370f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0086g c0086g = this.f370f.get(i2);
                if (c0086g.hasSubMenu()) {
                    ((C0082e) c0086g.getSubMenu()).m30224s(list, i, keyEvent);
                }
                char alphabeticShortcut = mo30171I ? c0086g.getAlphabeticShortcut() : c0086g.getNumericShortcut();
                if (((modifiers & 69647) == ((mo30171I ? c0086g.getAlphabeticModifiers() : c0086g.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (mo30171I && alphabeticShortcut == '\b' && i == 67)) && c0086g.isEnabled()) {
                        list.add(c0086g);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f370f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086g c0086g = this.f370f.get(i2);
            if (c0086g.getGroupId() == i) {
                c0086g.m30196t(z2);
                c0086g.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f389y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f370f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0086g c0086g = this.f370f.get(i2);
            if (c0086g.getGroupId() == i) {
                c0086g.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f370f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0086g c0086g = this.f370f.get(i2);
            if (c0086g.getGroupId() == i && c0086g.m30191y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo24014M(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f367c = z;
        mo24014M(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f370f.size();
    }

    /* renamed from: t */
    public void m30223t() {
        ArrayList<C0086g> m30262G = m30262G();
        if (this.f375k) {
            Iterator<WeakReference<InterfaceC0091i>> it = this.f387w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0091i> next = it.next();
                InterfaceC0091i interfaceC0091i = next.get();
                if (interfaceC0091i == null) {
                    this.f387w.remove(next);
                } else {
                    z |= interfaceC0091i.mo25023d();
                }
            }
            if (z) {
                this.f373i.clear();
                this.f374j.clear();
                int size = m30262G.size();
                for (int i = 0; i < size; i++) {
                    C0086g c0086g = m30262G.get(i);
                    (c0086g.m30204l() ? this.f373i : this.f374j).add(c0086g);
                }
            } else {
                this.f373i.clear();
                this.f374j.clear();
                this.f374j.addAll(m30262G());
            }
            this.f375k = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0086g> m30222u() {
        m30223t();
        return this.f373i;
    }

    /* renamed from: v */
    public String mo30164v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context m30221w() {
        return this.f365a;
    }

    /* renamed from: x */
    public C0086g m30220x() {
        return this.f388x;
    }

    /* renamed from: y */
    public Drawable m30219y() {
        return this.f379o;
    }

    /* renamed from: z */
    public CharSequence m30218z() {
        return this.f378n;
    }
}
