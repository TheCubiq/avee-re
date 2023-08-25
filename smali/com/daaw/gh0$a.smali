.class public Lcom/daaw/gh0$a;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gh0$a$a;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gh0$a;

    invoke-direct {v0}, Lcom/daaw/gh0$a;-><init>()V

    sput-object v0, Lcom/daaw/gh0$a;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x1

    const v2, 0x7f08010e

    const v3, 0x7f10014a

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/ch0;-><init>(IZII)V

    return-void
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

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/gh0$a$a;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v3

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v0}, Lcom/daaw/gh0$a$a;->c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/daaw/gh0;->f:Lcom/daaw/rw1;

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lcom/daaw/rw1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
