.class public final Lcom/daaw/y07;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ru7;


# direct methods
.method public constructor <init>(Lcom/daaw/ru7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/y07;->p:Lcom/daaw/ru7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/y07;->p:Lcom/daaw/ru7;

    invoke-static {v0}, Lcom/daaw/ru7;->c(Lcom/daaw/ru7;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/y07;->p:Lcom/daaw/ru7;

    invoke-static {v1}, Lcom/daaw/ru7;->b(Lcom/daaw/ru7;)Lcom/daaw/zt0;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lcom/daaw/ru7;->b(Lcom/daaw/ru7;)Lcom/daaw/zt0;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/zt0;->b()V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
