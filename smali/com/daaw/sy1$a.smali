.class public Lcom/daaw/sy1$a;
.super Lcom/daaw/nx;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/sy1;-><init>(Lcom/daaw/b61;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/nx<",
        "Lcom/daaw/qy1;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lcom/daaw/sy1;


# direct methods
.method public constructor <init>(Lcom/daaw/sy1;Lcom/daaw/b61;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/sy1$a;->d:Lcom/daaw/sy1;

    invoke-direct {p0, p2}, Lcom/daaw/nx;-><init>(Lcom/daaw/b61;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method

.method public bridge synthetic g(Lcom/daaw/ni1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/daaw/qy1;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/sy1$a;->i(Lcom/daaw/ni1;Lcom/daaw/qy1;)V

    return-void
.end method

.method public i(Lcom/daaw/ni1;Lcom/daaw/qy1;)V
    .locals 10

    iget-object v0, p2, Lcom/daaw/qy1;->a:Ljava/lang/String;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_0
    iget-object v0, p2, Lcom/daaw/qy1;->b:Lcom/daaw/yx1;

    invoke-static {v0}, Lcom/daaw/xy1;->j(Lcom/daaw/yx1;)I

    move-result v0

    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lcom/daaw/li1;->r(IJ)V

    iget-object v0, p2, Lcom/daaw/qy1;->c:Ljava/lang/String;

    const/4 v1, 0x3

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_1
    iget-object v0, p2, Lcom/daaw/qy1;->d:Ljava/lang/String;

    const/4 v1, 0x4

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_2

    :cond_2
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->i(ILjava/lang/String;)V

    :goto_2
    iget-object v0, p2, Lcom/daaw/qy1;->e:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_3

    :cond_3
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->x(I[B)V

    :goto_3
    iget-object v0, p2, Lcom/daaw/qy1;->f:Landroidx/work/b;

    invoke-static {v0}, Landroidx/work/b;->k(Landroidx/work/b;)[B

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Lcom/daaw/li1;->x(I[B)V

    :goto_4
    const/4 v0, 0x7

    iget-wide v1, p2, Lcom/daaw/qy1;->g:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0x8

    iget-wide v1, p2, Lcom/daaw/qy1;->h:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0x9

    iget-wide v1, p2, Lcom/daaw/qy1;->i:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0xa

    iget v1, p2, Lcom/daaw/qy1;->k:I

    int-to-long v1, v1

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    iget-object v0, p2, Lcom/daaw/qy1;->l:Lcom/daaw/ha;

    invoke-static {v0}, Lcom/daaw/xy1;->a(Lcom/daaw/ha;)I

    move-result v0

    const/16 v1, 0xb

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0xc

    iget-wide v1, p2, Lcom/daaw/qy1;->m:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0xd

    iget-wide v1, p2, Lcom/daaw/qy1;->n:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0xe

    iget-wide v1, p2, Lcom/daaw/qy1;->o:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    const/16 v0, 0xf

    iget-wide v1, p2, Lcom/daaw/qy1;->p:J

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    iget-boolean v0, p2, Lcom/daaw/qy1;->q:Z

    const/16 v1, 0x10

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lcom/daaw/li1;->r(IJ)V

    iget-object v0, p2, Lcom/daaw/qy1;->r:Lcom/daaw/zu0;

    invoke-static {v0}, Lcom/daaw/xy1;->i(Lcom/daaw/zu0;)I

    move-result v0

    const/16 v1, 0x11

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Lcom/daaw/li1;->r(IJ)V

    iget-object p2, p2, Lcom/daaw/qy1;->j:Lcom/daaw/sj;

    const/16 v0, 0x18

    const/16 v1, 0x17

    const/16 v2, 0x16

    const/16 v3, 0x15

    const/16 v4, 0x14

    const/16 v5, 0x13

    const/16 v6, 0x12

    const/16 v7, 0x19

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/daaw/sj;->b()Lcom/daaw/qs0;

    move-result-object v8

    invoke-static {v8}, Lcom/daaw/xy1;->h(Lcom/daaw/qs0;)I

    move-result v8

    int-to-long v8, v8

    invoke-interface {p1, v6, v8, v9}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->g()Z

    move-result v6

    int-to-long v8, v6

    invoke-interface {p1, v5, v8, v9}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->h()Z

    move-result v5

    int-to-long v5, v5

    invoke-interface {p1, v4, v5, v6}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->f()Z

    move-result v4

    int-to-long v4, v4

    invoke-interface {p1, v3, v4, v5}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->i()Z

    move-result v3

    int-to-long v3, v3

    invoke-interface {p1, v2, v3, v4}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->c()J

    move-result-wide v2

    invoke-interface {p1, v1, v2, v3}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->d()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Lcom/daaw/li1;->r(IJ)V

    invoke-virtual {p2}, Lcom/daaw/sj;->a()Lcom/daaw/xk;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/xy1;->c(Lcom/daaw/xk;)[B

    move-result-object p2

    if-nez p2, :cond_5

    goto :goto_5

    :cond_5
    invoke-interface {p1, v7, p2}, Lcom/daaw/li1;->x(I[B)V

    goto :goto_6

    :cond_6
    invoke-interface {p1, v6}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v5}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v4}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v3}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v2}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v1}, Lcom/daaw/li1;->F(I)V

    invoke-interface {p1, v0}, Lcom/daaw/li1;->F(I)V

    :goto_5
    invoke-interface {p1, v7}, Lcom/daaw/li1;->F(I)V

    :goto_6
    return-void
.end method
