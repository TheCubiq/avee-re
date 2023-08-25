.class public final Lcom/daaw/n80$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/n80$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lcom/daaw/sr0$b;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/n80$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/n80$b$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/n80$b$a;Lcom/daaw/n80$b$a;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/n80$b$a;->c(Lcom/daaw/n80$b$a;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/n80$b$a;->b:Z

    iput-boolean v0, p0, Lcom/daaw/n80$b$a;->a:Z

    return-void
.end method

.method public final c(Lcom/daaw/n80$b$a;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->a:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    iget-boolean v0, p1, Lcom/daaw/n80$b$a;->a:Z

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/daaw/n80$b$a;->f:I

    iget v2, p1, Lcom/daaw/n80$b$a;->f:I

    if-ne v0, v2, :cond_5

    iget v0, p0, Lcom/daaw/n80$b$a;->g:I

    iget v2, p1, Lcom/daaw/n80$b$a;->g:I

    if-ne v0, v2, :cond_5

    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->h:Z

    iget-boolean v2, p1, Lcom/daaw/n80$b$a;->h:Z

    if-ne v0, v2, :cond_5

    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->i:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, Lcom/daaw/n80$b$a;->i:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->j:Z

    iget-boolean v2, p1, Lcom/daaw/n80$b$a;->j:Z

    if-ne v0, v2, :cond_5

    :cond_0
    iget v0, p0, Lcom/daaw/n80$b$a;->d:I

    iget v2, p1, Lcom/daaw/n80$b$a;->d:I

    if-eq v0, v2, :cond_1

    if-eqz v0, :cond_5

    if-eqz v2, :cond_5

    :cond_1
    iget-object v0, p0, Lcom/daaw/n80$b$a;->c:Lcom/daaw/sr0$b;

    iget v0, v0, Lcom/daaw/sr0$b;->h:I

    if-nez v0, :cond_2

    iget-object v2, p1, Lcom/daaw/n80$b$a;->c:Lcom/daaw/sr0$b;

    iget v2, v2, Lcom/daaw/sr0$b;->h:I

    if-nez v2, :cond_2

    iget v2, p0, Lcom/daaw/n80$b$a;->m:I

    iget v3, p1, Lcom/daaw/n80$b$a;->m:I

    if-ne v2, v3, :cond_5

    iget v2, p0, Lcom/daaw/n80$b$a;->n:I

    iget v3, p1, Lcom/daaw/n80$b$a;->n:I

    if-ne v2, v3, :cond_5

    :cond_2
    if-ne v0, v1, :cond_3

    iget-object v0, p1, Lcom/daaw/n80$b$a;->c:Lcom/daaw/sr0$b;

    iget v0, v0, Lcom/daaw/sr0$b;->h:I

    if-ne v0, v1, :cond_3

    iget v0, p0, Lcom/daaw/n80$b$a;->o:I

    iget v2, p1, Lcom/daaw/n80$b$a;->o:I

    if-ne v0, v2, :cond_5

    iget v0, p0, Lcom/daaw/n80$b$a;->p:I

    iget v2, p1, Lcom/daaw/n80$b$a;->p:I

    if-ne v0, v2, :cond_5

    :cond_3
    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->k:Z

    iget-boolean v2, p1, Lcom/daaw/n80$b$a;->k:Z

    if-ne v0, v2, :cond_5

    if-eqz v0, :cond_4

    if-eqz v2, :cond_4

    iget v0, p0, Lcom/daaw/n80$b$a;->l:I

    iget p1, p1, Lcom/daaw/n80$b$a;->l:I

    if-eq v0, p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_0
    return v1
.end method

.method public d()Z
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/n80$b$a;->b:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/n80$b$a;->e:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lcom/daaw/sr0$b;IIIIZZZZIIIII)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n80$b$a;->c:Lcom/daaw/sr0$b;

    iput p2, p0, Lcom/daaw/n80$b$a;->d:I

    iput p3, p0, Lcom/daaw/n80$b$a;->e:I

    iput p4, p0, Lcom/daaw/n80$b$a;->f:I

    iput p5, p0, Lcom/daaw/n80$b$a;->g:I

    iput-boolean p6, p0, Lcom/daaw/n80$b$a;->h:Z

    iput-boolean p7, p0, Lcom/daaw/n80$b$a;->i:Z

    iput-boolean p8, p0, Lcom/daaw/n80$b$a;->j:Z

    iput-boolean p9, p0, Lcom/daaw/n80$b$a;->k:Z

    iput p10, p0, Lcom/daaw/n80$b$a;->l:I

    iput p11, p0, Lcom/daaw/n80$b$a;->m:I

    iput p12, p0, Lcom/daaw/n80$b$a;->n:I

    iput p13, p0, Lcom/daaw/n80$b$a;->o:I

    iput p14, p0, Lcom/daaw/n80$b$a;->p:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/n80$b$a;->a:Z

    iput-boolean p1, p0, Lcom/daaw/n80$b$a;->b:Z

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/n80$b$a;->e:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/n80$b$a;->b:Z

    return-void
.end method
