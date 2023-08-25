.class public Lcom/daaw/fx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hx;
.implements Lcom/daaw/ep0$a;
.implements Lcom/daaw/kx$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fx$a;,
        Lcom/daaw/fx$d;,
        Lcom/daaw/fx$e;,
        Lcom/daaw/fx$b;,
        Lcom/daaw/fx$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/daaw/hi0;",
            "Lcom/daaw/gx;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/jx;

.field public final c:Lcom/daaw/ep0;

.field public final d:Lcom/daaw/fx$a;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/daaw/hi0;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/kx<",
            "*>;>;>;"
        }
    .end annotation
.end field

.field public final f:Lcom/daaw/h51;

.field public final g:Lcom/daaw/fx$b;

.field public h:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lcom/daaw/kx<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/ep0;Lcom/daaw/ut$a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V
    .locals 10

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v9}, Lcom/daaw/fx;-><init>(Lcom/daaw/ep0;Lcom/daaw/ut$a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/Map;Lcom/daaw/jx;Ljava/util/Map;Lcom/daaw/fx$a;Lcom/daaw/h51;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ep0;Lcom/daaw/ut$a;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Ljava/util/Map;Lcom/daaw/jx;Ljava/util/Map;Lcom/daaw/fx$a;Lcom/daaw/h51;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ep0;",
            "Lcom/daaw/ut$a;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/concurrent/ExecutorService;",
            "Ljava/util/Map<",
            "Lcom/daaw/hi0;",
            "Lcom/daaw/gx;",
            ">;",
            "Lcom/daaw/jx;",
            "Ljava/util/Map<",
            "Lcom/daaw/hi0;",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/kx<",
            "*>;>;>;",
            "Lcom/daaw/fx$a;",
            "Lcom/daaw/h51;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/fx;->c:Lcom/daaw/ep0;

    new-instance v0, Lcom/daaw/fx$b;

    invoke-direct {v0, p2}, Lcom/daaw/fx$b;-><init>(Lcom/daaw/ut$a;)V

    iput-object v0, p0, Lcom/daaw/fx;->g:Lcom/daaw/fx$b;

    if-nez p7, :cond_0

    new-instance p7, Ljava/util/HashMap;

    invoke-direct {p7}, Ljava/util/HashMap;-><init>()V

    :cond_0
    iput-object p7, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    if-nez p6, :cond_1

    new-instance p6, Lcom/daaw/jx;

    invoke-direct {p6}, Lcom/daaw/jx;-><init>()V

    :cond_1
    iput-object p6, p0, Lcom/daaw/fx;->b:Lcom/daaw/jx;

    if-nez p5, :cond_2

    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    :cond_2
    iput-object p5, p0, Lcom/daaw/fx;->a:Ljava/util/Map;

    if-nez p8, :cond_3

    new-instance p8, Lcom/daaw/fx$a;

    invoke-direct {p8, p3, p4, p0}, Lcom/daaw/fx$a;-><init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;Lcom/daaw/hx;)V

    :cond_3
    iput-object p8, p0, Lcom/daaw/fx;->d:Lcom/daaw/fx$a;

    if-nez p9, :cond_4

    new-instance p9, Lcom/daaw/h51;

    invoke-direct {p9}, Lcom/daaw/h51;-><init>()V

    :cond_4
    iput-object p9, p0, Lcom/daaw/fx;->f:Lcom/daaw/h51;

    invoke-interface {p1, p0}, Lcom/daaw/ep0;->e(Lcom/daaw/ep0$a;)V

    return-void
.end method

.method public static j(Ljava/lang/String;JLcom/daaw/hi0;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Lcom/daaw/jl0;->a(J)D

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, key: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/hi0;Lcom/daaw/kx;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            "Lcom/daaw/kx<",
            "*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tq1;->b()V

    if-eqz p2, :cond_0

    invoke-virtual {p2, p1, p0}, Lcom/daaw/kx;->f(Lcom/daaw/hi0;Lcom/daaw/kx$a;)V

    invoke-virtual {p2}, Lcom/daaw/kx;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    new-instance v1, Lcom/daaw/fx$e;

    invoke-virtual {p0}, Lcom/daaw/fx;->f()Ljava/lang/ref/ReferenceQueue;

    move-result-object v2

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/fx$e;-><init>(Lcom/daaw/hi0;Lcom/daaw/kx;Ljava/lang/ref/ReferenceQueue;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object p2, p0, Lcom/daaw/fx;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b(Lcom/daaw/gx;Lcom/daaw/hi0;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/fx;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gx;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/fx;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public c(Lcom/daaw/hi0;Lcom/daaw/kx;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/daaw/kx;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/fx;->c:Lcom/daaw/ep0;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ep0;->a(Lcom/daaw/hi0;Lcom/daaw/z41;)Lcom/daaw/z41;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/fx;->f:Lcom/daaw/h51;

    invoke-virtual {p1, p2}, Lcom/daaw/h51;->a(Lcom/daaw/z41;)V

    :goto_0
    return-void
.end method

.method public d(Lcom/daaw/z41;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "*>;)V"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/tq1;->b()V

    iget-object v0, p0, Lcom/daaw/fx;->f:Lcom/daaw/h51;

    invoke-virtual {v0, p1}, Lcom/daaw/h51;->a(Lcom/daaw/z41;)V

    return-void
.end method

.method public final e(Lcom/daaw/hi0;)Lcom/daaw/kx;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            ")",
            "Lcom/daaw/kx<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fx;->c:Lcom/daaw/ep0;

    invoke-interface {v0, p1}, Lcom/daaw/ep0;->b(Lcom/daaw/hi0;)Lcom/daaw/z41;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/daaw/kx;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/kx;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/kx;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/daaw/kx;-><init>(Lcom/daaw/z41;Z)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final f()Ljava/lang/ref/ReferenceQueue;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/ReferenceQueue<",
            "Lcom/daaw/kx<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/fx;->h:Ljava/lang/ref/ReferenceQueue;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lcom/daaw/fx;->h:Ljava/lang/ref/ReferenceQueue;

    invoke-static {}, Landroid/os/Looper;->myQueue()Landroid/os/MessageQueue;

    move-result-object v0

    new-instance v1, Lcom/daaw/fx$d;

    iget-object v2, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    iget-object v3, p0, Lcom/daaw/fx;->h:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v1, v2, v3}, Lcom/daaw/fx$d;-><init>(Ljava/util/Map;Ljava/lang/ref/ReferenceQueue;)V

    invoke-virtual {v0, v1}, Landroid/os/MessageQueue;->addIdleHandler(Landroid/os/MessageQueue$IdleHandler;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/fx;->h:Ljava/lang/ref/ReferenceQueue;

    return-object v0
.end method

.method public g(Lcom/daaw/hi0;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dz0;ZLcom/daaw/wt;Lcom/daaw/b51;)Lcom/daaw/fx$c;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "Z:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/daaw/hi0;",
            "II",
            "Lcom/daaw/ip<",
            "TT;>;",
            "Lcom/daaw/jp<",
            "TT;TZ;>;",
            "Lcom/daaw/cn1<",
            "TZ;>;",
            "Lcom/daaw/i51<",
            "TZ;TR;>;",
            "Lcom/daaw/dz0;",
            "Z",
            "Lcom/daaw/wt;",
            "Lcom/daaw/b51;",
            ")",
            "Lcom/daaw/fx$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p9

    move-object/from16 v2, p11

    invoke-static {}, Lcom/daaw/tq1;->b()V

    invoke-static {}, Lcom/daaw/jl0;->b()J

    move-result-wide v3

    invoke-interface/range {p4 .. p4}, Lcom/daaw/ip;->getId()Ljava/lang/String;

    move-result-object v6

    iget-object v5, v0, Lcom/daaw/fx;->b:Lcom/daaw/jx;

    invoke-interface/range {p5 .. p5}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v10

    invoke-interface/range {p5 .. p5}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v11

    invoke-interface/range {p5 .. p5}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v13

    invoke-interface/range {p5 .. p5}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v15

    move-object/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move-object/from16 v12, p6

    move-object/from16 v14, p7

    invoke-virtual/range {v5 .. v15}, Lcom/daaw/jx;->a(Ljava/lang/String;Lcom/daaw/hi0;IILcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/cn1;Lcom/daaw/e51;Lcom/daaw/i51;Lcom/daaw/zw;)Lcom/daaw/ix;

    move-result-object v5

    invoke-virtual {v0, v5, v1}, Lcom/daaw/fx;->i(Lcom/daaw/hi0;Z)Lcom/daaw/kx;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    const-string v9, "Engine"

    if-eqz v6, :cond_1

    invoke-interface {v2, v6}, Lcom/daaw/b51;->d(Lcom/daaw/z41;)V

    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Loaded resource from cache"

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/fx;->j(Ljava/lang/String;JLcom/daaw/hi0;)V

    :cond_0
    return-object v7

    :cond_1
    invoke-virtual {v0, v5, v1}, Lcom/daaw/fx;->h(Lcom/daaw/hi0;Z)Lcom/daaw/kx;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v2, v6}, Lcom/daaw/b51;->d(Lcom/daaw/z41;)V

    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Loaded resource from active resources"

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/fx;->j(Ljava/lang/String;JLcom/daaw/hi0;)V

    :cond_2
    return-object v7

    :cond_3
    iget-object v6, v0, Lcom/daaw/fx;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/gx;

    if-eqz v6, :cond_5

    invoke-virtual {v6, v2}, Lcom/daaw/gx;->e(Lcom/daaw/b51;)V

    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "Added to existing load"

    invoke-static {v1, v3, v4, v5}, Lcom/daaw/fx;->j(Ljava/lang/String;JLcom/daaw/hi0;)V

    :cond_4
    new-instance v1, Lcom/daaw/fx$c;

    invoke-direct {v1, v2, v6}, Lcom/daaw/fx$c;-><init>(Lcom/daaw/b51;Lcom/daaw/gx;)V

    return-object v1

    :cond_5
    iget-object v6, v0, Lcom/daaw/fx;->d:Lcom/daaw/fx$a;

    invoke-virtual {v6, v5, v1}, Lcom/daaw/fx$a;->a(Lcom/daaw/hi0;Z)Lcom/daaw/gx;

    move-result-object v1

    new-instance v6, Lcom/daaw/dq;

    iget-object v7, v0, Lcom/daaw/fx;->g:Lcom/daaw/fx$b;

    move-object/from16 v16, v6

    move-object/from16 v17, v5

    move/from16 v18, p2

    move/from16 v19, p3

    move-object/from16 v20, p4

    move-object/from16 v21, p5

    move-object/from16 v22, p6

    move-object/from16 v23, p7

    move-object/from16 v24, v7

    move-object/from16 v25, p10

    move-object/from16 v26, p8

    invoke-direct/range {v16 .. v26}, Lcom/daaw/dq;-><init>(Lcom/daaw/ix;IILcom/daaw/ip;Lcom/daaw/jp;Lcom/daaw/cn1;Lcom/daaw/i51;Lcom/daaw/dq$a;Lcom/daaw/wt;Lcom/daaw/dz0;)V

    new-instance v7, Lcom/daaw/lx;

    move-object/from16 v10, p8

    invoke-direct {v7, v1, v6, v10}, Lcom/daaw/lx;-><init>(Lcom/daaw/lx$a;Lcom/daaw/dq;Lcom/daaw/dz0;)V

    iget-object v6, v0, Lcom/daaw/fx;->a:Ljava/util/Map;

    invoke-interface {v6, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/daaw/gx;->e(Lcom/daaw/b51;)V

    invoke-virtual {v1, v7}, Lcom/daaw/gx;->m(Lcom/daaw/lx;)V

    invoke-static {v9, v8}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_6

    const-string v6, "Started new load"

    invoke-static {v6, v3, v4, v5}, Lcom/daaw/fx;->j(Ljava/lang/String;JLcom/daaw/hi0;)V

    :cond_6
    new-instance v3, Lcom/daaw/fx$c;

    invoke-direct {v3, v2, v1}, Lcom/daaw/fx$c;-><init>(Lcom/daaw/b51;Lcom/daaw/gx;)V

    return-object v3
.end method

.method public final h(Lcom/daaw/hi0;Z)Lcom/daaw/kx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            "Z)",
            "Lcom/daaw/kx<",
            "*>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    iget-object p2, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Lcom/daaw/kx;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/kx;->b()V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final i(Lcom/daaw/hi0;Z)Lcom/daaw/kx;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/hi0;",
            "Z)",
            "Lcom/daaw/kx<",
            "*>;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/fx;->e(Lcom/daaw/hi0;)Lcom/daaw/kx;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/daaw/kx;->b()V

    iget-object v0, p0, Lcom/daaw/fx;->e:Ljava/util/Map;

    new-instance v1, Lcom/daaw/fx$e;

    invoke-virtual {p0}, Lcom/daaw/fx;->f()Ljava/lang/ref/ReferenceQueue;

    move-result-object v2

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/fx$e;-><init>(Lcom/daaw/hi0;Lcom/daaw/kx;Ljava/lang/ref/ReferenceQueue;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object p2
.end method

.method public k(Lcom/daaw/z41;)V
    .locals 1

    invoke-static {}, Lcom/daaw/tq1;->b()V

    instance-of v0, p1, Lcom/daaw/kx;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/kx;

    invoke-virtual {p1}, Lcom/daaw/kx;->e()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
