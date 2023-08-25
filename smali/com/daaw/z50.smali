.class public final synthetic Lcom/daaw/z50;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/rw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/c60;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/c60;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z50;->a:Lcom/daaw/c60;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z50;->a:Lcom/daaw/c60;

    check-cast p1, Ljava/lang/Integer;

    check-cast p2, Landroid/view/View;

    invoke-static {v0, p1, p2}, Lcom/daaw/c60;->a(Lcom/daaw/c60;Ljava/lang/Integer;Landroid/view/View;)V

    return-void
.end method
