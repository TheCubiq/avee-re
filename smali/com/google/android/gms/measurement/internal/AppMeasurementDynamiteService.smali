.class public Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;
.super Lcom/daaw/lt3;
.source ""


# annotations
.annotation build Lcom/google/android/gms/common/util/DynamiteApi;
.end annotation


# instance fields
.field public p:Lcom/daaw/dr6;

.field public final q:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/lt3;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    new-instance v0, Lcom/daaw/g6;

    invoke-direct {v0}, Lcom/daaw/g6;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final I(Lcom/daaw/ox3;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/dd8;->J(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public beginAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->y()Lcom/daaw/vk4;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vk4;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public clearConditionalUserProperty(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/p28;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public clearMeasurementEnabled(J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/p28;->I(Ljava/lang/Boolean;)V

    return-void
.end method

.method public endAdUnitExposure(Ljava/lang/String;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->y()Lcom/daaw/vk4;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/vk4;->l(Ljava/lang/String;J)V

    return-void
.end method

.method public generateEventId(Lcom/daaw/ox3;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/dd8;->r0()J

    move-result-wide v0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Lcom/daaw/dd8;->I(Lcom/daaw/ox3;J)V

    return-void
.end method

.method public getAppInstanceId(Lcom/daaw/ox3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/d38;

    invoke-direct {v1, p0, p1}, Lcom/daaw/d38;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCachedAppInstanceId(Lcom/daaw/ox3;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->V()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->I(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public getConditionalUserProperties(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/ox3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/kf8;

    invoke-direct {v1, p0, p3, p1, p2}, Lcom/daaw/kf8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getCurrentScreenClass(Lcom/daaw/ox3;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->W()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->I(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public getCurrentScreenName(Lcom/daaw/ox3;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->X()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->I(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public getGmpAppId(Lcom/daaw/ox3;)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->O()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->O()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->d()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v2}, Lcom/daaw/dr6;->R()Ljava/lang/String;

    move-result-object v2

    const-string v3, "google_app_id"

    invoke-static {v1, v3, v2}, Lcom/daaw/q38;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v0, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object v0

    const-string v2, "getGoogleAppId failed with exception"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->I(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public getMaxUserProperties(Ljava/lang/String;Lcom/daaw/ox3;)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/p28;->Q(Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p1

    const/16 v0, 0x19

    invoke-virtual {p1, p2, v0}, Lcom/daaw/dd8;->H(Lcom/daaw/ox3;I)V

    return-void
.end method

.method public getSessionId(Lcom/daaw/ox3;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/c18;

    invoke-direct {v2, v0, p1}, Lcom/daaw/c18;-><init>(Lcom/daaw/p28;Lcom/daaw/ox3;)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public getTestFlag(Lcom/daaw/ox3;I)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    if-eqz p2, :cond_4

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->R()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/dd8;->D(Lcom/daaw/ox3;Z)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->T()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/dd8;->H(Lcom/daaw/ox3;I)V

    return-void

    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->S()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "r"

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    :try_start_0
    invoke-interface {p1, v2}, Lcom/daaw/ox3;->T0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p2, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p2

    const-string v0, "Error returning double value to wrapper"

    invoke-virtual {p2, v0, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->U()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p2, p1, v0, v1}, Lcom/daaw/dd8;->I(Lcom/daaw/ox3;J)V

    return-void

    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->N()Lcom/daaw/dd8;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lcom/daaw/dd8;->J(Lcom/daaw/ox3;Ljava/lang/String;)V

    return-void
.end method

.method public getUserProperties(Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/ox3;)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v7, Lcom/daaw/s98;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p4

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/daaw/s98;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v7}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public initForTests(Ljava/util/Map;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public initialize(Lcom/daaw/yd0;Lcom/google/android/gms/internal/measurement/zzcl;J)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/daaw/dr6;->H(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzcl;Ljava/lang/Long;)Lcom/daaw/dr6;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Attempting to initialize multiple times"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void
.end method

.method public isDataCollectionEnabled(Lcom/daaw/ox3;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v1, Lcom/daaw/mh8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/mh8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;)V

    invoke-virtual {v0, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V
    .locals 10

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    move-object v0, p0

    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v2

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    move v7, p5

    move-wide/from16 v8, p6

    invoke-virtual/range {v2 .. v9}, Lcom/daaw/p28;->s(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJ)V

    return-void
.end method

.method public logEventAndBundle(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/daaw/ox3;J)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    invoke-static {p2}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Landroid/os/Bundle;

    if-eqz p3, :cond_0

    invoke-direct {v0, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_0
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    :goto_0
    const-string v4, "app"

    const-string v1, "_o"

    invoke-virtual {v0, v1, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/measurement/internal/zzaw;

    new-instance v3, Lcom/google/android/gms/measurement/internal/zzau;

    invoke-direct {v3, p3}, Lcom/google/android/gms/measurement/internal/zzau;-><init>(Landroid/os/Bundle;)V

    move-object v1, v0

    move-object v2, p2

    move-wide v5, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/measurement/internal/zzaw;-><init>(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzau;Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object p2

    new-instance p3, Lcom/daaw/j68;

    invoke-direct {p3, p0, p4, v0, p1}, Lcom/daaw/j68;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ox3;Lcom/google/android/gms/measurement/internal/zzaw;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public logHealthData(ILjava/lang/String;Lcom/daaw/yd0;Lcom/daaw/yd0;Lcom/daaw/yd0;)V
    .locals 9

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    const/4 v0, 0x0

    if-nez p3, :cond_0

    move-object v6, v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p3

    move-object v6, p3

    :goto_0
    if-nez p4, :cond_1

    move-object v7, v0

    goto :goto_1

    :cond_1
    invoke-static {p4}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p3

    move-object v7, p3

    :goto_1
    if-nez p5, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {p5}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    move-object v8, v0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move v2, p1

    move-object v5, p2

    invoke-virtual/range {v1 .. v8}, Lcom/daaw/om5;->F(IZZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityCreated(Lcom/daaw/yd0;Landroid/os/Bundle;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p3

    iget-object p3, p3, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p3, :cond_0

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p4}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p4

    invoke-virtual {p4}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p2}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public onActivityDestroyed(Lcom/daaw/yd0;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityDestroyed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityPaused(Lcom/daaw/yd0;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityPaused(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivityResumed(Lcom/daaw/yd0;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p2, :cond_0

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p3

    invoke-virtual {p3}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p2, p1}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivityResumed(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Lcom/daaw/yd0;Lcom/daaw/ox3;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p3

    iget-object p3, p3, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    new-instance p4, Landroid/os/Bundle;

    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-interface {p3, p1, p4}, Landroid/app/Application$ActivityLifecycleCallbacks;->onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    :cond_0
    :try_start_0
    invoke-interface {p2, p4}, Lcom/daaw/ox3;->T0(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p2

    const-string p3, "Error returning bundle value to wrapper"

    invoke-virtual {p2, p3, p1}, Lcom/daaw/hk5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(Lcom/daaw/yd0;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public onActivityStopped(Lcom/daaw/yd0;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    iget-object p2, p2, Lcom/daaw/p28;->c:Lcom/daaw/m28;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/p28;->o()V

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    :cond_0
    return-void
.end method

.method public performAction(Landroid/os/Bundle;Lcom/daaw/ox3;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/daaw/ox3;->T0(Landroid/os/Bundle;)V

    return-void
.end method

.method public registerOnMeasurementEventListener(Lcom/daaw/v04;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    invoke-interface {p1}, Lcom/daaw/v04;->zzd()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pl7;

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/hm8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/hm8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/v04;)V

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    invoke-interface {p1}, Lcom/daaw/v04;->zzd()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/p28;->x(Lcom/daaw/pl7;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public resetAnalyticsData(J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/p28;->y(J)V

    return-void
.end method

.method public setConditionalUserProperty(Landroid/os/Bundle;J)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->q()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "Conditional user property must not be null"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/p28;->E(Landroid/os/Bundle;J)V

    return-void
.end method

.method public setConsent(Landroid/os/Bundle;J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/yo7;

    invoke-direct {v2, v0, p1, p2, p3}, Lcom/daaw/yo7;-><init>(Lcom/daaw/p28;Landroid/os/Bundle;J)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->A(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setConsentThirdParty(Landroid/os/Bundle;J)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    const/16 v1, -0x14

    invoke-virtual {v0, p1, v1, p2, p3}, Lcom/daaw/p28;->F(Landroid/os/Bundle;IJ)V

    return-void
.end method

.method public setCurrentScreen(Lcom/daaw/yd0;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p4, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p4}, Lcom/daaw/dr6;->K()Lcom/daaw/r48;

    move-result-object p4

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p4, p1, p2, p3}, Lcom/daaw/r48;->D(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setDataCollectionEnabled(Z)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/c86;->g()V

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/d28;

    invoke-direct {v2, v0, p1}, Lcom/daaw/d28;-><init>(Lcom/daaw/p28;Z)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setDefaultEventParameters(Landroid/os/Bundle;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    move-object p1, v1

    :goto_0
    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/bq7;

    invoke-direct {v2, v0, p1}, Lcom/daaw/bq7;-><init>(Lcom/daaw/p28;Landroid/os/Bundle;)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setEventInterceptor(Lcom/daaw/v04;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    new-instance v0, Lcom/daaw/ek8;

    invoke-direct {v0, p0, p1}, Lcom/daaw/ek8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/v04;)V

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vn6;->C()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/p28;->H(Lcom/daaw/mk7;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object p1

    new-instance v1, Lcom/daaw/wc8;

    invoke-direct {v1, p0, v0}, Lcom/daaw/wc8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/ek8;)V

    invoke-virtual {p1, v1}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setInstanceIdProvider(Lcom/daaw/b34;)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public setMeasurementEnabled(ZJ)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p2}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/daaw/p28;->I(Ljava/lang/Boolean;)V

    return-void
.end method

.method public setMinimumSessionDuration(J)V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    return-void
.end method

.method public setSessionTimeoutDuration(J)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v1}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v1

    new-instance v2, Lcom/daaw/uu7;

    invoke-direct {v2, v0, p1, p2}, Lcom/daaw/uu7;-><init>(Lcom/daaw/p28;J)V

    invoke-virtual {v1, v2}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void
.end method

.method public setUserId(Ljava/lang/String;J)V
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v1

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->i()Lcom/daaw/om5;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/om5;->w()Lcom/daaw/hk5;

    move-result-object p1

    const-string p2, "User ID must be non-empty or null"

    invoke-virtual {p1, p2}, Lcom/daaw/hk5;->a(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, v1, Lcom/daaw/rc7;->a:Lcom/daaw/dr6;

    invoke-virtual {v0}, Lcom/daaw/dr6;->r()Lcom/daaw/vn6;

    move-result-object v0

    new-instance v2, Lcom/daaw/er7;

    invoke-direct {v2, v1, p1}, Lcom/daaw/er7;-><init>(Lcom/daaw/p28;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    const/4 v2, 0x0

    const/4 v5, 0x1

    const-string v3, "_id"

    move-object v4, p1

    move-wide v6, p2

    invoke-virtual/range {v1 .. v7}, Lcom/daaw/p28;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public setUserProperty(Ljava/lang/String;Ljava/lang/String;Lcom/daaw/yd0;ZJ)V
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    invoke-static {p3}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object v3

    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p3}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v4, p4

    move-wide v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/p28;->L(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    return-void
.end method

.method public unregisterOnMeasurementEventListener(Lcom/daaw/v04;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->q:Ljava/util/Map;

    invoke-interface {p1}, Lcom/daaw/v04;->zzd()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/pl7;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, Lcom/daaw/hm8;

    invoke-direct {v1, p0, p1}, Lcom/daaw/hm8;-><init>(Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;Lcom/daaw/v04;)V

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    invoke-virtual {p1}, Lcom/daaw/dr6;->I()Lcom/daaw/p28;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/daaw/p28;->N(Lcom/daaw/pl7;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final zzb()V
    .locals 2
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNull;
        value = {
            "scion"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->p:Lcom/daaw/dr6;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Attempting to perform action before initialize."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
