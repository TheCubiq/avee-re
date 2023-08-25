.class public final synthetic Lcom/daaw/i74;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic A:Lcom/daaw/th6;

.field public final synthetic B:Lcom/daaw/wh6;

.field public final synthetic p:Landroid/content/Context;

.field public final synthetic q:Lcom/daaw/v84;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z

.field public final synthetic t:Z

.field public final synthetic u:Lcom/daaw/sl2;

.field public final synthetic v:Lcom/daaw/ja3;

.field public final synthetic w:Lcom/google/android/gms/internal/ads/zzchu;

.field public final synthetic x:Lcom/google/android/gms/ads/internal/zzl;

.field public final synthetic y:Lcom/google/android/gms/ads/internal/zza;

.field public final synthetic z:Lcom/daaw/x33;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/daaw/v84;Ljava/lang/String;ZZLcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/v93;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/th6;Lcom/daaw/wh6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/i74;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/i74;->q:Lcom/daaw/v84;

    iput-object p3, p0, Lcom/daaw/i74;->r:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/daaw/i74;->s:Z

    iput-boolean p5, p0, Lcom/daaw/i74;->t:Z

    iput-object p6, p0, Lcom/daaw/i74;->u:Lcom/daaw/sl2;

    iput-object p7, p0, Lcom/daaw/i74;->v:Lcom/daaw/ja3;

    iput-object p8, p0, Lcom/daaw/i74;->w:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p10, p0, Lcom/daaw/i74;->x:Lcom/google/android/gms/ads/internal/zzl;

    iput-object p11, p0, Lcom/daaw/i74;->y:Lcom/google/android/gms/ads/internal/zza;

    iput-object p12, p0, Lcom/daaw/i74;->z:Lcom/daaw/x33;

    iput-object p13, p0, Lcom/daaw/i74;->A:Lcom/daaw/th6;

    iput-object p14, p0, Lcom/daaw/i74;->B:Lcom/daaw/wh6;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/daaw/i74;->p:Landroid/content/Context;

    iget-object v4, v1, Lcom/daaw/i74;->q:Lcom/daaw/v84;

    iget-object v5, v1, Lcom/daaw/i74;->r:Ljava/lang/String;

    iget-boolean v6, v1, Lcom/daaw/i74;->s:Z

    iget-boolean v15, v1, Lcom/daaw/i74;->t:Z

    iget-object v8, v1, Lcom/daaw/i74;->u:Lcom/daaw/sl2;

    iget-object v9, v1, Lcom/daaw/i74;->v:Lcom/daaw/ja3;

    iget-object v10, v1, Lcom/daaw/i74;->w:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object v12, v1, Lcom/daaw/i74;->x:Lcom/google/android/gms/ads/internal/zzl;

    iget-object v13, v1, Lcom/daaw/i74;->y:Lcom/google/android/gms/ads/internal/zza;

    iget-object v14, v1, Lcom/daaw/i74;->z:Lcom/daaw/x33;

    iget-object v11, v1, Lcom/daaw/i74;->A:Lcom/daaw/th6;

    iget-object v7, v1, Lcom/daaw/i74;->B:Lcom/daaw/wh6;

    const/16 v2, 0x108

    :try_start_0
    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    new-instance v3, Lcom/daaw/s74;

    sget v2, Lcom/daaw/w74;->p0:I

    new-instance v2, Lcom/daaw/u84;

    invoke-direct {v2, v0}, Lcom/daaw/u84;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/daaw/w74;

    const/16 v16, 0x0

    move-object/from16 v17, v2

    move-object v2, v0

    move-object/from16 v18, v3

    move-object/from16 v3, v17

    move-object/from16 v17, v7

    move v7, v15

    move-object/from16 v19, v11

    move-object/from16 v11, v16

    move-object/from16 v20, v14

    move/from16 v21, v15

    move-object/from16 v15, v19

    move-object/from16 v16, v17

    invoke-direct/range {v2 .. v16}, Lcom/daaw/w74;-><init>(Lcom/daaw/u84;Lcom/daaw/v84;Ljava/lang/String;ZZLcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/v93;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/th6;Lcom/daaw/wh6;)V

    move-object/from16 v2, v18

    invoke-direct {v2, v0}, Lcom/daaw/s74;-><init>(Lcom/daaw/a74;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzq()Lcom/google/android/gms/ads/internal/util/zzaa;

    move-result-object v0

    move-object/from16 v4, v20

    move/from16 v3, v21

    invoke-virtual {v0, v2, v4, v3}, Lcom/google/android/gms/ads/internal/util/zzaa;->zzd(Lcom/daaw/a74;Lcom/daaw/x33;Z)Lcom/daaw/h74;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/daaw/a74;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    new-instance v0, Lcom/daaw/z64;

    invoke-direct {v0, v2}, Lcom/daaw/z64;-><init>(Lcom/daaw/a74;)V

    invoke-interface {v2, v0}, Lcom/daaw/a74;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    return-object v2

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    throw v0
.end method
