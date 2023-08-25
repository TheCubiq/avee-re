package com.daaw;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.daaw.C2563pn;
/* renamed from: com.daaw.nn */
/* loaded from: classes.dex */
public abstract class AbstractC2317nn extends BaseAdapter implements Filterable, C2563pn.InterfaceC2564a {

    /* renamed from: p */
    public boolean f20261p;

    /* renamed from: q */
    public boolean f20262q;

    /* renamed from: r */
    public Cursor f20263r;

    /* renamed from: s */
    public Context f20264s;

    /* renamed from: t */
    public int f20265t;

    /* renamed from: u */
    public C2318a f20266u;

    /* renamed from: v */
    public DataSetObserver f20267v;

    /* renamed from: w */
    public C2563pn f20268w;

    /* renamed from: com.daaw.nn$a */
    /* loaded from: classes.dex */
    public class C2318a extends ContentObserver {
        public C2318a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            AbstractC2317nn.this.m15021i();
        }
    }

    /* renamed from: com.daaw.nn$b */
    /* loaded from: classes.dex */
    public class C2319b extends DataSetObserver {
        public C2319b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2317nn abstractC2317nn = AbstractC2317nn.this;
            abstractC2317nn.f20261p = true;
            abstractC2317nn.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2317nn abstractC2317nn = AbstractC2317nn.this;
            abstractC2317nn.f20261p = false;
            abstractC2317nn.notifyDataSetInvalidated();
        }
    }

    public AbstractC2317nn(Context context, Cursor cursor, boolean z) {
        m15024f(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public void mo13286a(Cursor cursor) {
        Cursor m15020j = m15020j(cursor);
        if (m15020j != null) {
            m15020j.close();
        }
    }

    @Override // com.daaw.C2563pn.InterfaceC2564a
    /* renamed from: b */
    public Cursor mo13285b() {
        return this.f20263r;
    }

    /* renamed from: c */
    public abstract CharSequence mo13284c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo15025e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    public void m15024f(Context context, Cursor cursor, int i) {
        C2319b c2319b;
        if ((i & 1) == 1) {
            i |= 2;
            this.f20262q = true;
        } else {
            this.f20262q = false;
        }
        boolean z = cursor != null;
        this.f20263r = cursor;
        this.f20261p = z;
        this.f20264s = context;
        this.f20265t = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f20266u = new C2318a();
            c2319b = new C2319b();
        } else {
            c2319b = null;
            this.f20266u = null;
        }
        this.f20267v = c2319b;
        if (z) {
            C2318a c2318a = this.f20266u;
            if (c2318a != null) {
                cursor.registerContentObserver(c2318a);
            }
            DataSetObserver dataSetObserver = this.f20267v;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo15023g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f20261p || (cursor = this.f20263r) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f20261p) {
            this.f20263r.moveToPosition(i);
            if (view == null) {
                view = mo15023g(this.f20264s, this.f20263r, viewGroup);
            }
            mo15025e(view, this.f20264s, this.f20263r);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f20268w == null) {
            this.f20268w = new C2563pn(this);
        }
        return this.f20268w;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f20261p || (cursor = this.f20263r) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f20263r;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f20261p && (cursor = this.f20263r) != null && cursor.moveToPosition(i)) {
            return this.f20263r.getLong(this.f20265t);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f20261p) {
            if (this.f20263r.moveToPosition(i)) {
                if (view == null) {
                    view = mo15022h(this.f20264s, this.f20263r, viewGroup);
                }
                mo15025e(view, this.f20264s, this.f20263r);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    /* renamed from: h */
    public abstract View mo15022h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    public void m15021i() {
        Cursor cursor;
        if (!this.f20262q || (cursor = this.f20263r) == null || cursor.isClosed()) {
            return;
        }
        this.f20261p = this.f20263r.requery();
    }

    /* renamed from: j */
    public Cursor m15020j(Cursor cursor) {
        Cursor cursor2 = this.f20263r;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C2318a c2318a = this.f20266u;
            if (c2318a != null) {
                cursor2.unregisterContentObserver(c2318a);
            }
            DataSetObserver dataSetObserver = this.f20267v;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20263r = cursor;
        if (cursor != null) {
            C2318a c2318a2 = this.f20266u;
            if (c2318a2 != null) {
                cursor.registerContentObserver(c2318a2);
            }
            DataSetObserver dataSetObserver2 = this.f20267v;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f20265t = cursor.getColumnIndexOrThrow("_id");
            this.f20261p = true;
            notifyDataSetChanged();
        } else {
            this.f20265t = -1;
            this.f20261p = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
