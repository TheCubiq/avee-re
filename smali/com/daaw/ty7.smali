.class public final Lcom/daaw/ty7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/ty7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/daaw/qs7;

.field private zzh:I

.field private zzi:Lcom/daaw/us7;

.field private zzj:Lcom/daaw/yq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ty7;

    invoke-direct {v0}, Lcom/daaw/ty7;-><init>()V

    sput-object v0, Lcom/daaw/ty7;->zzb:Lcom/daaw/ty7;

    const-class v1, Lcom/daaw/ty7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/ty7;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ls7;->t()Lcom/daaw/qs7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ty7;->zzg:Lcom/daaw/qs7;

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ty7;->zzi:Lcom/daaw/us7;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/ty7;->zzj:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/ty7;
    .locals 1

    sget-object v0, Lcom/daaw/ty7;->zzb:Lcom/daaw/ty7;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x5

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_3

    if-eq p1, v1, :cond_2

    const/4 p2, 0x0

    if-eq p1, v0, :cond_1

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/daaw/ty7;->zzb:Lcom/daaw/ty7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/sy7;

    invoke-direct {p1, p2}, Lcom/daaw/sy7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/ty7;

    invoke-direct {p1}, Lcom/daaw/ty7;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-class p3, Lcom/daaw/ry7;

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/ty7;->zzb:Lcom/daaw/ty7;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u1004\u0000\u0002\u1008\u0001\u0003\u0016\u0005\u1004\u0002\u0006\u001b\u0007\u100a\u0003"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
