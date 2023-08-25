.class public Lcom/daaw/ef0;
.super Lcom/daaw/df0;
.source ""


# instance fields
.field public c:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/h0;

.field public e:Lcom/daaw/h0;

.field public f:Lcom/daaw/w40;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/w40<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/daaw/w40;Lcom/daaw/h0;Lcom/daaw/h0;Lcom/daaw/w40;Lcom/daaw/h0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/w40<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/daaw/h0;",
            "Lcom/daaw/h0;",
            "Lcom/daaw/w40<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/h0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p6}, Lcom/daaw/df0;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/h0;)V

    iput-object p2, p0, Lcom/daaw/ef0;->c:Lcom/daaw/w40;

    iput-object p3, p0, Lcom/daaw/ef0;->d:Lcom/daaw/h0;

    iput-object p4, p0, Lcom/daaw/ef0;->e:Lcom/daaw/h0;

    iput-object p5, p0, Lcom/daaw/ef0;->f:Lcom/daaw/w40;

    return-void
.end method

.method public static synthetic i(Lcom/daaw/ef0;)Lcom/daaw/w40;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ef0;->f:Lcom/daaw/w40;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef0;->e:Lcom/daaw/h0;

    invoke-interface {v0}, Lcom/daaw/h0;->a()V

    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef0;->c:Lcom/daaw/w40;

    invoke-interface {v0}, Lcom/daaw/w40;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public e()Lcom/daaw/jr1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/jr1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/jr1;

    new-instance v1, Lcom/daaw/ef0$a;

    invoke-direct {v1, p0}, Lcom/daaw/ef0$a;-><init>(Lcom/daaw/ef0;)V

    invoke-direct {v0, v1}, Lcom/daaw/jr1;-><init>(Lcom/daaw/jr1$b;)V

    new-instance v1, Lcom/daaw/ef0$b;

    invoke-direct {v1, p0}, Lcom/daaw/ef0$b;-><init>(Lcom/daaw/ef0;)V

    invoke-virtual {v0, v1}, Lcom/daaw/jr1;->a(Lcom/daaw/jr1$a;)V

    return-object v0
.end method

.method public h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ef0;->d:Lcom/daaw/h0;

    invoke-interface {v0}, Lcom/daaw/h0;->a()V

    return-void
.end method
