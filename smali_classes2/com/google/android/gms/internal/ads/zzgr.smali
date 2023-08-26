.class public final Lcom/google/android/gms/internal/ads/zzgr;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final zzaiy:I

.field private final zzaiz:I

.field private final zzaja:I

.field private final zzajb:Lcom/google/android/gms/internal/ads/zzgq;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzgv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgv;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzajb:Lcom/google/android/gms/internal/ads/zzgq;

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaiz:I

    const/4 p1, 0x6

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaiy:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaja:I

    return-void
.end method

.method private final zzy(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    if-nez v0, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgt;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzgt;-><init>()V

    new-instance v1, Ljava/util/PriorityQueue;

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaiz:I

    new-instance v3, Lcom/google/android/gms/internal/ads/zzgs;

    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/zzgs;-><init>(Lcom/google/android/gms/internal/ads/zzgr;)V

    invoke-direct {v1, v2, v3}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_2

    aget-object v4, p1, v3

    invoke-static {v4, v2}, Lcom/google/android/gms/internal/ads/zzgu;->zzb(Ljava/lang/String;Z)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    if-eqz v5, :cond_1

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaiz:I

    iget v6, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzaiy:I

    invoke-static {v4, v5, v6, v1}, Lcom/google/android/gms/internal/ads/zzgx;->zza([Ljava/lang/String;IILjava/util/PriorityQueue;)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzgy;

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgr;->zzajb:Lcom/google/android/gms/internal/ads/zzgq;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzgy;->zzajf:Ljava/lang/String;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzgq;->zzx(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgt;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string v1, "Error while writing hash to byteStream"

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgt;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final zza(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Ljava/lang/String;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0xa

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzgr;->zzy(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
