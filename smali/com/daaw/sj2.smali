.class public final Lcom/daaw/sj2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/sj2;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/us7;

.field private zzf:Lcom/daaw/yq7;

.field private zzg:I

.field private zzh:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/sj2;

    invoke-direct {v0}, Lcom/daaw/sj2;-><init>()V

    sput-object v0, Lcom/daaw/sj2;->zzb:Lcom/daaw/sj2;

    const-class v1, Lcom/daaw/sj2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/sj2;->zze:Lcom/daaw/us7;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/sj2;->zzf:Lcom/daaw/yq7;

    const/4 v0, 0x1

    iput v0, p0, Lcom/daaw/sj2;->zzg:I

    iput v0, p0, Lcom/daaw/sj2;->zzh:I

    return-void
.end method

.method public static L()Lcom/daaw/rj2;
    .locals 1

    sget-object v0, Lcom/daaw/sj2;->zzb:Lcom/daaw/sj2;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/rj2;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/sj2;
    .locals 1

    sget-object v0, Lcom/daaw/sj2;->zzb:Lcom/daaw/sj2;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/sj2;Lcom/daaw/yq7;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/sj2;->zze:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/sj2;->zze:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/sj2;->zze:Lcom/daaw/us7;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic O(Lcom/daaw/sj2;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/sj2;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/sj2;->zzd:I

    iput-object p1, p0, Lcom/daaw/sj2;->zzf:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic P(Lcom/daaw/sj2;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/sj2;->zzh:I

    iget p1, p0, Lcom/daaw/sj2;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/daaw/sj2;->zzd:I

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
    sget-object p1, Lcom/daaw/sj2;->zzb:Lcom/daaw/sj2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/rj2;

    invoke-direct {p1, p2}, Lcom/daaw/rj2;-><init>(Lcom/daaw/gi2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/sj2;

    invoke-direct {p1}, Lcom/daaw/sj2;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

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

    sget-object p2, Lcom/daaw/mj2;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v0

    const-string p2, "zzh"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    sget-object p3, Lcom/daaw/kj2;->a:Lcom/daaw/ps7;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/sj2;->zzb:Lcom/daaw/sj2;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\u100a\u0000\u0003\u100c\u0001\u0004\u100c\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
