.class public final Lcom/daaw/wd6;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/wd6;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:Lcom/daaw/db8;

.field private zzi:Lcom/daaw/db8;

.field private zzj:Lcom/daaw/db8;

.field private zzk:Ljava/lang/String;

.field private zzl:Z

.field private zzm:Lcom/daaw/db8;

.field private zzn:Lcom/daaw/db8;

.field private zzo:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/wd6;

    invoke-direct {v0}, Lcom/daaw/wd6;-><init>()V

    sput-object v0, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    const-class v1, Lcom/daaw/wd6;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/wd6;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/wd6;->zzh:Lcom/daaw/db8;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/wd6;->zzj:Lcom/daaw/db8;

    iput-object v0, p0, Lcom/daaw/wd6;->zzk:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/wd6;->zzm:Lcom/daaw/db8;

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/wd6;->zzn:Lcom/daaw/db8;

    iput-object v0, p0, Lcom/daaw/wd6;->zzo:Ljava/lang/String;

    return-void
.end method

.method public static H()Lcom/daaw/tc6;
    .locals 1

    sget-object v0, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/tc6;

    return-object v0
.end method

.method public static synthetic I()Lcom/daaw/wd6;
    .locals 1

    sget-object v0, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    return-object v0
.end method

.method public static J()Lcom/daaw/wd6;
    .locals 1

    sget-object v0, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    return-object v0
.end method

.method public static synthetic Q(Lcom/daaw/wd6;ILcom/daaw/qb6;)V
    .locals 2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    invoke-interface {p0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/wd6;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/wd6;->zzj:Lcom/daaw/db8;

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
    sget-object p1, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/tc6;

    invoke-direct {p1, p2}, Lcom/daaw/tc6;-><init>(Lcom/daaw/t66;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/wd6;

    invoke-direct {p1}, Lcom/daaw/wd6;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0x11

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

    const-class p2, Lcom/daaw/ii6;

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzi"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lcom/daaw/qb6;

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "zzj"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-class p3, Lcom/daaw/rn5;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzk"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzl"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-class p3, Lcom/daaw/rm7;

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xf

    const-class p3, Lcom/daaw/k96;

    aput-object p3, p1, p2

    const/16 p2, 0x10

    const-string p3, "zzo"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/wd6;->zza:Lcom/daaw/wd6;

    const-string p3, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001\u1002\u0000\u0002\u1008\u0001\u0003\u1004\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u1008\u0003\u0008\u1007\u0004\t\u001b\n\u001b\u000b\u1008\u0005"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzm:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final F()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/wd6;->zze:J

    return-wide v0
.end method

.method public final G(I)Lcom/daaw/qb6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzi:Lcom/daaw/db8;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qb6;

    return-object p1
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzf:Ljava/lang/String;

    return-object v0
.end method

.method public final L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzo:Ljava/lang/String;

    return-object v0
.end method

.method public final M()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzj:Lcom/daaw/db8;

    return-object v0
.end method

.method public final N()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzn:Lcom/daaw/db8;

    return-object v0
.end method

.method public final O()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzm:Lcom/daaw/db8;

    return-object v0
.end method

.method public final P()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/wd6;->zzh:Lcom/daaw/db8;

    return-object v0
.end method

.method public final S()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wd6;->zzl:Z

    return v0
.end method

.method public final T()Z
    .locals 1

    iget v0, p0, Lcom/daaw/wd6;->zzd:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final U()Z
    .locals 2

    iget v0, p0, Lcom/daaw/wd6;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
