.class public final Lcom/daaw/do2;
.super Lcom/daaw/no2;
.source ""


# instance fields
.field public i:Ljava/util/List;

.field public final j:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;IILandroid/content/Context;)V
    .locals 7

    const-string v2, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI"

    const-string v3, "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg="

    const/16 v6, 0x1f

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    iput-object p7, p0, Lcom/daaw/do2;->j:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->O(J)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/hi2;->K(J)Lcom/daaw/hi2;

    iget-object v0, p0, Lcom/daaw/do2;->j:Landroid/content/Context;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/no2;->b:Lcom/daaw/wm2;

    invoke-virtual {v0}, Lcom/daaw/wm2;->b()Landroid/content/Context;

    move-result-object v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    new-array v4, v3, [Ljava/lang/Object;

    aput-object v0, v4, v2

    const/4 v0, 0x0

    invoke-virtual {v1, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v4, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/daaw/hi2;->O(J)Lcom/daaw/hi2;

    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v2, p0, Lcom/daaw/do2;->i:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/hi2;->K(J)Lcom/daaw/hi2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    return-void
.end method
