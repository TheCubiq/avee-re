.class public final Lcom/daaw/jj2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/jj2;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/yq7;

.field private zzf:Lcom/daaw/yq7;

.field private zzg:Lcom/daaw/yq7;

.field private zzh:Lcom/daaw/yq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/jj2;

    invoke-direct {v0}, Lcom/daaw/jj2;-><init>()V

    sput-object v0, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    const-class v1, Lcom/daaw/jj2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/jj2;->zze:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/jj2;->zzf:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/jj2;->zzg:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/jj2;->zzh:Lcom/daaw/yq7;

    return-void
.end method

.method public static L()Lcom/daaw/ij2;
    .locals 1

    sget-object v0, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/ij2;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/jj2;
    .locals 1

    sget-object v0, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    return-object v0
.end method

.method public static N([BLcom/daaw/vr7;)Lcom/daaw/jj2;
    .locals 1

    sget-object v0, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->s(Lcom/daaw/ls7;[BLcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/jj2;

    return-object p0
.end method

.method public static synthetic S(Lcom/daaw/jj2;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/jj2;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/jj2;->zzd:I

    iput-object p1, p0, Lcom/daaw/jj2;->zze:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/jj2;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/jj2;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/jj2;->zzd:I

    iput-object p1, p0, Lcom/daaw/jj2;->zzf:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic U(Lcom/daaw/jj2;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/jj2;->zzd:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lcom/daaw/jj2;->zzd:I

    iput-object p1, p0, Lcom/daaw/jj2;->zzg:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic V(Lcom/daaw/jj2;Lcom/daaw/yq7;)V
    .locals 1

    iget v0, p0, Lcom/daaw/jj2;->zzd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/daaw/jj2;->zzd:I

    iput-object p1, p0, Lcom/daaw/jj2;->zzh:Lcom/daaw/yq7;

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ij2;

    invoke-direct {p1, p2}, Lcom/daaw/ij2;-><init>(Lcom/daaw/gi2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/jj2;

    invoke-direct {p1}, Lcom/daaw/jj2;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/jj2;->zzb:Lcom/daaw/jj2;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u100a\u0000\u0002\u100a\u0001\u0003\u100a\u0002\u0004\u100a\u0003"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jj2;->zze:Lcom/daaw/yq7;

    return-object v0
.end method

.method public final P()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jj2;->zzf:Lcom/daaw/yq7;

    return-object v0
.end method

.method public final Q()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jj2;->zzh:Lcom/daaw/yq7;

    return-object v0
.end method

.method public final R()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jj2;->zzg:Lcom/daaw/yq7;

    return-object v0
.end method
