.class public final Lcom/daaw/mb0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/fb0;

.field public b:Lcom/daaw/gb0;

.field public c:Lcom/daaw/vv0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vv0$a<",
            "Lcom/daaw/nb0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Lcom/daaw/pb0;

.field public e:Lcom/daaw/wi;

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/daaw/fb0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/fb0;

    iput-object p1, p0, Lcom/daaw/mb0$b;->a:Lcom/daaw/fb0;

    sget-object p1, Lcom/daaw/gb0;->a:Lcom/daaw/gb0;

    iput-object p1, p0, Lcom/daaw/mb0$b;->b:Lcom/daaw/gb0;

    const/4 p1, 0x3

    iput p1, p0, Lcom/daaw/mb0$b;->f:I

    new-instance p1, Lcom/daaw/nq;

    invoke-direct {p1}, Lcom/daaw/nq;-><init>()V

    iput-object p1, p0, Lcom/daaw/mb0$b;->e:Lcom/daaw/wi;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/mp$a;)V
    .locals 1

    new-instance v0, Lcom/daaw/dr;

    invoke-direct {v0, p1}, Lcom/daaw/dr;-><init>(Lcom/daaw/mp$a;)V

    invoke-direct {p0, v0}, Lcom/daaw/mb0$b;-><init>(Lcom/daaw/fb0;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/daaw/mb0;
    .locals 14

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/mb0$b;->h:Z

    iget-object v0, p0, Lcom/daaw/mb0$b;->d:Lcom/daaw/pb0;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/fr;

    iget-object v1, p0, Lcom/daaw/mb0$b;->a:Lcom/daaw/fb0;

    iget v2, p0, Lcom/daaw/mb0$b;->f:I

    iget-object v3, p0, Lcom/daaw/mb0$b;->c:Lcom/daaw/vv0$a;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/daaw/ob0;

    invoke-direct {v3}, Lcom/daaw/ob0;-><init>()V

    :goto_0
    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/fr;-><init>(Lcom/daaw/fb0;ILcom/daaw/vv0$a;)V

    iput-object v0, p0, Lcom/daaw/mb0$b;->d:Lcom/daaw/pb0;

    :cond_1
    new-instance v0, Lcom/daaw/mb0;

    iget-object v6, p0, Lcom/daaw/mb0$b;->a:Lcom/daaw/fb0;

    iget-object v7, p0, Lcom/daaw/mb0$b;->b:Lcom/daaw/gb0;

    iget-object v8, p0, Lcom/daaw/mb0$b;->e:Lcom/daaw/wi;

    iget v9, p0, Lcom/daaw/mb0$b;->f:I

    iget-object v10, p0, Lcom/daaw/mb0$b;->d:Lcom/daaw/pb0;

    iget-boolean v11, p0, Lcom/daaw/mb0$b;->g:Z

    iget-object v12, p0, Lcom/daaw/mb0$b;->i:Ljava/lang/Object;

    const/4 v13, 0x0

    move-object v4, v0

    move-object v5, p1

    invoke-direct/range {v4 .. v13}, Lcom/daaw/mb0;-><init>(Landroid/net/Uri;Lcom/daaw/fb0;Lcom/daaw/gb0;Lcom/daaw/wi;ILcom/daaw/pb0;ZLjava/lang/Object;Lcom/daaw/mb0$a;)V

    return-object v0
.end method

.method public b(Lcom/daaw/vv0$a;)Lcom/daaw/mb0$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vv0$a<",
            "Lcom/daaw/nb0;",
            ">;)",
            "Lcom/daaw/mb0$b;"
        }
    .end annotation

    iget-boolean v0, p0, Lcom/daaw/mb0$b;->h:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lcom/daaw/s6;->f(Z)V

    iget-object v0, p0, Lcom/daaw/mb0$b;->d:Lcom/daaw/pb0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v0, "A playlist tracker has already been set."

    invoke-static {v1, v0}, Lcom/daaw/s6;->g(ZLjava/lang/Object;)V

    invoke-static {p1}, Lcom/daaw/s6;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/vv0$a;

    iput-object p1, p0, Lcom/daaw/mb0$b;->c:Lcom/daaw/vv0$a;

    return-object p0
.end method
