.class public Lcom/daaw/ie1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ie1;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/yw1$a<",
        "Ljava/lang/Integer;",
        "Lcom/daaw/sd0;",
        "Ljava/lang/String;",
        "Lcom/daaw/ie1$i;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ie1;


# direct methods
.method public constructor <init>(Lcom/daaw/ie1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ie1$d;->a:Lcom/daaw/ie1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Lcom/daaw/sd0;

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ie1$d;->b(Ljava/lang/Integer;Lcom/daaw/sd0;Ljava/lang/String;)Lcom/daaw/ie1$i;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Integer;Lcom/daaw/sd0;Ljava/lang/String;)Lcom/daaw/ie1$i;
    .locals 1

    iget-object p1, p0, Lcom/daaw/ie1$d;->a:Lcom/daaw/ie1;

    invoke-virtual {p1}, Lcom/daaw/ie1;->c()Lcom/daaw/ie1$i;

    move-result-object p1

    const-string p2, "regular"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p1

    :cond_0
    const-string p2, "files"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x5

    new-array p2, p2, [I

    fill-array-data p2, :array_0

    invoke-virtual {p1, p2}, Lcom/daaw/ie1$i;->a([I)Lcom/daaw/ie1$i;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p2, "stations"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x4

    new-array p2, p2, [Lcom/daaw/lo1;

    const/4 p3, 0x0

    sget-object v0, Lcom/daaw/ie1;->d:Lcom/daaw/lo1;

    aput-object v0, p2, p3

    const/4 p3, 0x1

    sget-object v0, Lcom/daaw/ie1;->e:Lcom/daaw/lo1;

    aput-object v0, p2, p3

    const/4 p3, 0x2

    sget-object v0, Lcom/daaw/ie1;->f:Lcom/daaw/lo1;

    aput-object v0, p2, p3

    const/4 p3, 0x3

    sget-object v0, Lcom/daaw/ie1;->g:Lcom/daaw/lo1;

    aput-object v0, p2, p3

    invoke-virtual {p1, p2}, Lcom/daaw/ie1$i;->b([Lcom/daaw/lo1;)V

    :cond_2
    return-object p1

    nop

    :array_0
    .array-data 4
        0x8
        0x0
        0x3
        0x5
        0x7
    .end array-data
.end method
