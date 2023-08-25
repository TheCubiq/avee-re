.class public final Lcom/daaw/im8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ku0;
.implements Lcom/daaw/gu0;
.implements Lcom/daaw/zt0;
.implements Lcom/daaw/qo8;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/ku0<",
        "TTContinuationResult;>;",
        "Lcom/daaw/gu0;",
        "Lcom/daaw/zt0;",
        "Lcom/daaw/qo8;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/daaw/ai1;

.field public final c:Lcom/daaw/dw8;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/ai1;Lcom/daaw/dw8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/im8;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/im8;->b:Lcom/daaw/ai1;

    iput-object p3, p0, Lcom/daaw/im8;->c:Lcom/daaw/dw8;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/im8;)Lcom/daaw/ai1;
    .locals 0

    iget-object p0, p0, Lcom/daaw/im8;->b:Lcom/daaw/ai1;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/im8;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/fk8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/fk8;-><init>(Lcom/daaw/im8;Lcom/daaw/rj1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/im8;->c:Lcom/daaw/dw8;

    invoke-virtual {v0}, Lcom/daaw/dw8;->s()Z

    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/im8;->c:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->q(Ljava/lang/Exception;)V

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/im8;->c:Lcom/daaw/dw8;

    invoke-virtual {v0, p1}, Lcom/daaw/dw8;->r(Ljava/lang/Object;)V

    return-void
.end method
