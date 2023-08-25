.class public final Lcom/google/android/gms/measurement/AppMeasurementService;
.super Landroid/app/Service;
.source ""

# interfaces
.implements Lcom/daaw/p88;


# instance fields
.field public p:Lcom/daaw/s88;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/s88;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementService;->p:Lcom/daaw/s88;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/s88;

    invoke-direct {v0, p0}, Lcom/daaw/s88;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementService;->p:Lcom/daaw/s88;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementService;->p:Lcom/daaw/s88;

    return-object v0
.end method

.method public final b(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/app/Service;->stopSelfResult(I)Z

    move-result p1

    return p1
.end method

.method public final c(Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/cw1;->b(Landroid/content/Intent;)Z

    return-void
.end method

.method public final d(Landroid/app/job/JobParameters;Z)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/s88;->b(Landroid/content/Intent;)Landroid/os/IBinder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/s88;->e()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/s88;->f()V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onRebind(Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/s88;->g(Landroid/content/Intent;)V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/s88;->a(Landroid/content/Intent;II)I

    const/4 p1, 0x2

    return p1
.end method

.method public onUnbind(Landroid/content/Intent;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/AppMeasurementService;->a()Lcom/daaw/s88;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/s88;->j(Landroid/content/Intent;)Z

    const/4 p1, 0x1

    return p1
.end method
