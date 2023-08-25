.class public final Lcom/daaw/tr3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/b86;

.field public b:Lcom/daaw/w07;

.field public final c:Lcom/daaw/z42;

.field public final d:Lcom/daaw/vz8;


# direct methods
.method public constructor <init>()V
    .locals 4

    new-instance v0, Lcom/daaw/b86;

    invoke-direct {v0}, Lcom/daaw/b86;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object v1, v0, Lcom/daaw/b86;->b:Lcom/daaw/w07;

    invoke-virtual {v1}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    new-instance v1, Lcom/daaw/z42;

    invoke-direct {v1}, Lcom/daaw/z42;-><init>()V

    iput-object v1, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    new-instance v1, Lcom/daaw/vz8;

    invoke-direct {v1}, Lcom/daaw/vz8;-><init>()V

    iput-object v1, p0, Lcom/daaw/tr3;->d:Lcom/daaw/vz8;

    new-instance v1, Lcom/daaw/a32;

    invoke-direct {v1, p0}, Lcom/daaw/a32;-><init>(Lcom/daaw/tr3;)V

    iget-object v2, v0, Lcom/daaw/b86;->d:Lcom/daaw/h68;

    const-string v3, "internal.registerCallback"

    invoke-virtual {v2, v3, v1}, Lcom/daaw/h68;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    new-instance v1, Lcom/daaw/xx2;

    invoke-direct {v1, p0}, Lcom/daaw/xx2;-><init>(Lcom/daaw/tr3;)V

    iget-object v0, v0, Lcom/daaw/b86;->d:Lcom/daaw/h68;

    const-string v2, "internal.eventLogger"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/h68;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/z42;
    .locals 1

    iget-object v0, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    return-object v0
.end method

.method public final synthetic b()Lcom/daaw/ad2;
    .locals 2

    new-instance v0, Lcom/daaw/wu8;

    iget-object v1, p0, Lcom/daaw/tr3;->d:Lcom/daaw/vz8;

    invoke-direct {v0, v1}, Lcom/daaw/wu8;-><init>(Lcom/daaw/vz8;)V

    return-object v0
.end method

.method public final c(Lcom/daaw/rm7;)V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object v0, v0, Lcom/daaw/b86;->b:Lcom/daaw/w07;

    invoke-virtual {v0}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    invoke-virtual {p1}, Lcom/daaw/rm7;->F()Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object v2, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    const/4 v3, 0x0

    new-array v4, v3, [Lcom/daaw/gs7;

    invoke-interface {v0, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/daaw/gs7;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/b86;->a(Lcom/daaw/w07;[Lcom/daaw/gs7;)Lcom/daaw/gl2;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/oa2;

    if-nez v0, :cond_6

    invoke-virtual {p1}, Lcom/daaw/rm7;->D()Lcom/daaw/fi7;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/fi7;->G()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/lk7;

    invoke-virtual {v0}, Lcom/daaw/lk7;->F()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/lk7;->E()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/gs7;

    iget-object v4, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object v5, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    const/4 v6, 0x1

    new-array v6, v6, [Lcom/daaw/gs7;

    aput-object v2, v6, v3

    invoke-virtual {v4, v5, v6}, Lcom/daaw/b86;->a(Lcom/daaw/w07;[Lcom/daaw/gs7;)Lcom/daaw/gl2;

    move-result-object v2

    instance-of v4, v2, Lcom/daaw/th2;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    invoke-virtual {v4, v0}, Lcom/daaw/w07;->h(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v0}, Lcom/daaw/w07;->d(Ljava/lang/String;)Lcom/daaw/gl2;

    move-result-object v4

    instance-of v5, v4, Lcom/daaw/ad2;

    if-eqz v5, :cond_3

    check-cast v4, Lcom/daaw/ad2;

    :goto_1
    if-eqz v4, :cond_2

    iget-object v5, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v4, v5, v2}, Lcom/daaw/ad2;->a(Lcom/daaw/w07;Ljava/util/List;)Lcom/daaw/gl2;

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Rule function is undefined: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Invalid function name: "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid rule definition"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Program loading failed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    new-instance v0, Lcom/daaw/sk4;

    invoke-direct {v0, p1}, Lcom/daaw/sk4;-><init>(Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final d(Ljava/lang/String;Ljava/util/concurrent/Callable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object v0, v0, Lcom/daaw/b86;->d:Lcom/daaw/h68;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/h68;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public final e(Lcom/daaw/s32;)Z
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    invoke-virtual {v0, p1}, Lcom/daaw/z42;->d(Lcom/daaw/s32;)V

    iget-object p1, p0, Lcom/daaw/tr3;->a:Lcom/daaw/b86;

    iget-object p1, p1, Lcom/daaw/b86;->c:Lcom/daaw/w07;

    new-instance v0, Lcom/daaw/tb2;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/daaw/tb2;-><init>(Ljava/lang/Double;)V

    const-string v1, "runtime.counter"

    invoke-virtual {p1, v1, v0}, Lcom/daaw/w07;->g(Ljava/lang/String;Lcom/daaw/gl2;)V

    iget-object p1, p0, Lcom/daaw/tr3;->d:Lcom/daaw/vz8;

    iget-object v0, p0, Lcom/daaw/tr3;->b:Lcom/daaw/w07;

    invoke-virtual {v0}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/vz8;->b(Lcom/daaw/w07;Lcom/daaw/z42;)V

    invoke-virtual {p0}, Lcom/daaw/tr3;->g()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/tr3;->f()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    new-instance v0, Lcom/daaw/sk4;

    invoke-direct {v0, p1}, Lcom/daaw/sk4;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final f()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    invoke-virtual {v0}, Lcom/daaw/z42;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/tr3;->c:Lcom/daaw/z42;

    invoke-virtual {v0}, Lcom/daaw/z42;->b()Lcom/daaw/s32;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/z42;->a()Lcom/daaw/s32;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/s32;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
