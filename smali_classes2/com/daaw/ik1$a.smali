.class public Lcom/daaw/ik1$a;
.super Lcom/daaw/j51$f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ik1;->h(Landroid/content/Context;Lcom/daaw/kk1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/kk1;

.field public final synthetic b:Lcom/daaw/ik1;


# direct methods
.method public constructor <init>(Lcom/daaw/ik1;Lcom/daaw/kk1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ik1$a;->b:Lcom/daaw/ik1;

    iput-object p2, p0, Lcom/daaw/ik1$a;->a:Lcom/daaw/kk1;

    invoke-direct {p0}, Lcom/daaw/j51$f;-><init>()V

    return-void
.end method


# virtual methods
.method public h(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ik1$a;->b:Lcom/daaw/ik1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/ik1;->c(Lcom/daaw/ik1;Z)Z

    iget-object v0, p0, Lcom/daaw/ik1$a;->a:Lcom/daaw/kk1;

    invoke-virtual {v0, p1}, Lcom/daaw/kk1;->a(I)V

    return-void
.end method

.method public i(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ik1$a;->b:Lcom/daaw/ik1;

    iget v1, v0, Lcom/daaw/ik1;->f:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/daaw/ik1;->b(Lcom/daaw/ik1;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lcom/daaw/ik1$a;->b:Lcom/daaw/ik1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/daaw/ik1;->c(Lcom/daaw/ik1;Z)Z

    iget-object p1, p0, Lcom/daaw/ik1$a;->a:Lcom/daaw/kk1;

    iget-object v0, p0, Lcom/daaw/ik1$a;->b:Lcom/daaw/ik1;

    invoke-static {v0}, Lcom/daaw/ik1;->a(Lcom/daaw/ik1;)Landroid/graphics/Typeface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/daaw/kk1;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
