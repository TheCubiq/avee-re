.class public Lcom/daaw/xs1$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xs1$m;->u(Landroid/view/View;Lcom/daaw/vt0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Lcom/daaw/px1;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/daaw/vt0;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/daaw/vt0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xs1$m$a;->b:Landroid/view/View;

    iput-object p2, p0, Lcom/daaw/xs1$m$a;->c:Lcom/daaw/vt0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/xs1$m$a;->a:Lcom/daaw/px1;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    invoke-static {p2, p1}, Lcom/daaw/px1;->x(Landroid/view/WindowInsets;Landroid/view/View;)Lcom/daaw/px1;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    iget-object v3, p0, Lcom/daaw/xs1$m$a;->b:Landroid/view/View;

    invoke-static {p2, v3}, Lcom/daaw/xs1$m;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Lcom/daaw/xs1$m$a;->a:Lcom/daaw/px1;

    invoke-virtual {v0, p2}, Lcom/daaw/px1;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/daaw/xs1$m$a;->c:Lcom/daaw/vt0;

    invoke-interface {p2, p1, v0}, Lcom/daaw/vt0;->a(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Lcom/daaw/xs1$m$a;->a:Lcom/daaw/px1;

    iget-object p2, p0, Lcom/daaw/xs1$m$a;->c:Lcom/daaw/vt0;

    invoke-interface {p2, p1, v0}, Lcom/daaw/vt0;->a(Landroid/view/View;Lcom/daaw/px1;)Lcom/daaw/px1;

    move-result-object p2

    if-lt v1, v2, :cond_1

    invoke-virtual {p2}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    invoke-virtual {p2}, Lcom/daaw/px1;->v()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
