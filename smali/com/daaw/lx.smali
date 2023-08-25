.class public Lcom/daaw/lx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;
.implements Lcom/daaw/bz0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lx$a;,
        Lcom/daaw/lx$b;
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/dz0;

.field public final q:Lcom/daaw/lx$a;

.field public final r:Lcom/daaw/dq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/dq<",
            "***>;"
        }
    .end annotation
.end field

.field public s:Lcom/daaw/lx$b;

.field public volatile t:Z


# direct methods
.method public constructor <init>(Lcom/daaw/lx$a;Lcom/daaw/dq;Lcom/daaw/dz0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/lx$a;",
            "Lcom/daaw/dq<",
            "***>;",
            "Lcom/daaw/dz0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lx;->q:Lcom/daaw/lx$a;

    iput-object p2, p0, Lcom/daaw/lx;->r:Lcom/daaw/dq;

    sget-object p1, Lcom/daaw/lx$b;->p:Lcom/daaw/lx$b;

    iput-object p1, p0, Lcom/daaw/lx;->s:Lcom/daaw/lx$b;

    iput-object p3, p0, Lcom/daaw/lx;->p:Lcom/daaw/dz0;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/lx;->p:Lcom/daaw/dz0;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/lx;->t:Z

    iget-object v0, p0, Lcom/daaw/lx;->r:Lcom/daaw/dq;

    invoke-virtual {v0}, Lcom/daaw/dq;->c()V

    return-void
.end method

.method public final c()Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/lx;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/lx;->d()Lcom/daaw/z41;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/lx;->e()Lcom/daaw/z41;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/daaw/z41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "*>;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/daaw/lx;->r:Lcom/daaw/dq;

    invoke-virtual {v0}, Lcom/daaw/dq;->f()Lcom/daaw/z41;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x3

    const-string v2, "EngineRunnable"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception decoding result from cache: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/lx;->r:Lcom/daaw/dq;

    invoke-virtual {v0}, Lcom/daaw/dq;->h()Lcom/daaw/z41;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final e()Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/lx;->r:Lcom/daaw/dq;

    invoke-virtual {v0}, Lcom/daaw/dq;->d()Lcom/daaw/z41;

    move-result-object v0

    return-object v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/lx;->s:Lcom/daaw/lx$b;

    sget-object v1, Lcom/daaw/lx$b;->p:Lcom/daaw/lx$b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final g(Lcom/daaw/z41;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lx;->q:Lcom/daaw/lx$a;

    invoke-interface {v0, p1}, Lcom/daaw/b51;->d(Lcom/daaw/z41;)V

    return-void
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/lx;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/daaw/lx$b;->q:Lcom/daaw/lx$b;

    iput-object p1, p0, Lcom/daaw/lx;->s:Lcom/daaw/lx$b;

    iget-object p1, p0, Lcom/daaw/lx;->q:Lcom/daaw/lx$a;

    invoke-interface {p1, p0}, Lcom/daaw/lx$a;->h(Lcom/daaw/lx;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/lx;->q:Lcom/daaw/lx$a;

    invoke-interface {v0, p1}, Lcom/daaw/b51;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public run()V
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/lx;->t:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/lx;->c()Lcom/daaw/z41;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    new-instance v2, Lcom/daaw/ux;

    invoke-direct {v2, v1}, Lcom/daaw/ux;-><init>(Ljava/lang/Error;)V

    move-object v1, v2

    :goto_0
    iget-boolean v2, p0, Lcom/daaw/lx;->t:Z

    if-eqz v2, :cond_2

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/daaw/z41;->c()V

    :cond_1
    return-void

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0, v1}, Lcom/daaw/lx;->h(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v0}, Lcom/daaw/lx;->g(Lcom/daaw/z41;)V

    :goto_1
    return-void
.end method
