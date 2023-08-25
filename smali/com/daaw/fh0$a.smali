.class public Lcom/daaw/fh0$a;
.super Lcom/daaw/ch0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/fh0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/fh0$a$a;
    }
.end annotation


# static fields
.field public static g:Lcom/daaw/ch0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/fh0$a;

    invoke-direct {v0}, Lcom/daaw/fh0$a;-><init>()V

    sput-object v0, Lcom/daaw/fh0$a;->g:Lcom/daaw/ch0;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    const v2, 0x7f08010e

    const v3, 0x7f10014f

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/daaw/ch0;-><init>(IZII)V

    return-void
.end method


# virtual methods
.method public b(Lcom/daaw/al;Ljava/util/List;Ljava/util/List;)V
    .locals 1
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

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/daaw/fh0$a$a;

    invoke-virtual {p1}, Lcom/daaw/al;->b()Landroid/content/Context;

    move-result-object p1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Lcom/daaw/fh0$a$a;->c(Landroid/content/Context;Ljava/lang/Object;)Lcom/daaw/vd0;

    move-result-object p1

    sget-object p2, Lcom/daaw/fh0;->d:Lcom/daaw/qw1;

    invoke-virtual {p2, p1}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    return-void
.end method
