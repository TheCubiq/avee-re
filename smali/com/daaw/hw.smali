.class public final Lcom/daaw/hw;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/hw$a;,
        Lcom/daaw/hw$c;,
        Lcom/daaw/hw$b;
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/hw$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, Lcom/daaw/ty0;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    new-instance p2, Lcom/daaw/hw$c;

    invoke-direct {p2, p1}, Lcom/daaw/hw$c;-><init>(Landroid/widget/TextView;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/daaw/hw$a;

    invoke-direct {p2, p1}, Lcom/daaw/hw$a;-><init>(Landroid/widget/TextView;)V

    :goto_0
    iput-object p2, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    return-void
.end method


# virtual methods
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/hw$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-object v0, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    invoke-virtual {v0}, Lcom/daaw/hw$b;->b()Z

    move-result v0

    return v0
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/hw$b;->c(Z)V

    return-void
.end method

.method public d(Z)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/hw$b;->d(Z)V

    return-void
.end method

.method public e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hw;->a:Lcom/daaw/hw$b;

    invoke-virtual {v0, p1}, Lcom/daaw/hw$b;->e(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method
