.class public final Lcom/daaw/aw;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/aw$a;,
        Lcom/daaw/aw$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/aw$b;

.field public b:I

.field public c:I


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/daaw/aw;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/aw;->c:I

    const-string v0, "editText cannot be null"

    invoke-static {p1, v0}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/aw$a;

    invoke-direct {v0, p1, p2}, Lcom/daaw/aw$a;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, Lcom/daaw/aw;->a:Lcom/daaw/aw$b;

    return-void
.end method


# virtual methods
.method public a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    iget-object v0, p0, Lcom/daaw/aw;->a:Lcom/daaw/aw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/aw$b;->a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/aw;->a:Lcom/daaw/aw$b;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/aw$b;->b(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object p1

    return-object p1
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aw;->a:Lcom/daaw/aw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/aw$b;->c(Z)V

    return-void
.end method
