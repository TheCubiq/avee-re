.class public final Lcom/daaw/vk7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/vk7;


# instance fields
.field private zzd:Lcom/daaw/el7;

.field private zze:Lcom/daaw/pk7;

.field private zzf:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/vk7;

    invoke-direct {v0}, Lcom/daaw/vk7;-><init>()V

    sput-object v0, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    const-class v1, Lcom/daaw/vk7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    return-void
.end method

.method public static M()Lcom/daaw/uk7;
    .locals 1

    sget-object v0, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/uk7;

    return-object v0
.end method

.method public static synthetic N()Lcom/daaw/vk7;
    .locals 1

    sget-object v0, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    return-object v0
.end method

.method public static O()Lcom/daaw/vk7;
    .locals 1

    sget-object v0, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    return-object v0
.end method

.method public static synthetic Q(Lcom/daaw/vk7;Lcom/daaw/el7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/vk7;->zzd:Lcom/daaw/el7;

    return-void
.end method

.method public static synthetic R(Lcom/daaw/vk7;Lcom/daaw/pk7;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/vk7;->zze:Lcom/daaw/pk7;

    return-void
.end method

.method public static synthetic T(Lcom/daaw/vk7;I)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/jk7;->a(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/vk7;->zzf:I

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
    sget-object p1, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/uk7;

    invoke-direct {p1, p3}, Lcom/daaw/uk7;-><init>(Lcom/daaw/tk7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/vk7;

    invoke-direct {p1}, Lcom/daaw/vk7;-><init>()V

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

    sget-object p2, Lcom/daaw/vk7;->zzb:Lcom/daaw/vk7;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u000c"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()Lcom/daaw/pk7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vk7;->zze:Lcom/daaw/pk7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/pk7;->N()Lcom/daaw/pk7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final P()Lcom/daaw/el7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/vk7;->zzd:Lcom/daaw/el7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/el7;->N()Lcom/daaw/el7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final S()I
    .locals 4

    iget v0, p0, Lcom/daaw/vk7;->zzf:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    :cond_3
    :goto_0
    if-nez v1, :cond_4

    return v3

    :cond_4
    return v1
.end method
