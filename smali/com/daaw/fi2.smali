.class public final Lcom/daaw/fi2;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/fi2;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;

.field private zzf:Ljava/lang/String;

.field private zzg:Ljava/lang/String;

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/fi2;

    invoke-direct {v0}, Lcom/daaw/fi2;-><init>()V

    sput-object v0, Lcom/daaw/fi2;->zzb:Lcom/daaw/fi2;

    const-class v1, Lcom/daaw/fi2;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/fi2;->zze:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/fi2;->zzf:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/fi2;->zzg:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/fi2;->zzh:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/fi2;->zzi:Ljava/lang/String;

    iput-object v0, p0, Lcom/daaw/fi2;->zzj:Ljava/lang/String;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/fi2;
    .locals 1

    sget-object v0, Lcom/daaw/fi2;->zzb:Lcom/daaw/fi2;

    return-object v0
.end method


# virtual methods
.method public final I(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

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
    sget-object p1, Lcom/daaw/fi2;->zzb:Lcom/daaw/fi2;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ei2;

    invoke-direct {p1, p2}, Lcom/daaw/ei2;-><init>(Lcom/daaw/yh2;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/fi2;

    invoke-direct {p1}, Lcom/daaw/fi2;-><init>()V

    return-object p1

    :cond_3
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "zzd"

    aput-object v4, p1, v3

    const-string v3, "zze"

    aput-object v3, p1, p2

    const-string p2, "zzf"

    aput-object p2, p1, v2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    const-string p2, "zzi"

    aput-object p2, p1, p3

    const/4 p2, 0x6

    const-string p3, "zzj"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/fi2;->zzb:Lcom/daaw/fi2;

    const-string p3, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1008\u0005"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
