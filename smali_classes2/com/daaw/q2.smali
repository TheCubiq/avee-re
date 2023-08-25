.class public Lcom/daaw/q2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/p2;


# static fields
.field public static volatile c:Lcom/daaw/p2;


# instance fields
.field public final a:Lcom/daaw/g5;

.field public final b:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lcom/daaw/g5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/q2;->a:Lcom/daaw/g5;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lcom/daaw/q2;->b:Ljava/util/Map;

    return-void
.end method

.method public static c(Lcom/daaw/s10;Landroid/content/Context;Lcom/daaw/sh1;)Lcom/daaw/p2;
    .locals 5

    invoke-static {p0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lcom/daaw/q2;->c:Lcom/daaw/p2;

    if-nez v0, :cond_2

    const-class v0, Lcom/daaw/q2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/q2;->c:Lcom/daaw/p2;

    if-nez v1, :cond_1

    new-instance v1, Landroid/os/Bundle;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(I)V

    invoke-virtual {p0}, Lcom/daaw/s10;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    const-class v2, Lcom/daaw/gp;

    sget-object v3, Lcom/daaw/f32;->p:Lcom/daaw/f32;

    sget-object v4, Lcom/daaw/cy2;->a:Lcom/daaw/cy2;

    invoke-interface {p2, v2, v3, v4}, Lcom/daaw/sh1;->a(Ljava/lang/Class;Ljava/util/concurrent/Executor;Lcom/daaw/ay;)V

    const-string p2, "dataCollectionDefaultEnabled"

    invoke-virtual {p0}, Lcom/daaw/s10;->s()Z

    move-result p0

    invoke-virtual {v1, p2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    new-instance p0, Lcom/daaw/q2;

    const/4 p2, 0x0

    invoke-static {p1, p2, p2, p2, v1}, Lcom/daaw/gk5;->u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Lcom/daaw/gk5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/gk5;->r()Lcom/daaw/g5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/q2;-><init>(Lcom/daaw/g5;)V

    sput-object p0, Lcom/daaw/q2;->c:Lcom/daaw/p2;

    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_2
    :goto_0
    sget-object p0, Lcom/daaw/q2;->c:Lcom/daaw/p2;

    return-object p0
.end method

.method public static synthetic d(Lcom/daaw/wx;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/wx;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/gp;

    iget-boolean p0, p0, Lcom/daaw/gp;->a:Z

    const-class v0, Lcom/daaw/q2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/daaw/q2;->c:Lcom/daaw/p2;

    invoke-static {v1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/q2;

    iget-object v1, v1, Lcom/daaw/q2;->a:Lcom/daaw/g5;

    invoke-virtual {v1, p0}, Lcom/daaw/g5;->v(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/daaw/p2$b;)Lcom/daaw/p2$a;
    .locals 3

    invoke-static {p2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lcom/daaw/yr3;->f(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/q2;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/daaw/q2;->a:Lcom/daaw/g5;

    const-string v2, "fiam"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/daaw/fe5;

    invoke-direct {v2, v0, p2}, Lcom/daaw/fe5;-><init>(Lcom/daaw/g5;Lcom/daaw/p2$b;)V

    goto :goto_0

    :cond_2
    const-string v2, "clx"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/daaw/z07;

    invoke-direct {v2, v0, p2}, Lcom/daaw/z07;-><init>(Lcom/daaw/g5;Lcom/daaw/p2$b;)V

    goto :goto_0

    :cond_3
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_4

    iget-object p2, p0, Lcom/daaw/q2;->b:Ljava/util/Map;

    invoke-interface {p2, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lcom/daaw/q2$a;

    invoke-direct {p2, p0, p1}, Lcom/daaw/q2$a;-><init>(Lcom/daaw/q2;Ljava/lang/String;)V

    return-object p2

    :cond_4
    return-object v1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    if-nez p3, :cond_0

    new-instance p3, Landroid/os/Bundle;

    invoke-direct {p3}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-static {p1}, Lcom/daaw/yr3;->f(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-static {p2, p3}, Lcom/daaw/yr3;->d(Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-static {p1, p2, p3}, Lcom/daaw/yr3;->c(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    invoke-static {p1, p2, p3}, Lcom/daaw/yr3;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/daaw/q2;->a:Lcom/daaw/g5;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/g5;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/q2;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/q2;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
