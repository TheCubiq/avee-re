.class public final synthetic Lcom/daaw/rr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/ur;

.field public final synthetic b:Lcom/daaw/sn1;

.field public final synthetic c:Lcom/daaw/by;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/by;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rr;->a:Lcom/daaw/ur;

    iput-object p2, p0, Lcom/daaw/rr;->b:Lcom/daaw/sn1;

    iput-object p3, p0, Lcom/daaw/rr;->c:Lcom/daaw/by;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/rr;->a:Lcom/daaw/ur;

    iget-object v1, p0, Lcom/daaw/rr;->b:Lcom/daaw/sn1;

    iget-object v2, p0, Lcom/daaw/rr;->c:Lcom/daaw/by;

    invoke-static {v0, v1, v2}, Lcom/daaw/ur;->c(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/by;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
