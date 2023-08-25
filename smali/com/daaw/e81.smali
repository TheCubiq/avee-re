.class public final synthetic Lcom/daaw/e81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/k81$c;


# instance fields
.field public final synthetic a:Lcom/daaw/f81;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/f81;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/e81;->a:Lcom/daaw/f81;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/daaw/e81;->a:Lcom/daaw/f81;

    invoke-static {v0}, Lcom/daaw/f81;->a(Lcom/daaw/f81;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
