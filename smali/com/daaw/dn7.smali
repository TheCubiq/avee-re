.class public final Lcom/daaw/dn7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/dn7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/us7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/dn7;

    invoke-direct {v0}, Lcom/daaw/dn7;-><init>()V

    sput-object v0, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    const-class v1, Lcom/daaw/dn7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    invoke-static {}, Lcom/daaw/ls7;->w()Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    return-void
.end method

.method public static N()Lcom/daaw/an7;
    .locals 1

    sget-object v0, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/an7;

    return-object v0
.end method

.method public static synthetic O()Lcom/daaw/dn7;
    .locals 1

    sget-object v0, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    return-object v0
.end method

.method public static P(Ljava/io/InputStream;Lcom/daaw/vr7;)Lcom/daaw/dn7;
    .locals 1

    sget-object v0, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->r(Lcom/daaw/ls7;Ljava/io/InputStream;Lcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/dn7;

    return-object p0
.end method

.method public static Q([BLcom/daaw/vr7;)Lcom/daaw/dn7;
    .locals 1

    sget-object v0, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    invoke-static {v0, p0, p1}, Lcom/daaw/ls7;->s(Lcom/daaw/ls7;[BLcom/daaw/vr7;)Lcom/daaw/ls7;

    move-result-object p0

    check-cast p0, Lcom/daaw/dn7;

    return-object p0
.end method

.method public static synthetic S(Lcom/daaw/dn7;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/dn7;->zzd:I

    return-void
.end method

.method public static synthetic T(Lcom/daaw/dn7;Lcom/daaw/cn7;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    invoke-interface {v0}, Lcom/daaw/us7;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ls7;->x(Lcom/daaw/us7;)Lcom/daaw/us7;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    :cond_0
    iget-object p0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    sget-object p1, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/an7;

    invoke-direct {p1, p3}, Lcom/daaw/an7;-><init>(Lcom/daaw/zm7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/dn7;

    invoke-direct {p1}, Lcom/daaw/dn7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zzd"

    aput-object v1, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-class p2, Lcom/daaw/cn7;

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/dn7;->zzb:Lcom/daaw/dn7;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

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

    iget-object v0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final M()I
    .locals 1

    iget v0, p0, Lcom/daaw/dn7;->zzd:I

    return v0
.end method

.method public final R()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dn7;->zze:Lcom/daaw/us7;

    return-object v0
.end method
