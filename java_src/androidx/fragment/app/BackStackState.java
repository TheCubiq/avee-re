package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.AbstractC0314j;
import androidx.lifecycle.AbstractC0344c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0252a();

    /* renamed from: A */
    public final ArrayList<String> f1339A;

    /* renamed from: B */
    public final ArrayList<String> f1340B;

    /* renamed from: C */
    public final boolean f1341C;

    /* renamed from: p */
    public final int[] f1342p;

    /* renamed from: q */
    public final ArrayList<String> f1343q;

    /* renamed from: r */
    public final int[] f1344r;

    /* renamed from: s */
    public final int[] f1345s;

    /* renamed from: t */
    public final int f1346t;

    /* renamed from: u */
    public final String f1347u;

    /* renamed from: v */
    public final int f1348v;

    /* renamed from: w */
    public final int f1349w;

    /* renamed from: x */
    public final CharSequence f1350x;

    /* renamed from: y */
    public final int f1351y;

    /* renamed from: z */
    public final CharSequence f1352z;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    /* loaded from: classes.dex */
    public class C0252a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f1342p = parcel.createIntArray();
        this.f1343q = parcel.createStringArrayList();
        this.f1344r = parcel.createIntArray();
        this.f1345s = parcel.createIntArray();
        this.f1346t = parcel.readInt();
        this.f1347u = parcel.readString();
        this.f1348v = parcel.readInt();
        this.f1349w = parcel.readInt();
        this.f1350x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1351y = parcel.readInt();
        this.f1352z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1339A = parcel.createStringArrayList();
        this.f1340B = parcel.createStringArrayList();
        this.f1341C = parcel.readInt() != 0;
    }

    public BackStackState(C0281a c0281a) {
        int size = c0281a.f1613c.size();
        this.f1342p = new int[size * 5];
        if (!c0281a.f1619i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1343q = new ArrayList<>(size);
        this.f1344r = new int[size];
        this.f1345s = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AbstractC0314j.C0315a c0315a = c0281a.f1613c.get(i);
            int i3 = i2 + 1;
            this.f1342p[i2] = c0315a.f1630a;
            ArrayList<String> arrayList = this.f1343q;
            Fragment fragment = c0315a.f1631b;
            arrayList.add(fragment != null ? fragment.f1400u : null);
            int[] iArr = this.f1342p;
            int i4 = i3 + 1;
            iArr[i3] = c0315a.f1632c;
            int i5 = i4 + 1;
            iArr[i4] = c0315a.f1633d;
            int i6 = i5 + 1;
            iArr[i5] = c0315a.f1634e;
            iArr[i6] = c0315a.f1635f;
            this.f1344r[i] = c0315a.f1636g.ordinal();
            this.f1345s[i] = c0315a.f1637h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f1346t = c0281a.f1618h;
        this.f1347u = c0281a.f1621k;
        this.f1348v = c0281a.f1527v;
        this.f1349w = c0281a.f1622l;
        this.f1350x = c0281a.f1623m;
        this.f1351y = c0281a.f1624n;
        this.f1352z = c0281a.f1625o;
        this.f1339A = c0281a.f1626p;
        this.f1340B = c0281a.f1627q;
        this.f1341C = c0281a.f1628r;
    }

    /* renamed from: a */
    public C0281a m29504a(FragmentManager fragmentManager) {
        C0281a c0281a = new C0281a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f1342p.length) {
            AbstractC0314j.C0315a c0315a = new AbstractC0314j.C0315a();
            int i3 = i + 1;
            c0315a.f1630a = this.f1342p[i];
            if (FragmentManager.m29381E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(c0281a);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f1342p[i3]);
            }
            String str = this.f1343q.get(i2);
            c0315a.f1631b = str != null ? fragmentManager.m29322f0(str) : null;
            c0315a.f1636g = AbstractC0344c.EnumC0347c.values()[this.f1344r[i2]];
            c0315a.f1637h = AbstractC0344c.EnumC0347c.values()[this.f1345s[i2]];
            int[] iArr = this.f1342p;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            c0315a.f1632c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            c0315a.f1633d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            c0315a.f1634e = i9;
            int i10 = iArr[i8];
            c0315a.f1635f = i10;
            c0281a.f1614d = i5;
            c0281a.f1615e = i7;
            c0281a.f1616f = i9;
            c0281a.f1617g = i10;
            c0281a.m29148e(c0315a);
            i2++;
            i = i8 + 1;
        }
        c0281a.f1618h = this.f1346t;
        c0281a.f1621k = this.f1347u;
        c0281a.f1527v = this.f1348v;
        c0281a.f1619i = true;
        c0281a.f1622l = this.f1349w;
        c0281a.f1623m = this.f1350x;
        c0281a.f1624n = this.f1351y;
        c0281a.f1625o = this.f1352z;
        c0281a.f1626p = this.f1339A;
        c0281a.f1627q = this.f1340B;
        c0281a.f1628r = this.f1341C;
        c0281a.m29251p(1);
        return c0281a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1342p);
        parcel.writeStringList(this.f1343q);
        parcel.writeIntArray(this.f1344r);
        parcel.writeIntArray(this.f1345s);
        parcel.writeInt(this.f1346t);
        parcel.writeString(this.f1347u);
        parcel.writeInt(this.f1348v);
        parcel.writeInt(this.f1349w);
        TextUtils.writeToParcel(this.f1350x, parcel, 0);
        parcel.writeInt(this.f1351y);
        TextUtils.writeToParcel(this.f1352z, parcel, 0);
        parcel.writeStringList(this.f1339A);
        parcel.writeStringList(this.f1340B);
        parcel.writeInt(this.f1341C ? 1 : 0);
    }
}
