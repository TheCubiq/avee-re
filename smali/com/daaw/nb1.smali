.class public final synthetic Lcom/daaw/nb1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/hl;


# instance fields
.field public final synthetic a:Lcom/daaw/pb1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pb1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nb1;->a:Lcom/daaw/pb1;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nb1;->a:Lcom/daaw/pb1;

    invoke-static {v0, p1}, Lcom/daaw/pb1;->a(Lcom/daaw/pb1;Lcom/daaw/rj1;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
