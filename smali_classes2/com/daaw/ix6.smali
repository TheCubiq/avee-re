.class public final Lcom/daaw/ix6;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/ix6;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:J

.field private zzh:F

.field private zzi:D

.field private zzj:Lcom/daaw/db8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ix6;

    invoke-direct {v0}, Lcom/daaw/ix6;-><init>()V

    sput-object v0, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    const-class v1, Lcom/daaw/ix6;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/ix6;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/ix6;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    return-void
.end method

.method public static H()Lcom/daaw/fw6;
    .locals 1

    sget-object v0, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/fw6;

    return-object v0
.end method

.method public static synthetic I()Lcom/daaw/ix6;
    .locals 1

    sget-object v0, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    return-object v0
.end method

.method public static synthetic M(Lcom/daaw/ix6;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    iput-object p1, p0, Lcom/daaw/ix6;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic N(Lcom/daaw/ix6;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    iput-object p1, p0, Lcom/daaw/ix6;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(Lcom/daaw/ix6;)V
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    sget-object v0, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    iget-object v0, v0, Lcom/daaw/ix6;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/ix6;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic P(Lcom/daaw/ix6;J)V
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    iput-wide p1, p0, Lcom/daaw/ix6;->zzg:J

    return-void
.end method

.method public static synthetic Q(Lcom/daaw/ix6;)V
    .locals 2

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ix6;->zzg:J

    return-void
.end method

.method public static synthetic R(Lcom/daaw/ix6;D)V
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    iput-wide p1, p0, Lcom/daaw/ix6;->zzi:D

    return-void
.end method

.method public static synthetic S(Lcom/daaw/ix6;)V
    .locals 2

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/daaw/ix6;->zzd:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/daaw/ix6;->zzi:D

    return-void
.end method

.method public static synthetic T(Lcom/daaw/ix6;Lcom/daaw/ix6;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/daaw/ix6;->b0()V

    iget-object p0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic U(Lcom/daaw/ix6;Ljava/lang/Iterable;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/ix6;->b0()V

    iget-object p0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    invoke-static {p1, p0}, Lcom/daaw/w48;->f(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic V(Lcom/daaw/ix6;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    return-void
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/fw6;

    invoke-direct {p1, p2}, Lcom/daaw/fw6;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/ix6;

    invoke-direct {p1}, Lcom/daaw/ix6;-><init>()V

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

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lcom/daaw/ix6;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/ix6;->zza:Lcom/daaw/ix6;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002\u0004\u1001\u0003\u0005\u1000\u0004\u0006\u001b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()D
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ix6;->zzi:D

    return-wide v0
.end method

.method public final E()F
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzh:F

    return v0
.end method

.method public final F()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final G()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/ix6;->zzg:J

    return-wide v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix6;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix6;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final L()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    return-object v0
.end method

.method public final W()Z
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final X()Z
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Y()Z
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Z()Z
    .locals 2

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final a0()Z
    .locals 1

    iget v0, p0, Lcom/daaw/ix6;->zzd:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ix6;->zzj:Lcom/daaw/db8;

    :cond_0
    return-void
.end method
