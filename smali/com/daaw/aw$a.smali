.class public Lcom/daaw/aw$a;
.super Lcom/daaw/aw$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/aw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Lcom/daaw/iw;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Z)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/aw$b;-><init>()V

    iput-object p1, p0, Lcom/daaw/aw$a;->a:Landroid/widget/EditText;

    new-instance v0, Lcom/daaw/iw;

    invoke-direct {v0, p1, p2}, Lcom/daaw/iw;-><init>(Landroid/widget/EditText;Z)V

    iput-object v0, p0, Lcom/daaw/aw$a;->b:Lcom/daaw/iw;

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-static {}, Lcom/daaw/bw;->getInstance()Landroid/text/Editable$Factory;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, Lcom/daaw/ew;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, Lcom/daaw/ew;

    invoke-direct {v0, p1}, Lcom/daaw/ew;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0
.end method

.method public b(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2

    instance-of v0, p1, Lcom/daaw/cw;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/cw;

    iget-object v1, p0, Lcom/daaw/aw$a;->a:Landroid/widget/EditText;

    invoke-direct {v0, v1, p1, p2}, Lcom/daaw/cw;-><init>(Landroid/widget/TextView;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    return-object v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/aw$a;->b:Lcom/daaw/iw;

    invoke-virtual {v0, p1}, Lcom/daaw/iw;->c(Z)V

    return-void
.end method
