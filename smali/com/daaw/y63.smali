.class public final Lcom/daaw/y63;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/y63;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/us7;

.field private zzf:I

.field private zzg:I

.field private zzh:J

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;

.field private zzk:J

.field private zzl:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/y63;

    invoke-direct {v0}, Lcom/daaw/y63;-><init>()V

    sput-object v0, Lcom/daaw/y63;->zzb:Lcom/daaw/y63;

    const-class v1, Lcom/daaw/y63;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/y63;->zze:Lcom/daaw/us7;

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/y63;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/y63;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static L()Lcom/daaw/u63;
    .locals 1

    sget-object v0, Lcom/daaw/y63;->zzb:Lcom/daaw/y63;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/u63;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/y63;
    .locals 1

    sget-object v0, Lcom/daaw/y63;->zzb:Lcom/daaw/y63;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/y63;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/y63;->zze:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/y63;->zze:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/y63;->zze:Lcom/daaw/us7;

    invoke-static {p1, p0}, Lcom/daaw/hq7;->g(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic O(Lcom/daaw/y63;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput p1, p0, Lcom/daaw/y63;->zzf:I

    return-void
.end method

.method public static synthetic P(Lcom/daaw/y63;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput p1, p0, Lcom/daaw/y63;->zzg:I

    return-void
.end method

.method public static synthetic Q(Lcom/daaw/y63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput-wide p1, p0, Lcom/daaw/y63;->zzh:J

    return-void
.end method

.method public static synthetic R(Lcom/daaw/y63;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput-object p1, p0, Lcom/daaw/y63;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic S(Lcom/daaw/y63;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput-object p1, p0, Lcom/daaw/y63;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/y63;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput-wide p1, p0, Lcom/daaw/y63;->zzk:J

    return-void
.end method

.method public static synthetic U(Lcom/daaw/y63;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/y63;->zzd:I

    or-int/lit8 v0, v0, 0x40

    iput v0, p0, Lcom/daaw/y63;->zzd:I

    iput p1, p0, Lcom/daaw/y63;->zzl:I

    return-void
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
    sget-object p1, Lcom/daaw/y63;->zzb:Lcom/daaw/y63;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/u63;

    invoke-direct {p1, p2}, Lcom/daaw/u63;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/y63;

    invoke-direct {p1}, Lcom/daaw/y63;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-class p2, Lcom/daaw/t63;

    aput-object p2, p1, v2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzl"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/y63;->zzb:Lcom/daaw/y63;

    const-string p3, "\u0001\u0008\u0000\u0001\u0001\u0008\u0008\u0000\u0001\u0000\u0001\u001b\u0002\u1004\u0000\u0003\u1004\u0001\u0004\u1002\u0002\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1002\u0005\u0008\u1004\u0006"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
