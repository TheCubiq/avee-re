.class public final Lcom/daaw/hm8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pl7;


# instance fields
.field public final a:Lcom/daaw/v04;

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/v04;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hm8;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/hm8;->a:Lcom/daaw/v04;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/daaw/hm8;->a:Lcom/daaw/v04;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/daaw/v04;->T(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/daaw/hm8;->b:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object p2, p2, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Event listener threw exception"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
