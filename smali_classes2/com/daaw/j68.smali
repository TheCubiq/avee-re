.class public final Lcom/daaw/j68;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ox3;

.field public final synthetic q:Lcom/google/android/gms/measurement/internal/zzaw;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/j68;->s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iput-object p2, p0, Lcom/daaw/j68;->p:Lcom/daaw/ox3;

    iput-object p3, p0, Lcom/daaw/j68;->q:Lcom/google/android/gms/measurement/internal/zzaw;

    iput-object p4, p0, Lcom/daaw/j68;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/j68;->s:Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->L()Lcom/daaw/x78;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/j68;->p:Lcom/daaw/ox3;

    iget-object v2, p0, Lcom/daaw/j68;->q:Lcom/google/android/gms/measurement/internal/zzaw;

    iget-object v3, p0, Lcom/daaw/j68;->r:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/x78;->o(Lcom/daaw/ox3;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    return-void
.end method
