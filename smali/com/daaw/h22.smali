.class public final synthetic Lcom/daaw/h22;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q31;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/TelemetryData;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/internal/TelemetryData;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h22;->a:Lcom/google/android/gms/common/internal/TelemetryData;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h22;->a:Lcom/google/android/gms/common/internal/TelemetryData;

    check-cast p1, Lcom/daaw/o22;

    check-cast p2, Lcom/daaw/tj1;

    sget v1, Lcom/daaw/m22;->n:I

    invoke-virtual {p1}, Lcom/daaw/pa;->getService()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lcom/daaw/a22;

    invoke-virtual {p1, v0}, Lcom/daaw/a22;->g3(Lcom/google/android/gms/common/internal/TelemetryData;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/daaw/tj1;->c(Ljava/lang/Object;)V

    return-void
.end method
