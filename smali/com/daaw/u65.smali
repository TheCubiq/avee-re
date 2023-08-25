.class public final synthetic Lcom/daaw/u65;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/u65;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/u65;->a:Ljava/lang/String;

    check-cast p1, Lcom/daaw/dc3;

    new-instance v1, Lcom/daaw/w65;

    invoke-direct {v1, v0, p1}, Lcom/daaw/w65;-><init>(Ljava/lang/String;Lcom/daaw/dc3;)V

    return-object v1
.end method
