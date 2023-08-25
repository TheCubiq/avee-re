.class public final Lcom/daaw/on7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/on7;


# instance fields
.field private zzd:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/on7;

    invoke-direct {v0}, Lcom/daaw/on7;-><init>()V

    sput-object v0, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    const-class v1, Lcom/daaw/on7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/on7;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/on7;
    .locals 1

    sget-object v0, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    return-object v0
.end method

.method public static M()Lcom/daaw/on7;
    .locals 1

    sget-object v0, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    return-object v0
.end method

.method public static N(Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/on7;
    .locals 1

    sget-object v0, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->q(Lcom/daaw/ls7;Lcom/daaw/yq7;Lcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/on7;

    return-object p0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/nn7;

    invoke-direct {p1, p3}, Lcom/daaw/nn7;-><init>(Lcom/daaw/mn7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/on7;

    invoke-direct {p1}, Lcom/daaw/on7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "zzd"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/on7;->zzb:Lcom/daaw/on7;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/on7;->zzd:Ljava/lang/String;

    return-object v0
.end method
