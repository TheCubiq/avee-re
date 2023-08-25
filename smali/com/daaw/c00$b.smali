.class public final Lcom/daaw/c00$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/c00;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lcom/daaw/mp$a;

.field public b:Lcom/daaw/e00;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mp$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c00$b;->a:Lcom/daaw/mp$a;

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/c00$b;->e:I

    const/high16 p1, 0x100000

    iput p1, p0, Lcom/daaw/c00$b;->f:I

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/daaw/c00;
    .locals 10

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/c00$b;->g:Z

    iget-object v0, p0, Lcom/daaw/c00$b;->b:Lcom/daaw/e00;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/xq;

    invoke-direct {v0}, Lcom/daaw/xq;-><init>()V

    iput-object v0, p0, Lcom/daaw/c00$b;->b:Lcom/daaw/e00;

    :cond_0
    new-instance v0, Lcom/daaw/c00;

    iget-object v3, p0, Lcom/daaw/c00$b;->a:Lcom/daaw/mp$a;

    iget-object v4, p0, Lcom/daaw/c00$b;->b:Lcom/daaw/e00;

    iget v5, p0, Lcom/daaw/c00$b;->e:I

    iget-object v6, p0, Lcom/daaw/c00$b;->c:Ljava/lang/String;

    iget v7, p0, Lcom/daaw/c00$b;->f:I

    iget-object v8, p0, Lcom/daaw/c00$b;->d:Ljava/lang/Object;

    const/4 v9, 0x0

    move-object v1, v0

    move-object v2, p1

    invoke-direct/range {v1 .. v9}, Lcom/daaw/c00;-><init>(Landroid/net/Uri;Lcom/daaw/mp$a;Lcom/daaw/e00;ILjava/lang/String;ILjava/lang/Object;Lcom/daaw/c00$a;)V

    return-object v0
.end method
