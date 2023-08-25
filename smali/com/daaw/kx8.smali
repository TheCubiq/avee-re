.class public final Lcom/daaw/kx8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/f77;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzcgj;

.field public final synthetic c:Lcom/daaw/wy3;

.field public final synthetic d:Lcom/daaw/io6;

.field public final synthetic e:J

.field public final synthetic f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzcgj;Lcom/daaw/wy3;Lcom/daaw/io6;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    iput-object p2, p0, Lcom/daaw/kx8;->a:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/kx8;->b:Lcom/google/android/gms/internal/ads/zzcgj;

    iput-object p4, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    iput-object p5, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    iput-wide p6, p0, Lcom/daaw/kx8;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 14

    const-string v0, "sgf"

    const-string v1, "sgf_reason"

    const-string v2, "QueryInfo generation has been disabled."

    check-cast p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;

    iget-object v3, p0, Lcom/daaw/kx8;->a:Lcom/daaw/f77;

    iget-object v4, p0, Lcom/daaw/kx8;->b:Lcom/google/android/gms/internal/ads/zzcgj;

    invoke-static {v3, v4}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->M3(Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzcgj;)Lcom/daaw/to6;

    move-result-object v3

    sget-object v4, Lcom/daaw/g93;->V6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    invoke-interface {p1, v2}, Lcom/daaw/wy3;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    :goto_0
    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    iget-object p1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {p1, v2}, Lcom/daaw/io6;->m(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {p1, v5}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    :goto_1
    invoke-virtual {v3, p1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v3}, Lcom/daaw/to6;->g()V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v2

    invoke-interface {v2}, Lcom/daaw/ag;->a()J

    move-result-wide v6

    iget-wide v8, p0, Lcom/daaw/kx8;->e:J

    sub-long/2addr v6, v8

    const-string v2, "sgs"

    const-string v4, "SignalGeneratorImpl.generateSignals.onSuccess"

    const-string v8, ""

    const/4 v9, 0x1

    if-nez p1, :cond_1

    :try_start_1
    iget-object p1, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    const/4 v0, 0x0

    invoke-interface {p1, v0, v0, v0}, Lcom/daaw/wy3;->B0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->K3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/pd5;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object p1

    new-array v1, v9, [Landroid/util/Pair;

    new-instance v6, Landroid/util/Pair;

    const-string v7, "rid"

    const-string v10, "-1"

    invoke-direct {v6, v7, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v6, v1, v5

    invoke-static {v0, p1, v2, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzc(Lcom/daaw/pd5;Lcom/daaw/fd5;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {p1, v9}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    :goto_2
    iget-object p1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    goto :goto_1

    :cond_1
    :try_start_2
    new-instance v10, Lorg/json/JSONObject;

    iget-object v11, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zzb:Ljava/lang/String;

    invoke-direct {v10, v11}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v11, "request_id"

    invoke-virtual {v10, v11, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_2

    const-string p1, "The request ID is empty in request JSON."

    invoke-static {p1}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    const-string v2, "Internal error: request ID is empty in request JSON."

    invoke-interface {p1, v2}, Lcom/daaw/wy3;->zzb(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->K3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/pd5;

    move-result-object v2

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object p1

    new-array v6, v9, [Landroid/util/Pair;

    new-instance v7, Landroid/util/Pair;

    const-string v9, "rid_missing"

    invoke-direct {v7, v1, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v7, v6, v5

    invoke-static {v2, p1, v0, v6}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzc(Lcom/daaw/pd5;Lcom/daaw/fd5;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    const-string v0, "Request ID empty"

    invoke-interface {p1, v0}, Lcom/daaw/io6;->m(Ljava/lang/String;)Lcom/daaw/io6;

    invoke-interface {p1, v5}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_2
    :try_start_4
    iget-object v0, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    iget-object v1, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object v12

    invoke-static {v0, v11, v1, v12}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->m3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/fd5;)V

    iget-object v0, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zzc:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->q3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Z

    move-result v11

    if-eqz v11, :cond_3

    if-eqz v0, :cond_3

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->S3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v1

    const/4 v11, -0x1

    invoke-virtual {v0, v1, v11}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v11, :cond_3

    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->S3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->j3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    invoke-virtual {v0, v11, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->r3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Z

    move-result v11

    if-eqz v11, :cond_5

    if-eqz v0, :cond_5

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->g3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->T3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzp()Lcom/google/android/gms/ads/internal/util/zzs;

    move-result-object v11

    iget-object v12, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v12}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->F3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Landroid/content/Context;

    move-result-object v13

    invoke-static {v12}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->I3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/google/android/gms/internal/ads/zzchu;

    move-result-object v12

    iget-object v12, v12, Lcom/google/android/gms/internal/ads/zzchu;->p:Ljava/lang/String;

    invoke-virtual {v11, v13, v12}, Lcom/google/android/gms/ads/internal/util/zzs;->zzc(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->k3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;Ljava/lang/String;)V

    :cond_4
    iget-object v1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->g3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->T3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iget-object v1, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    iget-object v11, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zza:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzao;->zzb:Ljava/lang/String;

    invoke-interface {v1, v11, p1, v0}, Lcom/daaw/wy3;->B0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->K3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/pd5;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object p1

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/util/Pair;

    new-instance v11, Landroid/util/Pair;

    const-string v12, "tqgt"

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v11, v12, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v11, v1, v5

    new-instance v6, Landroid/util/Pair;

    const-string v7, "tpc"

    const-string v11, "na"

    sget-object v12, Lcom/daaw/g93;->C8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v13

    invoke-virtual {v13, v12}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v12, :cond_6

    goto :goto_3

    :cond_6
    :try_start_5
    const-string v12, "extras"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v10

    const-string v12, "accept_3p_cookie"

    invoke-virtual {v10, v12}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    const-string v11, "1"

    goto :goto_3

    :cond_7
    const-string v11, "0"
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v10

    :try_start_6
    const-string v12, "Error retrieving JSONObject from the requestJson, "

    invoke-static {v12, v10}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    invoke-direct {v6, v7, v11}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v6, v1, v9

    invoke-static {v0, p1, v2, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzc(Lcom/daaw/pd5;Lcom/daaw/fd5;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object p1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {p1, v9}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;
    :try_end_6
    .catch Landroid/os/RemoteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_2
    move-exception p1

    goto :goto_4

    :catch_3
    move-exception p1

    :try_start_7
    const-string v2, "Failed to create JSON object from the request string."

    invoke-static {v2}, Lcom/daaw/k04;->zzj(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Internal error for request JSON: "

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/daaw/wy3;->zzb(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->K3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/pd5;

    move-result-object v6

    invoke-static {v2}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object v2

    new-array v7, v9, [Landroid/util/Pair;

    new-instance v9, Landroid/util/Pair;

    const-string v10, "request_invalid"

    invoke-direct {v9, v1, v10}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v7, v5

    invoke-static {v6, v2, v0, v7}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzc(Lcom/daaw/pd5;Lcom/daaw/fd5;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object v0, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v0, v5}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0, p1, v4}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :goto_4
    :try_start_8
    iget-object v0, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {v0, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v0, v5}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-static {v8, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    invoke-virtual {v0, p1, v4}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    sget-object p1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {p1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    if-eqz v3, :cond_8

    goto/16 :goto_2

    :cond_8
    return-void

    :goto_5
    sget-object v0, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {v0}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_9

    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-virtual {v3, v0}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v3}, Lcom/daaw/to6;->g()V

    :cond_9
    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 10

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/daaw/kx8;->e:J

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v5

    const-string v6, "SignalGeneratorImpl.generateSignals"

    invoke-virtual {v5, p1, v6}, Lcom/daaw/qz3;->u(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/daaw/kx8;->f:Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;

    invoke-static {v5}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->K3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/pd5;

    move-result-object v6

    invoke-static {v5}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->J3(Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;)Lcom/daaw/fd5;

    move-result-object v5

    const/4 v7, 0x2

    new-array v7, v7, [Landroid/util/Pair;

    new-instance v8, Landroid/util/Pair;

    const-string v9, "sgf_reason"

    invoke-direct {v8, v9, v4}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v9, 0x0

    aput-object v8, v7, v9

    new-instance v8, Landroid/util/Pair;

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tqgt"

    invoke-direct {v8, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x1

    aput-object v8, v7, v0

    const-string v0, "sgf"

    invoke-static {v6, v5, v0, v7}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzc(Lcom/daaw/pd5;Lcom/daaw/fd5;Ljava/lang/String;[Landroid/util/Pair;)V

    iget-object v0, p0, Lcom/daaw/kx8;->a:Lcom/daaw/f77;

    iget-object v1, p0, Lcom/daaw/kx8;->b:Lcom/google/android/gms/internal/ads/zzcgj;

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzac;->M3(Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzcgj;)Lcom/daaw/to6;

    move-result-object v0

    sget-object v1, Lcom/daaw/ta3;->e:Lcom/daaw/ma3;

    invoke-virtual {v1}, Lcom/daaw/ma3;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/kx8;->d:Lcom/daaw/io6;

    invoke-interface {v1, p1}, Lcom/daaw/io6;->e(Ljava/lang/Throwable;)Lcom/daaw/io6;

    invoke-interface {v1, v9}, Lcom/daaw/io6;->zzf(Z)Lcom/daaw/io6;

    invoke-virtual {v0, v1}, Lcom/daaw/to6;->a(Lcom/daaw/io6;)Lcom/daaw/to6;

    invoke-virtual {v0}, Lcom/daaw/to6;->g()V

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/daaw/kx8;->c:Lcom/daaw/wy3;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Internal error. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/wy3;->zzb(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
