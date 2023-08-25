.class public final Lcom/daaw/el7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/el7;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Lcom/daaw/yq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/el7;

    invoke-direct {v0}, Lcom/daaw/el7;-><init>()V

    sput-object v0, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    const-class v1, Lcom/daaw/el7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/el7;->zzf:Lcom/daaw/yq7;

    return-void
.end method

.method public static L()Lcom/daaw/dl7;
    .locals 1

    sget-object v0, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/dl7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/el7;
    .locals 1

    sget-object v0, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    return-object v0
.end method

.method public static N()Lcom/daaw/el7;
    .locals 1

    sget-object v0, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    return-object v0
.end method

.method public static synthetic P(Lcom/daaw/el7;Lcom/daaw/yq7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/el7;->zzf:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic S(Lcom/daaw/el7;I)V
    .locals 0

    const/4 p1, 0x4

    invoke-static {p1}, Lcom/daaw/gl7;->a(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/el7;->zzd:I

    return-void
.end method

.method public static synthetic T(Lcom/daaw/el7;I)V
    .locals 0

    const/4 p1, 0x5

    invoke-static {p1}, Lcom/daaw/il7;->a(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/el7;->zze:I

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
    sget-object p1, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/dl7;

    invoke-direct {p1, p3}, Lcom/daaw/dl7;-><init>(Lcom/daaw/cl7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/el7;

    invoke-direct {p1}, Lcom/daaw/el7;-><init>()V

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

    sget-object p2, Lcom/daaw/el7;->zzb:Lcom/daaw/el7;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u000b\n"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final O()Lcom/daaw/yq7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/el7;->zzf:Lcom/daaw/yq7;

    return-object v0
.end method

.method public final Q()I
    .locals 4

    iget v0, p0, Lcom/daaw/el7;->zzd:I

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x7

    goto :goto_0

    :cond_1
    const/4 v1, 0x6

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    :cond_4
    :goto_0
    if-nez v1, :cond_5

    const/4 v0, 0x1

    return v0

    :cond_5
    return v1
.end method

.method public final R()I
    .locals 1

    iget v0, p0, Lcom/daaw/el7;->zze:I

    invoke-static {v0}, Lcom/daaw/il7;->b(I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method
