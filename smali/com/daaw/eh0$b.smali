.class public Lcom/daaw/eh0$b;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/eh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/eh0$b$a;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/eh0$b;

    invoke-direct {v0}, Lcom/daaw/eh0$b;-><init>()V

    sput-object v0, Lcom/daaw/eh0$b;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x1

    const v4, 0x7f0800d0

    const v5, 0x7f100152

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ch0;-><init>(IZZII)V

    return-void
.end method

.method public static synthetic i()Lcom/daaw/ch0;
    .locals 1

    sget-object v0, Lcom/daaw/eh0$b;->g:Lcom/daaw/ch0;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Lcom/daaw/l0;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/er0;

    invoke-direct {v0}, Lcom/daaw/er0;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/eh0$b$a;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/daaw/eh0$b$a;->c(Landroid/content/Context;Ljava/lang/Object;Lcom/daaw/er0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result p3

    if-lez p3, :cond_1

    invoke-virtual {v0}, Lcom/daaw/er0;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {v0, p2}, Lcom/daaw/er0;->n(I)Lcom/daaw/lo1;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_2

    iget-object p3, p2, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast p3, Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast p2, Ljava/lang/String;

    sget-object v0, Lcom/daaw/eh0;->a:Lcom/daaw/tw1;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p3, p2, p1}, Lcom/daaw/tw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
