package com.daaw;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.emoji2.text.C0232b;
/* renamed from: com.daaw.hw */
/* loaded from: classes.dex */
public final class C1622hw {

    /* renamed from: a */
    public final C1624b f13023a;

    /* renamed from: com.daaw.hw$a */
    /* loaded from: classes.dex */
    public static class C1623a extends C1624b {

        /* renamed from: a */
        public final TextView f13024a;

        /* renamed from: b */
        public final C1146dw f13025b;

        /* renamed from: c */
        public boolean f13026c = true;

        public C1623a(TextView textView) {
            this.f13024a = textView;
            this.f13025b = new C1146dw(textView);
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: a */
        public InputFilter[] mo20371a(InputFilter[] inputFilterArr) {
            return !this.f13026c ? m20377h(inputFilterArr) : m20379f(inputFilterArr);
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: b */
        public boolean mo20370b() {
            return this.f13026c;
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: c */
        public void mo20369c(boolean z) {
            if (z) {
                m20373l();
            }
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: d */
        public void mo20368d(boolean z) {
            this.f13026c = z;
            m20373l();
            m20374k();
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: e */
        public TransformationMethod mo20367e(TransformationMethod transformationMethod) {
            return this.f13026c ? m20372m(transformationMethod) : m20375j(transformationMethod);
        }

        /* renamed from: f */
        public final InputFilter[] m20379f(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f13025b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f13025b;
            return inputFilterArr2;
        }

        /* renamed from: g */
        public final SparseArray<InputFilter> m20378g(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                if (inputFilterArr[i] instanceof C1146dw) {
                    sparseArray.put(i, inputFilterArr[i]);
                }
            }
            return sparseArray;
        }

        /* renamed from: h */
        public final InputFilter[] m20377h(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> m20378g = m20378g(inputFilterArr);
            if (m20378g.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - m20378g.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (m20378g.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        /* renamed from: i */
        public void m20376i(boolean z) {
            this.f13026c = z;
        }

        /* renamed from: j */
        public final TransformationMethod m20375j(TransformationMethod transformationMethod) {
            return transformationMethod instanceof C1883jw ? ((C1883jw) transformationMethod).m18210a() : transformationMethod;
        }

        /* renamed from: k */
        public final void m20374k() {
            this.f13024a.setFilters(mo20371a(this.f13024a.getFilters()));
        }

        /* renamed from: l */
        public void m20373l() {
            this.f13024a.setTransformationMethod(mo20367e(this.f13024a.getTransformationMethod()));
        }

        /* renamed from: m */
        public final TransformationMethod m20372m(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof C1883jw) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new C1883jw(transformationMethod);
        }
    }

    /* renamed from: com.daaw.hw$b */
    /* loaded from: classes.dex */
    public static class C1624b {
        /* renamed from: a */
        public InputFilter[] mo20371a(InputFilter[] inputFilterArr) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo20370b() {
            throw null;
        }

        /* renamed from: c */
        public void mo20369c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        public void mo20368d(boolean z) {
            throw null;
        }

        /* renamed from: e */
        public TransformationMethod mo20367e(TransformationMethod transformationMethod) {
            throw null;
        }
    }

    /* renamed from: com.daaw.hw$c */
    /* loaded from: classes.dex */
    public static class C1625c extends C1624b {

        /* renamed from: a */
        public final C1623a f13027a;

        public C1625c(TextView textView) {
            this.f13027a = new C1623a(textView);
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: a */
        public InputFilter[] mo20371a(InputFilter[] inputFilterArr) {
            return m20366f() ? inputFilterArr : this.f13027a.mo20371a(inputFilterArr);
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: b */
        public boolean mo20370b() {
            return this.f13027a.mo20370b();
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: c */
        public void mo20369c(boolean z) {
            if (m20366f()) {
                return;
            }
            this.f13027a.mo20369c(z);
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: d */
        public void mo20368d(boolean z) {
            if (m20366f()) {
                this.f13027a.m20376i(z);
            } else {
                this.f13027a.mo20368d(z);
            }
        }

        @Override // com.daaw.C1622hw.C1624b
        /* renamed from: e */
        public TransformationMethod mo20367e(TransformationMethod transformationMethod) {
            return m20366f() ? transformationMethod : this.f13027a.mo20367e(transformationMethod);
        }

        /* renamed from: f */
        public final boolean m20366f() {
            return !C0232b.m29569h();
        }
    }

    public C1622hw(TextView textView, boolean z) {
        ty0.m8698g(textView, "textView cannot be null");
        this.f13023a = !z ? new C1625c(textView) : new C1623a(textView);
    }

    /* renamed from: a */
    public InputFilter[] m20384a(InputFilter[] inputFilterArr) {
        return this.f13023a.mo20371a(inputFilterArr);
    }

    /* renamed from: b */
    public boolean m20383b() {
        return this.f13023a.mo20370b();
    }

    /* renamed from: c */
    public void m20382c(boolean z) {
        this.f13023a.mo20369c(z);
    }

    /* renamed from: d */
    public void m20381d(boolean z) {
        this.f13023a.mo20368d(z);
    }

    /* renamed from: e */
    public TransformationMethod m20380e(TransformationMethod transformationMethod) {
        return this.f13023a.mo20367e(transformationMethod);
    }
}
