.class public final Lcom/daaw/ly7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/ly7;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:J

.field private zzg:Z

.field private zzh:I

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ly7;

    invoke-direct {v0}, Lcom/daaw/ly7;-><init>()V

    sput-object v0, Lcom/daaw/ly7;->zzb:Lcom/daaw/ly7;

    const-class v1, Lcom/daaw/ly7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/ly7;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/ly7;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/ly7;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static L()Lcom/daaw/ky7;
    .locals 1

    sget-object v0, Lcom/daaw/ly7;->zzb:Lcom/daaw/ly7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/ky7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/ly7;
    .locals 1

    sget-object v0, Lcom/daaw/ly7;->zzb:Lcom/daaw/ly7;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/ly7;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lcom/daaw/ly7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ly7;->zzd:I

    iput-object p1, p0, Lcom/daaw/ly7;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(Lcom/daaw/ly7;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/ly7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/ly7;->zzd:I

    iput-wide p1, p0, Lcom/daaw/ly7;->zzf:J

    return-void
.end method

.method public static synthetic P(Lcom/daaw/ly7;Z)V
    .locals 1

    iget v0, p0, Lcom/daaw/ly7;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/ly7;->zzd:I

    iput-boolean p1, p0, Lcom/daaw/ly7;->zzg:Z

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
    sget-object p1, Lcom/daaw/ly7;->zzb:Lcom/daaw/ly7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ky7;

    invoke-direct {p1, p2}, Lcom/daaw/ky7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/ly7;

    invoke-direct {p1}, Lcom/daaw/ly7;-><init>()V

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

    sget-object p2, Lcom/daaw/my7;->a:Lcom/daaw/ps7;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/ly7;->zzb:Lcom/daaw/ly7;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1007\u0002\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1008\u0005"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
