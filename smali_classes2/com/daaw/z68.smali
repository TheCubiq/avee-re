.class public final Lcom/daaw/z68;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic s:Lcom/daaw/ox3;

.field public final synthetic t:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;Lcom/daaw/ox3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    iput-object p2, p0, Lcom/daaw/z68;->p:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/z68;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/z68;->r:Lcom/google/android/gms/measurement/internal/zzq;

    iput-object p5, p0, Lcom/daaw/z68;->s:Lcom/daaw/ox3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v1, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    invoke-static {v1}, Lcom/daaw/x78;->H(Lcom/daaw/x78;)Lcom/daaw/ua5;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v1

    const-string v2, "Failed to get conditional properties; not connected to service"

    iget-object v3, p0, Lcom/daaw/z68;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/z68;->q:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4}, Lcom/daaw/hk5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v1, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    iget-object v1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/z68;->s:Lcom/daaw/ox3;

    invoke-virtual {v1, v2, v0}, Lcom/daaw/dd8;->E(Lcom/daaw/ox3;Ljava/util/ArrayList;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/daaw/z68;->r:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/z68;->p:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/z68;->q:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/z68;->r:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v2, v1, v3, v4}, Lcom/daaw/ua5;->n1(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzq;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/dd8;->v(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    invoke-static {v1}, Lcom/daaw/x78;->N(Lcom/daaw/x78;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_2
    iget-object v2, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v2

    const-string v3, "Failed to get conditional properties; remote exception"

    iget-object v4, p0, Lcom/daaw/z68;->p:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/z68;->q:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/daaw/hk5;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lcom/daaw/z68;->t:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/z68;->s:Lcom/daaw/ox3;

    invoke-virtual {v2, v3, v0}, Lcom/daaw/dd8;->E(Lcom/daaw/ox3;Ljava/util/ArrayList;)V

    goto :goto_3

    :goto_2
    throw v1

    :goto_3
    goto :goto_2
.end method
