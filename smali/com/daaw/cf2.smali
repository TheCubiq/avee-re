.class public final Lcom/daaw/cf2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/qf2;

.field public final q:Lcom/daaw/wf2;

.field public final r:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/daaw/qf2;Lcom/daaw/wf2;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    iput-object p2, p0, Lcom/daaw/cf2;->q:Lcom/daaw/wf2;

    iput-object p3, p0, Lcom/daaw/cf2;->r:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    invoke-virtual {v0}, Lcom/daaw/qf2;->zzw()Z

    iget-object v0, p0, Lcom/daaw/cf2;->q:Lcom/daaw/wf2;

    invoke-virtual {v0}, Lcom/daaw/wf2;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    iget-object v0, v0, Lcom/daaw/wf2;->a:Ljava/lang/Object;

    invoke-virtual {v1, v0}, Lcom/daaw/qf2;->c(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    iget-object v0, v0, Lcom/daaw/wf2;->c:Lcom/daaw/zf2;

    invoke-virtual {v1, v0}, Lcom/daaw/qf2;->zzn(Lcom/daaw/zf2;)V

    :goto_0
    iget-object v0, p0, Lcom/daaw/cf2;->q:Lcom/daaw/wf2;

    iget-boolean v0, v0, Lcom/daaw/wf2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    const-string v1, "intermediate-response"

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->zzm(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/cf2;->p:Lcom/daaw/qf2;

    const-string v1, "done"

    invoke-virtual {v0, v1}, Lcom/daaw/qf2;->d(Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lcom/daaw/cf2;->r:Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_2
    return-void
.end method
