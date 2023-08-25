.class public abstract Lcom/daaw/n67;
.super Lcom/daaw/l67;
.source ""

# interfaces
.implements Lcom/daaw/f77;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/l67;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract c()Lcom/daaw/f77;
.end method

.method public final f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/n67;->c()Lcom/daaw/f77;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/daaw/f77;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
