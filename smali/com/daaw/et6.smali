.class public final Lcom/daaw/et6;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/rs7;

.field private static final zzd:Lcom/daaw/et6;


# instance fields
.field private zze:I

.field private zzf:Lcom/daaw/qs7;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/bt6;

    invoke-direct {v0}, Lcom/daaw/bt6;-><init>()V

    sput-object v0, Lcom/daaw/et6;->zzb:Lcom/daaw/rs7;

    new-instance v0, Lcom/daaw/et6;

    invoke-direct {v0}, Lcom/daaw/et6;-><init>()V

    sput-object v0, Lcom/daaw/et6;->zzd:Lcom/daaw/et6;

    const-class v1, Lcom/daaw/et6;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->t()Lcom/daaw/qs7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/et6;->zzf:Lcom/daaw/qs7;

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/et6;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/et6;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/et6;->zzi:Ljava/lang/String;

    return-void
.end method

.method public static L()Lcom/daaw/dt6;
    .locals 1

    sget-object v0, Lcom/daaw/et6;->zzd:Lcom/daaw/et6;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/dt6;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/et6;
    .locals 1

    sget-object v0, Lcom/daaw/et6;->zzd:Lcom/daaw/et6;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/et6;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, p0, Lcom/daaw/et6;->zze:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/et6;->zze:I

    iput-object p1, p0, Lcom/daaw/et6;->zzg:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(Lcom/daaw/et6;I)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/et6;->zzf:Lcom/daaw/qs7;

    invoke-interface {p1}, Lcom/daaw/us7;->zzc()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lcom/daaw/ls7;->u(Lcom/daaw/qs7;)Lcom/daaw/qs7;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/et6;->zzf:Lcom/daaw/qs7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/et6;->zzf:Lcom/daaw/qs7;

    const/4 p1, 0x2

    invoke-interface {p0, p1}, Lcom/daaw/qs7;->i(I)V

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
    sget-object p1, Lcom/daaw/et6;->zzd:Lcom/daaw/et6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/dt6;

    invoke-direct {p1, p2}, Lcom/daaw/dt6;-><init>(Lcom/daaw/bt6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/et6;

    invoke-direct {p1}, Lcom/daaw/et6;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zze"

    aput-object v4, p1, v3

    const-string v3, "zzf"

    aput-object v3, p1, p2

    sget-object p2, Lcom/daaw/ct6;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    sget-object p2, Lcom/daaw/et6;->zzd:Lcom/daaw/et6;

    const-string p3, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\u1008\u0000\u0003\u1008\u0001\u0004\u1008\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
