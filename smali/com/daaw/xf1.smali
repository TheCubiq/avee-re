.class public Lcom/daaw/xf1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field public final p:Lcom/daaw/ey1;

.field public final q:Ljava/lang/String;

.field public final r:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "StopWorkRunnable"

    invoke-static {v0}, Lcom/daaw/ll0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/daaw/xf1;->s:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/ey1;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/xf1;->p:Lcom/daaw/ey1;

    iput-object p2, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/daaw/xf1;->r:Z

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lcom/daaw/xf1;->p:Lcom/daaw/ey1;

    invoke-virtual {v0}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/xf1;->p:Lcom/daaw/ey1;

    invoke-virtual {v1}, Lcom/daaw/ey1;->m()Lcom/daaw/jz0;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v2

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v3, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/daaw/jz0;->h(Ljava/lang/String;)Z

    move-result v1

    iget-boolean v3, p0, Lcom/daaw/xf1;->r:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v1, p0, Lcom/daaw/xf1;->p:Lcom/daaw/ey1;

    invoke-virtual {v1}, Lcom/daaw/ey1;->m()Lcom/daaw/jz0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/jz0;->n(Ljava/lang/String;)Z

    move-result v1

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    invoke-interface {v2, v1}, Lcom/daaw/ry1;->l(Ljava/lang/String;)Lcom/daaw/yx1;

    move-result-object v1

    sget-object v3, Lcom/daaw/yx1;->q:Lcom/daaw/yx1;

    if-ne v1, v3, :cond_1

    sget-object v1, Lcom/daaw/yx1;->p:Lcom/daaw/yx1;

    new-array v3, v4, [Ljava/lang/String;

    iget-object v6, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    aput-object v6, v3, v5

    invoke-interface {v2, v1, v3}, Lcom/daaw/ry1;->k(Lcom/daaw/yx1;[Ljava/lang/String;)I

    :cond_1
    iget-object v1, p0, Lcom/daaw/xf1;->p:Lcom/daaw/ey1;

    invoke-virtual {v1}, Lcom/daaw/ey1;->m()Lcom/daaw/jz0;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/daaw/jz0;->o(Ljava/lang/String;)Z

    move-result v1

    :goto_0
    invoke-static {}, Lcom/daaw/ll0;->c()Lcom/daaw/ll0;

    move-result-object v2

    sget-object v3, Lcom/daaw/xf1;->s:Ljava/lang/String;

    const-string v6, "StopWorkRunnable for %s; Processor.stopWork = %s"

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v8, p0, Lcom/daaw/xf1;->q:Ljava/lang/String;

    aput-object v8, v7, v5

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    aput-object v1, v7, v4

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v2, v3, v1, v4}, Lcom/daaw/ll0;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw v1
.end method
