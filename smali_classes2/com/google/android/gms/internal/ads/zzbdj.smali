.class final Lcom/google/android/gms/internal/ads/zzbdj;
.super Ljava/lang/Object;


# instance fields
.field private final flags:I

.field private final zzdwh:[Ljava/lang/Object;

.field private final zzdwi:I

.field private final zzdwj:I

.field private final zzdwk:I

.field private final zzdwq:[I

.field private final zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

.field private zzdxg:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final zzdxh:I

.field private final zzdxi:I

.field private final zzdxj:I

.field private final zzdxk:I

.field private final zzdxl:I

.field private final zzdxm:I

.field private zzdxn:I

.field private zzdxo:I

.field private zzdxp:I

.field private zzdxq:I

.field private zzdxr:I

.field private zzdxs:I

.field private zzdxt:I

.field private zzdxu:I

.field private zzdxv:I

.field private zzdxw:I

.field private zzdxx:I

.field private zzdxy:I

.field private zzdxz:I

.field private zzdya:I

.field private zzdyb:Ljava/lang/reflect/Field;

.field private zzdyc:Ljava/lang/Object;

.field private zzdyd:Ljava/lang/Object;

.field private zzdye:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxp:I

    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxq:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxr:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxs:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxt:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxu:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxv:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxg:Ljava/lang/Class;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzbdk;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->flags:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxh:I

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwi:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwj:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxk:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxl:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwk:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxm:I

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwq:[I

    return-void

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxi:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxj:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwi:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwj:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxl:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwk:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxk:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxm:I

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-array p2, p1, [I

    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwq:[I

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxi:I

    shl-int/lit8 p1, p1, 0x1

    iget p2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxj:I

    add-int/2addr p1, p2

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxn:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->flags:I

    return p0
.end method

.method private static zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/reflect/Field;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x28

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/2addr v2, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Field "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " for "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " not found. Known fields are "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method private final zzaey()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxn:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxn:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method private final zzafa()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->flags:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwi:I

    return p0
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwj:I

    return p0
.end method

.method static synthetic zzd(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxh:I

    return p0
.end method

.method static synthetic zze(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxk:I

    return p0
.end method

.method static synthetic zzf(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxm:I

    return p0
.end method

.method static synthetic zzg(Lcom/google/android/gms/internal/ads/zzbdj;)[I
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwq:[I

    return-object p0
.end method

.method static synthetic zzh(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxl:I

    return p0
.end method

.method static synthetic zzi(Lcom/google/android/gms/internal/ads/zzbdj;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwk:I

    return p0
.end method


# virtual methods
.method final next()Z
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdk;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxx:I

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxp:I

    if-ge v0, v2, :cond_1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxp:I

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxq:I

    if-le v0, v2, :cond_2

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxq:I

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdta:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    const/4 v3, 0x1

    if-ne v0, v2, :cond_3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxr:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxr:I

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdru:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-lt v0, v2, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdsz:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-gt v0, v2, :cond_4

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxs:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxs:I

    :cond_4
    :goto_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxv:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxv:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxp:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    invoke-static {v2, v4, v0}, Lcom/google/android/gms/internal/ads/zzbdo;->zze(III)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxu:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxp:I

    sub-int/2addr v0, v2

    goto :goto_1

    :cond_5
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxt:I

    add-int/2addr v0, v3

    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxt:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxx:I

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_2

    :cond_6
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwq:[I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxo:I

    add-int/lit8 v4, v2, 0x1

    iput v4, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxo:I

    iget v4, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    aput v4, v0, v2

    :cond_7
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyc:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyd:Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdye:Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzafb()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxz:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbj;->zzdrl:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-eq v0, v1, :cond_9

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbj;->zzdrt:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_8

    goto :goto_4

    :cond_8
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbj;->zzdro:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v1

    add-int/lit8 v1, v1, 0x33

    if-ne v0, v1, :cond_12

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzafa()Z

    move-result v0

    if-eqz v0, :cond_12

    :goto_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzaey()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyd:Ljava/lang/Object;

    goto/16 :goto_9

    :cond_9
    :goto_4
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzaey()Ljava/lang/Object;

    move-result-object v0

    :goto_5
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyc:Ljava/lang/Object;

    goto/16 :goto_9

    :cond_a
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxg:Ljava/lang/Class;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzaey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyb:Ljava/lang/reflect/Field;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzaff()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxf:Lcom/google/android/gms/internal/ads/zzbdk;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdk;->next()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdya:I

    :cond_b
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdrl:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-eq v0, v2, :cond_11

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdrt:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-ne v0, v2, :cond_c

    goto :goto_8

    :cond_c
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdsd:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-eq v0, v2, :cond_9

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdsz:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-ne v0, v2, :cond_d

    goto :goto_4

    :cond_d
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdro:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-eq v0, v2, :cond_10

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdsg:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-eq v0, v2, :cond_10

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdsu:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-ne v0, v2, :cond_e

    goto :goto_6

    :cond_e
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zzbbj;->zzdta:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v2

    if-ne v0, v2, :cond_12

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzaey()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdye:Ljava/lang/Object;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxx:I

    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_f

    const/4 v1, 0x1

    :cond_f
    if-eqz v1, :cond_12

    goto :goto_7

    :cond_10
    :goto_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzafa()Z

    move-result v0

    if-eqz v0, :cond_12

    :goto_7
    goto/16 :goto_3

    :cond_11
    :goto_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyb:Ljava/lang/reflect/Field;

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    goto/16 :goto_5

    :cond_12
    :goto_9
    return v3
.end method

.method final zzaci()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxw:I

    return v0
.end method

.method final zzaez()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    return v0
.end method

.method final zzafb()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbj;->zzdta:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzafc()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxz:I

    shl-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxg:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method final zzafd()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxz:I

    shl-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxg:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method final zzafe()Ljava/lang/reflect/Field;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyb:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method final zzaff()Z
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbdj;->zzafa()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxy:I

    sget-object v1, Lcom/google/android/gms/internal/ads/zzbbj;->zzdrt:Lcom/google/android/gms/internal/ads/zzbbj;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbbj;->id()I

    move-result v1

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzafg()Ljava/lang/reflect/Field;
    .locals 3

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxi:I

    shl-int/lit8 v0, v0, 0x1

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdya:I

    div-int/lit8 v1, v1, 0x20

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aget-object v1, v1, v0

    instance-of v2, v1, Ljava/lang/reflect/Field;

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/reflect/Field;

    return-object v1

    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxg:Ljava/lang/Class;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/ads/zzbdj;->zza(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdwh:[Ljava/lang/Object;

    aput-object v1, v2, v0

    return-object v1
.end method

.method final zzafh()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdya:I

    rem-int/lit8 v0, v0, 0x20

    return v0
.end method

.method final zzafi()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxx:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzafj()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdxx:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method final zzafk()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyc:Ljava/lang/Object;

    return-object v0
.end method

.method final zzafl()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdyd:Ljava/lang/Object;

    return-object v0
.end method

.method final zzafm()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbdj;->zzdye:Ljava/lang/Object;

    return-object v0
.end method
