.class public Lcom/daaw/j40$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/sqlite/SQLiteDatabase$CursorFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/j40;->I(Lcom/daaw/mi1;)Landroid/database/Cursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/mi1;

.field public final synthetic b:Lcom/daaw/j40;


# direct methods
.method public constructor <init>(Lcom/daaw/j40;Lcom/daaw/mi1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j40$a;->b:Lcom/daaw/j40;

    iput-object p2, p0, Lcom/daaw/j40$a;->a:Lcom/daaw/mi1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public newCursor(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)Landroid/database/Cursor;
    .locals 1

    iget-object p1, p0, Lcom/daaw/j40$a;->a:Lcom/daaw/mi1;

    new-instance v0, Lcom/daaw/m40;

    invoke-direct {v0, p4}, Lcom/daaw/m40;-><init>(Landroid/database/sqlite/SQLiteProgram;)V

    invoke-interface {p1, v0}, Lcom/daaw/mi1;->d(Lcom/daaw/li1;)V

    new-instance p1, Landroid/database/sqlite/SQLiteCursor;

    invoke-direct {p1, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    return-object p1
.end method
