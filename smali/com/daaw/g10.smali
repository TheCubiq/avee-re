.class public Lcom/daaw/g10;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation
.end field

.field public static b:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation
.end field

.field public static c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation
.end field

.field public static d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/g10$a;

    invoke-direct {v0}, Lcom/daaw/g10$a;-><init>()V

    sput-object v0, Lcom/daaw/g10;->a:Ljava/util/Comparator;

    new-instance v0, Lcom/daaw/g10$b;

    invoke-direct {v0}, Lcom/daaw/g10$b;-><init>()V

    sput-object v0, Lcom/daaw/g10;->b:Ljava/util/Comparator;

    new-instance v0, Lcom/daaw/g10$c;

    invoke-direct {v0}, Lcom/daaw/g10$c;-><init>()V

    sput-object v0, Lcom/daaw/g10;->c:Ljava/util/Comparator;

    new-instance v0, Lcom/daaw/g10$d;

    invoke-direct {v0}, Lcom/daaw/g10$d;-><init>()V

    sput-object v0, Lcom/daaw/g10;->d:Ljava/util/Comparator;

    return-void
.end method

.method public static a(JJ)I
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    cmp-long v0, p0, p2

    if-nez v0, :cond_1

    const/4 p0, 0x0

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    :goto_0
    return p0
.end method

.method public static b(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ie1$h;",
            "I)",
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/ie1$h;->a:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    move p1, v0

    :cond_0
    invoke-static {p0, p1}, Lcom/daaw/g10;->c(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lcom/daaw/ie1$h;I)Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/ie1$h;",
            "I)",
            "Ljava/util/Comparator<",
            "Lcom/daaw/zj$s;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/ie1$h;->b:Z

    iget p0, p0, Lcom/daaw/ie1$h;->a:I

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    :pswitch_1
    sget-object p1, Lcom/daaw/g10;->d:Ljava/util/Comparator;

    goto :goto_0

    :pswitch_2
    sget-object p1, Lcom/daaw/g10;->c:Ljava/util/Comparator;

    :goto_0
    xor-int/lit8 v0, v0, 0x1

    goto :goto_1

    :pswitch_3
    sget-object p1, Lcom/daaw/g10;->b:Ljava/util/Comparator;

    goto :goto_1

    :pswitch_4
    sget-object p1, Lcom/daaw/g10;->a:Ljava/util/Comparator;

    :goto_1
    :pswitch_5
    if-eqz p1, :cond_1

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_4
        :pswitch_0
        :pswitch_5
    .end packed-switch
.end method
