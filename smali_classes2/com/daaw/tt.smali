.class public Lcom/daaw/tt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pc;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/oc;)V
    .locals 1

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object p1

    const-string v0, "Could not register handler for breadcrumbs events."

    invoke-virtual {p1, v0}, Lcom/daaw/ml0;->b(Ljava/lang/String;)V

    return-void
.end method
