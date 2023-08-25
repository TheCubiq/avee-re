.class public Lcom/daaw/gh0$e;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/gh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gh0$e$a;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/gh0$e;

    invoke-direct {v0}, Lcom/daaw/gh0$e;-><init>()V

    sput-object v0, Lcom/daaw/gh0$e;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f08010e

    const v5, 0x7f10014d

    const/4 v6, 0x1

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/daaw/ch0;-><init>(IZZIIZ)V

    return-void
.end method

.method public static synthetic i()Lcom/daaw/ch0;
    .locals 1

    sget-object v0, Lcom/daaw/gh0$e;->g:Lcom/daaw/ch0;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .locals 12
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

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    sget-object v0, Lcom/daaw/gh0;->a:Lcom/daaw/vw1;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/daaw/be0;

    sget-object v0, Lcom/daaw/gh0;->b:Lcom/daaw/vw1;

    new-instance v1, Lcom/daaw/er0;

    invoke-direct {v1}, Lcom/daaw/er0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/daaw/er0;

    const/4 v10, 0x0

    move-object v2, v7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v11, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v11, v3, :cond_0

    invoke-interface {p3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/gh0$e$a;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v6

    move-object v4, v8

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/gh0$e$a;->c(Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Lcom/daaw/be0;Lcom/daaw/er0;)Lcom/daaw/mo1;

    move-result-object v0

    iget-object v1, v0, Lcom/daaw/mo1;->a:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, v0, Lcom/daaw/mo1;->b:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/be0;

    iget-object v0, v0, Lcom/daaw/mo1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x1

    if-le p1, p2, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    move v10, v0

    move-object v7, v2

    :goto_1
    if-eqz v10, :cond_2

    sget-object p1, Lcom/daaw/gh0;->e:Lcom/daaw/qw1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    sget-object p1, Lcom/daaw/gh0;->g:Lcom/daaw/sw1;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, v6, p2, v7}, Lcom/daaw/sw1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
