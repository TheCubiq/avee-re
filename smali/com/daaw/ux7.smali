.class public final Lcom/daaw/ux7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/ux7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/tx7;

.field private zzf:Lcom/daaw/us7;

.field private zzg:Lcom/daaw/yq7;

.field private zzh:Lcom/daaw/yq7;

.field private zzi:I

.field private zzj:B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/ux7;

    invoke-direct {v0}, Lcom/daaw/ux7;-><init>()V

    sput-object v0, Lcom/daaw/ux7;->zzb:Lcom/daaw/ux7;

    const-class v1, Lcom/daaw/ux7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const/4 v0, 0x2

    iput-byte v0, p0, Lcom/daaw/ux7;->zzj:B

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ux7;->zzf:Lcom/daaw/us7;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/ux7;->zzg:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/ux7;->zzh:Lcom/daaw/yq7;

    return-void
.end method

.method public static L()Lcom/daaw/rx7;
    .locals 1

    sget-object v0, Lcom/daaw/ux7;->zzb:Lcom/daaw/ux7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/rx7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/ux7;
    .locals 1

    sget-object v0, Lcom/daaw/ux7;->zzb:Lcom/daaw/ux7;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/ux7;Lcom/daaw/qx7;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/ux7;->zzf:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ux7;->zzf:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/ux7;->zzf:Lcom/daaw/us7;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    iput-byte p3, p0, Lcom/daaw/ux7;->zzj:B

    return-object v3

    :cond_1
    sget-object p1, Lcom/daaw/ux7;->zzb:Lcom/daaw/ux7;

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/rx7;

    invoke-direct {p1, v3}, Lcom/daaw/rx7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_3
    new-instance p1, Lcom/daaw/ux7;

    invoke-direct {p1}, Lcom/daaw/ux7;-><init>()V

    return-object p1

    :cond_4
    const/4 p1, 0x7

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

    sget-object p2, Lcom/daaw/ux7;->zzb:Lcom/daaw/ux7;

    const-string p3, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\u1009\u0000\u0002\u041b\u0003\u100a\u0001\u0004\u100a\u0002\u0005\u1004\u0003"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    iget-byte p1, p0, Lcom/daaw/ux7;->zzj:B

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
