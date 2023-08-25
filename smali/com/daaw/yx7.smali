.class public final Lcom/daaw/yx7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/yx7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/xx7;

.field private zzf:Lcom/daaw/us7;

.field private zzg:Lcom/daaw/yq7;

.field private zzh:Lcom/daaw/yq7;

.field private zzi:I

.field private zzj:Lcom/daaw/yq7;

.field private zzk:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/yx7;

    invoke-direct {v0}, Lcom/daaw/yx7;-><init>()V

    sput-object v0, Lcom/daaw/yx7;->zzb:Lcom/daaw/yx7;

    const-class v1, Lcom/daaw/yx7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/daaw/yx7;->zzk:B

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/yx7;->zzf:Lcom/daaw/us7;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/yx7;->zzg:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/yx7;->zzh:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/yx7;->zzj:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/yx7;
    .locals 1

    sget-object v0, Lcom/daaw/yx7;->zzb:Lcom/daaw/yx7;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq p1, v4, :cond_4

    if-eq p1, v3, :cond_3

    const/4 v3, 0x0

    if-eq p1, v2, :cond_2

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput-byte p3, p0, Lcom/daaw/yx7;->zzk:B

    return-object v3

    :cond_1
    sget-object p1, Lcom/daaw/yx7;->zzb:Lcom/daaw/yx7;

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/vx7;

    invoke-direct {p1, v3}, Lcom/daaw/vx7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/yx7;

    invoke-direct {p1}, Lcom/daaw/yx7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v4

    const-class p2, Lcom/daaw/qx7;

    aput-object p2, p1, v3

    const-string p2, "zzg"

    aput-object p2, p1, v2

    const-string p2, "zzh"

    aput-object p2, p1, v1

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/yx7;->zzb:Lcom/daaw/yx7;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003\u0006\u100a\u0004"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/daaw/yx7;->zzk:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
