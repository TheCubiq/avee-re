.class public Lcom/daaw/n81$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n81;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/qw1$a<",
        "Lcom/daaw/yx0$p;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/n81;


# direct methods
.method public constructor <init>(Lcom/daaw/n81;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n81$b;->a:Lcom/daaw/n81;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/yx0$p;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/n81$b;->a:Lcom/daaw/n81;

    invoke-static {v0, p1}, Lcom/daaw/n81;->a(Lcom/daaw/n81;Lcom/daaw/yx0$p;)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/daaw/yx0$p;

    invoke-virtual {p0, p1}, Lcom/daaw/n81$b;->a(Lcom/daaw/yx0$p;)V

    return-void
.end method
