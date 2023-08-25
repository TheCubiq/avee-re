.class public Lcom/daaw/ik1$b;
.super Lcom/daaw/kk1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ik1;->g(Landroid/content/Context;Landroid/text/TextPaint;Lcom/daaw/kk1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/text/TextPaint;

.field public final synthetic b:Lcom/daaw/kk1;

.field public final synthetic c:Lcom/daaw/ik1;


# direct methods
.method public constructor <init>(Lcom/daaw/ik1;Landroid/text/TextPaint;Lcom/daaw/kk1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ik1$b;->c:Lcom/daaw/ik1;

    iput-object p2, p0, Lcom/daaw/ik1$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Lcom/daaw/ik1$b;->b:Lcom/daaw/kk1;

    invoke-direct {p0}, Lcom/daaw/kk1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ik1$b;->b:Lcom/daaw/kk1;

    invoke-virtual {v0, p1}, Lcom/daaw/kk1;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ik1$b;->c:Lcom/daaw/ik1;

    iget-object v1, p0, Lcom/daaw/ik1$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ik1;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/daaw/ik1$b;->b:Lcom/daaw/kk1;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/kk1;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
