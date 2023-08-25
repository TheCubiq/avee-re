.class public final synthetic Lcom/daaw/l51;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/j51$f;

.field public final synthetic q:Landroid/graphics/Typeface;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/j51$f;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l51;->p:Lcom/daaw/j51$f;

    iput-object p2, p0, Lcom/daaw/l51;->q:Landroid/graphics/Typeface;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/l51;->p:Lcom/daaw/j51$f;

    iget-object v1, p0, Lcom/daaw/l51;->q:Landroid/graphics/Typeface;

    invoke-static {v0, v1}, Lcom/daaw/j51$f;->b(Lcom/daaw/j51$f;Landroid/graphics/Typeface;)V

    return-void
.end method
