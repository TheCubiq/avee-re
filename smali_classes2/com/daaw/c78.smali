.class public final Lcom/daaw/c78;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic t:Z

.field public final synthetic u:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;Z)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/c78;->u:Lcom/daaw/x78;

    iput-object p2, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Lcom/daaw/c78;->q:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/c78;->r:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/c78;->s:Lcom/google/android/gms/measurement/internal/zzq;

    iput-boolean p7, p0, Lcom/daaw/c78;->t:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/c78;->u:Lcom/daaw/x78;

    invoke-static {v2}, Lcom/daaw/x78;->H(Lcom/daaw/x78;)Lcom/daaw/ua5;

    move-result-object v3

    if-nez v3, :cond_0

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v2

    const-string v3, "(legacy) Failed to get user properties; not connected to service"

    iget-object v4, p0, Lcom/daaw/c78;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/c78;->r:Ljava/lang/String;

    invoke-virtual {v2, v3, v1, v4, v5}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/c78;->s:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, Lcom/daaw/c78;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/c78;->r:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/daaw/c78;->t:Z

    iget-object v7, p0, Lcom/daaw/c78;->s:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v3, v4, v5, v6, v7}, Lcom/daaw/ua5;->a2(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;

    move-result-object v3

    :goto_0
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, Lcom/daaw/c78;->q:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/c78;->r:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/daaw/c78;->t:Z

    invoke-interface {v3, v1, v4, v5, v6}, Lcom/daaw/ua5;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v3

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lcom/daaw/c78;->u:Lcom/daaw/x78;

    invoke-static {v2}, Lcom/daaw/x78;->N(Lcom/daaw/x78;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v2

    :try_start_4
    iget-object v3, p0, Lcom/daaw/c78;->u:Lcom/daaw/x78;

    iget-object v3, v3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v3

    const-string v4, "(legacy) Failed to get user properties; remote exception"

    iget-object v5, p0, Lcom/daaw/c78;->q:Ljava/lang/String;

    invoke-virtual {v3, v4, v1, v5, v2}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_2

    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    iget-object v2, p0, Lcom/daaw/c78;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    :goto_5
    throw v1

    :goto_6
    goto :goto_5
.end method
