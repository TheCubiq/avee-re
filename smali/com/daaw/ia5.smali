.class public final Lcom/daaw/ia5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/p74;

.field public final b:Landroid/content/Context;

.field public final c:Lcom/daaw/sl2;

.field public final d:Lcom/daaw/ja3;

.field public final e:Lcom/google/android/gms/internal/ads/zzchu;

.field public final f:Lcom/google/android/gms/ads/internal/zza;

.field public final g:Lcom/daaw/x33;

.field public final h:Lcom/daaw/jt4;


# direct methods
.method public constructor <init>(Lcom/daaw/p74;Landroid/content/Context;Lcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/jt4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ia5;->a:Lcom/daaw/p74;

    iput-object p2, p0, Lcom/daaw/ia5;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/ia5;->c:Lcom/daaw/sl2;

    iput-object p4, p0, Lcom/daaw/ia5;->d:Lcom/daaw/ja3;

    iput-object p5, p0, Lcom/daaw/ia5;->e:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p6, p0, Lcom/daaw/ia5;->f:Lcom/google/android/gms/ads/internal/zza;

    iput-object p7, p0, Lcom/daaw/ia5;->g:Lcom/daaw/x33;

    iput-object p8, p0, Lcom/daaw/ia5;->h:Lcom/daaw/jt4;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/ia5;)Lcom/daaw/jt4;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ia5;->h:Lcom/daaw/jt4;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;
    .locals 15

    move-object v0, p0

    iget-object v1, v0, Lcom/daaw/ia5;->b:Landroid/content/Context;

    invoke-static/range {p1 .. p1}, Lcom/daaw/v84;->c(Lcom/google/android/gms/ads/internal/client/zzq;)Lcom/daaw/v84;

    move-result-object v2

    move-object/from16 v3, p1

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/zzq;->zza:Ljava/lang/String;

    iget-object v6, v0, Lcom/daaw/ia5;->c:Lcom/daaw/sl2;

    iget-object v7, v0, Lcom/daaw/ia5;->d:Lcom/daaw/ja3;

    iget-object v8, v0, Lcom/daaw/ia5;->e:Lcom/google/android/gms/internal/ads/zzchu;

    new-instance v10, Lcom/daaw/x95;

    invoke-direct {v10, p0}, Lcom/daaw/x95;-><init>(Lcom/daaw/ia5;)V

    iget-object v11, v0, Lcom/daaw/ia5;->f:Lcom/google/android/gms/ads/internal/zza;

    iget-object v12, v0, Lcom/daaw/ia5;->g:Lcom/daaw/x33;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    invoke-static/range {v1 .. v14}, Lcom/daaw/p74;->a(Landroid/content/Context;Lcom/daaw/v84;Ljava/lang/String;ZZLcom/daaw/sl2;Lcom/daaw/ja3;Lcom/google/android/gms/internal/ads/zzchu;Lcom/daaw/v93;Lcom/google/android/gms/ads/internal/zzl;Lcom/google/android/gms/ads/internal/zza;Lcom/daaw/x33;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v1

    return-object v1
.end method
