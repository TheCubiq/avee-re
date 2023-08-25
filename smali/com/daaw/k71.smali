.class public final synthetic Lcom/daaw/k71;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/r71$b;


# instance fields
.field public final synthetic a:Lcom/daaw/r71;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/r71;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k71;->a:Lcom/daaw/r71;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k71;->a:Lcom/daaw/r71;

    check-cast p1, Landroid/database/Cursor;

    invoke-static {v0, p1}, Lcom/daaw/r71;->U(Lcom/daaw/r71;Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
