.class public final Lcom/daaw/ct;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/bt;


# instance fields
.field public final a:Lcom/daaw/b61;

.field public final b:Lcom/daaw/nx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nx<",
            "Lcom/daaw/xs;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/b61;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    new-instance v0, Lcom/daaw/ct$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ct$a;-><init>(Lcom/daaw/ct;Lcom/daaw/b61;)V

    iput-object v0, p0, Lcom/daaw/ct;->b:Lcom/daaw/nx;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/e61;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/e61;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->b()V

    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method

.method public b(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/e61;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/e61;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->b()V

    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v2}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move v3, v1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return v3

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    throw v1
.end method

.method public c(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/e61;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/e61;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->b()V

    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1, v0, v3, v2}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    move v3, v1

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return v3

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    throw v1
.end method

.method public d(Lcom/daaw/xs;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->b()V

    iget-object v0, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ct;->b:Lcom/daaw/nx;

    invoke-virtual {v0, p1}, Lcom/daaw/nx;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/ct;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw p1
.end method
