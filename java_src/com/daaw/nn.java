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
import com.daaw.pn;
/* loaded from: classes.dex */
public abstract class nn extends BaseAdapter implements Filterable, pn.a {
    public boolean p;
    public boolean q;
    public Cursor r;
    public Context s;
    public int t;
    public a u;
    public DataSetObserver v;
    public pn w;

    /* loaded from: classes.dex */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            nn.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            nn nnVar = nn.this;
            nnVar.p = true;
            nnVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            nn nnVar = nn.this;
            nnVar.p = false;
            nnVar.notifyDataSetInvalidated();
        }
    }

    public nn(Context context, Cursor cursor, boolean z) {
        f(context, cursor, z ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j = j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // com.daaw.pn.a
    public Cursor b() {
        return this.r;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    public void f(Context context, Cursor cursor, int i) {
        b bVar;
        if ((i & 1) == 1) {
            i |= 2;
            this.q = true;
        } else {
            this.q = false;
        }
        boolean z = cursor != null;
        this.r = cursor;
        this.p = z;
        this.s = context;
        this.t = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.u = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.u = null;
        }
        this.v = bVar;
        if (z) {
            a aVar = this.u;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.v;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.p || (cursor = this.r) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.p) {
            this.r.moveToPosition(i);
            if (view == null) {
                view = g(this.s, this.r, viewGroup);
            }
            e(view, this.s, this.r);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.w == null) {
            this.w = new pn(this);
        }
        return this.w;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.p || (cursor = this.r) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.r;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.p && (cursor = this.r) != null && cursor.moveToPosition(i)) {
            return this.r.getLong(this.t);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.p) {
            if (this.r.moveToPosition(i)) {
                if (view == null) {
                    view = h(this.s, this.r, viewGroup);
                }
                e(view, this.s, this.r);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    public void i() {
        Cursor cursor;
        if (!this.q || (cursor = this.r) == null || cursor.isClosed()) {
            return;
        }
        this.p = this.r.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.r;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.u;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.v;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.r = cursor;
        if (cursor != null) {
            a aVar2 = this.u;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.v;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.t = cursor.getColumnIndexOrThrow("_id");
            this.p = true;
            notifyDataSetChanged();
        } else {
            this.t = -1;
            this.p = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
