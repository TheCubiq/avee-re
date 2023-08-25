.class public final Lcom/daaw/i58;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/measurement/internal/zzq;

.field public final synthetic q:Lcom/daaw/ox3;

.field public final synthetic r:Lcom/daaw/x78;


# direct methods
.method public constructor <init>(Lcom/daaw/x78;Lcom/google/android/gms/measurement/internal/zzq;Lcom/daaw/ox3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iput-object p2, p0, Lcom/daaw/i58;->p:Lcom/google/android/gms/measurement/internal/zzq;

    iput-object p3, p0, Lcom/daaw/i58;->q:Lcom/daaw/ox3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    const-string v0, "Failed to get app instance id"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/l36;->p()Lcom/daaw/cd2;

    move-result-object v2

    sget-object v3, Lcom/daaw/vb2;->r:Lcom/daaw/vb2;

    invoke-virtual {v2, v3}, Lcom/daaw/cd2;->i(Lcom/daaw/vb2;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->x()Lcom/daaw/hk5;

    move-result-object v2

    const-string v3, "Analytics storage consent denied; will not get app instance id"

    invoke-virtual {v2, v3}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/p28;->C(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    invoke-virtual {v2, v1}, Lcom/daaw/i26;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iget-object v0, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/i58;->q:Lcom/daaw/ox3;

    invoke-virtual {v0, v2, v1}, Lcom/daaw/dd8;->J(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    invoke-static {v2}, Lcom/daaw/x78;->H(Lcom/daaw/x78;)Lcom/daaw/ua5;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/daaw/i58;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-static {v2}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/i58;->p:Lcom/google/android/gms/measurement/internal/zzq;

    invoke-interface {v3, v2}, Lcom/daaw/ua5;->w0(Lcom/google/android/gms/measurement/internal/zzq;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/p28;->C(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->F()Lcom/daaw/l36;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/l36;->g:Lcom/daaw/i26;

    invoke-virtual {v2, v1}, Lcom/daaw/i26;->b(Ljava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    invoke-static {v2}, Lcom/daaw/x78;->N(Lcom/daaw/x78;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v2

    :try_start_2
    iget-object v3, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v3, v3, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v3}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v3

    invoke-virtual {v3}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :goto_1
    iget-object v2, p0, Lcom/daaw/i58;->r:Lcom/daaw/x78;

    iget-object v2, v2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/i58;->q:Lcom/daaw/ox3;

    invoke-virtual {v2, v3, v1}, Lcom/daaw/dd8;->J(Lcom/daaw/ox3;Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
