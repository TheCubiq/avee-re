.class public final Lcom/google/android/gms/internal/ads/zzaxp;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/zzaxp$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "Lcom/google/android/gms/internal/ads/zzaxp;",
        "Lcom/google/android/gms/internal/ads/zzaxp$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/zzbdf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbdf<",
            "Lcom/google/android/gms/internal/ads/zzaxp;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;


# instance fields
.field private zzdks:Ljava/lang/String;

.field private zzdll:Ljava/lang/String;

.field private zzdlm:I

.field private zzdln:Z

.field private zzdlo:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaxp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaxp;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    const-class v1, Lcom/google/android/gms/internal/ads/zzaxp;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdll:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdks:Ljava/lang/String;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlo:Ljava/lang/String;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzaxp;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zzay(I)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzaxp;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zzec(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzaxp;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zzan(Z)V

    return-void
.end method

.method private final zzan(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdln:Z

    return-void
.end method

.method private final zzay(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlm:I

    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzaxp;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zzea(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic zzc(Lcom/google/android/gms/internal/ads/zzaxp;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zzed(Ljava/lang/String;)V

    return-void
.end method

.method private final zzea(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdks:Ljava/lang/String;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final zzec(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdll:Ljava/lang/String;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final zzed(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlo:Ljava/lang/String;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public static zzzi()Lcom/google/android/gms/internal/ads/zzaxp$zza;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    sget v1, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzdue:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo$zza;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzaxp$zza;

    return-object v0
.end method

.method static synthetic zzzj()Lcom/google/android/gms/internal/ads/zzaxp;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    return-object v0
.end method


# virtual methods
.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaxq;->zzakf:[I

    const/4 p3, 0x1

    sub-int/2addr p1, p3

    aget p1, p2, p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p2

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxp;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzaxp;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxp;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbo$zzb;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbbo$zzb;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzaxp;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdll"

    aput-object v0, p1, p2

    const-string p2, "zzdks"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzdlm"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "zzdln"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "zzdlo"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlp:Lcom/google/android/gms/internal/ads/zzaxp;

    const-string p3, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzaxp;->zza(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaxp$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaxp$zza;-><init>(Lcom/google/android/gms/internal/ads/zzaxq;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaxp;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaxp;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzyw()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdks:Ljava/lang/String;

    return-object v0
.end method

.method public final zzze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdll:Ljava/lang/String;

    return-object v0
.end method

.method public final zzzf()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlm:I

    return v0
.end method

.method public final zzzg()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdln:Z

    return v0
.end method

.method public final zzzh()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxp;->zzdlo:Ljava/lang/String;

    return-object v0
.end method
