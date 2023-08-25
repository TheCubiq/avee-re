.class public final synthetic Lcom/daaw/b26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final synthetic a:Lcom/daaw/c26;

.field public final synthetic b:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c26;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/b26;->a:Lcom/daaw/c26;

    iput-object p2, p0, Lcom/daaw/b26;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/b26;->a:Lcom/daaw/c26;

    iget-object v1, p0, Lcom/daaw/b26;->b:Landroid/os/Bundle;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/c26;->a(Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method
