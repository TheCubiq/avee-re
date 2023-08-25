.class public Lcom/daaw/wv1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wv1;-><init>(Landroid/view/LayoutInflater;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/mo1;

.field public final synthetic b:Lcom/daaw/wv1;


# direct methods
.method public constructor <init>(Lcom/daaw/wv1;Lcom/daaw/mo1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wv1$f;->b:Lcom/daaw/wv1;

    iput-object p2, p0, Lcom/daaw/wv1$f;->a:Lcom/daaw/mo1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/wv1$f;->b:Lcom/daaw/wv1;

    iget-object p3, p0, Lcom/daaw/wv1$f;->a:Lcom/daaw/mo1;

    iget-object p3, p3, Lcom/daaw/mo1;->b:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iget-object v0, p0, Lcom/daaw/wv1$f;->a:Lcom/daaw/mo1;

    iget-object v0, v0, Lcom/daaw/mo1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, p2, p3, v0, v1}, Lcom/daaw/wv1;->f(Lcom/daaw/wv1;IIFZ)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
