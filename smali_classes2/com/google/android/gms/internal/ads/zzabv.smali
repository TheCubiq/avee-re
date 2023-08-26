.class public final Lcom/google/android/gms/internal/ads/zzabv;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/ads/zzajh;",
        ">;"
    }
.end annotation


# static fields
.field private static zzbzx:J = 0xaL


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mErrorCode:I

.field private final mLock:Ljava/lang/Object;

.field private final zzaad:Lcom/google/android/gms/internal/ads/zzacm;

.field private final zzbjc:Lcom/google/android/gms/internal/ads/zzci;

.field private final zzbze:Lcom/google/android/gms/internal/ads/zzaji;

.field private final zzbzy:Lcom/google/android/gms/internal/ads/zzalt;

.field private final zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

.field private zzcaa:Z

.field private zzcab:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private zzcac:Lorg/json/JSONObject;

.field private zzcad:Ljava/lang/String;

.field private zzcae:Ljava/lang/String;

.field private final zzvr:Lcom/google/android/gms/internal/ads/zznx;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzalt;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zznx;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->mLock:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzy:Lcom/google/android/gms/internal/ads/zzalt;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    invoke-virtual {p2}, Lcom/google/android/gms/ads/internal/zzbc;->zzdr()Lcom/google/android/gms/internal/ads/zzacm;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcaa:Z

    const/4 p1, -0x2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->mErrorCode:I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcab:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcad:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcae:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzabv;)Lcom/google/android/gms/ads/internal/zzbc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    return-object p0
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzpb;Z)Lcom/google/android/gms/internal/ads/zzajh;
    .locals 48

    move-object/from16 v1, p0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->mLock:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v0, v1, Lcom/google/android/gms/internal/ads/zzabv;->mErrorCode:I

    const/4 v3, -0x2

    if-nez p1, :cond_0

    iget v4, v1, Lcom/google/android/gms/internal/ads/zzabv;->mErrorCode:I

    if-ne v4, v3, :cond_0

    const/4 v0, 0x0

    const/4 v8, 0x0

    goto :goto_0

    :cond_0
    move v8, v0

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v8, v3, :cond_1

    const/4 v0, 0x0

    move-object/from16 v32, v0

    goto :goto_1

    :cond_1
    move-object/from16 v32, p1

    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzajh;

    move-object v4, v0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v5, v2, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    const/4 v6, 0x0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v7, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzbsn:Ljava/util/List;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v9, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzbso:Ljava/util/List;

    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzcab:Ljava/util/List;

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget v11, v2, Lcom/google/android/gms/internal/ads/zzaej;->orientation:I

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-wide v12, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzbsu:J

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v14, v2, Lcom/google/android/gms/internal/ads/zzaef;->zzccy:Ljava/lang/String;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    move-object/from16 v23, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzcep:J

    move-wide/from16 v24, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcoh:J

    move-wide/from16 v26, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-wide v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcoi:J

    move-wide/from16 v28, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzcev:Ljava/lang/String;

    move-object/from16 v30, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzcac:Lorg/json/JSONObject;

    move-object/from16 v31, v2

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzcfh:Z

    move/from16 v36, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzcfi:Lcom/google/android/gms/internal/ads/zzael;

    move-object/from16 v37, v2

    const/16 v38, 0x0

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzbsr:Ljava/util/List;

    move-object/from16 v39, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzcad:Ljava/lang/String;

    move-object/from16 v40, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

    move-object/from16 v41, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzzl:Z

    move/from16 v42, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcor:Z

    move/from16 v43, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzbsp:Ljava/util/List;

    move-object/from16 v45, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzaej;->zzzm:Z

    move/from16 v46, v2

    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzabv;->zzcae:Ljava/lang/String;

    move-object/from16 v47, v2

    move/from16 v44, p2

    invoke-direct/range {v4 .. v47}, Lcom/google/android/gms/internal/ads/zzajh;-><init>(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzaqw;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/ads/zzwx;Lcom/google/android/gms/internal/ads/zzxq;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzwy;Lcom/google/android/gms/internal/ads/zzxa;JLcom/google/android/gms/internal/ads/zzjn;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzpb;Lcom/google/android/gms/internal/ads/zzaig;Ljava/util/List;Ljava/util/List;ZLcom/google/android/gms/internal/ads/zzael;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzhs;ZZZLjava/util/List;ZLjava/lang/String;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private final zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "ZZ)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "url"

    if-eqz p2, :cond_0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const-string v3, "scale"

    invoke-virtual {p1, v3, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v4

    const/4 v1, 0x1

    const-string v2, "is_transparent"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzabv;->zzd(IZ)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz p3, :cond_2

    new-instance p1, Lcom/google/android/gms/internal/ads/zzon;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-direct {p1, v1, p2, v4, v5}, Lcom/google/android/gms/internal/ads/zzon;-><init>(Landroid/graphics/drawable/Drawable;Landroid/net/Uri;D)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzy:Lcom/google/android/gms/internal/ads/zzalt;

    new-instance p3, Lcom/google/android/gms/internal/ads/zzacb;

    move-object v1, p3

    move-object v2, p0

    move v3, p2

    move-object v7, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/zzacb;-><init>(Lcom/google/android/gms/internal/ads/zzabv;ZDZLjava/lang/String;)V

    invoke-virtual {p1, v0, p3}, Lcom/google/android/gms/internal/ads/zzalt;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzalz;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzqs;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzabv;->zzc(Lcom/google/android/gms/internal/ads/zzqs;Ljava/lang/String;)V

    return-void
.end method

.method private final zzab(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->mLock:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcaa:Z

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzabv;->mErrorCode:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static zzb(Lcom/google/android/gms/internal/ads/zzanz;)Lcom/google/android/gms/internal/ads/zzaqw;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/zzaqw;"
        }
    .end annotation

    const-string v0, ""

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zznk;->zzbby:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzanz;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzaqw;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzane;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_3
    move-exception p0

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzane;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string p1, "r"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    const-string v0, "g"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "b"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p1, v0, p0}, Landroid/graphics/Color;->rgb(III)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method static zzc(Lcom/google/android/gms/internal/ads/zzanz;)Lcom/google/android/gms/internal/ads/zzaqw;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/zzaqw;"
        }
    .end annotation

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzbbx:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p0, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzanz;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzaqw;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    :goto_0
    const-string v0, "Exception occurred while waiting for video to load"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_3
    move-exception p0

    const-string v0, "InterruptedException occurred while waiting for video to load"

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private final zzc(Lcom/google/android/gms/internal/ads/zzqs;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzqs;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbc;->zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzrc;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzrc;->zzb(Lcom/google/android/gms/internal/ads/zzqs;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x28

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "Failed to call onCustomClick for asset "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static zzk(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "TV;>;>;)",
            "Ljava/util/List<",
            "TV;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzanz;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzanz;->get()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method static synthetic zzl(Ljava/util/List;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/util/concurrent/ExecutionException;,
            Ljava/lang/InterruptedException;
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzabv;->zzk(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final zznw()Lcom/google/android/gms/internal/ads/zzajh;
    .locals 15

    const-string v0, "custom_template_id"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v3}, Lcom/google/android/gms/ads/internal/zzbc;->getUuid()Ljava/lang/String;

    move-result-object v12

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabv;->zznx()Z

    move-result v3

    if-nez v3, :cond_3

    new-instance v3, Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzaej;->zzceo:Ljava/lang/String;

    invoke-direct {v3, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    new-instance v4, Lorg/json/JSONObject;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzaej;->zzceo:Ljava/lang/String;

    invoke-direct {v4, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v5
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v6, "ads"

    if-eqz v5, :cond_1

    :try_start_1
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v2

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    const/4 v4, 0x3

    invoke-direct {p0, v4}, Lcom/google/android/gms/internal/ads/zzabv;->zzab(I)V

    :cond_2
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    invoke-interface {v4, v3}, Lcom/google/android/gms/internal/ads/zzacm;->zzh(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v3

    sget-wide v4, Lcom/google/android/gms/internal/ads/zzabv;->zzbzx:J

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzanz;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "success"

    invoke-virtual {v3, v4, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "json"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    invoke-virtual {v3, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    move-object v9, v3

    goto :goto_1

    :cond_3
    move-object v9, v2

    :goto_1
    const-string v3, "enable_omid"

    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v4, "omid_settings"

    if-nez v3, :cond_4

    :goto_2
    :try_start_2
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object v5

    move-object v13, v5

    goto :goto_3

    :cond_4
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v6, "omid_html"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    sget-object v7, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v8, Lcom/google/android/gms/internal/ads/zzabw;

    invoke-direct {v8, p0, v6, v5}, Lcom/google/android/gms/internal/ads/zzabw;-><init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzaoj;Ljava/lang/String;)V

    invoke-interface {v7, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    move-object v13, v6

    :goto_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabv;->zznx()Z

    move-result v5

    if-nez v5, :cond_f

    if-nez v9, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v5, "template_id"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    if-eqz v6, :cond_8

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget-boolean v6, v6, Lcom/google/android/gms/internal/ads/zzpl;->zzbjn:Z

    goto :goto_4

    :cond_8
    const/4 v6, 0x0

    :goto_4
    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    if-eqz v7, :cond_9

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v7, v7, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget-boolean v7, v7, Lcom/google/android/gms/internal/ads/zzpl;->zzbjp:Z

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    :goto_5
    const-string v8, "2"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    new-instance v0, Lcom/google/android/gms/internal/ads/zzacn;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/zzaji;->zzcor:Z

    invoke-direct {v0, v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzacn;-><init>(ZZZ)V

    goto :goto_8

    :cond_a
    const-string v8, "1"

    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaco;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/zzaji;->zzcor:Z

    invoke-direct {v0, v6, v7, v5}, Lcom/google/android/gms/internal/ads/zzaco;-><init>(ZZZ)V

    goto :goto_8

    :cond_b
    const-string v7, "3"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    sget-object v8, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v10, Lcom/google/android/gms/internal/ads/zzaby;

    invoke-direct {v10, p0, v7, v5}, Lcom/google/android/gms/internal/ads/zzaby;-><init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzaoj;Ljava/lang/String;)V

    invoke-virtual {v8, v10}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-wide v10, Lcom/google/android/gms/internal/ads/zzabv;->zzbzx:J

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v10, v11, v5}, Lcom/google/android/gms/internal/ads/zzaoj;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_c

    new-instance v0, Lcom/google/android/gms/internal/ads/zzacp;

    invoke-direct {v0, v6}, Lcom/google/android/gms/internal/ads/zzacp;-><init>(Z)V

    goto :goto_8

    :cond_c
    const-string v5, "No handler for custom template: "

    invoke-virtual {v9, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_d
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_6
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->e(Ljava/lang/String;)V

    goto :goto_7

    :cond_e
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzabv;->zzab(I)V

    :cond_f
    :goto_7
    move-object v0, v2

    :goto_8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabv;->zznx()Z

    move-result v5

    if-nez v5, :cond_14

    if-eqz v0, :cond_14

    if-nez v9, :cond_10

    goto :goto_c

    :cond_10
    const-string v5, "tracking_urls_and_actions"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "impression_tracking_urls"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-nez v6, :cond_11

    move-object v7, v2

    goto :goto_a

    :cond_11
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    new-array v7, v7, [Ljava/lang/String;

    const/4 v8, 0x0

    :goto_9
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v10

    if-ge v8, v10, :cond_12

    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_12
    :goto_a
    if-nez v7, :cond_13

    move-object v6, v2

    goto :goto_b

    :cond_13
    invoke-static {v7}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    :goto_b
    iput-object v6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcab:Ljava/util/List;

    const-string v6, "active_view"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcac:Lorg/json/JSONObject;

    const-string v5, "debug_signals"

    invoke-virtual {v9, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcad:Ljava/lang/String;

    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcae:Ljava/lang/String;

    invoke-interface {v0, p0, v9}, Lcom/google/android/gms/internal/ads/zzacd;->zza(Lcom/google/android/gms/internal/ads/zzabv;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzpb;

    move-result-object v0

    new-instance v14, Lcom/google/android/gms/internal/ads/zzpd;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v11, v4, Lcom/google/android/gms/internal/ads/zzaef;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    move-object v4, v14

    move-object v10, v0

    invoke-direct/range {v4 .. v12}, Lcom/google/android/gms/internal/ads/zzpd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzacm;Lcom/google/android/gms/internal/ads/zzci;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzpb;Lcom/google/android/gms/internal/ads/zzang;Ljava/lang/String;)V

    invoke-interface {v0, v14}, Lcom/google/android/gms/internal/ads/zzpb;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    goto :goto_d

    :cond_14
    :goto_c
    move-object v0, v2

    :goto_d
    instance-of v4, v0, Lcom/google/android/gms/internal/ads/zzos;

    if-eqz v4, :cond_15

    move-object v4, v0

    check-cast v4, Lcom/google/android/gms/internal/ads/zzos;

    new-instance v5, Lcom/google/android/gms/internal/ads/zzabz;

    invoke-direct {v5, p0, v4}, Lcom/google/android/gms/internal/ads/zzabz;-><init>(Lcom/google/android/gms/internal/ads/zzabv;Lcom/google/android/gms/internal/ads/zzos;)V

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    const-string v6, "/nativeAdCustomClick"

    invoke-interface {v4, v6, v5}, Lcom/google/android/gms/internal/ads/zzacm;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    :cond_15
    invoke-direct {p0, v0, v3}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lcom/google/android/gms/internal/ads/zzpb;Z)Lcom/google/android/gms/internal/ads/zzajh;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-static {v13}, Lcom/google/android/gms/internal/ads/zzabv;->zzb(Lcom/google/android/gms/internal/ads/zzanz;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/gms/ads/internal/zzbc;->zzg(Lcom/google/android/gms/internal/ads/zzaqw;)V
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v3, "Error occured while doing native ads initialization."

    goto :goto_f

    :catch_1
    move-exception v0

    const-string v3, "Timeout when loading native ad."

    goto :goto_f

    :catch_2
    move-exception v0

    goto :goto_e

    :catch_3
    move-exception v0

    goto :goto_e

    :catch_4
    move-exception v0

    goto :goto_e

    :catch_5
    move-exception v0

    :goto_e
    const-string v3, "Malformed native JSON response."

    :goto_f
    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcaa:Z

    if-nez v0, :cond_16

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzabv;->zzab(I)V

    :cond_16
    invoke-direct {p0, v2, v1}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lcom/google/android/gms/internal/ads/zzpb;Z)Lcom/google/android/gms/internal/ads/zzajh;

    move-result-object v0

    return-object v0
.end method

.method private final zznx()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzcaa:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzabv;->zznw()Lcom/google/android/gms/internal/ads/zzajh;

    move-result-object v0

    return-object v0
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZ)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    :goto_0
    if-nez p1, :cond_1

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "ZZZ)",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    const/4 p3, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p5, :cond_1

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p5

    goto :goto_0

    :cond_1
    const/4 p5, 0x1

    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-ge v0, p5, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :cond_2
    invoke-direct {p0, v1, p3, p4}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-object p2

    :cond_4
    :goto_2
    invoke-virtual {p0, p3, p3}, Lcom/google/android/gms/internal/ads/zzabv;->zzd(IZ)V

    return-object p2
.end method

.method public final zza(Lorg/json/JSONObject;Ljava/lang/String;Z)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/concurrent/Future<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "require"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p2

    if-nez p1, :cond_0

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;ZZ)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method

.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzaoj;Ljava/lang/String;)V
    .locals 11

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/zzarc;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzabv;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvq()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object v1

    const-string v2, "native-omid"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaef;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v9}, Lcom/google/android/gms/ads/internal/zza;->zzbi()Lcom/google/android/gms/ads/internal/zzw;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzaji;->zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzarc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzabx;

    invoke-direct {v2, p1, v0}, Lcom/google/android/gms/internal/ads/zzabx;-><init>(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzaqw;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzasd;)V

    const-string v1, "text/html"

    const-string v2, "UTF-8"

    invoke-interface {v0, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V

    const-string p1, ""

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzane;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzc(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const/4 p2, 0x0

    if-nez p1, :cond_0

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v0, "vast_xml"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Required field \'vast_xml\' is missing"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzabv;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzabv;->zzbzz:Lcom/google/android/gms/ads/internal/zzbc;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzace;

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzace;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbc;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvy:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzacf;

    invoke-direct {v2, p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzacf;-><init>(Lcom/google/android/gms/internal/ads/zzace;Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzaoj;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public final zzd(IZ)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzabv;->zzab(I)V

    :cond_0
    return-void
.end method

.method public final zzg(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Lcom/google/android/gms/internal/ads/zzoj;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    move-object/from16 v10, p0

    const-string v0, "attribution"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "text"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v0, -0x1

    const-string v2, "text_size"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    const-string v0, "text_color"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzabv;->zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    const-string v0, "bg_color"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzabv;->zzb(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v9

    const/16 v0, 0x3e8

    const-string v2, "animation_ms"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    const/16 v0, 0xfa0

    const-string v2, "presentation_ms"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v12

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    if-eqz v0, :cond_1

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->versionCode:I

    const/4 v2, 0x2

    if-lt v0, v2, :cond_1

    iget-object v0, v10, Lcom/google/android/gms/internal/ads/zzabv;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzbjq:I

    move v13, v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    const/4 v13, 0x1

    :goto_0
    const-string v0, "allow_pub_rendering"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v14

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "images"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    const/4 v15, 0x0

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v2, "images"

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v2, "image"

    invoke-virtual {v10, v1, v2, v15, v15}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    new-instance v5, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v15}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/ads/zzanz;

    new-instance v15, Lcom/google/android/gms/internal/ads/zzacc;

    invoke-direct {v15, v2, v1, v5, v0}, Lcom/google/android/gms/internal/ads/zzacc;-><init>(Ljava/util/concurrent/atomic/AtomicInteger;ILcom/google/android/gms/internal/ads/zzaoj;Ljava/util/List;)V

    move-object/from16 p1, v0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-interface {v4, v15, v0}, Lcom/google/android/gms/internal/ads/zzanz;->zza(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_3
    new-instance v15, Lcom/google/android/gms/internal/ads/zzaca;

    move-object v0, v15

    move-object/from16 v1, p0

    move-object v2, v6

    move-object v3, v9

    move-object v4, v8

    move-object v9, v5

    move v5, v7

    move v6, v12

    move v7, v11

    move v8, v13

    move-object v11, v9

    move v9, v14

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/zzaca;-><init>(Lcom/google/android/gms/internal/ads/zzabv;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IIIIZ)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-static {v11, v15, v0}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzanz;Lcom/google/android/gms/internal/ads/zzank;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v0

    return-object v0
.end method
