.class public Lcom/daaw/p3$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eu0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/p3;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/p3;


# direct methods
.method public constructor <init>(Lcom/daaw/p3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/p3$b;->a:Lcom/daaw/p3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/p3$b;->a:Lcom/daaw/p3;

    invoke-virtual {p1}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/z3;->x()V

    iget-object v0, p0, Lcom/daaw/p3$b;->a:Lcom/daaw/p3;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->i()Lcom/daaw/k81;

    move-result-object v0

    const-string v1, "androidx:appcompat"

    invoke-virtual {v0, v1}, Lcom/daaw/k81;->b(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/z3;->D(Landroid/os/Bundle;)V

    return-void
.end method
