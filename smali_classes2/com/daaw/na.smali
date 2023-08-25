.class public abstract Lcom/daaw/na;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gl;
.implements Lcom/daaw/vl;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/gl<",
        "Ljava/lang/Object;",
        ">;",
        "Lcom/daaw/vl;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/gl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/gl<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# virtual methods
.method public a()Lcom/daaw/vl;
    .locals 2

    iget-object v0, p0, Lcom/daaw/na;->p:Lcom/daaw/gl;

    instance-of v1, v0, Lcom/daaw/vl;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/daaw/vl;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    move-object v0, p0

    :goto_0
    invoke-static {v0}, Lcom/daaw/zp;->a(Lcom/daaw/gl;)V

    check-cast v0, Lcom/daaw/na;

    iget-object v1, v0, Lcom/daaw/na;->p:Lcom/daaw/gl;

    invoke-static {v1}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {v0, p1}, Lcom/daaw/na;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/daaw/wg0;->b()Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    return-void

    :cond_0
    sget-object v2, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {p1}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    sget-object v2, Lcom/daaw/p51;->p:Lcom/daaw/p51$a;

    invoke-static {p1}, Lcom/daaw/s51;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/p51;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_1
    invoke-virtual {v0}, Lcom/daaw/na;->e()V

    instance-of v0, v1, Lcom/daaw/na;

    if-eqz v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-interface {v1, p1}, Lcom/daaw/gl;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public c()Ljava/lang/StackTraceElement;
    .locals 1

    invoke-static {p0}, Lcom/daaw/yp;->d(Lcom/daaw/na;)Ljava/lang/StackTraceElement;

    move-result-object v0

    return-object v0
.end method

.method public abstract d(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Continuation at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/daaw/na;->c()Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
