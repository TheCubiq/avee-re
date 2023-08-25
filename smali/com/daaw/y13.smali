.class public final Lcom/daaw/y13;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/y13;

.field public static final d:Lcom/daaw/th8;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/v03;

    invoke-direct {v0}, Lcom/daaw/v03;-><init>()V

    new-instance v1, Lcom/daaw/y13;

    invoke-direct {v1, v0}, Lcom/daaw/y13;-><init>(Lcom/daaw/v03;)V

    sput-object v1, Lcom/daaw/y13;->c:Lcom/daaw/y13;

    sget-object v0, Lcom/daaw/rz2;->a:Lcom/daaw/rz2;

    sput-object v0, Lcom/daaw/y13;->d:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/v03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/y13;->a:Landroid/net/Uri;

    iput-object p1, p0, Lcom/daaw/y13;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/daaw/y13;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/daaw/y13;

    iget-object p1, p1, Lcom/daaw/y13;->a:Landroid/net/Uri;

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1, p1}, Lcom/daaw/it5;->t(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
