.class public final Lcom/daaw/g73;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/g73;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:I

.field private zzg:Lcom/daaw/i73;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/g73;

    invoke-direct {v0}, Lcom/daaw/g73;-><init>()V

    sput-object v0, Lcom/daaw/g73;->zzb:Lcom/daaw/g73;

    const-class v1, Lcom/daaw/g73;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/g73;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/g73;
    .locals 1

    sget-object v0, Lcom/daaw/g73;->zzb:Lcom/daaw/g73;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

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
    sget-object p1, Lcom/daaw/g73;->zzb:Lcom/daaw/g73;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/f73;

    invoke-direct {p1, p2}, Lcom/daaw/f73;-><init>(Lcom/daaw/h43;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/g73;

    invoke-direct {p1}, Lcom/daaw/g73;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v3, "zzd"

    aput-object v3, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    sget-object p2, Lcom/daaw/s53;->a:Lcom/daaw/ps7;

    aput-object p2, p1, v1

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/g73;->zzb:Lcom/daaw/g73;

    const-string p3, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1009\u0002"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
