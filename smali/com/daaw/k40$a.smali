.class public Lcom/daaw/k40$a;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/k40;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final p:[Lcom/daaw/j40;

.field public final q:Lcom/daaw/ki1$a;

.field public r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[Lcom/daaw/j40;Lcom/daaw/ki1$a;)V
    .locals 6

    iget v4, p4, Lcom/daaw/ki1$a;->a:I

    new-instance v5, Lcom/daaw/k40$a$a;

    invoke-direct {v5, p4, p3}, Lcom/daaw/k40$a$a;-><init>(Lcom/daaw/ki1$a;[Lcom/daaw/j40;)V

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object p4, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    iput-object p3, p0, Lcom/daaw/k40$a;->p:[Lcom/daaw/j40;

    return-void
.end method

.method public static n([Lcom/daaw/j40;Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;
    .locals 2

    const/4 v0, 0x0

    aget-object v1, p0, v0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/daaw/j40;->d(Landroid/database/sqlite/SQLiteDatabase;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    new-instance v1, Lcom/daaw/j40;

    invoke-direct {v1, p1}, Lcom/daaw/j40;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    aput-object v1, p0, v0

    :cond_1
    aget-object p0, p0, v0

    return-object p0
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    iget-object v0, p0, Lcom/daaw/k40$a;->p:[Lcom/daaw/j40;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k40$a;->p:[Lcom/daaw/j40;

    invoke-static {v0, p1}, Lcom/daaw/k40$a;->n([Lcom/daaw/j40;Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    return-object p1
.end method

.method public onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    invoke-virtual {p0, p1}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ki1$a;->b(Lcom/daaw/ji1;)V

    return-void
.end method

.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    invoke-virtual {p0, p1}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ki1$a;->d(Lcom/daaw/ji1;)V

    return-void
.end method

.method public onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/k40$a;->r:Z

    iget-object v0, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    invoke-virtual {p0, p1}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/ki1$a;->e(Lcom/daaw/ji1;II)V

    return-void
.end method

.method public onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/k40$a;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    invoke-virtual {p0, p1}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/ki1$a;->f(Lcom/daaw/ji1;)V

    :cond_0
    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/k40$a;->r:Z

    iget-object v0, p0, Lcom/daaw/k40$a;->q:Lcom/daaw/ki1$a;

    invoke-virtual {p0, p1}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/ki1$a;->g(Lcom/daaw/ji1;II)V

    return-void
.end method

.method public declared-synchronized q()Lcom/daaw/ji1;
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/daaw/k40$a;->r:Z

    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/k40$a;->r:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/k40$a;->close()V

    invoke-virtual {p0}, Lcom/daaw/k40$a;->q()Lcom/daaw/ji1;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/daaw/k40$a;->d(Landroid/database/sqlite/SQLiteDatabase;)Lcom/daaw/j40;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
