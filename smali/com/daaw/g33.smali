.class public final Lcom/daaw/g33;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pa$b;


# instance fields
.field public final synthetic a:Lcom/daaw/h33;


# direct methods
.method public constructor <init>(Lcom/daaw/h33;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/g33;->a:Lcom/daaw/h33;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final I(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/g33;->a:Lcom/daaw/h33;

    invoke-static {p1}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/g33;->a:Lcom/daaw/h33;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/h33;->k(Lcom/daaw/h33;Lcom/daaw/l33;)V

    iget-object v0, p0, Lcom/daaw/g33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->c(Lcom/daaw/h33;)Lcom/daaw/j33;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v0, v1}, Lcom/daaw/h33;->f(Lcom/daaw/h33;Lcom/daaw/j33;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/g33;->a:Lcom/daaw/h33;

    invoke-static {v0}, Lcom/daaw/h33;->e(Lcom/daaw/h33;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
