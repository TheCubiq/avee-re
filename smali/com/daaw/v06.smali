.class public final synthetic Lcom/daaw/v06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/w06;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/w06;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v06;->a:Lcom/daaw/w06;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v06;->a:Lcom/daaw/w06;

    check-cast p1, Lcom/daaw/n76;

    invoke-virtual {v0, p1}, Lcom/daaw/w06;->a(Lcom/daaw/n76;)Lcom/daaw/x06;

    move-result-object p1

    return-object p1
.end method
