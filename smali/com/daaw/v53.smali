.class public final Lcom/daaw/v53;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/v53;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/String;

.field private zzg:I

.field private zzh:I

.field private zzi:Lcom/daaw/k73;

.field private zzj:Lcom/daaw/ts7;

.field private zzk:Lcom/daaw/n53;

.field private zzl:Lcom/daaw/q53;

.field private zzm:Lcom/daaw/o63;

.field private zzn:Lcom/daaw/m43;

.field private zzo:Lcom/daaw/y63;

.field private zzp:Lcom/daaw/k83;

.field private zzq:Lcom/daaw/v43;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/v53;

    invoke-direct {v0}, Lcom/daaw/v53;-><init>()V

    sput-object v0, Lcom/daaw/v53;->zzb:Lcom/daaw/v53;

    const-class v1, Lcom/daaw/v53;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/v53;->zzf:Ljava/lang/String;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/daaw/v53;->zzh:I

    invoke-static {}, Lcom/daaw/ls7;->v()Lcom/daaw/ts7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v53;->zzj:Lcom/daaw/ts7;

    return-void
.end method

.method public static N()Lcom/daaw/u53;
    .locals 1

    sget-object v0, Lcom/daaw/v53;->zzb:Lcom/daaw/v53;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/u53;

    return-object v0
.end method

.method public static synthetic O()Lcom/daaw/v53;
    .locals 1

    sget-object v0, Lcom/daaw/v53;->zzb:Lcom/daaw/v53;

    return-object v0
.end method

.method public static synthetic Q(Lcom/daaw/v53;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/daaw/v53;->zzd:I

    iput-object p1, p0, Lcom/daaw/v53;->zzf:Ljava/lang/String;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/v53;Ljava/lang/Iterable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/v53;->zzj:Lcom/daaw/ts7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v1, v1

    :goto_0
    invoke-interface {v0, v1}, Lcom/daaw/ts7;->a(I)Lcom/daaw/ts7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v53;->zzj:Lcom/daaw/ts7;

    :cond_1
    iget-object p0, p0, Lcom/daaw/v53;->zzj:Lcom/daaw/ts7;

    invoke-static {p1, p0}, Lcom/daaw/hq7;->g(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic S(Lcom/daaw/v53;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ls7;->v()Lcom/daaw/ts7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/v53;->zzj:Lcom/daaw/ts7;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/v53;Lcom/daaw/n53;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/v53;->zzk:Lcom/daaw/n53;

    iget p1, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Lcom/daaw/v53;->zzd:I

    return-void
.end method

.method public static synthetic U(Lcom/daaw/v53;Lcom/daaw/m43;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/v53;->zzn:Lcom/daaw/m43;

    iget p1, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Lcom/daaw/v53;->zzd:I

    return-void
.end method

.method public static synthetic V(Lcom/daaw/v53;Lcom/daaw/y63;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/v53;->zzo:Lcom/daaw/y63;

    iget p1, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, Lcom/daaw/v53;->zzd:I

    return-void
.end method

.method public static synthetic W(Lcom/daaw/v53;Lcom/daaw/k83;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/v53;->zzp:Lcom/daaw/k83;

    iget p1, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, Lcom/daaw/v53;->zzd:I

    return-void
.end method

.method public static synthetic X(Lcom/daaw/v53;Lcom/daaw/v43;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/v53;->zzq:Lcom/daaw/v43;

    iget p1, p0, Lcom/daaw/v53;->zzd:I

    or-int/lit16 p1, p1, 0x800

    iput p1, p0, Lcom/daaw/v53;->zzd:I

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
    sget-object p1, Lcom/daaw/v53;->zzb:Lcom/daaw/v53;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/u53;

    invoke-direct {p1, p2}, Lcom/daaw/u53;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/v53;

    invoke-direct {p1}, Lcom/daaw/v53;-><init>()V

    return-object p1

    :cond_3
    const/16 p1, 0xf

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

    sget-object p2, Lcom/daaw/s53;->a:Lcom/daaw/ps7;

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

    const/16 p2, 0xa

    const-string p3, "zzm"

    aput-object p3, p1, p2

    const/16 p2, 0xb

    const-string p3, "zzn"

    aput-object p3, p1, p2

    const/16 p2, 0xc

    const-string p3, "zzo"

    aput-object p3, p1, p2

    const/16 p2, 0xd

    const-string p3, "zzp"

    aput-object p3, p1, p2

    const/16 p2, 0xe

    const-string p3, "zzq"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/v53;->zzb:Lcom/daaw/v53;

    const-string p3, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\t\u1004\u0000\n\u1008\u0001\u000b\u100b\u0002\u000c\u100c\u0003\r\u1009\u0004\u000e\u0015\u000f\u1009\u0005\u0010\u1009\u0006\u0011\u1009\u0007\u0012\u1009\u0008\u0013\u1009\t\u0014\u1009\n\u0015\u1009\u000b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()Lcom/daaw/m43;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v53;->zzn:Lcom/daaw/m43;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/m43;->M()Lcom/daaw/m43;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final M()Lcom/daaw/n53;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v53;->zzk:Lcom/daaw/n53;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/n53;->M()Lcom/daaw/n53;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v53;->zzf:Ljava/lang/String;

    return-object v0
.end method
