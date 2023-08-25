.class public final Lcom/daaw/li7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/li7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/ri7;

.field private zzf:Lcom/daaw/ll7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/li7;

    invoke-direct {v0}, Lcom/daaw/li7;-><init>()V

    sput-object v0, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    const-class v1, Lcom/daaw/li7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    return-void
.end method

.method public static M()Lcom/daaw/ki7;
    .locals 1

    sget-object v0, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/ki7;

    return-object v0
.end method

.method public static synthetic N()Lcom/daaw/li7;
    .locals 1

    sget-object v0, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    return-object v0
.end method

.method public static O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/li7;
    .locals 1

    sget-object v0, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->q(Lcom/daaw/ls7;Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/li7;

    return-object p0
.end method

.method public static synthetic R(Lcom/daaw/li7;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/li7;->zzd:I

    return-void
.end method

.method public static synthetic S(Lcom/daaw/li7;Lcom/daaw/ri7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/li7;->zze:Lcom/daaw/ri7;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/li7;Lcom/daaw/ll7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/li7;->zzf:Lcom/daaw/ll7;

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ki7;

    invoke-direct {p1, p3}, Lcom/daaw/ki7;-><init>(Lcom/daaw/ji7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/li7;

    invoke-direct {p1}, Lcom/daaw/li7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/li7;->zzb:Lcom/daaw/li7;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()I
    .locals 1

    iget v0, p0, Lcom/daaw/li7;->zzd:I

    return v0
.end method

.method public final P()Lcom/daaw/ri7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/li7;->zze:Lcom/daaw/ri7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ri7;->O()Lcom/daaw/ri7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final Q()Lcom/daaw/ll7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/li7;->zzf:Lcom/daaw/ll7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ll7;->O()Lcom/daaw/ll7;

    move-result-object v0

    :cond_0
    return-object v0
.end method
