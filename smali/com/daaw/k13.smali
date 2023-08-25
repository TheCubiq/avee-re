.class public final Lcom/daaw/k13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/l13;


# direct methods
.method public constructor <init>(Lcom/daaw/l13;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/k13;->p:Lcom/daaw/l13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/k13;->p:Lcom/daaw/l13;

    invoke-static {v0}, Lcom/daaw/l13;->c(Lcom/daaw/l13;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/k13;->p:Lcom/daaw/l13;

    invoke-static {v1}, Lcom/daaw/l13;->i(Lcom/daaw/l13;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/l13;->j(Lcom/daaw/l13;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/daaw/l13;->e(Lcom/daaw/l13;Z)V

    const-string v1, "App went background"

    invoke-static {v1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/daaw/k13;->p:Lcom/daaw/l13;

    invoke-static {v1}, Lcom/daaw/l13;->d(Lcom/daaw/l13;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/m13;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v3, v2}, Lcom/daaw/m13;->zza(Z)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_2
    const-string v4, ""

    invoke-static {v4, v3}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    const-string v1, "App is still foreground"

    invoke-static {v1}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
