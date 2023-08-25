.class public Lcom/daaw/to1$a;
.super Lcom/daaw/b30$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/to1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/j51$f;


# direct methods
.method public constructor <init>(Lcom/daaw/j51$f;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/b30$c;-><init>()V

    iput-object p1, p0, Lcom/daaw/to1$a;->a:Lcom/daaw/j51$f;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/to1$a;->a:Lcom/daaw/j51$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/j51$f;->h(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/to1$a;->a:Lcom/daaw/j51$f;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/j51$f;->i(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
