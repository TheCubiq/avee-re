.class public final Lcom/daaw/jy7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/jy7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/daaw/ux7;

.field private zzh:Lcom/daaw/yx7;

.field private zzi:I

.field private zzj:Lcom/daaw/qs7;

.field private zzk:Ljava/lang/String;

.field private zzl:I

.field private zzm:Lcom/daaw/us7;

.field private zzn:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/jy7;

    invoke-direct {v0}, Lcom/daaw/jy7;-><init>()V

    sput-object v0, Lcom/daaw/jy7;->zzb:Lcom/daaw/jy7;

    const-class v1, Lcom/daaw/jy7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/daaw/jy7;->zzn:B

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/jy7;->zzf:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ls7;->t()Lcom/daaw/qs7;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/jy7;->zzj:Lcom/daaw/qs7;

    iput-object v0, p0, Lcom/daaw/jy7;->zzk:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jy7;->zzm:Lcom/daaw/us7;

    return-void
.end method

.method public static M()Lcom/daaw/iy7;
    .locals 1

    sget-object v0, Lcom/daaw/jy7;->zzb:Lcom/daaw/jy7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/iy7;

    return-object v0
.end method

.method public static synthetic N()Lcom/daaw/jy7;
    .locals 1

    sget-object v0, Lcom/daaw/jy7;->zzb:Lcom/daaw/jy7;

    return-object v0
.end method

.method public static synthetic P(Lcom/daaw/jy7;I)V
    .locals 1

    iget v0, p0, Lcom/daaw/jy7;->zzd:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/jy7;->zzd:I

    iput p1, p0, Lcom/daaw/jy7;->zze:I

    return-void
.end method

.method public static synthetic Q(Lcom/daaw/jy7;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/jy7;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/jy7;->zzd:I

    iput-object p1, p0, Lcom/daaw/jy7;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/jy7;Lcom/daaw/ux7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/jy7;->zzg:Lcom/daaw/ux7;

    iget p1, p0, Lcom/daaw/jy7;->zzd:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, Lcom/daaw/jy7;->zzd:I

    return-void
.end method

.method public static synthetic S(Lcom/daaw/jy7;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/jy7;->zzm:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/jy7;->zzm:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/jy7;->zzm:Lcom/daaw/us7;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic T(Lcom/daaw/jy7;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/daaw/jy7;->zzl:I

    iget p1, p0, Lcom/daaw/jy7;->zzd:I

    or-int/lit8 p1, p1, 0x40

    iput p1, p0, Lcom/daaw/jy7;->zzd:I

    return-void
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
    iput-byte p3, p0, Lcom/daaw/jy7;->zzn:B

    return-object v3

    :cond_1
    sget-object p1, Lcom/daaw/jy7;->zzb:Lcom/daaw/jy7;

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/iy7;

    invoke-direct {p1, v3}, Lcom/daaw/iy7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/jy7;

    invoke-direct {p1}, Lcom/daaw/jy7;-><init>()V

    return-object p1

    :cond_4
    const/16 p1, 0xb

    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "zzd"

    aput-object p2, p1, v0

    const-string p2, "zze"

    aput-object p2, p1, p3

    const-string p2, "zzf"

    aput-object p2, p1, v4

    const-string p2, "zzg"

    aput-object p2, p1, v3

    const-string p2, "zzh"

    aput-object p2, p1, v2

    const-string p2, "zzi"

    aput-object p2, p1, v1

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

    sget-object p3, Lcom/daaw/gy7;->a:Lcom/daaw/ps7;

    aput-object p3, p1, p2

    const/16 p2, 0xa

    const-string p3, "zzm"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/jy7;->zzb:Lcom/daaw/jy7;

    const-string p3, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001\u1504\u0000\u0002\u1008\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1004\u0004\u0006\u0016\u0007\u1008\u0005\u0008\u100c\u0006\t\u001a"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/daaw/jy7;->zzn:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/jy7;->zzm:Lcom/daaw/us7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/jy7;->zzf:Ljava/lang/String;

    return-object v0
.end method
