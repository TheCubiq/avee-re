.class public final Lcom/daaw/xn7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/xn7;


# instance fields
.field private zzd:Ljava/lang/String;

.field private zze:Lcom/daaw/vm7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xn7;

    invoke-direct {v0}, Lcom/daaw/xn7;-><init>()V

    sput-object v0, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    const-class v1, Lcom/daaw/xn7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/xn7;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static synthetic M()Lcom/daaw/xn7;
    .locals 1

    sget-object v0, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    return-object v0
.end method

.method public static N()Lcom/daaw/xn7;
    .locals 1

    sget-object v0, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    return-object v0
.end method

.method public static O(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/xn7;
    .locals 1

    sget-object v0, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->q(Lcom/daaw/ls7;Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/xn7;

    return-object p0
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
    sget-object p1, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/tn7;

    invoke-direct {p1, p3}, Lcom/daaw/tn7;-><init>(Lcom/daaw/sn7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/xn7;

    invoke-direct {p1}, Lcom/daaw/xn7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/xn7;->zzb:Lcom/daaw/xn7;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()Lcom/daaw/vm7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn7;->zze:Lcom/daaw/vm7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/vm7;->N()Lcom/daaw/vm7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final P()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn7;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/xn7;->zze:Lcom/daaw/vm7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
