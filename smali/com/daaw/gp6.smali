.class public final Lcom/daaw/gp6;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/gp6;


# instance fields
.field private zzd:Lcom/daaw/us7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/gp6;

    invoke-direct {v0}, Lcom/daaw/gp6;-><init>()V

    sput-object v0, Lcom/daaw/gp6;->zzb:Lcom/daaw/gp6;

    const-class v1, Lcom/daaw/gp6;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    return-void
.end method

.method public static M()Lcom/daaw/dp6;
    .locals 1

    sget-object v0, Lcom/daaw/gp6;->zzb:Lcom/daaw/gp6;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/dp6;

    return-object v0
.end method

.method public static synthetic N()Lcom/daaw/gp6;
    .locals 1

    sget-object v0, Lcom/daaw/gp6;->zzb:Lcom/daaw/gp6;

    return-object v0
.end method

.method public static synthetic O(Lcom/daaw/gp6;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    return-void
.end method

.method public static synthetic P(Lcom/daaw/gp6;Lcom/daaw/fp6;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    sget-object p1, Lcom/daaw/gp6;->zzb:Lcom/daaw/gp6;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/dp6;

    invoke-direct {p1, p3}, Lcom/daaw/dp6;-><init>(Lcom/daaw/cp6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/gp6;

    invoke-direct {p1}, Lcom/daaw/gp6;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, Lcom/daaw/fp6;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/gp6;->zzb:Lcom/daaw/gp6;

    const-string p3, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

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

    iget-object v0, p0, Lcom/daaw/gp6;->zzd:Lcom/daaw/us7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
