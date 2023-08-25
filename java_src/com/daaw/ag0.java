package com.daaw;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import com.daaw.C3081tk;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class ag0 {

    /* renamed from: com.daaw.ag0$a */
    /* loaded from: classes.dex */
    public class C0624a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0626c f3172a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0624a(InputConnection inputConnection, boolean z, InterfaceC0626c interfaceC0626c) {
            super(inputConnection, z);
            this.f3172a = interfaceC0626c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f3172a.mo2360a(bg0.m26180f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: com.daaw.ag0$b */
    /* loaded from: classes.dex */
    public class C0625b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0626c f3173a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0625b(InputConnection inputConnection, boolean z, InterfaceC0626c interfaceC0626c) {
            super(inputConnection, z);
            this.f3173a = interfaceC0626c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (ag0.m27486e(str, bundle, this.f3173a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: com.daaw.ag0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0626c {
        /* renamed from: a */
        boolean mo2360a(bg0 bg0Var, int i, Bundle bundle);
    }

    /* renamed from: b */
    public static InterfaceC0626c m27489b(final View view) {
        ty0.m8699f(view);
        return new InterfaceC0626c() { // from class: com.daaw.zf0
            @Override // com.daaw.ag0.InterfaceC0626c
            /* renamed from: a */
            public final boolean mo2360a(bg0 bg0Var, int i, Bundle bundle) {
                boolean m27485f;
                m27485f = ag0.m27485f(view, bg0Var, i, bundle);
                return m27485f;
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m27488c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m27487d(inputConnection, editorInfo, m27489b(view));
    }

    @Deprecated
    /* renamed from: d */
    public static InputConnection m27487d(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC0626c interfaceC0626c) {
        pt0.m13157d(inputConnection, "inputConnection must be non-null");
        pt0.m13157d(editorInfo, "editorInfo must be non-null");
        pt0.m13157d(interfaceC0626c, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new C0624a(inputConnection, false, interfaceC0626c) : C2983sv.m9845a(editorInfo).length == 0 ? inputConnection : new C0625b(inputConnection, false, interfaceC0626c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    public static boolean m27486e(String str, Bundle bundle, InterfaceC0626c interfaceC0626c) {
        boolean z;
        ResultReceiver resultReceiver;
        ?? r0 = 0;
        r0 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    r0 = interfaceC0626c.mo2360a(new bg0(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r0, null);
                }
                return r0;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m27485f(View view, bg0 bg0Var, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                bg0Var.m26182d();
                InputContentInfo inputContentInfo = (InputContentInfo) bg0Var.m26181e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception unused) {
                return false;
            }
        }
        return xs1.m4722h0(view, new C3081tk.C3082a(new ClipData(bg0Var.m26184b(), new ClipData.Item(bg0Var.m26185a())), 2).m9057d(bg0Var.m26183c()).m9059b(bundle).m9060a()) == null;
    }
}
