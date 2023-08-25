.class public Lcom/daaw/ih0$a;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ih0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/ih0$a$b;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ih0$a;

    invoke-direct {v0}, Lcom/daaw/ih0$a;-><init>()V

    sput-object v0, Lcom/daaw/ih0$a;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    const v4, 0x7f08010e

    const v5, 0x7f10014c

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/daaw/ch0;-><init>(IZZII)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .locals 4
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

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/ih0$a$b;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object v2

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/daaw/ih0$a$b;->c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/ir1;

    move-result-object v1

    new-instance v2, Lcom/daaw/ih0$a$a;

    invoke-direct {v2, p0}, Lcom/daaw/ih0$a$a;-><init>(Lcom/daaw/ih0$a;)V

    invoke-virtual {v1, v2}, Lcom/daaw/ir1;->a(Lcom/daaw/ir1$b;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
