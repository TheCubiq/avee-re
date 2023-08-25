.class public final Lcom/daaw/xh2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/xh2;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:J

.field private zzk:J

.field private zzl:Ljava/lang/String;

.field private zzm:J

.field private zzn:Ljava/lang/String;

.field private zzo:Ljava/lang/String;

.field private zzp:Lcom/daaw/us7;

.field private zzq:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xh2;

    invoke-direct {v0}, Lcom/daaw/xh2;-><init>()V

    sput-object v0, Lcom/daaw/xh2;->zzb:Lcom/daaw/xh2;

    const-class v1, Lcom/daaw/xh2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/xh2;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzl:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzn:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/xh2;->zzo:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xh2;->zzp:Lcom/daaw/us7;

    return-void
.end method

.method public static L()Lcom/daaw/oh2;
    .locals 1

    sget-object v0, Lcom/daaw/xh2;->zzb:Lcom/daaw/xh2;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/oh2;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/xh2;
    .locals 1

    sget-object v0, Lcom/daaw/xh2;->zzb:Lcom/daaw/xh2;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/xh2;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-wide p1, p0, Lcom/daaw/xh2;->zzf:J

    return-void
.end method

.method public static synthetic O(Lcom/daaw/xh2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-object p1, p0, Lcom/daaw/xh2;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic P(Lcom/daaw/xh2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-object p1, p0, Lcom/daaw/xh2;->zzh:Ljava/lang/String;

    return-void
.end method

.method public static synthetic Q(Lcom/daaw/xh2;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-object p1, p0, Lcom/daaw/xh2;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/xh2;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit16 v0, v0, 0x400

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-object p1, p0, Lcom/daaw/xh2;->zzo:Ljava/lang/String;

    return-void
.end method

.method public static synthetic S(Lcom/daaw/xh2;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/xh2;->zzd:I

    iput-object p1, p0, Lcom/daaw/xh2;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/xh2;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/xh2;->zzq:I

    iget p1, p0, Lcom/daaw/xh2;->zzd:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Lcom/daaw/xh2;->zzd:I

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
    sget-object p1, Lcom/daaw/xh2;->zzb:Lcom/daaw/xh2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/oh2;

    invoke-direct {p1, p2}, Lcom/daaw/oh2;-><init>(Lcom/daaw/nh2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/xh2;

    invoke-direct {p1}, Lcom/daaw/xh2;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x10

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

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-class p3, Lcom/daaw/qh2;

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzq"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    sget-object p3, Lcom/daaw/wh2;->a:Lcom/daaw/ps7;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/xh2;->zzb:Lcom/daaw/xh2;

    const-string p3, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1002\u0005\u0007\u1002\u0006\u0008\u1008\u0007\t\u1002\u0008\n\u1008\t\u000b\u1008\n\u000c\u001b\r\u100c\u000b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
