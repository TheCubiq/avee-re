.class public final Lcom/daaw/rm7;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/rm7;


# instance fields
.field private zzd:I

.field private zze:Lcom/daaw/db8;

.field private zzf:Lcom/daaw/fi7;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/rm7;

    invoke-direct {v0}, Lcom/daaw/rm7;-><init>()V

    sput-object v0, Lcom/daaw/rm7;->zza:Lcom/daaw/rm7;

    const-class v1, Lcom/daaw/rm7;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rm7;->zze:Lcom/daaw/db8;

    return-void
.end method

.method public static synthetic E()Lcom/daaw/rm7;
    .locals 1

    sget-object v0, Lcom/daaw/rm7;->zza:Lcom/daaw/rm7;

    return-object v0
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/rm7;->zza:Lcom/daaw/rm7;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/ol7;

    invoke-direct {p1, p2}, Lcom/daaw/ol7;-><init>(Lcom/daaw/zf7;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/rm7;

    invoke-direct {p1}, Lcom/daaw/rm7;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zzd"

    aput-object v2, p1, p3

    const-string p3, "zze"

    aput-object p3, p1, p2

    const-class p2, Lcom/daaw/gs7;

    aput-object p2, p1, v1

    const-string p2, "zzf"

    aput-object p2, p1, v0

    sget-object p2, Lcom/daaw/rm7;->zza:Lcom/daaw/rm7;

    const-string p3, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final D()Lcom/daaw/fi7;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm7;->zzf:Lcom/daaw/fi7;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/fi7;->F()Lcom/daaw/fi7;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final F()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm7;->zze:Lcom/daaw/db8;

    return-object v0
.end method
