.class public final synthetic Lcom/daaw/q26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final synthetic a:Lcom/daaw/r26;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r26;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q26;->a:Lcom/daaw/r26;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/q26;->a:Lcom/daaw/r26;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Lcom/daaw/r26;->a(Landroid/os/Bundle;)V

    return-void
.end method
