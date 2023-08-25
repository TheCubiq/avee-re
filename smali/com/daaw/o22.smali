.class public final Lcom/daaw/o22;
.super Lcom/daaw/t70;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/t70<",
        "Lcom/daaw/a22;",
        ">;"
    }
.end annotation


# instance fields
.field public final H:Lcom/daaw/hk1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/xf;Lcom/daaw/hk1;Lcom/daaw/ej;Lcom/daaw/du0;)V
    .locals 7

    const/16 v3, 0x10e

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/daaw/t70;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/daaw/xf;Lcom/daaw/ej;Lcom/daaw/du0;)V

    iput-object p4, p0, Lcom/daaw/o22;->H:Lcom/daaw/hk1;

    return-void
.end method


# virtual methods
.method public final synthetic e(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/a22;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lcom/daaw/a22;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/daaw/a22;

    invoke-direct {v0, p1}, Lcom/daaw/a22;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method public final getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    sget-object v0, Lcom/daaw/j12;->b:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final getMinApkVersion()I
    .locals 1

    const v0, 0xc1fa340

    return v0
.end method

.method public final h()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/daaw/o22;->H:Lcom/daaw/hk1;

    invoke-virtual {v0}, Lcom/daaw/hk1;->d()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.internal.service.IClientTelemetryService"

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.common.telemetry.service.START"

    return-object v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
