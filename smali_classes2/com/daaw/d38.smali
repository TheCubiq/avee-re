.class public final Lcom/daaw/d38;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ox3;

.field public final synthetic q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/d38;->q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, Lcom/daaw/d38;->p:Lcom/daaw/ox3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/d38;->q:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/d38;->p:Lcom/daaw/ox3;

    invoke-virtual {v0, v1}, Lcom/daaw/x78;->R(Lcom/daaw/ox3;)V

    return-void
.end method
