.class public final synthetic Lcom/daaw/mi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b01;


# instance fields
.field public final synthetic a:Lcom/daaw/qi;

.field public final synthetic b:Lcom/daaw/vh;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qi;Lcom/daaw/vh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mi;->a:Lcom/daaw/qi;

    iput-object p2, p0, Lcom/daaw/mi;->b:Lcom/daaw/vh;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/mi;->a:Lcom/daaw/qi;

    iget-object v1, p0, Lcom/daaw/mi;->b:Lcom/daaw/vh;

    invoke-static {v0, v1}, Lcom/daaw/qi;->j(Lcom/daaw/qi;Lcom/daaw/vh;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
