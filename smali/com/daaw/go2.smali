.class public final Lcom/daaw/go2;
.super Lcom/daaw/no2;
.source ""


# direct methods
.method public constructor <init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V
    .locals 7

    const-string v2, "/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo"

    const-string v3, "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM="

    const/16 v6, 0x33

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/daaw/no2;-><init>(Lcom/daaw/wm2;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/hi2;II)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/no2;->f:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/daaw/rm2;

    invoke-direct {v2, v1}, Lcom/daaw/rm2;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v3, v2, Lcom/daaw/rm2;->a:Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Lcom/daaw/hi2;->n0(J)Lcom/daaw/hi2;

    iget-object v1, p0, Lcom/daaw/no2;->e:Lcom/daaw/hi2;

    iget-object v2, v2, Lcom/daaw/rm2;->b:Ljava/lang/Long;

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/daaw/hi2;->o0(J)Lcom/daaw/hi2;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
