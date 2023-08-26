.class public final Lcom/google/android/gms/internal/ads/zzalt;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field private static zzctf:Lcom/google/android/gms/internal/ads/zzv;

.field private static final zzctg:Ljava/lang/Object;

.field private static final zzcth:Lcom/google/android/gms/internal/ads/zzalz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzalz<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzalt;->zzctg:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzalu;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzalu;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzalt;->zzcth:Lcom/google/android/gms/internal/ads/zzalz;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzalt;->zzbb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzv;

    return-void
.end method

.method private static zzbb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzv;
    .locals 4

    sget-object v0, Lcom/google/android/gms/internal/ads/zzalt;->zzctg:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzalt;->zzctf:Lcom/google/android/gms/internal/ads/zzv;

    if-nez v1, :cond_1

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zznk;->initialize(Landroid/content/Context;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zznk;->zzbdv:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzaln;->zzba(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzv;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaj;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzas;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzas;-><init>()V

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/zzaj;-><init>(Lcom/google/android/gms/internal/ads/zzai;)V

    new-instance v2, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v3, "volley"

    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance p0, Lcom/google/android/gms/internal/ads/zzv;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzam;

    invoke-direct {v3, v2}, Lcom/google/android/gms/internal/ads/zzam;-><init>(Ljava/io/File;)V

    invoke-direct {p0, v3, v1}, Lcom/google/android/gms/internal/ads/zzv;-><init>(Lcom/google/android/gms/internal/ads/zzb;Lcom/google/android/gms/internal/ads/zzm;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzv;->start()V

    :goto_0
    sput-object p0, Lcom/google/android/gms/internal/ads/zzalt;->zzctf:Lcom/google/android/gms/internal/ads/zzv;

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzalt;->zzctf:Lcom/google/android/gms/internal/ads/zzv;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method


# virtual methods
.method public final zza(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    new-instance v10, Lcom/google/android/gms/internal/ads/zzama;

    const/4 v1, 0x0

    invoke-direct {v10, v1}, Lcom/google/android/gms/internal/ads/zzama;-><init>(Lcom/google/android/gms/internal/ads/zzalu;)V

    new-instance v6, Lcom/google/android/gms/internal/ads/zzalx;

    move-object v11, p0

    invoke-direct {v6, p0, v0, v10}, Lcom/google/android/gms/internal/ads/zzalx;-><init>(Lcom/google/android/gms/internal/ads/zzalt;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzama;)V

    new-instance v12, Lcom/google/android/gms/internal/ads/zzamy;

    invoke-direct {v12, v1}, Lcom/google/android/gms/internal/ads/zzamy;-><init>(Ljava/lang/String;)V

    new-instance v13, Lcom/google/android/gms/internal/ads/zzaly;

    move-object v1, v13

    move-object v2, p0

    move v3, p1

    move-object/from16 v4, p2

    move-object v5, v10

    move-object/from16 v7, p4

    move-object/from16 v8, p3

    move-object v9, v12

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/internal/ads/zzaly;-><init>(Lcom/google/android/gms/internal/ads/zzalt;ILjava/lang/String;Lcom/google/android/gms/internal/ads/zzz;Lcom/google/android/gms/internal/ads/zzy;[BLjava/util/Map;Lcom/google/android/gms/internal/ads/zzamy;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzamy;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "GET"

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzr;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzr;->zzg()[B

    move-result-object v3

    invoke-virtual {v12, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzamy;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zza; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzalt;->zzctf:Lcom/google/android/gms/internal/ads/zzv;

    invoke-virtual {v0, v13}, Lcom/google/android/gms/internal/ads/zzv;->zze(Lcom/google/android/gms/internal/ads/zzr;)Lcom/google/android/gms/internal/ads/zzr;

    return-object v10
.end method

.method public final zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzalz;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzalz<",
            "TT;>;)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzalt;->zzctf:Lcom/google/android/gms/internal/ads/zzv;

    new-instance v2, Lcom/google/android/gms/internal/ads/zzamb;

    invoke-direct {v2, p1, v0}, Lcom/google/android/gms/internal/ads/zzamb;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaoj;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzv;->zze(Lcom/google/android/gms/internal/ads/zzr;)Lcom/google/android/gms/internal/ads/zzr;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzalw;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzalw;-><init>(Lcom/google/android/gms/internal/ads/zzalt;Lcom/google/android/gms/internal/ads/zzalz;)V

    sget-object v1, Lcom/google/android/gms/internal/ads/zzaki;->zzcrj:Lcom/google/android/gms/internal/ads/zzaod;

    invoke-static {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzanz;Lcom/google/android/gms/internal/ads/zzank;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    const-class v0, Ljava/lang/Throwable;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzalv;

    invoke-direct {v1, p0, p2}, Lcom/google/android/gms/internal/ads/zzalv;-><init>(Lcom/google/android/gms/internal/ads/zzalt;Lcom/google/android/gms/internal/ads/zzalz;)V

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaoe;->zzcvz:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1, p2}, Lcom/google/android/gms/internal/ads/zzano;->zza(Lcom/google/android/gms/internal/ads/zzanz;Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzanj;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method

.method public final zzc(Ljava/lang/String;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/zzanz;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzalt;->zza(ILjava/lang/String;Ljava/util/Map;[B)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object p1

    return-object p1
.end method
