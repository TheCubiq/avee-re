.class public final Lcom/daaw/e27;
.super Lcom/daaw/ja8;
.source ""

# interfaces
.implements Lcom/daaw/be8;


# static fields
.field private static final zza:Lcom/daaw/e27;


# instance fields
.field private zzd:Lcom/daaw/db8;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/e27;

    invoke-direct {v0}, Lcom/daaw/e27;-><init>()V

    sput-object v0, Lcom/daaw/e27;->zza:Lcom/daaw/e27;

    const-class v1, Lcom/daaw/e27;

    invoke-static {v1, v0}, Lcom/daaw/ja8;->v(Ljava/lang/Class;Lcom/daaw/ja8;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/ja8;-><init>()V

    invoke-static {}, Lcom/daaw/ja8;->o()Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    return-void
.end method

.method public static D()Lcom/daaw/b17;
    .locals 1

    sget-object v0, Lcom/daaw/e27;->zza:Lcom/daaw/e27;

    invoke-virtual {v0}, Lcom/daaw/ja8;->z()Lcom/daaw/y98;

    move-result-object v0

    check-cast v0, Lcom/daaw/b17;

    return-object v0
.end method

.method public static synthetic E()Lcom/daaw/e27;
    .locals 1

    sget-object v0, Lcom/daaw/e27;->zza:Lcom/daaw/e27;

    return-object v0
.end method

.method public static synthetic H(Lcom/daaw/e27;Lcom/daaw/j47;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    invoke-interface {v0}, Lcom/daaw/db8;->zzc()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/daaw/ja8;->p(Lcom/daaw/db8;)Lcom/daaw/db8;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    :cond_0
    iget-object p0, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final C(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
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
    sget-object p1, Lcom/daaw/e27;->zza:Lcom/daaw/e27;

    return-object p1

    :cond_1
    new-instance p1, Lcom/daaw/b17;

    invoke-direct {p1, p3}, Lcom/daaw/b17;-><init>(Lcom/daaw/lj6;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/daaw/e27;

    invoke-direct {p1}, Lcom/daaw/e27;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zzd"

    aput-object v0, p1, p3

    const-class p3, Lcom/daaw/j47;

    aput-object p3, p1, p2

    sget-object p2, Lcom/daaw/e27;->zza:Lcom/daaw/e27;

    const-string p3, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    invoke-static {p2, p3, p1}, Lcom/daaw/ja8;->s(Lcom/daaw/zd8;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final F(I)Lcom/daaw/j47;
    .locals 1

    iget-object p1, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/j47;

    return-object p1
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e27;->zzd:Lcom/daaw/db8;

    return-object v0
.end method
