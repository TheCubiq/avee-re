.class public final Lcom/daaw/oj2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/oj2;


# instance fields
.field private zzd:I

.field private zze:J

.field private zzf:Ljava/lang/String;

.field private zzg:Lcom/daaw/yq7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/oj2;

    invoke-direct {v0}, Lcom/daaw/oj2;-><init>()V

    sput-object v0, Lcom/daaw/oj2;->zzb:Lcom/daaw/oj2;

    const-class v1, Lcom/daaw/oj2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/oj2;->zzf:Ljava/lang/String;

    sget-object v0, Lcom/daaw/yq7;->q:Lcom/daaw/yq7;

    iput-object v0, p0, Lcom/daaw/oj2;->zzg:Lcom/daaw/yq7;

    return-void
.end method

.method public static synthetic M()Lcom/daaw/oj2;
    .locals 1

    sget-object v0, Lcom/daaw/oj2;->zzb:Lcom/daaw/oj2;

    return-object v0
.end method

.method public static N()Lcom/daaw/oj2;
    .locals 1

    sget-object v0, Lcom/daaw/oj2;->zzb:Lcom/daaw/oj2;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/daaw/oj2;->zzb:Lcom/daaw/oj2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/nj2;

    invoke-direct {p1, p2}, Lcom/daaw/nj2;-><init>(Lcom/daaw/gi2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/oj2;

    invoke-direct {p1}, Lcom/daaw/oj2;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/oj2;->zzb:Lcom/daaw/oj2;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u1002\u0000\u0003\u1008\u0001\u0004\u100a\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final L()J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/oj2;->zze:J

    return-wide v0
.end method

.method public final O()Z
    .locals 2

    iget v0, p0, Lcom/daaw/oj2;->zzd:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
