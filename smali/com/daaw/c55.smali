.class public final synthetic Lcom/daaw/c55;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final synthetic a:Lcom/daaw/i55;

.field public final synthetic b:Landroid/view/WindowManager;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/i55;Landroid/view/WindowManager;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/c55;->a:Lcom/daaw/i55;

    iput-object p2, p0, Lcom/daaw/c55;->b:Landroid/view/WindowManager;

    iput-object p3, p0, Lcom/daaw/c55;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/c55;->a:Lcom/daaw/i55;

    iget-object v1, p0, Lcom/daaw/c55;->b:Landroid/view/WindowManager;

    iget-object v2, p0, Lcom/daaw/c55;->c:Landroid/view/View;

    check-cast p1, Lcom/daaw/a74;

    invoke-virtual {v0, v1, v2, p1, p2}, Lcom/daaw/i55;->c(Landroid/view/WindowManager;Landroid/view/View;Lcom/daaw/a74;Ljava/util/Map;)V

    return-void
.end method
