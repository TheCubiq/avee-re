.class public final Lcom/daaw/ri6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/google/android/gms/ads/internal/client/zzfl;

.field public final b:Lcom/google/android/gms/internal/ads/zzbsl;

.field public final c:Lcom/daaw/az5;

.field public final d:Lcom/google/android/gms/ads/internal/client/zzl;

.field public final e:Lcom/google/android/gms/ads/internal/client/zzq;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/ArrayList;

.field public final h:Ljava/util/ArrayList;

.field public final i:Lcom/google/android/gms/internal/ads/zzblz;

.field public final j:Lcom/google/android/gms/ads/internal/client/zzw;

.field public final k:I

.field public final l:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

.field public final m:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

.field public final n:Lcom/google/android/gms/ads/internal/client/zzcb;

.field public final o:Lcom/daaw/bi6;

.field public final p:Z

.field public final q:Z

.field public final r:Lcom/google/android/gms/ads/internal/client/zzcf;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pi6;Lcom/daaw/qi6;)V
    .locals 28

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->w(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->h(Lcom/daaw/pi6;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->p(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzcf;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->r:Lcom/google/android/gms/ads/internal/client/zzcf;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget v3, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zza:I

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-wide v4, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzb:J

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v6, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzc:Landroid/os/Bundle;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget v7, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzd:I

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v8, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zze:Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-boolean v9, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzf:Z

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget v10, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzg:I

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzh:Z

    const/4 v11, 0x1

    if-nez v2, :cond_1

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->n(Lcom/daaw/pi6;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v11, 0x0

    :cond_1
    :goto_0
    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v12, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzi:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v13, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzj:Lcom/google/android/gms/ads/internal/client/zzfh;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v14, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzk:Landroid/location/Location;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v15, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzl:Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    move-object/from16 v16, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzn:Landroid/os/Bundle;

    move-object/from16 v17, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzo:Ljava/util/List;

    move-object/from16 v18, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzp:Ljava/lang/String;

    move-object/from16 v19, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzq:Ljava/lang/String;

    move-object/from16 v20, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-boolean v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzr:Z

    move/from16 v21, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzs:Lcom/google/android/gms/ads/internal/client/zzc;

    move-object/from16 v22, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzt:I

    move/from16 v23, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzu:Ljava/lang/String;

    move-object/from16 v24, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzv:Ljava/util/List;

    move-object/from16 v25, v2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzw:I

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/util/zzs;->zza(I)I

    move-result v26

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->u(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzl;

    move-result-object v2

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/client/zzl;->zzx:Ljava/lang/String;

    move-object/from16 v27, v2

    move-object v2, v1

    invoke-direct/range {v2 .. v27}, Lcom/google/android/gms/ads/internal/client/zzl;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/ads/internal/client/zzfh;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/ads/internal/client/zzc;ILjava/lang/String;Ljava/util/List;ILjava/lang/String;)V

    iput-object v1, v0, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->A(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzfl;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->A(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzfl;

    move-result-object v1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->B(Lcom/daaw/pi6;)Lcom/google/android/gms/internal/ads/zzblz;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->B(Lcom/daaw/pi6;)Lcom/google/android/gms/internal/ads/zzblz;

    move-result-object v1

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzblz;->u:Lcom/google/android/gms/ads/internal/client/zzfl;

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    iput-object v1, v0, Lcom/daaw/ri6;->a:Lcom/google/android/gms/ads/internal/client/zzfl;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->j(Lcom/daaw/pi6;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->g:Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->k(Lcom/daaw/pi6;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->h:Ljava/util/ArrayList;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->j(Lcom/daaw/pi6;)Ljava/util/ArrayList;

    move-result-object v1

    if-nez v1, :cond_4

    move-object v1, v2

    goto :goto_2

    :cond_4
    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->B(Lcom/daaw/pi6;)Lcom/google/android/gms/internal/ads/zzblz;

    move-result-object v1

    if-nez v1, :cond_5

    new-instance v1, Lcom/google/android/gms/internal/ads/zzblz;

    new-instance v3, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;

    invoke-direct {v3}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;-><init>()V

    invoke-virtual {v3}, Lcom/google/android/gms/ads/formats/NativeAdOptions$Builder;->build()Lcom/google/android/gms/ads/formats/NativeAdOptions;

    move-result-object v3

    invoke-direct {v1, v3}, Lcom/google/android/gms/internal/ads/zzblz;-><init>(Lcom/google/android/gms/ads/formats/NativeAdOptions;)V

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->B(Lcom/daaw/pi6;)Lcom/google/android/gms/internal/ads/zzblz;

    move-result-object v1

    :goto_2
    iput-object v1, v0, Lcom/daaw/ri6;->i:Lcom/google/android/gms/internal/ads/zzblz;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->y(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzw;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->j:Lcom/google/android/gms/ads/internal/client/zzw;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->r(Lcom/daaw/pi6;)I

    move-result v1

    iput v1, v0, Lcom/daaw/ri6;->k:I

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->s(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->l:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->t(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->m:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->z(Lcom/daaw/pi6;)Lcom/google/android/gms/ads/internal/client/zzcb;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->n:Lcom/google/android/gms/ads/internal/client/zzcb;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->C(Lcom/daaw/pi6;)Lcom/google/android/gms/internal/ads/zzbsl;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->b:Lcom/google/android/gms/internal/ads/zzbsl;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->E(Lcom/daaw/pi6;)Lcom/daaw/zh6;

    move-result-object v1

    new-instance v3, Lcom/daaw/bi6;

    invoke-direct {v3, v1, v2}, Lcom/daaw/bi6;-><init>(Lcom/daaw/zh6;Lcom/daaw/ai6;)V

    iput-object v3, v0, Lcom/daaw/ri6;->o:Lcom/daaw/bi6;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->l(Lcom/daaw/pi6;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/ri6;->p:Z

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->D(Lcom/daaw/pi6;)Lcom/daaw/az5;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/ri6;->c:Lcom/daaw/az5;

    invoke-static/range {p1 .. p1}, Lcom/daaw/pi6;->m(Lcom/daaw/pi6;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/daaw/ri6;->q:Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/se3;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ri6;->m:Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/daaw/ri6;->l:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/PublisherAdViewOptions;->zzb()Lcom/daaw/se3;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/daaw/ri6;->l:Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/formats/AdManagerAdViewOptions;->zza()Lcom/daaw/se3;

    move-result-object v0

    return-object v0
.end method

.method public final b()Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/ri6;->f:Ljava/lang/String;

    sget-object v1, Lcom/daaw/g93;->H2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
