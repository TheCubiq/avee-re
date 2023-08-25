.class public final Lcom/daaw/df2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/bf2;

    invoke-direct {v0, p0, p1}, Lcom/daaw/bf2;-><init>(Lcom/daaw/df2;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/daaw/df2;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/qf2;Lcom/daaw/zf2;)V
    .locals 3

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/daaw/wf2;->a(Lcom/daaw/zf2;)Lcom/daaw/wf2;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/df2;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/cf2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lcom/daaw/cf2;-><init>(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V

    check-cast v0, Lcom/daaw/bf2;

    iget-object p1, v0, Lcom/daaw/bf2;->p:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final b(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p1}, Lcom/daaw/qf2;->zzq()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/daaw/df2;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/cf2;

    invoke-direct {v1, p1, p2, p3}, Lcom/daaw/cf2;-><init>(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V

    check-cast v0, Lcom/daaw/bf2;

    iget-object p1, v0, Lcom/daaw/bf2;->p:Landroid/os/Handler;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
