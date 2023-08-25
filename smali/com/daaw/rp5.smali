.class public final Lcom/daaw/rp5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/x33;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/daaw/so5;

.field public final d:Lcom/google/android/gms/internal/ads/zzchu;

.field public final e:Ljava/lang/String;

.field public final f:Lcom/daaw/on6;

.field public final g:Lcom/google/android/gms/ads/internal/util/zzg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/x33;Lcom/daaw/so5;Ljava/lang/String;Lcom/daaw/on6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rp5;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/rp5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p3, p0, Lcom/daaw/rp5;->a:Lcom/daaw/x33;

    iput-object p4, p0, Lcom/daaw/rp5;->c:Lcom/daaw/so5;

    iput-object p5, p0, Lcom/daaw/rp5;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/daaw/rp5;->f:Lcom/daaw/on6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qz3;->h()Lcom/google/android/gms/ads/internal/util/zzg;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rp5;->g:Lcom/google/android/gms/ads/internal/util/zzg;

    return-void
.end method

.method public static final c(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/ArrayList;)V
    .locals 10

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    move-wide v4, v1

    :goto_0
    if-ge v3, v0, :cond_1

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/t63;

    invoke-virtual {v6}, Lcom/daaw/t63;->j0()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_0

    invoke-virtual {v6}, Lcom/daaw/t63;->R()J

    move-result-wide v7

    cmp-long v9, v7, v4

    if-lez v9, :cond_0

    invoke-virtual {v6}, Lcom/daaw/t63;->R()J

    move-result-wide v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    cmp-long p1, v4, v1

    if-eqz p1, :cond_2

    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "value"

    invoke-virtual {p1, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 v0, 0x0

    const-string v1, "offline_signal_statistics"

    const-string v2, "statistic_name = \'last_successful_request_time\'"

    invoke-virtual {p0, v1, p1, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_2
    return-void
.end method


# virtual methods
.method public final synthetic a(ZLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 12

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/rp5;->b:Landroid/content/Context;

    const-string p2, "OfflineUpload.db"

    invoke-virtual {p1, p2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    goto/16 :goto_5

    :cond_0
    sget-object p1, Lcom/daaw/g93;->K7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    const-string p1, "oa_upload"

    invoke-static {p1}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object p1

    invoke-static {p2, v2}, Lcom/daaw/kp5;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "oa_failed_reqs"

    invoke-virtual {p1, v4, v3}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {p2, v1}, Lcom/daaw/kp5;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "oa_total_reqs"

    invoke-virtual {p1, v3, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v3, "oa_upload_time"

    invoke-virtual {p1, v3, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {p2, v0}, Lcom/daaw/kp5;->b(Landroid/database/sqlite/SQLiteDatabase;I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v3, "oa_last_successful_time"

    invoke-virtual {p1, v3, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object v1, p0, Lcom/daaw/rp5;->g:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {v1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v1

    const-string v3, ""

    if-eqz v1, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/rp5;->e:Ljava/lang/String;

    :goto_0
    const-string v4, "oa_session_id"

    invoke-virtual {p1, v4, v1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object v1, p0, Lcom/daaw/rp5;->f:Lcom/daaw/on6;

    invoke-interface {v1, p1}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    invoke-static {p2}, Lcom/daaw/kp5;->c(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/daaw/rp5;->c(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/ArrayList;)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    :goto_1
    if-ge v2, v1, :cond_7

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/daaw/t63;

    const-string v6, "oa_signals"

    invoke-static {v6}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v6

    iget-object v7, p0, Lcom/daaw/rp5;->g:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {v7}, Lcom/google/android/gms/ads/internal/util/zzg;->zzP()Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v7, v3

    goto :goto_2

    :cond_2
    iget-object v7, p0, Lcom/daaw/rp5;->e:Ljava/lang/String;

    :goto_2
    invoke-virtual {v6, v4, v7}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->S()Lcom/daaw/o63;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/o63;->P()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Lcom/daaw/o63;->R()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    goto :goto_3

    :cond_3
    const-string v8, "-1"

    :goto_3
    invoke-virtual {v5}, Lcom/daaw/t63;->X()Ljava/util/List;

    move-result-object v9

    sget-object v10, Lcom/daaw/qp5;->a:Lcom/daaw/qp5;

    invoke-static {v9, v10}, Lcom/daaw/p27;->b(Ljava/util/List;Lcom/daaw/ey6;)Ljava/util/List;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5}, Lcom/daaw/t63;->R()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v11, "oa_sig_ts"

    invoke-virtual {v6, v11, v10}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->j0()I

    move-result v10

    add-int/lit8 v10, v10, -0x1

    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "oa_sig_status"

    invoke-virtual {v6, v11, v10}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->Q()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v11, "oa_sig_resp_lat"

    invoke-virtual {v6, v11, v10}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->P()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const-string v11, "oa_sig_render_lat"

    invoke-virtual {v6, v11, v10}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    const-string v10, "oa_sig_formats"

    invoke-virtual {v6, v10, v9}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    const-string v9, "oa_sig_nw_type"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->k0()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "oa_sig_wifi"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->g0()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "oa_sig_airplane"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->h0()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "oa_sig_data"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->O()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "oa_sig_nw_resp"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->i0()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "oa_sig_offline"

    invoke-virtual {v6, v9, v8}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v5}, Lcom/daaw/t63;->W()Lcom/daaw/x63;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/x63;->zza()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v8, "oa_sig_nw_state"

    invoke-virtual {v6, v8, v5}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-virtual {v7}, Lcom/daaw/o63;->O()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v7}, Lcom/daaw/o63;->P()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v7}, Lcom/daaw/o63;->R()I

    move-result v5

    if-ne v5, v0, :cond_4

    invoke-virtual {v7}, Lcom/daaw/o63;->Q()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v7, "oa_sig_cell_type"

    invoke-virtual {v6, v7, v5}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_4
    iget-object v5, p0, Lcom/daaw/rp5;->f:Lcom/daaw/on6;

    invoke-interface {v5, v6}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    :cond_5
    invoke-static {p2}, Lcom/daaw/kp5;->c(Landroid/database/sqlite/SQLiteDatabase;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {}, Lcom/daaw/y63;->L()Lcom/daaw/u63;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/rp5;->b:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/daaw/u63;->t(Ljava/lang/String;)Lcom/daaw/u63;

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/daaw/u63;->v(Ljava/lang/String;)Lcom/daaw/u63;

    invoke-static {p2, v2}, Lcom/daaw/kp5;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/daaw/u63;->w(I)Lcom/daaw/u63;

    invoke-virtual {v3, p1}, Lcom/daaw/u63;->s(Ljava/lang/Iterable;)Lcom/daaw/u63;

    invoke-static {p2, v1}, Lcom/daaw/kp5;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/daaw/u63;->y(I)Lcom/daaw/u63;

    const/4 v4, 0x3

    invoke-static {p2, v4}, Lcom/daaw/kp5;->a(Landroid/database/sqlite/SQLiteDatabase;I)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/daaw/u63;->u(I)Lcom/daaw/u63;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/ag;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/daaw/u63;->z(J)Lcom/daaw/u63;

    invoke-static {p2, v0}, Lcom/daaw/kp5;->b(Landroid/database/sqlite/SQLiteDatabase;I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Lcom/daaw/u63;->x(J)Lcom/daaw/u63;

    invoke-virtual {v3}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object v3

    check-cast v3, Lcom/daaw/y63;

    invoke-static {p2, p1}, Lcom/daaw/rp5;->c(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/ArrayList;)V

    iget-object p1, p0, Lcom/daaw/rp5;->a:Lcom/daaw/x33;

    new-instance v4, Lcom/daaw/op5;

    invoke-direct {v4, v3}, Lcom/daaw/op5;-><init>(Lcom/daaw/y63;)V

    invoke-virtual {p1, v4}, Lcom/daaw/x33;->b(Lcom/daaw/w33;)V

    invoke-static {}, Lcom/daaw/k73;->L()Lcom/daaw/j73;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/rp5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzchu;->q:I

    invoke-virtual {p1, v3}, Lcom/daaw/j73;->s(I)Lcom/daaw/j73;

    iget-object v3, p0, Lcom/daaw/rp5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget v3, v3, Lcom/google/android/gms/internal/ads/zzchu;->r:I

    invoke-virtual {p1, v3}, Lcom/daaw/j73;->u(I)Lcom/daaw/j73;

    iget-object v3, p0, Lcom/daaw/rp5;->d:Lcom/google/android/gms/internal/ads/zzchu;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzchu;->s:Z

    if-eq v1, v3, :cond_6

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {p1, v0}, Lcom/daaw/j73;->t(I)Lcom/daaw/j73;

    invoke-virtual {p1}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/k73;

    iget-object v0, p0, Lcom/daaw/rp5;->a:Lcom/daaw/x33;

    new-instance v1, Lcom/daaw/pp5;

    invoke-direct {v1, p1}, Lcom/daaw/pp5;-><init>(Lcom/daaw/k73;)V

    invoke-virtual {v0, v1}, Lcom/daaw/x33;->b(Lcom/daaw/w33;)V

    iget-object p1, p0, Lcom/daaw/rp5;->a:Lcom/daaw/x33;

    const/16 v0, 0x2714

    invoke-virtual {p1, v0}, Lcom/daaw/x33;->c(I)V

    :cond_7
    invoke-static {p2}, Lcom/daaw/kp5;->f(Landroid/database/sqlite/SQLiteDatabase;)V

    :goto_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Z)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/rp5;->c:Lcom/daaw/so5;

    new-instance v1, Lcom/daaw/np5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/np5;-><init>(Lcom/daaw/rp5;Z)V

    invoke-virtual {v0, v1}, Lcom/daaw/so5;->a(Lcom/daaw/em6;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Error in offline signals database startup: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/k04;->zzg(Ljava/lang/String;)V

    return-void
.end method
