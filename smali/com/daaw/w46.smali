.class public final synthetic Lcom/daaw/w46;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z46;


# instance fields
.field public final synthetic a:Lcom/daaw/y46;

.field public final synthetic b:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y46;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w46;->a:Lcom/daaw/y46;

    iput-object p2, p0, Lcom/daaw/w46;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/w46;->a:Lcom/daaw/y46;

    iget-object v1, p0, Lcom/daaw/w46;->b:Ljava/util/ArrayList;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/y46;->b(Ljava/util/ArrayList;Landroid/os/Bundle;)V

    return-void
.end method
