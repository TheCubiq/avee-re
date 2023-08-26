.class public final Lcom/google/android/gms/internal/ads/zzavy;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/zzavy$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "Lcom/google/android/gms/internal/ads/zzavy;",
        "Lcom/google/android/gms/internal/ads/zzavy$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/zzbdf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbdf<",
            "Lcom/google/android/gms/internal/ads/zzavy;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdiw:Lcom/google/android/gms/internal/ads/zzavy;


# instance fields
.field private zzdih:I

.field private zzdip:Lcom/google/android/gms/internal/ads/zzbah;

.field private zzdiv:Lcom/google/android/gms/internal/ads/zzawc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzavy;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzavy;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    const-class v1, Lcom/google/android/gms/internal/ads/zzavy;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdip:Lcom/google/android/gms/internal/ads/zzbah;

    return-void
.end method

.method private final setVersion(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdih:I

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzavy;I)V
    .locals 0

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzavy;->setVersion(I)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzavy;Lcom/google/android/gms/internal/ads/zzawc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzavy;->zza(Lcom/google/android/gms/internal/ads/zzawc;)V

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzavy;Lcom/google/android/gms/internal/ads/zzbah;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzavy;->zzk(Lcom/google/android/gms/internal/ads/zzbah;)V

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzawc;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiv:Lcom/google/android/gms/internal/ads/zzawc;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzbah;)V
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdip:Lcom/google/android/gms/internal/ads/zzbah;

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public static zzo(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzavy;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzbbu;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Lcom/google/android/gms/internal/ads/zzbbo;Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzavy;

    return-object p0
.end method

.method public static zzxf()Lcom/google/android/gms/internal/ads/zzavy$zza;
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    sget v1, Lcom/google/android/gms/internal/ads/zzbbo$zze;->zzdue:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzbbo$zza;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzavy$zza;

    return-object v0
.end method

.method static synthetic zzxg()Lcom/google/android/gms/internal/ads/zzavy;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    return-object v0
.end method


# virtual methods
.method public final getVersion()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdih:I

    return v0
.end method

.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzavz;->zzakf:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzavy;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzavy;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzavy;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbo$zzb;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbbo$zzb;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzavy;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdih"

    aput-object v0, p1, p2

    const-string p2, "zzdiv"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzdip"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzavy;->zzdiw:Lcom/google/android/gms/internal/ads/zzavy;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzavy;->zza(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzavy$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzavy$zza;-><init>(Lcom/google/android/gms/internal/ads/zzavz;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzavy;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzavy;-><init>()V

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

.method public final zzwv()Lcom/google/android/gms/internal/ads/zzbah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdip:Lcom/google/android/gms/internal/ads/zzbah;

    return-object v0
.end method

.method public final zzxe()Lcom/google/android/gms/internal/ads/zzawc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzavy;->zzdiv:Lcom/google/android/gms/internal/ads/zzawc;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzawc;->zzxi()Lcom/google/android/gms/internal/ads/zzawc;

    move-result-object v0

    :cond_0
    return-object v0
.end method
