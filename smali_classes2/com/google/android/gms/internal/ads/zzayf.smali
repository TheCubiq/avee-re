.class public final Lcom/google/android/gms/internal/ads/zzayf;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/zzayf$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "Lcom/google/android/gms/internal/ads/zzayf;",
        "Lcom/google/android/gms/internal/ads/zzayf$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/zzbdf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbdf<",
            "Lcom/google/android/gms/internal/ads/zzayf;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdmt:Lcom/google/android/gms/internal/ads/zzayf;


# instance fields
.field private zzdlq:I

.field private zzdmr:Ljava/lang/String;

.field private zzdms:Lcom/google/android/gms/internal/ads/zzbbt;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbbt<",
            "Lcom/google/android/gms/internal/ads/zzaxp;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzayf;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzayf;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    const-class v1, Lcom/google/android/gms/internal/ads/zzayf;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdmr:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzayf;->zzadd()Lcom/google/android/gms/internal/ads/zzbbt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzaxp;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbbt;->zzaay()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbbt;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    shl-int/lit8 v1, v1, 0x1

    :goto_0
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbbt;->zzbm(I)Lcom/google/android/gms/internal/ads/zzbbt;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbbt;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    const/4 p1, 0x0

    throw p1
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzayf;Lcom/google/android/gms/internal/ads/zzaxp;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzayf;->zza(Lcom/google/android/gms/internal/ads/zzaxp;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzayf;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzayf;->zzei(Ljava/lang/String;)V

    return-void
.end method

.method public static zzaam()Lcom/google/android/gms/internal/ads/zzayf$zza;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    sget v1, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzdue:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo$zza;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzayf$zza;

    return-object v0
.end method

.method static synthetic zzaan()Lcom/google/android/gms/internal/ads/zzayf;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    return-object v0
.end method

.method private final zzei(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdmr:Ljava/lang/String;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzayg;->zzakf:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzayf;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzayf;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzayf;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbo$zzb;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbbo$zzb;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzayf;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdlq"

    aput-object v0, p1, p2

    const-string p2, "zzdmr"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzdms"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lcom/google/android/gms/internal/ads/zzaxp;

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzayf;->zzdmt:Lcom/google/android/gms/internal/ads/zzayf;

    const-string p3, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u0208\u0002\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzayf;->zza(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzayf$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzayf$zza;-><init>(Lcom/google/android/gms/internal/ads/zzayg;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzayf;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzayf;-><init>()V

    return-object p1

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

.method public final zzaal()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzaxp;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzayf;->zzdms:Lcom/google/android/gms/internal/ads/zzbbt;

    return-object v0
.end method
