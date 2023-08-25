.class public final Lcom/daaw/hn7;
.super Lcom/daaw/ls7;
.source ""

# interfaces
.implements Lcom/daaw/yt7;


# static fields
.field private static final zzb:Lcom/daaw/hn7;


# instance fields
.field private zzd:Ljava/lang/String;

.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/hn7;

    invoke-direct {v0}, Lcom/daaw/hn7;-><init>()V

    sput-object v0, Lcom/daaw/hn7;->zzb:Lcom/daaw/hn7;

    const-class v1, Lcom/daaw/hn7;

    invoke-static {v1, v0}, Lcom/daaw/ls7;->C(Ljava/lang/Class;Lcom/daaw/ls7;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ls7;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/daaw/hn7;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static L()Lcom/daaw/gn7;
    .locals 1

    sget-object v0, Lcom/daaw/hn7;->zzb:Lcom/daaw/hn7;

    invoke-virtual {v0}, Lcom/daaw/ls7;->H()Lcom/daaw/fs7;

    move-result-object v0

    check-cast v0, Lcom/daaw/gn7;

    return-object v0
.end method

.method public static synthetic M()Lcom/daaw/hn7;
    .locals 1

    sget-object v0, Lcom/daaw/hn7;->zzb:Lcom/daaw/hn7;

    return-object v0
.end method

.method public static synthetic N(Lcom/daaw/hn7;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/daaw/hn7;->zzd:Ljava/lang/String;

    return-void
.end method

.method public static synthetic O(Lcom/daaw/hn7;Lcom/daaw/zn7;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/zn7;->zza()I

    move-result p1

    iput p1, p0, Lcom/daaw/hn7;->zzg:I

    return-void
.end method

.method public static synthetic P(Lcom/daaw/hn7;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/hn7;->zzf:I

    return-void
.end method

.method public static synthetic Q(Lcom/daaw/hn7;I)V
    .locals 0

    invoke-static {p1}, Lcom/daaw/pm7;->a(I)I

    move-result p1

    iput p1, p0, Lcom/daaw/hn7;->zze:I

    return-void
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
    sget-object p1, Lcom/daaw/hn7;->zzb:Lcom/daaw/hn7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/gn7;

    invoke-direct {p1, p2}, Lcom/daaw/gn7;-><init>(Lcom/daaw/en7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/hn7;

    invoke-direct {p1}, Lcom/daaw/hn7;-><init>()V

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

    sget-object p2, Lcom/daaw/hn7;->zzb:Lcom/daaw/hn7;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u000c\u0003\u000b\u0004\u000c"

    invoke-static {p2, p3, p1}, Lcom/daaw/ls7;->z(Lcom/daaw/xt7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
