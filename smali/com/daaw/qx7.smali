.class public final Lcom/daaw/qx7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/qx7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/yq7;

.field private zzf:Lcom/daaw/yq7;

.field private zzg:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/qx7;

    invoke-direct {v0}, Lcom/daaw/qx7;-><init>()V

    sput-object v0, Lcom/daaw/qx7;->zzb:Lcom/daaw/qx7;

    const-class v1, Lcom/daaw/qx7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/daaw/qx7;->zzg:B

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/qx7;->zze:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/qx7;->zzf:Lcom/daaw/yq7;

    return-void
.end method

.method public static L()Lcom/daaw/px7;
    .locals 1

    sget-object v0, Lcom/daaw/qx7;->zzb:Lcom/daaw/qx7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/px7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/qx7;
    .locals 1

    sget-object v0, Lcom/daaw/qx7;->zzb:Lcom/daaw/qx7;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/qx7;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/qx7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/qx7;->zzd:I

    iput-object p1, p0, Lcom/daaw/qx7;->zze:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic O(Lcom/daaw/qx7;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/qx7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/qx7;->zzd:I

    iput-object p1, p0, Lcom/daaw/qx7;->zzf:Lcom/daaw/yq7;

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_5

    const/4 p3, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_4

    if-eq p1, v1, :cond_3

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_1

    if-nez p2, :cond_0

    const/4 p3, 0x0

    :cond_0
    iput-byte p3, p0, Lcom/daaw/qx7;->zzg:B

    return-object v2

    :cond_1
    sget-object p1, Lcom/daaw/qx7;->zzb:Lcom/daaw/qx7;

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/px7;

    invoke-direct {p1, v2}, Lcom/daaw/px7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/qx7;

    invoke-direct {p1}, Lcom/daaw/qx7;-><init>()V

    return-object p1

    :cond_4
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v2

    sget-object p2, Lcom/daaw/qx7;->zzb:Lcom/daaw/qx7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u150a\u0000\u0002\u100a\u0001"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/daaw/qx7;->zzg:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
