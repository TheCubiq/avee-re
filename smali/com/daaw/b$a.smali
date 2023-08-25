.class public Lcom/daaw/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wt1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public final synthetic c:Lcom/daaw/b;


# direct methods
.method public constructor <init>(Lcom/daaw/b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/b$a;->c:Lcom/daaw/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/b$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/b$a;->a:Z

    return-void
.end method

.method public b(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcom/daaw/b$a;->a:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/b$a;->c:Lcom/daaw/b;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/b;->u:Lcom/daaw/ut1;

    iget v0, p0, Lcom/daaw/b$a;->b:I

    invoke-static {p1, v0}, Lcom/daaw/b;->b(Lcom/daaw/b;I)V

    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/b$a;->c:Lcom/daaw/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/b;->a(Lcom/daaw/b;I)V

    iput-boolean v0, p0, Lcom/daaw/b$a;->a:Z

    return-void
.end method

.method public d(Lcom/daaw/ut1;I)Lcom/daaw/b$a;
    .locals 1

    iget-object v0, p0, Lcom/daaw/b$a;->c:Lcom/daaw/b;

    iput-object p1, v0, Lcom/daaw/b;->u:Lcom/daaw/ut1;

    iput p2, p0, Lcom/daaw/b$a;->b:I

    return-object p0
.end method
