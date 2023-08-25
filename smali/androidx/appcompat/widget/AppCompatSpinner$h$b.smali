.class public Landroidx/appcompat/widget/AppCompatSpinner$h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/AppCompatSpinner$h;->n(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Landroidx/appcompat/widget/AppCompatSpinner$h;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/AppCompatSpinner$h;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/AppCompatSpinner$h$b;->p:Landroidx/appcompat/widget/AppCompatSpinner$h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$h$b;->p:Landroidx/appcompat/widget/AppCompatSpinner$h;

    iget-object v1, v0, Landroidx/appcompat/widget/AppCompatSpinner$h;->c0:Landroidx/appcompat/widget/AppCompatSpinner;

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatSpinner$h;->U(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$h$b;->p:Landroidx/appcompat/widget/AppCompatSpinner$h;

    invoke-virtual {v0}, Lcom/daaw/ck0;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$h$b;->p:Landroidx/appcompat/widget/AppCompatSpinner$h;

    invoke-virtual {v0}, Landroidx/appcompat/widget/AppCompatSpinner$h;->S()V

    iget-object v0, p0, Landroidx/appcompat/widget/AppCompatSpinner$h$b;->p:Landroidx/appcompat/widget/AppCompatSpinner$h;

    invoke-static {v0}, Landroidx/appcompat/widget/AppCompatSpinner$h;->R(Landroidx/appcompat/widget/AppCompatSpinner$h;)V

    :goto_0
    return-void
.end method
