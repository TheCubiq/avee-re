.class public final synthetic Lcom/daaw/tu0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/es$a;


# instance fields
.field public final synthetic a:Lcom/daaw/es$a;

.field public final synthetic b:Lcom/daaw/es$a;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/es$a;Lcom/daaw/es$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/tu0;->a:Lcom/daaw/es$a;

    iput-object p2, p0, Lcom/daaw/tu0;->b:Lcom/daaw/es$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/b01;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tu0;->a:Lcom/daaw/es$a;

    iget-object v1, p0, Lcom/daaw/tu0;->b:Lcom/daaw/es$a;

    invoke-static {v0, v1, p1}, Lcom/daaw/wu0;->d(Lcom/daaw/es$a;Lcom/daaw/es$a;Lcom/daaw/b01;)V

    return-void
.end method
