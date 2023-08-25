.class public final synthetic Lcom/daaw/j1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/r1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/j1;->a:Lcom/daaw/r1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/j1;->a:Lcom/daaw/r1;

    check-cast p1, Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/daaw/r1;->c(Lcom/daaw/r1;Landroid/app/Activity;)V

    return-void
.end method
