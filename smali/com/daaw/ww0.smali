.class public Lcom/daaw/ww0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static volatile b:Lcom/daaw/tx0;

.field public static volatile c:Lcom/daaw/vd0;

.field public static volatile d:Lcom/daaw/tx0$b;

.field public static volatile e:I


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/tx0;->k:Lcom/daaw/tx0;

    sput-object v0, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    const/4 v0, 0x0

    sput-object v0, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    sget-object v0, Lcom/daaw/tx0;->h:Lcom/daaw/tx0$b;

    sput-object v0, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    const/4 v0, -0x1

    sput v0, Lcom/daaw/ww0;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/daaw/ww0;->a:Ljava/util/List;

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l01;->m()I

    move-result v0

    sput v0, Lcom/daaw/ww0;->e:I

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/l01;->k()Lcom/daaw/lo1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/daaw/lo1;->a:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/tx0;

    sput-object v1, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    iget-object v0, v0, Lcom/daaw/lo1;->b:Ljava/lang/Object;

    check-cast v0, Lcom/daaw/vd0;

    sput-object v0, Lcom/daaw/ww0;->c:Lcom/daaw/vd0;

    sget-object v0, Lcom/daaw/ww0;->b:Lcom/daaw/tx0;

    invoke-static {}, Lcom/daaw/dx0;->e()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/tx0;->j(Landroid/content/Context;)Lcom/daaw/tx0$b;

    move-result-object v0

    sput-object v0, Lcom/daaw/ww0;->d:Lcom/daaw/tx0$b;

    :cond_0
    sget-object v0, Lcom/daaw/l01;->u:Lcom/daaw/uw1;

    new-instance v1, Lcom/daaw/ww0$a;

    invoke-direct {v1, p0}, Lcom/daaw/ww0$a;-><init>(Lcom/daaw/ww0;)V

    iget-object v2, p0, Lcom/daaw/ww0;->a:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/uw1;->b(Lcom/daaw/uw1$a;Ljava/util/List;)V

    return-void
.end method
