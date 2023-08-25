.class public final Lcom/google/android/gms/measurement/AppMeasurementReceiver;
.super Lcom/daaw/cw1;
.source ""

# interfaces
.implements Lcom/daaw/g86;


# instance fields
.field public r:Lcom/daaw/i86;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/cw1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/daaw/cw1;->c(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->r:Lcom/daaw/i86;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/i86;

    invoke-direct {v0, p0}, Lcom/daaw/i86;-><init>(Lcom/daaw/g86;)V

    iput-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->r:Lcom/daaw/i86;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/AppMeasurementReceiver;->r:Lcom/daaw/i86;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/i86;->a(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
