.class public final Lcom/daaw/aj1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zi1;


# instance fields
.field public final a:Lcom/daaw/b61;

.field public final b:Lcom/daaw/nx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nx<",
            "Lcom/daaw/yi1;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/daaw/mc1;


# direct methods
.method public constructor <init>(Lcom/daaw/b61;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    new-instance v0, Lcom/daaw/aj1$a;

    invoke-direct {v0, p0, p1}, Lcom/daaw/aj1$a;-><init>(Lcom/daaw/aj1;Lcom/daaw/b61;)V

    iput-object v0, p0, Lcom/daaw/aj1;->b:Lcom/daaw/nx;

    new-instance v0, Lcom/daaw/aj1$b;

    invoke-direct {v0, p0, p1}, Lcom/daaw/aj1$b;-><init>(Lcom/daaw/aj1;Lcom/daaw/b61;)V

    iput-object v0, p0, Lcom/daaw/aj1;->c:Lcom/daaw/mc1;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v2}, Lcom/daaw/b61;->b()V

    iget-object v2, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return-object v3

    :catchall_0
    move-exception v1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method public b(Lcom/daaw/yi1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->b()V

    iget-object v0, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v0, p0, Lcom/daaw/aj1;->b:Lcom/daaw/nx;

    invoke-virtual {v0, p1}, Lcom/daaw/nx;->h(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->g()V

    return-void

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw p1
.end method

.method public c(Ljava/lang/String;)Lcom/daaw/yi1;
    .locals 5

    const-string v0, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/e61;->q(Ljava/lang/String;I)Lcom/daaw/e61;

    move-result-object v0

    if-nez p1, :cond_0

    invoke-virtual {v0, v1}, Lcom/daaw/e61;->F(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/daaw/e61;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->b()V

    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v0, v1, v2}, Lcom/daaw/to;->b(Lcom/daaw/b61;Lcom/daaw/mi1;ZLandroid/os/CancellationSignal;)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string v1, "work_spec_id"

    invoke-static {p1, v1}, Lcom/daaw/qn;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v1

    const-string v3, "system_id"

    invoke-static {p1, v3}, Lcom/daaw/qn;->b(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, Lcom/daaw/yi1;

    invoke-direct {v3, v1, v2}, Lcom/daaw/yi1;-><init>(Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v3

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    return-object v2

    :catchall_0
    move-exception v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0}, Lcom/daaw/e61;->D()V

    throw v1
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v0}, Lcom/daaw/b61;->b()V

    iget-object v0, p0, Lcom/daaw/aj1;->c:Lcom/daaw/mc1;

    invoke-virtual {v0}, Lcom/daaw/mc1;->a()Lcom/daaw/ni1;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    invoke-interface {v0, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1, p1}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->c()V

    :try_start_0
    invoke-interface {v0}, Lcom/daaw/ni1;->j()I

    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {p1}, Lcom/daaw/b61;->g()V

    iget-object p1, p0, Lcom/daaw/aj1;->c:Lcom/daaw/mc1;

    invoke-virtual {p1, v0}, Lcom/daaw/mc1;->f(Lcom/daaw/ni1;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lcom/daaw/aj1;->a:Lcom/daaw/b61;

    invoke-virtual {v1}, Lcom/daaw/b61;->g()V

    iget-object v1, p0, Lcom/daaw/aj1;->c:Lcom/daaw/mc1;

    invoke-virtual {v1, v0}, Lcom/daaw/mc1;->f(Lcom/daaw/ni1;)V

    throw p1
.end method
