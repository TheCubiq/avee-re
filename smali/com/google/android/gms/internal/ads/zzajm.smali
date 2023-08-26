.class public final Lcom/google/android/gms/internal/ads/zzajm;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzakh;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzahz:Lcom/google/android/gms/internal/ads/zzgf;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final zzcpl:Lcom/google/android/gms/internal/ads/zzajt;

.field private final zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

.field private zzcpn:Lcom/google/android/gms/internal/ads/zznn;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzcpo:Lcom/google/android/gms/internal/ads/zzgk;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzcpp:Ljava/lang/Boolean;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private zzcpq:Ljava/lang/String;

.field private final zzcpr:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final zzcps:Lcom/google/android/gms/internal/ads/zzajp;

.field private final zzcpt:Ljava/lang/Object;

.field private zzcpu:Lcom/google/android/gms/internal/ads/zzanz;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private zzvy:Lcom/google/android/gms/internal/ads/zzes;

.field private zzyf:Lcom/google/android/gms/internal/ads/zzang;

.field private zzzv:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzajt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzajt;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpl:Lcom/google/android/gms/internal/ads/zzajt;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzakd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzakd;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzzv:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpn:Lcom/google/android/gms/internal/ads/zznn;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpo:Lcom/google/android/gms/internal/ads/zzgk;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzahz:Lcom/google/android/gms/internal/ads/zzgf;

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpp:Ljava/lang/Boolean;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpr:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzajp;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzajp;-><init>(Lcom/google/android/gms/internal/ads/zzajo;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcps:Lcom/google/android/gms/internal/ads/zzajp;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpt:Ljava/lang/Object;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzajm;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private final zza(Landroid/content/Context;ZZ)Lcom/google/android/gms/internal/ads/zzgk;
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzawk:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastIceCreamSandwich()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzaws:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzawq:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    return-object v1

    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p3

    if-eqz p3, :cond_7

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzahz:Lcom/google/android/gms/internal/ads/zzgf;

    if-nez p3, :cond_5

    new-instance p3, Lcom/google/android/gms/internal/ads/zzgf;

    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzgf;-><init>()V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzahz:Lcom/google/android/gms/internal/ads/zzgf;

    :cond_5
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpo:Lcom/google/android/gms/internal/ads/zzgk;

    if-nez p3, :cond_6

    new-instance p3, Lcom/google/android/gms/internal/ads/zzgk;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzahz:Lcom/google/android/gms/internal/ads/zzgf;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/zzadb;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzadf;

    move-result-object p1

    invoke-direct {p3, v0, p1}, Lcom/google/android/gms/internal/ads/zzgk;-><init>(Lcom/google/android/gms/internal/ads/zzgf;Lcom/google/android/gms/internal/ads/zzadf;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpo:Lcom/google/android/gms/internal/ads/zzgk;

    :cond_6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpo:Lcom/google/android/gms/internal/ads/zzgk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgk;->zzgw()V

    const-string p1, "start fetching content..."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzdj(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpo:Lcom/google/android/gms/internal/ads/zzgk;

    monitor-exit p2

    return-object p1

    :cond_7
    :goto_0
    monitor-exit p2

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static zzag(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/google/android/gms/common/wrappers/Wrappers;->packageManager(Landroid/content/Context;)Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const/16 v2, 0x1000

    invoke-virtual {v1, p0, v2}, Lcom/google/android/gms/common/wrappers/PackageManagerWrapper;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissionsFlags:[I

    aget v2, v2, v1

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    :goto_1
    return-object v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzajm;)Lcom/google/android/gms/internal/ads/zzang;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    return-object p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzajm;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzajm;)Lcom/google/android/gms/internal/ads/zznn;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpn:Lcom/google/android/gms/internal/ads/zznn;

    return-object p0
.end method


# virtual methods
.method public final getApplicationContext()Landroid/content/Context;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzang;->zzcvg:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->PREFER_REMOTE:Lcom/google/android/gms/dynamite/DynamiteModule$VersionPolicy;

    const-string v3, "com.google.android.gms.ads.dynamite"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->load(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$VersionPolicy;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/dynamite/DynamiteModule;->getModuleContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$LoadingException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Cannot load resource from dynamite apk or local jar"

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final zza(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpp:Ljava/lang/Boolean;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zza(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzadb;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzadf;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzadf;->zza(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public final zzaa(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcps:Lcom/google/android/gms/internal/ads/zzajp;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzajp;->zzaa(Z)V

    return-void
.end method

.method public final zzaf(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzgk;
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzakd;->zzqu()Z

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzakd;->zzqw()Z

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Landroid/content/Context;ZZ)Lcom/google/android/gms/internal/ads/zzgk;

    move-result-object p1

    return-object p1
.end method

.method public final zzb(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzadb;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzadf;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zznk;->zzaul:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-interface {v0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzadf;->zza(Ljava/lang/Throwable;Ljava/lang/String;F)V

    return-void
.end method

.method public final zzd(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzzv:Z

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzen()Lcom/google/android/gms/internal/ads/zzgg;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzep()Lcom/google/android/gms/internal/ads/zzajv;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzgg;->zza(Lcom/google/android/gms/internal/ads/zzgj;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzakd;->initialize(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/ads/zzakd;->zza(Lcom/google/android/gms/internal/ads/zzakh;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzadb;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)Lcom/google/android/gms/internal/ads/zzadf;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    move-result-object v1

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/zzang;->zzcw:Ljava/lang/String;

    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzakk;->zzm(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpq:Ljava/lang/String;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzes;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzyf:Lcom/google/android/gms/internal/ads/zzang;

    invoke-direct {p2, p1, v1}, Lcom/google/android/gms/internal/ads/zzes;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzang;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzvy:Lcom/google/android/gms/internal/ads/zzes;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzet()Lcom/google/android/gms/internal/ads/zznp;

    sget-object p1, Lcom/google/android/gms/internal/ads/zznk;->zzawh:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "CsiReporterFactory: CSI is not enabled. No CSI reporter created."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zznn;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zznn;-><init>()V

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpn:Lcom/google/android/gms/internal/ads/zznn;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzajo;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/ads/zzajo;-><init>(Lcom/google/android/gms/internal/ads/zzajm;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzajx;->zznt()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzanz;

    const-string p2, "AppState.registerCsiReporter"

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/zzanm;->zza(Lcom/google/android/gms/internal/ads/zzanz;Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzzv:Z

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzajm;->zzqi()Lcom/google/android/gms/internal/ads/zzanz;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzd(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "content_url_opted_out"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "content_vertical_opted_out"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    invoke-direct {p0, v2, v0, p1}, Lcom/google/android/gms/internal/ads/zzajm;->zza(Landroid/content/Context;ZZ)Lcom/google/android/gms/internal/ads/zzgk;

    :cond_0
    return-void
.end method

.method public final zzpx()Lcom/google/android/gms/internal/ads/zzajt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpl:Lcom/google/android/gms/internal/ads/zzajt;

    return-object v0
.end method

.method public final zzpy()Lcom/google/android/gms/internal/ads/zznn;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpn:Lcom/google/android/gms/internal/ads/zznn;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzpz()Ljava/lang/Boolean;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpp:Ljava/lang/Boolean;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzqa()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcps:Lcom/google/android/gms/internal/ads/zzajp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajp;->zzqa()Z

    move-result v0

    return v0
.end method

.method public final zzqb()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcps:Lcom/google/android/gms/internal/ads/zzajp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajp;->zzqb()Z

    move-result v0

    return v0
.end method

.method public final zzqc()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcps:Lcom/google/android/gms/internal/ads/zzajp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajp;->zzqc()V

    return-void
.end method

.method public final zzqd()Lcom/google/android/gms/internal/ads/zzes;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzvy:Lcom/google/android/gms/internal/ads/zzes;

    return-object v0
.end method

.method public final zzqe()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpr:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    return-void
.end method

.method public final zzqf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpr:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    return-void
.end method

.method public final zzqg()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpr:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    return v0
.end method

.method public final zzqh()Lcom/google/android/gms/internal/ads/zzakd;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpm:Lcom/google/android/gms/internal/ads/zzakd;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzqi()Lcom/google/android/gms/internal/ads/zzanz;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ads/zzanz<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastJellyBean()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzbau:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpt:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpu:Lcom/google/android/gms/internal/ads/zzanz;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpu:Lcom/google/android/gms/internal/ads/zzanz;

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzajn;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzajn;-><init>(Lcom/google/android/gms/internal/ads/zzajm;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzaki;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzajm;->zzcpu:Lcom/google/android/gms/internal/ads/zzanz;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_2
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object v0

    return-object v0
.end method

.method final synthetic zzqj()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzajm;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzag(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
