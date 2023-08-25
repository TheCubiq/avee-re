.class public final Lcom/daaw/tc8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/l5;


# static fields
.field public static e:Lcom/daaw/l5;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Z

.field public final c:Ljava/util/concurrent/ScheduledExecutorService;

.field public final d:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/tc8;->b:Z

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tc8;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/tc8;->d:Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    iget-boolean p1, p0, Lcom/daaw/tc8;->b:Z

    if-nez p1, :cond_0

    new-instance v2, Lcom/daaw/g68;

    const/4 p1, 0x0

    invoke-direct {v2, p0, p1}, Lcom/daaw/g68;-><init>(Lcom/daaw/tc8;Lcom/daaw/z28;)V

    const-wide/16 v3, 0x0

    const-wide/32 v5, 0x15180

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/tc8;->b:Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic c(Lcom/daaw/tc8;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Lcom/daaw/l5;
    .locals 2

    const-class v0, Lcom/daaw/tc8;

    monitor-enter v0

    :try_start_0
    const-string v1, "Context must not be null"

    invoke-static {p0, v1}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lcom/daaw/tc8;->e:Lcom/daaw/l5;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/tc8;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/daaw/tc8;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/daaw/tc8;->e:Lcom/daaw/l5;

    :cond_0
    sget-object p0, Lcom/daaw/tc8;->e:Lcom/daaw/l5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static final f(Landroid/content/Context;)V
    .locals 2

    invoke-static {p0}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "app_set_id"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Failed to clear app set ID generated for App "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    invoke-static {p0}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "app_set_id_last_used_time"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "Failed to clear app set ID last used time for App "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public static final g(Landroid/content/Context;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "app_set_id_storage"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroid/content/Context;)V
    .locals 4

    invoke-static {p0}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v3, "app_set_id_last_used_time"

    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to store app set ID last used time for App "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    new-instance p0, Lcom/daaw/p98;

    const-string v0, "Failed to store the app set ID last used time."

    invoke-direct {p0, v0}, Lcom/daaw/p98;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/rj1;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/m5;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/tj1;

    invoke-direct {v0}, Lcom/daaw/tj1;-><init>()V

    iget-object v1, p0, Lcom/daaw/tc8;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/daaw/nu7;

    invoke-direct {v2, p0, v0}, Lcom/daaw/nu7;-><init>(Lcom/daaw/tc8;Lcom/daaw/tj1;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Lcom/daaw/tj1;->a()Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method

.method public final b()J
    .locals 5

    iget-object v0, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "app_set_id_last_used_time"

    const-wide/16 v2, -0x1

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide v2, 0x7d8702800L

    add-long/2addr v0, v2

    return-wide v0

    :cond_0
    return-wide v2
.end method

.method public final synthetic e(Lcom/daaw/tj1;)V
    .locals 7

    iget-object v0, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "app_set_id"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/tc8;->b()J

    move-result-wide v2

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/ag;->a()J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/tc8;->h(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/daaw/p98; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    :try_start_1
    iget-object v2, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    if-nez v1, :cond_3

    const-string v0, "Failed to store app set ID generated for App "

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_2
    new-instance v0, Lcom/daaw/p98;

    const-string v1, "Failed to store the app set ID."

    invoke-direct {v0, v1}, Lcom/daaw/p98;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v2}, Lcom/daaw/tc8;->h(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/daaw/tc8;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/daaw/tc8;->g(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-static {}, Lcom/daaw/mq;->d()Lcom/daaw/ag;

    move-result-object v3

    invoke-interface {v3}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v5, "app_set_id_creation_time"

    invoke-interface {v2, v5, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v2

    if-nez v2, :cond_5

    const-string v0, "Failed to store app set ID creation time for App "

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    new-instance v0, Lcom/daaw/p98;

    const-string v1, "Failed to store the app set ID creation time."

    invoke-direct {v0, v1}, Lcom/daaw/p98;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lcom/daaw/p98; {:try_start_1 .. :try_end_1} :catch_1

    :cond_5
    :goto_1
    new-instance v1, Lcom/daaw/m5;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lcom/daaw/m5;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p1, v1}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {p1, v0}, Lcom/daaw/tj1;->b(Ljava/lang/Exception;)V

    return-void
.end method
