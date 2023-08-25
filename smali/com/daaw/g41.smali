.class public final synthetic Lcom/daaw/g41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ao1;


# instance fields
.field public final synthetic a:Lcom/daaw/i41;

.field public final synthetic b:Lcom/daaw/tj1;

.field public final synthetic c:Lcom/daaw/zm;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/i41;Lcom/daaw/tj1;Lcom/daaw/zm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g41;->a:Lcom/daaw/i41;

    iput-object p2, p0, Lcom/daaw/g41;->b:Lcom/daaw/tj1;

    iput-object p3, p0, Lcom/daaw/g41;->c:Lcom/daaw/zm;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/g41;->a:Lcom/daaw/i41;

    iget-object v1, p0, Lcom/daaw/g41;->b:Lcom/daaw/tj1;

    iget-object v2, p0, Lcom/daaw/g41;->c:Lcom/daaw/zm;

    invoke-static {v0, v1, v2, p1}, Lcom/daaw/i41;->a(Lcom/daaw/i41;Lcom/daaw/tj1;Lcom/daaw/zm;Ljava/lang/Exception;)V

    return-void
.end method
