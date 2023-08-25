.class public final Lcom/daaw/oi7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/oi7;


# instance fields
.field private zzd:Lcom/daaw/ui7;

.field private zze:Lcom/daaw/rl7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/oi7;

    invoke-direct {v0}, Lcom/daaw/oi7;-><init>()V

    sput-object v0, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    const-class v1, Lcom/daaw/oi7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    return-void
.end method

.method public static L()Lcom/daaw/ni7;
    .locals 1

    sget-object v0, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/ni7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/oi7;
    .locals 1

    sget-object v0, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    return-object v0
.end method

.method public static N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/oi7;
    .locals 1

    sget-object v0, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->q(Lcom/daaw/ls7;Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/oi7;

    return-object p0
.end method

.method public static synthetic Q(Lcom/daaw/oi7;Lcom/daaw/ui7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/oi7;->zzd:Lcom/daaw/ui7;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/oi7;Lcom/daaw/rl7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/oi7;->zze:Lcom/daaw/rl7;

    return-void
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ni7;

    invoke-direct {p1, p3}, Lcom/daaw/ni7;-><init>(Lcom/daaw/mi7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/oi7;

    invoke-direct {p1}, Lcom/daaw/oi7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/oi7;->zzb:Lcom/daaw/oi7;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()Lcom/daaw/ui7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oi7;->zzd:Lcom/daaw/ui7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/ui7;->O()Lcom/daaw/ui7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final P()Lcom/daaw/rl7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/oi7;->zze:Lcom/daaw/rl7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/rl7;->O()Lcom/daaw/rl7;

    move-result-object v0

    :cond_0
    return-object v0
.end method
