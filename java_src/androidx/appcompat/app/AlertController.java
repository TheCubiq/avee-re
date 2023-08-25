package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0164b;
import androidx.core.widget.NestedScrollView;
import com.daaw.DialogC0913c4;
import com.daaw.o11;
import com.daaw.x01;
import com.daaw.x21;
import com.daaw.xs1;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    public NestedScrollView f149A;

    /* renamed from: C */
    public Drawable f151C;

    /* renamed from: D */
    public ImageView f152D;

    /* renamed from: E */
    public TextView f153E;

    /* renamed from: F */
    public TextView f154F;

    /* renamed from: G */
    public View f155G;

    /* renamed from: H */
    public ListAdapter f156H;

    /* renamed from: J */
    public int f158J;

    /* renamed from: K */
    public int f159K;

    /* renamed from: L */
    public int f160L;

    /* renamed from: M */
    public int f161M;

    /* renamed from: N */
    public int f162N;

    /* renamed from: O */
    public int f163O;

    /* renamed from: P */
    public boolean f164P;

    /* renamed from: R */
    public Handler f166R;

    /* renamed from: a */
    public final Context f168a;

    /* renamed from: b */
    public final DialogC0913c4 f169b;

    /* renamed from: c */
    public final Window f170c;

    /* renamed from: d */
    public final int f171d;

    /* renamed from: e */
    public CharSequence f172e;

    /* renamed from: f */
    public CharSequence f173f;

    /* renamed from: g */
    public ListView f174g;

    /* renamed from: h */
    public View f175h;

    /* renamed from: i */
    public int f176i;

    /* renamed from: j */
    public int f177j;

    /* renamed from: k */
    public int f178k;

    /* renamed from: l */
    public int f179l;

    /* renamed from: m */
    public int f180m;

    /* renamed from: o */
    public Button f182o;

    /* renamed from: p */
    public CharSequence f183p;

    /* renamed from: q */
    public Message f184q;

    /* renamed from: r */
    public Drawable f185r;

    /* renamed from: s */
    public Button f186s;

    /* renamed from: t */
    public CharSequence f187t;

    /* renamed from: u */
    public Message f188u;

    /* renamed from: v */
    public Drawable f189v;

    /* renamed from: w */
    public Button f190w;

    /* renamed from: x */
    public CharSequence f191x;

    /* renamed from: y */
    public Message f192y;

    /* renamed from: z */
    public Drawable f193z;

    /* renamed from: n */
    public boolean f181n = false;

    /* renamed from: B */
    public int f150B = 0;

    /* renamed from: I */
    public int f157I = -1;

    /* renamed from: Q */
    public int f165Q = 0;

    /* renamed from: S */
    public final View.OnClickListener f167S = new View$OnClickListenerC0055a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: p */
        public final int f194p;

        /* renamed from: q */
        public final int f195q;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x21.f31895c2);
            this.f195q = obtainStyledAttributes.getDimensionPixelOffset(x21.f31900d2, -1);
            this.f194p = obtainStyledAttributes.getDimensionPixelOffset(x21.f31905e2, -1);
        }

        /* renamed from: a */
        public void m30312a(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f194p, getPaddingRight(), z2 ? getPaddingBottom() : this.f195q);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0055a implements View.OnClickListener {
        public View$OnClickListenerC0055a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f182o || (message2 = alertController.f184q) == null) && (view != alertController.f186s || (message2 = alertController.f188u) == null)) ? (view != alertController.f190w || (message = alertController.f192y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f166R.obtainMessage(1, alertController2.f169b).sendToTarget();
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0056b implements NestedScrollView.InterfaceC0211c {

        /* renamed from: a */
        public final /* synthetic */ View f197a;

        /* renamed from: b */
        public final /* synthetic */ View f198b;

        public C0056b(View view, View view2) {
            this.f197a = view;
            this.f198b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0211c
        /* renamed from: a */
        public void mo29658a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m30333f(nestedScrollView, this.f197a, this.f198b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0057c implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ View f200p;

        /* renamed from: q */
        public final /* synthetic */ View f201q;

        public RunnableC0057c(View view, View view2) {
            this.f200p = view;
            this.f201q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m30333f(AlertController.this.f149A, this.f200p, this.f201q);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0058d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        public final /* synthetic */ View f203a;

        /* renamed from: b */
        public final /* synthetic */ View f204b;

        public C0058d(View view, View view2) {
            this.f203a = view;
            this.f204b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m30333f(absListView, this.f203a, this.f204b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0059e implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ View f206p;

        /* renamed from: q */
        public final /* synthetic */ View f207q;

        public RunnableC0059e(View view, View view2) {
            this.f206p = view;
            this.f207q = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m30333f(AlertController.this.f174g, this.f206p, this.f207q);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0060f {

        /* renamed from: A */
        public int f209A;

        /* renamed from: B */
        public int f210B;

        /* renamed from: C */
        public int f211C;

        /* renamed from: D */
        public int f212D;

        /* renamed from: F */
        public boolean[] f214F;

        /* renamed from: G */
        public boolean f215G;

        /* renamed from: H */
        public boolean f216H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f218J;

        /* renamed from: K */
        public Cursor f219K;

        /* renamed from: L */
        public String f220L;

        /* renamed from: M */
        public String f221M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f222N;

        /* renamed from: O */
        public InterfaceC0065e f223O;

        /* renamed from: a */
        public final Context f225a;

        /* renamed from: b */
        public final LayoutInflater f226b;

        /* renamed from: d */
        public Drawable f228d;

        /* renamed from: f */
        public CharSequence f230f;

        /* renamed from: g */
        public View f231g;

        /* renamed from: h */
        public CharSequence f232h;

        /* renamed from: i */
        public CharSequence f233i;

        /* renamed from: j */
        public Drawable f234j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f235k;

        /* renamed from: l */
        public CharSequence f236l;

        /* renamed from: m */
        public Drawable f237m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f238n;

        /* renamed from: o */
        public CharSequence f239o;

        /* renamed from: p */
        public Drawable f240p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f241q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f243s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f244t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f245u;

        /* renamed from: v */
        public CharSequence[] f246v;

        /* renamed from: w */
        public ListAdapter f247w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f248x;

        /* renamed from: y */
        public int f249y;

        /* renamed from: z */
        public View f250z;

        /* renamed from: c */
        public int f227c = 0;

        /* renamed from: e */
        public int f229e = 0;

        /* renamed from: E */
        public boolean f213E = false;

        /* renamed from: I */
        public int f217I = -1;

        /* renamed from: P */
        public boolean f224P = true;

        /* renamed from: r */
        public boolean f242r = true;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class C0061a extends ArrayAdapter<CharSequence> {

            /* renamed from: p */
            public final /* synthetic */ RecycleListView f251p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f251p = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0060f.this.f214F;
                if (zArr != null && zArr[i]) {
                    this.f251p.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class C0062b extends CursorAdapter {

            /* renamed from: p */
            public final int f253p;

            /* renamed from: q */
            public final int f254q;

            /* renamed from: r */
            public final /* synthetic */ RecycleListView f255r;

            /* renamed from: s */
            public final /* synthetic */ AlertController f256s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0062b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f255r = recycleListView;
                this.f256s = alertController;
                Cursor cursor2 = getCursor();
                this.f253p = cursor2.getColumnIndexOrThrow(C0060f.this.f220L);
                this.f254q = cursor2.getColumnIndexOrThrow(C0060f.this.f221M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f253p));
                this.f255r.setItemChecked(cursor.getPosition(), cursor.getInt(this.f254q) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0060f.this.f226b.inflate(this.f256s.f161M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class C0063c implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            public final /* synthetic */ AlertController f258p;

            public C0063c(AlertController alertController) {
                this.f258p = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0060f.this.f248x.onClick(this.f258p.f169b, i);
                if (C0060f.this.f216H) {
                    return;
                }
                this.f258p.f169b.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class C0064d implements AdapterView.OnItemClickListener {

            /* renamed from: p */
            public final /* synthetic */ RecycleListView f260p;

            /* renamed from: q */
            public final /* synthetic */ AlertController f261q;

            public C0064d(RecycleListView recycleListView, AlertController alertController) {
                this.f260p = recycleListView;
                this.f261q = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0060f.this.f214F;
                if (zArr != null) {
                    zArr[i] = this.f260p.isItemChecked(i);
                }
                C0060f.this.f218J.onClick(this.f261q.f169b, i, this.f260p.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        /* loaded from: classes.dex */
        public interface InterfaceC0065e {
            /* renamed from: a */
            void m30309a(ListView listView);
        }

        public C0060f(Context context) {
            this.f225a = context;
            this.f226b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m30311a(AlertController alertController) {
            View view = this.f231g;
            if (view != null) {
                alertController.m30327l(view);
            } else {
                CharSequence charSequence = this.f230f;
                if (charSequence != null) {
                    alertController.m30322q(charSequence);
                }
                Drawable drawable = this.f228d;
                if (drawable != null) {
                    alertController.m30325n(drawable);
                }
                int i = this.f227c;
                if (i != 0) {
                    alertController.m30326m(i);
                }
                int i2 = this.f229e;
                if (i2 != 0) {
                    alertController.m30326m(alertController.m30336c(i2));
                }
            }
            CharSequence charSequence2 = this.f232h;
            if (charSequence2 != null) {
                alertController.m30324o(charSequence2);
            }
            CharSequence charSequence3 = this.f233i;
            if (charSequence3 != null || this.f234j != null) {
                alertController.m30328k(-1, charSequence3, this.f235k, null, this.f234j);
            }
            CharSequence charSequence4 = this.f236l;
            if (charSequence4 != null || this.f237m != null) {
                alertController.m30328k(-2, charSequence4, this.f238n, null, this.f237m);
            }
            CharSequence charSequence5 = this.f239o;
            if (charSequence5 != null || this.f240p != null) {
                alertController.m30328k(-3, charSequence5, this.f241q, null, this.f240p);
            }
            if (this.f246v != null || this.f219K != null || this.f247w != null) {
                m30310b(alertController);
            }
            View view2 = this.f250z;
            if (view2 != null) {
                if (this.f213E) {
                    alertController.m30319t(view2, this.f209A, this.f210B, this.f211C, this.f212D);
                    return;
                } else {
                    alertController.m30320s(view2);
                    return;
                }
            }
            int i3 = this.f249y;
            if (i3 != 0) {
                alertController.m30321r(i3);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m30310b(AlertController alertController) {
            ListAdapter listAdapter;
            AdapterView.OnItemClickListener c0064d;
            AdapterView.OnItemSelectedListener onItemSelectedListener;
            RecycleListView recycleListView = (RecycleListView) this.f226b.inflate(alertController.f160L, (ViewGroup) null);
            if (this.f215G) {
                listAdapter = this.f219K == null ? new C0061a(this.f225a, alertController.f161M, 16908308, this.f246v, recycleListView) : new C0062b(this.f225a, this.f219K, false, recycleListView, alertController);
            } else {
                int i = this.f216H ? alertController.f162N : alertController.f163O;
                if (this.f219K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f225a, i, this.f219K, new String[]{this.f220L}, new int[]{16908308});
                } else {
                    listAdapter = this.f247w;
                    if (listAdapter == null) {
                        listAdapter = new C0067h(this.f225a, i, 16908308, this.f246v);
                    }
                }
            }
            InterfaceC0065e interfaceC0065e = this.f223O;
            if (interfaceC0065e != null) {
                interfaceC0065e.m30309a(recycleListView);
            }
            alertController.f156H = listAdapter;
            alertController.f157I = this.f217I;
            if (this.f248x == null) {
                if (this.f218J != null) {
                    c0064d = new C0064d(recycleListView, alertController);
                }
                onItemSelectedListener = this.f222N;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (!this.f216H) {
                    recycleListView.setChoiceMode(1);
                } else if (this.f215G) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f174g = recycleListView;
            }
            c0064d = new C0063c(alertController);
            recycleListView.setOnItemClickListener(c0064d);
            onItemSelectedListener = this.f222N;
            if (onItemSelectedListener != null) {
            }
            if (!this.f216H) {
            }
            alertController.f174g = recycleListView;
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    public static final class HandlerC0066g extends Handler {

        /* renamed from: a */
        public WeakReference<DialogInterface> f263a;

        public HandlerC0066g(DialogInterface dialogInterface) {
            this.f263a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f263a.get(), message.what);
            } else if (i != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0067h extends ArrayAdapter<CharSequence> {
        public C0067h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0913c4 dialogC0913c4, Window window) {
        this.f168a = context;
        this.f169b = dialogC0913c4;
        this.f170c = window;
        this.f166R = new HandlerC0066g(dialogC0913c4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, x21.f31783F, x01.alertDialogStyle, 0);
        this.f158J = obtainStyledAttributes.getResourceId(x21.f31788G, 0);
        this.f159K = obtainStyledAttributes.getResourceId(x21.f31798I, 0);
        this.f160L = obtainStyledAttributes.getResourceId(x21.f31808K, 0);
        this.f161M = obtainStyledAttributes.getResourceId(x21.f31813L, 0);
        this.f162N = obtainStyledAttributes.getResourceId(x21.f31823N, 0);
        this.f163O = obtainStyledAttributes.getResourceId(x21.f31803J, 0);
        this.f164P = obtainStyledAttributes.getBoolean(x21.f31818M, true);
        this.f171d = obtainStyledAttributes.getDimensionPixelSize(x21.f31793H, 0);
        obtainStyledAttributes.recycle();
        dialogC0913c4.m25639m(1);
    }

    /* renamed from: a */
    public static boolean m30338a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m30338a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public static void m30333f(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* renamed from: z */
    public static boolean m30313z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(x01.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: b */
    public final void m30337b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public int m30336c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f168a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m30335d() {
        return this.f174g;
    }

    /* renamed from: e */
    public void m30334e() {
        this.f169b.setContentView(m30329j());
        m30314y();
    }

    /* renamed from: g */
    public boolean m30332g(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f149A;
        return nestedScrollView != null && nestedScrollView.m29670r(keyEvent);
    }

    /* renamed from: h */
    public boolean m30331h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f149A;
        return nestedScrollView != null && nestedScrollView.m29670r(keyEvent);
    }

    /* renamed from: i */
    public final ViewGroup m30330i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    public final int m30329j() {
        int i = this.f159K;
        return (i != 0 && this.f165Q == 1) ? i : this.f158J;
    }

    /* renamed from: k */
    public void m30328k(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f166R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f191x = charSequence;
            this.f192y = message;
            this.f193z = drawable;
        } else if (i == -2) {
            this.f187t = charSequence;
            this.f188u = message;
            this.f189v = drawable;
        } else if (i != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.f183p = charSequence;
            this.f184q = message;
            this.f185r = drawable;
        }
    }

    /* renamed from: l */
    public void m30327l(View view) {
        this.f155G = view;
    }

    /* renamed from: m */
    public void m30326m(int i) {
        this.f151C = null;
        this.f150B = i;
        ImageView imageView = this.f152D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f152D.setImageResource(this.f150B);
        }
    }

    /* renamed from: n */
    public void m30325n(Drawable drawable) {
        this.f151C = drawable;
        this.f150B = 0;
        ImageView imageView = this.f152D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            this.f152D.setImageDrawable(drawable);
        }
    }

    /* renamed from: o */
    public void m30324o(CharSequence charSequence) {
        this.f173f = charSequence;
        TextView textView = this.f154F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: p */
    public final void m30323p(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f170c.findViewById(o11.scrollIndicatorUp);
        View findViewById2 = this.f170c.findViewById(o11.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            xs1.m4763G0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById == null && findViewById2 == null) {
                return;
            }
            if (this.f173f != null) {
                this.f149A.setOnScrollChangeListener(new C0056b(findViewById, findViewById2));
                this.f149A.post(new RunnableC0057c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f174g;
            if (listView != null) {
                listView.setOnScrollListener(new C0058d(findViewById, findViewById2));
                this.f174g.post(new RunnableC0059e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: q */
    public void m30322q(CharSequence charSequence) {
        this.f172e = charSequence;
        TextView textView = this.f153E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m30321r(int i) {
        this.f175h = null;
        this.f176i = i;
        this.f181n = false;
    }

    /* renamed from: s */
    public void m30320s(View view) {
        this.f175h = view;
        this.f176i = 0;
        this.f181n = false;
    }

    /* renamed from: t */
    public void m30319t(View view, int i, int i2, int i3, int i4) {
        this.f175h = view;
        this.f176i = 0;
        this.f181n = true;
        this.f177j = i;
        this.f178k = i2;
        this.f179l = i3;
        this.f180m = i4;
    }

    /* renamed from: u */
    public final void m30318u(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f182o = button2;
        button2.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f183p) && this.f185r == null) {
            this.f182o.setVisibility(8);
            z = false;
        } else {
            this.f182o.setText(this.f183p);
            Drawable drawable = this.f185r;
            if (drawable != null) {
                int i = this.f171d;
                drawable.setBounds(0, 0, i, i);
                this.f182o.setCompoundDrawables(this.f185r, null, null, null);
            }
            this.f182o.setVisibility(0);
            z = true;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f186s = button3;
        button3.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f187t) && this.f189v == null) {
            this.f186s.setVisibility(8);
        } else {
            this.f186s.setText(this.f187t);
            Drawable drawable2 = this.f189v;
            if (drawable2 != null) {
                int i2 = this.f171d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f186s.setCompoundDrawables(this.f189v, null, null, null);
            }
            this.f186s.setVisibility(0);
            z |= true;
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f190w = button4;
        button4.setOnClickListener(this.f167S);
        if (TextUtils.isEmpty(this.f191x) && this.f193z == null) {
            this.f190w.setVisibility(8);
        } else {
            this.f190w.setText(this.f191x);
            Drawable drawable3 = this.f193z;
            if (drawable3 != null) {
                int i3 = this.f171d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f190w.setCompoundDrawables(this.f193z, null, null, null);
            }
            this.f190w.setVisibility(0);
            z |= true;
        }
        if (m30313z(this.f168a)) {
            if (z) {
                button = this.f182o;
            } else if (z) {
                button = this.f186s;
            } else if (z) {
                button = this.f190w;
            }
            m30337b(button);
        }
        if (z) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: v */
    public final void m30317v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f170c.findViewById(o11.scrollView);
        this.f149A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f149A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f154F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f173f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f149A.removeView(this.f154F);
        if (this.f174g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f149A.getParent();
        int indexOfChild = viewGroup2.indexOfChild(this.f149A);
        viewGroup2.removeViewAt(indexOfChild);
        viewGroup2.addView(this.f174g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: w */
    public final void m30316w(ViewGroup viewGroup) {
        View view = this.f175h;
        if (view == null) {
            view = this.f176i != 0 ? LayoutInflater.from(this.f168a).inflate(this.f176i, viewGroup, false) : null;
        }
        boolean z = view != null;
        if (!z || !m30338a(view)) {
            this.f170c.setFlags(131072, 131072);
        }
        if (!z) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f170c.findViewById(o11.custom);
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
        if (this.f181n) {
            frameLayout.setPadding(this.f177j, this.f178k, this.f179l, this.f180m);
        }
        if (this.f174g != null) {
            ((LinearLayout.LayoutParams) ((C0164b.C0165a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    /* renamed from: x */
    public final void m30315x(ViewGroup viewGroup) {
        if (this.f155G != null) {
            viewGroup.addView(this.f155G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f170c.findViewById(o11.title_template).setVisibility(8);
            return;
        }
        this.f152D = (ImageView) this.f170c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f172e)) || !this.f164P) {
            this.f170c.findViewById(o11.title_template).setVisibility(8);
            this.f152D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f170c.findViewById(o11.alertTitle);
        this.f153E = textView;
        textView.setText(this.f172e);
        int i = this.f150B;
        if (i != 0) {
            this.f152D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f151C;
        if (drawable != null) {
            this.f152D.setImageDrawable(drawable);
            return;
        }
        this.f153E.setPadding(this.f152D.getPaddingLeft(), this.f152D.getPaddingTop(), this.f152D.getPaddingRight(), this.f152D.getPaddingBottom());
        this.f152D.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public final void m30314y() {
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3 = this.f170c.findViewById(o11.parentPanel);
        int i = o11.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = o11.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = o11.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(o11.customPanel);
        m30316w(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup m30330i = m30330i(findViewById7, findViewById4);
        ViewGroup m30330i2 = m30330i(findViewById8, findViewById5);
        ViewGroup m30330i3 = m30330i(findViewById9, findViewById6);
        m30317v(m30330i2);
        m30318u(m30330i3);
        m30315x(m30330i);
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (m30330i == null || m30330i.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (m30330i3 == null || m30330i3.getVisibility() == 8) ? false : true;
        if (!z3 && m30330i2 != null && (findViewById2 = m30330i2.findViewById(o11.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f149A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (this.f173f != null || this.f174g != null) {
                view = m30330i.findViewById(o11.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (m30330i2 != null && (findViewById = m30330i2.findViewById(o11.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f174g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m30312a(z2, z3);
        }
        if (!z) {
            View view2 = this.f174g;
            if (view2 == null) {
                view2 = this.f149A;
            }
            if (view2 != null) {
                m30323p(m30330i2, view2, z2 | (z3 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f174g;
        if (listView2 == null || (listAdapter = this.f156H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i4 = this.f157I;
        if (i4 > -1) {
            listView2.setItemChecked(i4, true);
            listView2.setSelection(i4);
        }
    }
}
