.class public final Lcom/daaw/ss6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Looper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ss6;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ss6;->b:Landroid/os/Looper;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/daaw/lt6;->L()Lcom/daaw/gt6;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ss6;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/gt6;->s(Ljava/lang/String;)Lcom/daaw/gt6;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/daaw/gt6;->u(I)Lcom/daaw/gt6;

    invoke-static {}, Lcom/daaw/et6;->L()Lcom/daaw/dt6;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/daaw/dt6;->s(Ljava/lang/String;)Lcom/daaw/dt6;

    invoke-virtual {v2, v1}, Lcom/daaw/dt6;->t(I)Lcom/daaw/dt6;

    invoke-virtual {v0, v2}, Lcom/daaw/gt6;->t(Lcom/daaw/dt6;)Lcom/daaw/gt6;

    invoke-virtual {v0}, Lcom/daaw/fs7;->n()Lcom/daaw/ls7;

    move-result-object p1

    check-cast p1, Lcom/daaw/lt6;

    iget-object v0, p0, Lcom/daaw/ss6;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/ss6;->b:Landroid/os/Looper;

    new-instance v2, Lcom/daaw/ts6;

    invoke-direct {v2, v0, v1, p1}, Lcom/daaw/ts6;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/daaw/lt6;)V

    invoke-virtual {v2}, Lcom/daaw/ts6;->a()V

    return-void
.end method
