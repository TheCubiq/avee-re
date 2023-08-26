.class public final Lcom/google/android/gms/internal/ads/zzaxx;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/zzaxx$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "Lcom/google/android/gms/internal/ads/zzaxx;",
        "Lcom/google/android/gms/internal/ads/zzaxx$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/zzbdf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbdf<",
            "Lcom/google/android/gms/internal/ads/zzaxx;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdme:Lcom/google/android/gms/internal/ads/zzaxx;


# instance fields
.field private zzdmd:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaxx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaxx;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    const-class v1, Lcom/google/android/gms/internal/ads/zzaxx;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdmd:Ljava/lang/String;

    return-void
.end method

.method public static zzaac()Lcom/google/android/gms/internal/ads/zzaxx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    return-object v0
.end method

.method static synthetic zzaad()Lcom/google/android/gms/internal/ads/zzaxx;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    return-object v0
.end method

.method public static zzak(Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzaxx;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzbbu;
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Lcom/google/android/gms/internal/ads/zzbbo;Lcom/google/android/gms/internal/ads/zzbah;)Lcom/google/android/gms/internal/ads/zzbbo;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzaxx;

    return-object p0
.end method


# virtual methods
.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaxy;->zzakf:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxx;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzaxx;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxx;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbo$zzb;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbbo$zzb;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzaxx;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    return-object p1

    :pswitch_4
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zzdmd"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaxx;->zzdme:Lcom/google/android/gms/internal/ads/zzaxx;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0000\u0000\u0001\u0208"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzaxx;->zza(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaxx$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaxx$zza;-><init>(Lcom/google/android/gms/internal/ads/zzaxy;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaxx;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaxx;-><init>()V

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

.method public final zzaab()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaxx;->zzdmd:Ljava/lang/String;

    return-object v0
.end method
