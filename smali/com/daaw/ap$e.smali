.class public final Lcom/daaw/ap$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ap;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/daaw/vo$a;

.field public final b:Lcom/daaw/mp$a;

.field public c:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/wo;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/wi;

.field public e:I

.field public f:J

.field public g:Z

.field public h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/vo$a;Lcom/daaw/mp$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vo$a;

    iput-object p1, p0, Lcom/daaw/ap$e;->a:Lcom/daaw/vo$a;

    iput-object p2, p0, Lcom/daaw/ap$e;->b:Lcom/daaw/mp$a;

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/ap$e;->e:I

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/daaw/ap$e;->f:J

    new-instance p1, Lcom/daaw/nq;

    invoke-direct {p1}, Lcom/daaw/nq;-><init>()V

    iput-object p1, p0, Lcom/daaw/ap$e;->d:Lcom/daaw/wi;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/daaw/ap;
    .locals 13

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/ap$e;->g:Z

    iget-object v0, p0, Lcom/daaw/ap$e;->c:Lcom/daaw/vv0$a;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/xo;

    invoke-direct {v0}, Lcom/daaw/xo;-><init>()V

    iput-object v0, p0, Lcom/daaw/ap$e;->c:Lcom/daaw/vv0$a;

    :cond_0
    new-instance v0, Lcom/daaw/ap;

    const/4 v2, 0x0

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Landroid/net/Uri;

    iget-object v4, p0, Lcom/daaw/ap$e;->b:Lcom/daaw/mp$a;

    iget-object v5, p0, Lcom/daaw/ap$e;->c:Lcom/daaw/vv0$a;

    iget-object v6, p0, Lcom/daaw/ap$e;->a:Lcom/daaw/vo$a;

    iget-object v7, p0, Lcom/daaw/ap$e;->d:Lcom/daaw/wi;

    iget v8, p0, Lcom/daaw/ap$e;->e:I

    iget-wide v9, p0, Lcom/daaw/ap$e;->f:J

    iget-object v11, p0, Lcom/daaw/ap$e;->h:Ljava/lang/Object;

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v12}, Lcom/daaw/ap;-><init>(Lcom/daaw/wo;Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/vv0$a;Lcom/daaw/vo$a;Lcom/daaw/wi;IJLjava/lang/Object;Lcom/daaw/ap$a;)V

    return-object v0
.end method

.method public b(Lcom/daaw/vv0$a;)Lcom/daaw/ap$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0$a<",
            "+",
            "Lcom/daaw/wo;",
            ">;)",
            "Lcom/daaw/ap$e;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/ap$e;->g:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vv0$a;

    iput-object p1, p0, Lcom/daaw/ap$e;->c:Lcom/daaw/vv0$a;

    return-object p0
.end method
