.class public final Lcom/daaw/xy7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/xy7;


# instance fields
.field private zzd:I

.field private zze:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/xy7;

    invoke-direct {v0}, Lcom/daaw/xy7;-><init>()V

    sput-object v0, Lcom/daaw/xy7;->zzb:Lcom/daaw/xy7;

    const-class v1, Lcom/daaw/xy7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/xy7;->zze:Ljava/lang/String;

    return-void
.end method

.method public static synthetic L()Lcom/daaw/xy7;
    .locals 1

    sget-object v0, Lcom/daaw/xy7;->zzb:Lcom/daaw/xy7;

    return-object v0
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
    sget-object p1, Lcom/daaw/xy7;->zzb:Lcom/daaw/xy7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/wy7;

    invoke-direct {p1, p3}, Lcom/daaw/wy7;-><init>(Lcom/daaw/rw7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/xy7;

    invoke-direct {p1}, Lcom/daaw/xy7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/xy7;->zzb:Lcom/daaw/xy7;

    const-string p3, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
