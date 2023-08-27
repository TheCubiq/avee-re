package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SQLiteDatabase.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"transaction", "T", "Landroid/database/sqlite/SQLiteDatabase;", "exclusive", "", TtmlNode.TAG_BODY, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroid/database/sqlite/SQLiteDatabase;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class SQLiteDatabaseKt {
    public static /* synthetic */ Object transaction$default(SQLiteDatabase transaction, boolean z, Function1 body, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            transaction.beginTransaction();
        } else {
            transaction.beginTransactionNonExclusive();
        }
        try {
            Object invoke = body.invoke(transaction);
            transaction.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.finallyStart(1);
            transaction.endTransaction();
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <T> T transaction(SQLiteDatabase transaction, boolean z, Function1<? super SQLiteDatabase, ? extends T> body) {
        Intrinsics.checkNotNullParameter(transaction, "$this$transaction");
        Intrinsics.checkNotNullParameter(body, "body");
        if (z) {
            transaction.beginTransaction();
        } else {
            transaction.beginTransactionNonExclusive();
        }
        try {
            T invoke = body.invoke(transaction);
            transaction.setTransactionSuccessful();
            return invoke;
        } finally {
            InlineMarker.finallyStart(1);
            transaction.endTransaction();
            InlineMarker.finallyEnd(1);
        }
    }
}
