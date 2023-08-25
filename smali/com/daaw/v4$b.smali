.class public Lcom/daaw/v4$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/v4;->n(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroid/widget/TextView;

.field public final synthetic q:Landroid/graphics/Typeface;

.field public final synthetic r:I

.field public final synthetic s:Lcom/daaw/v4;


# direct methods
.method public constructor <init>(Lcom/daaw/v4;Landroid/widget/TextView;Landroid/graphics/Typeface;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/v4$b;->s:Lcom/daaw/v4;

    iput-object p2, p0, Lcom/daaw/v4$b;->p:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/daaw/v4$b;->q:Landroid/graphics/Typeface;

    iput p4, p0, Lcom/daaw/v4$b;->r:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/v4$b;->p:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/daaw/v4$b;->q:Landroid/graphics/Typeface;

    iget v2, p0, Lcom/daaw/v4$b;->r:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void
.end method
