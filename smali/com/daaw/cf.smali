.class public Lcom/daaw/cf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ik0;
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Ljava/lang/Object;",
        "T:",
        "Ljava/lang/Object;",
        "Z:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/ik0<",
        "TA;TT;TZ;TR;>;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/ik0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;"
        }
    .end annotation
.end field

.field public q:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "TZ;>;"
        }
    .end annotation
.end field

.field public r:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "TT;TZ;>;"
        }
    .end annotation
.end field

.field public s:Lcom/daaw/e51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e51<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public t:Lcom/daaw/i51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i51<",
            "TZ;TR;>;"
        }
    .end annotation
.end field

.field public u:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/ik0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ik0<",
            "TA;TT;TZ;TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->u:Lcom/daaw/zw;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/daaw/i51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/i51<",
            "TZ;TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->t:Lcom/daaw/i51;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/ik0;->b()Lcom/daaw/i51;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->s:Lcom/daaw/e51;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/cf;->i()Lcom/daaw/cf;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "TT;TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->r:Lcom/daaw/d51;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v0

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->q:Lcom/daaw/d51;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v0

    return-object v0
.end method

.method public f()Lcom/daaw/mq0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/mq0<",
            "TA;TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/cf;->p:Lcom/daaw/ik0;

    invoke-interface {v0}, Lcom/daaw/ik0;->f()Lcom/daaw/mq0;

    move-result-object v0

    return-object v0
.end method

.method public i()Lcom/daaw/cf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/cf<",
            "TA;TT;TZ;TR;>;"
        }
    .end annotation

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/cf;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public j(Lcom/daaw/d51;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "TT;TZ;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/cf;->r:Lcom/daaw/d51;

    return-void
.end method

.method public k(Lcom/daaw/zw;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/zw<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/cf;->u:Lcom/daaw/zw;

    return-void
.end method
