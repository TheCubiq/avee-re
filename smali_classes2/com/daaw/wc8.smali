.class public final Lcom/daaw/wc8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ek8;

.field public final synthetic q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ek8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wc8;->q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, Lcom/daaw/wc8;->p:Lcom/daaw/ek8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wc8;->q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wc8;->p:Lcom/daaw/ek8;

    invoke-virtual {v0, v1}, Lcom/daaw/p28;->H(Lcom/daaw/mk7;)V

    return-void
.end method
