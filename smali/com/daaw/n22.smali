.class public final Lcom/daaw/n22;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/i22;

.field public final synthetic q:Lcom/daaw/p22;


# direct methods
.method public constructor <init>(Lcom/daaw/p22;Lcom/daaw/i22;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/n22;->p:Lcom/daaw/i22;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-boolean v0, v0, Lcom/daaw/p22;->q:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/n22;->p:Lcom/daaw/i22;

    invoke-virtual {v0}, Lcom/daaw/i22;->b()Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->t()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v2, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->p:Lcom/daaw/pj0;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->s()Landroid/app/PendingIntent;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v3, p0, Lcom/daaw/n22;->p:Lcom/daaw/i22;

    invoke-virtual {v3}, Lcom/daaw/i22;->a()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->a(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v2, v0, v1}, Lcom/daaw/pj0;->startActivityForResult(Landroid/content/Intent;I)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v2, v1, Lcom/daaw/p22;->t:Lcom/daaw/w70;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v2, v1, v3, v4}, Lcom/daaw/w70;->b(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v2, v1, Lcom/daaw/p22;->t:Lcom/daaw/w70;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v3

    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v4, v1, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->p:Lcom/daaw/pj0;

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v5

    const/4 v6, 0x2

    iget-object v7, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/w70;->v(Landroid/app/Activity;Lcom/daaw/pj0;IILandroid/content/DialogInterface$OnCancelListener;)Z

    return-void

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->h()I

    move-result v1

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v1, v0, Lcom/daaw/p22;->t:Lcom/daaw/w70;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/w70;->q(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v2, v1, Lcom/daaw/p22;->t:Lcom/daaw/w70;

    invoke-virtual {v1}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->b()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Lcom/daaw/l22;

    invoke-direct {v3, p0, v0}, Lcom/daaw/l22;-><init>(Lcom/daaw/n22;Landroid/app/Dialog;)V

    invoke-virtual {v2, v1, v3}, Lcom/daaw/w70;->r(Landroid/content/Context;Lcom/daaw/o02;)Lcom/daaw/p02;

    return-void

    :cond_3
    iget-object v1, p0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    iget-object v2, p0, Lcom/daaw/n22;->p:Lcom/daaw/i22;

    invoke-virtual {v2}, Lcom/daaw/i22;->a()I

    move-result v2

    invoke-static {v1, v0, v2}, Lcom/daaw/p22;->q(Lcom/daaw/p22;Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method
