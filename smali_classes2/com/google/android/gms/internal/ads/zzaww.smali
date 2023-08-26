.class public final Lcom/google/android/gms/internal/ads/zzaww;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ads/zzaww$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "Lcom/google/android/gms/internal/ads/zzaww;",
        "Lcom/google/android/gms/internal/ads/zzaww$zza;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# static fields
.field private static volatile zzakh:Lcom/google/android/gms/internal/ads/zzbdf;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbdf<",
            "Lcom/google/android/gms/internal/ads/zzaww;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzdjx:Lcom/google/android/gms/internal/ads/zzaww;


# instance fields
.field private zzdju:I

.field private zzdjv:I

.field private zzdjw:Lcom/google/android/gms/internal/ads/zzbah;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzaww;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaww;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    const-class v1, Lcom/google/android/gms/internal/ads/zzaww;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzbbo;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzbbo;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzbah;->zzdpq:Lcom/google/android/gms/internal/ads/zzbah;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjw:Lcom/google/android/gms/internal/ads/zzbah;

    return-void
.end method

.method public static zzyk()Lcom/google/android/gms/internal/ads/zzaww;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    return-object v0
.end method

.method static synthetic zzyl()Lcom/google/android/gms/internal/ads/zzaww;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    return-object v0
.end method


# virtual methods
.method protected final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzawx;->zzakf:[I

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaww;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_1

    const-class p2, Lcom/google/android/gms/internal/ads/zzaww;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaww;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzbbo$zzb;

    sget-object p3, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzbbo$zzb;-><init>(Lcom/google/android/gms/internal/ads/zzbbo;)V

    sput-object p1, Lcom/google/android/gms/internal/ads/zzaww;->zzakh:Lcom/google/android/gms/internal/ads/zzbdf;

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
    sget-object p1, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string v0, "zzdju"

    aput-object v0, p1, p2

    const-string p2, "zzdjv"

    aput-object p2, p1, p3

    const/4 p2, 0x2

    const-string p3, "zzdjw"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/ads/zzaww;->zzdjx:Lcom/google/android/gms/internal/ads/zzaww;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u000b\u000b\u000c\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u000b\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/ads/zzaww;->zza(Lcom/google/android/gms/internal/ads/zzbcu;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaww$zza;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaww$zza;-><init>(Lcom/google/android/gms/internal/ads/zzawx;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaww;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaww;-><init>()V

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

.method public final zzyh()Lcom/google/android/gms/internal/ads/zzawy;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaww;->zzdju:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzawy;->zzat(I)Lcom/google/android/gms/internal/ads/zzawy;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzawy;->zzdkd:Lcom/google/android/gms/internal/ads/zzawy;

    :cond_0
    return-object v0
.end method

.method public final zzyi()Lcom/google/android/gms/internal/ads/zzaxa;
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjv:I

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaxa;->zzau(I)Lcom/google/android/gms/internal/ads/zzaxa;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zzaxa;->zzdkk:Lcom/google/android/gms/internal/ads/zzaxa;

    :cond_0
    return-object v0
.end method

.method public final zzyj()Lcom/google/android/gms/internal/ads/zzbah;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaww;->zzdjw:Lcom/google/android/gms/internal/ads/zzbah;

    return-object v0
.end method
