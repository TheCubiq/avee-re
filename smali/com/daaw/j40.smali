.class public Lcom/daaw/j40;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ji1;


# static fields
.field public static final q:[Ljava/lang/String;

.field public static final r:[Ljava/lang/String;


# instance fields
.field public final p:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v0, ""

    const-string v1, " OR ROLLBACK "

    const-string v2, " OR ABORT "

    const-string v3, " OR FAIL "

    const-string v4, " OR IGNORE "

    const-string v5, " OR REPLACE "

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/j40;->q:[Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcom/daaw/j40;->r:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1

    new-instance v0, Lcom/daaw/id1;

    invoke-direct {v0, p1}, Lcom/daaw/id1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/daaw/j40;->I(Lcom/daaw/mi1;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public C()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void
.end method

.method public G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public H()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    move-result v0

    return v0
.end method

.method public I(Lcom/daaw/mi1;)Landroid/database/Cursor;
    .locals 4

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Lcom/daaw/j40$a;

    invoke-direct {v1, p0, p1}, Lcom/daaw/j40$a;-><init>(Lcom/daaw/j40;Lcom/daaw/mi1;)V

    invoke-interface {p1}, Lcom/daaw/mi1;->n()Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lcom/daaw/j40;->r:[Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    return-void
.end method

.method public d(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->isOpen()Z

    move-result v0

    return v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->getAttachedDbs()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public h(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method public k(Ljava/lang/String;)Lcom/daaw/ni1;
    .locals 2

    new-instance v0, Lcom/daaw/n40;

    iget-object v1, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/daaw/n40;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    return-object v0
.end method

.method public s()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    return-void
.end method

.method public t(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public z(Lcom/daaw/mi1;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    .locals 6

    iget-object v0, p0, Lcom/daaw/j40;->p:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Lcom/daaw/j40$b;

    invoke-direct {v1, p0, p1}, Lcom/daaw/j40$b;-><init>(Lcom/daaw/j40;Lcom/daaw/mi1;)V

    invoke-interface {p1}, Lcom/daaw/mi1;->n()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/daaw/j40;->r:[Ljava/lang/String;

    const/4 v4, 0x0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method
